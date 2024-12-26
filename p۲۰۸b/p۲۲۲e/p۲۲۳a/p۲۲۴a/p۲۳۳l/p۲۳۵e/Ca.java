package p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.p۲۳۳l.p۲۳۵e;

import android.view.View;
import p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa;
import p۲۰۸b.p۲۲۲e.p۲۳۸b.Cb;
import p۲۰۸b.p۲۲۲e.p۲۳۸b.EnumCc;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Cc;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Ci;

/* renamed from: b.e.a.a.l.e.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    protected void mo۱۴۰۳۶b(View target) {
        Cc cc = m۱۳۹۵۵a();
        EnumCc enumCc = EnumCc.QuintEaseOut;
        float f2 = m۱۳۹۵۷b();
        Ci ci = Ci.m۱۴۱۷۴a(target, "scaleX", 1.0f, 1.5f);
        Cb.m۱۴۰۴۱a(enumCc, f2, ci);
        EnumCc enumCc2 = EnumCc.QuintEaseOut;
        float f3 = m۱۳۹۵۷b();
        Ci ci2 = Ci.m۱۴۱۷۴a(target, "scaleY", 1.0f, 1.5f);
        Cb.m۱۴۰۴۱a(enumCc2, f3, ci2);
        EnumCc enumCc3 = EnumCc.QuintEaseOut;
        float f4 = m۱۳۹۵۷b();
        Ci ci3 = Ci.m۱۴۱۷۴a(target, "alpha", 1.0f, 0.0f);
        Cb.m۱۴۰۴۱a(enumCc3, f4, ci3);
        cc.m۱۴۱۳۷a(ci, ci2, ci3);
    }
}
