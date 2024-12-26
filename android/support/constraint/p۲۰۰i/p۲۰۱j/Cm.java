package android.support.constraint.p۲۰۰i.p۲۰۱j;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.i.j.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cm {

    /* renamed from: a, reason: contains not printable characters */
    HashSet<Cm> f۹۴۳۰a = new HashSet<>(2);

    /* renamed from: b, reason: contains not printable characters */
    int f۹۴۳۱b = 0;

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۱۵۸a(Cm node) {
        this.f۹۴۳۰a.add(node);
    }

    /* renamed from: d, reason: contains not printable characters */
    public void mo۹۱۶۱d() {
        this.f۹۴۳۱b = 0;
        this.f۹۴۳۰a.clear();
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۹۱۵۹b() {
        this.f۹۴۳۱b = 0;
        Iterator<Cm> it = this.f۹۴۳۰a.iterator();
        while (it.hasNext()) {
            Cm node = it.next();
            node.m۹۱۵۹b();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۱۵۷a() {
        this.f۹۴۳۱b = 1;
        Iterator<Cm> it = this.f۹۴۳۰a.iterator();
        while (it.hasNext()) {
            Cm node = it.next();
            node.mo۹۱۶۲e();
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public boolean m۹۱۶۰c() {
        return this.f۹۴۳۱b == 1;
    }

    /* renamed from: e, reason: contains not printable characters */
    public void mo۹۱۶۲e() {
    }
}
