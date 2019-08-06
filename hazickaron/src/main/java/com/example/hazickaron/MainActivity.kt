package com.example.hazickaron

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random
import kotlin.random.nextUBytes

class MainActivity : AppCompatActivity() {

    var button = arrayListOf<Button>()
    var color = arrayListOf(R.color.red, R.color.blue)
    var pair = arrayListOf<Button>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = Random.nextInt(4)
        color.add(random)




    }



}

private fun Random.nextUBytes(color: ArrayList<>): Any {

}
