package android.support.p۰۴۳v4.view;

import android.os.Build;
import android.view.ViewGroup;
import p۰۰۰a.p۰۰۵b.p۰۰۶a.Cc;

/* renamed from: android.support.v4.view.w  reason: invalid class name */
public final class Cw {
    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۳۰۴۳a(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 21) {
            return group.isTransitionGroup();
        }
        Boolean explicit = (Boolean) group.getTag(Cc.tag_transition_group);
        return ((explicit == null || !explicit.booleanValue()) && group.getBackground() == null && Cu.m۱۳۰۲۰q(group) == null) ? false : true;
    }
}
