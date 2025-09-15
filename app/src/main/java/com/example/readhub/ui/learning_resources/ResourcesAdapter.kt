package com.example.readhub.ui.learning_resources

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.readhub.databinding.ResourceItemBinding

class LearningResourcesAdapter(private val items: List<ResourcesItem>) : RecyclerView.Adapter<LearningResourcesAdapter.ResourcesViewHolder>() {

    inner class ResourcesViewHolder(private val binding: ResourceItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ResourcesItem) {
            binding.apply {
                txtTitle.text = item.title
                txtAuthor.text = item.author
                txtDescription.text = item.description

                item.image?.let {
                    ivImage.setImageResource(it)
                    ivImage.visibility = View.VISIBLE
                } ?: run {
                    ivImage.visibility = View.GONE
                }

                if (item.resourceUrl != null) {
                    txtResourceUrl.visibility = View.VISIBLE
                    txtResourceUrl.text = item.resourceUrl
                } else {
                    txtResourceUrl.visibility = View.GONE
                }

                if (item.videoUrl != null) {
                    txtVideUrl.visibility = View.VISIBLE
                    txtVideUrl.text = "🎬 Watch Video"
                } else {
                    txtVideUrl.visibility = View.GONE
                }

                root.setOnClickListener {
                    val url = item.videoUrl ?: item.resourceUrl
                    url?.let {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(it))
                        root.context.startActivity(intent)
                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResourcesViewHolder {
        val binding = ResourceItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ResourcesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ResourcesViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}
