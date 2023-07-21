package com.example.makemon.ui.settings.test

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.DialogFragment
import com.example.makemon.R
import com.example.makemon.databinding.DialogTestBinding

class TestDialog : DialogFragment() {

    companion object {
        @Volatile
        private var instance: TestDialog? = null

        @JvmStatic
        fun getInstance() : TestDialog =
            instance ?: synchronized(this) {
                instance ?: TestDialog().also {
                    instance = it
                }
            }
    }

    lateinit var binding: DialogTestBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setStyle(STYLE_NO_TITLE, R.style.FullScreenDialog)
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