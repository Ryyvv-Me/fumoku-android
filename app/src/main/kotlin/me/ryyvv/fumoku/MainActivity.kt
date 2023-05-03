package me.ryyvv.fumoku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.offset
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
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import me.ryyvv.fumoku.navigation.HomeScreen
import me.ryyvv.fumoku.navigation.Screen
import me.ryyvv.fumoku.navigation.SettingsScreen
import me.ryyvv.fumoku.navigation.TopLevelDestination
import me.ryyvv.fumoku.ui.theme.FumokuTheme

@OptIn(
    ExperimentalLayoutApi::class,
    ExperimentalMaterial3Api::class,
)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            FumokuTheme {
                Scaffold(
                    topBar = { TopBar() },
                    bottomBar = { BottomBar(navController) },
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        modifier = Modifier.padding(innerPadding),
                        startDestination = Screen.Home.route,
                    ) {

                        composable(Screen.Home.route) {
                            HomeScreen()
                        }

                        composable(Screen.Settings.route) {
                            SettingsScreen()
                        }

                    }
                }
            }
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
                // Check if it's in hierarchy
                ?.hierarchy?.any {
                    it.route?.contains(destination.name, true) ?: false
                } ?: false
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

                    when (destination) {
                        TopLevelDestination.HOME -> navHostController.navigate(
                            Screen.Home.route,
                            navOptions,
                        )

                        TopLevelDestination.SETTINGS -> navHostController.navigate(
                            Screen.Settings.route,
                            navOptions,
                        )
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
