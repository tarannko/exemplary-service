package ru.tarannko.exemplary_service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ExemplaryServiceApplication

fun main(args: Array<String>) {
	runApplication<ExemplaryServiceApplication>(*args)
}
