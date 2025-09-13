package com.example.readhub.ui.articles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.readhub.R
import com.example.readhub.databinding.FragmentArticlesBinding

class ArticlesFragment : Fragment(R.layout.fragment_articles) {

    private var _binding: FragmentArticlesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentArticlesBinding.bind(view)

        val adapter = ArticlesAdapter(ArticlesDataSource.getItems(requireContext()))
        binding.recyclerview.adapter = adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}