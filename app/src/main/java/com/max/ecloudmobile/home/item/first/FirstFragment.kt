package com.max.ecloudmobile.home.item.first

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.max.ecloudmobile.databinding.FragmentItemFirstBinding
import com.max.ecloudmobile.databinding.FragmentItemThirdBinding


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentItemFirstBinding.inflate(inflater, container, false)

        return binding.root
    }

}