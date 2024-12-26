package com.rey.material.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.Cc;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.View$OnTouchListenerCc;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cd;

/* renamed from: com.rey.material.widget.e  reason: invalid class name */
public final class View$OnClickListenerCe implements View.OnClickListener {

    /* renamed from: c  reason: contains not printable characters */
    private View.OnClickListener f۱۵۲۳۸c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۵۲۳۹d = false;

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۷۸a(View v, Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (!v.isInEditMode()) {
            TypedArray a = context.obtainStyledAttributes(attrs, Cc.RippleView, defStyleAttr, defStyleRes);
            int rippleStyle = a.getResourceId(Cc.RippleView_rd_style, 0);
            View$OnTouchListenerCc drawable = null;
            if (rippleStyle != 0) {
                View$OnTouchListenerCc.Cb bVar = new View$OnTouchListenerCc.Cb(context, rippleStyle);
                bVar.m۱۶۴۶۹a(m۱۸۱۷۶c(v));
                drawable = bVar.m۱۶۴۷۱a();
            } else if (a.getBoolean(Cc.RippleView_rd_enable, false)) {
                View$OnTouchListenerCc.Cb bVar2 = new View$OnTouchListenerCc.Cb(context, attrs, defStyleAttr, defStyleRes);
                bVar2.m۱۶۴۶۹a(m۱۸۱۷۶c(v));
                drawable = bVar2.m۱۶۴۷۱a();
            }
            a.recycle();
            if (drawable != null) {
                Cd.m۱۶۵۰۸a(v, drawable);
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private Drawable m۱۸۱۷۶c(View v) {
        Drawable background = v.getBackground();
        if (background == null) {
            return null;
        }
        if (background instanceof View$OnTouchListenerCc) {
            return ((View$OnTouchListenerCc) background).m۱۶۴۶۶b();
        }
        return background;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۷۷a(View.OnClickListener l) {
        this.f۱۵۲۳۸c = l;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۱۷۹a(View v, MotionEvent event) {
        Drawable background = v.getBackground();
        return background != null && (background instanceof View$OnTouchListenerCc) && ((View$OnTouchListenerCc) background).onTouch(v, event);
    }

    public void onClick(View v) {
        Drawable background = v.getBackground();
        long delay = 0;
        if (background != null) {
            if (background instanceof View$OnTouchListenerCc) {
                delay = ((View$OnTouchListenerCc) background).m۱۶۴۶۷c();
            } else if (background instanceof p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Cd) {
                delay = ((p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Cd) background).m۱۶۴۹۸b();
            }
        }
        if (delay <= 0 || v.getHandler() == null || this.f۱۵۲۳۹d) {
            m۱۸۱۷۵b(v);
            return;
        }
        this.f۱۵۲۳۹d = true;
        v.getHandler().postDelayed(new RunnableCa(v), delay);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b  reason: contains not printable characters */
    private void m۱۸۱۷۵b(View v) {
        View.OnClickListener onClickListener = this.f۱۵۲۳۸c;
        if (onClickListener != null) {
            onClickListener.onClick(v);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۸۱۷۲a(View v) {
        Drawable background = v.getBackground();
        if (background instanceof View$OnTouchListenerCc) {
            ((View$OnTouchListenerCc) background).m۱۶۴۶۲a();
        } else if (background instanceof p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Cd) {
            ((p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.Cd) background).m۱۶۴۹۷a();
        }
        if (v instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) v;
            int count = vg.getChildCount();
            for (int i = 0; i < count; i++) {
                m۱۸۱۷۲a(vg.getChildAt(i));
            }
        }
    }

    /* renamed from: com.rey.material.widget.e$a  reason: invalid class name */
    class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        View f۱۵۲۴۰c;

        public RunnableCa(View v) {
            this.f۱۵۲۴۰c = v;
        }

        public void run() {
            View$OnClickListenerCe.this.f۱۵۲۳۹d = false;
            View$OnClickListenerCe.this.m۱۸۱۷۵b(this.f۱۵۲۴۰c);
        }
    }
}
