package io.yeahx4.wve.entity

import io.yeahx4.wve.dto.player.PlayerInfoDto
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "player")
@Entity
class PlayerEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    val playerId: String,

    @Column(name = "username", unique = true, nullable = false)
    val username: String,

    @Column(name = "password", nullable = false)
    val password: String
) : TimeRecordEntity() {
    fun removePassword(): PlayerInfoDto {
        return PlayerInfoDto(
            this.playerId,
            this.username,
            this.createdAt,
            this.updatedAt,
        )
    }
}
