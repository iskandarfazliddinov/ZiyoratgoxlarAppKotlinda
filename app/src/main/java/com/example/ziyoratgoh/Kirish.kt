package com.example.ziyoratgoh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import kotlinx.android.synthetic.main.activity_kirish.*

class Kirish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kirish)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },2700)


        val animationToRight: Animation = TranslateAnimation(-800f, 1000f, 0f, 0F)
        animationToRight.duration = 2000
        animationToRight.repeatMode = Animation.RESTART
        animationToRight.repeatCount = Animation.INFINITE

        text_view.animation = animationToRight
    }
}