package com.animation.master

import android.content.Context
import android.content.Intent
import com.animation.master.dashboard.MainActivity
import com.animation.master.moveViewAnimation.MoveViewActivity
import com.animation.master.translationScaleAnimation.TranslationScaleActivity

object AppNavigator {

    fun navigateToDashboard(context: Context) {
        val intent = Intent(context, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }

    fun navigateToTranslationScaleActivity(context: Context) {
        val intent = Intent(context, TranslationScaleActivity::class.java)
        context.startActivity(intent)
    }

    fun navigateToMoveViewActivity(context: Context) {
        val intent = Intent(context, MoveViewActivity::class.java)
        context.startActivity(intent)
    }

}
