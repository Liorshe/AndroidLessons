package com.example.androidlessons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sing_contact.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contactArray = ArrayList<Contact>()
        for(i in 0 until 40){
            contactArray.add(Contact(name = "name ${i}", number = "tel num  $i"))
        }



       val contactAdapter = ContactRecyclerAdapter(this@MainActivity, contactArray)
        recyclercontactList.adapter = contactAdapter
        recyclercontactList.layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)





    }
}
