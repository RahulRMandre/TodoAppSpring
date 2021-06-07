package com.example.todoapp.repository

import com.example.todoapp.model.SubTask
import com.example.todoapp.model.Task
import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional
interface SubTaskRepository: CrudRepository<SubTask, String> {

    @Query(value = "select * from SUBTASK  where TASK_ID=:TASK_ID")
    fun findSubTaskList(@Param("TASK_ID") taskId:String):List<SubTask>

    @Query(value = "select * from TASK  where ID=:ID")
    fun findTask(@Param("ID") taskId:String):List<Task>

    @Modifying
    @Query("DELETE FROM SUBTASK WHERE ID=:ID")
    fun deleteSubTask(@Param("ID") id: String)


}