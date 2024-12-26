package com.github.clans.fab;

import android.content.Context;
import android.os.Build;

/* access modifiers changed from: package-private */
public final class g {
    static int a(Context context, float dp) {
        return Math.round(dp * context.getResources().getDisplayMetrics().density);
    }

    static boolean a() {
        return Build.VERSION.SDK_INT >= 16;
    }

    static boolean b() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
