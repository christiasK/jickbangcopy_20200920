package com.example.jickbangcopy_20200920

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setup()
    }

    override fun setupEvents() {
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(getContext(), MainActivity::class.java)
            startActivity(intent)

            finish()
        }, 2500L)
    }

    override fun setValues() {
    }
}