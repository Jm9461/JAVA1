package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p۰۴۳v4.view.AbstractCz;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.Cy;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cj;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.a  reason: invalid class name */
public abstract class AbstractCa extends ViewGroup {

    /* renamed from: c  reason: contains not printable characters */
    protected final Ca f۱۱۹۰۰c;

    /* renamed from: d  reason: contains not printable characters */
    protected final Context f۱۱۹۰۱d;

    /* renamed from: e  reason: contains not printable characters */
    protected ActionMenuView f۱۱۹۰۲e;

    /* renamed from: f  reason: contains not printable characters */
    protected Cc f۱۱۹۰۳f;

    /* renamed from: g  reason: contains not printable characters */
    protected int f۱۱۹۰۴g;

    /* renamed from: h  reason: contains not printable characters */
    protected Cy f۱۱۹۰۵h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۱۹۰۶i;

    /* renamed from: j  reason: contains not printable characters */
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
        this.f۱۱۹۰۰c = new Ca();
        TypedValue tv = new TypedValue();
        if (!context.getTheme().resolveAttribute(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarPopupTheme, tv, true) || (i = tv.resourceId) == 0) {
            this.f۱۱۹۰۱d = context;
        } else {
            this.f۱۱۹۰۱d = new ContextThemeWrapper(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        TypedArray a = getContext().obtainStyledAttributes(null, Cj.ActionBar, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionBarStyle, 0);
        setContentHeight(a.getLayoutDimension(Cj.ActionBar_height, 0));
        a.recycle();
        Cc cVar = this.f۱۱۹۰۳f;
        if (cVar != null) {
            cVar.m۱۵۰۱۶a(newConfig);
        }
    }

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

    /* renamed from: a  reason: contains not printable characters */
    public Cy m۱۴۹۶۵a(int visibility, long duration) {
        Cy yVar = this.f۱۱۹۰۵h;
        if (yVar != null) {
            yVar.m۱۳۰۵۸a();
        }
        if (visibility == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            Cy anim = Cu.m۱۲۹۷۶a(this).m۱۳۰۵۳a(1.0f);
            anim.m۱۳۰۵۴a(duration);
            Ca aVar = this.f۱۱۹۰۰c;
            aVar.m۱۴۹۶۶a(anim, visibility);
            anim.m۱۳۰۵۶a(aVar);
            return anim;
        }
        Cy anim2 = Cu.m۱۲۹۷۶a(this).m۱۳۰۵۳a(0.0f);
        anim2.m۱۳۰۵۴a(duration);
        Ca aVar2 = this.f۱۱۹۰۰c;
        aVar2.m۱۴۹۶۶a(anim2, visibility);
        anim2.m۱۳۰۵۶a(aVar2);
        return anim2;
    }

    public void setVisibility(int visibility) {
        if (visibility != getVisibility()) {
            Cy yVar = this.f۱۱۹۰۵h;
            if (yVar != null) {
                yVar.m۱۳۰۵۸a();
            }
            super.setVisibility(visibility);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۹۶۳a(View child, int availableWidth, int childSpecHeight, int spacing) {
        child.measure(View.MeasureSpec.makeMeasureSpec(availableWidth, Integer.MIN_VALUE), childSpecHeight);
        return Math.max(0, (availableWidth - child.getMeasuredWidth()) - spacing);
    }

    /* renamed from: a  reason: contains not printable characters */
    protected static int m۱۴۹۶۰a(int x, int val, boolean isRtl) {
        return isRtl ? x - val : x + val;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۴۹۶۴a(View child, int x, int y, int contentHeight, boolean reverse) {
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

    /* access modifiers changed from: protected */
    /* renamed from: android.support.v7.widget.a$a  reason: invalid class name */
    public class Ca implements AbstractCz {

        /* renamed from: a  reason: contains not printable characters */
        private boolean f۱۱۹۰۸a = false;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۱۹۰۹b;

        protected Ca() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۴۹۶۶a(Cy animation, int visibility) {
            AbstractCa.this.f۱۱۹۰۵h = animation;
            this.f۱۱۹۰۹b = visibility;
            return this;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۴۹۶۸b(View view) {
            AbstractCa.super.setVisibility(0);
            this.f۱۱۹۰۸a = false;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۹۶۷a(View view) {
            if (!this.f۱۱۹۰۸a) {
                AbstractCa aVar = AbstractCa.this;
                aVar.f۱۱۹۰۵h = null;
                AbstractCa.super.setVisibility(this.f۱۱۹۰۹b);
            }
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCz
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۴۹۶۹c(View view) {
            this.f۱۱۹۰۸a = true;
        }
    }
}
