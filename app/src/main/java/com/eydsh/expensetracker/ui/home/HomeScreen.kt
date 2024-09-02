package com.eydsh.expensetracker.ui.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    navHostController: NavHostController
) {
    Text(text = "Logged in... You are in the home page")
}