package com.example.reminderapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import com.example.reminderapp.model.ReminderModel


@Database(entities = [ReminderModel::class], version = 1)
abstract class ReminderDb : RoomDatabase() {

    abstract fun reminderDao(): ReminderDao


    companion object {
        @Volatile
        private var INSTANCE: ReminderDb? = null
        private val Lock = Any()


        operator fun invoke(context: Context) = INSTANCE ?: synchronized(Lock) {
            INSTANCE ?: createDatabase(context).also { INSTANCE = it }
        }

        private fun createDatabase(context: Context) =
            databaseBuilder(
                context.applicationContext,
                ReminderDb::class.java,
                "reminderdb"
            ).build()
    }
}