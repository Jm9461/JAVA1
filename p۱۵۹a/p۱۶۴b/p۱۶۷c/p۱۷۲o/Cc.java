package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۲o;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.b.c.o.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cc {

    /* renamed from: a, reason: contains not printable characters */
    private final View f۸۳۱۵a;

    /* renamed from: b, reason: contains not printable characters */
    private boolean f۸۳۱۶b = false;

    /* renamed from: c, reason: contains not printable characters */
    private int f۸۳۱۷c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public Cc(InterfaceCb interfaceCb) {
        this.f۸۳۱۵a = (View) interfaceCb;
    }

    /* renamed from: b, reason: contains not printable characters */
    public boolean m۷۹۶۱b() {
        return this.f۸۳۱۶b;
    }

    /* renamed from: c, reason: contains not printable characters */
    public Bundle m۷۹۶۲c() {
        Bundle state = new Bundle();
        state.putBoolean("expanded", this.f۸۳۱۶b);
        state.putInt("expandedComponentIdHint", this.f۸۳۱۷c);
        return state;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۷۹۶۰a(Bundle state) {
        this.f۸۳۱۶b = state.getBoolean("expanded", false);
        this.f۸۳۱۷c = state.getInt("expandedComponentIdHint", 0);
        if (this.f۸۳۱۶b) {
            m۷۹۵۷d();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۷۹۵۹a(int expandedComponentIdHint) {
        this.f۸۳۱۷c = expandedComponentIdHint;
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۷۹۵۸a() {
        return this.f۸۳۱۷c;
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۷۹۵۷d() {
        ViewParent parent = this.f۸۳۱۵a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m۹۴۶۸a(this.f۸۳۱۵a);
        }
    }
}
