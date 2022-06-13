package com.example.ellloenglish.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.ellloenglish.data.Database
import com.example.ellloenglish.data.Repository
import com.example.ellloenglish.data.models.Course
import com.example.ellloenglish.data.models.Grammar
import com.example.ellloenglish.data.models.Level
import com.example.ellloenglish.data.models.Script

class ViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: Repository
    private val getAllLevel: LiveData<List<Level>>
    private val getAllCourse: LiveData<List<Course>>
    private val getAllGrammar: LiveData<List<Grammar>>
    private val getAllScript: LiveData<List<Script>>

    init {
        val dao = Database.getInstance(application).dao()
        repository = Repository(dao)
        getAllLevel = repository.getAllLevel
        getAllCourse = repository.getAllCourse
        getAllGrammar = repository.getAllGrammar
        getAllScript = repository.getALlScript
    }
}