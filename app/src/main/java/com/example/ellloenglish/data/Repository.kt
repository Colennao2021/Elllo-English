package com.example.ellloenglish.data

import androidx.lifecycle.LiveData
import com.example.ellloenglish.data.models.Course
import com.example.ellloenglish.data.models.Grammar
import com.example.ellloenglish.data.models.Level
import com.example.ellloenglish.data.models.Script

class Repository(private val dao: DAO) {

    val getAllLevel: LiveData<List<Level>> = dao.getAlllevel()

    val getAllCourse: LiveData<List<Course>> = dao.getAllCourse()

    val getAllGrammar: LiveData<List<Grammar>> = dao.getAllGrammar()

    val getALlScript: LiveData<List<Script>> = dao.getAllScript()

}