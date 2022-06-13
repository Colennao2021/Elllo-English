package com.example.ellloenglish.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "course")
data class Course(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val level: String,
    val name: String
)