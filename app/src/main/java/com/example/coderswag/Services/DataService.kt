package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITALS", "digitalgoodsimage")
    )
    val shirts = listOf(
        Product("Topgun Shirt","$15","shirt1"),
        Product("NYPD Shirt","$15","shirt2"),
        Product("Airforce Shirt","$15","shirt3"),
        Product("NYFD Shirt","$15","shirt4"),
        Product("Texan Shirt","$15","shirt5")
    )
    val hoodies = listOf(
        Product("Topgun Hoodie","$25", "hoodie1"),
        Product("NYPD Hoodie","$25", "hoodie2"),
        Product("Airforce Hoodie","$25", "hoodie3"),
        Product("NYFD Hoodie","$25", "hoodie4")
    )
    val hats = listOf(
        Product("Topgun hat","$10", "hat1"),
        Product("NYPD hat","10", "hat2"),
        Product("Airforce hat","$10", "hat3"),
        Product("NYFD hat","$10", "hat4")
    )
}