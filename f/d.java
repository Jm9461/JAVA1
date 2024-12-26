package f;

import java.nio.channels.WritableByteChannel;

public interface d extends r, WritableByteChannel {
    c a();

    d a(long j);

    d a(String str);

    d d();

    d e(long j);

    @Override // f.r, java.io.Flushable
    void flush();

    d write(byte[] bArr);

    d write(byte[] bArr, int i, int i2);

    d writeByte(int i);

    d writeInt(int i);

    d writeShort(int i);
}
