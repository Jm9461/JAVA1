package android.support.p۰۴۷v7.widget;

import android.support.p۰۴۷v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.d0  reason: invalid class name */
public class Cd0 {

    /* renamed from: a  reason: contains not printable characters */
    final AbstractCb f۱۱۹۷۶a;

    /* renamed from: b  reason: contains not printable characters */
    final Ca f۱۱۹۷۷b = new Ca();

    /* renamed from: c  reason: contains not printable characters */
    final List<View> f۱۱۹۷۸c = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.d0$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        View m۱۵۱۴۷a(int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۱۴۸a();

        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۱۴۹a(View view);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۱۵۰a(View view, int i);

        /* renamed from: a  reason: contains not printable characters */
        void m۱۵۱۵۱a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b  reason: contains not printable characters */
        int m۱۵۱۵۲b();

        /* renamed from: b  reason: contains not printable characters */
        RecyclerView.AbstractCd0 m۱۵۱۵۳b(View view);

        /* renamed from: b  reason: contains not printable characters */
        void m۱۵۱۵۴b(int i);

        /* renamed from: c  reason: contains not printable characters */
        void m۱۵۱۵۵c(int i);

        /* renamed from: c  reason: contains not printable characters */
        void m۱۵۱۵۶c(View view);

        /* renamed from: d  reason: contains not printable characters */
        int m۱۵۱۵۷d(View view);
    }

    Cd0(AbstractCb callback) {
        this.f۱۱۹۷۶a = callback;
    }

    /* renamed from: g  reason: contains not printable characters */
    private void m۱۵۱۲۰g(View child) {
        this.f۱۱۹۷۸c.add(child);
        this.f۱۱۹۷۶a.m۱۵۱۴۹a(child);
    }

