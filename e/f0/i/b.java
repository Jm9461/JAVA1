package e.f0.i;

public enum b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: c  reason: collision with root package name */
    public final int f۳۸۷۵c;

    private b(int httpCode) {
        this.f۳۸۷۵c = httpCode;
    }

    public static b a(int code) {
        b[] values = values();
        for (b errorCode : values) {
            if (errorCode.f۳۸۷۵c == code) {
                return errorCode;
            }
        }
        return null;
    }
}
