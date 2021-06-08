package com.example.capstonebangkit.view.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.capstonebangkit.R

class SplashActivity : AppCompatActivity() {
    companion object{
        const val delayMillis = 5000L
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val actionBar = supportActionBar
        actionBar?.hide()
        val handler = Handler(mainLooper)

        handler.postDelayed( {
            kotlin.run {
                val intent = Intent(applicationContext, SplashActivity3::class.java)
                startActivity(intent)
                finish()
            }
        },delayMillis)
    }
}