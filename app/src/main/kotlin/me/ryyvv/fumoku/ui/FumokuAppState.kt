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
    val currentNavDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination
}
