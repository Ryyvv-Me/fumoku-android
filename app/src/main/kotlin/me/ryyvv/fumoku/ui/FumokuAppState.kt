package me.ryyvv.fumoku.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun rememberFumokuAppState(
    navController: NavHostController = rememberNavController()
): FumokuAppState {
    return remember(
        navController,
    ) {
        FumokuAppState(
            navController,
        )
    }
}

@Stable
class FumokuAppState(
    val navController: NavHostController,
) {
    val currentNavDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination
}