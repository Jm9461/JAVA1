package android.support.design.widget;

import android.support.p۰۴۳v4.view.Cu;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: android.support.design.widget.y  reason: invalid class name */
public class Cy {

    /* renamed from: a  reason: contains not printable characters */
    private final View f۱۰۰۵۸a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۰۰۵۹b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۰۰۶۰c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۰۰۶۱d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۰۰۶۲e;

    public Cy(View view) {
        this.f۱۰۰۵۸a = view;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۰۳۸b() {
        this.f۱۰۰۵۹b = this.f۱۰۰۵۸a.getTop();
        this.f۱۰۰۶۰c = this.f۱۰۰۵۸a.getLeft();
        m۱۲۰۳۵c();
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۲۰۳۵c() {
        View view = this.f۱۰۰۵۸a;
        Cu.m۱۳۰۰۳d(view, this.f۱۰۰۶۱d - (view.getTop() - this.f۱۰۰۵۹b));
        View view2 = this.f۱۰۰۵۸a;
        Cu.m۱۳۰۰۱c(view2, this.f۱۰۰۶۲e - (view2.getLeft() - this.f۱۰۰۶۰c));
    }

    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۰۳۹b(int offset) {
        if (this.f۱۰۰۶۱d == offset) {
            return false;
        }
        this.f۱۰۰۶۱d = offset;
        m۱۲۰۳۵c();
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۰۳۷a(int offset) {
        if (this.f۱۰۰۶۲e == offset) {
            return false;
        }
        this.f۱۰۰۶۲e = offset;
        m۱۲۰۳۵c();
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۲۰۳۶a() {
        return this.f۱۰۰۶۱d;
    }
}
