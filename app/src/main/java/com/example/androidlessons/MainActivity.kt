package com.example.androidlessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactList = ArrayList<Contact>()
        for(i in 0 until 40){
            contactList.add(Contact(name = "", number = ""))
        }


    }
}
