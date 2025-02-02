package com.choi.domain.repository

import com.choi.domain.model.LocalTempModel

interface TempLocalRepository {

    fun getLocalTempModel() : LocalTempModel

}