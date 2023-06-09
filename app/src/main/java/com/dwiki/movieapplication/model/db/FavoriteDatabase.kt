package com.dwiki.movieapplication.model.db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(
    entities = [Favorite::class],
    version = 2,
    exportSchema = false
)
abstract class FavoriteDatabase:RoomDatabase() {
    abstract fun getFavoriteDao():FavoriteDAO
}