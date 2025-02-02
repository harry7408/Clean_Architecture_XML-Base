package com.choi.domain.usecase

import com.choi.domain.model.LocalTempModel
import com.choi.domain.repository.TempLocalRepository
import javax.inject.Inject

class LocalUseCase @Inject constructor(
    private val tempLocalRepository: TempLocalRepository
) {

    fun getId() : LocalTempModel {
        return tempLocalRepository.getLocalTempModel()
    }

}