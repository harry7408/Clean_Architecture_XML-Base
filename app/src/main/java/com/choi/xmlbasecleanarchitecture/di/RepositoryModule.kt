package com.choi.xmlbasecleanarchitecture.di

import com.choi.data.datasource.local.TempLocalDataSource
import com.choi.data.datasource.remote.TempRemoteDataSource
import com.choi.data.repository.TempLocalRepositoryImpl
import com.choi.data.repository.TempRemoteRepositoryImpl
import com.choi.domain.repository.TempLocalRepository
import com.choi.domain.repository.TempRemoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideTempLocalRepository(tempLocalDataSource: TempLocalDataSource): TempLocalRepository =
        TempLocalRepositoryImpl(tempLocalDataSource)


    @Provides
    @Singleton
    fun provideTempRemoteRepository(tempRemoteDataSource: TempRemoteDataSource): TempRemoteRepository =
        TempRemoteRepositoryImpl(tempRemoteDataSource)
}