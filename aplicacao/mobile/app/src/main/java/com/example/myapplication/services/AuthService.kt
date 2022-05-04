package com.example.myapplication.services

import com.example.myapplication.models.AuthRequest
import com.example.myapplication.models.AuthResponse
import com.example.myapplication.models.CadastroRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthService {

    @POST("/jogadores/login")
    fun postLogin(@Body authRequest: AuthRequest): Call<AuthResponse>

    @POST("/jogadores/cadastrar")
    fun postCadastrar(@Body cadastroRequest: CadastroRequest): Call<AuthResponse>



}