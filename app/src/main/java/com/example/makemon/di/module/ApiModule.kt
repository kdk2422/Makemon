package com.example.makemon.di.module

import dagger.Module
import dagger.Provides
import dagger.Reusable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApiModule {

    @Provides
    @Singleton
    @Named("Okhttp0")
    fun provideOkhttpClientV0(): OkHttpClient {
        val client = OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
        return client.build()
    }

    @Provides
    @Reusable
    @Named("retrofit0")
    fun provideRetrofitV0(
        @Named("Okhttp0") okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://openapi.naver.com/v1/")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    /*@Provides
    @Reusable
    fun provideTestApi(@Named("v0") retrofit: Retrofit): TestApi {
        return retrofit.create(TestApi::class.java)
    }*/
}