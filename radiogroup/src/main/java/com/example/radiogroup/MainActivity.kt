package com.example.radiogroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        radioGroup.setOnCheckedChangeListener { radioGroup, radioId->
            when(radioId){
                R.id.firsRadio->{


                }
            }
        }
        
        
    }
}
