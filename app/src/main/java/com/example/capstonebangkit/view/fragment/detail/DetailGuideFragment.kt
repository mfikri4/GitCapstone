package com.example.capstonebangkit.view.fragment.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.capstonebangkit.R
import com.example.capstonebangkit.databinding.FragmentGuideDetailBinding
import com.example.capstonebangkit.model.Guide

class DetailGuideFragment : Fragment() {

    private var _binding: FragmentGuideDetailBinding? = null
    private val binding get() = _binding!!
    private val args : DetailGuideFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGuideDetailBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        populateGuide(args.detailGuide)
        binding.imgBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_guideDetailFragment_to_guideFragment)
        }
    }

    private fun populateGuide(data: Guide?) {

        data?.let {
            with(binding) {
                tvTitleGuide.text = StringBuilder("${data.title}")
                tvDescriptionGuide.text = StringBuilder("${data.description}")
                data.img?.let { it1 -> imageView.setImageResource(it1) }

            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}