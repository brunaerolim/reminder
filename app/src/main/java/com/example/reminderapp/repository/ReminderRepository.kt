package com.example.reminderapp.repository

import com.example.reminderapp.database.ReminderDao
import com.example.reminderapp.database.ReminderDb
import com.example.reminderapp.model.ReminderModel


class ReminderRepository
    (private val db: ReminderDb) {

    suspend fun insertReminder(reminderModel: ReminderModel) =
        db.reminderDao().insertReminder(reminderModel)

    suspend fun updateReminder(reminderModel: ReminderModel) =
        db.reminderDao().updateReminder(reminderModel)

    suspend fun deleteReminder(reminderModel: ReminderModel) =
        db.reminderDao().deleteReminder(reminderModel)

    fun getAll() = db.reminderDao().getAll()
}