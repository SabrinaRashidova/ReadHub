package com.example.readhub.ui.books

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.readhub.R
import com.example.readhub.databinding.FragmentBooksBinding

class BookSummariesFragment : Fragment(R.layout.fragment_books) {

    private var _binding: FragmentBooksBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBooksBinding.bind(view)

        binding.recyclerview.adapter = BooksAdapter(BooksDataSource.getItems(requireContext()))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}