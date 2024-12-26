package com.rey.material.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۷v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۳d.Ca;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۴e.View$OnTouchListenerCc;
import p۰۵۲b.p۱۱۱j.p۱۱۲a.p۱۱۵f.Cd;

public class TextView extends AppCompatTextView implements Ca.AbstractCc {

    /* renamed from: f  reason: contains not printable characters */
    private View$OnClickListenerCe f۱۵۱۸۸f;

    /* renamed from: g  reason: contains not printable characters */
    protected int f۱۵۱۸۹g;

    /* renamed from: h  reason: contains not printable characters */
    protected int f۱۵۱۹۰h = Integer.MIN_VALUE;

    /* renamed from: i  reason: contains not printable characters */
    private AbstractCa f۱۵۱۹۱i;

    /* renamed from: com.rey.material.widget.TextView$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۸۱۲۸a(View view, int i, int i2);
    }

    public TextView(Context context) {
        super(context);
        m۱۸۱۲۷b(context, null, 0, 0);
    }

    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m۱۸۱۲۷b(context, attrs, 0, 0);
    }

    public TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m۱۸۱۲۷b(context, attrs, defStyleAttr, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۱۲۷b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Cd.m۱۶۵۱۲a((android.widget.TextView) this, attrs, defStyleAttr, defStyleRes);
        m۱۸۱۲۵a(context, attrs, defStyleAttr, defStyleRes);
        if (!isInEditMode()) {
            this.f۱۵۱۸۹g = Ca.m۱۶۴۲۵a(context, attrs, defStyleAttr, defStyleRes);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۲۴a(int resId) {
        Cd.m۱۶۵۰۷a((View) this, resId);
        m۱۸۱۲۵a(getContext(), null, 0, resId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۲۵a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        getRippleManager().m۱۸۱۷۸a(this, context, attrs, defStyleAttr, defStyleRes);
    }

    public void setTextAppearance(int resId) {
        Cd.m۱۶۵۱۱a((android.widget.TextView) this, resId);
    }

    @Override // android.support.p۰۴۷v7.widget.AppCompatTextView
    public void setTextAppearance(Context context, int resId) {
        Cd.m۱۶۵۱۱a((android.widget.TextView) this, resId);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۱۲۶a(Ca.Cb event) {
        int style = Ca.m۱۶۴۲۶a().m۱۶۴۲۹a(this.f۱۵۱۸۹g);
        if (this.f۱۵۱۹۰h != style) {
            this.f۱۵۱۹۰h = style;
            m۱۸۱۲۴a(this.f۱۵۱۹۰h);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f۱۵۱۸۹g != 0) {
            Ca.m۱۶۴۲۶a().m۱۶۴۳۱a(this);
            m۱۸۱۲۶a((Ca.Cb) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View$OnClickListenerCe.m۱۸۱۷۲a(this);
        if (this.f۱۵۱۸۹g != 0) {
            Ca.m۱۶۴۲۶a().m۱۶۴۳۲b(this);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AppCompatTextView
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
        if (this.f۱۵۱۸۸f == null) {
            synchronized (View$OnClickListenerCe.class) {
                if (this.f۱۵۱۸۸f == null) {
                    this.f۱۵۱۸۸f = new View$OnClickListenerCe();
                }
            }
        }
        return this.f۱۵۱۸۸f;
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

    public void setOnSelectionChangedListener(AbstractCa listener) {
        this.f۱۵۱۹۱i = listener;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int selStart, int selEnd) {
        super.onSelectionChanged(selStart, selEnd);
        AbstractCa aVar = this.f۱۵۱۹۱i;
        if (aVar != null) {
            aVar.m۱۸۱۲۸a(this, selStart, selEnd);
        }
    }
}
