package com.animation.master.moveViewAnimation

import android.animation.ObjectAnimator
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.animation.master.R
import com.animation.master.databinding.ActivityMoveViewBinding
import com.kotlin.customview.shape.CircleView

class MoveViewActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMoveViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_move_view)

        val animView = findViewById<CircleView>(R.id.animView)

        val animation = ObjectAnimator.ofFloat(animView, "translationY", 100f)
        animation.duration = 2000
        animation.start()
    }
}
