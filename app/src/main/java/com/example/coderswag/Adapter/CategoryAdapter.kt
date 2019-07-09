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

        val rowlayout : View

        if(convertView == null){

            val layoutinflate = LayoutInflater.from(context)
             rowlayout = layoutinflate.inflate(R.layout.category_list_item,parent , false)

            val catergorytxtv = rowlayout.findViewById<TextView>(R.id.categorytxtv)
            val categoryimgv = rowlayout.findViewById<ImageView>(R.id.categoryimgv)
            val holder = viewholder(catergorytxtv,categoryimgv)
            rowlayout.tag = holder
        }else {
            rowlayout = convertView
        }



        val holder = rowlayout.tag as viewholder
        holder.nameTextView.text = categories.get(position).title

        val resourceId = context.resources.getIdentifier(categories.get(position).image,"drawable",context.packageName)
        holder.imageView.setImageResource(resourceId)


        return rowlayout
    }

    override fun getItem(position: Int): Any {

        return categories[position]
    }

    override fun getItemId(position: Int): Long {

    return position.toLong()
    }

    override fun getCount(): Int {

    return categories.count()
    }

    private class viewholder(val nameTextView : TextView , val imageView : ImageView)
}