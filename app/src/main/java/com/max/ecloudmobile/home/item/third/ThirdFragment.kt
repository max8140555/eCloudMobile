package com.max.ecloudmobile.home.item.third

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.max.ecloudmobile.databinding.FragmentItemThirdBinding


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentItemThirdBinding.inflate(inflater, container, false)

        return binding.root
    }

}