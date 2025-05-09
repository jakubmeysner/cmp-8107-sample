package org.example.project.c

import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.example.project.Route
import org.example.project.c.d.DRoute
import org.example.project.c.d.dDestination

@Serializable
@SerialName("c")
data object CRoute : Route

fun NavGraphBuilder.cDestination() {
    navigation<CRoute>(startDestination = DRoute) {
        dDestination()
    }
}
