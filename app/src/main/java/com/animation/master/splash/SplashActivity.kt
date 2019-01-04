package com.animation.master.splash

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.animation.master.AppNavigator
import com.animation.master.R
import com.animation.master.animation.RevealAnimation
import com.animation.master.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    companion object {
        private const val DELAY = 1000
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivitySplashBinding>(this, R.layout.activity_splash)

        binding.mainLayout.addOnLayoutChangeListener(object : View.OnLayoutChangeListener {
            override fun onLayoutChange(v: View, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
                v.removeOnLayoutChangeListener(this)

                val cx = (left + right) / 2
                val cy = (top + bottom) / 2
                val radius = Math.max(binding.mainLayout.width, binding.mainLayout.height) * 2.0f

                val reveal = RevealAnimation.getInstance()
                    .setCx(cx)
                    .setCy(cy)
                    .setStartRadius(0f)
                    .setEndRadius(radius)
                    .setDuration(1000)
                    .start(binding.mainLayout)

                reveal?.addListener(object : AnimatorListenerAdapter() {
                    override fun onAnimationEnd(animation: Animator) {
                        startMainActivity()
                    }
                })
            }
        })

    }

    private fun startMainActivity() {
        try {
            Thread.sleep(DELAY.toLong())
        } catch (e: InterruptedException) {
            e.printStackTrace()
        } finally {
            AppNavigator.navigateToDashboard(this)
        }
    }
}
