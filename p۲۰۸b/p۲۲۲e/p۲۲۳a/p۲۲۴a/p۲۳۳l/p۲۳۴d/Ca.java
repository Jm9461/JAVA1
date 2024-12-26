package p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.p۲۳۳l.p۲۳۴d;

import android.view.View;
import p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa;
import p۲۰۸b.p۲۲۲e.p۲۳۸b.Cb;
import p۲۰۸b.p۲۲۲e.p۲۳۸b.EnumCc;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Cc;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Ci;

/* renamed from: b.e.a.a.l.d.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    protected void mo۱۴۰۳۶b(View target) {
        int distance = target.getTop() + target.getHeight();
        Cc cc = m۱۳۹۵۵a();
        EnumCc enumCc = EnumCc.BounceEaseOut;
        float f2 = m۱۳۹۵۷b();
        Ci ci = Ci.m۱۴۱۷۴a(target, "translationY", -distance, 0.0f);
        Cb.m۱۴۰۴۱a(enumCc, f2, ci);
        cc.m۱۴۱۳۷a(Ci.m۱۴۱۷۴a(target, "alpha", 0.0f, 1.0f), ci);
    }
}
