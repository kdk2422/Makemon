package com.example.makemon.ui.character_list

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.makemon.adapter.CharacterListAdapter
import com.example.makemon.data.IconListFive
import com.example.makemon.data.IconListFour
import com.example.makemon.data.IconListOne
import com.example.makemon.data.IconListSix
import com.example.makemon.data.IconListThree
import com.example.makemon.data.IconListTwo
import com.example.makemon.data.listDataFive
import com.example.makemon.data.listDataFour
import com.example.makemon.data.listDataOne
import com.example.makemon.data.listDataSix
import com.example.makemon.data.listDataThree
import com.example.makemon.data.listDataTwo
import com.example.makemon.databinding.DialogCharacterListBinding
import com.example.makemon.di.module.injectViewModel
import com.example.makemon.ui.character_list.callback.CharacterCallback
import dagger.android.support.DaggerDialogFragment
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class CharacterListDialog : DaggerDialogFragment() {

    companion object {
        @Volatile
        private var instance: CharacterListDialog? = null

        @JvmStatic
        fun getInstance() : CharacterListDialog =
            instance ?: synchronized(this) {
                instance ?: CharacterListDialog().also {
                    instance = it
                }
            }
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    val viewModel: CharacterListViewModel by lazy {
        injectViewModel(viewModelFactory)
    }

    lateinit var data: List<Int>
    lateinit var icon: List<Int>
    lateinit var adapter: CharacterListAdapter

    lateinit var binding: DialogCharacterListBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogCharacterListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = arguments?.getString("data")
        Log.w("CharacterListOneDialog", "bundle: $bundle")

        when(bundle) {
            "one" -> {
                data = listDataOne.map { it.information[0].name }
                icon = IconListOne.map { it.image }
            }
            "two" -> {
                data = listDataTwo.map { it.information[0].name }
                icon = IconListTwo.map { it.image }
            }
            "three" -> {
                data = listDataThree.map { it.information[0].name }
                icon = IconListThree.map { it.image }
            }
            "four" -> {
                data = listDataFour.map { it.information[0].name }
                icon = IconListFour.map { it.image }
            }
            "five" -> {
                data = listDataFive.map { it.information[0].name }
                icon = IconListFive.map { it.image }
            }
            "six" -> {
                data = listDataSix.map { it.information[0].name }
                icon = IconListSix.map { it.image }
            }
        }

        val layoutManager = LinearLayoutManager(this.context)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.setHasFixedSize(false)

        adapter = CharacterListAdapter(data, icon, viewModel.selectIndex.value ?: 0)
        binding.recyclerView.adapter = adapter

        adapter.setCharacterCallbackListener(object : CharacterCallback {
            override fun selectedItem(index: Int) {
                Log.w("CharacterListOneDialog", "Callback Item: $index")
                lifecycleScope.launch(Dispatchers.IO) {
                    viewModel.updateSelectIndex(index)
                }
                dismiss()
            }
        })
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStart() {
        super.onStart()

        val width = ConstraintLayout.LayoutParams.MATCH_PARENT
        val height = ConstraintLayout.LayoutParams.MATCH_PARENT
        dialog?.window!!.apply {
            setLayout(width, height)
            setGravity(Gravity.CENTER)
        }
    }
}