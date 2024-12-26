package cafe.adriel.androidaudiorecorder.p۲۸۴j;

/* renamed from: cafe.adriel.androidaudiorecorder.j.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public enum EnumCa {
    STEREO,
    MONO;

    /* renamed from: cafe.adriel.androidaudiorecorder.j.a$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۳۲۱۸a = new int[EnumCa.values().length];

        static {
            try {
                f۱۳۲۱۸a[EnumCa.MONO.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۴۵۹۱a() {
        if (a.f۱۳۲۱۸a[ordinal()] == 1) {
            return 16;
        }
        return 12;
    }
}
