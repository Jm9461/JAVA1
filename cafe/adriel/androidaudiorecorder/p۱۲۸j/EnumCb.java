package cafe.adriel.androidaudiorecorder.p۱۲۸j;

/* renamed from: cafe.adriel.androidaudiorecorder.j.b  reason: invalid class name */
public enum EnumCb {
    HZ_48000,
    HZ_44100,
    HZ_32000,
    HZ_22050,
    HZ_16000,
    HZ_11025,
    HZ_8000;

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۶۶۶۸a() {
        return Integer.parseInt(name().replace("HZ_", ""));
    }
}
