package com.example.capstonebangkit.view.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.capstonebangkit.R
import com.example.capstonebangkit.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setImageSlider()
        binding.cardGmbFranchise.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_homeFragment_to_franchiseFragment)
        }
        binding.ivFotoReseller.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_homeFragment_to_resellerFragment)
        }
        binding.ivFotoGuide.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_homeFragment_to_guideFragment)
        }
        binding.ivFotoAbout.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
        }
    }
    private fun setImageSlider() {
        val listImages = intArrayOf(
            R.drawable.img_reseller2,
            R.drawable.img_about_franchise,
            R.drawable.img_franchise2
        )
        with(binding) {
            imageHome.apply {
                setImageListener { position, imageView ->
                    imageView.setImageResource(listImages[position])
                }
                pageCount = listImages.size
            }

        }

    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}