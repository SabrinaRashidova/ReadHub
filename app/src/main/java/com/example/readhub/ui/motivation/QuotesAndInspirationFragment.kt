package com.example.readhub.ui.motivation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.readhub.R
import com.example.readhub.databinding.FragmentMotivationBinding

class QuotesAndInspirationFragment : Fragment(R.layout.fragment_motivation) {

    private var _binding: FragmentMotivationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMotivationBinding.bind(view)

        binding.recyclerview.adapter = MotivationsAdapter(MotivationsDataSource.getitems(requireContext()))

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}