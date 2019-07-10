package com.example.coderswag.Service

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

        val categories = listOf(

            Category("HATS","hatimage"),
            Category("HOODIES","hoodieimage"),
            Category("SHIRTS","shirtimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("HATS","hatimage"),
            Category("HOODIES","hoodieimage"),
            Category("SHIRTS","shirtimage"),
            Category("DIGITAL","digitalgoodsimage"),
            Category("HATS","hatimage"),
            Category("HOODIES","hoodieimage"),
            Category("SHIRTS","shirtimage"),
            Category("DIGITAL","digitalgoodsimage")
        )

      val hats = listOf(

          Product("Graphic Beanie","$18","hat1"),
          Product("Hat Black","$20","hat2"),
          Product("Hat White","$18","hat3"),
          Product("Hat Snapback","$22","hat4"),
          Product("Graphic Beanie","$18","hat1"),
          Product("Hat Black","$20","hat2"),
          Product("Hat White","$18","hat3"),
          Product("Hat Snapback","$22","hat4"),
          Product("Graphic Beanie","$18","hat1"),
          Product("Hat Black","$20","hat2"),
          Product("Hat White","$18","hat3"),
          Product("Hat Snapback","$22","hat4")

          )

    val hoodies = listOf(

        Product("Hoodie Grey","$28","hoodie1"),
        Product("Hoodie Red","$32","hoodie1"),
        Product("Grey Hoodie","$28","hoodie3"),
        Product("Black Hoodie","$32","hoodie4"),
        Product("Hoodie Grey","$28","hoodie1"),
        Product("Hoodie Red","$32","hoodie1"),
        Product("Grey Hoodie","$28","hoodie3"),
        Product("Black Hoodie","$32","hoodie4"),
        Product("Hoodie Grey","$28","hoodie1"),
        Product("Hoodie Red","$32","hoodie1"),
        Product("Grey Hoodie","$28","hoodie3"),
        Product("Black Hoodie","$32","hoodie4")

    )
    val shirts = listOf(

        Product("Shirt Black","$18","shirt1"),
        Product("Badge Light Grey","$20","shirt2"),
        Product("Logo Shirt Red","$22","shirt3"),
        Product("Hustle","$22","shirt4"),
        Product("Hickfilp Studios","$18","shirt5"),
        Product("Shirt Black","$18","shirt1"),
        Product("Badge Light Grey","$20","shirt2"),
        Product("Logo Shirt Red","$22","shirt3"),
        Product("Hustle","$22","shirt4"),
        Product("Hickfilp Studios","$18","shirt5"),
        Product("Shirt Black","$18","shirt1"),
        Product("Badge Light Grey","$20","shirt2"),
        Product("Logo Shirt Red","$22","shirt3"),
        Product("Hustle","$22","shirt4"),
        Product("Hickfilp Studios","$18","shirt5")


    )

    val digitalgoods = listOf<Product>()

    fun productReturn(product : String):List<Product>{

        return when(product){
            "HATS"-> hats
            "HOODIES"-> hoodies
            "SHIRTS"-> shirts
            else -> digitalgoods

        }
    }
}