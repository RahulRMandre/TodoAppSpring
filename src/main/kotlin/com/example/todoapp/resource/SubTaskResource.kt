package com.example.todoapp.resource

import com.example.todoapp.model.SubTask
import com.example.todoapp.service.SubTaskService
import org.springframework.web.bind.annotation.*

@RestController
class SubTaskResource(val service: SubTaskService) {

    @GetMapping("/subTasks")
    fun index(taskId:String):List<SubTask>{
        return service.getSubTasks(taskId)
    }

    @PostMapping("/subTasks")
    fun post(@RequestBody subTask: SubTask){
        service.addSubTask(subTask)
    }

    @DeleteMapping("/subTasks")
    fun delete(id: String){
        service.deleteSubTask(id)
    }
}