package p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.p۰۷۷l.p۰۷۸d;

import android.view.View;
import p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa;
import p۰۵۲b.p۰۶۶e.p۰۸۲b.Cb;
import p۰۵۲b.p۰۶۶e.p۰۸۲b.EnumCc;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Cc;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Ci;

/* renamed from: b.e.a.a.l.d.a  reason: invalid class name */
public class Ca extends AbstractCa {
    /* access modifiers changed from: protected */
    @Override // p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۰۹۵b(View target) {
        int distance = target.getTop() + target.getHeight();
        Cc a = m۱۶۰۲۶a();
        Ci a2 = Ci.m۱۶۲۳۹a(target, "translationY", (float) (-distance), 0.0f);
        Cb.m۱۶۱۱۲a(EnumCc.BounceEaseOut, (float) m۱۶۰۲۸b(), a2);
        a.m۱۶۲۰۷a(Ci.m۱۶۲۳۹a(target, "alpha", 0.0f, 1.0f), a2);
    }
}
