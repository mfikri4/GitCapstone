package com.example.capstonebangkit.view.fragment.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.capstonebangkit.R
import com.example.capstonebangkit.databinding.FragmentDetailFranchiseBinding
import com.example.capstonebangkit.databinding.FragmentDetailResellerBinding
import com.example.capstonebangkit.model.Reseller

class DetailFragmentReseller : Fragment() {

    private var _binding: FragmentDetailResellerBinding? = null
    private val binding get() = _binding!!
    private val args: DetailFragmentResellerArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDetailResellerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        populateReseller(args.detailReseller)
        binding.imgBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_detailFragmentReseller_to_resellerFragment)
        }
    }

    private fun populateReseller(data: Reseller?) {

        data?.let {
            with(binding) {
                detailName.text = StringBuilder("${data.name}")
                detailContact.text = StringBuilder("${data.contact}")
                detailModal.text = StringBuilder("${data.capital}")
                Glide
                    .with(requireActivity())
                    .load(data.logo)
                    .into(detailLogo)

            }
        }
    }
}