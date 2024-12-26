package android.support.p۰۴۳v4.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: android.support.v4.widget.g  reason: invalid class name */
public final class Cg {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۲۴۹a(EdgeEffect edgeEffect, float deltaDistance, float displacement) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(deltaDistance, displacement);
        } else {
            edgeEffect.onPull(deltaDistance);
        }
    }
}
