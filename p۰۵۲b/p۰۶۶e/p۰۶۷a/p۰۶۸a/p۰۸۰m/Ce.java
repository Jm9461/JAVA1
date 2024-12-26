package p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.p۰۸۰m;

import android.view.View;
import android.view.ViewGroup;
import p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Ci;

/* renamed from: b.e.a.a.m.e  reason: invalid class name */
public class Ce extends AbstractCa {
    @Override // p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۱۰۲b(View target) {
        int distance = ((ViewGroup) target.getParent()).getHeight() - target.getTop();
        m۱۶۰۲۶a().m۱۶۲۰۷a(Ci.m۱۶۲۳۹a(target, "alpha", 0.0f, 1.0f, 1.0f), Ci.m۱۶۲۳۹a(target, "scaleX", 0.1f, 0.475f, 1.0f), Ci.m۱۶۲۳۹a(target, "scaleY", 0.1f, 0.475f, 1.0f), Ci.m۱۶۲۳۹a(target, "translationY", (float) distance, -60.0f, 0.0f));
    }
}
