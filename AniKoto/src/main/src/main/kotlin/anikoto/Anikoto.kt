package anikoto

import com.lagradost.cloudstream3.*

class Anikoto : MainAPI() {

    override var name = "Anikoto"
    override var mainUrl = "https://anikoto.cz"

    override val supportedTypes = setOf(
        TvType.Anime
    )

}
