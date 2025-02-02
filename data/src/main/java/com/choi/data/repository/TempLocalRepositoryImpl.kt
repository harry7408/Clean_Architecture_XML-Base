package com.choi.data.repository

import com.choi.data.datasource.local.TempLocalDataSource
import com.choi.domain.model.LocalTempModel
import com.choi.domain.repository.TempLocalRepository
import javax.inject.Inject

class TempLocalRepositoryImpl @Inject constructor(
    private val tempLocalDataSource: TempLocalDataSource
) : TempLocalRepository {
    override fun getLocalTempModel(): LocalTempModel {
        return tempLocalDataSource.getId()
    }
}