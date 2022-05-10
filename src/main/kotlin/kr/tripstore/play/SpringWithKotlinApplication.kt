package kr.tripstore.play

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@EnableJpaRepositories
class SpringWithKotlinApplication

fun main(args: Array<String>) {
	runApplication<SpringWithKotlinApplication>(*args)
}
