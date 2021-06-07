package com.example.todoapp.service

import com.example.todoapp.model.SubTask
import com.example.todoapp.repository.SubTaskRepository
import org.springframework.stereotype.Service

@Service
class SubTaskService(val db:SubTaskRepository) {

   fun getSubTasks(taskId:String) :List<SubTask>{
       val res=db.findSubTaskList(taskId)
       return res
   }

   fun addSubTask(subTask: SubTask){
       db.save(subTask)
   }

   fun deleteSubTask(id:String){
       db.deleteSubTask(id)
   }



}
