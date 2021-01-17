package com.hardik.stikerdemo.viewModel

import androidx.lifecycle.*
import com.hardik.stikerdemo.database.*
import com.hardik.stikerdemo.domainModel.StickerCategory
import com.hardik.stikerdemo.repository.CategoryRepository
import com.hardik.stikerdemo.repository.CategoryRepositoryImpl
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeViewModelNew() : ViewModel() {

    //private var _categoryAndPack = MutableLiveData<List<StickerCategorieAndPack>>()
    private var _categoryAndPack = MutableLiveData<List<StickerCategorieAndPack>>().apply {
        emptyList<List<StickerCategorieAndPack>>()
    }

    val categoryAndPack: LiveData<List<StickerCategory>> = Transformations.map(_categoryAndPack) {
        it.asStickerCategory()
    }

    private var categoryDao: CategoryDao = AppDataBaseNew.getInstance().stickerCategoryDao()
    private var categoryRepository: CategoryRepository

    init {
        categoryRepository = CategoryRepositoryImpl(categoryDao)
        loadHomeData()
    }

    private fun loadHomeData() {
        viewModelScope.launch {
            val result = categoryRepository.getCategoryAndPackFlow()
            if (result is Result.Success) {
                result.data.collect {
                    _categoryAndPack.value = it
                }
            }
        }
    }

}