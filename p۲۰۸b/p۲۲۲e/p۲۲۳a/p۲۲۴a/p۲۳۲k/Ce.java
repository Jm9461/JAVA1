package p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.p۲۳۲k;

import android.view.View;
import android.view.ViewGroup;
import p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Ci;

/* renamed from: b.e.a.a.k.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ce extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۴۰۳۶b(View target) {
        ViewGroup parent = (ViewGroup) target.getParent();
        int distance = parent.getHeight() - target.getTop();
        m۱۳۹۵۵a().m۱۴۱۳۷a(Ci.m۱۴۱۷۴a(target, "alpha", 1.0f, 0.0f), Ci.m۱۴۱۷۴a(target, "translationY", 0.0f, distance));
    }
}
