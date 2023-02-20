package com.example.makemon.ui.settings.test

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.makemon.BuildConfig
import com.example.makemon.R
import com.example.makemon.adapter.RecyclerViewAdapter
import com.example.makemon.data.Data
import com.example.makemon.databinding.FragmentTestSixBinding
import com.example.makemon.network.api.ApiClient.instance
import com.example.makemon.network.api.ApiInterface
import com.example.makemon.utils.hideKeyboard
import com.google.android.gms.common.internal.Objects.ToStringHelper
import com.google.gson.GsonBuilder
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class TestSixFragment : Fragment(), View.OnClickListener {

    lateinit var binding: FragmentTestSixBinding

    private val stringBuilder = StringBuilder()

    private var json = "book.json"

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestSixBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btSearch.setOnClickListener(this)
        binding.book.setOnClickListener(this)
        binding.movie.setOnClickListener(this)
        binding.news.setOnClickListener(this)
        binding.shopping.setOnClickListener(this)

        binding.recyclerView.layoutManager =  LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false)
        binding.recyclerView.setHasFixedSize(false)

    }

    override fun onResume() {
        super.onResume()

        when(json) {
            "book.json" -> {
                binding.searchTitle.hint = "검색할 도서를 입력해주세요."
            }
            "movie.json" -> {
                binding.searchTitle.hint = "검색할 영화를 입력해주세요."
            }
            "news.json" -> {
                binding.searchTitle.hint = "검색할 뉴스를 입력해주세요."
            }
            "shop.json" -> {
                binding.searchTitle.hint = "검색할 물건을 입력해주세요."
            }

        }
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id) {
                R.id.btSearch -> {
                    if (binding.searchTitle.text.toString() == "") {
                        Toast.makeText(requireActivity(), "먼저 검색어를 입력해주세요.", Toast.LENGTH_SHORT).show()
                        return
                    } else {
//                        binding.textResult.text = ""
//                        stringBuilder.clear()
                        getResultSearch()
                        requireActivity().hideKeyboard()
                    }
                }
                R.id.book -> {
                    json = "book.json"
                    binding.searchTitle.text = null
                    binding.searchTitle.hint = "검색할 도서를 입력해주세요."
                }
                R.id.movie -> {
                    json = "movie.json"
                    binding.searchTitle.text = null
                    binding.searchTitle.hint = "검색할 영화를 입력해주세요."
                }
                R.id.news -> {
                    json = "news.json"
                    binding.searchTitle.text = null
                    binding.searchTitle.hint = "검색할 뉴스를 입력해주세요."
                }
                R.id.shopping -> {
                    json = "shop.json"
                    binding.searchTitle.text = null
                    binding.searchTitle.hint = "검색할 물건을 입력해주세요."
                }
            }
        }
    }

    private fun getResultSearch() {
        val apiInterface = instance!!.create(ApiInterface::class.java)
        val call: Call<String?>? =
            apiInterface.getSearchResult(BuildConfig.NAVER_CLIENT_ID, BuildConfig.NAVER_CLIENT_SECRET, json, binding.searchTitle.text.toString(), 10)
        call?.enqueue(object : Callback<String?> {
            override fun onResponse(call: Call<String?>, response: Response<String?>) {
                if (response.isSuccessful && response.body() != null) {

                    val result: String = response.body()!!
                    Log.e("TestSixFragment", "성공 : $result")

                    val gson = GsonBuilder().create()
                    val data = gson.fromJson(result, Data::class.java)

                    Log.e("TestSixFragment", "성공2 : $data")

                    if (data.items.isEmpty()) {
                        Toast.makeText(requireActivity(), "일치하는 검색 결과가 없습니다.", Toast.LENGTH_SHORT).show()
                        Log.e("TestSixFragment", "null")
                    }

                    lifecycleScope.launch(Dispatchers.Main) {
                        binding.recyclerView.adapter = RecyclerViewAdapter(data)
                    }

                    /*val jsonObject = JSONObject(result)
                    val items = jsonObject.getString("items")
                    val jsonArray = JSONArray(items)

                    lifecycleScope.launch(Dispatchers.IO) {
                        for (i in 0 until jsonArray.length()) {
                            val subJsonObject = jsonArray.getJSONObject(i)
                            val title = subJsonObject.getString("title")
                            val link = subJsonObject.getString("link")
                            val image = subJsonObject.getString("image")
                            val author = subJsonObject.getString("author")
                            val discount = subJsonObject.getString("discount")
                            val publisher = subJsonObject.getString("publisher")
                            val pubdate = subJsonObject.getString("pubdate")

                            withContext(Dispatchers.Main) {
                                stringBuilder
                                    .append("title: $title\n")
                                    .append("link: $link\n")
                                    .append("image: $image\n")
                                    .append("author: $author\n")
                                    .append("discount: $discount\n")
                                    .append("publisher: $publisher\n")
                                    .append("pubdate: $pubdate\n")
                                    .append("count: $i")
                                    .append("\n\n")

                                binding.textResult.text = stringBuilder

                                //Note: 텍스트 뷰 자동 스크롤
                                val scrollAmount: Int =
                                    binding.textResult.layout.getLineTop(binding.textResult.lineCount) - binding.textResult.height
                                if (scrollAmount > 0) {
                                    binding.textResult.scrollTo(0, scrollAmount)
                                } else binding.textResult.scrollTo(0, 0)
                            }
                        }
                    }*/

                } else {
                    Log.e("TestSixFragment", "실패 : " + response.body())
                }
            }

            override fun onFailure(call: Call<String?>, t: Throwable) {
                Log.e("TestSixFragment", "에러 : " + t.message)
            }
        })
    }
}
