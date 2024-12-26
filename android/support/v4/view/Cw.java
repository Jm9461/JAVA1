package android.support.v4.view;

import android.os.Build;
import android.view.ViewGroup;
import p۱۵۹a.p۱۶۴b.p۱۶۵a.Cc;

/* renamed from: android.support.v4.view.w, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cw {
    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۰۹۷۳a(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 21) {
            return group.isTransitionGroup();
        }
        Boolean explicit = (Boolean) group.getTag(Cc.tag_transition_group);
        return ((explicit == null || !explicit.booleanValue()) && group.getBackground() == null && Cu.m۱۰۹۵۰q(group) == null) ? false : true;
    }
}
