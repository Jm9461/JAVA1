package cafe.adriel.androidaudiorecorder.j;

public enum c {
    MIC,
    CAMCORDER;

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۲۷۰۴a = new int[c.values().length];

        static {
            try {
                f۲۷۰۴a[c.CAMCORDER.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    public int a() {
        if (a.f۲۷۰۴a[ordinal()] != 1) {
            return 1;
        }
        return 5;
    }
}
