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
        val reminder = ReminderModel(1, "Title", "Date")
        assertEquals(1, reminder.id)
        assertEquals("Titulo teste", reminder.title)
        assertEquals("24/07/2021", reminder.date)
    }
}