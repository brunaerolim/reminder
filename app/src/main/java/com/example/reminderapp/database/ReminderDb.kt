package com.example.reminderapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.reminderapp.model.ReminderModel


@Database(entities = [ReminderModel::class], version = 1)
abstract class ReminderDb : RoomDatabase() {

    abstract fun reminderDao(): ReminderDao

    companion object {

        private lateinit var INSTANCE: ReminderDb

        fun getDatabase(context: Context): ReminderDb {

            if (!::INSTANCE.isInitialized) {
                synchronized(ReminderDb::class.java) {
                    INSTANCE = databaseBuilder(
                        context,
                        ReminderDb::class.java,
                        "reminderdb"
                    )
                        .addMigrations(MIGRATION_1_2)
                        .allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }

        private val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL("DELETE FROM reminder")
            }
        }

    }
}