package f;

import java.io.Closeable;
import java.io.Flushable;

public interface r extends Closeable, Flushable {
    void a(c cVar, long j);

    t b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();
}
