package com.example.reminderapp.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.reminderapp.model.ReminderModel

@Dao
interface ReminderDao {

    @Insert
    suspend  fun insertReminder (reminderModel: ReminderModel): Long

    @Update
    suspend fun updateReminder(reminderModel: ReminderModel): Int

    @Delete
    suspend fun deleteReminder (reminderModel: ReminderModel)

    @Query("SELECT * FROM reminder WHERE date = date GROUP BY title")
    suspend fun getAll() : ReminderModel
}