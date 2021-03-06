package com.example.todoapp.repository

import com.example.todoapp.model.User
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param

interface UserRepository: CrudRepository<User,String> {

    @Query(value = "select * from USERS u where u.email=:email AND u.password=:password ")
    fun findUserId(@Param("email") email:String,@Param("password")password:String):List<User>




}