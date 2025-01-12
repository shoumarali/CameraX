package com.alishoumar.camerax

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.emptyFlow

class PhotosViewModel: ViewModel() {

    private val _bitmaps = MutableStateFlow<List<Bitmap>>(emptyList())

    val bitmaps  = _bitmaps.asStateFlow()

    fun onTakePhoto(bmp:Bitmap){
        _bitmaps.value += bmp
    }
}