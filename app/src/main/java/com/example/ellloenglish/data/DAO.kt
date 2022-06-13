package com.example.ellloenglish.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.ellloenglish.data.models.Course
import com.example.ellloenglish.data.models.Grammar
import com.example.ellloenglish.data.models.Level
import com.example.ellloenglish.data.models.Script

@Dao
interface DAO {

    @Query("select * from course")
    fun getAllCourse() :LiveData<List<Course>>

    @Query("select * from grammar")
    fun getAllGrammar() :LiveData<List<Grammar>>

    @Query("select * from level")
    fun getAlllevel() :LiveData<List<Level>>

    @Query("select * from script")
    fun getAllScript() :LiveData<List<Script>>

}