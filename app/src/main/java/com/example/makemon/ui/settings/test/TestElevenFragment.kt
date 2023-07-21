package com.example.makemon.ui.settings.test

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.makemon.R
import com.example.makemon.databinding.FragmentTestElevenBinding
import java.net.URLDecoder
import java.net.URLEncoder

//  URL은 ASCII 문자를 사용해 인터넷을 통해서만 전송할 수 있습니다

class TestElevenFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentTestElevenBinding

    private lateinit var text: String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestElevenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btGo.setOnClickListener(this)
        binding.btReset.setOnClickListener(this)
        binding.btClip.setOnClickListener(this)
        binding.textClip.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btGo -> {
                    text = binding.editText.text.toString()
                    if (text.isNotEmpty()) {
                        binding.textOriginal.text = text

                        val encode = URLEncoder.encode(text, "UTF-8")
                        binding.textEncode.text = encode

                        val decode = URLDecoder.decode(encode, "UTF-8")
                        binding.textDecode.text = decode
                    } else return
                }
                R.id.btClip -> {
                    if (binding.textEncode.text != "Encode Result") clip()
                    else return
                }
                R.id.textClip ->{
                    if (binding.textEncode.text != "Encode Result") clip()
                    else return
                }
                R.id.btReset -> {
                    binding.textOriginal.text = "Original Result"
                    binding.textEncode.text = "Encode Result"
                    binding.textDecode.text = "Decode Result"
                    binding.editText.text = null
                }
            }
        }
    }

    private fun clip() {
        val copy: ClipboardManager = requireContext().getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val copyText = ClipData.newPlainText(null, binding.textEncode.text)
        copy.setPrimaryClip(copyText)
        Log.w("TestElevenFragment", "copy done")
    }
}