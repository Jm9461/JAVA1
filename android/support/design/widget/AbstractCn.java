package android.support.design.widget;

import android.content.Context;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: android.support.design.widget.n  reason: invalid class name */
abstract class AbstractCn<V extends View> extends Cx<V> {

    /* renamed from: d  reason: contains not printable characters */
    private Runnable f۹۹۸۲d;

    /* renamed from: e  reason: contains not printable characters */
    OverScroller f۹۹۸۳e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۹۹۸۴f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۹۹۸۵g = -1;

    /* renamed from: h  reason: contains not printable characters */
    private int f۹۹۸۶h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۹۹۸۷i = -1;

    /* renamed from: j  reason: contains not printable characters */
    private VelocityTracker f۹۹۸۸j;

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۱۹۴۲a(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public abstract int m۱۱۹۴۳b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public abstract int m۱۱۹۴۴b(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public abstract int m۱۱۹۴۶c();

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public abstract int m۱۱۹۴۸c(V v);

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public abstract void m۱۱۹۴۹e(CoordinatorLayout coordinatorLayout, V v);

    public AbstractCn() {
    }

    public AbstractCn(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r3 != 3) goto L_0x0083;
     */
    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m۱۱۹۴۱a(android.support.design.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AbstractCn.m۱۱۹۴۱a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00af;
     */
    @Override // android.support.design.widget.CoordinatorLayout.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m۱۱۹۴۵b(android.support.design.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.AbstractCn.m۱۱۹۴۵b(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۱۹۴۷c(CoordinatorLayout parent, V header, int newOffset) {
        return m۱۱۹۴۳b(parent, header, newOffset, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final int m۱۱۹۳۹a(CoordinatorLayout coordinatorLayout, V header, int dy, int minOffset, int maxOffset) {
        return m۱۱۹۴۳b(coordinatorLayout, header, m۱۱۹۴۶c() - dy, minOffset, maxOffset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final boolean m۱۱۹۴۰a(CoordinatorLayout coordinatorLayout, V layout, int minOffset, int maxOffset, float velocityY) {
        Runnable runnable = this.f۹۹۸۲d;
        if (runnable != null) {
            layout.removeCallbacks(runnable);
            this.f۹۹۸۲d = null;
        }
        if (this.f۹۹۸۳e == null) {
            this.f۹۹۸۳e = new OverScroller(layout.getContext());
        }
        this.f۹۹۸۳e.fling(0, m۱۲۰۳۳b(), 0, Math.round(velocityY), 0, 0, minOffset, maxOffset);
        if (this.f۹۹۸۳e.computeScrollOffset()) {
            this.f۹۹۸۲d = new RunnableCa(coordinatorLayout, layout);
            Cu.m۱۲۹۸۹a(layout, this.f۹۹۸۲d);
            return true;
        }
        m۱۱۹۴۹e(coordinatorLayout, layout);
        return false;
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۱۹۳۸d() {
        if (this.f۹۹۸۸j == null) {
            this.f۹۹۸۸j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.widget.n$a  reason: invalid class name */
    public class RunnableCa implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        private final CoordinatorLayout f۹۹۸۹c;

        /* renamed from: d  reason: contains not printable characters */
        private final V f۹۹۹۰d;

        RunnableCa(CoordinatorLayout parent, V layout) {
            this.f۹۹۸۹c = parent;
            this.f۹۹۹۰d = layout;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: android.support.design.widget.n */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: android.support.design.widget.n */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            OverScroller overScroller;
            if (this.f۹۹۹۰d != null && (overScroller = AbstractCn.this.f۹۹۸۳e) != null) {
                if (overScroller.computeScrollOffset()) {
                    AbstractCn nVar = AbstractCn.this;
                    nVar.m۱۱۹۴۷c(this.f۹۹۸۹c, this.f۹۹۹۰d, nVar.f۹۹۸۳e.getCurrY());
                    Cu.m۱۲۹۸۹a(this.f۹۹۹۰d, this);
                    return;
                }
                AbstractCn.this.m۱۱۹۴۹e(this.f۹۹۸۹c, this.f۹۹۹۰d);
            }
        }
    }
}
