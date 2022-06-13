package com.example.ellloenglish.data.connectdb

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import com.example.ellloenglish.util.AppData
import java.io.FileOutputStream
import java.io.IOException

class ConnectDB(private val context:Context) {
    fun openDatabase(): SQLiteDatabase {
        val dbFile = context.getDatabasePath(AppData.DATABASE_NAME)

        if (!dbFile.exists()) {
            try {
                val checkDB = context.openOrCreateDatabase(AppData.DATABASE_NAME, Context.MODE_PRIVATE, null)

                checkDB?.close()
                copyDatabase()
            } catch (e: IOException) {
                throw RuntimeException("Error creating source database", e)
            }

        }
        return SQLiteDatabase.openDatabase(dbFile.path, null, SQLiteDatabase.OPEN_READWRITE)
    }


    private fun copyDatabase() {
        val dbFile = context.getDatabasePath(AppData.DB_PATH)
        val assetdb = context.assets.open(AppData.DB_PATH)
        val currentDB = FileOutputStream(dbFile)

        val buffer = ByteArray(1024)
        while (assetdb.read(buffer) > 0) {
            currentDB.write(buffer)
            Log.d("#DB", "Copying " + buffer.toString())
        }

        currentDB.flush()
        currentDB.close()
        assetdb.close()

    }
}