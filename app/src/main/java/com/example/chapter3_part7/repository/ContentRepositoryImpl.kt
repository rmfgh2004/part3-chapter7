package com.example.chapter3_part7.repository

import com.example.chapter3_part7.data.dao.ContentDao
import com.example.chapter3_part7.model.ContentEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ContentRepositoryImpl @Inject constructor(
    private val contentDao: ContentDao
) : ContentRepository {

    override fun loadList(): Flow<List<ContentEntity>> {
        return contentDao.selectAll()
    }

    override suspend fun insert(item: ContentEntity) {
        contentDao.insert(item)
    }

}