package com.example.zhang.heimaplayer.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(getLayoutId())


        initListener()
        initData()


    }

    abstract fun getLayoutId(): Int

    open protected fun initListener() {

    }

    open protected fun initData() {

    }
}