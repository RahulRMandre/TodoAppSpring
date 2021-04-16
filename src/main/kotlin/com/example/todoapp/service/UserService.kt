package com.example.todoapp.service
import com.example.todoapp.model.User
import com.example.todoapp.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(val db: UserRepository) {

    fun findUser(email:String,password:String) :User?{
        val user=db.findUserId(email, password)
        if(user!=null){return user[0]}
        return null
    }
    fun post(user: User){
        db.save(user)
    }


}
