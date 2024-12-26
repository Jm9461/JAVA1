package cafe.adriel.androidaudiorecorder.p۱۲۸j;

/* renamed from: cafe.adriel.androidaudiorecorder.j.a  reason: invalid class name */
public enum EnumCa {
    STEREO,
    MONO;

    /* access modifiers changed from: package-private */
    /* renamed from: cafe.adriel.androidaudiorecorder.j.a$a  reason: invalid class name */
    public static /* synthetic */ class Ca {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۱۳۲۱۸a = new int[EnumCa.values().length];

        static {
            try {
                f۱۳۲۱۸a[EnumCa.MONO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۶۶۶۷a() {
        if (Ca.f۱۳۲۱۸a[ordinal()] != 1) {
            return 12;
        }
        return 16;
    }
}
