package android.support.p۰۴۳v4.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۳v4.view.Cx;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Cd;
import android.support.p۰۴۳v4.view.p۰۴۵d0.Ce;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Co;

/* renamed from: android.support.v4.widget.h  reason: invalid class name */
public abstract class AbstractCh extends android.support.p۰۴۳v4.view.Cb {

    /* renamed from: m  reason: contains not printable characters */
    private static final Rect f۱۰۷۸۱m = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: c  reason: contains not printable characters */
    private final Rect f۱۰۷۸۲c = new Rect();

    /* renamed from: d  reason: contains not printable characters */
    private final Rect f۱۰۷۸۳d = new Rect();

    /* renamed from: e  reason: contains not printable characters */
    private final Rect f۱۰۷۸۴e = new Rect();

    /* renamed from: f  reason: contains not printable characters */
    private final int[] f۱۰۷۸۵f = new int[2];

    /* renamed from: g  reason: contains not printable characters */
    private final AccessibilityManager f۱۰۷۸۶g;

    /* renamed from: h  reason: contains not printable characters */
    private final View f۱۰۷۸۷h;

    /* renamed from: i  reason: contains not printable characters */
    private Cc f۱۰۷۸۸i;

    /* renamed from: j  reason: contains not printable characters */
    int f۱۰۷۸۹j = Integer.MIN_VALUE;

