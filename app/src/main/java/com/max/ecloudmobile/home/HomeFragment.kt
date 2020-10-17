package com.max.ecloudmobile.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.viewpager.widget.ViewPager
import com.max.ecloudmobile.R
import com.max.ecloudmobile.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var radioGroup: RadioGroup

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.lifecycleOwner = viewLifecycleOwner
        radioGroup = binding.radioGroup

        val adapter = HomeAdapter(childFragmentManager)
        val viewPager = binding.viewpagerHome
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(onPageChangeListener)


        binding.button.setOnClickListener {
            binding.textView.text = adapter.fragmentMap[viewPager.currentItem].toString()
        }

        return binding.root

    }


    private val onPageChangeListener = object : ViewPager.OnPageChangeListener {

        override fun onPageScrollStateChanged(state: Int) {
        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        }

        override fun onPageSelected(position: Int) {
            when (position) {
                0 -> radioGroup.check(R.id.radioButton_1)
                1 -> radioGroup.check(R.id.radioButton_2)
                2 -> radioGroup.check(R.id.radioButton_3)
            }
        }
    }

}