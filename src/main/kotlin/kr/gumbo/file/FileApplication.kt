package kr.gumbo.file

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class FileApplication

fun main(args: Array<String>) {
	runApplication<FileApplication>(*args)
}
