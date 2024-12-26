package com.rey.material.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۷v7.widget.Cg;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.View$OnTouchListenerCc;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cd;

public class Button extends Cg implements Ca.AbstractCc {

    /* renamed from: e  reason: contains not printable characters */
    private View$OnClickListenerCe f۱۵۱۴۱e;

    /* renamed from: f  reason: contains not printable characters */
    protected int f۱۵۱۴۲f;

    /* renamed from: g  reason: contains not printable characters */
    protected int f۱۵۱۴۳g = Integer.MIN_VALUE;

    public Button(Context context) {
        super(context);
        m۱۸۰۸۸b(context, null, 0, 0);
    }

    public Button(Context context, AttributeSet attrs) {
        super(context, attrs);
        m۱۸۰۸۸b(context, attrs, 0, 0);
    }

    public Button(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m۱۸۰۸۸b(context, attrs, defStyleAttr, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۰۸۸b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Cd.m۱۶۵۱۲a((TextView) this, attrs, defStyleAttr, defStyleRes);
        m۱۸۰۸۶a(context, attrs, defStyleAttr, defStyleRes);
        if (!isInEditMode()) {
            this.f۱۵۱۴۲f = Ca.m۱۶۴۲۵a(context, attrs, defStyleAttr, defStyleRes);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۸۵a(int resId) {
        Cd.m۱۶۵۰۷a((View) this, resId);
        m۱۸۰۸۶a(getContext(), null, 0, resId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۸۶a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        getRippleManager().m۱۸۱۷۸a(this, context, attrs, defStyleAttr, defStyleRes);
    }

    public void setTextAppearance(int resId) {
        Cd.m۱۶۵۱۱a((TextView) this, resId);
    }

    @Override // android.support.p۰۴۷v7.widget.Cg
    public void setTextAppearance(Context context, int resId) {
        Cd.m۱۶۵۱۱a((TextView) this, resId);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۸۷a(Ca.Cb event) {
        int style = Ca.m۱۶۴۲۶a().m۱۶۴۲۹a(this.f۱۵۱۴۲f);
        if (this.f۱۵۱۴۳g != style) {
            this.f۱۵۱۴۳g = style;
            m۱۸۰۸۵a(this.f۱۵۱۴۳g);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f۱۵۱۴۲f != 0) {
            Ca.m۱۶۴۲۶a().m۱۶۴۳۱a(this);
            m۱۸۰۸۷a((Ca.Cb) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View$OnClickListenerCe.m۱۸۱۷۲a(this);
        if (this.f۱۵۱۴۲f != 0) {
            Ca.m۱۶۴۲۶a().m۱۶۴۳۲b(this);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.Cg
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
        if (this.f۱۵۱۴۱e == null) {
            synchronized (View$OnClickListenerCe.class) {
                if (this.f۱۵۱۴۱e == null) {
                    this.f۱۵۱۴۱e = new View$OnClickListenerCe();
                }
            }
        }
        return this.f۱۵۱۴۱e;
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
