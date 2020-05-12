package com.example.rosettatablet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.rosettatablet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // supportActionBar?.hide()
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //binding.heyButton.setOnClickListener { Toast.makeText(this, "HEY", Toast.LENGTH_SHORT).show() }
    }
}
