/*
 * Copyright 2023 Ryyvv Assoc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
