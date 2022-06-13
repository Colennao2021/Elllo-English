package com.example.ellloenglish.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Level")
data class Level(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String,
    val image: String
)
