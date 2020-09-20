package com.example.jickbangcopy_20200920

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    protected fun setup() {
        setupEvents()
        setValues()
    }

    fun getContext() : Context {
        return this
    }

    abstract fun setupEvents()

    abstract fun setValues()

}