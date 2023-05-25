package me.ryyvv.fumoku.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

sealed class Screen(val route: String) {
    object Settings : Screen("settings")
}

@Composable
fun SettingsScreen() {
    Text(text = Screen.Settings.route)
}