package android.support.p۰۴۷v7.widget;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.p1  reason: invalid class name */
public class Cp1 {

    /* renamed from: a  reason: contains not printable characters */
    final AbstractCb f۱۲۳۰۶a;

    /* renamed from: b  reason: contains not printable characters */
    Ca f۱۲۳۰۷b = new Ca();

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.p1$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        int m۱۵۵۲۱a();

        /* renamed from: a  reason: contains not printable characters */
        int m۱۵۵۲۲a(View view);

        /* renamed from: a  reason: contains not printable characters */
        View m۱۵۵۲۳a(int i);

        /* renamed from: b  reason: contains not printable characters */
        int m۱۵۵۲۴b();

        /* renamed from: b  reason: contains not printable characters */
        int m۱۵۵۲۵b(View view);
    }

    Cp1(AbstractCb callback) {
        this.f۱۲۳۰۶a = callback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.p1$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        int f۱۲۳۰۸a = 0;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۲۳۰۹b;

        /* renamed from: c  reason: contains not printable characters */
        int f۱۲۳۱۰c;

        /* renamed from: d  reason: contains not printable characters */
        int f۱۲۳۱۱d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۲۳۱۲e;

        Ca() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۵۱۸a(int rvStart, int rvEnd, int childStart, int childEnd) {
            this.f۱۲۳۰۹b = rvStart;
            this.f۱۲۳۱۰c = rvEnd;
            this.f۱۲۳۱۱d = childStart;
            this.f۱۲۳۱۲e = childEnd;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۵۱۷a(int flags) {
            this.f۱۲۳۰۸a |= flags;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۵۵۲۰b() {
            this.f۱۲۳۰۸a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۵۵۱۶a(int x, int y) {
            if (x > y) {
                return 1;
            }
            if (x == y) {
                return 2;
            }
            return 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۵۵۱۹a() {
            int i = this.f۱۲۳۰۸a;
            if ((i & 7) != 0 && (i & (m۱۵۵۱۶a(this.f۱۲۳۱۱d, this.f۱۲۳۰۹b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f۱۲۳۰۸a;
            if ((i2 & 112) != 0 && (i2 & (m۱۵۵۱۶a(this.f۱۲۳۱۱d, this.f۱۲۳۱۰c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f۱۲۳۰۸a;
            if ((i3 & 1792) != 0 && (i3 & (m۱۵۵۱۶a(this.f۱۲۳۱۲e, this.f۱۲۳۰۹b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f۱۲۳۰۸a;
            if ((i4 & 28672) == 0 || (i4 & (m۱۵۵۱۶a(this.f۱۲۳۱۲e, this.f۱۲۳۱۰c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۵۵۱۴a(int fromIndex, int toIndex, int preferredBoundFlags, int acceptableBoundFlags) {
        int start = this.f۱۲۳۰۶a.m۱۵۵۲۴b();
        int end = this.f۱۲۳۰۶a.m۱۵۵۲۱a();
        int next = toIndex > fromIndex ? 1 : -1;
        View acceptableMatch = null;
        for (int i = fromIndex; i != toIndex; i += next) {
            View child = this.f۱۲۳۰۶a.m۱۵۵۲۳a(i);
            this.f۱۲۳۰۷b.m۱۵۵۱۸a(start, end, this.f۱۲۳۰۶a.m۱۵۵۲۵b(child), this.f۱۲۳۰۶a.m۱۵۵۲۲a(child));
            if (preferredBoundFlags != 0) {
                this.f۱۲۳۰۷b.m۱۵۵۲۰b();
                this.f۱۲۳۰۷b.m۱۵۵۱۷a(preferredBoundFlags);
                if (this.f۱۲۳۰۷b.m۱۵۵۱۹a()) {
                    return child;
                }
            }
            if (acceptableBoundFlags != 0) {
                this.f۱۲۳۰۷b.m۱۵۵۲۰b();
                this.f۱۲۳۰۷b.m۱۵۵۱۷a(acceptableBoundFlags);
                if (this.f۱۲۳۰۷b.m۱۵۵۱۹a()) {
                    acceptableMatch = child;
                }
            }
        }
        return acceptableMatch;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۵۱۵a(View child, int boundsFlags) {
        this.f۱۲۳۰۷b.m۱۵۵۱۸a(this.f۱۲۳۰۶a.m۱۵۵۲۴b(), this.f۱۲۳۰۶a.m۱۵۵۲۱a(), this.f۱۲۳۰۶a.m۱۵۵۲۵b(child), this.f۱۲۳۰۶a.m۱۵۵۲۲a(child));
        if (boundsFlags == 0) {
            return false;
        }
        this.f۱۲۳۰۷b.m۱۵۵۲۰b();
        this.f۱۲۳۰۷b.m۱۵۵۱۷a(boundsFlags);
        return this.f۱۲۳۰۷b.m۱۵۵۱۹a();
    }
}
