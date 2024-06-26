package com.example.reminderapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.reminderapp.model.ReminderModel
import com.example.reminderapp.repository.ReminderRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ReminderViewModel(app: Application, private val repository: ReminderRepository) : ViewModel() {

    private val _uiState = MutableStateFlow(LatestReminderUiState.Success(emptyList()))
    val uiState: StateFlow<LatestReminderUiState> get() = _uiState
    fun addReminder(reminderModel: ReminderModel) = viewModelScope.launch {
        repository.insertReminder(reminderModel)
    }

    fun updateReminder(reminderModel: ReminderModel) = viewModelScope.launch {
        repository.updateReminder(reminderModel)
    }

    fun deleteReminder(reminderModel: ReminderModel) = viewModelScope.launch {
        repository.deleteReminder(reminderModel)
    }

    fun getAllReminders() = viewModelScope.launch {
        repository.getAllReminders()
    }

    init {
        viewModelScope.launch {
            repository.getAllReminders()
                .collect() { reminders ->
                    _uiState.value = LatestReminderUiState.Success(reminders)
                }
        }
    }

    sealed class LatestReminderUiState {
        data class Success(val news: List<ReminderModel>) : LatestReminderUiState()
        data class Error(val exception: Throwable) : LatestReminderUiState()
    }
}