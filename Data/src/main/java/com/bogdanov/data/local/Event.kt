package com.bogdanov.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Event(
    @PrimaryKey val id: String,
    val creationDate: Date,
    val dueDate: Date,
    val encryptedDescription: String,
    val encryptedTitle: String,
    val image: String,
    val localImage: String?
)
