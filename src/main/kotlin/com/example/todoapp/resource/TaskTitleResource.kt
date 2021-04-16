package com.example.todoapp.resource

import com.example.todoapp.service.TaskListTitleService
import com.example.todoapp.model.TaskListTitle
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TaskTitleResource(val service: TaskListTitleService) {
    @GetMapping("/taskListTitle")
    fun index(userId:String) = service.findTaskListTitle(userId)

    @PostMapping("/taskListTitle")
    fun post(@RequestBody taskListTitle: TaskListTitle) {
        service.post(taskListTitle)
    }
}