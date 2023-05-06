package io.yeahx4.wve.controller

import io.yeahx4.wve.dto.player.GetPlayerByIdDto
import io.yeahx4.wve.dto.player.GetPlayerByUsernameDto
import io.yeahx4.wve.dto.player.PlayerInfoDto
import io.yeahx4.wve.dto.player.SavePlayerDto
import io.yeahx4.wve.service.PlayerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/player")
class PlayerController(private val service: PlayerService) {
    @PostMapping
    fun savePlayer(@RequestBody dto: SavePlayerDto): Boolean {
        return service.savePlayer(dto)
        // TODO More specific return value
    }

    @GetMapping("/uuid/{uuid}")
    fun getPlayerById(@PathVariable uuid: String): PlayerInfoDto? {
        return service.getPlayerById(GetPlayerByIdDto(uuid))
    }

    @GetMapping("/username/{username}")
    fun getPlayerByUsername(@PathVariable username: String): PlayerInfoDto? {
        return service.getPlayerByUsername(GetPlayerByUsernameDto(username))
    }
}
