package com.example.todoapp.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("USERS")
data class User(@Id val id:String?,val email:String,val name:String,val password:String)

