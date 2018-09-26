package com.example.dtodorov.coderswag.Services

import com.example.dtodorov.coderswag.Model.Category
import com.example.dtodorov.coderswag.Model.Product

class DataService{
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18","hat01"),
            Product("Devslopes Hat Black", "$23","hat02"),
            Product("Devslopes Hat White", "$43","hat03"),
            Product("Devslopes Hat Snapback", "$9","hat04")
    )

    val hodies = listOf(
            Product("Devslopes Hoodie Gray", "$87","hodie01"),
            Product("Devslopes Hoodie Red", "$123","hodie02"),
            Product("Devslopes Hoodie White", "$25","hodie03"),
            Product("Devslopes Hoodie Black", "$54","hodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Gray", "$29","shirt01"),
            Product("Devslopes Shirt Red", "$88","shirt02"),
            Product("Devslopes Shirt White", "$54","shirt03"),
            Product("Devslopes Shirt Black", "$65","shirt04"),
            Product("Devslopes Shirt Yellow", "$15","shirt05")
    )
}