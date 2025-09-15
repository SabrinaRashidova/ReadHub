package com.example.readhub.ui.motivation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.readhub.databinding.MotivationItemBinding

class MotivationsAdapter(private val items: List<MotivationItem>) :  RecyclerView.Adapter<MotivationsAdapter.MotivationViewHolder>() {

    inner class MotivationViewHolder(private val binding: MotivationItemBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(item: MotivationItem){
            binding.apply {
                txtAuthorName.text = item.author
                txtContent.text = item.content

                item.image?.let {
                    ivImageview.setImageResource(it)
                }?:run {
                    ivImageview.visibility = View.GONE
                }
            }
        }

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MotivationViewHolder {
        val binding = MotivationItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MotivationViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: MotivationViewHolder,
        position: Int
    ) {
        holder.onBind(items[position])
    }

    override fun getItemCount(): Int = items.size

}