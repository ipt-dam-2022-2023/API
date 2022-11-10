package com.ipt.android.api.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ipt.android.api.retrofit.service.NoteService
import okhttp3.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitInitializer {

    //val host = "http://10.0.2.2/"
    val host = "http://ram.ipt.pt/"
    //val host = "https://adamastor.ipt.pt/DAM-API/"

    private val gson:Gson = GsonBuilder().setLenient().create()

    private val retrofit = Retrofit.Builder()
        .baseUrl(host)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun noteService() = retrofit.create(NoteService::class.java)
}

