package com.rezwan.imagesearch.api

import com.rezwan.imagesearch.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)

