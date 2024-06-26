package com.example.reminderapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.reminderapp.model.ReminderModel
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ReminderUnitTest {

    @Test
    fun testReminderModel() {
        val reminderModel = ReminderModel(1, "Title", "Date")
        assertEquals(1, reminderModel.id)
        assertEquals("Title", reminderModel.title)
        assertEquals("Date", reminderModel.date)
    }



}