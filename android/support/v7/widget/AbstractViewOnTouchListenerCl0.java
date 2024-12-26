package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.InterfaceCt;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.l0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractViewOnTouchListenerCl0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: contains not printable characters */
    private final float f۱۲۱۸۰c;

    /* renamed from: d, reason: contains not printable characters */
    private final int f۱۲۱۸۱d;

    /* renamed from: e, reason: contains not printable characters */
    private final int f۱۲۱۸۲e;

    /* renamed from: f, reason: contains not printable characters */
    final View f۱۲۱۸۳f;

    /* renamed from: g, reason: contains not printable characters */
    private Runnable f۱۲۱۸۴g;

    /* renamed from: h, reason: contains not printable characters */
    private Runnable f۱۲۱۸۵h;

    /* renamed from: i, reason: contains not printable characters */
    private boolean f۱۲۱۸۶i;

    /* renamed from: j, reason: contains not printable characters */
    private int f۱۲۱۸۷j;

    /* renamed from: k, reason: contains not printable characters */
    private final int[] f۱۲۱۸۸k = new int[2];

    /* renamed from: a, reason: contains not printable characters */
    public abstract InterfaceCt mo۱۳۵۶۹a();

    /* renamed from: b, reason: contains not printable characters */
    protected abstract boolean mo۱۳۵۷۰b();

    public AbstractViewOnTouchListenerCl0(View src) {
        this.f۱۲۱۸۳f = src;
        src.setLongClickable(true);
        src.addOnAttachStateChangeListener(this);
        this.f۱۲۱۸۰c = ViewConfiguration.get(src.getContext()).getScaledTouchSlop();
        this.f۱۲۱۸۱d = ViewConfiguration.getTapTimeout();
        this.f۱۲۱۸۲e = (this.f۱۲۱۸۱d + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        boolean forwarding;
        boolean wasForwarding = this.f۱۲۱۸۶i;
        if (wasForwarding) {
            forwarding = m۱۳۳۳۷a(event) || !mo۱۳۳۴۵c();
        } else {
            forwarding = m۱۳۳۴۰b(event) && mo۱۳۵۷۰b();
            if (forwarding) {
                long now = SystemClock.uptimeMillis();
                MotionEvent e2 = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                this.f۱۲۱۸۳f.onTouchEvent(e2);
                e2.recycle();
            }
        }
        this.f۱۲۱۸۶i = forwarding;
        return forwarding || wasForwarding;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.f۱۲۱۸۶i = false;
        this.f۱۲۱۸۷j = -1;
        Runnable runnable = this.f۱۲۱۸۴g;
        if (runnable != null) {
            this.f۱۲۱۸۳f.removeCallbacks(runnable);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    protected boolean mo۱۳۳۴۵c() {
        InterfaceCt popup = mo۱۳۵۶۹a();
        if (popup != null && popup.mo۱۳۴۳۳e()) {
            popup.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r1 != 3) goto L۲۹;
     */
    /* renamed from: b, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m۱۳۳۴۰b(android.view.MotionEvent r9) {
        /*
            r8 = this;
            android.view.View r0 = r8.f۱۲۱۸۳f
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r9.getActionMasked()
            if (r1 == 0) goto L42
            r3 = 1
            if (r1 == r3) goto L3e
            r4 = 2
            if (r1 == r4) goto L1a
            r3 = 3
            if (r1 == r3) goto L3e
            goto L6f
        L1a:
            int r4 = r8.f۱۲۱۸۷j
            int r4 = r9.findPointerIndex(r4)
            if (r4 < 0) goto L6f
            float r5 = r9.getX(r4)
            float r6 = r9.getY(r4)
            float r7 = r8.f۱۲۱۸۰c
            boolean r7 = m۱۳۳۳۸a(r0, r5, r6, r7)
            if (r7 != 0) goto L3d
            r8.m۱۳۳۴۲e()
            android.view.ViewParent r2 = r0.getParent()
            r2.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            goto L6f
        L3e:
            r8.m۱۳۳۴۲e()
            goto L6f
        L42:
            int r3 = r9.getPointerId(r2)
            r8.f۱۲۱۸۷j = r3
            java.lang.Runnable r3 = r8.f۱۲۱۸۴g
            if (r3 != 0) goto L53
            android.support.v7.widget.l0$a r3 = new android.support.v7.widget.l0$a
            r3.<init>()
            r8.f۱۲۱۸۴g = r3
        L53:
            java.lang.Runnable r3 = r8.f۱۲۱۸۴g
            int r4 = r8.f۱۲۱۸۱d
            long r4 = (long) r4
            r0.postDelayed(r3, r4)
            java.lang.Runnable r3 = r8.f۱۲۱۸۵h
            if (r3 != 0) goto L66
            android.support.v7.widget.l0$b r3 = new android.support.v7.widget.l0$b
            r3.<init>()
            r8.f۱۲۱۸۵h = r3
        L66:
            java.lang.Runnable r3 = r8.f۱۲۱۸۵h
            int r4 = r8.f۱۲۱۸۲e
            long r4 = (long) r4
            r0.postDelayed(r3, r4)
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AbstractViewOnTouchListenerCl0.m۱۳۳۴۰b(android.view.MotionEvent):boolean");
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۳۳۴۲e() {
        Runnable runnable = this.f۱۲۱۸۵h;
        if (runnable != null) {
            this.f۱۲۱۸۳f.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f۱۲۱۸۴g;
        if (runnable2 != null) {
            this.f۱۲۱۸۳f.removeCallbacks(runnable2);
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۱۳۳۴۶d() {
        m۱۳۳۴۲e();
        View src = this.f۱۲۱۸۳f;
        if (!src.isEnabled() || src.isLongClickable() || !mo۱۳۵۷۰b()) {
            return;
        }
        src.getParent().requestDisallowInterceptTouchEvent(true);
        long now = SystemClock.uptimeMillis();
        MotionEvent e2 = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
        src.onTouchEvent(e2);
        e2.recycle();
        this.f۱۲۱۸۶i = true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۳۳۳۷a(MotionEvent srcEvent) {
        Ci0 dst;
        View src = this.f۱۲۱۸۳f;
        InterfaceCt popup = mo۱۳۵۶۹a();
        if (popup == null || !popup.mo۱۳۴۳۳e() || (dst = (Ci0) popup.mo۱۳۴۳۴f()) == null || !dst.isShown()) {
            return false;
        }
        MotionEvent dstEvent = MotionEvent.obtainNoHistory(srcEvent);
        m۱۳۳۳۹a(src, dstEvent);
        m۱۳۳۴۱b(dst, dstEvent);
        boolean handled = dst.m۱۳۲۰۷a(dstEvent, this.f۱۲۱۸۷j);
        dstEvent.recycle();
        int action = srcEvent.getActionMasked();
        boolean keepForwarding = (action == 1 || action == 3) ? false : true;
        return handled && keepForwarding;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۳۳۳۸a(View view, float localX, float localY, float slop) {
        return localX >= (-slop) && localY >= (-slop) && localX < ((float) (view.getRight() - view.getLeft())) + slop && localY < ((float) (view.getBottom() - view.getTop())) + slop;
    }

    /* renamed from: b, reason: contains not printable characters */
    private boolean m۱۳۳۴۱b(View view, MotionEvent event) {
        int[] loc = this.f۱۲۱۸۸k;
        view.getLocationOnScreen(loc);
        event.offsetLocation(-loc[0], -loc[1]);
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۳۳۳۹a(View view, MotionEvent event) {
        int[] loc = this.f۱۲۱۸۸k;
        view.getLocationOnScreen(loc);
        event.offsetLocation(loc[0], loc[1]);
        return true;
    }

    /* renamed from: android.support.v7.widget.l0$a */
    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = AbstractViewOnTouchListenerCl0.this.f۱۲۱۸۳f.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.l0$b */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerCl0.this.m۱۳۳۴۶d();
        }
    }
}
