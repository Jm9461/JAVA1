package android.support.constraint.p۰۴۱i.p۰۴۲j;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.i.j.m  reason: invalid class name */
public class Cm {

    /* renamed from: a  reason: contains not printable characters */
    HashSet<Cm> f۹۴۳۰a = new HashSet<>(2);

    /* renamed from: b  reason: contains not printable characters */
    int f۹۴۳۱b = 0;

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۲۶a(Cm node) {
        this.f۹۴۳۰a.add(node);
    }

    /* renamed from: d  reason: contains not printable characters */
    public void m۱۱۲۲۹d() {
        this.f۹۴۳۱b = 0;
        this.f۹۴۳۰a.clear();
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۲۲۷b() {
        this.f۹۴۳۱b = 0;
        Iterator<Cm> it = this.f۹۴۳۰a.iterator();
        while (it.hasNext()) {
            it.next().m۱۱۲۲۷b();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۲۵a() {
        this.f۹۴۳۱b = 1;
        Iterator<Cm> it = this.f۹۴۳۰a.iterator();
        while (it.hasNext()) {
            it.next().m۱۱۲۳۰e();
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۱۲۲۸c() {
        return this.f۹۴۳۱b == 1;
    }

    /* renamed from: e  reason: contains not printable characters */
    public void m۱۱۲۳۰e() {
    }
}
