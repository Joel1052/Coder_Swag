package com.example.coderswag.Adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coderswag.Controller.ProductDescriptionActivity
import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import com.example.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.product_list_item.view.*

class ProductAdapter(val cContext : Context,val cat : String,val products : List<Product> ) : RecyclerView.Adapter<ProductAdapter.Holder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {

        val layoutView = LayoutInflater.from(cContext).inflate(R.layout.product_list_item,p0,false)
        return Holder(layoutView)
    }

    override fun getItemCount(): Int {

        return products.count()
    }

    override fun onBindViewHolder(p0: Holder, p1: Int) {

        p0.bindView(cContext,cat,products.get(p1))
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val productImageView = itemView.productImageView
        val productNameView = itemView.productNameView
        val productPriceView = itemView.productPriceView

        fun bindView(cContext: Context,cat : String,product : Product){

            val resourceId = cContext.resources.getIdentifier(product.image,"drawable",cContext.packageName)
            productImageView.setImageResource(resourceId)
            productNameView.text = product.title
            productPriceView.text = product.price

            itemView.setOnClickListener {
                val productIntent = Intent(cContext,ProductDescriptionActivity::class.java)
                productIntent.putExtra(EXTRA_PRODUCT,product)
                productIntent.putExtra(EXTRA_CATEGORY,cat)
                cContext.startActivity(productIntent)
            }
        }

    }


}