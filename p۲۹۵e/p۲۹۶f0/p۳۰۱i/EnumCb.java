package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

/* renamed from: e.f0.i.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public enum EnumCb {
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


    /* renamed from: c, reason: contains not printable characters */
    public final int f۱۵۸۸۱c;

    EnumCb(int httpCode) {
        this.f۱۵۸۸۱c = httpCode;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static EnumCb m۱۶۷۵۶a(int code) {
        for (EnumCb errorCode : values()) {
            if (errorCode.f۱۵۸۸۱c == code) {
                return errorCode;
            }
        }
        return null;
    }
}
