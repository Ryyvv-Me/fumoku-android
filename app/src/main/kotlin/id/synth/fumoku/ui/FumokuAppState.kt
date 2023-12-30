/*
 * Copyright 2023 Synth.ID
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

package id.synth.fumoku.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import id.synth.fumoku.feature.home.navigation.navigateToHome
import id.synth.fumoku.feature.settings.navigation.navigateToSettings
import id.synth.fumoku.navigation.TopLevelDestination

@Composable
fun rememberFumokuAppState(
    navController: NavHostController = rememberNavController(),
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
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    fun navigateToDestination(topLevelDestination: TopLevelDestination) {
        val navOptions = navOptions {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }

        with(navController) {
            when (topLevelDestination) {
                TopLevelDestination.HOME ->
                    navigateToHome(navOptions)

                TopLevelDestination.SETTINGS ->
                    navigateToSettings(navOptions)
            }
        }
    }
}
