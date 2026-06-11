package com.example

import com.lagradost.cloudstream3.*

class AnikotoProvider : MainAPI() {

    override var mainUrl = "https://anikoto.cz"
    override var name = "Anikoto"

    override val supportedTypes = setOf(
        TvType.Anime
    )

}
