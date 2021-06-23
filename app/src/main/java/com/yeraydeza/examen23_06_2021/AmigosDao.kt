package com.yeraydeza.examen23_06_2021

import androidx.room.*

@Dao
interface AmigosDao{
    @Insert
    fun insert(amigos: Amigos)
    @Update
    fun update(amigos: Amigos)
    @Delete
    fun delete(amigos: Amigos)
    @Query("SELECT * FROM Amigos")
    fun getAmigos(): List<Amigos>
}