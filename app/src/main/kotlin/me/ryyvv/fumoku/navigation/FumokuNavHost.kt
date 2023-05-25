package me.ryyvv.fumoku.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import me.ryyvv.fumoku.feature.home.navigation.ROUTE_HOME
import me.ryyvv.fumoku.feature.home.navigation.homeScreen
import me.ryyvv.fumoku.ui.FumokuAppState

@Composable
fun FumokuNavHost(
    appState: FumokuAppState,
    startDestination: String = ROUTE_HOME,
    modifier: Modifier = Modifier,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {

        homeScreen()

        composable(Screen.Settings.route) {
            SettingsScreen()
        }

    }
}