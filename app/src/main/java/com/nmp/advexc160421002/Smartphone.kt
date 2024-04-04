package com.nmp.advexc160421002

import com.google.gson.annotations.SerializedName

data class Smartphone(
    val id: Int,
    val brand: String,
    val model: String,
    @SerializedName("release_year")
    val releaseYear: Int,
    @SerializedName("display_size")
    val displaySize: String,
    val specification: Specification,
    val colors: List<String>,
    val image: String
)

data class Specification(
    @SerializedName("main_camera")
    val mainCamera: String,
    @SerializedName("selfie_camera")
    val selfieCamera: String,
    val chipset: String,
    @SerializedName("RAM")
    val ram: String,
    val storage: String
)

