package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: a.b.f.x, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cx {
    /* renamed from: a, reason: contains not printable characters */
    static InterfaceCw m۸۳۴۶a(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new Cv(group);
        }
        return Cu.m۸۳۳۷a(group);
    }

    /* renamed from: a, reason: contains not printable characters */
    static void m۸۳۴۷a(ViewGroup group, boolean suppress) {
        if (Build.VERSION.SDK_INT >= 18) {
            Cz.m۸۳۵۱a(group, suppress);
        } else {
            Cy.m۸۳۴۹a(group, suppress);
        }
    }
}
