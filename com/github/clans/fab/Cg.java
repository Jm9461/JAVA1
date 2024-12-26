package com.github.clans.fab;

import android.content.Context;
import android.os.Build;

/* access modifiers changed from: package-private */
/* renamed from: com.github.clans.fab.g  reason: invalid class name */
public final class Cg {
    /* renamed from: a  reason: contains not printable characters */
    static int m۱۶۹۵۹a(Context context, float dp) {
        return Math.round(dp * context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: a  reason: contains not printable characters */
    static boolean m۱۶۹۶۰a() {
        return Build.VERSION.SDK_INT >= 16;
    }

    /* renamed from: b  reason: contains not printable characters */
    static boolean m۱۶۹۶۱b() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
