package com.example.rosettatablet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.rosettatablet.databinding.FragmentRoiBinding

class ROIFragment : Fragment() {
    private lateinit var binding: FragmentRoiBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_roi, container, false)
        return  binding.root
    }
}
