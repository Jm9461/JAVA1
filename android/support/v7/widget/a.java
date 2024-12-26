package android.support.v7.widget;

import a.b.h.a.j;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.u;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
public abstract class a extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    protected final C۰۰۳۸a f۱۹۶۶c;

    /* renamed from: d  reason: collision with root package name */
    protected final Context f۱۹۶۷d;

    /* renamed from: e  reason: collision with root package name */
    protected ActionMenuView f۱۹۶۸e;

    /* renamed from: f  reason: collision with root package name */
    protected c f۱۹۶۹f;

    /* renamed from: g  reason: collision with root package name */
    protected int f۱۹۷۰g;

    /* renamed from: h  reason: collision with root package name */
    protected y f۱۹۷۱h;
    private boolean i;
    private boolean j;

    public abstract void setContentHeight(int i2);

    a(Context context) {
        this(context, null);
    }

    a(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    a(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        int i2;
        this.f۱۹۶۶c = new C۰۰۳۸a();
        TypedValue tv = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.b.h.a.a.actionBarPopupTheme, tv, true) || (i2 = tv.resourceId) == 0) {
            this.f۱۹۶۷d = context;
        } else {
            this.f۱۹۶۷d = new ContextThemeWrapper(context, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        TypedArray a2 = getContext().obtainStyledAttributes(null, j.ActionBar, a.b.h.a.a.actionBarStyle, 0);
        setContentHeight(a2.getLayoutDimension(j.ActionBar_height, 0));
        a2.recycle();
        c cVar = this.f۱۹۶۹f;
        if (cVar != null) {
            cVar.a(newConfig);
        }
    }

    public boolean onTouchEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 0) {
            this.i = false;
        }
        if (!this.i) {
            boolean handled = super.onTouchEvent(ev);
            if (action == 0 && !handled) {
                this.i = true;
            }
        }
        if (action == 1 || action == 3) {
            this.i = false;
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent ev) {
        int action = ev.getActionMasked();
        if (action == 9) {
            this.j = false;
        }
        if (!this.j) {
            boolean handled = super.onHoverEvent(ev);
            if (action == 9 && !handled) {
                this.j = true;
            }
        }
        if (action == 10 || action == 3) {
            this.j = false;
        }
        return true;
    }

    public int getContentHeight() {
        return this.f۱۹۷۰g;
    }

    public int getAnimatedVisibility() {
        if (this.f۱۹۷۱h != null) {
            return this.f۱۹۶۶c.f۱۹۷۳b;
        }
        return getVisibility();
    }

    public y a(int visibility, long duration) {
        y yVar = this.f۱۹۷۱h;
        if (yVar != null) {
            yVar.a();
        }
        if (visibility == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            y anim = u.a(this).a(1.0f);
            anim.a(duration);
            C۰۰۳۸a aVar = this.f۱۹۶۶c;
            aVar.a(anim, visibility);
            anim.a(aVar);
            return anim;
        }
        y anim2 = u.a(this).a(0.0f);
        anim2.a(duration);
        C۰۰۳۸a aVar2 = this.f۱۹۶۶c;
        aVar2.a(anim2, visibility);
        anim2.a(aVar2);
        return anim2;
    }

    public void setVisibility(int visibility) {
        if (visibility != getVisibility()) {
            y yVar = this.f۱۹۷۱h;
            if (yVar != null) {
                yVar.a();
            }
            super.setVisibility(visibility);
        }
    }

    /* access modifiers changed from: protected */
    public int a(View child, int availableWidth, int childSpecHeight, int spacing) {
        child.measure(View.MeasureSpec.makeMeasureSpec(availableWidth, Integer.MIN_VALUE), childSpecHeight);
        return Math.max(0, (availableWidth - child.getMeasuredWidth()) - spacing);
    }

    protected static int a(int x, int val, boolean isRtl) {
        return isRtl ? x - val : x + val;
    }

    /* access modifiers changed from: protected */
    public int a(View child, int x, int y, int contentHeight, boolean reverse) {
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
    /* renamed from: android.support.v7.widget.a$a  reason: collision with other inner class name */
    public class C۰۰۳۸a implements z {

        /* renamed from: a  reason: collision with root package name */
        private boolean f۱۹۷۲a = false;

        /* renamed from: b  reason: collision with root package name */
        int f۱۹۷۳b;

        protected C۰۰۳۸a() {
        }

        public C۰۰۳۸a a(y animation, int visibility) {
            a.this.f۱۹۷۱h = animation;
            this.f۱۹۷۳b = visibility;
            return this;
        }

        @Override // android.support.v4.view.z
        public void b(View view) {
            a.super.setVisibility(0);
            this.f۱۹۷۲a = false;
        }

        @Override // android.support.v4.view.z
        public void a(View view) {
            if (!this.f۱۹۷۲a) {
                a aVar = a.this;
                aVar.f۱۹۷۱h = null;
                a.super.setVisibility(this.f۱۹۷۳b);
            }
        }

        @Override // android.support.v4.view.z
        public void c(View view) {
            this.f۱۹۷۲a = true;
        }
    }
}
