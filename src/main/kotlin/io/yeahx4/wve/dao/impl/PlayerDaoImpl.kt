package io.yeahx4.wve.dao.impl

import io.yeahx4.wve.dao.PlayerDao
import io.yeahx4.wve.entity.PlayerEntity
import io.yeahx4.wve.repository.PlayerRepository
import io.yeahx4.wve.utils.JdbcUtils
import org.springframework.stereotype.Service

@Service
class PlayerDaoImpl(val playerRepo: PlayerRepository) : PlayerDao {
    override fun savePlayer(player: PlayerEntity): PlayerEntity {
        playerRepo.save(player)
        return player
    }

    override fun getPlayerByUuid(uuid: String): PlayerEntity? {
        return JdbcUtils.optToNullable(playerRepo.findById(uuid))
    }

    override fun getPlayerByUsername(name: String): PlayerEntity? {
        return JdbcUtils.optToNullable(playerRepo.findByUsername(name))
    }
}
