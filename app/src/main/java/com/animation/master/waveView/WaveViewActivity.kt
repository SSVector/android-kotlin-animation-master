package com.animation.master.waveView

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.animation.master.R
import com.animation.master.databinding.ActivityWaveViewBinding
import com.animation.master.dashboard.MainActivity



class WaveViewActivity : AppCompatActivity() {

    private val TAG = MainActivity::class.java.simpleName

    private lateinit var mBinding: ActivityWaveViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_wave_view)

        mBinding.waveThree.addDefaultWaves(2, 1)
        mBinding.waveThree.startAnimation()

    }

    override fun onResume() {
        super.onResume()
        mBinding.waveThree.resumeAnimation()
    }

    override fun onPause() {
        super.onPause()
        mBinding.waveThree.pauseAnimation()
    }
}
