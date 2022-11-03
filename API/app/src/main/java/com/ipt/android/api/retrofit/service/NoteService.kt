package com.ipt.android.api.retrofit.service

import com.ipt.android.api.model.APIResult
import com.ipt.android.api.model.Note
import retrofit2.Call
import retrofit2.http.*

interface NoteService {
    @GET("API/getNotes.php")
    fun list(): Call<List<Note>>

    @FormUrlEncoded
    @POST("API/addNote.php")
    fun addNote(@Field("title") title: String?, @Field("description") description: String?): Call<APIResult>
}