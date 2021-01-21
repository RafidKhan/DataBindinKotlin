package com.example.databindingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingproject.databinding.ActivityMain2Binding
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    lateinit var  binding: ActivityMain2Binding
    lateinit var viewModel: MyViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main2)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)

        //binding.textView2.text= "New Text"

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        binding.viewmodel = viewModel

        binding.lifecycleOwner== this
        viewModel.myText.value ="Before Changing Text"
        viewModel.btnText.value ="Before Changing Button Text"
    }
}