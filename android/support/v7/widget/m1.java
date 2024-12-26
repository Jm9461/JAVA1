package android.support.v7.widget;

import android.support.v4.view.u;
import android.support.v4.view.v;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* access modifiers changed from: package-private */
public class m1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static m1 l;
    private static m1 m;

    /* renamed from: c  reason: collision with root package name */
    private final View f۲۱۷۰c;

    /* renamed from: d  reason: collision with root package name */
    private final CharSequence f۲۱۷۱d;

    /* renamed from: e  reason: collision with root package name */
    private final int f۲۱۷۲e;

    /* renamed from: f  reason: collision with root package name */
    private final Runnable f۲۱۷۳f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f۲۱۷۴g = new b();

    /* renamed from: h  reason: collision with root package name */
    private int f۲۱۷۵h;
    private int i;
    private n1 j;
    private boolean k;

    class a implements Runnable {
        a() {
        }

        public void run() {
            m1.this.a(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            m1.this.a();
        }
    }

    public static void a(View view, CharSequence tooltipText) {
        m1 m1Var = l;
        if (m1Var != null && m1Var.f۲۱۷۰c == view) {
            a((m1) null);
        }
        if (TextUtils.isEmpty(tooltipText)) {
            m1 m1Var2 = m;
            if (m1Var2 != null && m1Var2.f۲۱۷۰c == view) {
                m1Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new m1(view, tooltipText);
    }

    private m1(View anchor, CharSequence tooltipText) {
        this.f۲۱۷۰c = anchor;
        this.f۲۱۷۱d = tooltipText;
        this.f۲۱۷۲e = v.a(ViewConfiguration.get(this.f۲۱۷۰c.getContext()));
        c();
        this.f۲۱۷۰c.setOnLongClickListener(this);
        this.f۲۱۷۰c.setOnHoverListener(this);
    }

    public boolean onLongClick(View v) {
        this.f۲۱۷۵h = v.getWidth() / 2;
        this.i = v.getHeight() / 2;
        a(true);
        return true;
    }

    public boolean onHover(View v, MotionEvent event) {
        if (this.j != null && this.k) {
            return false;
        }
        AccessibilityManager manager = (AccessibilityManager) this.f۲۱۷۰c.getContext().getSystemService("accessibility");
        if (manager.isEnabled() && manager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                a();
            }
        } else if (this.f۲۱۷۰c.isEnabled() && this.j == null && a(event)) {
            a(this);
        }
        return false;
    }

    public void onViewAttachedToWindow(View v) {
    }

    public void onViewDetachedFromWindow(View v) {
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(boolean fromTouch) {
        long timeout;
        if (u.x(this.f۲۱۷۰c)) {
            a((m1) null);
            m1 m1Var = m;
            if (m1Var != null) {
                m1Var.a();
            }
            m = this;
            this.k = fromTouch;
            this.j = new n1(this.f۲۱۷۰c.getContext());
            this.j.a(this.f۲۱۷۰c, this.f۲۱۷۵h, this.i, this.k, this.f۲۱۷۱d);
            this.f۲۱۷۰c.addOnAttachStateChangeListener(this);
            if (this.k) {
                timeout = 2500;
            } else if ((u.r(this.f۲۱۷۰c) & 1) == 1) {
                timeout = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                timeout = 15000 - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f۲۱۷۰c.removeCallbacks(this.f۲۱۷۴g);
            this.f۲۱۷۰c.postDelayed(this.f۲۱۷۴g, timeout);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (m == this) {
            m = null;
            n1 n1Var = this.j;
            if (n1Var != null) {
                n1Var.a();
                this.j = null;
                c();
                this.f۲۱۷۰c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (l == this) {
            a((m1) null);
        }
        this.f۲۱۷۰c.removeCallbacks(this.f۲۱۷۴g);
    }

    private static void a(m1 handler) {
        m1 m1Var = l;
        if (m1Var != null) {
            m1Var.b();
        }
        l = handler;
        m1 m1Var2 = l;
        if (m1Var2 != null) {
            m1Var2.d();
        }
    }

    private void d() {
        this.f۲۱۷۰c.postDelayed(this.f۲۱۷۳f, (long) ViewConfiguration.getLongPressTimeout());
    }

    private void b() {
        this.f۲۱۷۰c.removeCallbacks(this.f۲۱۷۳f);
    }

    private boolean a(MotionEvent event) {
        int newAnchorX = (int) event.getX();
        int newAnchorY = (int) event.getY();
        if (Math.abs(newAnchorX - this.f۲۱۷۵h) <= this.f۲۱۷۲e && Math.abs(newAnchorY - this.i) <= this.f۲۱۷۲e) {
            return false;
        }
        this.f۲۱۷۵h = newAnchorX;
        this.i = newAnchorY;
        return true;
    }

    private void c() {
        this.f۲۱۷۵h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }
}
