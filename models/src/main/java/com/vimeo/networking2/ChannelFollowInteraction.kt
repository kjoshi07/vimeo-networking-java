package com.vimeo.networking2

import com.vimeo.networking2.common.UpdatableInteraction
import com.vimeo.networking2.enums.ApiOptionsType
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.vimeo.networking2.enums.FollowType
import java.util.*

/**
 * Follow a channel interaction.
 */
@JsonClass(generateAdapter = true)
data class ChannelFollowInteraction(

    @Json(name = "added")
    override val added: Boolean? = null,

    @Json(name = "added_time")
    override val addedTime: Date? = null,

    @Json(name = "options")
    override val options: List<ApiOptionsType>? = null,

    @Json(name = "uri")
    override val uri: String? = null,

    /**
     * Whether the authenticated user is a moderator or subscriber.
     */
    @Json(name = "type")
    val type: FollowType = FollowType.UNKNOWN

): UpdatableInteraction
