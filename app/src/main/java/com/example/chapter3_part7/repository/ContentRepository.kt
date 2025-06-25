package com.example.chapter3_part7.repository

import com.example.chapter3_part7.model.ContentEntity
import kotlinx.coroutines.flow.Flow

interface ContentRepository {

    fun loadList() : Flow<List<ContentEntity>>

    suspend fun insert(item: ContentEntity)

}