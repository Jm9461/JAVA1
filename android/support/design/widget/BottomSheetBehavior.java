package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.support.p۰۴۳v4.view.AbstractCa;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.widget.Cs;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۷c.Ca;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractCc<V> {

    /* renamed from: a  reason: contains not printable characters */
    private boolean f۹۵۷۳a = true;

    /* renamed from: b  reason: contains not printable characters */
    private float f۹۵۷۴b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۹۵۷۵c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۹۵۷۶d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۹۵۷۷e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۹۵۷۸f;

    /* renamed from: g  reason: contains not printable characters */
    int f۹۵۷۹g;

    /* renamed from: h  reason: contains not printable characters */
    int f۹۵۸۰h;

    /* renamed from: i  reason: contains not printable characters */
    int f۹۵۸۱i;

    /* renamed from: j  reason: contains not printable characters */
    boolean f۹۵۸۲j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۹۵۸۳k;

    /* renamed from: l  reason: contains not printable characters */
    int f۹۵۸۴l = 4;

    /* renamed from: m  reason: contains not printable characters */
    Cs f۹۵۸۵m;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۹۵۸۶n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۹۵۸۷o;

    /* renamed from: p  reason: contains not printable characters */
    private boolean f۹۵۸۸p;

    /* renamed from: q  reason: contains not printable characters */
    int f۹۵۸۹q;

    /* renamed from: r  reason: contains not printable characters */
    WeakReference<V> f۹۵۹۰r;

    /* renamed from: s  reason: contains not printable characters */
    WeakReference<View> f۹۵۹۱s;

    /* renamed from: t  reason: contains not printable characters */
    private AbstractCc f۹۵۹۲t;

    /* renamed from: u  reason: contains not printable characters */
    private VelocityTracker f۹۵۹۳u;

    /* renamed from: v  reason: contains not printable characters */
    int f۹۵۹۴v;

    /* renamed from: w  reason: contains not printable characters */
    private int f۹۵۹۵w;

    /* renamed from: x  reason: contains not printable characters */
    boolean f۹۵۹۶x;

    /* renamed from: y  reason: contains not printable characters */
    private Map<View, Integer> f۹۵۹۷y;

    /* renamed from: z  reason: contains not printable characters */
    private final Cs.AbstractCc f۹۵۹۸z = new Cb();

    /* renamed from: android.support.design.widget.BottomSheetBehavior$c  reason: invalid class name */
    public static abstract class AbstractCc {
        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۱۵۰۸a(View view, float f);

        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۱۵۰۹a(View view, int i);
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        int i;
        TypedArray a = context.obtainStyledAttributes(attrs, Ck.BottomSheetBehavior_Layout);
        TypedValue value = a.peekValue(Ck.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (value == null || (i = value.data) != -1) {
            m۱۱۴۹۳b(a.getDimensionPixelSize(Ck.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        } else {
            m۱۱۴۹۳b(i);
        }
        m۱۱۴۹۴b(a.getBoolean(Ck.BottomSheetBehavior_Layout_behavior_hideable, false));
        m۱۱۴۸۷a(a.getBoolean(Ck.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        m۱۱۴۹۸c(a.getBoolean(Ck.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        a.recycle();
        this.f۹۵۷۴b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: d  reason: contains not printable characters */
    public Parcelable m۱۱۴۹۹d(CoordinatorLayout parent, V child) {
        return new Cd(super.m۱۱۵۸۶d(parent, child), this.f۹۵۸۴l);
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۴۸۳a(CoordinatorLayout parent, V child, Parcelable state) {
        Cd ss = (Cd) state;
        super.m۱۱۵۶۲a(parent, child, ss.m۱۲۷۹۱a());
        int i = ss.f۹۶۰۳e;
        if (i == 1 || i == 2) {
            this.f۹۵۸۴l = 4;
        } else {
            this.f۹۵۸۴l = i;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۴۸۸a(CoordinatorLayout parent, V child, int layoutDirection) {
        if (Cu.m۱۳۰۱۱h(parent) && !Cu.m۱۳۰۱۱h(child)) {
            child.setFitsSystemWindows(true);
        }
        int savedTop = child.getTop();
        parent.m۱۱۵۵۵c(child, layoutDirection);
        this.f۹۵۸۹q = parent.getHeight();
        if (this.f۹۵۷۶d) {
            if (this.f۹۵۷۷e == 0) {
                this.f۹۵۷۷e = parent.getResources().getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۰۸c.Cd.design_bottom_sheet_peek_height_min);
            }
            this.f۹۵۷۸f = Math.max(this.f۹۵۷۷e, this.f۹۵۸۹q - ((parent.getWidth() * 9) / 16));
        } else {
            this.f۹۵۷۸f = this.f۹۵۷۵c;
        }
        this.f۹۵۷۹g = Math.max(0, this.f۹۵۸۹q - child.getHeight());
        this.f۹۵۸۰h = this.f۹۵۸۹q / 2;
        m۱۱۴۷۵c();
        int i = this.f۹۵۸۴l;
        if (i == 3) {
            Cu.m۱۳۰۰۳d(child, m۱۱۴۷۶d());
        } else if (i == 6) {
            Cu.m۱۳۰۰۳d(child, this.f۹۵۸۰h);
        } else if (!this.f۹۵۸۲j || i != 5) {
            int i2 = this.f۹۵۸۴l;
            if (i2 == 4) {
                Cu.m۱۳۰۰۳d(child, this.f۹۵۸۱i);
            } else if (i2 == 1 || i2 == 2) {
                Cu.m۱۳۰۰۳d(child, savedTop - child.getTop());
            }
        } else {
            Cu.m۱۳۰۰۳d(child, this.f۹۵۸۹q);
        }
        if (this.f۹۵۸۵m == null) {
            this.f۹۵۸۵m = Cs.m۱۳۳۲۵a(parent, this.f۹۵۹۸z);
        }
        this.f۹۵۹۰r = new WeakReference<>(child);
        this.f۹۵۹۱s = new WeakReference<>(m۱۱۴۸۰a(child));
        return true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۴۸۹a(CoordinatorLayout parent, V child, MotionEvent event) {
        Cs sVar;
        if (!child.isShown()) {
            this.f۹۵۸۶n = true;
            return false;
        }
        int action = event.getActionMasked();
        if (action == 0) {
            m۱۱۴۷۹f();
        }
        if (this.f۹۵۹۳u == null) {
            this.f۹۵۹۳u = VelocityTracker.obtain();
        }
        this.f۹۵۹۳u.addMovement(event);
        View scroll = null;
        if (action == 0) {
            int initialX = (int) event.getX();
            this.f۹۵۹۵w = (int) event.getY();
            WeakReference<View> weakReference = this.f۹۵۹۱s;
            View scroll2 = weakReference != null ? weakReference.get() : null;
            if (scroll2 != null && parent.m۱۱۵۴۷a(scroll2, initialX, this.f۹۵۹۵w)) {
                this.f۹۵۹۴v = event.getPointerId(event.getActionIndex());
                this.f۹۵۹۶x = true;
            }
            this.f۹۵۸۶n = this.f۹۵۹۴v == -1 && !parent.m۱۱۵۴۷a(child, initialX, this.f۹۵۹۵w);
        } else if (action == 1 || action == 3) {
            this.f۹۵۹۶x = false;
            this.f۹۵۹۴v = -1;
            if (this.f۹۵۸۶n) {
                this.f۹۵۸۶n = false;
                return false;
            }
        }
        if (!this.f۹۵۸۶n && (sVar = this.f۹۵۸۵m) != null && sVar.m۱۳۳۵۳b(event)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f۹۵۹۱s;
        if (weakReference2 != null) {
            scroll = weakReference2.get();
        }
        if (action != 2 || scroll == null || this.f۹۵۸۶n || this.f۹۵۸۴l == 1 || parent.m۱۱۵۴۷a(scroll, (int) event.getX(), (int) event.getY()) || this.f۹۵۸۵m == null || Math.abs(((float) this.f۹۵۹۵w) - event.getY()) <= ((float) this.f۹۵۸۵m.m۱۳۳۵۹d())) {
            return false;
        }
        return true;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۴۹۵b(CoordinatorLayout parent, V child, MotionEvent event) {
        if (!child.isShown()) {
            return false;
        }
        int action = event.getActionMasked();
        if (this.f۹۵۸۴l == 1 && action == 0) {
            return true;
        }
        Cs sVar = this.f۹۵۸۵m;
        if (sVar != null) {
            sVar.m۱۳۳۴۴a(event);
        }
        if (action == 0) {
            m۱۱۴۷۹f();
        }
        if (this.f۹۵۹۳u == null) {
            this.f۹۵۹۳u = VelocityTracker.obtain();
        }
        this.f۹۵۹۳u.addMovement(event);
        if (action == 2 && !this.f۹۵۸۶n && Math.abs(((float) this.f۹۵۹۵w) - event.getY()) > ((float) this.f۹۵۸۵m.m۱۳۳۵۹d())) {
            this.f۹۵۸۵m.m۱۳۳۴۵a(child, event.getPointerId(event.getActionIndex()));
        }
        return !this.f۹۵۸۶n;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۱۴۹۶b(CoordinatorLayout coordinatorLayout, V v, View directTargetChild, View target, int axes, int type) {
        this.f۹۵۸۷o = 0;
        this.f۹۵۸۸p = false;
        if ((axes & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۴۸۵a(CoordinatorLayout coordinatorLayout, V child, View target, int dx, int dy, int[] consumed, int type) {
        if (type != 1 && target == this.f۹۵۹۱s.get()) {
            int currentTop = child.getTop();
            int newTop = currentTop - dy;
            if (dy > 0) {
                if (newTop < m۱۱۴۷۶d()) {
                    consumed[1] = currentTop - m۱۱۴۷۶d();
                    Cu.m۱۳۰۰۳d(child, -consumed[1]);
                    m۱۱۵۰۰d(3);
                } else {
                    consumed[1] = dy;
                    Cu.m۱۳۰۰۳d(child, -dy);
                    m۱۱۵۰۰d(1);
                }
            } else if (dy < 0 && !target.canScrollVertically(-1)) {
                int i = this.f۹۵۸۱i;
                if (newTop <= i || this.f۹۵۸۲j) {
                    consumed[1] = dy;
                    Cu.m۱۳۰۰۳d(child, -dy);
                    m۱۱۵۰۰d(1);
                } else {
                    consumed[1] = currentTop - i;
                    Cu.m۱۳۰۰۳d(child, -consumed[1]);
                    m۱۱۵۰۰d(4);
                }
            }
            m۱۱۴۸۱a(child.getTop());
            this.f۹۵۸۷o = dy;
            this.f۹۵۸۸p = true;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۴۸۴a(CoordinatorLayout coordinatorLayout, V child, View target, int type) {
        int targetState;
        int top;
        if (child.getTop() == m۱۱۴۷۶d()) {
            m۱۱۵۰۰d(3);
        } else if (target == this.f۹۵۹۱s.get() && this.f۹۵۸۸p) {
            if (this.f۹۵۸۷o > 0) {
                top = m۱۱۴۷۶d();
                targetState = 3;
            } else if (this.f۹۵۸۲j && m۱۱۴۹۱a(child, m۱۱۴۷۸e())) {
                top = this.f۹۵۸۹q;
                targetState = 5;
            } else if (this.f۹۵۸۷o == 0) {
                int currentTop = child.getTop();
                if (!this.f۹۵۷۳a) {
                    int top2 = this.f۹۵۸۰h;
                    if (currentTop < top2) {
                        if (currentTop < Math.abs(currentTop - this.f۹۵۸۱i)) {
                            top = 0;
                            targetState = 3;
                        } else {
                            top = this.f۹۵۸۰h;
                            targetState = 6;
                        }
                    } else if (Math.abs(currentTop - top2) < Math.abs(currentTop - this.f۹۵۸۱i)) {
                        top = this.f۹۵۸۰h;
                        targetState = 6;
                    } else {
                        targetState = 4;
                        top = this.f۹۵۸۱i;
                    }
                } else if (Math.abs(currentTop - this.f۹۵۷۹g) < Math.abs(currentTop - this.f۹۵۸۱i)) {
                    top = this.f۹۵۷۹g;
                    targetState = 3;
                } else {
                    top = this.f۹۵۸۱i;
                    targetState = 4;
                }
            } else {
                top = this.f۹۵۸۱i;
                targetState = 4;
            }
            if (this.f۹۵۸۵m.m۱۳۳۵۵b(child, child.getLeft(), top)) {
                m۱۱۵۰۰d(2);
                Cu.m۱۲۹۸۹a(child, new RunnableCe(child, targetState));
            } else {
                m۱۱۵۰۰d(targetState);
            }
            this.f۹۵۸۸p = false;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۴۹۰a(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY) {
        return target == this.f۹۵۹۱s.get() && (this.f۹۵۸۴l != 3 || super.m۱۱۵۷۷a(coordinatorLayout, child, target, velocityX, velocityY));
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۴۸۷a(boolean fitToContents) {
        if (this.f۹۵۷۳a != fitToContents) {
            this.f۹۵۷۳a = fitToContents;
            if (this.f۹۵۹۰r != null) {
                m۱۱۴۷۵c();
            }
            m۱۱۵۰۰d((!this.f۹۵۷۳a || this.f۹۵۸۴l != 6) ? this.f۹۵۸۴l : 3);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۱۴۹۳b(int peekHeight) {
        WeakReference<V> weakReference;
        V view;
        boolean layout = false;
        if (peekHeight == -1) {
            if (!this.f۹۵۷۶d) {
                this.f۹۵۷۶d = true;
                layout = true;
            }
        } else if (this.f۹۵۷۶d || this.f۹۵۷۵c != peekHeight) {
            this.f۹۵۷۶d = false;
            this.f۹۵۷۵c = Math.max(0, peekHeight);
            this.f۹۵۸۱i = this.f۹۵۸۹q - peekHeight;
            layout = true;
        }
        if (layout && this.f۹۵۸۴l == 4 && (weakReference = this.f۹۵۹۰r) != null && (view = weakReference.get()) != null) {
            view.requestLayout();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۴۹۴b(boolean hideable) {
        this.f۹۵۸۲j = hideable;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۴۹۸c(boolean skipCollapsed) {
        this.f۹۵۸۳k = skipCollapsed;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۴۸۲a(AbstractCc callback) {
        this.f۹۵۹۲t = callback;
    }

    /* renamed from: c  reason: contains not printable characters */
    public final void m۱۱۴۹۷c(int state) {
        if (state != this.f۹۵۸۴l) {
            WeakReference<V> weakReference = this.f۹۵۹۰r;
            if (weakReference != null) {
                V child = weakReference.get();
                if (child != null) {
                    ViewParent parent = child.getParent();
                    if (parent == null || !parent.isLayoutRequested() || !Cu.m۱۳۰۲۷x(child)) {
                        m۱۱۴۸۶a((View) child, state);
                    } else {
                        child.post(new RunnableCa(child, state));
                    }
                }
            } else if (state == 4 || state == 3 || state == 6 || (this.f۹۵۸۲j && state == 5)) {
                this.f۹۵۸۴l = state;
            }
        }
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$a  reason: invalid class name */
    class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ View f۹۵۹۹c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۹۶۰۰d;

        RunnableCa(View view, int i) {
            this.f۹۵۹۹c = view;
            this.f۹۶۰۰d = i;
        }

        public void run() {
            BottomSheetBehavior.this.m۱۱۴۸۶a(this.f۹۵۹۹c, this.f۹۶۰۰d);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public final int m۱۱۴۹۲b() {
        return this.f۹۵۸۴l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۵۰۰d(int state) {
        AbstractCc cVar;
        if (this.f۹۵۸۴l != state) {
            this.f۹۵۸۴l = state;
            if (state == 6 || state == 3) {
                m۱۱۴۷۷d(true);
            } else if (state == 5 || state == 4) {
                m۱۱۴۷۷d(false);
            }
            View bottomSheet = this.f۹۵۹۰r.get();
            if (bottomSheet != null && (cVar = this.f۹۵۹۲t) != null) {
                cVar.m۱۱۵۰۹a(bottomSheet, state);
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۱۴۷۵c() {
        if (this.f۹۵۷۳a) {
            this.f۹۵۸۱i = Math.max(this.f۹۵۸۹q - this.f۹۵۷۸f, this.f۹۵۷۹g);
        } else {
            this.f۹۵۸۱i = this.f۹۵۸۹q - this.f۹۵۷۸f;
        }
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۱۴۷۹f() {
        this.f۹۵۹۴v = -1;
        VelocityTracker velocityTracker = this.f۹۵۹۳u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f۹۵۹۳u = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۱۴۹۱a(View child, float yvel) {
        if (this.f۹۵۸۳k) {
            return true;
        }
        if (child.getTop() >= this.f۹۵۸۱i && Math.abs((((float) child.getTop()) + (0.1f * yvel)) - ((float) this.f۹۵۸۱i)) / ((float) this.f۹۵۷۵c) > 0.5f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۱۴۸۰a(View view) {
        if (Cu.m۱۳۰۲۹z(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup group = (ViewGroup) view;
        int count = group.getChildCount();
        for (int i = 0; i < count; i++) {
            View scrollingChild = m۱۱۴۸۰a(group.getChildAt(i));
            if (scrollingChild != null) {
                return scrollingChild;
            }
        }
        return null;
    }

    /* renamed from: e  reason: contains not printable characters */
    private float m۱۱۴۷۸e() {
        VelocityTracker velocityTracker = this.f۹۵۹۳u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f۹۵۷۴b);
        return this.f۹۵۹۳u.getYVelocity(this.f۹۵۹۴v);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d  reason: contains not printable characters */
    private int m۱۱۴۷۶d() {
        if (this.f۹۵۷۳a) {
            return this.f۹۵۷۹g;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۴۸۶a(View child, int state) {
        int top;
        if (state == 4) {
            top = this.f۹۵۸۱i;
        } else if (state == 6) {
            top = this.f۹۵۸۰h;
            if (this.f۹۵۷۳a && top <= this.f۹۵۷۹g) {
                state = 3;
                top = this.f۹۵۷۹g;
            }
        } else if (state == 3) {
            top = m۱۱۴۷۶d();
        } else if (!this.f۹۵۸۲j || state != 5) {
            throw new IllegalArgumentException("Illegal state argument: " + state);
        } else {
            top = this.f۹۵۸۹q;
        }
        if (this.f۹۵۸۵m.m۱۳۳۵۵b(child, child.getLeft(), top)) {
            m۱۱۵۰۰d(2);
            Cu.m۱۲۹۸۹a(child, new RunnableCe(child, state));
            return;
        }
        m۱۱۵۰۰d(state);
    }

    /* renamed from: android.support.design.widget.BottomSheetBehavior$b  reason: invalid class name */
    class Cb extends Cs.AbstractCc {
        Cb() {
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۱۵۰۶b(View child, int pointerId) {
            WeakReference<V> weakReference;
            View scroll;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i = bottomSheetBehavior.f۹۵۸۴l;
            if (i == 1 || bottomSheetBehavior.f۹۵۹۶x) {
                return false;
            }
            if ((i != 3 || bottomSheetBehavior.f۹۵۹۴v != pointerId || (scroll = bottomSheetBehavior.f۹۵۹۱s.get()) == null || !scroll.canScrollVertically(-1)) && (weakReference = BottomSheetBehavior.this.f۹۵۹۰r) != null && weakReference.get() == child) {
                return true;
            }
            return false;
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۰۳a(View changedView, int left, int top, int dx, int dy) {
            BottomSheetBehavior.this.m۱۱۴۸۱a(top);
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۱۵۰۷c(int state) {
            if (state == 1) {
                BottomSheetBehavior.this.m۱۱۵۰۰d(1);
            }
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۵۰۲a(View releasedChild, float xvel, float yvel) {
            int targetState;
            int top;
            if (yvel >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f۹۵۸۲j && bottomSheetBehavior.m۱۱۴۹۱a(releasedChild, yvel) && (releasedChild.getTop() > BottomSheetBehavior.this.f۹۵۸۱i || Math.abs(xvel) < Math.abs(yvel))) {
                    top = BottomSheetBehavior.this.f۹۵۸۹q;
                    targetState = 5;
                } else if (yvel == 0.0f || Math.abs(xvel) > Math.abs(yvel)) {
                    int currentTop = releasedChild.getTop();
                    if (!BottomSheetBehavior.this.f۹۵۷۳a) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int targetState2 = bottomSheetBehavior2.f۹۵۸۰h;
                        if (currentTop < targetState2) {
                            if (currentTop < Math.abs(currentTop - bottomSheetBehavior2.f۹۵۸۱i)) {
                                top = 0;
                                targetState = 3;
                            } else {
                                top = BottomSheetBehavior.this.f۹۵۸۰h;
                                targetState = 6;
                            }
                        } else if (Math.abs(currentTop - targetState2) < Math.abs(currentTop - BottomSheetBehavior.this.f۹۵۸۱i)) {
                            top = BottomSheetBehavior.this.f۹۵۸۰h;
                            targetState = 6;
                        } else {
                            targetState = 4;
                            top = BottomSheetBehavior.this.f۹۵۸۱i;
                        }
                    } else if (Math.abs(currentTop - BottomSheetBehavior.this.f۹۵۷۹g) < Math.abs(currentTop - BottomSheetBehavior.this.f۹۵۸۱i)) {
                        top = BottomSheetBehavior.this.f۹۵۷۹g;
                        targetState = 3;
                    } else {
                        top = BottomSheetBehavior.this.f۹۵۸۱i;
                        targetState = 4;
                    }
                } else {
                    top = BottomSheetBehavior.this.f۹۵۸۱i;
                    targetState = 4;
                }
            } else if (BottomSheetBehavior.this.f۹۵۷۳a) {
                top = BottomSheetBehavior.this.f۹۵۷۹g;
                targetState = 3;
            } else {
                int currentTop2 = releasedChild.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                if (currentTop2 > bottomSheetBehavior3.f۹۵۸۰h) {
                    top = bottomSheetBehavior3.f۹۵۸۰h;
                    targetState = 6;
                } else {
                    targetState = 3;
                    top = 0;
                }
            }
            if (BottomSheetBehavior.this.f۹۵۸۵m.m۱۳۳۶۱d(releasedChild.getLeft(), top)) {
                BottomSheetBehavior.this.m۱۱۵۰۰d(2);
                Cu.m۱۲۹۸۹a(releasedChild, new RunnableCe(releasedChild, targetState));
                return;
            }
            BottomSheetBehavior.this.m۱۱۵۰۰d(targetState);
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۱۵۰۵b(View child, int top, int dy) {
            int d = BottomSheetBehavior.this.m۱۱۴۷۶d();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return Ca.m۱۰۴۹۵a(top, d, bottomSheetBehavior.f۹۵۸۲j ? bottomSheetBehavior.f۹۵۸۹q : bottomSheetBehavior.f۹۵۸۱i);
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۱۵۰۱a(View child, int left, int dx) {
            return child.getLeft();
        }

        @Override // android.support.p۰۴۳v4.widget.Cs.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۱۵۰۴b(View child) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f۹۵۸۲j) {
                return bottomSheetBehavior.f۹۵۸۹q;
            }
            return bottomSheetBehavior.f۹۵۸۱i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۴۸۱a(int top) {
        AbstractCc cVar;
        View bottomSheet = this.f۹۵۹۰r.get();
        if (bottomSheet != null && (cVar = this.f۹۵۹۲t) != null) {
            int i = this.f۹۵۸۱i;
            if (top > i) {
                cVar.m۱۱۵۰۸a(bottomSheet, ((float) (i - top)) / ((float) (this.f۹۵۸۹q - i)));
            } else {
                cVar.m۱۱۵۰۸a(bottomSheet, ((float) (i - top)) / ((float) (i - m۱۱۴۷۶d())));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.widget.BottomSheetBehavior$e  reason: invalid class name */
    public class RunnableCe implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        private final View f۹۶۰۴c;

        /* renamed from: d  reason: contains not printable characters */
        private final int f۹۶۰۵d;

        RunnableCe(View view, int targetState) {
            this.f۹۶۰۴c = view;
            this.f۹۶۰۵d = targetState;
        }

        public void run() {
            Cs sVar = BottomSheetBehavior.this.f۹۵۸۵m;
            if (sVar == null || !sVar.m۱۳۳۴۹a(true)) {
                BottomSheetBehavior.this.m۱۱۵۰۰d(this.f۹۶۰۵d);
            } else {
                Cu.m۱۲۹۸۹a(this.f۹۶۰۴c, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: android.support.design.widget.BottomSheetBehavior$d  reason: invalid class name */
    public static class Cd extends AbstractCa {
        public static final Parcelable.Creator<Cd> CREATOR = new Ca();

        /* renamed from: e  reason: contains not printable characters */
        final int f۹۶۰۳e;

        public Cd(Parcel source, ClassLoader loader) {
            super(source, loader);
            this.f۹۶۰۳e = source.readInt();
        }

        public Cd(Parcelable superState, int state) {
            super(superState);
            this.f۹۶۰۳e = state;
        }

        @Override // android.support.p۰۴۳v4.view.AbstractCa
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f۹۶۰۳e);
        }

        /* renamed from: android.support.design.widget.BottomSheetBehavior$d$a  reason: invalid class name */
        static class Ca implements Parcelable.ClassLoaderCreator<Cd> {
            Ca() {
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public Cd createFromParcel(Parcel in, ClassLoader loader) {
                return new Cd(in, loader);
            }

            @Override // android.os.Parcelable.Creator
            public Cd createFromParcel(Parcel in) {
                return new Cd(in, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public Cd[] newArray(int size) {
                return new Cd[size];
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static <V extends View> BottomSheetBehavior<V> m۱۱۴۷۴b(V view) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (params instanceof CoordinatorLayout.Cf) {
            CoordinatorLayout.AbstractCc behavior = ((CoordinatorLayout.Cf) params).m۱۱۶۰۳d();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۴۷۷d(boolean expanded) {
        WeakReference<V> weakReference = this.f۹۵۹۰r;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get().getParent();
            if (viewParent instanceof CoordinatorLayout) {
                CoordinatorLayout parent = (CoordinatorLayout) viewParent;
                int childCount = parent.getChildCount();
                if (Build.VERSION.SDK_INT >= 16 && expanded) {
                    if (this.f۹۵۹۷y == null) {
                        this.f۹۵۹۷y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View child = parent.getChildAt(i);
                    if (child != this.f۹۵۹۰r.get()) {
                        if (!expanded) {
                            Map<View, Integer> map = this.f۹۵۹۷y;
                            if (map != null && map.containsKey(child)) {
                                Cu.m۱۳۰۰۷f(child, this.f۹۵۹۷y.get(child).intValue());
                            }
                        } else {
                            if (Build.VERSION.SDK_INT >= 16) {
                                this.f۹۵۹۷y.put(child, Integer.valueOf(child.getImportantForAccessibility()));
                            }
                            Cu.m۱۳۰۰۷f(child, 4);
                        }
                    }
                }
                if (!expanded) {
                    this.f۹۵۹۷y = null;
                }
            }
        }
    }
}
