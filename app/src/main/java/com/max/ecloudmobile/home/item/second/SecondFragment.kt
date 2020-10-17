package com.max.ecloudmobile.home.item.second

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.max.ecloudmobile.databinding.FragmentItemSecondBinding
import com.max.ecloudmobile.databinding.FragmentItemThirdBinding


class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentItemSecondBinding.inflate(inflater, container, false)

        return binding.root
    }

}