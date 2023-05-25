package me.ryyvv.fumoku.feature.settings.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import me.ryyvv.fumoku.feature.settings.SettingsScreen

const val ROUTE_SETTINGS = "fumoku/settings"

fun NavController.navigateToSettings(navOptions: NavOptions? = null) {
    this.navigate(
        ROUTE_SETTINGS,
        navOptions
    )
}

fun NavGraphBuilder.settingsScreen() {
    composable(ROUTE_SETTINGS) {
        SettingsScreen(ROUTE_SETTINGS)
    }
}
