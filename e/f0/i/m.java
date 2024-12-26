package e.f0.i;

import java.util.Arrays;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    private int f۴۰۰۷a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f۴۰۰۸b = new int[10];

    /* access modifiers changed from: package-private */
    public void a() {
        this.f۴۰۰۷a = 0;
        Arrays.fill(this.f۴۰۰۸b, 0);
    }

    /* access modifiers changed from: package-private */
    public m a(int id, int value) {
        if (id >= 0) {
            int[] iArr = this.f۴۰۰۸b;
            if (id < iArr.length) {
                this.f۴۰۰۷a |= 1 << id;
                iArr[id] = value;
                return this;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean d(int id) {
        if ((this.f۴۰۰۷a & (1 << id)) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int a(int id) {
        return this.f۴۰۰۸b[id];
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return Integer.bitCount(this.f۴۰۰۷a);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        if ((this.f۴۰۰۷a & 2) != 0) {
            return this.f۴۰۰۸b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public int b(int defaultValue) {
        return (this.f۴۰۰۷a & 16) != 0 ? this.f۴۰۰۸b[4] : defaultValue;
    }

    /* access modifiers changed from: package-private */
    public int c(int defaultValue) {
        return (this.f۴۰۰۷a & 32) != 0 ? this.f۴۰۰۸b[5] : defaultValue;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        if ((this.f۴۰۰۷a & 128) != 0) {
            return this.f۴۰۰۸b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    public void a(m other) {
        for (int i = 0; i < 10; i++) {
            if (other.d(i)) {
                a(i, other.a(i));
            }
        }
    }
}
