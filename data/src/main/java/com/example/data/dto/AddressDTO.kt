package com.example.data.dto

data class AddressDTO(
    val city: String,
    val geo: GeoDTO,
    val street: String,
    val suite: String,
    val zipcode: String
)