package android.support.design.widget;

import android.support.v4.view.u;
import android.view.View;

/* access modifiers changed from: package-private */
public class y {

    /* renamed from: a  reason: collision with root package name */
    private final View f۱۰۳۱a;

    /* renamed from: b  reason: collision with root package name */
    private int f۱۰۳۲b;

    /* renamed from: c  reason: collision with root package name */
    private int f۱۰۳۳c;

    /* renamed from: d  reason: collision with root package name */
    private int f۱۰۳۴d;

    /* renamed from: e  reason: collision with root package name */
    private int f۱۰۳۵e;

    public y(View view) {
        this.f۱۰۳۱a = view;
    }

    public void b() {
        this.f۱۰۳۲b = this.f۱۰۳۱a.getTop();
        this.f۱۰۳۳c = this.f۱۰۳۱a.getLeft();
        c();
    }

    private void c() {
        View view = this.f۱۰۳۱a;
        u.d(view, this.f۱۰۳۴d - (view.getTop() - this.f۱۰۳۲b));
        View view2 = this.f۱۰۳۱a;
        u.c(view2, this.f۱۰۳۵e - (view2.getLeft() - this.f۱۰۳۳c));
    }

    public boolean b(int offset) {
        if (this.f۱۰۳۴d == offset) {
            return false;
        }
        this.f۱۰۳۴d = offset;
        c();
        return true;
    }

    public boolean a(int offset) {
        if (this.f۱۰۳۵e == offset) {
            return false;
        }
        this.f۱۰۳۵e = offset;
        c();
        return true;
    }

    public int a() {
        return this.f۱۰۳۴d;
    }
}
