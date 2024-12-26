package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v7.view.menu.t;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

public abstract class l0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    private final float f۲۱۴۵c;

    /* renamed from: d  reason: collision with root package name */
    private final int f۲۱۴۶d;

    /* renamed from: e  reason: collision with root package name */
    private final int f۲۱۴۷e;

    /* renamed from: f  reason: collision with root package name */
    final View f۲۱۴۸f;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f۲۱۴۹g;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f۲۱۵۰h;
    private boolean i;
    private int j;
    private final int[] k = new int[2];

    public abstract t a();

    /* access modifiers changed from: protected */
    public abstract boolean b();

    public l0(View src) {
        this.f۲۱۴۸f = src;
        src.setLongClickable(true);
        src.addOnAttachStateChangeListener(this);
        this.f۲۱۴۵c = (float) ViewConfiguration.get(src.getContext()).getScaledTouchSlop();
        this.f۲۱۴۶d = ViewConfiguration.getTapTimeout();
        this.f۲۱۴۷e = (this.f۲۱۴۶d + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public boolean onTouch(View v, MotionEvent event) {
        boolean forwarding;
        boolean wasForwarding = this.i;
        if (wasForwarding) {
            forwarding = a(event) || !c();
        } else {
            forwarding = b(event) && b();
            if (forwarding) {
                long now = SystemClock.uptimeMillis();
                MotionEvent e2 = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                this.f۲۱۴۸f.onTouchEvent(e2);
                e2.recycle();
            }
        }
        this.i = forwarding;
        if (forwarding || wasForwarding) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        this.i = false;
        this.j = -1;
        Runnable runnable = this.f۲۱۴۹g;
        if (runnable != null) {
            this.f۲۱۴۸f.removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean c() {
        t popup = a();
        if (popup == null || !popup.e()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.l0.b(android.view.MotionEvent):boolean");
    }

    private void e() {
        Runnable runnable = this.f۲۱۵۰h;
        if (runnable != null) {
            this.f۲۱۴۸f.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f۲۱۴۹g;
        if (runnable2 != null) {
            this.f۲۱۴۸f.removeCallbacks(runnable2);
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e();
        View src = this.f۲۱۴۸f;
        if (src.isEnabled() && !src.isLongClickable() && b()) {
            src.getParent().requestDisallowInterceptTouchEvent(true);
            long now = SystemClock.uptimeMillis();
            MotionEvent e2 = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
            src.onTouchEvent(e2);
            e2.recycle();
            this.i = true;
        }
    }

    private boolean a(MotionEvent srcEvent) {
        i0 dst;
        View src = this.f۲۱۴۸f;
        t popup = a();
        if (popup == null || !popup.e() || (dst = (i0) popup.f()) == null || !dst.isShown()) {
            return false;
        }
        MotionEvent dstEvent = MotionEvent.obtainNoHistory(srcEvent);
        a(src, dstEvent);
        b(dst, dstEvent);
        boolean handled = dst.a(dstEvent, this.j);
        dstEvent.recycle();
        int action = srcEvent.getActionMasked();
        boolean keepForwarding = (action == 1 || action == 3) ? false : true;
        if (!handled || !keepForwarding) {
            return false;
        }
        return true;
    }

    private static boolean a(View view, float localX, float localY, float slop) {
        return localX >= (-slop) && localY >= (-slop) && localX < ((float) (view.getRight() - view.getLeft())) + slop && localY < ((float) (view.getBottom() - view.getTop())) + slop;
    }

    private boolean b(View view, MotionEvent event) {
        int[] loc = this.k;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) (-loc[0]), (float) (-loc[1]));
        return true;
    }

    private boolean a(View view, MotionEvent event) {
        int[] loc = this.k;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float) loc[0], (float) loc[1]);
        return true;
    }

    /* access modifiers changed from: private */
    public class a implements Runnable {
        a() {
        }

        public void run() {
            ViewParent parent = l0.this.f۲۱۴۸f.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* access modifiers changed from: private */
    public class b implements Runnable {
        b() {
        }

        public void run() {
            l0.this.d();
        }
    }
}
