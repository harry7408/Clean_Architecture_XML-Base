package com.choi.xmlbasecleanarchitecture.di.remote

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {

    // 만들고자 하는 서비스 생성
    /**
     * Ex) @Singleton
     *     @Provides
     *     fun providesTestService(retrofit: Retrofit): ContentService =
     *         retrofit.create(TestService::class.java)
     */
}