    /* renamed from: h  reason: contains not printable characters */
    private boolean m۱۵۱۲۱h(View child) {
        if (!this.f۱۱۹۷۸c.remove(child)) {
            return false;
        }
        this.f۱۱۹۷۶a.m۱۵۱۵۶c(child);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۲۷a(View child, boolean hidden) {
        m۱۵۱۲۶a(child, -1, hidden);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۲۶a(View child, int index, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.f۱۱۹۷۶a.m۱۵۱۵۲b();
        } else {
            offset = m۱۵۱۱۹f(index);
        }
        this.f۱۱۹۷۷b.m۱۵۱۴۲a(offset, hidden);
        if (hidden) {
            m۱۵۱۲۰g(child);
        }
        this.f۱۱۹۷۶a.m۱۵۱۵۰a(child, offset);
    }

    /* renamed from: f  reason: contains not printable characters */
    private int m۱۵۱۱۹f(int index) {
        if (index < 0) {
            return -1;
        }
        int limit = this.f۱۱۹۷۶a.m۱۵۱۵۲b();
        int offset = index;
        while (offset < limit) {
            int diff = index - (offset - this.f۱۱۹۷۷b.m۱۵۱۴۳b(offset));
            if (diff == 0) {
                while (this.f۱۱۹۷۷b.m۱۵۱۴۴c(offset)) {
                    offset++;
                }
                return offset;
            }
            offset += diff;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۵۱۳۵d(View view) {
        int index = this.f۱۱۹۷۶a.m۱۵۱۵۷d(view);
        if (index >= 0) {
            if (this.f۱۱۹۷۷b.m۱۵۱۴۵d(index)) {
                m۱۵۱۲۱h(view);
            }
            this.f۱۱۹۷۶a.m۱۵۱۵۴b(index);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۵۱۳۶e(int index) {
        int offset = m۱۵۱۱۹f(index);
        View view = this.f۱۱۹۷۶a.m۱۵۱۴۷a(offset);
        if (view != null) {
            if (this.f۱۱۹۷۷b.m۱۵۱۴۵d(offset)) {
                m۱۵۱۲۱h(view);
            }
            this.f۱۱۹۷۶a.m۱۵۱۵۴b(offset);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public View m۱۵۱۳۱c(int index) {
        return this.f۱۱۹۷۶a.m۱۵۱۴۷a(m۱۵۱۱۹f(index));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۱۳۲c() {
        this.f۱۱۹۷۷b.m۱۵۱۴۰a();
        for (int i = this.f۱۱۹۷۸c.size() - 1; i >= 0; i--) {
            this.f۱۱۹۷۶a.m۱۵۱۵۶c(this.f۱۱۹۷۸c.get(i));
            this.f۱۱۹۷۸c.remove(i);
        }
        this.f۱۱۹۷۶a.m۱۵۱۴۸a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public View m۱۵۱۳۰b(int position) {
        int count = this.f۱۱۹۷۸c.size();
        for (int i = 0; i < count; i++) {
            View view = this.f۱۱۹۷۸c.get(i);
            RecyclerView.AbstractCd0 holder = this.f۱۱۹۷۶a.m۱۵۱۵۳b(view);
            if (!(holder.m۱۴۳۹۳i() != position || holder.m۱۴۳۹۸n() || holder.m۱۴۴۰۰p())) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۲۵a(View child, int index, ViewGroup.LayoutParams layoutParams, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.f۱۱۹۷۶a.m۱۵۱۵۲b();
        } else {
            offset = m۱۵۱۱۹f(index);
        }
        this.f۱۱۹۷۷b.m۱۵۱۴۲a(offset, hidden);
        if (hidden) {
            m۱۵۱۲۰g(child);
        }
        this.f۱۱۹۷۶a.m۱۵۱۵۱a(child, offset, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۱۲۲a() {
        return this.f۱۱۹۷۶a.m۱۵۱۵۲b() - this.f۱۱۹۷۸c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۵۱۲۸b() {
        return this.f۱۱۹۷۶a.m۱۵۱۵۲b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public View m۱۵۱۳۴d(int index) {
        return this.f۱۱۹۷۶a.m۱۵۱۴۷a(index);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۲۳a(int index) {
        int offset = m۱۵۱۱۹f(index);
        this.f۱۱۹۷۷b.m۱۵۱۴۵d(offset);
        this.f۱۱۹۷۶a.m۱۵۱۵۵c(offset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۵۱۲۹b(View child) {
        int index = this.f۱۱۹۷۶a.m۱۵۱۵۷d(child);
        if (index != -1 && !this.f۱۱۹۷۷b.m۱۵۱۴۴c(index)) {
            return index - this.f۱۱۹۷۷b.m۱۵۱۴۳b(index);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۵۱۳۳c(View view) {
        return this.f۱۱۹۷۸c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۱۲۴a(View view) {
        int offset = this.f۱۱۹۷۶a.m۱۵۱۵۷d(view);
        if (offset >= 0) {
            this.f۱۱۹۷۷b.m۱۵۱۴۶e(offset);
            m۱۵۱۲۰g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۵۱۳۸f(View view) {
        int offset = this.f۱۱۹۷۶a.m۱۵۱۵۷d(view);
        if (offset < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f۱۱۹۷۷b.m۱۵۱۴۴c(offset)) {
            this.f۱۱۹۷۷b.m۱۵۱۴۱a(offset);
            m۱۵۱۲۱h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f۱۱۹۷۷b.toString() + ", hidden list:" + this.f۱۱۹۷۸c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۵۱۳۷e(View view) {
        int index = this.f۱۱۹۷۶a.m۱۵۱۵۷d(view);
        if (index == -1) {
            m۱۵۱۲۱h(view);
            return true;
        } else if (!this.f۱۱۹۷۷b.m۱۵۱۴۴c(index)) {
            return false;
        } else {
            this.f۱۱۹۷۷b.m۱۵۱۴۵d(index);
            m۱۵۱۲۱h(view);
            this.f۱۱۹۷۶a.m۱۵۱۵۴b(index);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.d0$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        long f۱۱۹۷۹a = 0;

        /* renamed from: b  reason: contains not printable characters */
        Ca f۱۱۹۸۰b;

        Ca() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e  reason: contains not printable characters */
        public void m۱۵۱۴۶e(int index) {
            if (index >= 64) {
                m۱۵۱۳۹b();
                this.f۱۱۹۸۰b.m۱۵۱۴۶e(index - 64);
                return;
            }
            this.f۱۱۹۷۹a |= 1 << index;
        }

        /* renamed from: b  reason: contains not printable characters */
        private void m۱۵۱۳۹b() {
            if (this.f۱۱۹۸۰b == null) {
                this.f۱۱۹۸۰b = new Ca();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۱۴۱a(int index) {
            if (index >= 64) {
                Ca aVar = this.f۱۱۹۸۰b;
                if (aVar != null) {
                    aVar.m۱۵۱۴۱a(index - 64);
                    return;
                }
                return;
            }
            this.f۱۱۹۷۹a &= (1 << index) ^ -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public boolean m۱۵۱۴۴c(int index) {
            if (index < 64) {
                return (this.f۱۱۹۷۹a & (1 << index)) != 0;
            }
            m۱۵۱۳۹b();
            return this.f۱۱۹۸۰b.m۱۵۱۴۴c(index - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۱۴۰a() {
            this.f۱۱۹۷۹a = 0;
            Ca aVar = this.f۱۱۹۸۰b;
            if (aVar != null) {
                aVar.m۱۵۱۴۰a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۱۴۲a(int index, boolean value) {
            if (index >= 64) {
                m۱۵۱۳۹b();
                this.f۱۱۹۸۰b.m۱۵۱۴۲a(index - 64, value);
                return;
            }
            boolean lastBit = (this.f۱۱۹۷۹a & Long.MIN_VALUE) != 0;
            long mask = (1 << index) - 1;
            long j = this.f۱۱۹۷۹a;
            this.f۱۱۹۷۹a = (j & mask) | ((j & (-1 ^ mask)) << 1);
            if (value) {
                m۱۵۱۴۶e(index);
            } else {
                m۱۵۱۴۱a(index);
            }
            if (lastBit || this.f۱۱۹۸۰b != null) {
                m۱۵۱۳۹b();
                this.f۱۱۹۸۰b.m۱۵۱۴۲a(0, lastBit);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d  reason: contains not printable characters */
        public boolean m۱۵۱۴۵d(int index) {
            if (index >= 64) {
                m۱۵۱۳۹b();
                return this.f۱۱۹۸۰b.m۱۵۱۴۵d(index - 64);
            }
            long mask = 1 << index;
            boolean value = (this.f۱۱۹۷۹a & mask) != 0;
            this.f۱۱۹۷۹a &= mask ^ -1;
            long mask2 = mask - 1;
            long j = this.f۱۱۹۷۹a;
            this.f۱۱۹۷۹a = (j & mask2) | Long.rotateRight(j & (-1 ^ mask2), 1);
            Ca aVar = this.f۱۱۹۸۰b;
            if (aVar != null) {
                if (aVar.m۱۵۱۴۴c(0)) {
                    m۱۵۱۴۶e(63);
                }
                this.f۱۱۹۸۰b.m۱۵۱۴۵d(0);
            }
            return value;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public int m۱۵۱۴۳b(int index) {
            Ca aVar = this.f۱۱۹۸۰b;
            if (aVar == null) {
                if (index >= 64) {
                    return Long.bitCount(this.f۱۱۹۷۹a);
                }
                return Long.bitCount(this.f۱۱۹۷۹a & ((1 << index) - 1));
            } else if (index < 64) {
                return Long.bitCount(this.f۱۱۹۷۹a & ((1 << index) - 1));
            } else {
                return aVar.m۱۵۱۴۳b(index - 64) + Long.bitCount(this.f۱۱۹۷۹a);
            }
        }

        public String toString() {
            if (this.f۱۱۹۸۰b == null) {
                return Long.toBinaryString(this.f۱۱۹۷۹a);
            }
            return this.f۱۱۹۸۰b.toString() + "xx" + Long.toBinaryString(this.f۱۱۹۷۹a);
        }
    }
}
