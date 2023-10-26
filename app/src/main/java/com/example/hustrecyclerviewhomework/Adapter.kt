package com.example.hustrecyclerviewhomework

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.hustrecyclerviewhomework.Models.Affirmation

class MyAdapter(private val context : Context, private val dataSet : List<Affirmation>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return MyViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = context.resources.getString(item.myStrResourceId)
        holder.imgView.setImageResource(item.myImgResourceId)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView : TextView = itemView.findViewById(R.id.text)
        val imgView : ImageView = itemView.findViewById(R.id.image)
    }
}