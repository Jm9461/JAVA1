package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    final b f۲۰۱۳a;

    /* renamed from: b  reason: collision with root package name */
    final a f۲۰۱۴b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f۲۰۱۵c = new ArrayList();

    /* access modifiers changed from: package-private */
    public interface b {
        View a(int i);

        void a();

        void a(View view);

        void a(View view, int i);

        void a(View view, int i, ViewGroup.LayoutParams layoutParams);

        int b();

        RecyclerView.d0 b(View view);

        void b(int i);

        void c(int i);

        void c(View view);

        int d(View view);
    }

    d0(b callback) {
        this.f۲۰۱۳a = callback;
    }

    private void g(View child) {
        this.f۲۰۱۵c.add(child);
        this.f۲۰۱۳a.a(child);
    }

    private boolean h(View child) {
        if (!this.f۲۰۱۵c.remove(child)) {
            return false;
        }
        this.f۲۰۱۳a.c(child);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(View child, boolean hidden) {
        a(child, -1, hidden);
    }

    /* access modifiers changed from: package-private */
    public void a(View child, int index, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.f۲۰۱۳a.b();
        } else {
            offset = f(index);
        }
        this.f۲۰۱۴b.a(offset, hidden);
        if (hidden) {
            g(child);
        }
        this.f۲۰۱۳a.a(child, offset);
    }

    private int f(int index) {
        if (index < 0) {
            return -1;
        }
        int limit = this.f۲۰۱۳a.b();
        int offset = index;
        while (offset < limit) {
            int diff = index - (offset - this.f۲۰۱۴b.b(offset));
            if (diff == 0) {
                while (this.f۲۰۱۴b.c(offset)) {
                    offset++;
                }
                return offset;
            }
            offset += diff;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        int index = this.f۲۰۱۳a.d(view);
        if (index >= 0) {
            if (this.f۲۰۱۴b.d(index)) {
                h(view);
            }
            this.f۲۰۱۳a.b(index);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int index) {
        int offset = f(index);
        View view = this.f۲۰۱۳a.a(offset);
        if (view != null) {
            if (this.f۲۰۱۴b.d(offset)) {
                h(view);
            }
            this.f۲۰۱۳a.b(offset);
        }
    }

    /* access modifiers changed from: package-private */
    public View c(int index) {
        return this.f۲۰۱۳a.a(f(index));
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f۲۰۱۴b.a();
        for (int i = this.f۲۰۱۵c.size() - 1; i >= 0; i--) {
            this.f۲۰۱۳a.c(this.f۲۰۱۵c.get(i));
            this.f۲۰۱۵c.remove(i);
        }
        this.f۲۰۱۳a.a();
    }

    /* access modifiers changed from: package-private */
    public View b(int position) {
        int count = this.f۲۰۱۵c.size();
        for (int i = 0; i < count; i++) {
            View view = this.f۲۰۱۵c.get(i);
            RecyclerView.d0 holder = this.f۲۰۱۳a.b(view);
            if (!(holder.i() != position || holder.n() || holder.p())) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(View child, int index, ViewGroup.LayoutParams layoutParams, boolean hidden) {
        int offset;
        if (index < 0) {
            offset = this.f۲۰۱۳a.b();
        } else {
            offset = f(index);
        }
        this.f۲۰۱۴b.a(offset, hidden);
        if (hidden) {
            g(child);
        }
        this.f۲۰۱۳a.a(child, offset, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f۲۰۱۳a.b() - this.f۲۰۱۵c.size();
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f۲۰۱۳a.b();
    }

    /* access modifiers changed from: package-private */
    public View d(int index) {
        return this.f۲۰۱۳a.a(index);
    }

    /* access modifiers changed from: package-private */
    public void a(int index) {
        int offset = f(index);
        this.f۲۰۱۴b.d(offset);
        this.f۲۰۱۳a.c(offset);
    }

    /* access modifiers changed from: package-private */
    public int b(View child) {
        int index = this.f۲۰۱۳a.d(child);
        if (index != -1 && !this.f۲۰۱۴b.c(index)) {
            return index - this.f۲۰۱۴b.b(index);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public boolean c(View view) {
        return this.f۲۰۱۵c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        int offset = this.f۲۰۱۳a.d(view);
        if (offset >= 0) {
            this.f۲۰۱۴b.e(offset);
            g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public void f(View view) {
        int offset = this.f۲۰۱۳a.d(view);
        if (offset < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f۲۰۱۴b.c(offset)) {
            this.f۲۰۱۴b.a(offset);
            h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f۲۰۱۴b.toString() + ", hidden list:" + this.f۲۰۱۵c.size();
    }

    /* access modifiers changed from: package-private */
    public boolean e(View view) {
        int index = this.f۲۰۱۳a.d(view);
        if (index == -1) {
            h(view);
            return true;
        } else if (!this.f۲۰۱۴b.c(index)) {
            return false;
        } else {
            this.f۲۰۱۴b.d(index);
            h(view);
            this.f۲۰۱۳a.b(index);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        long f۲۰۱۶a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f۲۰۱۷b;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void e(int index) {
            if (index >= 64) {
                b();
                this.f۲۰۱۷b.e(index - 64);
                return;
            }
            this.f۲۰۱۶a |= 1 << index;
        }

        private void b() {
            if (this.f۲۰۱۷b == null) {
                this.f۲۰۱۷b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int index) {
            if (index >= 64) {
                a aVar = this.f۲۰۱۷b;
                if (aVar != null) {
                    aVar.a(index - 64);
                    return;
                }
                return;
            }
            this.f۲۰۱۶a &= (1 << index) ^ -1;
        }

        /* access modifiers changed from: package-private */
        public boolean c(int index) {
            if (index < 64) {
                return (this.f۲۰۱۶a & (1 << index)) != 0;
            }
            b();
            return this.f۲۰۱۷b.c(index - 64);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f۲۰۱۶a = 0;
            a aVar = this.f۲۰۱۷b;
            if (aVar != null) {
                aVar.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int index, boolean value) {
            if (index >= 64) {
                b();
                this.f۲۰۱۷b.a(index - 64, value);
                return;
            }
            boolean lastBit = (this.f۲۰۱۶a & Long.MIN_VALUE) != 0;
            long mask = (1 << index) - 1;
            long j = this.f۲۰۱۶a;
            this.f۲۰۱۶a = (j & mask) | ((j & (-1 ^ mask)) << 1);
            if (value) {
                e(index);
            } else {
                a(index);
            }
            if (lastBit || this.f۲۰۱۷b != null) {
                b();
                this.f۲۰۱۷b.a(0, lastBit);
            }
        }

        /* access modifiers changed from: package-private */
        public boolean d(int index) {
            if (index >= 64) {
                b();
                return this.f۲۰۱۷b.d(index - 64);
            }
            long mask = 1 << index;
            boolean value = (this.f۲۰۱۶a & mask) != 0;
            this.f۲۰۱۶a &= mask ^ -1;
            long mask2 = mask - 1;
            long j = this.f۲۰۱۶a;
            this.f۲۰۱۶a = (j & mask2) | Long.rotateRight(j & (-1 ^ mask2), 1);
            a aVar = this.f۲۰۱۷b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.f۲۰۱۷b.d(0);
            }
            return value;
        }

        /* access modifiers changed from: package-private */
        public int b(int index) {
            a aVar = this.f۲۰۱۷b;
            if (aVar == null) {
                if (index >= 64) {
                    return Long.bitCount(this.f۲۰۱۶a);
                }
                return Long.bitCount(this.f۲۰۱۶a & ((1 << index) - 1));
            } else if (index < 64) {
                return Long.bitCount(this.f۲۰۱۶a & ((1 << index) - 1));
            } else {
                return aVar.b(index - 64) + Long.bitCount(this.f۲۰۱۶a);
            }
        }

        public String toString() {
            if (this.f۲۰۱۷b == null) {
                return Long.toBinaryString(this.f۲۰۱۶a);
            }
            return this.f۲۰۱۷b.toString() + "xx" + Long.toBinaryString(this.f۲۰۱۶a);
        }
    }
}
