package android.support.v4.widget;

import a.b.g.g.o;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.d0.d;
import android.support.v4.view.d0.e;
import android.support.v4.view.u;
import android.support.v4.view.x;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

public abstract class h extends android.support.v4.view.b {
    private static final Rect m = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: c  reason: collision with root package name */
    private final Rect f۱۴۵۲c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    private final Rect f۱۴۵۳d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f۱۴۵۴e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private final int[] f۱۴۵۵f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    private final AccessibilityManager f۱۴۵۶g;

    /* renamed from: h  reason: collision with root package name */
    private final View f۱۴۵۷h;
    private c i;
    int j = Integer.MIN_VALUE;
    int k = Integer.MIN_VALUE;
    private int l = Integer.MIN_VALUE;

    /* access modifiers changed from: protected */
    public abstract int a(float f2, float f3);

    /* access modifiers changed from: protected */
    public abstract void a(int i2, android.support.v4.view.d0.c cVar);

    /* access modifiers changed from: protected */
    public abstract void a(int i2, AccessibilityEvent accessibilityEvent);

    /* access modifiers changed from: protected */
    public abstract void a(List<Integer> list);

    /* access modifiers changed from: protected */
    public abstract boolean a(int i2, int i3, Bundle bundle);

    static {
        new a();
        new b();
    }

