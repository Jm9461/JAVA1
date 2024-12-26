package p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.p۰۷۷l;

import android.view.View;
import p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa;
import p۰۵۲b.p۰۶۶e.p۰۸۲b.Cb;
import p۰۵۲b.p۰۶۶e.p۰۸۲b.EnumCc;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Cc;
import p۰۵۲b.p۱۰۳h.p۱۰۴a.Ci;

/* renamed from: b.e.a.a.l.a  reason: invalid class name */
public class Ca extends AbstractCa {
    @Override // p۰۵۲b.p۰۶۶e.p۰۶۷a.p۰۶۸a.AbstractCa
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۶۰۹۲b(View target) {
        float x = (float) target.getPaddingLeft();
        float y = (float) target.getPaddingTop();
        Cc a = m۱۶۰۲۶a();
        EnumCc cVar = EnumCc.SineEaseInOut;
        Ci a2 = Ci.m۱۶۲۳۹a(target, "rotation", 0.0f, 80.0f, 60.0f, 80.0f, 60.0f, 60.0f);
        Cb.m۱۶۱۱۲a(cVar, 1300.0f, a2);
        a.m۱۶۲۰۷a(a2, Ci.m۱۶۲۳۹a(target, "translationY", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 700.0f), Ci.m۱۶۲۳۹a(target, "alpha", 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f), Ci.m۱۶۲۳۹a(target, "pivotX", x, x, x, x, x, x), Ci.m۱۶۲۳۹a(target, "pivotY", y, y, y, y, y, y));
        m۱۶۰۲۳a(1300);
    }
}
