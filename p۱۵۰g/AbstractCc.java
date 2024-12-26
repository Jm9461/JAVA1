package p۱۵۰g;

import android.media.AudioRecord;

/* renamed from: g.c  reason: invalid class name */
public interface AbstractCc {
    /* renamed from: a  reason: contains not printable characters */
    int m۱۹۵۸۴a();

    /* renamed from: a  reason: contains not printable characters */
    void m۱۹۵۸۵a(boolean z);

    /* renamed from: b  reason: contains not printable characters */
    AudioRecord m۱۹۵۸۶b();

    /* renamed from: c  reason: contains not printable characters */
    int m۱۹۵۸۷c();

    /* renamed from: d  reason: contains not printable characters */
    boolean m۱۹۵۸۸d();

    /* renamed from: e  reason: contains not printable characters */
    byte m۱۹۵۸۹e();

    /* renamed from: f  reason: contains not printable characters */
    int m۱۹۵۹۰f();

    /* renamed from: g.c$a  reason: invalid class name */
    public static class Ca implements AbstractCc {

        /* renamed from: a  reason: contains not printable characters */
        private final AudioRecord f۱۶۳۲۳a;

        /* renamed from: b  reason: contains not printable characters */
        private final int f۱۶۳۲۴b;

        /* renamed from: c  reason: contains not printable characters */
        private final int f۱۶۳۲۵c;

        /* renamed from: d  reason: contains not printable characters */
        private final int f۱۶۳۲۶d;

        /* renamed from: e  reason: contains not printable characters */
        private volatile boolean f۱۶۳۲۷e;

        public Ca(int audioSource, int audioEncoding, int channelPositionMask, int frequency) {
            this.f۱۶۳۲۵c = audioEncoding;
            this.f۱۶۳۲۴b = channelPositionMask;
            this.f۱۶۳۲۶d = frequency;
            this.f۱۶۳۲۳a = new AudioRecord(audioSource, frequency, channelPositionMask, audioEncoding, m۱۹۵۹۱a());
        }

        @Override // p۱۵۰g.AbstractCc
        /* renamed from: b  reason: contains not printable characters */
        public AudioRecord m۱۹۵۹۳b() {
            return this.f۱۶۳۲۳a;
        }

        @Override // p۱۵۰g.AbstractCc
        /* renamed from: c  reason: contains not printable characters */
        public int m۱۹۵۹۴c() {
            return this.f۱۶۳۲۴b;
        }

        @Override // p۱۵۰g.AbstractCc
        /* renamed from: f  reason: contains not printable characters */
        public int m۱۹۵۹۷f() {
            return this.f۱۶۳۲۶d;
        }

        @Override // p۱۵۰g.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۹۵۹۱a() {
            return AudioRecord.getMinBufferSize(this.f۱۶۳۲۶d, this.f۱۶۳۲۴b, this.f۱۶۳۲۵c);
        }

        @Override // p۱۵۰g.AbstractCc
        /* renamed from: e  reason: contains not printable characters */
        public byte m۱۹۵۹۶e() {
            int i = this.f۱۶۳۲۵c;
            if (i != 2 && i == 3) {
                return 8;
            }
            return 16;
        }

        @Override // p۱۵۰g.AbstractCc
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۵۹۲a(boolean enabledToBePulled) {
            this.f۱۶۳۲۷e = enabledToBePulled;
        }

        @Override // p۱۵۰g.AbstractCc
        /* renamed from: d  reason: contains not printable characters */
        public boolean m۱۹۵۹۵d() {
            return this.f۱۶۳۲۷e;
        }
    }
}
