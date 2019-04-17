package com.example.zhang.heimaplayer.ui.activity

import android.os.Bundle
import android.support.v4.view.ViewCompat
import android.support.v4.view.ViewPropertyAnimatorListener
import android.view.View
import com.example.zhang.heimaplayer.R
import com.example.zhang.heimaplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

class SlpapeActivity :BaseActivity(), ViewPropertyAnimatorListener {


    override fun getLayoutId(): Int {

        return R.layout.activity_splash
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }



    override fun initData() {
        super.initData()


        ViewCompat.animate(imageView).scaleX(1.0f).scaleY(1.0f).setDuration(2000).setListener(this)

    }

    override fun onAnimationEnd(p0: View?) {

        startActivityAndFinish<MainActivity>()


    }

    override fun onAnimationCancel(p0: View?) {

    }

    override fun onAnimationStart(p0: View?) {

    }


    inline fun <reified T:BaseActivity>startActivityAndFinish(){
        startActivity<MainActivity>()
        finish()

    }


}