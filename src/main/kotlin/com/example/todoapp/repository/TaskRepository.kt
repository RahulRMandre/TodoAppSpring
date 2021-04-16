package com.example.todoapp.repository

import com.example.todoapp.model.Task
import com.example.todoapp.model.TaskListTitle
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface TaskRepository : CrudRepository<Task, String> {
    @Query(value = "select * from TASK  where TASK_LIST_ID=:TASK_LIST_ID")
    fun findTaskList(@Param("TASK_LIST_ID") taskListId:String):List<Task>

    @Query(value = "select * from TASK  where ID=:ID")
    fun findTask(@Param("ID") taskId:String):List<Task>
}