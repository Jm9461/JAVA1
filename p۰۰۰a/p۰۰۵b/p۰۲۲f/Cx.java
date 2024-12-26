package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: a.b.f.x  reason: invalid class name */
class Cx {
    /* renamed from: a  reason: contains not printable characters */
    static AbstractCw m۱۰۴۱۱a(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new Cv(group);
        }
        return Cu.m۱۰۴۰۲a(group);
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۰۴۱۲a(ViewGroup group, boolean suppress) {
        if (Build.VERSION.SDK_INT >= 18) {
            Cz.m۱۰۴۱۶a(group, suppress);
        } else {
            Cy.m۱۰۴۱۴a(group, suppress);
        }
    }
}
