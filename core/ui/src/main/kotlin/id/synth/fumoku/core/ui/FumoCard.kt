package id.synth.fumoku.core.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import id.synth.core.model.Fumo
import id.synth.fumoku.core.ui.theme.FumokuTheme
import java.net.URL

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FumoCard(
    fumo: Fumo,
    onClick: () -> Unit,
    onTypeClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    OutlinedCard(
        onClick = onClick,
        modifier = modifier,
    ) {
        Column {
            // Image
            FumoCardImage(image = fumo.image)

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Spacer(modifier = Modifier.height(12.dp))

                // Character
                Text(
                    text = fumo.character.name,
                    style = MaterialTheme.typography.displaySmall,
                )
                // Name
                Text(
                    text = fumo.name,
                    style = MaterialTheme.typography.titleSmall,
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Type
                FilterChip(
                    selected = true,
                    onClick = onTypeClick,
                    label = {
                        Text(
                            text = fumo.type.toString(),
                        )
                    },
                )
            }
        }
    }
}

@Composable
fun FumoCardImage(
    image: URL,
) {
    AsyncImage(
        model = image.toString(),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(
                min = 120.dp,
                max = 480.dp,
            ),
        contentScale = ContentScale.Crop,
    )
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
                onTypeClick = {},
            )
        }
    }
}
