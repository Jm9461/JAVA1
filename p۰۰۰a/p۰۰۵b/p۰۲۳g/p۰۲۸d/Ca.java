package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۸d;

import android.os.Build;
import android.os.Trace;

/* renamed from: a.b.g.d.a  reason: invalid class name */
public final class Ca {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۰۴۹۷a(String sectionName) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(sectionName);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۰۴۹۶a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
