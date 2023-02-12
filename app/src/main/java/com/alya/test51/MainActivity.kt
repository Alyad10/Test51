package com.alya.test51

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alya.test51.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()

    }

    private fun initClickers() {
        with(binding){
            equalsBtn.setOnClickListener {
                tvResult.text = Math().divide(etA.text.toString(), etB.text.toString())
            }
        }
    }
}