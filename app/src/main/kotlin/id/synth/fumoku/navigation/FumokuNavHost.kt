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

package id.synth.fumoku.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import id.synth.fumoku.feature.home.navigation.ROUTE_HOME
import id.synth.fumoku.feature.home.navigation.homeScreen
import id.synth.fumoku.feature.settings.navigation.settingsScreen
import id.synth.fumoku.ui.FumokuAppState

@Composable
fun FumokuNavHost(
    appState: FumokuAppState,
    modifier: Modifier = Modifier,
    startDestination: String = ROUTE_HOME,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeScreen()
        settingsScreen()
    }
}
