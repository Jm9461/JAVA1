package g;

/* access modifiers changed from: package-private */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final c f۴۲۴۱a;

    /* renamed from: b  reason: collision with root package name */
    private final long f۴۲۴۲b;

    j(c audioRecordSource, long totalAudioLength) {
        this.f۴۲۴۱a = audioRecordSource;
        this.f۴۲۴۲b = totalAudioLength;
    }

    public byte[] a() {
        long sampleRateInHz = (long) this.f۴۲۴۱a.f();
        int channels = this.f۴۲۴۱a.c() == 16 ? 1 : 2;
        byte bitsPerSample = this.f۴۲۴۱a.e();
        long j = this.f۴۲۴۲b;
        return a(j, 36 + j, sampleRateInHz, channels, ((((long) bitsPerSample) * sampleRateInHz) * ((long) channels)) / 8, bitsPerSample);
    }

    private byte[] a(long totalAudioLen, long totalDataLen, long longSampleRate, int channels, long byteRate, byte bitsPerSample) {
        return new byte[]{82, 73, 70, 70, (byte) ((int) (totalDataLen & 255)), (byte) ((int) ((totalDataLen >> 8) & 255)), (byte) ((int) ((totalDataLen >> 16) & 255)), (byte) ((int) ((totalDataLen >> 24) & 255)), 87, 65, 86, 69, 102, 109, 116, 32, 16, 0, 0, 0, 1, 0, (byte) channels, 0, (byte) ((int) (longSampleRate & 255)), (byte) ((int) ((longSampleRate >> 8) & 255)), (byte) ((int) ((longSampleRate >> 16) & 255)), (byte) ((int) ((longSampleRate >> 24) & 255)), (byte) ((int) (byteRate & 255)), (byte) ((int) ((byteRate >> 8) & 255)), (byte) ((int) ((byteRate >> 16) & 255)), (byte) ((int) ((byteRate >> 24) & 255)), (byte) ((bitsPerSample / 8) * channels), 0, bitsPerSample, 0, 100, 97, 116, 97, (byte) ((int) (totalAudioLen & 255)), (byte) ((int) ((totalAudioLen >> 8) & 255)), (byte) ((int) ((totalAudioLen >> 16) & 255)), (byte) ((int) ((totalAudioLen >> 24) & 255))};
    }
}
