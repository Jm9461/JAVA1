package p۱۵۰g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: g.b  reason: invalid class name */
public interface AbstractCb {
    /* renamed from: a  reason: contains not printable characters */
    double m۱۹۵۷۹a();

    /* renamed from: b  reason: contains not printable characters */
    byte[] m۱۹۵۸۰b();

    /* renamed from: g.b$a  reason: invalid class name */
    public static final class Ca implements AbstractCb {

        /* renamed from: a  reason: contains not printable characters */
        final byte[] f۱۶۳۲۲a;

        Ca(byte[] bytes) {
            this.f۱۶۳۲۲a = bytes;
        }

        @Override // p۱۵۰g.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public double m۱۹۵۸۱a() {
            short[] shorts = m۱۹۵۸۳c();
            short s = 0;
            int arrLen = shorts.length;
            for (int peakIndex = 0; peakIndex < arrLen; peakIndex++) {
                if (shorts[peakIndex] >= s) {
                    s = shorts[peakIndex];
                }
            }
            double d = (double) s;
            Double.isNaN(d);
            return (double) ((int) (Math.log10(d / 0.6d) * 20.0d));
        }

        @Override // p۱۵۰g.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public byte[] m۱۹۵۸۲b() {
            return this.f۱۶۳۲۲a;
        }

        /* renamed from: c  reason: contains not printable characters */
        public short[] m۱۹۵۸۳c() {
            byte[] bArr = this.f۱۶۳۲۲a;
            short[] shorts = new short[(bArr.length / 2)];
            ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(shorts);
            return shorts;
        }
    }
}
