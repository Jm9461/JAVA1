package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.Cu;
import android.support.v4.view.Cy;
import android.support.v4.view.InterfaceCz;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cj;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCa extends ViewGroup {

    /* renamed from: c, reason: contains not printable characters */
    protected final a f۱۱۹۰۰c;

    /* renamed from: d, reason: contains not printable characters */
    protected final Context f۱۱۹۰۱d;

    /* renamed from: e, reason: contains not printable characters */
    protected ActionMenuView f۱۱۹۰۲e;

    /* renamed from: f, reason: contains not printable characters */
    protected Cc f۱۱۹۰۳f;

    /* renamed from: g, reason: contains not printable characters */
    protected int f۱۱۹۰۴g;

    /* renamed from: h, reason: contains not printable characters */
    protected Cy f۱۱۹۰۵h;

    /* renamed from: i, reason: contains not printable characters */
    private boolean f۱۱۹۰۶i;

    /* renamed from: j, reason: contains not printable characters */
    private boolean f۱۱۹۰۷j;

    public abstract void setContentHeight(int i);

    AbstractCa(Context context) {
        this(context, null);
    }

    AbstractCa(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    AbstractCa(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        int i;
        this.f۱۱۹۰۰c = new a();
        TypedValue tv = new TypedValue();
        if (context.getTheme().resolveAttribute(Ca.actionBarPopupTheme, tv, true) && (i = tv.resourceId) != 0) {
            this.f۱۱۹۰۱d = new ContextThemeWrapper(context, i);
        } else {
            this.f۱۱۹۰۱d = context;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        TypedArray a2 = getContext().obtainStyledAttributes(null, Cj.ActionBar, Ca.actionBarStyle, 0);
        setContentHeight(a2.getLayoutDimension(Cj.ActionBar_height, 0));
        a2.recycle();
        Cc cc = this.f۱۱۹۰۳f;
        if (cc != null) {
            cc.m۱۲۹۴۶a(newConfig);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.f۱۱۹۰۶i = false;
        }
        if (!this.f۱۱۹۰۶i) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.f۱۱۹۰۶i = true;
            }
        }
        if (action == 1 || action == 3) {
            this.f۱۱۹۰۶i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.f۱۱۹۰۷j = false;
        }
        if (!this.f۱۱۹۰۷j) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.f۱۱۹۰۷j = true;
            }
        }
        if (action == 10 || action == 3) {
            this.f۱۱۹۰۷j = false;
        }
        return true;
    }

    public int getContentHeight() {
        return this.f۱۱۹۰۴g;
    }

    public int getAnimatedVisibility() {
        if (this.f۱۱۹۰۵h != null) {
            return this.f۱۱۹۰۰c.f۱۱۹۰۹b;
        }
        return getVisibility();
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cy m۱۲۸۹۵a(int visibility, long duration) {
        Cy cy = this.f۱۱۹۰۵h;
        if (cy != null) {
            cy.m۱۰۹۸۸a();
        }
        if (visibility != 0) {
            Cy cy2 = Cu.m۱۰۹۰۶a(this).m۱۰۹۸۳a(0.0f);
            cy2.m۱۰۹۸۴a(duration);
            a aVar = this.f۱۱۹۰۰c;
            aVar.m۱۲۸۹۶a(cy2, visibility);
            cy2.m۱۰۹۸۶a(aVar);
            return cy2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        Cy cy3 = Cu.m۱۰۹۰۶a(this).m۱۰۹۸۳a(1.0f);
        cy3.m۱۰۹۸۴a(duration);
        a aVar2 = this.f۱۱۹۰۰c;
        aVar2.m۱۲۸۹۶a(cy3, visibility);
        cy3.m۱۰۹۸۶a(aVar2);
        return cy3;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        if (visibility != getVisibility()) {
            Cy cy = this.f۱۱۹۰۵h;
            if (cy != null) {
                cy.m۱۰۹۸۸a();
            }
            super.setVisibility(visibility);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    protected int m۱۲۸۹۳a(View child, int availableWidth, int childSpecHeight, int spacing) {
        child.measure(View.MeasureSpec.makeMeasureSpec(availableWidth, Integer.MIN_VALUE), childSpecHeight);
        return Math.max(0, (availableWidth - child.getMeasuredWidth()) - spacing);
    }

    /* renamed from: a, reason: contains not printable characters */
    protected static int m۱۲۸۹۰a(int x, int val, boolean isRtl) {
        return isRtl ? x - val : x + val;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected int m۱۲۸۹۴a(View child, int x, int y, int contentHeight, boolean reverse) {
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        int childTop = ((contentHeight - childHeight) / 2) + y;
        if (reverse) {
            child.layout(x - childWidth, childTop, x, childTop + childHeight);
        } else {
            child.layout(x, childTop, x + childWidth, childTop + childHeight);
        }
        return reverse ? -childWidth : childWidth;
    }

    /* renamed from: android.support.v7.widget.a$a */
    protected class a implements InterfaceCz {

        /* renamed from: a, reason: contains not printable characters */
        private boolean f۱۱۹۰۸a = false;

        /* renamed from: b, reason: contains not printable characters */
        int f۱۱۹۰۹b;

        protected a() {
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۲۸۹۶a(Cy animation, int visibility) {
            AbstractCa.this.f۱۱۹۰۵h = animation;
            this.f۱۱۹۰۹b = visibility;
            return this;
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۵۷۹۶b(View view) {
            AbstractCa.super.setVisibility(0);
            this.f۱۱۹۰۸a = false;
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۵۷۹۵a(View view) {
            if (this.f۱۱۹۰۸a) {
                return;
            }
            AbstractCa abstractCa = AbstractCa.this;
            abstractCa.f۱۱۹۰۵h = null;
            AbstractCa.super.setVisibility(this.f۱۱۹۰۹b);
        }

        @Override // android.support.v4.view.InterfaceCz
        /* renamed from: c, reason: contains not printable characters */
        public void mo۱۵۷۹۷c(View view) {
            this.f۱۱۹۰۸a = true;
        }
    }
}
