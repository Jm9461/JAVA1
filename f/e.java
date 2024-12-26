package f;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

public interface e extends s, ReadableByteChannel {
    long a(byte b2);

    c a();

    boolean a(long j, f fVar);

    f b(long j);

    String c(long j);

    short c();

    void d(long j);

    long e();

    String f();

    byte[] f(long j);

    byte[] g();

    int h();

    boolean i();

    long j();

    InputStream k();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    short readShort();

    void skip(long j);
}
