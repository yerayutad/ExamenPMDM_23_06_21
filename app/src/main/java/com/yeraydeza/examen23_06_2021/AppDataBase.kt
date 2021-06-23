package com.yeraydeza.examen23_06_2021

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Amigos::class], version = 1)
abstract class AppDataBase: RoomDatabase(){
    abstract fun amigosDao(): AmigosDao

    companion object{
        private var INSTANCE: AppDataBase? = null

        fun getInstance(context: Context): AppDataBase{
            if (INSTANCE == null){
               INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java, "amigos"
                ).build()
            }
            return INSTANCE!!
        }
    }
}