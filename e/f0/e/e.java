package e.f0.e;

import f.c;
import f.g;
import f.r;
import java.io.IOException;

/* access modifiers changed from: package-private */
public class e extends g {

    /* renamed from: d  reason: collision with root package name */
    private boolean f۳۷۹۱d;

    /* access modifiers changed from: protected */
    public void a(IOException iOException) {
        throw null;
    }

    e(r delegate) {
        super(delegate);
    }

    @Override // f.r, f.g
    public void a(c source, long byteCount) {
        if (this.f۳۷۹۱d) {
            source.skip(byteCount);
            return;
        }
        try {
            super.a(source, byteCount);
        } catch (IOException e2) {
            this.f۳۷۹۱d = true;
            a(e2);
        }
    }

    @Override // f.r, f.g, java.io.Flushable
    public void flush() {
        if (!this.f۳۷۹۱d) {
            try {
                super.flush();
            } catch (IOException e2) {
                this.f۳۷۹۱d = true;
                a(e2);
            }
        }
    }

    @Override // java.io.Closeable, f.r, java.lang.AutoCloseable, f.g
    public void close() {
        if (!this.f۳۷۹۱d) {
            try {
                super.close();
            } catch (IOException e2) {
                this.f۳۷۹۱d = true;
                a(e2);
            }
        }
    }
}
