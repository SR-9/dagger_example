package com.example.myapplication.di.module.network

import android.content.Context
import com.example.myapplication.BuildConfig
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import javax.inject.Inject
import javax.inject.Singleton

@Module class RestfulApi @Inject constructor()  {

    private fun providesInterceptor(): Interceptor {
        return Interceptor { chain ->
            val newRequest = chain.request().newBuilder()
                .addHeader(
                    "Authorization",
                    "Bearer {token}"
                )
            chain.proceed(newRequest.build())
        }
    }

    private fun providesOkHttpClient(
        logging: Interceptor,
        header: Interceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(header)
            .addInterceptor(logging)
            .build()
    }


    private fun createLoggingInterceptor(): Interceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = if (BuildConfig.DEBUG)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
        return logging
    }

    private fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://postman-echo.com/")
            .callbackExecutor(Executors.newSingleThreadExecutor())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .client(providesOkHttpClient(providesInterceptor(), createLoggingInterceptor()))
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofitService(context: Context): ApiService {
        return provideRetrofit().create(ApiService::class.java)
    }
}