package com.choi.domain.usecase

import com.choi.domain.model.RemoteTempModel
import com.choi.domain.repository.TempRemoteRepository
import javax.inject.Inject

class RemoteUseCase @Inject constructor(
    private val tempRemoteRepository: TempRemoteRepository
) {

    fun getName() : RemoteTempModel {
        return tempRemoteRepository.getRemoteTempModel()
    }

}