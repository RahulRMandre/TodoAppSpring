package com.example.todoapp

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("TASK_LIST_TITLE")
data class TaskListTitle(
    @Id val id: String?,
    @Column("TASK_LIST_TITLE")
    val taskListTitle: String,
    @Column("USER_ID")
    val userId:String,
)
