package io.yeahx4.wve.service.impl

import io.yeahx4.wve.dao.PlayerDao
import io.yeahx4.wve.dto.player.GetPlayerByIdDto
import io.yeahx4.wve.dto.player.PlayerInfoDto
import io.yeahx4.wve.dto.player.SavePlayerDto
import io.yeahx4.wve.entity.PlayerEntity
import io.yeahx4.wve.service.PlayerService
import org.springframework.stereotype.Service

@Service
class PlayerServiceImpl(private val dao: PlayerDao): PlayerService {
    override fun savePlayer(playerDto: SavePlayerDto): Boolean {
        // TODO Duplication Check
        // TODO Encryption

        dao.savePlayer(
            PlayerEntity("-1", playerDto.username, playerDto.password)
        )
        return true
    }

    override fun getPlayerById(playerDto: GetPlayerByIdDto): PlayerInfoDto? {
        return dao.getPlayerByUuid(playerDto.uuid)?.removePassword()
    }
}
