package com.example.gigih_final2.domain.Entity

data class VolcanoEntity (
    override val body: String,
    override val coordinates: Coordinates,
    override val imgUrl: String?,
    override val title: String,
    override val disasterType: String,
    override val date: String,
    val reportType: String,
        ):Entities()