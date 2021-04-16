package com.example.todoapp.service

import com.example.todoapp.model.Message
import com.example.todoapp.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }
}