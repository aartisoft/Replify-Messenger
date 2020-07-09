package com.innovate.replify.feature.blocking.manager

data class BlockingManagerState(
    val blockingManager: Int = 0,
    val callControlInstalled: Boolean = false,
    val siaInstalled: Boolean = false
)
