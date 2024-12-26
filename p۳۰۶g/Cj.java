package p۳۰۶g;

/* renamed from: g.j, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cj {

    /* renamed from: a, reason: contains not printable characters */
    private final InterfaceCc f۱۶۳۳۶a;

    /* renamed from: b, reason: contains not printable characters */
    private final long f۱۶۳۳۷b;

    Cj(InterfaceCc audioRecordSource, long totalAudioLength) {
        this.f۱۶۳۳۶a = audioRecordSource;
        this.f۱۶۳۳۷b = totalAudioLength;
    }

    /* renamed from: a, reason: contains not printable characters */
    public byte[] m۱۷۵۳۹a() {
        long sampleRateInHz = this.f۱۶۳۳۶a.mo۱۷۵۲۰f();
        int channels = this.f۱۶۳۳۶a.mo۱۷۵۱۷c() == 16 ? 1 : 2;
        byte bitsPerSample = this.f۱۶۳۳۶a.mo۱۷۵۱۹e();
        long j = this.f۱۶۳۳۷b;
        return m۱۷۵۳۸a(j, 36 + j, sampleRateInHz, channels, ((bitsPerSample * sampleRateInHz) * channels) / 8, bitsPerSample);
    }

    /* renamed from: a, reason: contains not printable characters */
    private byte[] m۱۷۵۳۸a(long totalAudioLen, long totalDataLen, long longSampleRate, int channels, long byteRate, byte bitsPerSample) {
        byte[] header = {82, 73, 70, 70, (byte) (totalDataLen & 255), (byte) ((totalDataLen >> 8) & 255), (byte) ((totalDataLen >> 16) & 255), (byte) ((totalDataLen >> 24) & 255), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) channels, 0, (byte) (longSampleRate & 255), (byte) ((longSampleRate >> 8) & 255), (byte) ((longSampleRate >> 16) & 255), (byte) ((longSampleRate >> 24) & 255), (byte) (byteRate & 255), (byte) ((byteRate >> 8) & 255), (byte) ((byteRate >> 16) & 255), (byte) ((byteRate >> 24) & 255), (byte) ((bitsPerSample / 8) * channels), 0, bitsPerSample, 0, 100, 97, 116, 97, (byte) (totalAudioLen & 255), (byte) ((totalAudioLen >> 8) & 255), (byte) ((totalAudioLen >> 16) & 255), (byte) ((totalAudioLen >> 24) & 255)};
        return header;
    }
}
