package me.ryyvv.core.model

import java.net.URL

data class Fumo(
    val id: Int,
    val character: Character,
    val type: FumoType,
    val name: String,
    val link: URL,
    val image: String,
)
