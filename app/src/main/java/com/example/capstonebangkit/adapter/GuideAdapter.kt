package com.example.capstonebangkit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.capstonebangkit.databinding.ItemListGuideBinding
import com.example.capstonebangkit.model.About
import com.example.capstonebangkit.model.Guide
import com.example.capstonebangkit.utils.DataCallbackAbout
import com.example.capstonebangkit.utils.DataCallbackGuide

class GuideAdapter (private val dataCallback : DataCallbackGuide): RecyclerView.Adapter<GuideAdapter.MyViewHolder>() {

    private val listGuide = ArrayList<Guide>()

    fun setGuide(guide : List<Guide>){
        this.listGuide.addAll(guide)
    }
    inner class MyViewHolder (private val binding : ItemListGuideBinding): RecyclerView.ViewHolder(binding.root) {

        fun bind(guide: Guide){
            with(binding){
                tvTitleGuide.text = guide.title
                guide.img?.let { imgGuide.setImageResource(it) }
                itemView.setOnClickListener { dataCallback.onCallback(guide) }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemListGuideBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(listGuide[position])
    }

    override fun getItemCount(): Int = listGuide.size
}