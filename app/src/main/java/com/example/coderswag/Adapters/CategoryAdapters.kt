package com.example.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import kotlin.coroutines.coroutineContext

/// this is our home made adapter, a calss extension of BaseAdapter
class CategoryAdapters(context: Context, categories: List<Category>) : BaseAdapter(){
    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //declare a View type variable named categoryVoew
        val categoryView : View // variable that is a View type
        val holder : ViewHolder
        //then initialize categoryView which evaluates to LayoutInflater
        // using methods from and inflate, where from is context and inflate is the object
        // to be inflated. the item to be inflated is category_list_item.xml which has
        // 2 widgets, a TextView and an ImageView

        if (convertView == null){
            holder = ViewHolder()
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item,null)
            holder.categoryImage = categoryView.findViewById(R.id.categoryimageViewHats)
            holder.categoryName = categoryView.findViewById(R.id.categoryNameHats)
            println("I run for the first time....")
            categoryView.tag = holder
        }else{
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("recycling ...................")
        }


        //after declaring the above xml file resource, create a variable declaration
        //for 2 widgets it contained, the textView and imageView.



        val category = categories[position]//category is equauak to categories array output form List<Category> class constructor

        val resourceID = context.resources.getIdentifier(category.image,"drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceID)
        holder.categoryName?.text = category.title // this line will decode the text title and display it

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

    private class ViewHolder{
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}