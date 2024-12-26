package com.rey.material.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc;

/* renamed from: com.rey.material.widget.d  reason: invalid class name */
public class Cd extends PopupWindow {

    /* renamed from: a  reason: contains not printable characters */
    private final boolean f۱۵۲۳۷a;

    public Cd(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a = context.obtainStyledAttributes(attrs, Cc.PopupWindow, defStyleAttr, 0);
        this.f۱۵۲۳۷a = a.getBoolean(Cc.PopupWindow_overlapAnchor, false);
        a.recycle();
    }

    public void showAsDropDown(View anchor, int xoff, int yoff) {
        if (Build.VERSION.SDK_INT < 21 && this.f۱۵۲۳۷a) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff);
    }

    @TargetApi(19)
    public void showAsDropDown(View anchor, int xoff, int yoff, int gravity) {
        if (Build.VERSION.SDK_INT < 21 && this.f۱۵۲۳۷a) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff, gravity);
    }

    @Override // android.widget.PopupWindow
    public void update(View anchor, int xoff, int yoff, int width, int height) {
        if (Build.VERSION.SDK_INT < 21 && this.f۱۵۲۳۷a) {
            yoff -= anchor.getHeight();
        }
        super.update(anchor, xoff, yoff, width, height);
    }
}
