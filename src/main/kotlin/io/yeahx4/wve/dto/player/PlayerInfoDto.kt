package io.yeahx4.wve.dto.player

import jakarta.validation.constraints.NotNull
import java.time.LocalDateTime

data class PlayerInfoDto(
    @NotNull
    val uuid: String,
    @NotNull
    val username: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime
)
