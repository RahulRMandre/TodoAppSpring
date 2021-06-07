package com.example.todoapp.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("TASK")
data class Task(
    @Id val id: String ?,
    @Column("TASK_LIST_ID")
    val taskListId:String,
    var title: String,
    var details: String="",
    @Column("COMPLETION_DATE")
    var completionDate: Long=0,
    @Column("FINISH")
    var finish: Int=0,
    @Column("CREATED_AT")
    var createdAt: Long=0,
)
