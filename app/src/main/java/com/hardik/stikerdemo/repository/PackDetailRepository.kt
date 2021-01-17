package com.hardik.stikerdemo.repository

import androidx.lifecycle.LiveData
import com.hardik.stikerdemo.database.Result
import com.hardik.stikerdemo.database.StickerEntity
import com.hardik.stikerdemo.database.StickerPackAndSticker
import com.hardik.stikerdemo.database.StickerPackEntity

interface PackDetailRepository {
    fun getStickerPackLiveData(): Result<LiveData<List<StickerPackEntity>>>
    suspend fun getStickerPack(): Result<List<StickerPackEntity>>
    suspend fun getStickerPackBySearch(searchTerm: List<String>): Result<List<StickerPackEntity>>
    suspend fun getStickerPackAndSticker(): Result<List<StickerPackAndSticker>>
    suspend fun getStickerPackAndStickerByIdentifier(identifier: String): Result<StickerPackAndSticker>
    suspend fun getStickerPackByIdentifier(identifier: String): Result<StickerPackEntity>

    suspend fun getStickerByIdentifier(packIdentifier: String): Result<List<StickerEntity>>
    suspend fun getStickerByIdentifierLiveData(packIdentifier: String): Result<LiveData<List<StickerEntity>>>
}