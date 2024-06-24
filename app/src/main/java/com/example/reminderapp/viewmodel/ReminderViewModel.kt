package com.example.reminderapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.example.reminderapp.model.ReminderModel
import com.example.reminderapp.repository.ReminderRepository
import kotlinx.coroutines.launch

class ReminderViewModel(private val repository: ReminderRepository) : ViewModel() {

    val allReminders: LiveData<List<ReminderModel>> = repository.allReminders.asLiveData()

    fun insertReminder(reminderModel: ReminderModel) = viewModelScope.launch {
        repository.insertReminder(reminderModel)
    }

    fun updateReminder(reminderModel: ReminderModel) = viewModelScope.launch {
        repository.updateReminder(reminderModel)
    }

    fun deleteReminder(reminderModel: ReminderModel) = viewModelScope.launch {
        repository.deleteReminder(reminderModel)
    }
}

class ReminderViewModelFactory(private val repository: ReminderRepository) : ViewModelProvider.Factory {
     fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ReminderViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ReminderViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}