package com.example.makemon.ui.settings.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.afollestad.materialdialogs.MaterialDialog
import com.example.makemon.R
import com.example.makemon.databinding.FragmentTestFiveBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class TestFiveFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentTestFiveBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestFiveBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.bt1.setOnClickListener(this)
        binding.bt2.setOnClickListener(this)
        binding.bt3.setOnClickListener(this)
        binding.bt4.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.bt1 -> {
                    MaterialDialog(requireActivity())
                        .cornerRadius(5f)
                        .show {
                            title(text = "test one title")
                            message(text = "test one message")
                            positiveButton(text = "test one done") {
                                dismiss()
                            }
                            negativeButton(text = "test one cancel") {
                                dismiss()
                            }
                        }
                }
                R.id.bt2 -> {
                    val items = arrayOf("1", "2", "3")
                    MaterialAlertDialogBuilder(requireActivity())
                        .setTitle("Test Two Title")
                        .setItems(items) { dialog, which ->
                            when(which) {
                                0 -> {
                                    Toast.makeText(requireActivity(), "one", Toast.LENGTH_SHORT).show()
                                    dialog.dismiss()
                                }
                                1 -> {
                                    Toast.makeText(requireActivity(), "two", Toast.LENGTH_SHORT).show()
                                    dialog.dismiss()
                                }
                                2 -> {
                                    Toast.makeText(requireActivity(), "three", Toast.LENGTH_SHORT).show()
                                    dialog.dismiss()
                                }
                            }
                        }
                        .show()
                }
                R.id.bt3 -> {
                    val items = arrayOf("4", "5", "6")
                    val checkItem = 0
                    var test = 0
                    MaterialAlertDialogBuilder(requireActivity())
                        .setTitle("test Three Title")
                        .setNeutralButton("test three cancel") { _, _ -> }
                        .setPositiveButton("test three done") { dialog, _ ->
                            when(test) {
                                0 -> {
                                    Toast.makeText(requireActivity(), "four", Toast.LENGTH_SHORT).show()
                                    dialog.dismiss()
                                }
                                1 -> {
                                    Toast.makeText(requireActivity(), "five", Toast.LENGTH_SHORT).show()
                                    dialog.dismiss()
                                }
                                2 -> {
                                    Toast.makeText(requireActivity(), "six", Toast.LENGTH_SHORT).show()
                                    dialog.dismiss()
                                }
                            }
                        }
                        .setSingleChoiceItems(items, checkItem) { dialog, which ->
                            when(which) {
                                0 -> { test = 0 }
                                1 -> { test = 1 }
                                2 -> { test = 2 }
                            }
                        }
                        .show()
                }
                R.id.bt4 -> {
                    TestDialog.getInstance().apply {
                        if (!this.isAdded) {
                            show(this@TestFiveFragment.requireActivity().supportFragmentManager, "dialog")
                        }
                    }
                }

            }
        }
    }
}
