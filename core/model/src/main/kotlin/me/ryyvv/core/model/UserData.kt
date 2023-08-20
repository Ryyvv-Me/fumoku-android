package me.ryyvv.core.model

/**
 * A data providing user preferences and configurations.
 */
data class UserData(
    val bookmarkedFumos: Set<Int>,
    val darkThemeConfig: DarkThemeConfig,
    val useDynamicColor: Boolean,
)
