package br.springkt.temporest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class TempoRestApplication

fun main(args: Array<String>) {
	runApplication<TempoRestApplication>(*args)
}
