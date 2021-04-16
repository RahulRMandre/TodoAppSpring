package com.example.todoapp.resource

import com.example.todoapp.model.Task
import com.example.todoapp.service.TaskService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TaskResource(val service:TaskService) {
    @GetMapping("/tasks")
    fun index(taskListId:String)=service.findTaskList(taskListId)

    @GetMapping("/task")
    fun findTask(taskId:String)=service.findTask(taskId)

   @PostMapping("/tasks")
   fun post(@RequestBody task: Task){
       service.post(task)
   }
}