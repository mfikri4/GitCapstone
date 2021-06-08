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
import com.example.capstonebangkit.R
import com.example.capstonebangkit.adapter.GuideAdapter
import com.example.capstonebangkit.databinding.FragmentGuideBinding
import com.example.capstonebangkit.model.Guide
import com.example.capstonebangkit.utils.DataCallbackGuide
import com.example.capstonebangkit.utils.DataDummy

class GuideFragment : Fragment() , DataCallbackGuide{

    private var _binding: FragmentGuideBinding? = null
    private val binding get() = _binding!!
    private lateinit var guideAdapter: GuideAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentGuideBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Navigation.findNavController(view).navigate(R.id.action_guideFragment_to_homeFragment)
            }

        })
        binding.imgBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_guideFragment_to_homeFragment)
        }
        guideAdapter = GuideAdapter(this)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val listGuide = DataDummy.generateGuide()
        guideAdapter.setGuide(listGuide)
        with(binding.rvGuide) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireActivity())
            adapter = guideAdapter

        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onCallback(guide: Guide) {
        val extraData = GuideFragmentDirections.actionGuideFragmentToGuideDetailFragment(guide)
        view?.findNavController()?.navigate(extraData)
    }
}