package com.example.makemon.ui.character_list

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.makemon.R
import com.example.makemon.adapter.ViewPagerFiveAdapter
import com.example.makemon.adapter.ViewPagerFourAdapter
import com.example.makemon.adapter.ViewPagerSixAdapter
import com.example.makemon.databinding.FragmentCharacterBinding
import com.example.makemon.ui.MainActivity

class CharacterListSixFragment : Fragment(), View.OnClickListener {

    companion object{
        const val TAG = "CharacterListFourFragment"
    }

    lateinit var binding: FragmentCharacterBinding

    private var pagerAdapter: ViewPagerSixAdapter? = null

    private var pageIndex: String = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCharacterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")

        with(requireActivity() as MainActivity) {
            bottomNavigationVisibility(false)
            setToolbarBackVisibility(true)
        }

        binding.btMove.setOnClickListener(this)

        binding.viewPager.apply {
            /*offscreenPageLimit = 3
            setPadding(50, 0, 50, 0)*/

            pagerAdapter = ViewPagerSixAdapter()
            this.adapter = pagerAdapter
            this.orientation = ViewPager2.ORIENTATION_HORIZONTAL

            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageScrolled(
                    position: Int,
                    positionOffset: Float,
                    positionOffsetPixels: Int
                ) {
                    super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                }

                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)

                    Log.w("CharacterListOneFragment", "position:: $position")
                    if (position.toString().toInt() > 29) {
                        binding.textPage.text = String.format(getString(R.string.viewpager_banner_text), position - 29, pagerAdapter!!.data.size)
                    } else {
                        binding.textPage.text = String.format(getString(R.string.viewpager_banner_text), position + 1, pagerAdapter!!.data.size)
                    }
                }

                override fun onPageScrollStateChanged(state: Int) {
                    super.onPageScrollStateChanged(state)
                }
            })
        }

        binding.editPage.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
            override fun afterTextChanged(s: Editable?) {
                pageIndex = s.toString()
                if (s.toString().length > 2) {
                    binding.textInputLayer.error = getString(R.string.list_search_error_text_one)
                    binding.btMove.isClickable = false
                } else if (s.toString().length >= 2 && s.toString() > 11.toString()) {
                    binding.textInputLayer.error = getString(R.string.list_search_error_text_two)
                    binding.btMove.isClickable = false
                }
                else {
                    binding.textInputLayer.error = null
                    binding.btMove.isClickable = true
                }
            }
        })

        binding.editPage.setOnEditorActionListener { _, actionId, _ ->
            var handle = false
            when(actionId) {
                EditorInfo.IME_ACTION_DONE -> {
                    binding.viewPager.currentItem = pageIndex.toInt() - 1
                    handle = true
                }
            }
            handle
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btMove -> {
                    if (binding.editPage.text.toString().isEmpty()) {
                        Toast.makeText(requireActivity(), getString(R.string.list_search_impty_text), Toast.LENGTH_SHORT).show()
                        return
                    }
                    binding.viewPager.currentItem = pageIndex.toInt() - 1
                }
            }
        }
    }
}