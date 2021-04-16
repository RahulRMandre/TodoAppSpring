package com.example.todoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class TodoappApplication

fun main(args: Array<String>) {
	runApplication<TodoappApplication>(*args)
}

/*@RestController
class MessageResource {
	@GetMapping
	fun index(): List<Message> = listOf(
			Message("1", "Hello!"),
			Message("2", "Bonjour!"),
			Message("3", "Privet!"),
	)
}*/


