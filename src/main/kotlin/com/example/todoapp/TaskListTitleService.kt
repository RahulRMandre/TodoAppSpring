package com.example.todoapp

import org.springframework.stereotype.Service


    @Service
    class TaskListTitleService(val db: TaskTitleRepository) {

        fun findTaskListTitle(userId:String): List<TaskListTitle> = db.findTaskTitles(userId)

        fun post(taskListTitle: TaskListTitle){
            db.save(taskListTitle)
        }
    }
