package me.ryyvv.fumoku.feature.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import me.ryyvv.fumoku.feature.home.HomeScreen

const val ROUTE_HOME = "fumoku/home"

fun NavController.navigateToHome(navOptions: NavOptions? = null) {
    this.navigate(
        ROUTE_HOME,
        navOptions
    )
}

fun NavGraphBuilder.homeScreen() {
    composable(ROUTE_HOME) {
        HomeScreen(ROUTE_HOME)
    }
}
