package com.example.coderswag.Controller

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.coderswag.Adapter.CategoryAdapter
import com.example.coderswag.Adapter.RecyclerAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ategoryRecyclelistview.setBackgroundColor(Color.BLUE)
        categoryRecyclelistview.layoutManager = LinearLayoutManager(this)
        categoryRecyclelistview.adapter = RecyclerAdapter(this , DataService.categories as List<Category>)
        categoryRecyclelistview.setHasFixedSize(true)

    }
}
