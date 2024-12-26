package android.support.v7.widget;

import android.support.v4.view.Cu;
import android.support.v4.view.Cv;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v7.widget.m1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class ViewOnLongClickListenerCm1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l, reason: contains not printable characters */
    private static ViewOnLongClickListenerCm1 f۱۲۲۰۸l;

    /* renamed from: m, reason: contains not printable characters */
    private static ViewOnLongClickListenerCm1 f۱۲۲۰۹m;

    /* renamed from: c, reason: contains not printable characters */
    private final View f۱۲۲۱۰c;

    /* renamed from: d, reason: contains not printable characters */
    private final CharSequence f۱۲۲۱۱d;

    /* renamed from: e, reason: contains not printable characters */
    private final int f۱۲۲۱۲e;

    /* renamed from: f, reason: contains not printable characters */
    private final Runnable f۱۲۲۱۳f = new a();

    /* renamed from: g, reason: contains not printable characters */
    private final Runnable f۱۲۲۱۴g = new b();

    /* renamed from: h, reason: contains not printable characters */
    private int f۱۲۲۱۵h;

    /* renamed from: i, reason: contains not printable characters */
    private int f۱۲۲۱۶i;

    /* renamed from: j, reason: contains not printable characters */
    private Cn1 f۱۲۲۱۷j;

    /* renamed from: k, reason: contains not printable characters */
    private boolean f۱۲۲۱۸k;

    /* renamed from: android.support.v7.widget.m1$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerCm1.this.m۱۳۳۷۲a(false);
        }
    }

    /* renamed from: android.support.v7.widget.m1$b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewOnLongClickListenerCm1.this.m۱۳۳۷۱a();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۳۳۶۶a(View view, CharSequence tooltipText) {
        ViewOnLongClickListenerCm1 viewOnLongClickListenerCm1 = f۱۲۲۰۸l;
        if (viewOnLongClickListenerCm1 != null && viewOnLongClickListenerCm1.f۱۲۲۱۰c == view) {
            m۱۳۳۶۵a((ViewOnLongClickListenerCm1) null);
        }
        if (TextUtils.isEmpty(tooltipText)) {
            ViewOnLongClickListenerCm1 viewOnLongClickListenerCm12 = f۱۲۲۰۹m;
            if (viewOnLongClickListenerCm12 != null && viewOnLongClickListenerCm12.f۱۲۲۱۰c == view) {
                viewOnLongClickListenerCm12.m۱۳۳۷۱a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new ViewOnLongClickListenerCm1(view, tooltipText);
    }

    private ViewOnLongClickListenerCm1(View anchor, CharSequence tooltipText) {
        this.f۱۲۲۱۰c = anchor;
        this.f۱۲۲۱۱d = tooltipText;
        this.f۱۲۲۱۲e = Cv.m۱۰۹۶۹a(ViewConfiguration.get(this.f۱۲۲۱۰c.getContext()));
        m۱۳۳۶۹c();
        this.f۱۲۲۱۰c.setOnLongClickListener(this);
        this.f۱۲۲۱۰c.setOnHoverListener(this);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View v) {
        this.f۱۲۲۱۵h = v.getWidth() / 2;
        this.f۱۲۲۱۶i = v.getHeight() / 2;
        m۱۳۳۷۲a(true);
        return true;
    }

    @Override // android.view.View.OnHoverListener
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
                m۱۳۳۶۹c();
                m۱۳۳۷۱a();
            }
        } else if (this.f۱۲۲۱۰c.isEnabled() && this.f۱۲۲۱۷j == null && m۱۳۳۶۷a(event)) {
            m۱۳۳۶۵a(this);
        }
        return false;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        m۱۳۳۷۱a();
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۷۲a(boolean fromTouch) {
        long timeout;
        if (!Cu.m۱۰۹۵۷x(this.f۱۲۲۱۰c)) {
            return;
        }
        m۱۳۳۶۵a((ViewOnLongClickListenerCm1) null);
        ViewOnLongClickListenerCm1 viewOnLongClickListenerCm1 = f۱۲۲۰۹m;
        if (viewOnLongClickListenerCm1 != null) {
            viewOnLongClickListenerCm1.m۱۳۳۷۱a();
        }
        f۱۲۲۰۹m = this;
        this.f۱۲۲۱۸k = fromTouch;
        this.f۱۲۲۱۷j = new Cn1(this.f۱۲۲۱۰c.getContext());
        this.f۱۲۲۱۷j.m۱۳۳۸۸a(this.f۱۲۲۱۰c, this.f۱۲۲۱۵h, this.f۱۲۲۱۶i, this.f۱۲۲۱۸k, this.f۱۲۲۱۱d);
        this.f۱۲۲۱۰c.addOnAttachStateChangeListener(this);
        if (this.f۱۲۲۱۸k) {
            timeout = 2500;
        } else if ((Cu.m۱۰۹۵۱r(this.f۱۲۲۱۰c) & 1) == 1) {
            timeout = 3000 - ViewConfiguration.getLongPressTimeout();
        } else {
            timeout = 15000 - ViewConfiguration.getLongPressTimeout();
        }
        this.f۱۲۲۱۰c.removeCallbacks(this.f۱۲۲۱۴g);
        this.f۱۲۲۱۰c.postDelayed(this.f۱۲۲۱۴g, timeout);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۳۷۱a() {
        if (f۱۲۲۰۹m == this) {
            f۱۲۲۰۹m = null;
            Cn1 cn1 = this.f۱۲۲۱۷j;
            if (cn1 != null) {
                cn1.m۱۳۳۸۷a();
                this.f۱۲۲۱۷j = null;
                m۱۳۳۶۹c();
                this.f۱۲۲۱۰c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f۱۲۲۰۸l == this) {
            m۱۳۳۶۵a((ViewOnLongClickListenerCm1) null);
        }
        this.f۱۲۲۱۰c.removeCallbacks(this.f۱۲۲۱۴g);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static void m۱۳۳۶۵a(ViewOnLongClickListenerCm1 handler) {
        ViewOnLongClickListenerCm1 viewOnLongClickListenerCm1 = f۱۲۲۰۸l;
        if (viewOnLongClickListenerCm1 != null) {
            viewOnLongClickListenerCm1.m۱۳۳۶۸b();
        }
        f۱۲۲۰۸l = handler;
        ViewOnLongClickListenerCm1 viewOnLongClickListenerCm12 = f۱۲۲۰۸l;
        if (viewOnLongClickListenerCm12 != null) {
            viewOnLongClickListenerCm12.m۱۳۳۷۰d();
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۳۳۷۰d() {
        this.f۱۲۲۱۰c.postDelayed(this.f۱۲۲۱۳f, ViewConfiguration.getLongPressTimeout());
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۱۳۳۶۸b() {
        this.f۱۲۲۱۰c.removeCallbacks(this.f۱۲۲۱۳f);
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۳۳۶۷a(MotionEvent event) {
        int newAnchorX = (int) event.getX();
        int newAnchorY = (int) event.getY();
        if (Math.abs(newAnchorX - this.f۱۲۲۱۵h) <= this.f۱۲۲۱۲e && Math.abs(newAnchorY - this.f۱۲۲۱۶i) <= this.f۱۲۲۱۲e) {
            return false;
        }
        this.f۱۲۲۱۵h = newAnchorX;
        this.f۱۲۲۱۶i = newAnchorY;
        return true;
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۳۳۶۹c() {
        this.f۱۲۲۱۵h = Integer.MAX_VALUE;
        this.f۱۲۲۱۶i = Integer.MAX_VALUE;
    }
}
