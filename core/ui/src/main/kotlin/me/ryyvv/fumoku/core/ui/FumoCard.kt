package me.ryyvv.fumoku.core.ui

import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import me.ryyvv.core.model.Fumo
import me.ryyvv.fumoku.core.ui.theme.FumokuTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FumoCard(
    fumo: Fumo,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick
    ) {

    }
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
