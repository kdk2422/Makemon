package com.example.makemon.ui.test

import android.graphics.Bitmap
import android.graphics.Canvas
import android.media.MediaScannerConnection
import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.makemon.R
import com.example.makemon.databinding.FragmentTestTwoBinding
import com.example.makemon.utils.getFormattedDateFromString
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.Date


class TestTwoFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentTestTwoBinding

    var mediaScannerConnection: MediaScannerConnection? = null
    var mediaScannerClient: MediaScannerConnection.MediaScannerConnectionClient? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.captureButton.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()

    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.captureButton -> {
                    val rootView: View = binding.mainView

                    val screenShot = capture(rootView)

                    MediaScannerConnection.scanFile(requireActivity(),
                        arrayOf(arrayOf(screenShot).toString()), null, null).apply {
                        Toast.makeText(requireActivity(), "화면이 캡쳐되었습니다.", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    private fun capture(view: View): File {
        view.isDrawingCacheEnabled = true

        val screenBitmap: Bitmap = view.drawingCache

        val now = System.currentTimeMillis()
        val date = Date(now)
        val test = SimpleDateFormat("yyyy-MM-dd-hh-mm-ss")
        val getTime: String = test.format(date)

        val fileName = "screenshot${getFormattedDateFromString(getTime)}.png"
        val file: File = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), fileName)

        val os: FileOutputStream
        try {
            os = FileOutputStream(file)
            screenBitmap.compress(Bitmap.CompressFormat.PNG, 90, os)
            os.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }

        view.isDrawingCacheEnabled = false
        return file
    }

    private fun getBitmapFromView(view: View): Bitmap {
        val bitmap = Bitmap.createBitmap(
            view.width, view.height, Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        view.draw(canvas)
        return bitmap
    }
}