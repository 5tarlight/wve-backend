package io.yeahx4.wve.repository

import io.yeahx4.wve.entity.PlayerEntity
import java.util.Optional
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository: JpaRepository<PlayerEntity, String> {
    fun findByUsername(username: String): Optional<PlayerEntity>
}
