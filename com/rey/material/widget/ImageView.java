package com.rey.material.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۷v7.widget.Co;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.View$OnTouchListenerCc;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cd;

public class ImageView extends Co implements Ca.AbstractCc {

    /* renamed from: e  reason: contains not printable characters */
    private View$OnClickListenerCe f۱۵۱۴۴e;

    /* renamed from: f  reason: contains not printable characters */
    protected int f۱۵۱۴۵f;

    /* renamed from: g  reason: contains not printable characters */
    protected int f۱۵۱۴۶g = Integer.MIN_VALUE;

    public ImageView(Context context) {
        super(context);
        m۱۸۰۹۲b(context, null, 0, 0);
    }

    public ImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m۱۸۰۹۲b(context, attrs, 0, 0);
    }

    public ImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m۱۸۰۹۲b(context, attrs, defStyleAttr, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۰۹۲b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        m۱۸۰۹۰a(context, attrs, defStyleAttr, defStyleRes);
        if (!isInEditMode()) {
            this.f۱۵۱۴۵f = Ca.m۱۶۴۲۵a(context, attrs, defStyleAttr, defStyleRes);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۸۹a(int resId) {
        Cd.m۱۶۵۰۷a(this, resId);
        m۱۸۰۹۰a(getContext(), null, 0, resId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۹۰a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        getRippleManager().m۱۸۱۷۸a(this, context, attrs, defStyleAttr, defStyleRes);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۹۱a(Ca.Cb event) {
        int style = Ca.m۱۶۴۲۶a().m۱۶۴۲۹a(this.f۱۵۱۴۵f);
        if (this.f۱۵۱۴۶g != style) {
            this.f۱۵۱۴۶g = style;
            m۱۸۰۸۹a(this.f۱۵۱۴۶g);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f۱۵۱۴۵f != 0) {
            Ca.m۱۶۴۲۶a().m۱۶۴۳۱a(this);
            m۱۸۰۹۱a((Ca.Cb) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View$OnClickListenerCe.m۱۸۱۷۲a(this);
        if (this.f۱۵۱۴۵f != 0) {
            Ca.m۱۶۴۲۶a().m۱۶۴۳۲b(this);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.Co
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
        if (this.f۱۵۱۴۴e == null) {
            synchronized (View$OnClickListenerCe.class) {
                if (this.f۱۵۱۴۴e == null) {
                    this.f۱۵۱۴۴e = new View$OnClickListenerCe();
                }
            }
        }
        return this.f۱۵۱۴۴e;
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
