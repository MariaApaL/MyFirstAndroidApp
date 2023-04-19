package com.apa.accenture.myfirstapp.ui.view.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.apa.accenture.myfirstapp.data.CatRepository
import com.apa.accenture.myfirstapp.data.network.model.CatResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchCatViewModel @Inject constructor(
    private val catRepository: CatRepository
) : ViewModel() {

    private val catList = MutableLiveData<List<CatResponse>?>()
    private val isLoading = MutableLiveData<Boolean>()

    suspend fun searchCat(catBreed: String) {
        viewModelScope.launch{
            CoroutineScope(Dispatchers.IO).launch{
                isLoading.postValue(true)


            }
        }
//        if (catBreed.isNotBlank()) {
//            val response = catRepository.getCats(catBreed)
//            if (response != null) {
//                catList.postValue(response)
//            } else {
//                catList.postValue(emptyList())
//            }
//        } else {
//            catList.postValue(emptyList())
//        }
    }

}

