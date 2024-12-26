package p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.p۰۷۶k;

import android.view.View;
import android.view.ViewGroup;
import p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Ci;

/* renamed from: b.e.a.a.k.c  reason: invalid class name */
public class Cc extends AbstractCa {
    @Override // p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۰۸۶b(View target) {
        int distance = ((ViewGroup) target.getParent()).getWidth() - target.getLeft();
        m۱۶۰۲۶a().m۱۶۲۰۷a(Ci.m۱۶۲۳۹a(target, "alpha", 0.0f, 1.0f), Ci.m۱۶۲۳۹a(target, "translationX", (float) distance, 0.0f));
    }
}
