package com.lambdaschool.sprintchallenge3_pokeapi

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import java.util.concurrent.TimeUnit

object PokemonDao {
    private val POKEMON_URL = "https://pokeapi.co/api/v2/pokemon/" // add pokemon name as

    fun getPokemon(name: String):  Call<Pokemon> {

        val logger = HttpLoggingInterceptor()

        val okHttp = OkHttpClient.Builder()
                .addInterceptor(logger)
                .retryOnConnectionFailure(false)
                .readTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(11, TimeUnit.SECONDS)
                .build()

        val retrofit = Retrofit.Builder()
                .baseUrl(POKEMON_URL)
                .client(okHttp)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()


        return retrofit.create(PokemonCall::class.java).getPokemonByName(name)
    }

    interface PokemonCall {
        @GET("{name-id}")
        fun getPokemonByName(@Path("name-id") pokemonNameNumber: String): Call<Pokemon>
    }
}
