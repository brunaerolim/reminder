package com.example.reminderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reminderapp.database.ReminderDao

class MainActivity : AppCompatActivity() {
    private lateinit var reminderDao: ReminderDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}