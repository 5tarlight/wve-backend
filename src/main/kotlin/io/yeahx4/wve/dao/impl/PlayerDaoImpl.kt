package io.yeahx4.wve.dao.impl

import io.yeahx4.wve.dao.PlayerDao
import io.yeahx4.wve.entity.PlayerEntity
import io.yeahx4.wve.repository.PlayerRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.stereotype.Service

@Service
class PlayerDaoImpl(val playerRepo: PlayerRepository) : PlayerDao {
    override fun savePlayer(player: PlayerEntity): PlayerEntity {
        playerRepo.save(player)
        return player
    }

    override fun getPlayerByUuid(uuid: String): PlayerEntity? {
        return try {
            playerRepo.getReferenceById(uuid)
        } catch (e: EntityNotFoundException) {
            null
        }
    }

    override fun getPlayerByName(name: String): PlayerEntity? {
        val player = playerRepo.findByUsername(name)

        return if (player.isEmpty) {
            null
        } else {
            player.get()
        }
    }
}
