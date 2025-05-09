package org.example.project

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun App(navController: NavHostController = rememberNavController()) {
    MyNavHost(navController = navController)
}
