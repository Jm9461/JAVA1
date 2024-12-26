package android.support.constraint.p۰۴۱i.p۰۴۲j;

import java.util.Arrays;

/* renamed from: android.support.constraint.i.j.h  reason: invalid class name */
public class Ch extends Ce {

    /* renamed from: e0  reason: contains not printable characters */
    protected Ce[] f۹۴۱۵e0 = new Ce[4];

    /* renamed from: f0  reason: contains not printable characters */
    protected int f۹۴۱۶f0 = 0;

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۲۰۴b(Ce widget) {
        int i = this.f۹۴۱۶f0 + 1;
        Ce[] eVarArr = this.f۹۴۱۵e0;
        if (i > eVarArr.length) {
            this.f۹۴۱۵e0 = (Ce[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        Ce[] eVarArr2 = this.f۹۴۱۵e0;
        int i2 = this.f۹۴۱۶f0;
        eVarArr2[i2] = widget;
        this.f۹۴۱۶f0 = i2 + 1;
    }

    /* renamed from: H  reason: contains not printable characters */
    public void m۱۱۲۰۳H() {
        this.f۹۴۱۶f0 = 0;
    }
}
