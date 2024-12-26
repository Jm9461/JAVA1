package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import java.util.Arrays;

/* renamed from: e.f0.i.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cm {

    /* renamed from: a, reason: contains not printable characters */
    private int f۱۶۰۴۱a;

    /* renamed from: b, reason: contains not printable characters */
    private final int[] f۱۶۰۴۲b = new int[10];

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۹۴۳a() {
        this.f۱۶۰۴۱a = 0;
        Arrays.fill(this.f۱۶۰۴۲b, 0);
    }

    /* renamed from: a, reason: contains not printable characters */
    Cm m۱۶۹۴۲a(int id, int value) {
        if (id >= 0) {
            int[] iArr = this.f۱۶۰۴۲b;
            if (id < iArr.length) {
                int bit = 1 << id;
                this.f۱۶۰۴۱a |= bit;
                iArr[id] = value;
                return this;
            }
        }
        return this;
    }

    /* renamed from: d, reason: contains not printable characters */
    boolean m۱۶۹۵۰d(int id) {
        int bit = 1 << id;
        return (this.f۱۶۰۴۱a & bit) != 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    int m۱۶۹۴۱a(int id) {
        return this.f۱۶۰۴۲b[id];
    }

    /* renamed from: d, reason: contains not printable characters */
    int m۱۶۹۴۹d() {
        return Integer.bitCount(this.f۱۶۰۴۱a);
    }

    /* renamed from: b, reason: contains not printable characters */
    int m۱۶۹۴۵b() {
        if ((this.f۱۶۰۴۱a & 2) != 0) {
            return this.f۱۶۰۴۲b[1];
        }
        return -1;
    }

    /* renamed from: b, reason: contains not printable characters */
    int m۱۶۹۴۶b(int defaultValue) {
        return (this.f۱۶۰۴۱a & 16) != 0 ? this.f۱۶۰۴۲b[4] : defaultValue;
    }

    /* renamed from: c, reason: contains not printable characters */
    int m۱۶۹۴۸c(int defaultValue) {
        return (this.f۱۶۰۴۱a & 32) != 0 ? this.f۱۶۰۴۲b[5] : defaultValue;
    }

    /* renamed from: c, reason: contains not printable characters */
    int m۱۶۹۴۷c() {
        if ((this.f۱۶۰۴۱a & 128) != 0) {
            return this.f۱۶۰۴۲b[7];
        }
        return 65535;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۹۴۴a(Cm other) {
        for (int i = 0; i < 10; i++) {
            if (other.m۱۶۹۵۰d(i)) {
                m۱۶۹۴۲a(i, other.m۱۶۹۴۱a(i));
            }
        }
    }
}
