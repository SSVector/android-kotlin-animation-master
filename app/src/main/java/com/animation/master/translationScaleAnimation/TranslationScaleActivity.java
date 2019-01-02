package com.animation.master.translationScaleAnimation;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.animation.master.R;
import com.animation.master.databinding.ActivityTranslationScaleBinding;

public class TranslationScaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTranslationScaleBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_translation_scale);
    }
}
