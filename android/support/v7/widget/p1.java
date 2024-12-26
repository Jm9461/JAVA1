package android.support.v7.widget;

import android.view.View;

/* access modifiers changed from: package-private */
public class p1 {

    /* renamed from: a  reason: collision with root package name */
    final b f۲۲۲۵a;

    /* renamed from: b  reason: collision with root package name */
    a f۲۲۲۶b = new a();

    /* access modifiers changed from: package-private */
    public interface b {
        int a();

        int a(View view);

        View a(int i);

        int b();

        int b(View view);
    }

    p1(b callback) {
        this.f۲۲۲۵a = callback;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        int f۲۲۲۷a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f۲۲۲۸b;

        /* renamed from: c  reason: collision with root package name */
        int f۲۲۲۹c;

        /* renamed from: d  reason: collision with root package name */
        int f۲۲۳۰d;

        /* renamed from: e  reason: collision with root package name */
        int f۲۲۳۱e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int rvStart, int rvEnd, int childStart, int childEnd) {
            this.f۲۲۲۸b = rvStart;
            this.f۲۲۲۹c = rvEnd;
            this.f۲۲۳۰d = childStart;
            this.f۲۲۳۱e = childEnd;
        }

        /* access modifiers changed from: package-private */
        public void a(int flags) {
            this.f۲۲۲۷a |= flags;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f۲۲۲۷a = 0;
        }

        /* access modifiers changed from: package-private */
        public int a(int x, int y) {
            if (x > y) {
                return 1;
            }
            if (x == y) {
                return 2;
            }
            return 4;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            int i = this.f۲۲۲۷a;
            if ((i & 7) != 0 && (i & (a(this.f۲۲۳۰d, this.f۲۲۲۸b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f۲۲۲۷a;
            if ((i2 & 112) != 0 && (i2 & (a(this.f۲۲۳۰d, this.f۲۲۲۹c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f۲۲۲۷a;
            if ((i3 & 1792) != 0 && (i3 & (a(this.f۲۲۳۱e, this.f۲۲۲۸b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f۲۲۲۷a;
            if ((i4 & 28672) == 0 || (i4 & (a(this.f۲۲۳۱e, this.f۲۲۲۹c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public View a(int fromIndex, int toIndex, int preferredBoundFlags, int acceptableBoundFlags) {
        int start = this.f۲۲۲۵a.b();
        int end = this.f۲۲۲۵a.a();
        int next = toIndex > fromIndex ? 1 : -1;
        View acceptableMatch = null;
        for (int i = fromIndex; i != toIndex; i += next) {
            View child = this.f۲۲۲۵a.a(i);
            this.f۲۲۲۶b.a(start, end, this.f۲۲۲۵a.b(child), this.f۲۲۲۵a.a(child));
            if (preferredBoundFlags != 0) {
                this.f۲۲۲۶b.b();
                this.f۲۲۲۶b.a(preferredBoundFlags);
                if (this.f۲۲۲۶b.a()) {
                    return child;
                }
            }
            if (acceptableBoundFlags != 0) {
                this.f۲۲۲۶b.b();
                this.f۲۲۲۶b.a(acceptableBoundFlags);
                if (this.f۲۲۲۶b.a()) {
                    acceptableMatch = child;
                }
            }
        }
        return acceptableMatch;
    }

    /* access modifiers changed from: package-private */
    public boolean a(View child, int boundsFlags) {
        this.f۲۲۲۶b.a(this.f۲۲۲۵a.b(), this.f۲۲۲۵a.a(), this.f۲۲۲۵a.b(child), this.f۲۲۲۵a.a(child));
        if (boundsFlags == 0) {
            return false;
        }
        this.f۲۲۲۶b.b();
        this.f۲۲۲۶b.a(boundsFlags);
        return this.f۲۲۲۶b.a();
    }
}
