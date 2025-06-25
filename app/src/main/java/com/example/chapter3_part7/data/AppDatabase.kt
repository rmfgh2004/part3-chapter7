package com.example.chapter3_part7.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.chapter3_part7.data.dao.ContentDao
import com.example.chapter3_part7.model.ContentEntity

@Database(entities = [ContentEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun contentDao(): ContentDao
}