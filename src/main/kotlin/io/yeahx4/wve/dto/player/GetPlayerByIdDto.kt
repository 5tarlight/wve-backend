package io.yeahx4.wve.dto.player

import jakarta.validation.constraints.NotNull

data class GetPlayerByIdDto(
    @NotNull
    val uuid: String
)
