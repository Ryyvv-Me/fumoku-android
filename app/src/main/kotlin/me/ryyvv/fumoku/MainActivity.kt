package me.ryyvv.fumoku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import me.ryyvv.fumoku.ui.FumokuApp
import me.ryyvv.fumoku.ui.theme.FumokuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FumokuTheme {
                FumokuApp()
            }
        }
    }
}
