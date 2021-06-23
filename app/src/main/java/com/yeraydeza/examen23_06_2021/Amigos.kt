package com.yeraydeza.examen23_06_2021

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Blob
import java.sql.Date

@Entity
data class Amigos(
    @PrimaryKey
    val name: String,
    val surname: String,
    val email: String,
    val photo: String,
    val date: String,
    val observ: String
)