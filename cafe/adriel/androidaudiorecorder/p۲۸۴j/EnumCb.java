package cafe.adriel.androidaudiorecorder.p۲۸۴j;

/* renamed from: cafe.adriel.androidaudiorecorder.j.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public enum EnumCb {
    HZ_48000,
    HZ_44100,
    HZ_32000,
    HZ_22050,
    HZ_16000,
    HZ_11025,
    HZ_8000;

    /* renamed from: a, reason: contains not printable characters */
    public int m۱۴۵۹۲a() {
        return Integer.parseInt(name().replace("HZ_", ""));
    }
}
