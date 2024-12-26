package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.d0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cd0 {

    /* renamed from: a, reason: contains not printable characters */
    final b f۱۱۹۷۶a;

    /* renamed from: b, reason: contains not printable characters */
    final a f۱۱۹۷۷b = new a();

    /* renamed from: c, reason: contains not printable characters */
    final List<View> f۱۱۹۷۸c = new ArrayList();

    /* renamed from: android.support.v7.widget.d0$b */
    interface b {
        /* renamed from: a, reason: contains not printable characters */
        View mo۱۳۰۷۷a(int i);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۰۷۸a();

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۰۷۹a(View view);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۰۸۰a(View view, int i);

        /* renamed from: a, reason: contains not printable characters */
        void mo۱۳۰۸۱a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b, reason: contains not printable characters */
        int mo۱۳۰۸۲b();

        /* renamed from: b, reason: contains not printable characters */
        RecyclerView.AbstractCd0 mo۱۳۰۸۳b(View view);

        /* renamed from: b, reason: contains not printable characters */
        void mo۱۳۰۸۴b(int i);

        /* renamed from: c, reason: contains not printable characters */
        void mo۱۳۰۸۵c(int i);

        /* renamed from: c, reason: contains not printable characters */
        void mo۱۳۰۸۶c(View view);

        /* renamed from: d, reason: contains not printable characters */
        int mo۱۳۰۸۷d(View view);
    }

    Cd0(b callback) {
        this.f۱۱۹۷۶a = callback;
    }

    /* renamed from: g, reason: contains not printable characters */
    private void m۱۳۰۵۰g(View child) {
        this.f۱۱۹۷۸c.add(child);
        this.f۱۱۹۷۶a.mo۱۳۰۷۹a(child);
    }

    /* renamed from: h, reason: contains not printable characters */
    private boolean m۱۳۰۵۱h(View child) {
        if (this.f۱۱۹۷۸c.remove(child)) {
            this.f۱۱۹۷۶a.mo۱۳۰۸۶c(child);
            return true;
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۰۵۷a(View child, boolean hidden) {
        m۱۳۰۵۶a(child, -1, hidden);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۰۵۶a(View child, int index, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.f۱۱۹۷۶a.mo۱۳۰۸۲b();
        } else {
            offset = m۱۳۰۴۹f(index);
        }
        this.f۱۱۹۷۷b.m۱۳۰۷۲a(offset, hidden);
        if (hidden) {
            m۱۳۰۵۰g(child);
        }
        this.f۱۱۹۷۶a.mo۱۳۰۸۰a(child, offset);
    }

    /* renamed from: f, reason: contains not printable characters */
    private int m۱۳۰۴۹f(int index) {
        if (index < 0) {
            return -1;
        }
        int limit = this.f۱۱۹۷۶a.mo۱۳۰۸۲b();
        int offset = index;
        while (offset < limit) {
            int removedBefore = this.f۱۱۹۷۷b.m۱۳۰۷۳b(offset);
            int diff = index - (offset - removedBefore);
            if (diff == 0) {
                while (this.f۱۱۹۷۷b.m۱۳۰۷۴c(offset)) {
                    offset++;
                }
                return offset;
            }
            offset += diff;
        }
        return -1;
    }

    /* renamed from: d, reason: contains not printable characters */
    void m۱۳۰۶۵d(View view) {
        int index = this.f۱۱۹۷۶a.mo۱۳۰۸۷d(view);
        if (index < 0) {
            return;
        }
        if (this.f۱۱۹۷۷b.m۱۳۰۷۵d(index)) {
            m۱۳۰۵۱h(view);
        }
        this.f۱۱۹۷۶a.mo۱۳۰۸۴b(index);
    }

    /* renamed from: e, reason: contains not printable characters */
    void m۱۳۰۶۶e(int index) {
        int offset = m۱۳۰۴۹f(index);
        View view = this.f۱۱۹۷۶a.mo۱۳۰۷۷a(offset);
        if (view == null) {
            return;
        }
        if (this.f۱۱۹۷۷b.m۱۳۰۷۵d(offset)) {
            m۱۳۰۵۱h(view);
        }
        this.f۱۱۹۷۶a.mo۱۳۰۸۴b(offset);
    }

    /* renamed from: c, reason: contains not printable characters */
    View m۱۳۰۶۱c(int index) {
        int offset = m۱۳۰۴۹f(index);
        return this.f۱۱۹۷۶a.mo۱۳۰۷۷a(offset);
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۳۰۶۲c() {
        this.f۱۱۹۷۷b.m۱۳۰۷۰a();
        for (int i = this.f۱۱۹۷۸c.size() - 1; i >= 0; i--) {
            this.f۱۱۹۷۶a.mo۱۳۰۸۶c(this.f۱۱۹۷۸c.get(i));
            this.f۱۱۹۷۸c.remove(i);
        }
        this.f۱۱۹۷۶a.mo۱۳۰۷۸a();
    }

    /* renamed from: b, reason: contains not printable characters */
    View m۱۳۰۶۰b(int position) {
        int count = this.f۱۱۹۷۸c.size();
        for (int i = 0; i < count; i++) {
            View view = this.f۱۱۹۷۸c.get(i);
            RecyclerView.AbstractCd0 holder = this.f۱۱۹۷۶a.mo۱۳۰۸۳b(view);
            if (holder.m۱۲۳۲۳i() == position && !holder.m۱۲۳۲۸n() && !holder.m۱۲۳۳۰p()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۰۵۵a(View child, int index, ViewGroup.LayoutParams layoutParams, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.f۱۱۹۷۶a.mo۱۳۰۸۲b();
        } else {
            offset = m۱۳۰۴۹f(index);
        }
        this.f۱۱۹۷۷b.m۱۳۰۷۲a(offset, hidden);
        if (hidden) {
            m۱۳۰۵۰g(child);
        }
        this.f۱۱۹۷۶a.mo۱۳۰۸۱a(child, offset, layoutParams);
    }

    /* renamed from: a, reason: contains not printable characters */
    int m۱۳۰۵۲a() {
        return this.f۱۱۹۷۶a.mo۱۳۰۸۲b() - this.f۱۱۹۷۸c.size();
    }

    /* renamed from: b, reason: contains not printable characters */
    int m۱۳۰۵۸b() {
        return this.f۱۱۹۷۶a.mo۱۳۰۸۲b();
    }

    /* renamed from: d, reason: contains not printable characters */
    View m۱۳۰۶۴d(int index) {
        return this.f۱۱۹۷۶a.mo۱۳۰۷۷a(index);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۰۵۳a(int index) {
        int offset = m۱۳۰۴۹f(index);
        this.f۱۱۹۷۷b.m۱۳۰۷۵d(offset);
        this.f۱۱۹۷۶a.mo۱۳۰۸۵c(offset);
    }

    /* renamed from: b, reason: contains not printable characters */
    int m۱۳۰۵۹b(View child) {
        int index = this.f۱۱۹۷۶a.mo۱۳۰۸۷d(child);
        if (index == -1 || this.f۱۱۹۷۷b.m۱۳۰۷۴c(index)) {
            return -1;
        }
        return index - this.f۱۱۹۷۷b.m۱۳۰۷۳b(index);
    }

    /* renamed from: c, reason: contains not printable characters */
    boolean m۱۳۰۶۳c(View view) {
        return this.f۱۱۹۷۸c.contains(view);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۳۰۵۴a(View view) {
        int offset = this.f۱۱۹۷۶a.mo۱۳۰۸۷d(view);
        if (offset < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f۱۱۹۷۷b.m۱۳۰۷۶e(offset);
        m۱۳۰۵۰g(view);
    }

    /* renamed from: f, reason: contains not printable characters */
    void m۱۳۰۶۸f(View view) {
        int offset = this.f۱۱۹۷۶a.mo۱۳۰۸۷d(view);
        if (offset < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (!this.f۱۱۹۷۷b.m۱۳۰۷۴c(offset)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        this.f۱۱۹۷۷b.m۱۳۰۷۱a(offset);
        m۱۳۰۵۱h(view);
    }

    public String toString() {
        return this.f۱۱۹۷۷b.toString() + ", hidden list:" + this.f۱۱۹۷۸c.size();
    }

    /* renamed from: e, reason: contains not printable characters */
    boolean m۱۳۰۶۷e(View view) {
        int index = this.f۱۱۹۷۶a.mo۱۳۰۸۷d(view);
        if (index == -1) {
            m۱۳۰۵۱h(view);
            return true;
        }
        if (this.f۱۱۹۷۷b.m۱۳۰۷۴c(index)) {
            this.f۱۱۹۷۷b.m۱۳۰۷۵d(index);
            m۱۳۰۵۱h(view);
            this.f۱۱۹۷۶a.mo۱۳۰۸۴b(index);
            return true;
        }
        return false;
    }

    /* renamed from: android.support.v7.widget.d0$a */
    static class a {

        /* renamed from: a, reason: contains not printable characters */
        long f۱۱۹۷۹a = 0;

        /* renamed from: b, reason: contains not printable characters */
        a f۱۱۹۸۰b;

        a() {
        }

        /* renamed from: e, reason: contains not printable characters */
        void m۱۳۰۷۶e(int index) {
            if (index >= 64) {
                m۱۳۰۶۹b();
                this.f۱۱۹۸۰b.m۱۳۰۷۶e(index - 64);
            } else {
                this.f۱۱۹۷۹a |= 1 << index;
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        private void m۱۳۰۶۹b() {
            if (this.f۱۱۹۸۰b == null) {
                this.f۱۱۹۸۰b = new a();
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۰۷۱a(int index) {
            if (index >= 64) {
                a aVar = this.f۱۱۹۸۰b;
                if (aVar != null) {
                    aVar.m۱۳۰۷۱a(index - 64);
                    return;
                }
                return;
            }
            this.f۱۱۹۷۹a &= (1 << index) ^ (-1);
        }

        /* renamed from: c, reason: contains not printable characters */
        boolean m۱۳۰۷۴c(int index) {
            if (index < 64) {
                return (this.f۱۱۹۷۹a & (1 << index)) != 0;
            }
            m۱۳۰۶۹b();
            return this.f۱۱۹۸۰b.m۱۳۰۷۴c(index - 64);
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۰۷۰a() {
            this.f۱۱۹۷۹a = 0L;
            a aVar = this.f۱۱۹۸۰b;
            if (aVar != null) {
                aVar.m۱۳۰۷۰a();
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۰۷۲a(int index, boolean value) {
            if (index >= 64) {
                m۱۳۰۶۹b();
                this.f۱۱۹۸۰b.m۱۳۰۷۲a(index - 64, value);
                return;
            }
            boolean lastBit = (this.f۱۱۹۷۹a & Long.MIN_VALUE) != 0;
            long mask = (1 << index) - 1;
            long j = this.f۱۱۹۷۹a;
            long before = j & mask;
            long after = (j & ((-1) ^ mask)) << 1;
            this.f۱۱۹۷۹a = before | after;
            if (value) {
                m۱۳۰۷۶e(index);
            } else {
                m۱۳۰۷۱a(index);
            }
            if (lastBit || this.f۱۱۹۸۰b != null) {
                m۱۳۰۶۹b();
                this.f۱۱۹۸۰b.m۱۳۰۷۲a(0, lastBit);
            }
        }

        /* renamed from: d, reason: contains not printable characters */
        boolean m۱۳۰۷۵d(int index) {
            if (index >= 64) {
                m۱۳۰۶۹b();
                return this.f۱۱۹۸۰b.m۱۳۰۷۵d(index - 64);
            }
            long mask = 1 << index;
            boolean value = (this.f۱۱۹۷۹a & mask) != 0;
            this.f۱۱۹۷۹a &= mask ^ (-1);
            long mask2 = mask - 1;
            long j = this.f۱۱۹۷۹a;
            long before = j & mask2;
            long after = Long.rotateRight(j & ((-1) ^ mask2), 1);
            this.f۱۱۹۷۹a = before | after;
            a aVar = this.f۱۱۹۸۰b;
            if (aVar != null) {
                if (aVar.m۱۳۰۷۴c(0)) {
                    m۱۳۰۷۶e(63);
                }
                this.f۱۱۹۸۰b.m۱۳۰۷۵d(0);
            }
            return value;
        }

        /* renamed from: b, reason: contains not printable characters */
        int m۱۳۰۷۳b(int index) {
            a aVar = this.f۱۱۹۸۰b;
            if (aVar == null) {
                if (index >= 64) {
                    return Long.bitCount(this.f۱۱۹۷۹a);
                }
                return Long.bitCount(this.f۱۱۹۷۹a & ((1 << index) - 1));
            }
            if (index < 64) {
                return Long.bitCount(this.f۱۱۹۷۹a & ((1 << index) - 1));
            }
            return aVar.m۱۳۰۷۳b(index - 64) + Long.bitCount(this.f۱۱۹۷۹a);
        }

        public String toString() {
            if (this.f۱۱۹۸۰b == null) {
                return Long.toBinaryString(this.f۱۱۹۷۹a);
            }
            return this.f۱۱۹۸۰b.toString() + "xx" + Long.toBinaryString(this.f۱۱۹۷۹a);
        }
    }
}
