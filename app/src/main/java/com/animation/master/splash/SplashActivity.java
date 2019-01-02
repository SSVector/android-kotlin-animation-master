package com.animation.master.splash;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.animation.master.AppNavigator;
import com.animation.master.R;
import com.animation.master.animation.RevealAnimation;
import com.animation.master.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {

    private static final int DELAY = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivitySplashBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_splash);

        binding.mainLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                v.removeOnLayoutChangeListener(this);

                int cx = (left + right) / 2;
                int cy = (top + bottom) / 2;
                float radius = Math.max(binding.mainLayout.getWidth(), binding.mainLayout.getHeight()) * 2.0f;

                Animator reveal = RevealAnimation.getInstance()
                                                 .setCx(cx)
                                                 .setCy(cy)
                                                 .setStartRadius(0f)
                                                 .setEndRadius(radius)
                                                 .setDuration(1000)
                                                 .start(binding.mainLayout);

                if (reveal != null) {
                    reveal.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            startMainActivity();
                        }
                    });
                }
            }
        });

    }

    private void startMainActivity() {
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            AppNavigator.navigateToDashboard(this);
        }
    }
}
