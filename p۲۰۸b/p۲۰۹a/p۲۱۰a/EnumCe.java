package p۲۰۸b.p۲۰۹a.p۲۱۰a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;

/* renamed from: b.a.a.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public enum EnumCe {
    START,
    CENTER,
    END;


    /* renamed from: f, reason: contains not printable characters */
    private static final boolean f۱۲۴۶۴f;

    static {
        f۱۲۴۶۴f = Build.VERSION.SDK_INT >= 17;
    }

    /* renamed from: b.a.a.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۴۶۶a = new int[EnumCe.values().length];

        static {
            try {
                f۱۲۴۶۶a[EnumCe.START.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۱۲۴۶۶a[EnumCe.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۱۲۴۶۶a[EnumCe.END.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a, reason: contains not printable characters */
    public int m۱۳۷۵۱a() {
        int i = a.f۱۲۴۶۶a[ordinal()];
        if (i == 1) {
            return f۱۲۴۶۴f ? 8388611 : 3;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return f۱۲۴۶۴f ? 8388613 : 5;
        }
        throw new IllegalStateException("Invalid gravity constant");
    }

    @TargetApi(17)
    /* renamed from: b, reason: contains not printable characters */
    public int m۱۳۷۵۲b() {
        int i = a.f۱۲۴۶۶a[ordinal()];
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 6;
        }
        return 5;
    }
}
