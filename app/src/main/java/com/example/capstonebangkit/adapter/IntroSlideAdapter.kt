package com.example.capstonebangkit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.capstonebangkit.databinding.ItemListSliderBinding
import com.example.capstonebangkit.model.IntroSlide

class IntroSlideAdapter (private val introSlides: List<IntroSlide>) : RecyclerView.Adapter<IntroSlideAdapter.IntroSlideViewHolder>(){


    inner class IntroSlideViewHolder(private val binding : ItemListSliderBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(introSlide: IntroSlide){
            binding.imageSliderIcon.setImageResource(introSlide.icon)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IntroSlideViewHolder {
        val binding = ItemListSliderBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return IntroSlideViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IntroSlideViewHolder, position: Int) {
        holder.bind(introSlides[position])
    }

    override fun getItemCount(): Int = introSlides.size
}