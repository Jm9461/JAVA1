package g;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface b {
    double a();

    byte[] b();

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final byte[] f۴۲۲۷a;

        a(byte[] bytes) {
            this.f۴۲۲۷a = bytes;
        }

        @Override // g.b
        public double a() {
            short[] shorts = c();
            short s = 0;
            int arrLen = shorts.length;
            for (int peakIndex = 0; peakIndex < arrLen; peakIndex++) {
                if (shorts[peakIndex] >= s) {
                    s = shorts[peakIndex];
                }
            }
            double d2 = (double) s;
            Double.isNaN(d2);
            return (double) ((int) (Math.log10(d2 / 0.6d) * 20.0d));
        }

        @Override // g.b
        public byte[] b() {
            return this.f۴۲۲۷a;
        }

        public short[] c() {
            byte[] bArr = this.f۴۲۲۷a;
            short[] shorts = new short[(bArr.length / 2)];
            ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asShortBuffer().get(shorts);
            return shorts;
        }
    }
}
