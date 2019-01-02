package com.animation.master;

import android.content.Context;
import android.content.Intent;
import com.animation.master.dashboard.MainActivity;
import com.animation.master.translationScaleAnimation.TranslationScaleActivity;

public class AppNavigator {

    public static void navigateToDashboard(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    public static void navigateToTranslationScaleActivity(Context context) {
        Intent intent = new Intent(context, TranslationScaleActivity.class);
        context.startActivity(intent);
    }

}
