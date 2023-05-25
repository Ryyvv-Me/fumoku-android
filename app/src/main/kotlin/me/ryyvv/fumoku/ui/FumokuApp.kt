package me.ryyvv.fumoku.ui

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navOptions
import me.ryyvv.fumoku.R
import me.ryyvv.fumoku.feature.home.navigation.navigateToHome
import me.ryyvv.fumoku.navigation.FumokuNavHost
import me.ryyvv.fumoku.navigation.Screen
import me.ryyvv.fumoku.navigation.TopLevelDestination

@OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalLayoutApi::class,
)
@Composable
fun FumokuApp(
    appState: FumokuAppState = rememberFumokuAppState()
) {
    val navController = appState.navController

    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar(navController) },
    ) { innerPadding ->
        Row(
            Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .consumeWindowInsets(innerPadding)
        ) {
            FumokuNavHost(appState)
        }
    }
}

@Preview
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun TopBar() {
    TopAppBar(
        title = { Text(stringResource(id = R.string.app_name)) },
    )
}

@Composable
fun BottomBar(
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
) {
    val destinations = TopLevelDestination.values().asList()

    NavigationBar(modifier = modifier) {
        destinations.forEach { destination ->
            val selected = navHostController.currentBackStackEntryAsState().value?.destination
                .isInHierarchy(destination)
            NavigationBarItem(
                selected = selected,
                onClick = {
                    val navOptions = navOptions {
                        // Pop up to the start destination of the graph to
                        // avoid building up a large stack of destinations
                        // on the back stack as users select items
                        popUpTo(navHostController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        // Avoid multiple copies of the same destination when
                        // reselecting the same item
                        launchSingleTop = true
                        // Restore state when reselecting a previously selected item
                        restoreState = true
                    }

                    with(navHostController) {
                        when (destination) {
                            TopLevelDestination.HOME ->
                                navigateToHome(navOptions)

                            TopLevelDestination.SETTINGS -> navigate(
                                Screen.Settings.route,
                                navOptions,
                            )
                        }
                    }
                },
                icon = {
                    Icon(
                        imageVector = destination.icon,
                        contentDescription = null,
                    )
                },
                label = { Text(stringResource(destination.textId)) },
            )
        }
    }
}

private fun NavDestination?.isInHierarchy(destination: TopLevelDestination): Boolean =
    this?.hierarchy?.any {
        it.route?.contains(destination.name, true) ?: false
    } ?: false
