package com.example.todoapp.service

import com.example.todoapp.model.Task
import com.example.todoapp.repository.TaskRepository
import org.springframework.stereotype.Service

@Service
class TaskService(val db:TaskRepository) {
    fun findTaskList(parentId:String)= db.findTaskList(parentId)
    fun findTask(id:String)=db.findTask(id)
    fun post(task: Task){
        db.save(task)
    }
}