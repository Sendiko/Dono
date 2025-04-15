package com.github.sendiko.dono

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.sendiko.dono.login.LoginScreen
import com.github.sendiko.dono.login.LoginViewModel
import com.github.sendiko.dono.ui.theme.DonoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DonoTheme {
                val viewModel = viewModel<LoginViewModel>()
                LoginScreen(viewModel)
            }
        }
    }
}
