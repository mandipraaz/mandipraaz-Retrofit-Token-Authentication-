package com.example.ehnotetask.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class BasicAuthClient<T> {

    val accessToken ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6IkxhdGhhIiwiaHR0cDovL3NjaGVtYXMubWljcm9zb2Z0LmNvbS93cy8yMDA4LzA2L2lkZW50aXR5L2NsYWltcy91c2VyZGF0YSI6IjE4XzQ5RUJFRUIzX1Byb2QiLCJyb2xlIjoiNCIsIm5iZiI6MTYxMzU0MTU0OSwiZXhwIjoxNjEzNjI3OTQ5LCJpYXQiOjE2MTM1NDE1NDksImlzcyI6Imh0dHBzOi8vZGV2ZWhub3RlYXBpLmF6dXJld2Vic2l0ZXMubmV0IiwiYXVkIjoiaHR0cHM6Ly9kZXZlaG5vdGVhcGkuYXp1cmV3ZWJzaXRlcy5uZXQifQ.1lHhDiFx1GVsCCERb7ihi1iVXkfZ_-k3QLnhHCglAeQ"

    private val client =  OkHttpClient.Builder()
        .addInterceptor(OAuthInterceptor("Bearer", accessToken))
        .build()

    val gson = GsonBuilder()
        .setLenient()
        .create()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://ehnotedocapi.azurewebsites.net/api/MasterData/")
        .client(client)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    fun create(service: Class<T>): T {
        return retrofit.create(service)
    }
}
