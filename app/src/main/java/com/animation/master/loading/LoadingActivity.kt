package com.animation.master.loading

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.animation.master.R
import com.animation.master.databinding.ActivityLoadingBinding

class LoadingActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityLoadingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_loading)

        /*if (newtonCradleLoading.isStart()) {
            button.setText(R.string.start);
            newtonCradleLoading.stop();
        } else {
            button.setText(R.string.stop);
            newtonCradleLoading.start();
        }*/

        mBinding.newtonCradleLoading.start()
    }
}
