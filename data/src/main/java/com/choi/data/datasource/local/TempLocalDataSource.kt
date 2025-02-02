package com.choi.data.datasource.local

import com.choi.domain.model.LocalTempModel
import javax.inject.Inject

// SQLITE OR ROOM DB 등 로컬에서 가져오는 데이터 원천지
class TempLocalDataSource @Inject constructor() {

    fun getId() : LocalTempModel {
        return LocalTempModel("1")
    }

}