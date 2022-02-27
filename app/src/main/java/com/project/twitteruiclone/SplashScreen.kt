package com.project.twitteruiclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash_screen)

        val th: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(2500)
                    startActivity(Intent(baseContext, MainActivity::class.java))
                    finish()
                } catch (e: Exception) {
                    e.message
                }
            }
        }
        th.start()

    }
}