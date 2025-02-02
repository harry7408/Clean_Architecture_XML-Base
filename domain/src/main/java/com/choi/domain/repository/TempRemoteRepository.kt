package com.choi.domain.repository

import com.choi.domain.model.RemoteTempModel

interface TempRemoteRepository {

    fun getRemoteTempModel() : RemoteTempModel

}