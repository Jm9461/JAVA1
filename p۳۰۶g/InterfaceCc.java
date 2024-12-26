package p۳۰۶g;

import android.media.AudioRecord;

/* renamed from: g.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCc {
    /* renamed from: a, reason: contains not printable characters */
    int mo۱۷۵۱۴a();

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۷۵۱۵a(boolean z);

    /* renamed from: b, reason: contains not printable characters */
    AudioRecord mo۱۷۵۱۶b();

    /* renamed from: c, reason: contains not printable characters */
    int mo۱۷۵۱۷c();

    /* renamed from: d, reason: contains not printable characters */
    boolean mo۱۷۵۱۸d();

    /* renamed from: e, reason: contains not printable characters */
    byte mo۱۷۵۱۹e();

    /* renamed from: f, reason: contains not printable characters */
    int mo۱۷۵۲۰f();

    /* renamed from: g.c$a */
    public static class a implements InterfaceCc {

        /* renamed from: a, reason: contains not printable characters */
        private final AudioRecord f۱۶۳۲۳a;

        /* renamed from: b, reason: contains not printable characters */
        private final int f۱۶۳۲۴b;

        /* renamed from: c, reason: contains not printable characters */
        private final int f۱۶۳۲۵c;

        /* renamed from: d, reason: contains not printable characters */
        private final int f۱۶۳۲۶d;

        /* renamed from: e, reason: contains not printable characters */
        private volatile boolean f۱۶۳۲۷e;

        public a(int audioSource, int audioEncoding, int channelPositionMask, int frequency) {
            this.f۱۶۳۲۵c = audioEncoding;
            this.f۱۶۳۲۴b = channelPositionMask;
            this.f۱۶۳۲۶d = frequency;
            this.f۱۶۳۲۳a = new AudioRecord(audioSource, frequency, channelPositionMask, audioEncoding, mo۱۷۵۱۴a());
        }

        @Override // p۳۰۶g.InterfaceCc
        /* renamed from: b, reason: contains not printable characters */
        public AudioRecord mo۱۷۵۱۶b() {
            return this.f۱۶۳۲۳a;
        }

        @Override // p۳۰۶g.InterfaceCc
        /* renamed from: c, reason: contains not printable characters */
        public int mo۱۷۵۱۷c() {
            return this.f۱۶۳۲۴b;
        }

        @Override // p۳۰۶g.InterfaceCc
        /* renamed from: f, reason: contains not printable characters */
        public int mo۱۷۵۲۰f() {
            return this.f۱۶۳۲۶d;
        }

        @Override // p۳۰۶g.InterfaceCc
        /* renamed from: a, reason: contains not printable characters */
        public int mo۱۷۵۱۴a() {
            return AudioRecord.getMinBufferSize(this.f۱۶۳۲۶d, this.f۱۶۳۲۴b, this.f۱۶۳۲۵c);
        }

        @Override // p۳۰۶g.InterfaceCc
        /* renamed from: e, reason: contains not printable characters */
        public byte mo۱۷۵۱۹e() {
            int i = this.f۱۶۳۲۵c;
            return (i != 2 && i == 3) ? (byte) 8 : (byte) 16;
        }

        @Override // p۳۰۶g.InterfaceCc
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۵۱۵a(boolean enabledToBePulled) {
            this.f۱۶۳۲۷e = enabledToBePulled;
        }

        @Override // p۳۰۶g.InterfaceCc
        /* renamed from: d, reason: contains not printable characters */
        public boolean mo۱۷۵۱۸d() {
            return this.f۱۶۳۲۷e;
        }
    }
}
