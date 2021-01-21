package com.example.databindingproject

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel(){
    
    var myText = MutableLiveData<String>()

    var btnText = MutableLiveData<String>()



    fun btnClick(view: View)
    {
        myText.value ="Text Changed Number 2"
        btnText.value ="Text Changed Number 2"
    }
}