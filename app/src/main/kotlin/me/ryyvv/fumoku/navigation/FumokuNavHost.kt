package me.ryyvv.fumoku.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import me.ryyvv.fumoku.ui.FumokuAppState

@Composable
fun FumokuNavHost(
    appState: FumokuAppState,
    startDestination: String = Screen.Home.route,
    modifier: Modifier = Modifier,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {

        composable(Screen.Home.route) {
            HomeScreen()
        }

        composable(Screen.Settings.route) {
            SettingsScreen()
        }

    }
}