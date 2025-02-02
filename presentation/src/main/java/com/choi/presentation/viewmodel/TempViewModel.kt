package com.choi.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.choi.domain.usecase.LocalUseCase
import com.choi.domain.usecase.RemoteUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class TempViewModel @Inject constructor(
    private val localUseCase: LocalUseCase,
    private val remoteUseCase: RemoteUseCase
) : ViewModel() {

    // Flow 활용 하는 경우
   /*
    private val _userId = MutableStateFlow<String>("1234")
    val userId : StateFlow<String> = _userId.asStateFlow()

    private val _userName = MutableStateFlow<String>("이름")
    val username : StateFlow<String> = _userName.asStateFlow()
    */

    fun getId() : String {
        return localUseCase.getId().id
    }

    fun getName() : String {
        return remoteUseCase.getName().name
    }
}
