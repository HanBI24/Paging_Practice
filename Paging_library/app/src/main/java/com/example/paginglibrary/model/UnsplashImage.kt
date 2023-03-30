package com.example.paginglibrary.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paginglibrary.util.Constants.UNSPLASH_IMAGE_TABLE
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val urls: Urls,
    @SerialName("likes")
    val favorite: Int,
    @Embedded
    @SerialName("users")
    val user: User
)
