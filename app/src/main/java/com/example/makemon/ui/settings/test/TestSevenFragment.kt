package com.example.makemon.ui.settings.test

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.afollestad.materialdialogs.MaterialDialog
import com.example.makemon.R
import com.example.makemon.app.MakemonApp
import com.example.makemon.databinding.FragmentTestSevenBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.NullPointerException
import java.util.Locale
import java.util.NoSuchElementException


class TestSevenFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentTestSevenBinding

    lateinit var lm: LocationManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestSevenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btGPS.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
        lm = requireContext().applicationContext.getSystemService(AppCompatActivity.LOCATION_SERVICE) as LocationManager
    }

    override fun onDestroyView() {
        super.onDestroyView()

        lm.removeUpdates(gpsLocationListener)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btGPS -> {
                    getGPSProvider()
                }
            }
        }
    }

    private fun getGPSProvider() {
        if (ActivityCompat.checkSelfPermission(
                requireActivity(), Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                requireActivity(), Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            locationPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
            locationPermissionLauncher.launch(Manifest.permission.ACCESS_COARSE_LOCATION)
        } else {
            val listProvider = lm.allProviders
            Log.w("TestSevenFragment", "listProvider: $listProvider")

            for (i in 0..3) {
                when (listProvider[i]) {
                    LocationManager.PASSIVE_PROVIDER -> {
                        val isEnable = lm.isProviderEnabled(LocationManager.PASSIVE_PROVIDER)
                        Log.w("TestSevenFragment", "PASSIVE_PROVIDER isEnable: $isEnable")

                        if (isEnable) {
                            lm.requestLocationUpdates(
                                LocationManager.PASSIVE_PROVIDER,
                                1000,
                                1f,
                                gpsLocationListener
                            )
                        }
                    }

                    LocationManager.NETWORK_PROVIDER -> {
                        val isEnable = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
                        Log.w("TestSevenFragment", "NETWORK_PROVIDER isEnable: $isEnable")

                        if (isEnable) {
//                            lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 1f, gpsLocationListener)
                        }
                    }

                    LocationManager.FUSED_PROVIDER -> {
                        val isEnable = lm.isProviderEnabled(LocationManager.FUSED_PROVIDER)
                        Log.w("TestSevenFragment", "FUSED_PROVIDER isEnable: $isEnable")

                        if (isEnable) {
//                            lm.requestLocationUpdates(LocationManager.FUSED_PROVIDER, 1000, 1f, gpsLocationListener)
                        }
                    }

                    LocationManager.GPS_PROVIDER -> {
                        val isEnable = lm.isProviderEnabled(LocationManager.GPS_PROVIDER)
                        Log.w("TestSevenFragment", "GPS_PROVIDER isEnable: $isEnable")

                        if (isEnable) {
//                            lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 1f, gpsLocationListener)
                        }
                    }
                }
            }
        }
    }

    private val gpsLocationListener: LocationListener = LocationListener { location ->
        val provider = location.provider
        val longitude = location.longitude
        val latitude = location.latitude
        val altitude = location.altitude

        lifecycleScope.launch(Dispatchers.IO) {
            Log.w("TestSevenFragment", "location: $location")
            Log.w("TestSevenFragment", "위치정보: $provider\n위도: $longitude\n경도: $latitude\n고도: $altitude")
        }

        getAddress(location)
    }

    private fun getAddress(location: Location): String {
        return try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                ""
            } else {
                with(
                    Geocoder(requireActivity(), Locale.KOREA).getFromLocation(
                        location.latitude,
                        location.longitude,
                        2
                    )!!.first()
                ) {
                    getAddressLine(0)   //주소
                    Log.w("TestSevenFragment", "getAddressLine: ${getAddressLine(0)}")
                    binding.textGPS.text = getAddressLine(0)
                    Log.w("TestSevenFragment", "countryName: $countryName, countryCode: $countryCode, adminArea: $adminArea, locality: $locality, thoroughfare: $thoroughfare, latitude: $latitude, longitude: $longitude, featureName: $featureName")
                    countryName     //국가이름
                    countryCode     //국가코드
                    adminArea       //행정구역
                    locality        //관할구역
                    thoroughfare    //상세구역
                    latitude
                    longitude
                    featureName     //상세주소
                }
            }
        } catch (e: Exception) {
            Log.e("TestSevenFragment", "Exception: $e")
            when(e) {
                is NoSuchElementException -> {
                    binding.textGPS.text = "위치 정보 조회를 실패하였습니다."
                }
            }
            return ""
        }
    }

    private val locationPermissionLauncher =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            if (it) {
                Log.w("TestSevenFragment", "onActivityResult: PERMISSION GRANTED")
            } else {
                Log.w("TestSevenFragment", "onActivityResult: PERMISSION DENIED").apply {

                    /*val intentOpenLocationSettings = Intent()
                    intentOpenLocationSettings.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    intentOpenLocationSettings.action =
                        android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS

                    MaterialDialog(requireActivity())
                        .cornerRadius(20f)
                        .show {
                            title(text = "안내")
                            message(text = "위치 권한을 먼저 동의해야 사용가능한 기능입니다.")
                            cancelOnTouchOutside(false)
                            positiveButton(text = "설정으로") {
                                startActivity(intentOpenLocationSettings)
                            }
                            negativeButton(text = "나중에") {
                                dismiss()
                                requireActivity().onBackPressed()
                            }
                        }*/
                }
            }
        }
}
