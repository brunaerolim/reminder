package com.example.reminderapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.reminderapp.model.ReminderModel
import com.example.reminderapp.repository.ReminderRepository
import kotlinx.coroutines.launch

class ReminderViewModel(app: Application, private val repository: ReminderRepository) : AndroidViewModel(app) {

    fun addReminder(reminderModel: ReminderModel) = viewModelScope.launch {
        repository.insertReminder(reminderModel)
    }

    fun updateReminder(reminderModel: ReminderModel) = viewModelScope.launch {
        repository.updateReminder(reminderModel)
    }

    fun deleteReminder(reminderModel: ReminderModel) = viewModelScope.launch {
        repository.deleteReminder(reminderModel)
    }

    fun getAllReminders() = repository.getAllReminders()
}
