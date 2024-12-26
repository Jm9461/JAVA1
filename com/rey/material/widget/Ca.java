package com.rey.material.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.View$OnTouchListenerCc;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cd;

/* renamed from: com.rey.material.widget.a  reason: invalid class name */
public class Ca extends FrameLayout implements Ca.AbstractCc {

    /* renamed from: c  reason: contains not printable characters */
    private View$OnClickListenerCe f۱۵۱۹۲c;

    /* renamed from: d  reason: contains not printable characters */
    protected int f۱۵۱۹۳d;

    /* renamed from: e  reason: contains not printable characters */
    protected int f۱۵۱۹۴e = Integer.MIN_VALUE;

    public Ca(Context context) {
        super(context);
        m۱۸۱۳۲b(context, null, 0, 0);
    }

    public Ca(Context context, AttributeSet attrs) {
        super(context, attrs);
        m۱۸۱۳۲b(context, attrs, 0, 0);
    }

    public Ca(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m۱۸۱۳۲b(context, attrs, defStyleAttr, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۱۳۲b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        m۱۸۱۳۰a(context, attrs, defStyleAttr, defStyleRes);
        if (!isInEditMode()) {
            this.f۱۵۱۹۳d = p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca.m۱۶۴۲۵a(context, attrs, defStyleAttr, defStyleRes);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۲۹a(int resId) {
        Cd.m۱۶۵۰۷a(this, resId);
        m۱۸۱۳۰a(getContext(), null, 0, resId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۳۰a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        getRippleManager().m۱۸۱۷۸a(this, context, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۳۱a(Ca.Cb event) {
        int style = p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca.m۱۶۴۲۶a().m۱۶۴۲۹a(this.f۱۵۱۹۳d);
        if (this.f۱۵۱۹۴e != style) {
            this.f۱۵۱۹۴e = style;
            m۱۸۱۲۹a(this.f۱۵۱۹۴e);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f۱۵۱۹۳d != 0) {
            p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca.m۱۶۴۲۶a().m۱۶۴۳۱a(this);
            m۱۸۱۳۱a((Ca.Cb) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View$OnClickListenerCe.m۱۸۱۷۲a(this);
        if (this.f۱۵۱۹۳d != 0) {
            p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca.m۱۶۴۲۶a().m۱۶۴۳۲b(this);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Drawable background = getBackground();
        if (!(background instanceof View$OnTouchListenerCc) || (drawable instanceof View$OnTouchListenerCc)) {
            super.setBackgroundDrawable(drawable);
        } else {
            ((View$OnTouchListenerCc) background).m۱۶۴۶۵a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public View$OnClickListenerCe getRippleManager() {
        if (this.f۱۵۱۹۲c == null) {
            synchronized (View$OnClickListenerCe.class) {
                if (this.f۱۵۱۹۲c == null) {
                    this.f۱۵۱۹۲c = new View$OnClickListenerCe();
                }
            }
        }
        return this.f۱۵۱۹۲c;
    }

    public void setOnClickListener(View.OnClickListener l) {
        View$OnClickListenerCe rippleManager = getRippleManager();
        if (l == rippleManager) {
            super.setOnClickListener(l);
            return;
        }
        rippleManager.m۱۸۱۷۷a(l);
        setOnClickListener(rippleManager);
    }

    public boolean onTouchEvent(MotionEvent event) {
        return getRippleManager().m۱۸۱۷۹a(this, event) || super.onTouchEvent(event);
    }
}
