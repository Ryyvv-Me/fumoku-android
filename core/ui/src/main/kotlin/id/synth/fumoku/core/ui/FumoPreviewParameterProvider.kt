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
