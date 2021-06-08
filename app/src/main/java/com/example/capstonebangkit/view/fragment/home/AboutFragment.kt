package com.example.capstonebangkit.view.fragment.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.capstonebangkit.R
import com.example.capstonebangkit.adapter.AboutAdapter
import com.example.capstonebangkit.databinding.FragmentAboutBinding
import com.example.capstonebangkit.model.About
import com.example.capstonebangkit.utils.DataCallbackAbout
import com.example.capstonebangkit.utils.DataDummy
import com.example.capstonebangkit.view.fragment.detail.DetailAboutFragmentDirections

class AboutFragment : Fragment() ,DataCallbackAbout{


    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!
    private lateinit var aboutAdapter: AboutAdapter


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
        aboutAdapter = AboutAdapter(this)

    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onCallback(about: About) {
        val extraData = AboutFragmentDirections.actionAboutFragmentToDetailAboutFragment(about)
        view?.findNavController()?.navigate(extraData)
    }
}