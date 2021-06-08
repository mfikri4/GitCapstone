package com.example.capstonebangkit.view.fragment.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.capstonebangkit.R
import com.example.capstonebangkit.databinding.FragmentDetailAboutBinding
import com.example.capstonebangkit.model.About
import com.example.capstonebangkit.utils.DataCallbackAbout

class DetailAboutFragment : Fragment() {

    private var _binding: FragmentDetailAboutBinding? = null
    private val binding get() = _binding!!
    private val args : DetailAboutFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        populateAbout(args.detailAbout)
        binding.imgBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_detailAboutFragment_to_aboutFragment)
        }
    }

    private fun populateAbout(data: About?) {

        data?.let {
            with(binding) {
                tvTitleAbout.text = StringBuilder("${data.title}")
                tvDescriptionAbout.text = StringBuilder("${data.description}")
                data.imgAbout?.let { it1 -> imgAbout.setImageResource(it1) }

            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}