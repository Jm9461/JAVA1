package android.support.p۰۴۷v7.widget;

import android.os.SystemClock;
import android.support.p۰۴۷v7.view.menu.AbstractCt;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: android.support.v7.widget.l0  reason: invalid class name */
public abstract class AbstractView$OnTouchListenerCl0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: contains not printable characters */
    private final float f۱۲۱۸۰c;

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۲۱۸۱d;

    /* renamed from: e  reason: contains not printable characters */
    private final int f۱۲۱۸۲e;

    /* renamed from: f  reason: contains not printable characters */
    final View f۱۲۱۸۳f;

    /* renamed from: g  reason: contains not printable characters */
    private Runnable f۱۲۱۸۴g;

    /* renamed from: h  reason: contains not printable characters */
    private Runnable f۱۲۱۸۵h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۲۱۸۶i;

    /* renamed from: j  reason: contains not printable characters */
    private int f۱۲۱۸۷j;

    /* renamed from: k  reason: contains not printable characters */
    private final int[] f۱۲۱۸۸k = new int[2];

    /* renamed from: a  reason: contains not printable characters */
    public abstract AbstractCt m۱۵۴۱۳a();

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public abstract boolean m۱۵۴۱۴b();

    public AbstractView$OnTouchListenerCl0(View src) {
        this.f۱۲۱۸۳f = src;
        src.setLongClickable(true);
        src.addOnAttachStateChangeListener(this);
        this.f۱۲۱۸۰c = (float) ViewConfiguration.get(src.getContext()).getScaledTouchSlop();
        this.f۱۲۱۸۱d = ViewConfiguration.getTapTimeout();
        this.f۱۲۱۸۲e = (this.f۱۲۱۸۱d + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View v, MotionEvent event) {
        boolean forwarding;
        boolean wasForwarding = this.f۱۲۱۸۶i;
        if (wasForwarding) {
            forwarding = m۱۵۴۰۷a(event) || !m۱۵۴۱۵c();
        } else {
            forwarding = m۱۵۴۱۰b(event) && m۱۵۴۱۴b();
            if (forwarding) {
                long now = SystemClock.uptimeMillis();
                MotionEvent e = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                this.f۱۲۱۸۳f.onTouchEvent(e);
                e.recycle();
            }
        }
        this.f۱۲۱۸۶i = forwarding;
        if (forwarding || wasForwarding) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        this.f۱۲۱۸۶i = false;
        this.f۱۲۱۸۷j = -1;
        Runnable runnable = this.f۱۲۱۸۴g;
        if (runnable != null) {
            this.f۱۲۱۸۳f.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۵۴۱۵c() {
        AbstractCt popup = m۱۵۴۱۳a();
        if (popup == null || !popup.m۱۳۹۸۶e()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006f;
     */
    /* renamed from: b  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m۱۵۴۱۰b(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.AbstractView$OnTouchListenerCl0.m۱۵۴۱۰b(android.view.MotionEvent):boolean");
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۵۴۱۲e() {
        Runnable runnable = this.f۱۲۱۸۵h;
        if (runnable != null) {
            this.f۱۲۱۸۳f.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f۱۲۱۸۴g;
        if (runnable2 != null) {
            this.f۱۲۱۸۳f.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۵۴۱۶d() {
        m۱۵۴۱۲e();
        View src = this.f۱۲۱۸۳f;
        if (src.isEnabled() && !src.isLongClickable() && m۱۵۴۱۴b()) {
            src.getParent().requestDisallowInterceptTouchEvent(true);
            long now = SystemClock.uptimeMillis();
            MotionEvent e = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            src.onTouchEvent(e);
            e.recycle();
            this.f۱۲۱۸۶i = true;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۵۴۰۷a(MotionEvent srcEvent) {
        Ci0 dst;
        View src = this.f۱۲۱۸۳f;
        AbstractCt popup = m۱۵۴۱۳a();
        if (popup == null || !popup.m۱۳۹۸۶e() || (dst = (Ci0) popup.m۱۳۹۸۷f()) == null || !dst.isShown()) {
            return false;
        }
        MotionEvent dstEvent = MotionEvent.obtainNoHistory(srcEvent);
        m۱۵۴۰۹a(src, dstEvent);
        m۱۵۴۱۱b(dst, dstEvent);
        boolean handled = dst.m۱۵۲۷۷a(dstEvent, this.f۱۲۱۸۷j);
        dstEvent.recycle();
        int action = srcEvent.getActionMasked();
        boolean keepForwarding = (action == 1 || action == 3) ? false : true;
        if (!handled || !keepForwarding) {
            return false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۵۴۰۸a(View view, float localX, float localY, float slop) {
        return localX >= (-slop) && localY >= (-slop) && localX < ((float) (view.getRight() - view.getLeft())) + slop && localY < ((float) (view.getBottom() - view.getTop())) + slop;
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۵۴۱۱b(View view, MotionEvent event) {
        int[] loc = this.f۱۲۱۸۸k;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) (-loc[0]), (float) (-loc[1]));
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۵۴۰۹a(View view, MotionEvent event) {
        int[] loc = this.f۱۲۱۸۸k;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) loc[0], (float) loc[1]);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.l0$a  reason: invalid class name */
    public class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            ViewParent parent = AbstractView$OnTouchListenerCl0.this.f۱۲۱۸۳f.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.l0$b  reason: invalid class name */
    public class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            AbstractView$OnTouchListenerCl0.this.m۱۵۴۱۶d();
        }
    }
}
