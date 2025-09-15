package com.example.readhub.ui.books

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.readhub.databinding.BookItemBinding

class BooksAdapter(private val items: List<BookItem>) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    inner class BooksViewHolder(private val binding: BookItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(item: BookItem){
            binding.txtTitle.text = item.title
            binding.txtAuthor.text = item.author
            binding.ivBook.setImageResource(item.image)
            binding.txtBookDescription.text = item.description
            binding.txtBookUrl.text = item.downloadUrl
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BooksViewHolder {
        val binding = BookItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BooksViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: BooksViewHolder,
        position: Int
    ) {
        holder.onBind(items[position])
    }

    override fun getItemCount(): Int = items.size

}