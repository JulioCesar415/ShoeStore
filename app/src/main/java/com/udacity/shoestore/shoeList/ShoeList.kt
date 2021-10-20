package com.udacity.shoestore.shoeList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.ShoeViewModel
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.models.ShoeViewModelFactory


/**
 * A simple [Fragment] subclass.
 * Use the [ShoeList.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoeList : Fragment() {

//    initiate viewModel
    private lateinit var viewModel: ShoeViewModel

//    initiate viewModelFactory
    private lateinit var viewModelFactory: ShoeViewModelFactory

//    initialze binding
    private lateinit var binding: FragmentShoeListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)

//        navigate to add shoe detail fragment when add shoe detail button is clicked
        binding.addShoeFAB.setOnClickListener {
            findNavController().navigate(ShoeListDirections.actionShoeListToShoeDetail())
        }

//        let fragment know about vieModel
        binding.shoeViewModel = viewModel

//        create a viewModelFactory
        viewModelFactory = ShoeViewModelFactory(shoes = String())

//        reference to viewModel
        viewModel = ViewModelProvider(this, viewModelFactory).get(ShoeViewModel::class.java)

        return binding.root
    }

}