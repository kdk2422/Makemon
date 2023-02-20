package com.example.makemon.ui.settings

import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.afollestad.materialdialogs.MaterialDialog
import com.example.makemon.BuildConfig
import com.example.makemon.R
import com.example.makemon.databinding.FragmentSettingsBinding
import com.google.android.material.dialog.MaterialDialogs

class SettingsFragment : Fragment(), View.OnClickListener {

    companion object{
        const val TAG = "SettingsFragment"
    }

    lateinit var binding: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(requireActivity() as SettingsActivity) {
            setTitleText(R.string.appbar_title_settings)
        }

        binding.urlOfficial.setOnClickListener(this)
        binding.urlWix.setOnClickListener(this)

        binding.urlPixiv.setOnClickListener(this)
        binding.urlFanbox.setOnClickListener(this)
        binding.urlBooth.setOnClickListener(this)
        binding.urlSkep.setOnClickListener(this)
        binding.urlBooks.setOnClickListener(this)
        binding.urlCharacterMake.setOnClickListener(this)

        binding.urlYoutube.setOnClickListener(this)
        binding.urlTwiiter.setOnClickListener(this)

        binding.testOne.setOnClickListener(this)
        binding.testTwo.setOnClickListener(this)
        binding.testThree.setOnClickListener(this)
        binding.testFour.setOnClickListener(this)
        binding.testFive.setOnClickListener(this)
        binding.testSix.setOnClickListener(this)
        binding.testSeven.setOnClickListener(this)

    }

    override fun onResume() {
        super.onResume()

        /*if (BuildConfig.DEBUG) {
            binding.textTest.visibility = View.VISIBLE
            binding.layerTest.visibility = View.VISIBLE
        } else {
            binding.textTest.visibility = View.GONE
            binding.layerTest.visibility = View.GONE
        }*/
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.urlOfficial -> {
                    intent("https://bayachao.com/#/")
                }
                R.id.urlWix -> {
                    intent("https://bayachao.wixsite.com/makemon")
                }
                R.id.urlPixiv -> {
                    intent("https://www.pixiv.net/users/5752620")
                }
                R.id.urlFanbox -> {
                    MaterialDialog(requireActivity())
                        .cornerRadius(20f)
                        .show {
                            title(text = "안내")
                            message(text = "예민한 컨텐츠가 포함되어 있습니다. 그래도 보시겠습니까?")
                            cancelOnTouchOutside(false)
                            positiveButton(text = "네") {
                                intent("https://www.fanbox.cc/@ahechao")
//                                Toast.makeText(requireActivity(), "응 못 봐~", Toast.LENGTH_LONG).show()
                            }
                            negativeButton(text = "아니요") {
                                dismiss()
                            }
                        }
                }
                R.id.urlBooth -> {
                    intent("https://kemobayashi.booth.pm/")
                }
                R.id.urlSkep -> {
                    intent("https://skeb.jp/@BAYACHAO")
                }
                R.id.urlBooks -> {
                    intent("https://alice-books.com/item/list/all?circle_id=6441")
                }
                R.id.urlCharacterMake -> {
                    intent("http://makemon.starfree.jp/")
                }
                R.id.urlYoutube -> {
                    Toast.makeText(requireActivity(), "구현 예정", Toast.LENGTH_SHORT).show()
                }
                R.id.urlTwiiter -> {
                    Toast.makeText(requireActivity(), "구현 예정", Toast.LENGTH_SHORT).show()
                }
                R.id.testOne -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testFragment)
                }
                R.id.testTwo -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testTwoFragment)
                }
                R.id.testThree -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testThreeFragment)
                }
                R.id.testFour -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testFourFragment)
                }
                R.id.testFive -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testFiveFragment)
                }
                R.id.testSix -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testSixFragment)
                }
                R.id.testSeven -> {
                    NavHostFragment.findNavController(this)
                        .navigate(R.id.action_settingsFragment_to_testSevenFragment)
                }
            }
        }

    }

    //Note： 하이퍼 링크 메서드 화
    private fun intent(uri: String) {
        val i = Intent(Intent.ACTION_VIEW)
        i.data = Uri.parse(uri)
        startActivity(i)
    }
}