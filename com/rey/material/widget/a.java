package com.rey.material.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b.j.a.d.a;
import b.j.a.e.c;
import b.j.a.f.d;

public class a extends FrameLayout implements a.c {

    /* renamed from: c  reason: collision with root package name */
    private e f۳۴۴۲c;

    /* renamed from: d  reason: collision with root package name */
    protected int f۳۴۴۳d;

    /* renamed from: e  reason: collision with root package name */
    protected int f۳۴۴۴e = Integer.MIN_VALUE;

    public a(Context context) {
        super(context);
        b(context, null, 0, 0);
    }

    public a(Context context, AttributeSet attrs) {
        super(context, attrs);
        b(context, attrs, 0, 0);
    }

    public a(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        b(context, attrs, defStyleAttr, 0);
    }

    /* access modifiers changed from: protected */
    public void b(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        a(context, attrs, defStyleAttr, defStyleRes);
        if (!isInEditMode()) {
            this.f۳۴۴۳d = b.j.a.d.a.a(context, attrs, defStyleAttr, defStyleRes);
        }
    }

    public void a(int resId) {
        d.a(this, resId);
        a(getContext(), null, 0, resId);
    }

    /* access modifiers changed from: protected */
    public void a(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        getRippleManager().a(this, context, attrs, defStyleAttr, defStyleRes);
    }

    public void a(a.b event) {
        int style = b.j.a.d.a.a().a(this.f۳۴۴۳d);
        if (this.f۳۴۴۴e != style) {
            this.f۳۴۴۴e = style;
            a(this.f۳۴۴۴e);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f۳۴۴۳d != 0) {
            b.j.a.d.a.a().a(this);
            a((a.b) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e.a(this);
        if (this.f۳۴۴۳d != 0) {
            b.j.a.d.a.a().b(this);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Drawable background = getBackground();
        if (!(background instanceof c) || (drawable instanceof c)) {
            super.setBackgroundDrawable(drawable);
        } else {
            ((c) background).a(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public e getRippleManager() {
        if (this.f۳۴۴۲c == null) {
            synchronized (e.class) {
                if (this.f۳۴۴۲c == null) {
                    this.f۳۴۴۲c = new e();
                }
            }
        }
        return this.f۳۴۴۲c;
    }

    public void setOnClickListener(View.OnClickListener l) {
        e rippleManager = getRippleManager();
        if (l == rippleManager) {
            super.setOnClickListener(l);
            return;
        }
        rippleManager.a(l);
        setOnClickListener(rippleManager);
    }

    public boolean onTouchEvent(MotionEvent event) {
        return getRippleManager().a(this, event) || super.onTouchEvent(event);
    }
}
