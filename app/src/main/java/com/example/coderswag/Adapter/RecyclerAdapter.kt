package com.example.coderswag.Adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

class RecyclerAdapter(val contecxt : Context,val categories : List<Category>): RecyclerView.Adapter<RecyclerAdapter.Holder>() {

    //p0 = parent
    //p1 = position
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {

        Log.d("recycle","shiiiiiit")
        val categoryView = LayoutInflater.from(p0.context).inflate(R.layout.category_list_item,p0,false)
        return  Holder(categoryView)
    }

    override fun onBindViewHolder(p0: Holder, p1: Int) {


        p0.bindView(categories[p1],contecxt)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }


    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val categoryTextView = itemView.categorytxtv
        val catergoryImageView = itemView.categoryimgv

        fun bindView(category: Category,context: Context){


            categoryTextView.text = "${category.title}"
            val resourceId =context.resources.getIdentifier(category.image,"drawable",context.packageName)
            catergoryImageView.setImageResource(resourceId)

        }
    }

}