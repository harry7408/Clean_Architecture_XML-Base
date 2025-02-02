package com.choi.presentation.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.choi.presentation.R
import com.choi.presentation.databinding.ActivityTestBinding
import com.choi.presentation.viewmodel.TempViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TempActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTestBinding

    private val viewModel : TempViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityTestBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initButton()
    }


    private fun initButton() {
        with(binding) {
            testButton.setOnClickListener {
                // from Local
                localTextView.text=viewModel.getId()

                // from Remote
                remoteTextView.text=viewModel.getName()
            }
        }
    }
}