package com.animation.master.translationScaleAnimation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.animation.master.R
import com.animation.master.databinding.ActivityTranslationScaleBinding

class TranslationScaleActivity : AppCompatActivity() {

    companion object {
        private const val ANIMATION_DURATION = 1150L
        private const val PROPERTY_SCALE_X = "scaleX"
        private const val PROPERTY_SCALE_Y = "scaleY"
        private const val PROPERTY_TRANSLATION_Y = "translationY"
    }

    private lateinit var mBinding: ActivityTranslationScaleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView<ActivityTranslationScaleBinding>(this, R.layout.activity_translation_scale)

        mBinding.startButton.setOnClickListener(object : View.OnClickListener {

            override fun onClick(v: View?) {
                setImageUpAnimation()
            }

        })
    }

    fun setImageUpAnimation() {
        val scaleDownX = ObjectAnimator.ofFloat(mBinding.mobImage, PROPERTY_SCALE_X, 0.7f)
        val scaleDownY = ObjectAnimator.ofFloat(mBinding.mobImage, PROPERTY_SCALE_Y, 0.7f)
        scaleDownX.duration = ANIMATION_DURATION
        scaleDownY.duration = ANIMATION_DURATION

        val upHeight = (mBinding.parentLayout.height / 4)
        val moveUpY = ObjectAnimator.ofFloat(mBinding.mobImage, PROPERTY_TRANSLATION_Y, -upHeight.toFloat())
        moveUpY.duration = ANIMATION_DURATION

        val scaleDown = AnimatorSet()
        val moveUp = AnimatorSet()

        scaleDown.play(scaleDownX).with(scaleDownY)
        moveUp.play(moveUpY)

        scaleDown.start()
        moveUp.start()

    }
}
