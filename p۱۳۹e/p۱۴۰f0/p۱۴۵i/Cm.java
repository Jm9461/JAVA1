package p۱۳۹e.p۱۴۰f0.p۱۴۵i;

import java.util.Arrays;

/* renamed from: e.f0.i.m  reason: invalid class name */
public final class Cm {

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۶۰۴۱a;

    /* renamed from: b  reason: contains not printable characters */
    private final int[] f۱۶۰۴۲b = new int[10];

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۲۲a() {
        this.f۱۶۰۴۱a = 0;
        Arrays.fill(this.f۱۶۰۴۲b, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cm m۱۹۰۲۱a(int id, int value) {
        if (id >= 0) {
            int[] iArr = this.f۱۶۰۴۲b;
            if (id < iArr.length) {
                this.f۱۶۰۴۱a |= 1 << id;
                iArr[id] = value;
                return this;
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public boolean m۱۹۰۲۹d(int id) {
        if ((this.f۱۶۰۴۱a & (1 << id)) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۹۰۲۰a(int id) {
        return this.f۱۶۰۴۲b[id];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public int m۱۹۰۲۸d() {
        return Integer.bitCount(this.f۱۶۰۴۱a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۹۰۲۴b() {
        if ((this.f۱۶۰۴۱a & 2) != 0) {
            return this.f۱۶۰۴۲b[1];
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۹۰۲۵b(int defaultValue) {
        return (this.f۱۶۰۴۱a & 16) != 0 ? this.f۱۶۰۴۲b[4] : defaultValue;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۹۰۲۷c(int defaultValue) {
        return (this.f۱۶۰۴۱a & 32) != 0 ? this.f۱۶۰۴۲b[5] : defaultValue;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public int m۱۹۰۲۶c() {
        if ((this.f۱۶۰۴۱a & 128) != 0) {
            return this.f۱۶۰۴۲b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۰۲۳a(Cm other) {
        for (int i = 0; i < 10; i++) {
            if (other.m۱۹۰۲۹d(i)) {
                m۱۹۰۲۱a(i, other.m۱۹۰۲۰a(i));
            }
        }
    }
}
