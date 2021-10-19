package com.udacity.shoestore.shoeDetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding


/**
 * A simple [Fragment] subclass.
 * Use the [ShoeDetail.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShoeDetail : Fragment() {

//    initialize binding
    private lateinit var binding: FragmentShoeDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detail, container, false)

//        navigate to shoe list fragment when cancel button is clicked
        binding.shoeDetailCancelButton.setOnClickListener {
            findNavController().navigate(ShoeDetailDirections.actionShoeDetailToShoeList())
        }

//        navigate to shoe list fragment when save button is clicked
        binding.shoeDetailSaveButton.setOnClickListener {
            findNavController().navigate(ShoeDetailDirections.actionShoeDetailToShoeList())
        }

        return binding.root
    }

}