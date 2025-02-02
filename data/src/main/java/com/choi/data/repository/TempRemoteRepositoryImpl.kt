package com.choi.data.repository

import com.choi.data.datasource.remote.TempRemoteDataSource
import com.choi.domain.model.RemoteTempModel
import com.choi.domain.repository.TempRemoteRepository
import javax.inject.Inject

class TempRemoteRepositoryImpl @Inject constructor(
    private val tempRemoteDataSource: TempRemoteDataSource
) : TempRemoteRepository {
    override fun getRemoteTempModel(): RemoteTempModel {
        return tempRemoteDataSource.getName()
    }

}