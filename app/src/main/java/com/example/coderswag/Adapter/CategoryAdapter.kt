package com.example.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryAdapter(context : Context,categories : List<Category> ): BaseAdapter() {

        val context = context
        val categories = categories


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView : View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)

        val categoryimv : ImageView = categoryView.findViewById(R.id.categoryimgv)
        val categorytxt : TextView = categoryView.findViewById(R.id.categorytxt)

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image,"drawable",context.packageName)

        categoryimv.setImageResource(resourceId)
        categorytxt.text = category.title


        return categoryView
    }

    override fun getItem(position: Int): Any {

        return categories[position]
    }

    override fun getItemId(position: Int): Long {

    return 0
    }

    override fun getCount(): Int {

    return categories.count()
    }
}