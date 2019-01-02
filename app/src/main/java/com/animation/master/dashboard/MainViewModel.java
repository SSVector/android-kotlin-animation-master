package com.animation.master.dashboard;

import android.content.Context;
import android.view.View;
import com.animation.master.AppNavigator;

public class MainViewModel {

    private Context mContext;

    public MainViewModel(Context context) {
        this.mContext = context;
    }

    public void onTranslationScaleActivityClick(View view) {
        AppNavigator.navigateToTranslationScaleActivity(mContext);
    }

}
