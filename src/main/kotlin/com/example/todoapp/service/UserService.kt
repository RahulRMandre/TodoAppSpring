package com.example.todoapp.service
import com.example.todoapp.model.User
import com.example.todoapp.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val db: UserRepository) {

    fun findUser(email:String,password:String) = db.findUserId(email,password)

    fun post(user: User){
        db.save(user)
    }


}
