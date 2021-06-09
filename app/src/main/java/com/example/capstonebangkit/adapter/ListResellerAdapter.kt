package com.example.capstonebangkit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.capstonebangkit.databinding.ItemListDataSetBinding
import com.example.capstonebangkit.model.Reseller
import com.example.capstonebangkit.utils.DataCallbackReseller

class ListResellerAdapter (private val dataCallbackReseller: DataCallbackReseller
): RecyclerView.Adapter<ListResellerAdapter.Holder>(){

    private val listData = ArrayList<Reseller>()

    fun setData(resellers : List<Reseller>){
        listData.clear()
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
                dataContact.text = data.contact
                dataModal.text = data.modal

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