package android.support.v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.p1, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cp1 {

    /* renamed from: a, reason: contains not printable characters */
    final b f۱۲۳۰۶a;

    /* renamed from: b, reason: contains not printable characters */
    a f۱۲۳۰۷b = new a();

    /* renamed from: android.support.v7.widget.p1$b */
    interface b {
        /* renamed from: a, reason: contains not printable characters */
        int mo۱۳۴۵۱a();

        /* renamed from: a, reason: contains not printable characters */
        int mo۱۳۴۵۲a(View view);

        /* renamed from: a, reason: contains not printable characters */
        View mo۱۳۴۵۳a(int i);

        /* renamed from: b, reason: contains not printable characters */
        int mo۱۳۴۵۴b();

        /* renamed from: b, reason: contains not printable characters */
        int mo۱۳۴۵۵b(View view);
    }

    Cp1(b callback) {
        this.f۱۲۳۰۶a = callback;
    }

    /* renamed from: android.support.v7.widget.p1$a */
    static class a {

        /* renamed from: a, reason: contains not printable characters */
        int f۱۲۳۰۸a = 0;

        /* renamed from: b, reason: contains not printable characters */
        int f۱۲۳۰۹b;

        /* renamed from: c, reason: contains not printable characters */
        int f۱۲۳۱۰c;

        /* renamed from: d, reason: contains not printable characters */
        int f۱۲۳۱۱d;

        /* renamed from: e, reason: contains not printable characters */
        int f۱۲۳۱۲e;

        a() {
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۴۴۸a(int rvStart, int rvEnd, int childStart, int childEnd) {
            this.f۱۲۳۰۹b = rvStart;
            this.f۱۲۳۱۰c = rvEnd;
            this.f۱۲۳۱۱d = childStart;
            this.f۱۲۳۱۲e = childEnd;
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۳۴۴۷a(int flags) {
            this.f۱۲۳۰۸a |= flags;
        }

        /* renamed from: b, reason: contains not printable characters */
        void m۱۳۴۵۰b() {
            this.f۱۲۳۰۸a = 0;
        }

        /* renamed from: a, reason: contains not printable characters */
        int m۱۳۴۴۶a(int x, int y) {
            if (x > y) {
                return 1;
            }
            if (x == y) {
                return 2;
            }
            return 4;
        }

        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۳۴۴۹a() {
            int i = this.f۱۲۳۰۸a;
            if ((i & 7) != 0 && (i & (m۱۳۴۴۶a(this.f۱۲۳۱۱d, this.f۱۲۳۰۹b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f۱۲۳۰۸a;
            if ((i2 & 112) != 0 && (i2 & (m۱۳۴۴۶a(this.f۱۲۳۱۱d, this.f۱۲۳۱۰c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f۱۲۳۰۸a;
            if ((i3 & 1792) != 0 && (i3 & (m۱۳۴۴۶a(this.f۱۲۳۱۲e, this.f۱۲۳۰۹b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f۱۲۳۰۸a;
            return (i4 & 28672) == 0 || (i4 & (m۱۳۴۴۶a(this.f۱۲۳۱۲e, this.f۱۲۳۱۰c) << 12)) != 0;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    View m۱۳۴۴۴a(int fromIndex, int toIndex, int preferredBoundFlags, int acceptableBoundFlags) {
        int start = this.f۱۲۳۰۶a.mo۱۳۴۵۴b();
        int end = this.f۱۲۳۰۶a.mo۱۳۴۵۱a();
        int next = toIndex > fromIndex ? 1 : -1;
        View acceptableMatch = null;
        for (int i = fromIndex; i != toIndex; i += next) {
            View child = this.f۱۲۳۰۶a.mo۱۳۴۵۳a(i);
            int childStart = this.f۱۲۳۰۶a.mo۱۳۴۵۵b(child);
            int childEnd = this.f۱۲۳۰۶a.mo۱۳۴۵۲a(child);
            this.f۱۲۳۰۷b.m۱۳۴۴۸a(start, end, childStart, childEnd);
            if (preferredBoundFlags != 0) {
                this.f۱۲۳۰۷b.m۱۳۴۵۰b();
                this.f۱۲۳۰۷b.m۱۳۴۴۷a(preferredBoundFlags);
                if (this.f۱۲۳۰۷b.m۱۳۴۴۹a()) {
                    return child;
                }
            }
            if (acceptableBoundFlags != 0) {
                this.f۱۲۳۰۷b.m۱۳۴۵۰b();
                this.f۱۲۳۰۷b.m۱۳۴۴۷a(acceptableBoundFlags);
                if (this.f۱۲۳۰۷b.m۱۳۴۴۹a()) {
                    acceptableMatch = child;
                }
            }
        }
        return acceptableMatch;
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۳۴۴۵a(View child, int boundsFlags) {
        this.f۱۲۳۰۷b.m۱۳۴۴۸a(this.f۱۲۳۰۶a.mo۱۳۴۵۴b(), this.f۱۲۳۰۶a.mo۱۳۴۵۱a(), this.f۱۲۳۰۶a.mo۱۳۴۵۵b(child), this.f۱۲۳۰۶a.mo۱۳۴۵۲a(child));
        if (boundsFlags != 0) {
            this.f۱۲۳۰۷b.m۱۳۴۵۰b();
            this.f۱۲۳۰۷b.m۱۳۴۴۷a(boundsFlags);
            return this.f۱۲۳۰۷b.m۱۳۴۴۹a();
        }
        return false;
    }
}
