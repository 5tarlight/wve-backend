package io.yeahx4.wve

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WveBackendApplication

fun main(args: Array<String>) {
    runApplication<WveBackendApplication>(*args)
}
