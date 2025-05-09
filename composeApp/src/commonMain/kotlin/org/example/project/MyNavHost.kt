package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import org.example.project.a.ARoute
import org.example.project.a.aDestination
import org.example.project.a.b.BRoute
import org.example.project.c.cDestination
import org.example.project.c.d.DRoute

interface Route

@Composable
fun MyNavHost(navController: NavHostController) {
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier.padding(paddingValues = innerPadding)
        ) {
            Button(onClick = {
                navController.navigate(BRoute)
            }) {
                Text(text = "Navigate to B")
            }

            Button(onClick = {
                navController.navigate(DRoute)
            }) {
                Text(text = "Navigate to D")
            }

            NavHost(
                navController = navController,
                startDestination = ARoute,
            ) {
                aDestination()
                cDestination()
            }
        }
    }
}
