package com.example.ellloenglish.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Script")
data class Script(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val audio: String,
    val name: String,
    val content: String
)