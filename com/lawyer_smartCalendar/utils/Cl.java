package com.lawyer_smartCalendar.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: com.lawyer_smartCalendar.utils.l  reason: invalid class name */
public class Cl {
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۸۲۹a(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
            ((ViewGroup) activity.getWindow().getDecorView()).addView(m۱۷۸۲۸b(activity, i));
            m۱۷۸۲۷a(activity);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static View m۱۷۸۲۸b(Activity activity, int i) {
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, m۱۷۸۲۶a((Context) activity)));
        view.setBackgroundColor(i);
        return view;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۷۸۲۷a(Activity activity) {
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
        viewGroup.setFitsSystemWindows(true);
        viewGroup.setClipToPadding(true);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۷۸۲۶a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }
}
