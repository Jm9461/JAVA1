package p۰۵۲b.p۰۵۳a.p۰۵۴a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;

/* renamed from: b.a.a.e  reason: invalid class name */
public enum EnumCe {
    START,
    CENTER,
    END;
    

    /* renamed from: f  reason: contains not printable characters */
    private static final boolean f۱۲۴۶۴f;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z = true;
        }
        f۱۲۴۶۴f = z;
    }

    /* renamed from: b.a.a.e$a  reason: invalid class name */
    static /* synthetic */ class Ca {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۲۴۶۶a = new int[EnumCe.values().length];

        static {
            try {
                f۱۲۴۶۶a[EnumCe.START.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f۱۲۴۶۶a[EnumCe.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۱۲۴۶۶a[EnumCe.END.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۵۸۲۱a() {
        int i = Ca.f۱۲۴۶۶a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return f۱۲۴۶۴f ? 8388613 : 5;
            }
            throw new IllegalStateException("Invalid gravity constant");
        } else if (f۱۲۴۶۴f) {
            return 8388611;
        } else {
            return 3;
        }
    }

    @TargetApi(17)
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۵۸۲۲b() {
        int i = Ca.f۱۲۴۶۶a[ordinal()];
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return 5;
        }
        return 6;
    }
}
