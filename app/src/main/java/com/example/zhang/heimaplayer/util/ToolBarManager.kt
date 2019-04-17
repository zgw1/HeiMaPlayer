package com.example.zhang.heimaplayer.util


import android.os.Build
import android.support.annotation.RequiresApi
import android.widget.Toolbar

interface ToolBarManager {

    val toolabr : Toolbar

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun initMainToolBar(){

        toolabr.title = "黑马影音"

    }
}