package com.example.todoapp.service

import com.example.todoapp.model.TaskListTitle
import com.example.todoapp.repository.TaskTitleRepository
import org.springframework.stereotype.Service


    @Service
    class TaskListTitleService(val db: TaskTitleRepository) {

        fun findTaskListTitle(userId:String): List<TaskListTitle> = db.findTaskTitles(userId)

        fun post(taskListTitle: TaskListTitle){
            db.save(taskListTitle)
        }
    }
