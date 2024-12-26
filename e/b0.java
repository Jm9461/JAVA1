package e;

import e.f0.c;
import f.e;
import java.io.Closeable;

public abstract class b0 implements Closeable {
    public abstract long l();

    public abstract e m();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c.a(m());
    }

    public static b0 a(u contentType, byte[] content) {
        return a(contentType, (long) content.length, new f.c().write(content));
    }

    /* access modifiers changed from: package-private */
    public class a extends b0 {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f۳۶۸۷c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f۳۶۸۸d;

        a(u uVar, long j, e eVar) {
            this.f۳۶۸۷c = j;
            this.f۳۶۸۸d = eVar;
        }

        @Override // e.b0
        public long l() {
            return this.f۳۶۸۷c;
        }

        @Override // e.b0
        public e m() {
            return this.f۳۶۸۸d;
        }
    }

    public static b0 a(u contentType, long contentLength, e content) {
        if (content != null) {
            return new a(contentType, contentLength, content);
        }
        throw new NullPointerException("source == null");
    }
}
