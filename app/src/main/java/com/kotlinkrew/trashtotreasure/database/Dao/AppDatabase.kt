package com.kotlinkrew.trashtotreasure.database.Dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kotlinkrew.trashtotreasure.database.ModelDatabase

@Database(entities = [ModelDatabase::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao?
}