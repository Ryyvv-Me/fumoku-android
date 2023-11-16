package id.synth.fumoku.core.ui

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import id.synth.core.model.Character
import id.synth.core.model.Fumo
import id.synth.core.model.FumoType
import java.net.URL

class FumoPreviewParameterProvider : PreviewParameterProvider<List<Fumo>> {
    override val values: Sequence<List<Fumo>> = sequenceOf(PreviewParameterData.fumos)
}

object PreviewParameterData {
    val fumos = listOf(
        Fumo(
            id = 1,
            character = Character(
                name = "Hakurei Reimu",
                wiki = URL("https://en.touhouwiki.net/wiki/Reimu_Hakurei")
            ),
            type = FumoType.REGULAR,
            name = "Version 1",
            link = URL("https://www.gift-gift.jp/nui/nui001.html"),
            image = URL("https://fumo.website/img/001.jpg")
        )
    )
}
