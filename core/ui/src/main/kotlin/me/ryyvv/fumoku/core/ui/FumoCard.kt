package me.ryyvv.fumoku.core.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import me.ryyvv.core.model.Fumo
import me.ryyvv.fumoku.core.ui.theme.FumokuTheme
import java.net.URL

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FumoCard(
    fumo: Fumo,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier,
    ) {
        Column {
            // Image
            if (fumo.image.isNotEmpty()) {
                FumoHeaderImage(image = URL(fumo.image))
            }

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                // Character
                Text(
                    text = fumo.character.name,
                    style = MaterialTheme.typography.headlineMedium,
                )
                // Name
                Text(
                    text = fumo.name,
                    style = MaterialTheme.typography.titleLarge,
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Type
                AssistChip(
                    onClick = {},
                    label = {
                        Text(text = fumo.type.toString())
                    },
                )
            }
        }
    }
}

@Composable
fun FumoHeaderImage(
    image: URL
) {
    // TODO
}

@Preview("FumoCard")
@Composable
private fun FumoCardPreview(
    @PreviewParameter(FumoPreviewParameterProvider::class)
    fumos: List<Fumo>
) {
    FumokuTheme {
        Surface {
            FumoCard(
                fumo = fumos[0],
                onClick = {},
            )
        }
    }
}
