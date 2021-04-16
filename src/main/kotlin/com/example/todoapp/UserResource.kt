package com.example.todoapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserResource(val service: UserService) {
    @GetMapping("/users")
    fun index(email:String,password:String) = service.findUser(email,password )

    @PostMapping("/users")
    fun post(@RequestBody user: User) {
        service.post(user)
    }
}