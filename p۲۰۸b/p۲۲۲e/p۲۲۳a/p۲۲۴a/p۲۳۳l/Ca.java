package p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.p۲۳۳l;

import android.view.View;
import p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa;
import p۲۰۸b.p۲۲۲e.p۲۳۸b.Cb;
import p۲۰۸b.p۲۲۲e.p۲۳۸b.EnumCc;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Cc;
import p۲۰۸b.p۲۵۹h.p۲۶۰a.Ci;

/* renamed from: b.e.a.a.l.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends AbstractCa {
    @Override // p۲۰۸b.p۲۲۲e.p۲۲۳a.p۲۲۴a.AbstractCa
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۴۰۳۶b(View target) {
        float x = target.getPaddingLeft();
        float y = target.getPaddingTop();
        Cc cc = m۱۳۹۵۵a();
        EnumCc enumCc = EnumCc.SineEaseInOut;
        Ci ci = Ci.m۱۴۱۷۴a(target, "rotation", 0.0f, 80.0f, 60.0f, 80.0f, 60.0f, 60.0f);
        Cb.m۱۴۰۴۱a(enumCc, 1300.0f, ci);
        cc.m۱۴۱۳۷a(ci, Ci.m۱۴۱۷۴a(target, "translationY", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 700.0f), Ci.m۱۴۱۷۴a(target, "alpha", 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f), Ci.m۱۴۱۷۴a(target, "pivotX", x, x, x, x, x, x), Ci.m۱۴۱۷۴a(target, "pivotY", y, y, y, y, y, y));
        m۱۳۹۵۲a(1300L);
    }
}
