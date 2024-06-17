package com.example.reminderapp.repository

import com.example.reminderapp.database.ReminderDao
import com.example.reminderapp.model.ReminderModel


class ReminderRepository(private val reminderDao: ReminderDao) {

    suspend fun insertReminder(reminderModel: ReminderModel) = reminderDao.insertReminder(reminderModel)
    suspend fun updateReminder(reminderModel: ReminderModel) = reminderDao.updateReminder(reminderModel)
    suspend fun deleteReminder(reminderModel: ReminderModel) = reminderDao.deleteReminder(reminderModel)

    fun getAll() = reminderDao.getAll()
}