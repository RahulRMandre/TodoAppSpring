package com.example.todoapp.resource

import com.example.todoapp.service.MessageService
import com.example.todoapp.model.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class MessageResource(val service: MessageService) {
    @GetMapping("/messages")
    fun index(): List<Message> = service.findMessages()

    @PostMapping("/messages")
    fun post(@RequestBody message: Message) {
        service.post(message)
    }
}