package me.ryyvv.fumoku.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import me.ryyvv.fumoku.feature.home.navigation.ROUTE_HOME
import me.ryyvv.fumoku.feature.home.navigation.homeScreen
import me.ryyvv.fumoku.feature.settings.navigation.settingsScreen
import me.ryyvv.fumoku.ui.FumokuAppState

@Composable
fun FumokuNavHost(
    appState: FumokuAppState,
    modifier: Modifier = Modifier,
    startDestination: String = ROUTE_HOME,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeScreen()
        settingsScreen()
    }
}