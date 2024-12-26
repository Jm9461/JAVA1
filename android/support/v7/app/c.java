package android.support.v7.app;

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

class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f۱۵۴۵a = {16843531};

    public static a a(a info2, Activity activity, Drawable drawable, int contentDescRes) {
        a info3 = new a(activity);
        if (info3.f۱۵۴۶a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                info3.f۱۵۴۶a.invoke(actionBar, drawable);
                info3.f۱۵۴۷b.invoke(actionBar, Integer.valueOf(contentDescRes));
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator via JB-MR2 API", e2);
            }
        } else {
            ImageView imageView = info3.f۱۵۴۸c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            } else {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set home-as-up indicator");
            }
        }
        return info3;
    }

    public static a a(a info2, Activity activity, int contentDescRes) {
        if (info2 == null) {
            info2 = new a(activity);
        }
        if (info2.f۱۵۴۶a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                info2.f۱۵۴۷b.invoke(actionBar, Integer.valueOf(contentDescRes));
                if (Build.VERSION.SDK_INT <= 19) {
                    actionBar.setSubtitle(actionBar.getSubtitle());
                }
            } catch (Exception e2) {
                Log.w("ActionBarDrawerToggleHC", "Couldn't set content description via JB-MR2 API", e2);
            }
        }
        return info2;
    }

    public static Drawable a(Activity activity) {
        TypedArray a2 = activity.obtainStyledAttributes(f۱۵۴۵a);
        Drawable result = a2.getDrawable(0);
        a2.recycle();
        return result;
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public Method f۱۵۴۶a;

        /* renamed from: b  reason: collision with root package name */
        public Method f۱۵۴۷b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f۱۵۴۸c;

        a(Activity activity) {
            try {
                this.f۱۵۴۶a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.f۱۵۴۷b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException e2) {
                View home = activity.findViewById(16908332);
                if (home != null) {
                    ViewGroup parent = (ViewGroup) home.getParent();
                    if (parent.getChildCount() == 2) {
                        View first = parent.getChildAt(0);
                        View up = first.getId() == 16908332 ? parent.getChildAt(1) : first;
                        if (up instanceof ImageView) {
                            this.f۱۵۴۸c = (ImageView) up;
                        }
                    }
                }
            }
        }
    }
}
