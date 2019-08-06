package com.example.random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import java.security.acl.LastOwnerException
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    var  sequence = arrayListOf<Int>()
    var answerSequence = arrayListOf<Int>()
    var failed= false
    var gameStarted = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val random = Random.nextInt(4)
        sequence.add(random)



   start_btn.setOnClickListener{
       game_tv.text = "Level: ${sequence.size}, Game has started"
       gameStarted = true
       failed = false
       showFlick(sequence)
}
        blackbtn.setOnClickListener{
            checkAnswer(0)
        }
        redbtn.setOnClickListener{
            checkAnswer(1)
        }
        bluebtn.setOnClickListener{
            checkAnswer(2)
        }
        yellowbtn.setOnClickListener {
            checkAnswer(3)
        }




    }

    fun checkAnswer(buttonNumber: Int) {
        if (gameStarted) {
            answerSequence.add(buttonNumber)
            for (i in 0 until answerSequence.size) {
                if (answerSequence[i] != sequence[i]) {
                    game_tv.text = "Level: ${sequence.size}, Failed!!"
                    failed = true
                    gameStarted = false
                    answerSequence.removeAll(answerSequence)
                }
            }


            if (answerSequence.size == sequence.size && !failed) {
                game_tv.text = "Level has completed! Welcome to level: ${sequence.size + 1}!"
                answerSequence.removeAll(answerSequence)
                val random = Random.nextInt(4)
                sequence.add(random)
                gameStarted = false
            }


        }

    }

    fun showFlick(sequence: ArrayList<Int>) {
        var handler = Handler()
        var seconds: Long = 1
        var isLast = false
        onOffButtons(false)
        for (j in sequence) {
            handler.postDelayed(
                {
                    if (j == sequence[sequence.size - 1])
                        isLast = true
                    when (j) {
                        0 -> flickbtn(blackbtn, isLast)
                        1 -> flickbtn(redbtn, isLast)
                        2 -> flickbtn(bluebtn, isLast)
                        3 -> flickbtn(yellowbtn, isLast)
                    }
                },(1000 * seconds))
                        seconds++
        }
    }


    fun flickbtn(button: View, isLast: Boolean) {
        val mAnimation = AlphaAnimation(1f, 0f)
        mAnimation.duration = 500
        mAnimation.interpolator = LinearInterpolator()
        mAnimation.repeatCount = 1
        mAnimation.repeatMode = Animation.REVERSE
        button.startAnimation(mAnimation)
        if (isLast)
            onOffButtons(true)

    }

    fun onOffButtons (isEnable: Boolean){
        blackbtn.isEnabled = isEnable
        redbtn.isEnabled = isEnable
        bluebtn.isEnabled = isEnable
        yellowbtn.isEnabled = isEnable
    }
}



