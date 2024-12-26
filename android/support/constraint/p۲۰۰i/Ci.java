package android.support.constraint.p۲۰۰i;

import java.util.Arrays;

/* renamed from: android.support.constraint.i.i, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ci {

    /* renamed from: k, reason: contains not printable characters */
    private static int f۹۲۶۷k = 1;

    /* renamed from: a, reason: contains not printable characters */
    private String f۹۲۶۸a;

    /* renamed from: e, reason: contains not printable characters */
    public float f۹۲۷۲e;

    /* renamed from: g, reason: contains not printable characters */
    a f۹۲۷۴g;

    /* renamed from: b, reason: contains not printable characters */
    public int f۹۲۶۹b = -1;

    /* renamed from: c, reason: contains not printable characters */
    int f۹۲۷۰c = -1;

    /* renamed from: d, reason: contains not printable characters */
    public int f۹۲۷۱d = 0;

    /* renamed from: f, reason: contains not printable characters */
    float[] f۹۲۷۳f = new float[7];

    /* renamed from: h, reason: contains not printable characters */
    Cb[] f۹۲۷۵h = new Cb[8];

    /* renamed from: i, reason: contains not printable characters */
    int f۹۲۷۶i = 0;

    /* renamed from: j, reason: contains not printable characters */
    public int f۹۲۷۷j = 0;

    /* renamed from: android.support.constraint.i.i$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    /* renamed from: b, reason: contains not printable characters */
    static void m۸۹۹۳b() {
        f۹۲۶۷k++;
    }

    public Ci(a type, String prefix) {
        this.f۹۲۷۴g = type;
    }

    /* renamed from: a, reason: contains not printable characters */
    public final void m۸۹۹۵a(Cb row) {
        int i = 0;
        while (true) {
            int i2 = this.f۹۲۷۶i;
            if (i < i2) {
                if (this.f۹۲۷۵h[i] != row) {
                    i++;
                } else {
                    return;
                }
            } else {
                Cb[] cbArr = this.f۹۲۷۵h;
                if (i2 >= cbArr.length) {
                    this.f۹۲۷۵h = (Cb[]) Arrays.copyOf(cbArr, cbArr.length * 2);
                }
                Cb[] cbArr2 = this.f۹۲۷۵h;
                int i3 = this.f۹۲۷۶i;
                cbArr2[i3] = row;
                this.f۹۲۷۶i = i3 + 1;
                return;
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public final void m۸۹۹۷b(Cb row) {
        int count = this.f۹۲۷۶i;
        for (int i = 0; i < count; i++) {
            if (this.f۹۲۷۵h[i] == row) {
                for (int j = 0; j < (count - i) - 1; j++) {
                    Cb[] cbArr = this.f۹۲۷۵h;
                    cbArr[i + j] = cbArr[i + j + 1];
                }
                int j2 = this.f۹۲۷۶i;
                this.f۹۲۷۶i = j2 - 1;
                return;
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public final void m۸۹۹۸c(Cb definition) {
        int count = this.f۹۲۷۶i;
        for (int i = 0; i < count; i++) {
            Cb[] cbArr = this.f۹۲۷۵h;
            cbArr[i].f۹۲۱۶d.m۸۹۱۹a(cbArr[i], definition, false);
        }
        this.f۹۲۷۶i = 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۹۹۴a() {
        this.f۹۲۶۸a = null;
        this.f۹۲۷۴g = a.UNKNOWN;
        this.f۹۲۷۱d = 0;
        this.f۹۲۶۹b = -1;
        this.f۹۲۷۰c = -1;
        this.f۹۲۷۲e = 0.0f;
        this.f۹۲۷۶i = 0;
        this.f۹۲۷۷j = 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۹۹۶a(a type, String prefix) {
        this.f۹۲۷۴g = type;
    }

    public String toString() {
        String result = "" + this.f۹۲۶۸a;
        return result;
    }
}
