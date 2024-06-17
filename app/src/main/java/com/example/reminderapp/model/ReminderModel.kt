package com.example.reminderapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "reminderdb")
@Parcelize
data class ReminderModel (
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    var title: String,
    var date: String,

    ): Parcelable