package com.vimeo.networking2

import com.vimeo.networking2.common.Interaction

/**
 * Interaction with options and uri information.
 */
data class BasicInteraction(

    override val options: List<String>? = null,

    override val uri: String? = null

): Interaction
