package p۱۳۹e.p۱۴۰f0.p۱۴۱e;

import java.io.IOException;
import p۱۴۹f.AbstractCg;
import p۱۴۹f.AbstractCr;
import p۱۴۹f.Cc;

/* access modifiers changed from: package-private */
/* renamed from: e.f0.e.e  reason: invalid class name */
public class Ce extends AbstractCg {

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۵۷۷۱d;

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۶۸۸a(IOException iOException) {
        throw null;
    }

    Ce(AbstractCr delegate) {
        super(delegate);
    }

    @Override // p۱۴۹f.AbstractCr, p۱۴۹f.AbstractCg
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۶۸۷a(Cc source, long byteCount) {
        if (this.f۱۵۷۷۱d) {
            source.skip(byteCount);
            return;
        }
        try {
            super.m۱۹۴۵۵a(source, byteCount);
        } catch (IOException e) {
            this.f۱۵۷۷۱d = true;
            m۱۸۶۸۸a(e);
        }
    }

    @Override // p۱۴۹f.AbstractCr, p۱۴۹f.AbstractCg, java.io.Flushable
    public void flush() {
        if (!this.f۱۵۷۷۱d) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f۱۵۷۷۱d = true;
                m۱۸۶۸۸a(e);
            }
        }
    }

    @Override // java.io.Closeable, p۱۴۹f.AbstractCr, java.lang.AutoCloseable, p۱۴۹f.AbstractCg
    public void close() {
        if (!this.f۱۵۷۷۱d) {
            try {
                super.close();
            } catch (IOException e) {
                this.f۱۵۷۷۱d = true;
                m۱۸۶۸۸a(e);
            }
        }
    }
}
