package com.example.readhub.ui.learning_resources

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.readhub.R
import com.example.readhub.databinding.FragmentLearningResourcesBinding

class LearningResourcesFragment : Fragment(R.layout.fragment_learning_resources) {

    private var _binding: FragmentLearningResourcesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentLearningResourcesBinding.bind(view)

        val items = LearningRescourcesDataSource.getItems(requireContext())
        val adapter = LearningResourcesAdapter(items)

        binding.recyclerview.adapter = adapter

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}