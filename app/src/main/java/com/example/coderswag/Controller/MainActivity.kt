package com.example.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import com.example.coderswag.Adapter.CategoryAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this,DataService.categories)

        val TAG = "WHAT"

        Log.d(TAG,"working")

        categorylistview.adapter = adapter

    }
}
