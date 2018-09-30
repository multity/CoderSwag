package com.example.dtodorov.coderswag.Services

import com.example.dtodorov.coderswag.Model.Category
import com.example.dtodorov.coderswag.Model.Product

object DataService{
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18","hat1"),
            Product("Devslopes Hat Black", "$23","hat2"),
            Product("Devslopes Hat White", "$43","hat3"),
            Product("Devslopes Hat Snapback", "$9","hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$87","hoodie1"),
            Product("Devslopes Hoodie Red", "$123","hoodie2"),
            Product("Devslopes Hoodie White", "$25","hoodie3"),
            Product("Devslopes Hoodie Black", "$54","hoodie4")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Gray", "$29","shirt1"),
            Product("Devslopes Shirt Red", "$88","shirt2"),
            Product("Devslopes Shirt White", "$54","shirt3"),
            Product("Devslopes Shirt Black", "$65","shirt4"),
            Product("Devslopes Shirt Yellow", "$15","shirt5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }
    }
}