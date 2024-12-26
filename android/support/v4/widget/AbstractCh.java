package android.support.v4.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.view.Cb;
import android.support.v4.view.Cu;
import android.support.v4.view.Cx;
import android.support.v4.view.p۲۰۳d0.Ca;
import android.support.v4.view.p۲۰۳d0.Cc;
import android.support.v4.view.p۲۰۳d0.Cd;
import android.support.v4.view.p۲۰۳d0.Ce;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Co;

/* renamed from: android.support.v4.widget.h, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCh extends Cb {

    /* renamed from: m, reason: contains not printable characters */
    private static final Rect f۱۰۷۸۱m = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: g, reason: contains not printable characters */
    private final AccessibilityManager f۱۰۷۸۶g;

    /* renamed from: h, reason: contains not printable characters */
    private final View f۱۰۷۸۷h;

    /* renamed from: i, reason: contains not printable characters */
    private c f۱۰۷۸۸i;

    /* renamed from: c, reason: contains not printable characters */
    private final Rect f۱۰۷۸۲c = new Rect();

    /* renamed from: d, reason: contains not printable characters */
    private final Rect f۱۰۷۸۳d = new Rect();

    /* renamed from: e, reason: contains not printable characters */
    private final Rect f۱۰۷۸۴e = new Rect();

    /* renamed from: f, reason: contains not printable characters */
    private final int[] f۱۰۷۸۵f = new int[2];

    /* renamed from: j, reason: contains not printable characters */
    int f۱۰۷۸۹j = Integer.MIN_VALUE;

    /* renamed from: k, reason: contains not printable characters */
    int f۱۰۷۹۰k = Integer.MIN_VALUE;

    /* renamed from: l, reason: contains not printable characters */
    private int f۱۰۷۹۱l = Integer.MIN_VALUE;

    /* renamed from: a, reason: contains not printable characters */
    protected abstract int mo۱۵۸۹۴a(float f2, float f3);

    /* renamed from: a, reason: contains not printable characters */
    protected abstract void mo۱۵۸۹۶a(int i, Cc cc);

    /* renamed from: a, reason: contains not printable characters */
    protected abstract void mo۱۵۸۹۷a(int i, AccessibilityEvent accessibilityEvent);

    /* renamed from: a, reason: contains not printable characters */
    protected abstract void mo۱۵۸۹۸a(List<Integer> list);

    /* renamed from: a, reason: contains not printable characters */
    protected abstract boolean mo۱۵۸۹۹a(int i, int i2, Bundle bundle);

    static {
        new a();
        new b();
    }

    public AbstractCh(View host) {
        if (host == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f۱۰۷۸۷h = host;
        Context context = host.getContext();
        this.f۱۰۷۸۶g = (AccessibilityManager) context.getSystemService("accessibility");
        host.setFocusable(true);
        if (Cu.m۱۰۹۴۲i(host) == 0) {
            Cu.m۱۰۹۳۷f(host, 1);
        }
    }

    @Override // android.support.v4.view.Cb
    /* renamed from: a, reason: contains not printable characters */
    public Cd mo۱۱۱۹۲a(View host) {
        if (this.f۱۰۷۸۸i == null) {
            this.f۱۰۷۸۸i = new c();
        }
        return this.f۱۰۷۸۸i;
    }

    /* renamed from: a, reason: contains not printable characters */
    public final boolean m۱۱۲۰۳a(MotionEvent event) {
        if (!this.f۱۰۷۸۶g.isEnabled() || !this.f۱۰۷۸۶g.isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int virtualViewId = mo۱۵۸۹۴a(event.getX(), event.getY());
            m۱۱۱۹۰h(virtualViewId);
            return virtualViewId != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f۱۰۷۹۱l == Integer.MIN_VALUE) {
            return false;
        }
        m۱۱۱۹۰h(Integer.MIN_VALUE);
        return true;
    }

    /* renamed from: b, reason: contains not printable characters */
    public final int m۱۱۲۰۴b() {
        return this.f۱۰۷۸۹j;
    }

    /* renamed from: android.support.v4.widget.h$a */
    static class a implements InterfaceCi<Cc> {
        a() {
        }
    }

    /* renamed from: android.support.v4.widget.h$b */
    static class b implements InterfaceCj<Co<Cc>, Cc> {
        b() {
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public final boolean m۱۱۲۰۷b(int virtualViewId, int eventType) {
        ViewParent parent;
        if (virtualViewId == Integer.MIN_VALUE || !this.f۱۰۷۸۶g.isEnabled() || (parent = this.f۱۰۷۸۷h.getParent()) == null) {
            return false;
        }
        AccessibilityEvent event = m۱۱۱۸۲c(virtualViewId, eventType);
        return Cx.m۱۰۹۸۰a(parent, this.f۱۰۷۸۷h, event);
    }

    /* renamed from: d, reason: contains not printable characters */
    public final void m۱۱۲۱۱d() {
        m۱۱۱۹۳a(-1, 1);
    }

    /* renamed from: a, reason: contains not printable characters */
    public final void m۱۱۱۹۳a(int virtualViewId, int changeTypes) {
        ViewParent parent;
        if (virtualViewId != Integer.MIN_VALUE && this.f۱۰۷۸۶g.isEnabled() && (parent = this.f۱۰۷۸۷h.getParent()) != null) {
            AccessibilityEvent event = m۱۱۱۸۲c(virtualViewId, 2048);
            Ca.m۱۰۷۵۸a(event, changeTypes);
            Cx.m۱۰۹۸۰a(parent, this.f۱۰۷۸۷h, event);
        }
    }

    @Deprecated
    /* renamed from: c, reason: contains not printable characters */
    public int m۱۱۲۰۹c() {
        return m۱۱۲۰۴b();
    }

    /* renamed from: a, reason: contains not printable characters */
    protected void m۱۱۱۹۶a(int virtualViewId, boolean hasFocus) {
    }

    /* renamed from: h, reason: contains not printable characters */
    private void m۱۱۱۹۰h(int virtualViewId) {
        if (this.f۱۰۷۹۱l == virtualViewId) {
            return;
        }
        int previousVirtualViewId = this.f۱۰۷۹۱l;
        this.f۱۰۷۹۱l = virtualViewId;
        m۱۱۲۰۷b(virtualViewId, 128);
        m۱۱۲۰۷b(previousVirtualViewId, 256);
    }

    /* renamed from: c, reason: contains not printable characters */
    private AccessibilityEvent m۱۱۱۸۲c(int virtualViewId, int eventType) {
        if (virtualViewId == -1) {
            return m۱۱۱۸۷e(eventType);
        }
        return m۱۱۱۸۴d(virtualViewId, eventType);
    }

    /* renamed from: e, reason: contains not printable characters */
    private AccessibilityEvent m۱۱۱۸۷e(int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        this.f۱۰۷۸۷h.onInitializeAccessibilityEvent(event);
        return event;
    }

    @Override // android.support.v4.view.Cb
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۵۸۱b(View host, AccessibilityEvent event) {
        super.mo۱۳۵۸۱b(host, event);
        m۱۱۱۹۹a(event);
    }

    /* renamed from: d, reason: contains not printable characters */
    private AccessibilityEvent m۱۱۱۸۴d(int virtualViewId, int eventType) {
        AccessibilityEvent event = AccessibilityEvent.obtain(eventType);
        Cc node = m۱۱۲۰۵b(virtualViewId);
        event.getText().add(node.m۱۰۷۹۹g());
        event.setContentDescription(node.m۱۰۷۸۹d());
        event.setScrollable(node.m۱۰۸۱۸r());
        event.setPassword(node.m۱۰۸۱۷q());
        event.setEnabled(node.m۱۰۸۱۲m());
        event.setChecked(node.m۱۰۸۰۸k());
        mo۱۵۸۹۷a(virtualViewId, event);
        if (event.getText().isEmpty() && event.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        event.setClassName(node.m۱۰۷۸۳c());
        Ce.m۱۰۸۳۱a(event, this.f۱۰۷۸۷h, virtualViewId);
        event.setPackageName(this.f۱۰۷۸۷h.getContext().getPackageName());
        return event;
    }

    /* renamed from: b, reason: contains not printable characters */
    Cc m۱۱۲۰۵b(int virtualViewId) {
        if (virtualViewId == -1) {
            return m۱۱۱۸۶e();
        }
        return m۱۱۱۸۸f(virtualViewId);
    }

    /* renamed from: e, reason: contains not printable characters */
    private Cc m۱۱۱۸۶e() {
        Cc info2 = Cc.m۱۰۷۶۵d(this.f۱۰۷۸۷h);
        Cu.m۱۰۹۱۶a(this.f۱۰۷۸۷h, info2);
        ArrayList<Integer> virtualViewIds = new ArrayList<>();
        mo۱۵۸۹۸a(virtualViewIds);
        int realNodeCount = info2.m۱۰۷۷۶b();
        if (realNodeCount > 0 && virtualViewIds.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int count = virtualViewIds.size();
        for (int i = 0; i < count; i++) {
            info2.m۱۰۷۷۱a(this.f۱۰۷۸۷h, virtualViewIds.get(i).intValue());
        }
        return info2;
    }

    @Override // android.support.v4.view.Cb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۵۸۳a(View host, Cc info2) {
        super.mo۱۳۵۸۳a(host, info2);
        m۱۱۱۹۷a(info2);
    }

    /* renamed from: f, reason: contains not printable characters */
    private Cc m۱۱۱۸۸f(int virtualViewId) {
        Cc node = Cc.m۱۰۷۶۶w();
        node.m۱۰۸۰۰g(true);
        node.m۱۰۸۰۲h(true);
        node.m۱۰۷۷۲a("android.view.View");
        node.m۱۰۷۸۴c(f۱۰۷۸۱m);
        node.m۱۰۷۹۰d(f۱۰۷۸۱m);
        node.m۱۰۷۷۸b(this.f۱۰۷۸۷h);
        mo۱۵۸۹۶a(virtualViewId, node);
        if (node.m۱۰۷۹۹g() == null && node.m۱۰۷۸۹d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        node.m۱۰۷۶۹a(this.f۱۰۷۸۳d);
        if (this.f۱۰۷۸۳d.equals(f۱۰۷۸۱m)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = node.m۱۰۷۶۷a();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        node.m۱۰۷۹۴e(this.f۱۰۷۸۷h.getContext().getPackageName());
        node.m۱۰۷۸۶c(this.f۱۰۷۸۷h, virtualViewId);
        if (this.f۱۰۷۸۹j == virtualViewId) {
            node.m۱۰۷۷۴a(true);
            node.m۱۰۷۶۸a(128);
        } else {
            node.m۱۰۷۷۴a(false);
            node.m۱۰۷۶۸a(64);
        }
        boolean isFocused = this.f۱۰۷۹۰k == virtualViewId;
        if (isFocused) {
            node.m۱۰۷۶۸a(2);
        } else if (node.m۱۰۸۱۴n()) {
            node.m۱۰۷۶۸a(1);
        }
        node.m۱۰۸۰۳i(isFocused);
        this.f۱۰۷۸۷h.getLocationOnScreen(this.f۱۰۷۸۵f);
        node.m۱۰۷۷۷b(this.f۱۰۷۸۲c);
        if (this.f۱۰۷۸۲c.equals(f۱۰۷۸۱m)) {
            node.m۱۰۷۶۹a(this.f۱۰۷۸۲c);
            if (node.f۱۰۵۹۳b != -1) {
                Cc parentNode = Cc.m۱۰۷۶۶w();
                for (int virtualDescendantId = node.f۱۰۵۹۳b; virtualDescendantId != -1; virtualDescendantId = parentNode.f۱۰۵۹۳b) {
                    parentNode.m۱۰۷۷۹b(this.f۱۰۷۸۷h, -1);
                    parentNode.m۱۰۷۸۴c(f۱۰۷۸۱m);
                    mo۱۵۸۹۶a(virtualDescendantId, parentNode);
                    parentNode.m۱۰۷۶۹a(this.f۱۰۷۸۳d);
                    Rect rect = this.f۱۰۷۸۲c;
                    Rect rect2 = this.f۱۰۷۸۳d;
                    rect.offset(rect2.left, rect2.top);
                }
                parentNode.m۱۰۸۲۱u();
            }
            this.f۱۰۷۸۲c.offset(this.f۱۰۷۸۵f[0] - this.f۱۰۷۸۷h.getScrollX(), this.f۱۰۷۸۵f[1] - this.f۱۰۷۸۷h.getScrollY());
        }
        if (this.f۱۰۷۸۷h.getLocalVisibleRect(this.f۱۰۷۸۴e)) {
            this.f۱۰۷۸۴e.offset(this.f۱۰۷۸۵f[0] - this.f۱۰۷۸۷h.getScrollX(), this.f۱۰۷۸۵f[1] - this.f۱۰۷۸۷h.getScrollY());
            boolean intersects = this.f۱۰۷۸۲c.intersect(this.f۱۰۷۸۴e);
            if (intersects) {
                node.m۱۰۷۹۰d(this.f۱۰۷۸۲c);
                if (m۱۱۱۸۱a(this.f۱۰۷۸۲c)) {
                    node.m۱۰۸۱۳n(true);
                }
            }
        }
        return node;
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۱۲۰۸b(int virtualViewId, int action, Bundle arguments) {
        if (virtualViewId == -1) {
            return m۱۱۱۸۰a(action, arguments);
        }
        return m۱۱۱۸۳c(virtualViewId, action, arguments);
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۱۱۸۰a(int action, Bundle arguments) {
        return Cu.m۱۰۹۲۳a(this.f۱۰۷۸۷h, action, arguments);
    }

    /* renamed from: c, reason: contains not printable characters */
    private boolean m۱۱۱۸۳c(int virtualViewId, int action, Bundle arguments) {
        if (action == 1) {
            return m۱۱۲۱۰c(virtualViewId);
        }
        if (action == 2) {
            return m۱۱۲۰۱a(virtualViewId);
        }
        if (action == 64) {
            return m۱۱۱۸۹g(virtualViewId);
        }
        if (action == 128) {
            return m۱۱۱۸۵d(virtualViewId);
        }
        return mo۱۵۸۹۹a(virtualViewId, action, arguments);
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۱۱۸۱a(Rect localRect) {
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
        return viewParent != null;
    }

    /* renamed from: g, reason: contains not printable characters */
    private boolean m۱۱۱۸۹g(int virtualViewId) {
        int i;
        if (!this.f۱۰۷۸۶g.isEnabled() || !this.f۱۰۷۸۶g.isTouchExplorationEnabled() || (i = this.f۱۰۷۸۹j) == virtualViewId) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            m۱۱۱۸۵d(i);
        }
        this.f۱۰۷۸۹j = virtualViewId;
        this.f۱۰۷۸۷h.invalidate();
        m۱۱۲۰۷b(virtualViewId, 32768);
        return true;
    }

    /* renamed from: d, reason: contains not printable characters */
    private boolean m۱۱۱۸۵d(int virtualViewId) {
        if (this.f۱۰۷۸۹j == virtualViewId) {
            this.f۱۰۷۸۹j = Integer.MIN_VALUE;
            this.f۱۰۷۸۷h.invalidate();
            m۱۱۲۰۷b(virtualViewId, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: c, reason: contains not printable characters */
    public final boolean m۱۱۲۱۰c(int virtualViewId) {
        int i;
        if ((!this.f۱۰۷۸۷h.isFocused() && !this.f۱۰۷۸۷h.requestFocus()) || (i = this.f۱۰۷۹۰k) == virtualViewId) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            m۱۱۲۰۱a(i);
        }
        this.f۱۰۷۹۰k = virtualViewId;
        m۱۱۱۹۶a(virtualViewId, true);
        m۱۱۲۰۷b(virtualViewId, 8);
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public final boolean m۱۱۲۰۱a(int virtualViewId) {
        if (this.f۱۰۷۹۰k != virtualViewId) {
            return false;
        }
        this.f۱۰۷۹۰k = Integer.MIN_VALUE;
        m۱۱۱۹۶a(virtualViewId, false);
        m۱۱۲۰۷b(virtualViewId, 8);
        return true;
    }

    /* renamed from: a, reason: contains not printable characters */
    protected void m۱۱۱۹۹a(AccessibilityEvent event) {
    }

    /* renamed from: a, reason: contains not printable characters */
    protected void m۱۱۱۹۷a(Cc node) {
    }

    /* renamed from: android.support.v4.widget.h$c */
    private class c extends Cd {
        c() {
        }

        @Override // android.support.v4.view.p۲۰۳d0.Cd
        /* renamed from: a, reason: contains not printable characters */
        public Cc mo۱۱۲۱۲a(int virtualViewId) {
            Cc node = AbstractCh.this.m۱۱۲۰۵b(virtualViewId);
            return Cc.m۱۰۷۶۱a(node);
        }

        @Override // android.support.v4.view.p۲۰۳d0.Cd
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۱۲۱۳a(int virtualViewId, int action, Bundle arguments) {
            return AbstractCh.this.m۱۱۲۰۸b(virtualViewId, action, arguments);
        }

        @Override // android.support.v4.view.p۲۰۳d0.Cd
        /* renamed from: b, reason: contains not printable characters */
        public Cc mo۱۱۲۱۴b(int focusType) {
            int focusedId = focusType == 2 ? AbstractCh.this.f۱۰۷۸۹j : AbstractCh.this.f۱۰۷۹۰k;
            if (focusedId == Integer.MIN_VALUE) {
                return null;
            }
            return mo۱۱۲۱۲a(focusedId);
        }
    }
}
