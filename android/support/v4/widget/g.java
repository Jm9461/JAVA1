package android.support.v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;

public final class g {
    public static void a(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(deltaDistance, displacement);
        } else {
            edgeEffect.onPull(deltaDistance);
        }
    }
}