    public h(View host) {
        if (host != null) {
            this.f۱۴۵۷h = host;
            this.f۱۴۵۶g = (AccessibilityManager) host.getContext().getSystemService("accessibility");
            host.setFocusable(true);
            if (u.i(host) == 0) {
                u.f(host, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // android.support.v4.view.b
    public d a(View host) {
        if (this.i == null) {
            this.i = new c();
        }
        return this.i;
    }

    public final boolean a(MotionEvent event) {
        if (!this.f۱۴۵۶g.isEnabled() || !this.f۱۴۵۶g.isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int virtualViewId = a(event.getX(), event.getY());
            h(virtualViewId);
            if (virtualViewId != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.l == Integer.MIN_VALUE) {
            return false;
        } else {
            h(Integer.MIN_VALUE);
            return true;
        }
    }

    public final int b() {
        return this.j;
    }

    static class a implements i<android.support.v4.view.d0.c> {
        a() {
        }
    }

    static class b implements j<o<android.support.v4.view.d0.c>, android.support.v4.view.d0.c> {
        b() {
        }
    }

    public final boolean b(int virtualViewId, int eventType) {
        ViewParent parent;
        if (virtualViewId == Integer.MIN_VALUE || !this.f۱۴۵۶g.isEnabled() || (parent = this.f۱۴۵۷h.getParent()) == null) {
            return false;
        }
        return x.a(parent, this.f۱۴۵۷h, c(virtualViewId, eventType));
    }

    public final void d() {
        a(-1, 1);
    }

    public final void a(int virtualViewId, int changeTypes) {
        ViewParent parent;
        if (virtualViewId != Integer.MIN_VALUE && this.f۱۴۵۶g.isEnabled() && (parent = this.f۱۴۵۷h.getParent()) != null) {
            AccessibilityEvent event = c(virtualViewId, 2048);
            android.support.v4.view.d0.a.a(event, changeTypes);
            x.a(parent, this.f۱۴۵۷h, event);
        }
    }

    @Deprecated
    public int c() {
        return b();
    }

    /* access modifiers changed from: protected */
    public void a(int virtualViewId, boolean hasFocus) {
    }

    private void h(int virtualViewId) {
        if (this.l != virtualViewId) {
            int previousVirtualViewId = this.l;
            this.l = virtualViewId;
            b(virtualViewId, 128);
            b(previousVirtualViewId, 256);
        }
    }

    private AccessibilityEvent c(int virtualViewId, int eventType) {
        if (virtualViewId != -1) {
            return d(virtualViewId, eventType);
        }
        return e(eventType);
    }

    private AccessibilityEvent e(int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        this.f۱۴۵۷h.onInitializeAccessibilityEvent(event);
        return event;
    }

    @Override // android.support.v4.view.b
    public void b(View host, AccessibilityEvent event) {
        super.b(host, event);
        a(event);
    }

    private AccessibilityEvent d(int virtualViewId, int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        android.support.v4.view.d0.c node = b(virtualViewId);
        event.getText().add(node.g());
        event.setContentDescription(node.d());
        event.setScrollable(node.r());
        event.setPassword(node.q());
        event.setEnabled(node.m());
        event.setChecked(node.k());
        a(virtualViewId, event);
        if (!event.getText().isEmpty() || event.getContentDescription() != null) {
            event.setClassName(node.c());
            e.a(event, this.f۱۴۵۷h, virtualViewId);
            event.setPackageName(this.f۱۴۵۷h.getContext().getPackageName());
            return event;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* access modifiers changed from: package-private */
    public android.support.v4.view.d0.c b(int virtualViewId) {
        if (virtualViewId == -1) {
            return e();
        }
        return f(virtualViewId);
    }

    private android.support.v4.view.d0.c e() {
        android.support.v4.view.d0.c info2 = android.support.v4.view.d0.c.d(this.f۱۴۵۷h);
        u.a(this.f۱۴۵۷h, info2);
        ArrayList<Integer> virtualViewIds = new ArrayList<>();
        a(virtualViewIds);
        if (info2.b() <= 0 || virtualViewIds.size() <= 0) {
            int count = virtualViewIds.size();
            for (int i2 = 0; i2 < count; i2++) {
                info2.a(this.f۱۴۵۷h, virtualViewIds.get(i2).intValue());
            }
            return info2;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    @Override // android.support.v4.view.b
    public void a(View host, android.support.v4.view.d0.c info2) {
        super.a(host, info2);
        a(info2);
    }

    private android.support.v4.view.d0.c f(int virtualViewId) {
        android.support.v4.view.d0.c node = android.support.v4.view.d0.c.w();
        node.g(true);
        node.h(true);
        node.a("android.view.View");
        node.c(m);
        node.d(m);
        node.b(this.f۱۴۵۷h);
        a(virtualViewId, node);
        if (node.g() == null && node.d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        node.a(this.f۱۴۵۳d);
        if (!this.f۱۴۵۳d.equals(m)) {
            int actions = node.a();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                node.e(this.f۱۴۵۷h.getContext().getPackageName());
                node.c(this.f۱۴۵۷h, virtualViewId);
                if (this.j == virtualViewId) {
                    node.a(true);
                    node.a(128);
                } else {
                    node.a(false);
                    node.a(64);
                }
                boolean isFocused = this.k == virtualViewId;
                if (isFocused) {
                    node.a(2);
                } else if (node.n()) {
                    node.a(1);
                }
                node.i(isFocused);
                this.f۱۴۵۷h.getLocationOnScreen(this.f۱۴۵۵f);
                node.b(this.f۱۴۵۲c);
                if (this.f۱۴۵۲c.equals(m)) {
                    node.a(this.f۱۴۵۲c);
                    if (node.f۱۳۳۹b != -1) {
                        android.support.v4.view.d0.c parentNode = android.support.v4.view.d0.c.w();
                        for (int virtualDescendantId = node.f۱۳۳۹b; virtualDescendantId != -1; virtualDescendantId = parentNode.f۱۳۳۹b) {
                            parentNode.b(this.f۱۴۵۷h, -1);
                            parentNode.c(m);
                            a(virtualDescendantId, parentNode);
                            parentNode.a(this.f۱۴۵۳d);
                            Rect rect = this.f۱۴۵۲c;
                            Rect rect2 = this.f۱۴۵۳d;
                            rect.offset(rect2.left, rect2.top);
                        }
                        parentNode.u();
                    }
                    this.f۱۴۵۲c.offset(this.f۱۴۵۵f[0] - this.f۱۴۵۷h.getScrollX(), this.f۱۴۵۵f[1] - this.f۱۴۵۷h.getScrollY());
                }
                if (this.f۱۴۵۷h.getLocalVisibleRect(this.f۱۴۵۴e)) {
                    this.f۱۴۵۴e.offset(this.f۱۴۵۵f[0] - this.f۱۴۵۷h.getScrollX(), this.f۱۴۵۵f[1] - this.f۱۴۵۷h.getScrollY());
                    if (this.f۱۴۵۲c.intersect(this.f۱۴۵۴e)) {
                        node.d(this.f۱۴۵۲c);
                        if (a(this.f۱۴۵۲c)) {
                            node.n(true);
                        }
                    }
                }
                return node;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int virtualViewId, int action, Bundle arguments) {
        if (virtualViewId != -1) {
            return c(virtualViewId, action, arguments);
        }
        return a(action, arguments);
    }

    private boolean a(int action, Bundle arguments) {
        return u.a(this.f۱۴۵۷h, action, arguments);
    }

    private boolean c(int virtualViewId, int action, Bundle arguments) {
        if (action == 1) {
            return c(virtualViewId);
        }
        if (action == 2) {
            return a(virtualViewId);
        }
        if (action == 64) {
            return g(virtualViewId);
        }
        if (action != 128) {
            return a(virtualViewId, action, arguments);
        }
        return d(virtualViewId);
    }

    private boolean a(Rect localRect) {
        if (localRect == null || localRect.isEmpty() || this.f۱۴۵۷h.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent viewParent = this.f۱۴۵۷h.getParent();
        while (viewParent instanceof View) {
            View view = (View) viewParent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            viewParent = view.getParent();
        }
        if (viewParent != null) {
            return true;
        }
        return false;
    }

    private boolean g(int virtualViewId) {
        int i2;
        if (!this.f۱۴۵۶g.isEnabled() || !this.f۱۴۵۶g.isTouchExplorationEnabled() || (i2 = this.j) == virtualViewId) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            d(i2);
        }
        this.j = virtualViewId;
        this.f۱۴۵۷h.invalidate();
        b(virtualViewId, 32768);
        return true;
    }

    private boolean d(int virtualViewId) {
        if (this.j != virtualViewId) {
            return false;
        }
        this.j = Integer.MIN_VALUE;
        this.f۱۴۵۷h.invalidate();
        b(virtualViewId, 65536);
        return true;
    }

    public final boolean c(int virtualViewId) {
        int i2;
        if ((!this.f۱۴۵۷h.isFocused() && !this.f۱۴۵۷h.requestFocus()) || (i2 = this.k) == virtualViewId) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            a(i2);
        }
        this.k = virtualViewId;
        a(virtualViewId, true);
        b(virtualViewId, 8);
        return true;
    }

    public final boolean a(int virtualViewId) {
        if (this.k != virtualViewId) {
            return false;
        }
        this.k = Integer.MIN_VALUE;
        a(virtualViewId, false);
        b(virtualViewId, 8);
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(AccessibilityEvent event) {
    }

    /* access modifiers changed from: protected */
    public void a(android.support.v4.view.d0.c node) {
    }

    private class c extends d {
        c() {
        }

        @Override // android.support.v4.view.d0.d
        public android.support.v4.view.d0.c a(int virtualViewId) {
            return android.support.v4.view.d0.c.a(h.this.b(virtualViewId));
        }

        @Override // android.support.v4.view.d0.d
        public boolean a(int virtualViewId, int action, Bundle arguments) {
            return h.this.b(virtualViewId, action, arguments);
        }

        @Override // android.support.v4.view.d0.d
        public android.support.v4.view.d0.c b(int focusType) {
            int focusedId = focusType == 2 ? h.this.j : h.this.k;
            if (focusedId == Integer.MIN_VALUE) {
                return null;
            }
            return a(focusedId);
        }
    }
}
