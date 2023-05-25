package me.ryyvv.fumoku.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import me.ryyvv.fumoku.feature.home.R as homeR
import me.ryyvv.fumoku.feature.settings.R as settingsR

enum class TopLevelDestination(
    val icon: ImageVector,
    val textId: Int,
) {
    HOME(
        icon = Icons.Default.Home,
        textId = homeR.string.home
    ),
    SETTINGS(
        icon = Icons.Default.Settings,
        textId = settingsR.string.settings,
    ),
}