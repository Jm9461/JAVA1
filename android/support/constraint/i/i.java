package android.support.constraint.i;

import java.util.Arrays;

public class i {
    private static int k = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f۶۳۸a;

    /* renamed from: b  reason: collision with root package name */
    public int f۶۳۹b = -1;

    /* renamed from: c  reason: collision with root package name */
    int f۶۴۰c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f۶۴۱d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f۶۴۲e;

    /* renamed from: f  reason: collision with root package name */
    float[] f۶۴۳f = new float[7];

    /* renamed from: g  reason: collision with root package name */
    a f۶۴۴g;

    /* renamed from: h  reason: collision with root package name */
    b[] f۶۴۵h = new b[8];
    int i = 0;
    public int j = 0;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    static void b() {
        k++;
    }

    public i(a type, String prefix) {
        this.f۶۴۴g = type;
    }

    public final void a(b row) {
        int i2 = 0;
        while (true) {
            int i3 = this.i;
            if (i2 >= i3) {
                b[] bVarArr = this.f۶۴۵h;
                if (i3 >= bVarArr.length) {
                    this.f۶۴۵h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f۶۴۵h;
                int i4 = this.i;
                bVarArr2[i4] = row;
                this.i = i4 + 1;
                return;
            } else if (this.f۶۴۵h[i2] != row) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(b row) {
        int count = this.i;
        for (int i2 = 0; i2 < count; i2++) {
            if (this.f۶۴۵h[i2] == row) {
                for (int j2 = 0; j2 < (count - i2) - 1; j2++) {
                    b[] bVarArr = this.f۶۴۵h;
                    bVarArr[i2 + j2] = bVarArr[i2 + j2 + 1];
                }
                this.i--;
                return;
            }
        }
    }

    public final void c(b definition) {
        int count = this.i;
        for (int i2 = 0; i2 < count; i2++) {
            b[] bVarArr = this.f۶۴۵h;
            bVarArr[i2].f۶۱۵d.a(bVarArr[i2], definition, false);
        }
        this.i = 0;
    }

    public void a() {
        this.f۶۳۸a = null;
        this.f۶۴۴g = a.UNKNOWN;
        this.f۶۴۱d = 0;
        this.f۶۳۹b = -1;
        this.f۶۴۰c = -1;
        this.f۶۴۲e = 0.0f;
        this.i = 0;
        this.j = 0;
    }

    public void a(a type, String prefix) {
        this.f۶۴۴g = type;
    }

    public String toString() {
        return "" + this.f۶۳۸a;
    }
}
