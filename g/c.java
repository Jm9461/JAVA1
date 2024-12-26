package g;

import android.media.AudioRecord;

public interface c {
    int a();

    void a(boolean z);

    AudioRecord b();

    int c();

    boolean d();

    byte e();

    int f();

    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final AudioRecord f۴۲۲۸a;

        /* renamed from: b  reason: collision with root package name */
        private final int f۴۲۲۹b;

        /* renamed from: c  reason: collision with root package name */
        private final int f۴۲۳۰c;

        /* renamed from: d  reason: collision with root package name */
        private final int f۴۲۳۱d;

        /* renamed from: e  reason: collision with root package name */
        private volatile boolean f۴۲۳۲e;

        public a(int audioSource, int audioEncoding, int channelPositionMask, int frequency) {
            this.f۴۲۳۰c = audioEncoding;
            this.f۴۲۲۹b = channelPositionMask;
            this.f۴۲۳۱d = frequency;
            this.f۴۲۲۸a = new AudioRecord(audioSource, frequency, channelPositionMask, audioEncoding, a());
        }

        @Override // g.c
        public AudioRecord b() {
            return this.f۴۲۲۸a;
        }

        @Override // g.c
        public int c() {
            return this.f۴۲۲۹b;
        }

        @Override // g.c
        public int f() {
            return this.f۴۲۳۱d;
        }

        @Override // g.c
        public int a() {
            return AudioRecord.getMinBufferSize(this.f۴۲۳۱d, this.f۴۲۲۹b, this.f۴۲۳۰c);
        }

        @Override // g.c
        public byte e() {
            int i = this.f۴۲۳۰c;
            if (i != 2 && i == 3) {
                return 8;
            }
            return 16;
        }

        @Override // g.c
        public void a(boolean enabledToBePulled) {
            this.f۴۲۳۲e = enabledToBePulled;
        }

        @Override // g.c
        public boolean d() {
            return this.f۴۲۳۲e;
        }
    }
}
