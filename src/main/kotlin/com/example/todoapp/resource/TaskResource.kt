package com.example.todoapp.resource

import com.example.todoapp.model.Task
import com.example.todoapp.service.TaskService
import org.springframework.web.bind.annotation.*

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
   @DeleteMapping("/tasks")
   fun delete(task: Task){
       service.delete(task)
   }
}