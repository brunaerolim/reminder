package com.example.reminderapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.reminderapp.model.ReminderModel

@Dao
interface ReminderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReminder (reminderModel: ReminderModel)

    @Update
    suspend fun updateReminder(reminderModel: ReminderModel)

    @Delete
    suspend fun deleteReminder (reminderModel: ReminderModel)

    @Query("SELECT * FROM reminder ORDER BY date DESC")
     fun getAll() : LiveData<List<ReminderModel>>
}
