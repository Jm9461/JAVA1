package android.support.constraint.p۰۴۱i;

import java.util.Arrays;

/* renamed from: android.support.constraint.i.i  reason: invalid class name */
public class Ci {

    /* renamed from: k  reason: contains not printable characters */
    private static int f۹۲۶۷k = 1;

    /* renamed from: a  reason: contains not printable characters */
    private String f۹۲۶۸a;

    /* renamed from: b  reason: contains not printable characters */
    public int f۹۲۶۹b = -1;

    /* renamed from: c  reason: contains not printable characters */
    int f۹۲۷۰c = -1;

    /* renamed from: d  reason: contains not printable characters */
    public int f۹۲۷۱d = 0;

    /* renamed from: e  reason: contains not printable characters */
    public float f۹۲۷۲e;

    /* renamed from: f  reason: contains not printable characters */
    float[] f۹۲۷۳f = new float[7];

    /* renamed from: g  reason: contains not printable characters */
    EnumCa f۹۲۷۴g;

    /* renamed from: h  reason: contains not printable characters */
    Cb[] f۹۲۷۵h = new Cb[8];

    /* renamed from: i  reason: contains not printable characters */
    int f۹۲۷۶i = 0;

    /* renamed from: j  reason: contains not printable characters */
    public int f۹۲۷۷j = 0;

    /* renamed from: android.support.constraint.i.i$a  reason: invalid class name */
    public enum EnumCa {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: b  reason: contains not printable characters */
    static void m۱۱۰۶۱b() {
        f۹۲۶۷k++;
    }

    public Ci(EnumCa type, String prefix) {
        this.f۹۲۷۴g = type;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۱۰۶۳a(Cb row) {
        int i = 0;
        while (true) {
            int i2 = this.f۹۲۷۶i;
            if (i >= i2) {
                Cb[] bVarArr = this.f۹۲۷۵h;
                if (i2 >= bVarArr.length) {
                    this.f۹۲۷۵h = (Cb[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                Cb[] bVarArr2 = this.f۹۲۷۵h;
                int i3 = this.f۹۲۷۶i;
                bVarArr2[i3] = row;
                this.f۹۲۷۶i = i3 + 1;
                return;
            } else if (this.f۹۲۷۵h[i] != row) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public final void m۱۱۰۶۵b(Cb row) {
        int count = this.f۹۲۷۶i;
        for (int i = 0; i < count; i++) {
            if (this.f۹۲۷۵h[i] == row) {
                for (int j = 0; j < (count - i) - 1; j++) {
                    Cb[] bVarArr = this.f۹۲۷۵h;
                    bVarArr[i + j] = bVarArr[i + j + 1];
                }
                this.f۹۲۷۶i--;
                return;
            }
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public final void m۱۱۰۶۶c(Cb definition) {
        int count = this.f۹۲۷۶i;
        for (int i = 0; i < count; i++) {
            Cb[] bVarArr = this.f۹۲۷۵h;
            bVarArr[i].f۹۲۱۶d.m۱۰۹۸۷a(bVarArr[i], definition, false);
        }
        this.f۹۲۷۶i = 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۶۲a() {
        this.f۹۲۶۸a = null;
        this.f۹۲۷۴g = EnumCa.UNKNOWN;
        this.f۹۲۷۱d = 0;
        this.f۹۲۶۹b = -1;
        this.f۹۲۷۰c = -1;
        this.f۹۲۷۲e = 0.0f;
        this.f۹۲۷۶i = 0;
        this.f۹۲۷۷j = 0;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۰۶۴a(EnumCa type, String prefix) {
        this.f۹۲۷۴g = type;
    }

    public String toString() {
        return "" + this.f۹۲۶۸a;
    }
}
