package com.example.coderswag.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*
import org.w3c.dom.Text

class CategoryAdapter(val categories : List<Category>) : BaseAdapter(){


    override fun getView(position: Int, convertView: View, parent: ViewGroup?): View {

        val categoryView : View

        if(convertView == null){
            val inflateLayout = LayoutInflater.from(parent?.context)
            categoryView = inflateLayout.inflate(R.layout.category_list_item,parent, false)

            val categoryTextView = categoryView.categorytxtv
            val categoryImageView = categoryView.categoryimgv
            val holder = viewHolder(categoryTextView,categoryImageView)

            categoryView.tag = holder


        }else{
            categoryView = convertView
        }

        val holder = categoryView.tag as viewHolder
         holder.categoryTextView?.text = "${categories[position].title}"
        val resourceId = parent?.resources?.getIdentifier(categories[position].image,"drawable",parent?.context?.packageName)
        holder.categoryImageView?.setImageResource(resourceId as Int)

        return categoryView

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


    inner class viewHolder(val categoryTextView : TextView? = null ,val categoryImageView : ImageView? = null){

    }
}