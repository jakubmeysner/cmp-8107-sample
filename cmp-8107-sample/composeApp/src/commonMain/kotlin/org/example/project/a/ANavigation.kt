package org.example.project.a

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.example.project.Route
import org.example.project.a.b.BRoute
import org.example.project.a.b.bDestination

@Serializable
@SerialName("a")
data object ARoute : Route

fun NavGraphBuilder.aDestination() {
    navigation<ARoute>(startDestination = BRoute) {
        bDestination()
    }
}
