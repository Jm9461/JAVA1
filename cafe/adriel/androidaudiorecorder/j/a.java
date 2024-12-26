package cafe.adriel.androidaudiorecorder.j;

public enum a {
    STEREO,
    MONO;

    /* access modifiers changed from: package-private */
    /* renamed from: cafe.adriel.androidaudiorecorder.j.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C۰۰۶۱a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۲۶۹۴a = new int[a.values().length];

        static {
            try {
                f۲۶۹۴a[a.MONO.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public int a() {
        if (C۰۰۶۱a.f۲۶۹۴a[ordinal()] != 1) {
            return 12;
        }
        return 16;
    }
}
