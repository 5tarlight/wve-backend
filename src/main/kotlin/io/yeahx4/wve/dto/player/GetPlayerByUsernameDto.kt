package io.yeahx4.wve.dto.player

import jakarta.validation.constraints.NotNull

data class GetPlayerByUsernameDto (
    @NotNull
    val username: String
)
