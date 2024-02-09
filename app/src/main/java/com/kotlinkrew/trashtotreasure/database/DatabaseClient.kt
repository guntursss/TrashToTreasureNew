package com.kotlinkrew.trashtotreasure.database

import android.content.Context
import androidx.room.Room
import com.kotlinkrew.trashtotreasure.database.Dao.AppDatabase

class DatabaseClient private constructor(context: Context) {

    var appDatabase: AppDatabase

    companion object {
        private var mInstance: DatabaseClient? = null

        fun getInstance(context: Context): DatabaseClient? {
            if (mInstance == null) {
                mInstance = DatabaseClient(context)
            }
            return mInstance
        }
    }

    init {
        appDatabase = Room.databaseBuilder(context, AppDatabase::class.java, "banksampah_db")
            .fallbackToDestructiveMigration()
            .build()
    }
}