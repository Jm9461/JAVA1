package cafe.adriel.androidaudiorecorder.p۱۲۸j;

/* renamed from: cafe.adriel.androidaudiorecorder.j.c  reason: invalid class name */
public enum EnumCc {
    MIC,
    CAMCORDER;

    /* access modifiers changed from: package-private */
    /* renamed from: cafe.adriel.androidaudiorecorder.j.c$a  reason: invalid class name */
    public static /* synthetic */ class Ca {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۳۲۳۰a = new int[EnumCc.values().length];

        static {
            try {
                f۱۳۲۳۰a[EnumCc.CAMCORDER.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۶۶۶۹a() {
        if (Ca.f۱۳۲۳۰a[ordinal()] != 1) {
            return 1;
        }
        return 5;
    }
}
