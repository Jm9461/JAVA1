package com.rey.material.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p۲۰۸b.p۲۶۷j.p۲۶۸a.Cc;
import p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e.ViewOnTouchListenerCc;
import p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۱f.Cd;

/* renamed from: com.rey.material.widget.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class ViewOnClickListenerCe implements View.OnClickListener {

    /* renamed from: c, reason: contains not printable characters */
    private View.OnClickListener f۱۵۲۳۸c;

    /* renamed from: d, reason: contains not printable characters */
    private boolean f۱۵۲۳۹d = false;

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۱۰۰a(View v, Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (v.isInEditMode()) {
            return;
        }
        TypedArray a2 = context.obtainStyledAttributes(attrs, Cc.RippleView, defStyleAttr, defStyleRes);
        int rippleStyle = a2.getResourceId(Cc.RippleView_rd_style, 0);
        ViewOnTouchListenerCc drawable = null;
        if (rippleStyle != 0) {
            ViewOnTouchListenerCc.b bVar = new ViewOnTouchListenerCc.b(context, rippleStyle);
            bVar.m۱۴۳۹۴a(m۱۶۰۹۸c(v));
            drawable = bVar.m۱۴۳۹۶a();
        } else {
            boolean rippleEnable = a2.getBoolean(Cc.RippleView_rd_enable, false);
            if (rippleEnable) {
                ViewOnTouchListenerCc.b bVar2 = new ViewOnTouchListenerCc.b(context, attrs, defStyleAttr, defStyleRes);
                bVar2.m۱۴۳۹۴a(m۱۶۰۹۸c(v));
                drawable = bVar2.m۱۴۳۹۶a();
            }
        }
        a2.recycle();
        if (drawable != null) {
            Cd.m۱۴۴۳۳a(v, drawable);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    private Drawable m۱۶۰۹۸c(View v) {
        Drawable background = v.getBackground();
        if (background == null) {
            return null;
        }
        if (background instanceof ViewOnTouchListenerCc) {
            return ((ViewOnTouchListenerCc) background).m۱۴۳۹۱b();
        }
        return background;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۰۹۹a(View.OnClickListener l) {
        this.f۱۵۲۳۸c = l;
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean m۱۶۱۰۱a(View v, MotionEvent event) {
        Drawable background = v.getBackground();
        return background != null && (background instanceof ViewOnTouchListenerCc) && ((ViewOnTouchListenerCc) background).onTouch(v, event);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        Drawable background = v.getBackground();
        long delay = 0;
        if (background != null) {
            if (background instanceof ViewOnTouchListenerCc) {
                delay = ((ViewOnTouchListenerCc) background).m۱۴۳۹۲c();
            } else if (background instanceof p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e.Cd) {
                delay = ((p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e.Cd) background).m۱۴۴۲۳b();
            }
        }
        if (delay > 0 && v.getHandler() != null && !this.f۱۵۲۳۹d) {
            this.f۱۵۲۳۹d = true;
            v.getHandler().postDelayed(new a(v), delay);
        } else {
            m۱۶۰۹۷b(v);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: contains not printable characters */
    public void m۱۶۰۹۷b(View v) {
        View.OnClickListener onClickListener = this.f۱۵۲۳۸c;
        if (onClickListener != null) {
            onClickListener.onClick(v);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۶۰۹۴a(View v) {
        Drawable background = v.getBackground();
        if (background instanceof ViewOnTouchListenerCc) {
            ((ViewOnTouchListenerCc) background).m۱۴۳۸۷a();
        } else if (background instanceof p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e.Cd) {
            ((p۲۰۸b.p۲۶۷j.p۲۶۸a.p۲۷۰e.Cd) background).m۱۴۴۲۲a();
        }
        if (v instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) v;
            int count = vg.getChildCount();
            for (int i = 0; i < count; i++) {
                m۱۶۰۹۴a(vg.getChildAt(i));
            }
        }
    }

    /* renamed from: com.rey.material.widget.e$a */
    class a implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        View f۱۵۲۴۰c;

        public a(View v) {
            this.f۱۵۲۴۰c = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnClickListenerCe.this.f۱۵۲۳۹d = false;
            ViewOnClickListenerCe.this.m۱۶۰۹۷b(this.f۱۵۲۴۰c);
        }
    }
}
