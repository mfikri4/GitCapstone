package com.example.capstonebangkit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.capstonebangkit.databinding.ItemListAboutBinding
import com.example.capstonebangkit.model.About
import com.example.capstonebangkit.utils.DataCallbackAbout

class AboutAdapter(private val dataCallback : DataCallbackAbout) : RecyclerView.Adapter<AboutAdapter.Holder>() {


    private val listAbout = ArrayList<About>()

    fun setAbout(about : List<About>){
        this.listAbout.addAll(about)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemListAboutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(listAbout[position])
    }

    override fun getItemCount(): Int = listAbout.size

    inner class Holder (private val binding: ItemListAboutBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(about: About){
            with(binding){
                about.imgAbout?.let { imageView.setImageResource(it) }
                tvTitleAbout.text = about.title
                itemView.setOnClickListener { dataCallback.onCallback(about) }
            }
        }
    }
}