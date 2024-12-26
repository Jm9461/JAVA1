package com.rey.material.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b.j.a.c;
import b.j.a.e.c;
import b.j.a.f.d;

public final class e implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    private View.OnClickListener f۳۴۶۶c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۳۴۶۷d = false;

    public void a(View v, Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        if (!v.isInEditMode()) {
            TypedArray a2 = context.obtainStyledAttributes(attrs, c.RippleView, defStyleAttr, defStyleRes);
            int rippleStyle = a2.getResourceId(c.RippleView_rd_style, 0);
            b.j.a.e.c drawable = null;
            if (rippleStyle != 0) {
                c.b bVar = new c.b(context, rippleStyle);
                bVar.a(c(v));
                drawable = bVar.a();
            } else if (a2.getBoolean(b.j.a.c.RippleView_rd_enable, false)) {
                c.b bVar2 = new c.b(context, attrs, defStyleAttr, defStyleRes);
                bVar2.a(c(v));
                drawable = bVar2.a();
            }
            a2.recycle();
            if (drawable != null) {
                d.a(v, drawable);
            }
        }
    }

    private Drawable c(View v) {
        Drawable background = v.getBackground();
        if (background == null) {
            return null;
        }
        if (background instanceof b.j.a.e.c) {
            return ((b.j.a.e.c) background).b();
        }
        return background;
    }

    public void a(View.OnClickListener l) {
        this.f۳۴۶۶c = l;
    }

    public boolean a(View v, MotionEvent event) {
        Drawable background = v.getBackground();
        return background != null && (background instanceof b.j.a.e.c) && ((b.j.a.e.c) background).onTouch(v, event);
    }

    public void onClick(View v) {
        Drawable background = v.getBackground();
        long delay = 0;
        if (background != null) {
            if (background instanceof b.j.a.e.c) {
                delay = ((b.j.a.e.c) background).c();
            } else if (background instanceof b.j.a.e.d) {
                delay = ((b.j.a.e.d) background).b();
            }
        }
        if (delay <= 0 || v.getHandler() == null || this.f۳۴۶۷d) {
            b(v);
            return;
        }
        this.f۳۴۶۷d = true;
        v.getHandler().postDelayed(new a(v), delay);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(View v) {
        View.OnClickListener onClickListener = this.f۳۴۶۶c;
        if (onClickListener != null) {
            onClickListener.onClick(v);
        }
    }

    public static void a(View v) {
        Drawable background = v.getBackground();
        if (background instanceof b.j.a.e.c) {
            ((b.j.a.e.c) background).a();
        } else if (background instanceof b.j.a.e.d) {
            ((b.j.a.e.d) background).a();
        }
        if (v instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) v;
            int count = vg.getChildCount();
            for (int i = 0; i < count; i++) {
                a(vg.getChildAt(i));
            }
        }
    }

    class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        View f۳۴۶۸c;

        public a(View v) {
            this.f۳۴۶۸c = v;
        }

        public void run() {
            e.this.f۳۴۶۷d = false;
            e.this.b(this.f۳۴۶۸c);
        }
    }
}
