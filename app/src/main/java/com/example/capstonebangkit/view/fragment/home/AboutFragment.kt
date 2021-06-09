package com.example.capstonebangkit.view.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.capstonebangkit.R
import com.example.capstonebangkit.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {


    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_homeFragment)
            }

        })
        binding.imgBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_homeFragment)
        }

    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}