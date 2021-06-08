package com.example.capstonebangkit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.capstonebangkit.databinding.ItemListDataSetBinding
import com.example.capstonebangkit.model.Reseller
import com.example.capstonebangkit.utils.DataCallbackReseller

class ListAdapter (private val dataCallbackReseller: DataCallbackReseller
): RecyclerView.Adapter<ListAdapter.Holder>(){

    private val listData = ArrayList<Reseller>()

    fun setData(resellers : List<Reseller>){
        this.listData.addAll(resellers)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemListDataSetBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Holder(binding)
    }


    inner class Holder (private val binding: ItemListDataSetBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(data : Reseller){
            with(binding){
                dataName.text = data.name
                dataModal.text = data.capital
                dataContact.text = data.contact

                Glide
                    .with(itemView.context)
                    .load(data.logo)
                    .into(dataImage)

                itemView.setOnClickListener { dataCallbackReseller.onCallback(data) }


            }
        }
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val resellerList = listData[position]
        holder.bind(resellerList)
    }

    override fun getItemCount(): Int = listData.size
}