package io.yeahx4.wve.dto.player

import jakarta.validation.constraints.NotNull

data class SavePlayerDto(
    @NotNull
    val username: String,
    @NotNull
    val password: String
)
