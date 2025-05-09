package org.example.project.c.d

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.example.project.Route

@Serializable
@SerialName("d")
data object DRoute : Route

fun NavGraphBuilder.dDestination() {
    composable<DRoute> {
        DScreen()
    }
}
