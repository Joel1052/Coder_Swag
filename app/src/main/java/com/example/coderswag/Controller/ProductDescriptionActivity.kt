package com.example.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import com.example.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_description.*

class ProductDescriptionActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_description)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)
        val category = intent.getCharSequenceExtra(EXTRA_CATEGORY)

        categoryTextv.text = category

        val resourceId = this.resources.getIdentifier(product.image,"drawable",this.packageName)
        productImagev.setImageResource(resourceId)
        productNamet.text = product.title
        productPricet.text = product.price


        buyNowButton.setOnClickListener {

            Toast.makeText(this,"You bought ${product.title} for ${product.price}",Toast.LENGTH_LONG).show()
        }






    }



}
