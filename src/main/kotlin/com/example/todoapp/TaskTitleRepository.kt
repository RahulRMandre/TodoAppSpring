package com.example.todoapp

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface TaskTitleRepository : CrudRepository<TaskListTitle, String> {
        @Query(value = "select * from TASK_LIST_TITLE  where USER_ID=:USER_ID")
        fun findTaskTitles(@Param("USER_ID") userId:String):List<TaskListTitle>
}