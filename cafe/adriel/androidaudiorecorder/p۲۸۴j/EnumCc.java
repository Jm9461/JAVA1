package cafe.adriel.androidaudiorecorder.p۲۸۴j;

/* renamed from: cafe.adriel.androidaudiorecorder.j.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public enum EnumCc {
    MIC,
    CAMCORDER;

    /* renamed from: cafe.adriel.androidaudiorecorder.j.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۳۲۳۰a = new int[EnumCc.values().length];

        static {
            try {
                f۱۳۲۳۰a[EnumCc.CAMCORDER.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۴۵۹۳a() {
        return a.f۱۳۲۳۰a[ordinal()] != 1 ? 1 : 5;
    }
}
