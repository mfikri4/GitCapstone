package com.example.capstonebangkit.view.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.capstonebangkit.R
import com.example.capstonebangkit.adapter.ListFranchiseAdapter
import com.example.capstonebangkit.databinding.FragmentFranchiseBinding
import com.example.capstonebangkit.model.Franchise
import com.example.capstonebangkit.utils.DataCallbackFranchise
import com.example.capstonebangkit.viewmodel.FranchiseViewModel
import com.example.capstonebangkit.viewmodel.ViewModelFactory

class FranchiseFragment : Fragment() ,DataCallbackFranchise{

    private var _binding: FragmentFranchiseBinding? = null
    private val binding get() = _binding!!
    private  lateinit var listFranchiseAdapter: ListFranchiseAdapter
    private lateinit var viewModel : FranchiseViewModel
    private lateinit var viewModelFactory: ViewModelFactory
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFranchiseBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModelFactory = ViewModelFactory.getInstance(requireActivity())
        viewModel = ViewModelProvider(this, viewModelFactory).get(FranchiseViewModel::class.java)
        requireActivity().onBackPressedDispatcher.addCallback(object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Navigation.findNavController(view).navigate(R.id.action_franchiseFragment_to_homeFragment)
            }

        })
        binding.imgBack.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_franchiseFragment_to_homeFragment)
        }

        listFranchiseAdapter = ListFranchiseAdapter(this)
        init()

        val input = binding.edtInput.text
        binding.imgSearch.setOnClickListener {
            if (input.isNotEmpty()){

                binding.imgEmpty.visibility = View.INVISIBLE
                binding.spinKit.visibility = View.VISIBLE
                observe()

            }
        }

    }
    private fun observe(){
        viewModel.getFranchise().observe(viewLifecycleOwner, Observer { listFranchise ->

            binding.spinKit.visibility = View.GONE
            listFranchiseAdapter.setData(listFranchise)
            binding.rvFranchise.visibility = View.VISIBLE

        })
    }
    private fun init (){
        with(binding.rvFranchise) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(requireActivity())
            adapter = listFranchiseAdapter

        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


    override fun onCallback(franchise: Franchise) {

        val extraData = FranchiseFragmentDirections.actionFranchiseFragmentToDetailFragmentFranchise(franchise)
        view?.findNavController()?.navigate(extraData)
    }
}