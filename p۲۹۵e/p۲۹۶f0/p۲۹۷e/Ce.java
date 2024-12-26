package p۲۹۵e.p۲۹۶f0.p۲۹۷e;

import java.io.IOException;
import p۳۰۵f.AbstractCg;
import p۳۰۵f.Cc;
import p۳۰۵f.InterfaceCr;

/* renamed from: e.f0.e.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce extends AbstractCg {

    /* renamed from: d, reason: contains not printable characters */
    private boolean f۱۵۷۷۱d;

    /* renamed from: a, reason: contains not printable characters */
    protected void mo۱۶۶۰۹a(IOException iOException) {
        throw null;
    }

    Ce(InterfaceCr delegate) {
        super(delegate);
    }

    @Override // p۳۰۵f.AbstractCg, p۳۰۵f.InterfaceCr
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۷۴۷۵a(Cc source, long byteCount) {
        if (this.f۱۵۷۷۱d) {
            source.skip(byteCount);
            return;
        }
        try {
            super.mo۱۷۴۷۵a(source, byteCount);
        } catch (IOException e2) {
            this.f۱۵۷۷۱d = true;
            mo۱۶۶۰۹a(e2);
        }
    }

    @Override // p۳۰۵f.AbstractCg, p۳۰۵f.InterfaceCr, java.io.Flushable
    public void flush() {
        if (this.f۱۵۷۷۱d) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e2) {
            this.f۱۵۷۷۱d = true;
            mo۱۶۶۰۹a(e2);
        }
    }

    @Override // p۳۰۵f.AbstractCg, p۳۰۵f.InterfaceCr, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f۱۵۷۷۱d) {
            return;
        }
        try {
            super.close();
        } catch (IOException e2) {
            this.f۱۵۷۷۱d = true;
            mo۱۶۶۰۹a(e2);
        }
    }
}
