package com.eydsh.expensetracker.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.eydsh.expensetracker.ui.home.HomeScreen
import com.eydsh.expensetracker.ui.login.LoginScreen

enum class EntryScreenRoutes {
    Login,
    Main,
}

@Composable
fun EntryScreen(
    navHostController: NavHostController = rememberNavController()
) {
    val vm: EntryViewModel = hiltViewModel()
    val currentUser by vm.currentUser.collectAsState()
    var startScreen: EntryScreenRoutes = EntryScreenRoutes.Login

    if (currentUser != null) {
        startScreen = EntryScreenRoutes.Main
    }

    NavHost(
        navController = navHostController,
        startDestination = startScreen.name
    ) {
        composable(EntryScreenRoutes.Login.name) {
            LoginScreen(navHostController)
        }
        composable(EntryScreenRoutes.Main.name) {
            HomeScreen(navHostController = navHostController)
        }
    }
}