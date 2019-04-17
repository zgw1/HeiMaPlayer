package com.example.zhang.heimaplayer.ui.activity


import android.os.Build
import android.support.annotation.RequiresApi
import android.widget.Toolbar
import com.example.zhang.heimaplayer.R
import com.example.zhang.heimaplayer.base.BaseActivity
import com.example.zhang.heimaplayer.util.ToolBarManager
import kotlinx.android.synthetic.main.toolbar.view.*
import org.jetbrains.anko.find

class MainActivity(override val toolabr: Toolbar) : BaseActivity(),ToolBarManager {
     val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {

        return R.layout.activity_main
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun initData() {
        super.initData()

        initMainToolBar()

    }
}
