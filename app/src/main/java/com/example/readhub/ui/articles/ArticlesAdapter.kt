package com.example.readhub.ui.articles

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.readhub.databinding.ArticleItemBinding

class ArticlesAdapter(private val items: List<ArticleItem>) : RecyclerView.Adapter<ArticlesAdapter.ArticleViewHolder>() {

    inner class ArticleViewHolder(private val binding: ArticleItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(item: ArticleItem){
            binding.txtTitle.text = item.title
            binding.txtAuthor.text = item.author
            binding.txtContent.text = item.content
        }
    }
    
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ArticleViewHolder {
        val binding = ArticleItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ArticleViewHolder,
        position: Int
    ) {
        holder.onBind(items[position])
    }

    override fun getItemCount(): Int = items.size
    
}