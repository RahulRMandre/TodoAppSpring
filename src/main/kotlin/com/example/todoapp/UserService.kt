package com.example.todoapp
import org.springframework.stereotype.Service

@Service
class UserService(val db: UserRepository) {

    fun findUser(email:String,password:String) = db.findUserId(email,password)

    fun post(user: User){
        db.save(user)
    }


}