    /* renamed from: k  reason: contains not printable characters */
    int f۱۰۷۹۰k = Integer.MIN_VALUE;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۰۷۹۱l = Integer.MIN_VALUE;

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract int m۱۳۲۶۱a(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۲۶۴a(int i, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۲۶۵a(int i, AccessibilityEvent accessibilityEvent);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۲۷۰a(List<Integer> list);

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۳۲۷۲a(int i, int i2, Bundle bundle);

    static {
        new Ca();
        new Cb();
    }

    public AbstractCh(View host) {
        if (host != null) {
            this.f۱۰۷۸۷h = host;
            this.f۱۰۷۸۶g = (AccessibilityManager) host.getContext().getSystemService("accessibility");
            host.setFocusable(true);
            if (Cu.m۱۳۰۱۲i(host) == 0) {
                Cu.m۱۳۰۰۷f(host, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // android.support.p۰۴۳v4.view.Cb
    /* renamed from: a  reason: contains not printable characters */
    public Cd m۱۳۲۶۲a(View host) {
        if (this.f۱۰۷۸۸i == null) {
            this.f۱۰۷۸۸i = new Cc();
        }
        return this.f۱۰۷۸۸i;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final boolean m۱۳۲۷۳a(MotionEvent event) {
        if (!this.f۱۰۷۸۶g.isEnabled() || !this.f۱۰۷۸۶g.isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int virtualViewId = m۱۳۲۶۱a(event.getX(), event.getY());
            m۱۳۲۶۰h(virtualViewId);
            if (virtualViewId != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.f۱۰۷۹۱l == Integer.MIN_VALUE) {
            return false;
        } else {
            m۱۳۲۶۰h(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public final int m۱۳۲۷۴b() {
        return this.f۱۰۷۸۹j;
    }

    /* renamed from: android.support.v4.widget.h$a  reason: invalid class name */
    static class Ca implements AbstractCi<android.support.p۰۴۳v4.view.p۰۴۵d0.Cc> {
        Ca() {
        }
    }

    /* renamed from: android.support.v4.widget.h$b  reason: invalid class name */
    static class Cb implements AbstractCj<Co<android.support.p۰۴۳v4.view.p۰۴۵d0.Cc>, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc> {
        Cb() {
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public final boolean m۱۳۲۷۷b(int virtualViewId, int eventType) {
        ViewParent parent;
        if (virtualViewId == Integer.MIN_VALUE || !this.f۱۰۷۸۶g.isEnabled() || (parent = this.f۱۰۷۸۷h.getParent()) == null) {
            return false;
        }
        return Cx.m۱۳۰۵۰a(parent, this.f۱۰۷۸۷h, m۱۳۲۵۲c(virtualViewId, eventType));
    }

    /* renamed from: d  reason: contains not printable characters */
    public final void m۱۳۲۸۱d() {
        m۱۳۲۶۳a(-1, 1);
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۳۲۶۳a(int virtualViewId, int changeTypes) {
        ViewParent parent;
        if (virtualViewId != Integer.MIN_VALUE && this.f۱۰۷۸۶g.isEnabled() && (parent = this.f۱۰۷۸۷h.getParent()) != null) {
            AccessibilityEvent event = m۱۳۲۵۲c(virtualViewId, 2048);
            android.support.p۰۴۳v4.view.p۰۴۵d0.Ca.m۱۲۸۲۸a(event, changeTypes);
            Cx.m۱۳۰۵۰a(parent, this.f۱۰۷۸۷h, event);
        }
    }

    @Deprecated
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۳۲۷۹c() {
        return m۱۳۲۷۴b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۲۶۶a(int virtualViewId, boolean hasFocus) {
    }

    /* renamed from: h  reason: contains not printable characters */
    private void m۱۳۲۶۰h(int virtualViewId) {
        if (this.f۱۰۷۹۱l != virtualViewId) {
            int previousVirtualViewId = this.f۱۰۷۹۱l;
            this.f۱۰۷۹۱l = virtualViewId;
            m۱۳۲۷۷b(virtualViewId, 128);
            m۱۳۲۷۷b(previousVirtualViewId, 256);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private AccessibilityEvent m۱۳۲۵۲c(int virtualViewId, int eventType) {
        if (virtualViewId != -1) {
            return m۱۳۲۵۴d(virtualViewId, eventType);
        }
        return m۱۳۲۵۷e(eventType);
    }

    /* renamed from: e  reason: contains not printable characters */
    private AccessibilityEvent m۱۳۲۵۷e(int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        this.f۱۰۷۸۷h.onInitializeAccessibilityEvent(event);
        return event;
    }

    @Override // android.support.p۰۴۳v4.view.Cb
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۲۷۶b(View host, AccessibilityEvent event) {
        super.m۱۲۸۰۱b(host, event);
        m۱۳۲۶۹a(event);
    }

    /* renamed from: d  reason: contains not printable characters */
    private AccessibilityEvent m۱۳۲۵۴d(int virtualViewId, int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        android.support.p۰۴۳v4.view.p۰۴۵d0.Cc node = m۱۳۲۷۵b(virtualViewId);
        event.getText().add(node.m۱۲۸۶۹g());
        event.setContentDescription(node.m۱۲۸۵۹d());
        event.setScrollable(node.m۱۲۸۸۸r());
        event.setPassword(node.m۱۲۸۸۷q());
        event.setEnabled(node.m۱۲۸۸۲m());
        event.setChecked(node.m۱۲۸۷۸k());
        m۱۳۲۶۵a(virtualViewId, event);
        if (!event.getText().isEmpty() || event.getContentDescription() != null) {
            event.setClassName(node.m۱۲۸۵۳c());
            Ce.m۱۲۹۰۱a(event, this.f۱۰۷۸۷h, virtualViewId);
            event.setPackageName(this.f۱۰۷۸۷h.getContext().getPackageName());
            return event;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public android.support.p۰۴۳v4.view.p۰۴۵d0.Cc m۱۳۲۷۵b(int virtualViewId) {
        if (virtualViewId == -1) {
            return m۱۳۲۵۶e();
        }
        return m۱۳۲۵۸f(virtualViewId);
    }

    /* renamed from: e  reason: contains not printable characters */
    private android.support.p۰۴۳v4.view.p۰۴۵d0.Cc m۱۳۲۵۶e() {
        android.support.p۰۴۳v4.view.p۰۴۵d0.Cc info2 = android.support.p۰۴۳v4.view.p۰۴۵d0.Cc.m۱۲۸۳۵d(this.f۱۰۷۸۷h);
        Cu.m۱۲۹۸۶a(this.f۱۰۷۸۷h, info2);
        ArrayList<Integer> virtualViewIds = new ArrayList<>();
        m۱۳۲۷۰a(virtualViewIds);
        if (info2.m۱۲۸۴۶b() <= 0 || virtualViewIds.size() <= 0) {
            int count = virtualViewIds.size();
            for (int i = 0; i < count; i++) {
                info2.m۱۲۸۴۱a(this.f۱۰۷۸۷h, virtualViewIds.get(i).intValue());
            }
            return info2;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    @Override // android.support.p۰۴۳v4.view.Cb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۲۶۸a(View host, android.support.p۰۴۳v4.view.p۰۴۵d0.Cc info2) {
        super.m۱۲۷۹۷a(host, info2);
        m۱۳۲۶۷a(info2);
    }

    /* renamed from: f  reason: contains not printable characters */
    private android.support.p۰۴۳v4.view.p۰۴۵d0.Cc m۱۳۲۵۸f(int virtualViewId) {
        android.support.p۰۴۳v4.view.p۰۴۵d0.Cc node = android.support.p۰۴۳v4.view.p۰۴۵d0.Cc.m۱۲۸۳۶w();
        node.m۱۲۸۷۰g(true);
        node.m۱۲۸۷۲h(true);
        node.m۱۲۸۴۲a("android.view.View");
        node.m۱۲۸۵۴c(f۱۰۷۸۱m);
        node.m۱۲۸۶۰d(f۱۰۷۸۱m);
        node.m۱۲۸۴۸b(this.f۱۰۷۸۷h);
        m۱۳۲۶۴a(virtualViewId, node);
        if (node.m۱۲۸۶۹g() == null && node.m۱۲۸۵۹d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        node.m۱۲۸۳۹a(this.f۱۰۷۸۳d);
        if (!this.f۱۰۷۸۳d.equals(f۱۰۷۸۱m)) {
            int actions = node.m۱۲۸۳۷a();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                node.m۱۲۸۶۴e(this.f۱۰۷۸۷h.getContext().getPackageName());
                node.m۱۲۸۵۶c(this.f۱۰۷۸۷h, virtualViewId);
                if (this.f۱۰۷۸۹j == virtualViewId) {
                    node.m۱۲۸۴۴a(true);
                    node.m۱۲۸۳۸a(128);
                } else {
                    node.m۱۲۸۴۴a(false);
                    node.m۱۲۸۳۸a(64);
                }
                boolean isFocused = this.f۱۰۷۹۰k == virtualViewId;
                if (isFocused) {
                    node.m۱۲۸۳۸a(2);
                } else if (node.m۱۲۸۸۴n()) {
                    node.m۱۲۸۳۸a(1);
                }
                node.m۱۲۸۷۳i(isFocused);
                this.f۱۰۷۸۷h.getLocationOnScreen(this.f۱۰۷۸۵f);
                node.m۱۲۸۴۷b(this.f۱۰۷۸۲c);
                if (this.f۱۰۷۸۲c.equals(f۱۰۷۸۱m)) {
                    node.m۱۲۸۳۹a(this.f۱۰۷۸۲c);
                    if (node.f۱۰۵۹۳b != -1) {
                        android.support.p۰۴۳v4.view.p۰۴۵d0.Cc parentNode = android.support.p۰۴۳v4.view.p۰۴۵d0.Cc.m۱۲۸۳۶w();
                        for (int virtualDescendantId = node.f۱۰۵۹۳b; virtualDescendantId != -1; virtualDescendantId = parentNode.f۱۰۵۹۳b) {
                            parentNode.m۱۲۸۴۹b(this.f۱۰۷۸۷h, -1);
                            parentNode.m۱۲۸۵۴c(f۱۰۷۸۱m);
                            m۱۳۲۶۴a(virtualDescendantId, parentNode);
                            parentNode.m۱۲۸۳۹a(this.f۱۰۷۸۳d);
                            Rect rect = this.f۱۰۷۸۲c;
                            Rect rect2 = this.f۱۰۷۸۳d;
                            rect.offset(rect2.left, rect2.top);
                        }
                        parentNode.m۱۲۸۹۱u();
                    }
                    this.f۱۰۷۸۲c.offset(this.f۱۰۷۸۵f[0] - this.f۱۰۷۸۷h.getScrollX(), this.f۱۰۷۸۵f[1] - this.f۱۰۷۸۷h.getScrollY());
                }
                if (this.f۱۰۷۸۷h.getLocalVisibleRect(this.f۱۰۷۸۴e)) {
                    this.f۱۰۷۸۴e.offset(this.f۱۰۷۸۵f[0] - this.f۱۰۷۸۷h.getScrollX(), this.f۱۰۷۸۵f[1] - this.f۱۰۷۸۷h.getScrollY());
                    if (this.f۱۰۷۸۲c.intersect(this.f۱۰۷۸۴e)) {
                        node.m۱۲۸۶۰d(this.f۱۰۷۸۲c);
                        if (m۱۳۲۵۱a(this.f۱۰۷۸۲c)) {
                            node.m۱۲۸۸۳n(true);
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
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۲۷۸b(int virtualViewId, int action, Bundle arguments) {
        if (virtualViewId != -1) {
            return m۱۳۲۵۳c(virtualViewId, action, arguments);
        }
        return m۱۳۲۵۰a(action, arguments);
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۲۵۰a(int action, Bundle arguments) {
        return Cu.m۱۲۹۹۳a(this.f۱۰۷۸۷h, action, arguments);
    }

    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۳۲۵۳c(int virtualViewId, int action, Bundle arguments) {
        if (action == 1) {
            return m۱۳۲۸۰c(virtualViewId);
        }
        if (action == 2) {
            return m۱۳۲۷۱a(virtualViewId);
        }
        if (action == 64) {
            return m۱۳۲۵۹g(virtualViewId);
        }
        if (action != 128) {
            return m۱۳۲۷۲a(virtualViewId, action, arguments);
        }
        return m۱۳۲۵۵d(virtualViewId);
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۳۲۵۱a(Rect localRect) {
        if (localRect == null || localRect.isEmpty() || this.f۱۰۷۸۷h.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent viewParent = this.f۱۰۷۸۷h.getParent();
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

    /* renamed from: g  reason: contains not printable characters */
    private boolean m۱۳۲۵۹g(int virtualViewId) {
        int i;
        if (!this.f۱۰۷۸۶g.isEnabled() || !this.f۱۰۷۸۶g.isTouchExplorationEnabled() || (i = this.f۱۰۷۸۹j) == virtualViewId) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            m۱۳۲۵۵d(i);
        }
        this.f۱۰۷۸۹j = virtualViewId;
        this.f۱۰۷۸۷h.invalidate();
        m۱۳۲۷۷b(virtualViewId, 32768);
        return true;
    }

    /* renamed from: d  reason: contains not printable characters */
    private boolean m۱۳۲۵۵d(int virtualViewId) {
        if (this.f۱۰۷۸۹j != virtualViewId) {
            return false;
        }
        this.f۱۰۷۸۹j = Integer.MIN_VALUE;
        this.f۱۰۷۸۷h.invalidate();
        m۱۳۲۷۷b(virtualViewId, 65536);
        return true;
    }

    /* renamed from: c  reason: contains not printable characters */
    public final boolean m۱۳۲۸۰c(int virtualViewId) {
        int i;
        if ((!this.f۱۰۷۸۷h.isFocused() && !this.f۱۰۷۸۷h.requestFocus()) || (i = this.f۱۰۷۹۰k) == virtualViewId) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            m۱۳۲۷۱a(i);
        }
        this.f۱۰۷۹۰k = virtualViewId;
        m۱۳۲۶۶a(virtualViewId, true);
        m۱۳۲۷۷b(virtualViewId, 8);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final boolean m۱۳۲۷۱a(int virtualViewId) {
        if (this.f۱۰۷۹۰k != virtualViewId) {
            return false;
        }
        this.f۱۰۷۹۰k = Integer.MIN_VALUE;
        m۱۳۲۶۶a(virtualViewId, false);
        m۱۳۲۷۷b(virtualViewId, 8);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۲۶۹a(AccessibilityEvent event) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۲۶۷a(android.support.p۰۴۳v4.view.p۰۴۵d0.Cc node) {
    }

    /* renamed from: android.support.v4.widget.h$c  reason: invalid class name */
    private class Cc extends Cd {
        Cc() {
        }

        @Override // android.support.p۰۴۳v4.view.p۰۴۵d0.Cd
        /* renamed from: a  reason: contains not printable characters */
        public android.support.p۰۴۳v4.view.p۰۴۵d0.Cc m۱۳۲۸۲a(int virtualViewId) {
            return android.support.p۰۴۳v4.view.p۰۴۵d0.Cc.m۱۲۸۳۱a(AbstractCh.this.m۱۳۲۷۵b(virtualViewId));
        }

        @Override // android.support.p۰۴۳v4.view.p۰۴۵d0.Cd
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۳۲۸۳a(int virtualViewId, int action, Bundle arguments) {
            return AbstractCh.this.m۱۳۲۷۸b(virtualViewId, action, arguments);
        }

        @Override // android.support.p۰۴۳v4.view.p۰۴۵d0.Cd
        /* renamed from: b  reason: contains not printable characters */
        public android.support.p۰۴۳v4.view.p۰۴۵d0.Cc m۱۳۲۸۴b(int focusType) {
            int focusedId = focusType == 2 ? AbstractCh.this.f۱۰۷۸۹j : AbstractCh.this.f۱۰۷۹۰k;
            if (focusedId == Integer.MIN_VALUE) {
                return null;
            }
            return m۱۳۲۸۲a(focusedId);
        }
    }
}
