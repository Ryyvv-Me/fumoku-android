package me.ryyvv.fumoku.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Settings : Screen("settings")
}

@Composable
fun HomeScreen() {
    Text(text = Screen.Home.route)
}

@Composable
fun SettingsScreen() {
    Text(text = Screen.Settings.route)
}