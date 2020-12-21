package com.example.finalandroid

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.infos.*
import kotlinx.android.synthetic.main.third_fragment.view.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ThirdFragment : Fragment() {
    var list = mutableListOf<Info>()
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val resFragment = inflater.inflate(R.layout.first_fragment, container, false)

        val adapter = infoAdapter()
        val recyclerView = resFragment.toRecycle
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val logging = HttpLoggingInterceptor()
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC)
        val client = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl("https://saurav.tech/NewsAPI/top-headlines/category/")
                .addConverterFactory(GsonConverterFactory.create()).client(client).build()

        val apiService = retrofit.create(ApiService::class.java)
        apiService.getInfos("business").enqueue(object : Callback<List<Info>> {
            override fun onFailure(call: Call<List<Info>>, t: Throwable){
                Log.e("fail", t.message!!)
            }

            override fun onResponse(call: Call<List<Info>>, response: Response<List<Info>>) {
                list.addAll(response.body()!!)
                adapter.setData(list)
            }
        })
        return resFragment
    }


}