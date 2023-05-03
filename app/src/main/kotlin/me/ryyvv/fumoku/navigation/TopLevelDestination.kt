package me.ryyvv.fumoku.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import me.ryyvv.fumoku.R

enum class TopLevelDestination(
    val icon: ImageVector,
    val textId: Int,
) {
    HOME(
        icon = Icons.Default.Home,
        textId = R.string.home
    ),
    SETTINGS(
        icon = Icons.Default.Settings,
        textId = R.string.settings,
    ),
}