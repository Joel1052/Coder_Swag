package com.example.coderswag.Controller

import android.content.res.Configuration
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.GridLayout
import com.example.coderswag.Adapter.ProductAdapter
import com.example.coderswag.R
import com.example.coderswag.Service.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val product = intent.getCharSequenceExtra(EXTRA_CATEGORY)
        productTextView.text = product

        var span = 3
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            span = 4
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720){
            span = 4
        }

        productRecyclelistview.layoutManager = GridLayoutManager(this,span)
        adapter=ProductAdapter(this,product.toString()
            ,DataService.productReturn(product.toString()))

        productRecyclelistview.adapter = adapter


    }
}
