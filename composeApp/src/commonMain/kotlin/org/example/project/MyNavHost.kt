package org.example.project

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

interface Route

@Serializable
@SerialName("b")
data object BRoute : Route

@Serializable
@SerialName("d")
data object DRoute : Route


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
                startDestination = BRoute,
            ) {
                composable<BRoute> {
                    Text(text = "B screen")
                }

                composable<DRoute> {
                    Text(text = "D screen", color = Color.Red)
                }
            }
        }
    }
}
