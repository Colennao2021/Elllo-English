package com.example.ellloenglish.data


import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.ellloenglish.data.models.Course
import com.example.ellloenglish.data.models.Grammar
import com.example.ellloenglish.data.models.Level
import com.example.ellloenglish.data.models.Script
import com.example.ellloenglish.util.AppData

@androidx.room.Database(
    entities = [Course::class, Grammar::class, Level::class, Script::class],
    version = 1
)
abstract class Database : RoomDatabase() {

    abstract fun dao(): DAO

    companion object {
        @Volatile
        private var instance: Database? = null

        fun getInstance(context: Context): Database{
            if (instance != null) {
                return instance as Database
            }
            synchronized(this) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    Database::class.java,
                    AppData.DATABASE_NAME
                ).build()
                return instance as Database
            }
        }
    }

}