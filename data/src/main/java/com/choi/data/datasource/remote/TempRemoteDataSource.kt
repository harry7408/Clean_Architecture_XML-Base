package com.choi.data.datasource.remote

import com.choi.domain.model.RemoteTempModel
import javax.inject.Inject

// OkHttp3, Retrofit 을 이용하여 웹 서버로 부터 가져오는 데이터 원천지
class TempRemoteDataSource @Inject constructor() {

    fun getName() : RemoteTempModel {
        return RemoteTempModel("테스트")
    }

}