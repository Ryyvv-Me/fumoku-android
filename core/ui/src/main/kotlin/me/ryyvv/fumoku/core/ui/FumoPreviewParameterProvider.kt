package me.ryyvv.fumoku.core.ui

import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import me.ryyvv.core.model.Character
import me.ryyvv.core.model.Fumo
import me.ryyvv.core.model.FumoType
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
            image = "https://www.gift-gift.jp/nui/files/images/nui001_01.jpg"
        )
    )
}
