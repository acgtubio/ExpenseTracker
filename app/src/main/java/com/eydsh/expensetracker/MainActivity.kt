package com.eydsh.expensetracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.eydsh.expensetracker.data.auth.AuthRepository
import com.eydsh.expensetracker.ui.login.LoginScreen
import com.eydsh.expensetracker.ui.theme.ExpenseTrackerTheme
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpenseTrackerTheme {
                LoginScreen()
            }
        }
    }
//    override fun onStart() {
//        super.onStart()
//
//        val currentUser = auth.currentUser
//        if (currentUser == null) {
//            LoginScreen()
//        }
//    }
}