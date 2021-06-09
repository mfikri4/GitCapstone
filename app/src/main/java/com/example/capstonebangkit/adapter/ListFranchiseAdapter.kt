package com.example.capstonebangkit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.capstonebangkit.databinding.ItemListDataSetBinding
import com.example.capstonebangkit.model.Franchise
import com.example.capstonebangkit.utils.DataCallbackFranchise

class ListFranchiseAdapter(private val dataCallbackFranchise: DataCallbackFranchise
): RecyclerView.Adapter<ListFranchiseAdapter.Holder>() {

    private val listData = ArrayList<Franchise>()

    fun setData(franchises: List<Franchise>) {
        listData.clear()
        this.listData.addAll(franchises)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = ItemListDataSetBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }


    inner class Holder(private val binding: ItemListDataSetBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Franchise) {
            with(binding) {
                dataName.text = data.name
                dataContact.text = data.contact
                dataModal.text = data.modal

                Glide
                        .with(itemView.context)
                        .load(data.logo)
                        .into(dataImage)

                itemView.setOnClickListener { dataCallbackFranchise.onCallback(data) }


            }
        }
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val franchiseList = listData[position]
        holder.bind(franchiseList)
    }

    override fun getItemCount(): Int = listData.size
}