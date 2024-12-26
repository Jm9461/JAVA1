package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۷d;

import android.os.Build;
import android.os.Trace;

/* renamed from: a.b.g.d.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {
    /* renamed from: a, reason: contains not printable characters */
    public static void m۸۴۲۸a(String sectionName) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(sectionName);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۸۴۲۷a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
