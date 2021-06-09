package com.example.capstonebangkit.view.fragment.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.capstonebangkit.R
import com.example.capstonebangkit.databinding.FragmentDetailFranchiseBinding
import com.example.capstonebangkit.model.Franchise

class DetailFragmentFranchise : Fragment() {


    private var _binding: FragmentDetailFranchiseBinding? = null
    private val binding get() = _binding!!
    private val args : DetailFragmentFranchiseArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailFranchiseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populateFranchise(args.detailFranchise)

        binding.imgBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_detailFragmentFranchise_to_franchiseFragment)
        }
    }

    private fun populateFranchise(data: Franchise?) {

        data?.let {
            with(binding) {
                detailName.text = StringBuilder("${data.name}")
                detailContact.text = StringBuilder("${data.contact}")
                detailModal.text = StringBuilder("${data.modal}")
                detailRegulation.text = StringBuilder("${data.regulation}")
                rangeModal.text = StringBuilder("${data.rangeModal}")
                Glide
                    .with(requireActivity())
                    .load(data.logo)
                    .into(detailLogo)
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}