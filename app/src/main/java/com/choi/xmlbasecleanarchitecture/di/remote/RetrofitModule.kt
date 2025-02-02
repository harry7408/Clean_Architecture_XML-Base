package com.choi.xmlbasecleanarchitecture.di.remote

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    // Retrofit 사용할 일 있으면 그대로 가져가 활용 하기

    /*
    @Provides
    @Singleton
    fun provideConverterFactory() : GsonConverterFactory {
        return GsonConverterFactory.create(
            GsonBuilder()
                .create()
        )
    }

    @Provides
    @Singleton
    fun provideOkHttpClient() : OkHttpClient.Builder {
        return OkHttpClient.Builder().apply {
            connectTimeout(5,TimeUnit.SECONDS)
            readTimeout(5,TimeUnit.SECONDS)
            writeTimeout(5,TimeUnit.SECONDS)

            addInterceptor(HttpLoggingInterceptor().apply {
                level= HttpLoggingInterceptor.Level.BODY
            })
        }
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        client: OkHttpClient.Builder,
        gsonConverterFactory: GsonConverterFactory
    ) : Retrofit {
        return Retrofit.Builder()
            .baseUrl("123")
            .addConverterFactory(gsonConverterFactory)
            .client(client.build())
            .build()
    }
    */

}