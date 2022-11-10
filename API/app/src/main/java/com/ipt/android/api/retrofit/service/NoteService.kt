package com.ipt.android.api.retrofit.service

import com.ipt.android.api.model.APIResult
import com.ipt.android.api.model.Note
import com.ipt.android.api.model.TokenJWT
import retrofit2.Call
import retrofit2.http.*

interface NoteService {

    @GET("API/getNotes.php")
    fun list(): Call<List<Note>>

    @GET("API/getNotesBA.php")
    fun listBA(@Header("Authorization") authorization: String): Call<List<Note>>

    @GET("API/getNotesJWT.php")
    fun listJWT(@Header("Authorization") token: String): Call<List<Note>>


    @FormUrlEncoded
    @POST("API/loginJWT.php")
    fun loginJWT(@Field("username") username: String?,
                @Field("password") password: String?): Call<TokenJWT>

    @FormUrlEncoded
    @POST("API/addNote.php")
    fun addNote(@Field("title") title: String?,
                @Field("description") description: String?): Call<APIResult>
    //@POST("API/notes")
    //fun addNote(@Body note: Note): Call<APIResult>
}