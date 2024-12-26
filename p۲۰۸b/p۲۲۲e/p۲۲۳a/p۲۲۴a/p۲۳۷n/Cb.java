package p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.p۲۳۷n;

import android.view.View;
import android.view.ViewGroup;
import p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Ci;

/* renamed from: b.e.a.a.n.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    protected void mo۱۴۰۳۶b(View target) {
        ViewGroup parent = (ViewGroup) target.getParent();
        int distance = parent.getHeight() - target.getTop();
        m۱۳۹۵۵a().m۱۴۱۳۷a(Ci.m۱۴۱۷۴a(target, "alpha", 1.0f, 1.0f, 0.0f), Ci.m۱۴۱۷۴a(target, "scaleX", 1.0f, 0.475f, 0.1f), Ci.m۱۴۱۷۴a(target, "scaleY", 1.0f, 0.475f, 0.1f), Ci.m۱۴۱۷۴a(target, "translationY", 0.0f, -60.0f, distance));
    }
}
