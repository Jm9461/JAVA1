package android.support.p۰۴۷v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.app.c  reason: invalid class name */
class Cc {

    /* renamed from: a  reason: contains not printable characters */
    private static final int[] f۱۰۹۶۹a = {16843531};

    /* renamed from: a  reason: contains not printable characters */
    public static Ca m۱۳۴۶۷a(Ca info2, Activity activity, Drawable drawable, int contentDescRes) {
        Ca info3 = new Ca(activity);
        if (info3.f۱۰۹۷۰a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                info3.f۱۰۹۷۰a.invoke(actionBar, drawable);
                info3.f۱۰۹۷۱b.invoke(actionBar, Integer.valueOf(contentDescRes));
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e);
            }
        } else {
            ImageView imageView = info3.f۱۰۹۷۲c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
            }
        }
        return info3;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Ca m۱۳۴۶۶a(Ca info2, Activity activity, int contentDescRes) {
        if (info2 == null) {
            info2 = new Ca(activity);
        }
        if (info2.f۱۰۹۷۰a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                info2.f۱۰۹۷۱b.invoke(actionBar, Integer.valueOf(contentDescRes));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e);
            }
        }
        return info2;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Drawable m۱۳۴۶۵a(Activity activity) {
        TypedArray a = activity.obtainStyledAttributes(f۱۰۹۶۹a);
        Drawable result = a.getDrawable(0);
        a.recycle();
        return result;
    }

    /* renamed from: android.support.v7.app.c$a  reason: invalid class name */
    static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        public Method f۱۰۹۷۰a;

        /* renamed from: b  reason: contains not printable characters */
        public Method f۱۰۹۷۱b;

        /* renamed from: c  reason: contains not printable characters */
        public ImageView f۱۰۹۷۲c;

        Ca(Activity activity) {
            try {
                this.f۱۰۹۷۰a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f۱۰۹۷۱b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                View home = activity.findViewById(16908332);
                if (home != null) {
                    ViewGroup parent = (ViewGroup) home.getParent();
                    if (parent.getChildCount() == 2) {
                        View first = parent.getChildAt(0);
                        View up = first.getId() == 16908332 ? parent.getChildAt(1) : first;
                        if (up instanceof ImageView) {
                            this.f۱۰۹۷۲c = (ImageView) up;
                        }
                    }
                }
            }
        }
    }
}
