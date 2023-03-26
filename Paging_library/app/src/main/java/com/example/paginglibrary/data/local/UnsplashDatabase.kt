package com.example.paginglibrary.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.paginglibrary.data.local.dao.UnsplashImageDao
import com.example.paginglibrary.data.local.dao.UnsplashRemoteKeysDao
import com.example.paginglibrary.model.UnsplashImage
import com.example.paginglibrary.model.UnsplashRemoteKeys

@Database(
    entities = [UnsplashImage::class, UnsplashRemoteKeys::class],
    version = 1
)
abstract class UnsplashDatabase : RoomDatabase() {
    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao
}