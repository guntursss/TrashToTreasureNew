package com.kotlinkrew.trashtotreasure.database.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.kotlinkrew.trashtotreasure.database.ModelDatabase

@Dao
interface DatabaseDao {

    @Query("SELECT * FROM tbl_banksampah")
    fun getAll(): LiveData<List<ModelDatabase>>

    @Query("SELECT SUM(harga) FROM tbl_banksampah")
    fun getSaldo(): LiveData<Int>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(modelDatabases: ModelDatabase)

    @Query("DELETE FROM tbl_banksampah WHERE uid= :uid")
    fun deleteSingleData(uid: Int)

}