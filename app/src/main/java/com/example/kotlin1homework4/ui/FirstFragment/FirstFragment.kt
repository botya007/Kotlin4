package com.example.kotlin1homework4.ui.FirstFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin1homework4.databinding.FragmentFirstBinding
import com.example.kotlin1homework4.ui.FragmentViewModel


class FirstFragment : Fragment() {

    private lateinit var model: FragmentViewModel
    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model = ViewModelProvider(requireActivity()).get(FragmentViewModel::class.java)
        binding.btnPlus.setOnClickListener {
            model.plus()
        }
        binding.btnMinus.setOnClickListener {
            model.minus()
        }

    }

}