package dev.sauve.happening

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HappeningApplication

fun main(args: Array<String>) {
	runApplication<HappeningApplication>(*args) {
    setBannerMode(Banner.Mode.CONSOLE)
  }
}
