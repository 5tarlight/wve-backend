package io.yeahx4.wve.dao

import io.yeahx4.wve.entity.PlayerEntity

interface PlayerDao {
    fun savePlayer(player: PlayerEntity): PlayerEntity
    fun getPlayerByUuid(uuid: String): PlayerEntity?
    fun getPlayerByUsername(name: String): PlayerEntity?
}
