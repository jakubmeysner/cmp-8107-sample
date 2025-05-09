package org.example.project.a.b

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.example.project.Route

@Serializable
@SerialName("b")
data object BRoute : Route

fun NavGraphBuilder.bDestination() {
    composable<BRoute> {
        BScreen()
    }
}
