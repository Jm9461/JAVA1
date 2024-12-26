package android.support.p۰۴۷v7.widget;

import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.Cv;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.m1  reason: invalid class name */
public class View$OnLongClickListenerCm1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l  reason: contains not printable characters */
    private static View$OnLongClickListenerCm1 f۱۲۲۰۸l;

    /* renamed from: m  reason: contains not printable characters */
    private static View$OnLongClickListenerCm1 f۱۲۲۰۹m;

    /* renamed from: c  reason: contains not printable characters */
    private final View f۱۲۲۱۰c;

    /* renamed from: d  reason: contains not printable characters */
    private final CharSequence f۱۲۲۱۱d;

    /* renamed from: e  reason: contains not printable characters */
    private final int f۱۲۲۱۲e;

    /* renamed from: f  reason: contains not printable characters */
    private final Runnable f۱۲۲۱۳f = new RunnableCa();

    /* renamed from: g  reason: contains not printable characters */
    private final Runnable f۱۲۲۱۴g = new RunnableCb();

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۲۲۱۵h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۲۲۱۶i;

    /* renamed from: j  reason: contains not printable characters */
    private Cn1 f۱۲۲۱۷j;

    /* renamed from: k  reason: contains not printable characters */
    private boolean f۱۲۲۱۸k;

    /* renamed from: android.support.v7.widget.m1$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            View$OnLongClickListenerCm1.this.m۱۵۴۴۲a(false);
        }
    }

    /* renamed from: android.support.v7.widget.m1$b  reason: invalid class name */
    class RunnableCb implements Runnable {
        RunnableCb() {
        }

        public void run() {
            View$OnLongClickListenerCm1.this.m۱۵۴۴۱a();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۵۴۳۶a(View view, CharSequence tooltipText) {
        View$OnLongClickListenerCm1 m1Var = f۱۲۲۰۸l;
        if (m1Var != null && m1Var.f۱۲۲۱۰c == view) {
            m۱۵۴۳۵a((View$OnLongClickListenerCm1) null);
        }
        if (TextUtils.isEmpty(tooltipText)) {
            View$OnLongClickListenerCm1 m1Var2 = f۱۲۲۰۹m;
            if (m1Var2 != null && m1Var2.f۱۲۲۱۰c == view) {
                m1Var2.m۱۵۴۴۱a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerCm1(view, tooltipText);
    }

    private View$OnLongClickListenerCm1(View anchor, CharSequence tooltipText) {
        this.f۱۲۲۱۰c = anchor;
        this.f۱۲۲۱۱d = tooltipText;
        this.f۱۲۲۱۲e = Cv.m۱۳۰۳۹a(ViewConfiguration.get(this.f۱۲۲۱۰c.getContext()));
        m۱۵۴۳۹c();
        this.f۱۲۲۱۰c.setOnLongClickListener(this);
        this.f۱۲۲۱۰c.setOnHoverListener(this);
    }

    public boolean onLongClick(View v) {
        this.f۱۲۲۱۵h = v.getWidth() / 2;
        this.f۱۲۲۱۶i = v.getHeight() / 2;
        m۱۵۴۴۲a(true);
        return true;
    }

    public boolean onHover(View v, MotionEvent event) {
        if (this.f۱۲۲۱۷j != null && this.f۱۲۲۱۸k) {
            return false;
        }
        AccessibilityManager manager = (AccessibilityManager) this.f۱۲۲۱۰c.getContext().getSystemService("accessibility");
        if (manager.isEnabled() && manager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7) {
            if (action == 10) {
                m۱۵۴۳۹c();
                m۱۵۴۴۱a();
            }
        } else if (this.f۱۲۲۱۰c.isEnabled() && this.f۱۲۲۱۷j == null && m۱۵۴۳۷a(event)) {
            m۱۵۴۳۵a(this);
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        m۱۵۴۴۱a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۴۲a(boolean fromTouch) {
        long timeout;
        if (Cu.m۱۳۰۲۷x(this.f۱۲۲۱۰c)) {
            m۱۵۴۳۵a((View$OnLongClickListenerCm1) null);
            View$OnLongClickListenerCm1 m1Var = f۱۲۲۰۹m;
            if (m1Var != null) {
                m1Var.m۱۵۴۴۱a();
            }
            f۱۲۲۰۹m = this;
            this.f۱۲۲۱۸k = fromTouch;
            this.f۱۲۲۱۷j = new Cn1(this.f۱۲۲۱۰c.getContext());
            this.f۱۲۲۱۷j.m۱۵۴۵۸a(this.f۱۲۲۱۰c, this.f۱۲۲۱۵h, this.f۱۲۲۱۶i, this.f۱۲۲۱۸k, this.f۱۲۲۱۱d);
            this.f۱۲۲۱۰c.addOnAttachStateChangeListener(this);
            if (this.f۱۲۲۱۸k) {
                timeout = 2500;
            } else if ((Cu.m۱۳۰۲۱r(this.f۱۲۲۱۰c) & 1) == 1) {
                timeout = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                timeout = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f۱۲۲۱۰c.removeCallbacks(this.f۱۲۲۱۴g);
            this.f۱۲۲۱۰c.postDelayed(this.f۱۲۲۱۴g, timeout);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۴۴۱a() {
        if (f۱۲۲۰۹m == this) {
            f۱۲۲۰۹m = null;
            Cn1 n1Var = this.f۱۲۲۱۷j;
            if (n1Var != null) {
                n1Var.m۱۵۴۵۷a();
                this.f۱۲۲۱۷j = null;
                m۱۵۴۳۹c();
                this.f۱۲۲۱۰c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f۱۲۲۰۸l == this) {
            m۱۵۴۳۵a((View$OnLongClickListenerCm1) null);
        }
        this.f۱۲۲۱۰c.removeCallbacks(this.f۱۲۲۱۴g);
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۵۴۳۵a(View$OnLongClickListenerCm1 handler) {
        View$OnLongClickListenerCm1 m1Var = f۱۲۲۰۸l;
        if (m1Var != null) {
            m1Var.m۱۵۴۳۸b();
        }
        f۱۲۲۰۸l = handler;
        View$OnLongClickListenerCm1 m1Var2 = f۱۲۲۰۸l;
        if (m1Var2 != null) {
            m1Var2.m۱۵۴۴۰d();
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۵۴۴۰d() {
        this.f۱۲۲۱۰c.postDelayed(this.f۱۲۲۱۳f, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۵۴۳۸b() {
        this.f۱۲۲۱۰c.removeCallbacks(this.f۱۲۲۱۳f);
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۵۴۳۷a(MotionEvent event) {
        int newAnchorX = (int) event.getX();
        int newAnchorY = (int) event.getY();
        if (Math.abs(newAnchorX - this.f۱۲۲۱۵h) <= this.f۱۲۲۱۲e && Math.abs(newAnchorY - this.f۱۲۲۱۶i) <= this.f۱۲۲۱۲e) {
            return false;
        }
        this.f۱۲۲۱۵h = newAnchorX;
        this.f۱۲۲۱۶i = newAnchorY;
        return true;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۵۴۳۹c() {
        this.f۱۲۲۱۵h = Integer.MAX_VALUE;
        this.f۱۲۲۱۶i = Integer.MAX_VALUE;
    }
}
