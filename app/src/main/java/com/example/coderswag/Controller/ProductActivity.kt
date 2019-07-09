package com.example.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_CAT
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val title = intent.getCharSequenceExtra(EXTRA_CAT)
        producttxt.text = title
    }
}
