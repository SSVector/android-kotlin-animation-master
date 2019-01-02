package com.animation.master.animation;

import android.animation.Animator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;

public class RevealAnimation {

    private int cx, cy;
    private float startRadius, endRadius;
    private long duration;

    public RevealAnimation setCx(int cx) {
        this.cx = cx;
        return this;
    }

    public RevealAnimation setCy(int cy) {
        this.cy = cy;
        return this;
    }

    public RevealAnimation setStartRadius(float startRadius) {
        this.startRadius = startRadius;
        return this;
    }

    public RevealAnimation setEndRadius(float endRadius) {
        this.endRadius = endRadius;
        return this;
    }

    public RevealAnimation setDuration(long duration) {
        this.duration = duration;
        return this;
    }

    public Animator start(View view) {
        Animator reveal = null;
        if (view.getVisibility() == View.INVISIBLE) {
            view.setVisibility(View.VISIBLE);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                reveal = ViewAnimationUtils.createCircularReveal(view, cx, cy, startRadius, endRadius);
                reveal.setDuration(duration);
                reveal.start();
            }
        }

        return reveal;
    }

    public static RevealAnimation getInstance() {
        return new RevealAnimation();
    }
}
