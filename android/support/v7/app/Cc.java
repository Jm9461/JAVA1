package android.support.v7.app;

import android.R;
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

/* renamed from: android.support.v7.app.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cc {

    /* renamed from: a, reason: contains not printable characters */
    private static final int[] f۱۰۹۶۹a = {R.attr.homeAsUpIndicator};

    /* renamed from: a, reason: contains not printable characters */
    public static a m۱۱۳۹۷a(a info2, Activity activity, Drawable drawable, int contentDescRes) {
        a info3 = new a(activity);
        if (info3.f۱۰۹۷۰a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                info3.f۱۰۹۷۰a.invoke(actionBar, drawable);
                info3.f۱۰۹۷۱b.invoke(actionBar, Integer.valueOf(contentDescRes));
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e2);
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

    /* renamed from: a, reason: contains not printable characters */
    public static a m۱۱۳۹۶a(a info2, Activity activity, int contentDescRes) {
        if (info2 == null) {
            info2 = new a(activity);
        }
        if (info2.f۱۰۹۷۰a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                info2.f۱۰۹۷۱b.invoke(actionBar, Integer.valueOf(contentDescRes));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e2);
            }
        }
        return info2;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Drawable m۱۱۳۹۵a(Activity activity) {
        TypedArray a2 = activity.obtainStyledAttributes(f۱۰۹۶۹a);
        Drawable result = a2.getDrawable(0);
        a2.recycle();
        return result;
    }

    /* renamed from: android.support.v7.app.c$a */
    static class a {

        /* renamed from: a, reason: contains not printable characters */
        public Method f۱۰۹۷۰a;

        /* renamed from: b, reason: contains not printable characters */
        public Method f۱۰۹۷۱b;

        /* renamed from: c, reason: contains not printable characters */
        public ImageView f۱۰۹۷۲c;

        a(Activity activity) {
            try {
                this.f۱۰۹۷۰a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f۱۰۹۷۱b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException e2) {
                View home = activity.findViewById(R.id.home);
                if (home == null) {
                    return;
                }
                ViewGroup parent = (ViewGroup) home.getParent();
                int childCount = parent.getChildCount();
                if (childCount != 2) {
                    return;
                }
                View first = parent.getChildAt(0);
                View second = parent.getChildAt(1);
                View up = first.getId() == 16908332 ? second : first;
                if (up instanceof ImageView) {
                    this.f۱۰۹۷۲c = (ImageView) up;
                }
            }
        }
    }
}
