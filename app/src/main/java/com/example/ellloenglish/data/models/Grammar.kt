package com.example.ellloenglish.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "grammar")
data class Grammar(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val point: String,
    val title: String,
    val example: String
)