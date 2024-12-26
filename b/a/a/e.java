package b.a.a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;

public enum e {
    START,
    CENTER,
    END;
    

    /* renamed from: f  reason: collision with root package name */
    private static final boolean f۲۳۴۴f;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z = true;
        }
        f۲۳۴۴f = z;
    }

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۲۳۴۶a = new int[e.values().length];

        static {
            try {
                f۲۳۴۶a[e.START.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۲۳۴۶a[e.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۲۳۴۶a[e.END.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    @SuppressLint({"RtlHardcoded"})
    public int a() {
        int i = a.f۲۳۴۶a[ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return f۲۳۴۴f ? 8388613 : 5;
            }
            throw new IllegalStateException("Invalid gravity constant");
        } else if (f۲۳۴۴f) {
            return 8388611;
        } else {
            return 3;
        }
    }

    @TargetApi(17)
    public int b() {
        int i = a.f۲۳۴۶a[ordinal()];
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return 5;
        }
        return 6;
    }
}
