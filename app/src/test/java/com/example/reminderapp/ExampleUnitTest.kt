package com.example.reminderapp

import com.example.reminderapp.model.ReminderModel
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun insertReminder() {
        val reminder = ReminderModel(1, "Novo título", "21/10/2021")
        return assertEquals(1, reminder.id)
        arrayListOf<R>()
    }
}