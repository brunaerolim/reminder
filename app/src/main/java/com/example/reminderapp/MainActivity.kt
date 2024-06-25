package com.example.reminderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.reminderapp.database.ReminderDb
import com.example.reminderapp.repository.ReminderRepository
import com.example.reminderapp.viewmodel.ReminderViewModel
import com.example.reminderapp.viewmodel.ReminderViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var reminderViewModel: ReminderViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}