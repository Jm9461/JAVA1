package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;

abstract class n<V extends View> extends x<V> {

    /* renamed from: d  reason: collision with root package name */
    private Runnable f۹۷۹d;

    /* renamed from: e  reason: collision with root package name */
    OverScroller f۹۸۰e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۹۸۱f;

    /* renamed from: g  reason: collision with root package name */
    private int f۹۸۲g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f۹۸۳h;
    private int i = -1;
    private VelocityTracker j;

    /* access modifiers changed from: package-private */
    public abstract boolean a(V v);

    /* access modifiers changed from: package-private */
    public abstract int b(CoordinatorLayout coordinatorLayout, V v, int i2, int i3, int i4);

    /* access modifiers changed from: package-private */
    public abstract int b(V v);

    /* access modifiers changed from: package-private */
    public abstract int c();

    /* access modifiers changed from: package-private */
    public abstract int c(V v);

    /* access modifiers changed from: package-private */
    public abstract void e(CoordinatorLayout coordinatorLayout, V v);

    public n() {
    }

    public n(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r3 != 3) goto L_0x0083;
     */
    @Override // android.support.design.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.support.design.widget.CoordinatorLayout r8, V r9, android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.n.a(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00af;
     */
    @Override // android.support.design.widget.CoordinatorLayout.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.support.design.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.n.b(android.support.design.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    public int c(CoordinatorLayout parent, V header, int newOffset) {
        return b(parent, header, newOffset, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public final int a(CoordinatorLayout coordinatorLayout, V header, int dy, int minOffset, int maxOffset) {
        return b(coordinatorLayout, header, c() - dy, minOffset, maxOffset);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(CoordinatorLayout coordinatorLayout, V layout, int minOffset, int maxOffset, float velocityY) {
        Runnable runnable = this.f۹۷۹d;
        if (runnable != null) {
            layout.removeCallbacks(runnable);
            this.f۹۷۹d = null;
        }
        if (this.f۹۸۰e == null) {
            this.f۹۸۰e = new OverScroller(layout.getContext());
        }
        this.f۹۸۰e.fling(0, b(), 0, Math.round(velocityY), 0, 0, minOffset, maxOffset);
        if (this.f۹۸۰e.computeScrollOffset()) {
            this.f۹۷۹d = new a(coordinatorLayout, layout);
            u.a(layout, this.f۹۷۹d);
            return true;
        }
        e(coordinatorLayout, layout);
        return false;
    }

    private void d() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: private */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        private final CoordinatorLayout f۹۸۴c;

        /* renamed from: d  reason: collision with root package name */
        private final V f۹۸۵d;

        a(CoordinatorLayout parent, V layout) {
            this.f۹۸۴c = parent;
            this.f۹۸۵d = layout;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: android.support.design.widget.n */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: android.support.design.widget.n */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            OverScroller overScroller;
            if (this.f۹۸۵d != null && (overScroller = n.this.f۹۸۰e) != null) {
                if (overScroller.computeScrollOffset()) {
                    n nVar = n.this;
                    nVar.c(this.f۹۸۴c, this.f۹۸۵d, nVar.f۹۸۰e.getCurrY());
                    u.a(this.f۹۸۵d, this);
                    return;
                }
                n.this.e(this.f۹۸۴c, this.f۹۸۵d);
            }
        }
    }
}
