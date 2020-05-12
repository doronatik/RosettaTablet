package com.example.rosettatablet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.rosettatablet.databinding.FragmentProcedureInfoBinding

class ProcedureInfoFragment : Fragment() {
    private lateinit var binding: FragmentProcedureInfoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_procedure_info, container, false)
        return  binding.root
    }
}
