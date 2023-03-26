package com.example.paginglibrary.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.paginglibrary.model.UnsplashImage

@Dao
interface UnsplashImageDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(images: List<UnsplashImage>)

    @Query("SELECT * FROM unsplash_image_table")
    fun getAllImages(): PagingSource<Int, UnsplashImage>    // <pageNo, img>

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()
}