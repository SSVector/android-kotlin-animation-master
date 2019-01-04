package com.animation.master.dashboard

import android.content.Context
import android.view.View
import com.animation.master.AppNavigator

class MainViewModel(private val mContext: Context) {

    fun onTranslationScaleActivityClick(view: View) {
        AppNavigator.navigateToTranslationScaleActivity(mContext)
    }

    fun onMoveViewActivityClick(view: View) {
        AppNavigator.navigateToMoveViewActivity(mContext)
    }

    fun onWaveViewActivityClick(view: View) {
        AppNavigator.navigateToWaveViewActivity(mContext)
    }

    fun onLoadingViewActivityClick(view: View) {
        AppNavigator.navigateToLoadingViewActivity(mContext)
    }

}
