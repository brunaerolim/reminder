package com.example.reminderapp.repository

import androidx.annotation.WorkerThread
import com.example.reminderapp.database.ReminderDao
import com.example.reminderapp.model.ReminderModel


class ReminderRepository
    (private val reminderDao: ReminderDao) {

    val allReminders = reminderDao.getAll()
    @WorkerThread
    suspend fun insertReminder(reminderModel: ReminderModel) {
        reminderDao.insertReminder(reminderModel)
    }

    suspend fun updateReminder(reminderModel: ReminderModel) {
        reminderDao.updateReminder(reminderModel)
    }

    suspend fun deleteReminder(reminderModel: ReminderModel) {
        reminderDao.deleteReminder(reminderModel)
    }
}