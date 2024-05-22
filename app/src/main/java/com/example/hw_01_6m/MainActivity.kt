package com.example.hw_01_6m

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import com.example.hw_01_6m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by lazy { ViewModelProvider(this)[CounterViewModel::class.java] }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnInc.setOnClickListener {
                viewModel.getCounter(true)
            }
            btnDec.setOnClickListener {
                viewModel.getCounter(false)
            }
            viewModel.getCount.observe(this@MainActivity) { result ->
                binding.text.text = result.toString()
            }
            viewModel.getCount
        }
    }
}