package cafe.adriel.androidaudiorecorder.j;

public enum b {
    HZ_48000,
    HZ_44100,
    HZ_32000,
    HZ_22050,
    HZ_16000,
    HZ_11025,
    HZ_8000;

    public int a() {
        return Integer.parseInt(name().replace("HZ_", ""));
    }
}
