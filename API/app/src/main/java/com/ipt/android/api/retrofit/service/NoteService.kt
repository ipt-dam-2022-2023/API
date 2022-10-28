package com.ipt.android.api.retrofit.service

import com.ipt.android.api.model.Note
import retrofit2.Call
import retrofit2.http.GET

interface NoteService {
    @GET("API/getNotes.php")
    fun list(): Call<List<Note>>
}