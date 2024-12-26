package p۱۵۰g;

/* access modifiers changed from: package-private */
/* renamed from: g.j  reason: invalid class name */
public final class Cj {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCc f۱۶۳۳۶a;

    /* renamed from: b  reason: contains not printable characters */
    private final long f۱۶۳۳۷b;

    Cj(AbstractCc audioRecordSource, long totalAudioLength) {
        this.f۱۶۳۳۶a = audioRecordSource;
        this.f۱۶۳۳۷b = totalAudioLength;
    }

    /* renamed from: a  reason: contains not printable characters */
    public byte[] m۱۹۶۱۶a() {
        long sampleRateInHz = (long) this.f۱۶۳۳۶a.m۱۹۵۹۰f();
        int channels = this.f۱۶۳۳۶a.m۱۹۵۸۷c() == 16 ? 1 : 2;
        byte bitsPerSample = this.f۱۶۳۳۶a.m۱۹۵۸۹e();
        long j = this.f۱۶۳۳۷b;
        return m۱۹۶۱۵a(j, 36 + j, sampleRateInHz, channels, ((((long) bitsPerSample) * sampleRateInHz) * ((long) channels)) / 8, bitsPerSample);
    }

    /* renamed from: a  reason: contains not printable characters */
    private byte[] m۱۹۶۱۵a(long totalAudioLen, long totalDataLen, long longSampleRate, int channels, long byteRate, byte bitsPerSample) {
        return new byte[]{82, 73, 70, 70, (byte) ((int) (totalDataLen & 255)), (byte) ((int) ((totalDataLen >> 8) & 255)), (byte) ((int) ((totalDataLen >> 16) & 255)), (byte) ((int) ((totalDataLen >> 24) & 255)), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) channels, 0, (byte) ((int) (longSampleRate & 255)), (byte) ((int) ((longSampleRate >> 8) & 255)), (byte) ((int) ((longSampleRate >> 16) & 255)), (byte) ((int) ((longSampleRate >> 24) & 255)), (byte) ((int) (byteRate & 255)), (byte) ((int) ((byteRate >> 8) & 255)), (byte) ((int) ((byteRate >> 16) & 255)), (byte) ((int) ((byteRate >> 24) & 255)), (byte) ((bitsPerSample / 8) * channels), 0, bitsPerSample, 0, 100, 97, 116, 97, (byte) ((int) (totalAudioLen & 255)), (byte) ((int) ((totalAudioLen >> 8) & 255)), (byte) ((int) ((totalAudioLen >> 16) & 255)), (byte) ((int) ((totalAudioLen >> 24) & 255))};
    }
}
