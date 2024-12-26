package p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.p۰۸۱n;

import android.view.View;
import android.view.ViewGroup;
import p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Ci;

/* renamed from: b.e.a.a.n.b  reason: invalid class name */
public class Cb extends AbstractCa {
    /* access modifiers changed from: protected */
    @Override // p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۱۰۴b(View target) {
        int distance = ((ViewGroup) target.getParent()).getHeight() - target.getTop();
        m۱۶۰۲۶a().m۱۶۲۰۷a(Ci.m۱۶۲۳۹a(target, "alpha", 1.0f, 1.0f, 0.0f), Ci.m۱۶۲۳۹a(target, "scaleX", 1.0f, 0.475f, 0.1f), Ci.m۱۶۲۳۹a(target, "scaleY", 1.0f, 0.475f, 0.1f), Ci.m۱۶۲۳۹a(target, "translationY", 0.0f, -60.0f, (float) distance));
    }
}
