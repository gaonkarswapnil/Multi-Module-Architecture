package com.example.data.mapper

import com.example.data.dto.AddressDTO
import com.example.data.dto.CompanyDTO
import com.example.data.dto.GeoDTO
import com.example.data.dto.UsersResponseDTO
import com.example.domain.model.Address
import com.example.domain.model.Company
import com.example.domain.model.Geo
import com.example.domain.model.UserResponse

fun UsersResponseDTO.toDomain(): UserResponse{
    return UserResponse(
        address = this.address.toDomain(),
        company = this.company.toDomain(),
        email = this.email,
        id = this.id,
        name = this.name,
        phone = this.phone,
        username = this.username,
        website = this.website
    )
}

fun AddressDTO.toDomain(): Address{
    return Address(
        city = city,
        geo = geo.toDomain(),
        street = street,
        suite = suite,
        zipcode = zipcode
    )
}

fun GeoDTO.toDomain(): Geo{
    return Geo(
        lat = lat,
        lng = lng
    )
}

fun CompanyDTO.toDomain(): Company{
    return Company(
        bs = bs,
        catchPhrase = catchPhrase,
        name = name
    )
}