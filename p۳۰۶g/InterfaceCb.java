package p۳۰۶g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public interface InterfaceCb {
    /* renamed from: a, reason: contains not printable characters */
    double mo۱۷۵۰۴a();

    /* renamed from: b, reason: contains not printable characters */
    byte[] mo۱۷۵۰۵b();

    /* renamed from: g.b$a */
    public static final class a implements InterfaceCb {

        /* renamed from: a, reason: contains not printable characters */
        final byte[] f۱۶۳۲۲a;

        a(byte[] bytes) {
            this.f۱۶۳۲۲a = bytes;
        }

        @Override // p۳۰۶g.InterfaceCb
        /* renamed from: a, reason: contains not printable characters */
        public double mo۱۷۵۰۴a() {
            short[] shorts = m۱۷۵۰۶c();
            short s = 0;
            int arrLen = shorts.length;
            for (int peakIndex = 0; peakIndex < arrLen; peakIndex++) {
                if (shorts[peakIndex] >= s) {
                    s = shorts[peakIndex];
                }
            }
            Double.isNaN(s);
            return (int) (Math.log10(r6 / 0.6d) * 20.0d);
        }

        @Override // p۳۰۶g.InterfaceCb
        /* renamed from: b, reason: contains not printable characters */
        public byte[] mo۱۷۵۰۵b() {
            return this.f۱۶۳۲۲a;
        }

        /* renamed from: c, reason: contains not printable characters */
        public short[] m۱۷۵۰۶c() {
            byte[] bArr = this.f۱۶۳۲۲a;
            short[] shorts = new short[bArr.length / 2];
            ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(shorts);
            return shorts;
        }
    }
}
