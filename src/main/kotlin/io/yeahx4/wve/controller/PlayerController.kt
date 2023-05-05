package io.yeahx4.wve.controller

import io.yeahx4.wve.dto.player.SavePlayerDto
import io.yeahx4.wve.service.PlayerService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/player")
class PlayerController(private val service: PlayerService) {
    @PostMapping("/")
    fun savePlayer(@RequestBody dto: SavePlayerDto): Boolean {
        return service.savePlayer(dto)
        // TODO More specific return value
    }
}
