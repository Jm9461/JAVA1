package p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.p۰۷۷l.p۰۷۸d;

import android.view.View;
import p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa;
import p۰۵۲b.p۰۶۶e.p۰۸۲b.EnumCc;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Cc;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Ci;

/* renamed from: b.e.a.a.l.d.b  reason: invalid class name */
public class Cb extends AbstractCa {
    /* access modifiers changed from: protected */
    @Override // p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۰۹۶b(View target) {
        Cc a = m۱۶۰۲۶a();
        Ci a2 = Ci.m۱۶۲۳۹a(target, "scaleX", 1.5f, 1.0f);
        p۰۵۲b.p۰۶۶e.p۰۸۲b.Cb.m۱۶۱۱۲a(EnumCc.QuintEaseOut, (float) m۱۶۰۲۸b(), a2);
        EnumCc cVar = EnumCc.QuintEaseOut;
        float b = (float) m۱۶۰۲۸b();
        Ci a3 = Ci.m۱۶۲۳۹a(target, "scaleY", 1.5f, 1.0f);
        p۰۵۲b.p۰۶۶e.p۰۸۲b.Cb.m۱۶۱۱۲a(cVar, b, a3);
        EnumCc cVar2 = EnumCc.QuintEaseOut;
        float b2 = (float) m۱۶۰۲۸b();
        Ci a4 = Ci.m۱۶۲۳۹a(target, "alpha", 0.0f, 1.0f);
        p۰۵۲b.p۰۶۶e.p۰۸۲b.Cb.m۱۶۱۱۲a(cVar2, b2, a4);
        a.m۱۶۲۰۷a(a2, a3, a4);
    }
}
