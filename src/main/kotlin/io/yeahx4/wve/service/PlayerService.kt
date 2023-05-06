package io.yeahx4.wve.service

import io.yeahx4.wve.dto.player.GetPlayerByIdDto
import io.yeahx4.wve.dto.player.GetPlayerByUsernameDto
import io.yeahx4.wve.dto.player.PlayerInfoDto
import io.yeahx4.wve.dto.player.SavePlayerDto

interface PlayerService {
    fun savePlayer(playerDto: SavePlayerDto): Boolean
    fun getPlayerById(playerDto: GetPlayerByIdDto): PlayerInfoDto?
    fun getPlayerByUsername(playerDto: GetPlayerByUsernameDto): PlayerInfoDto?
}
