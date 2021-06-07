package com.example.todoapp.model
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("SUBTASK")
data class SubTask(
    @Column("ID")
    @Id val id: String?,
    @Column("TASK_ID")
    var taskId:String,
    @Column("FINISH")
    var finish: Int,
    @Column("TITLE")
    var title: String,
)