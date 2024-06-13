package com.example.reminderapp.database

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.reminderapp.model.ReminderModel
import kotlinx.coroutines.flow.Flow

interface ReminderDao {
    @Insert
    suspend fun insertReminder (reminderModel: ReminderModel)

    @Update
    suspend fun updateReminder(reminderModel: ReminderModel)

    @Delete
    suspend fun deleteReminder (reminderModel: ReminderModel)

    @Query("SELECT * FROM reminder ORDER BY id DESC")
    fun getAllReminders(): Flow<List<ReminderModel>>

}