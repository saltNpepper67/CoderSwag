package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITALS", "digitalgoodsimage")
    )

    val shirts = listOf(
        Product("Top Gun Shirt", "$15", "shirt1"),
        Product("NASA Shirt", "$19", "shirt2"),
        Product("NERD Shirt", "$12", "shirt3"),
        Product("Intel Shirt", "$17", "shirt4"),
        Product("AMD Shirt", "$14", "shirt5")
    )

    val hoodies = listOf(
        Product("Black Hoodie", "$26", "hoodie1"),
        Product("Windy Hoodie", "$23", "hoodie2"),
        Product("White Hoodie", "$29", "hoodie3"),
        Product("Long Hoodie", "$31", "hoodie4")
    )

    val hats = listOf(
        Product("Naval Hat", "$15", "hat1"),
        Product("Marine Hat", "$15", "hat2"),
        Product("Airforce Hat", "$15", "hat3"),
        Product("NYPD Hat", "$15", "hat4")
    )
}