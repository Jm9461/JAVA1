package p۲۹۵e;

import java.io.Closeable;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۳۰۵f.InterfaceCe;

/* renamed from: e.b0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCb0 implements Closeable {
    /* renamed from: l, reason: contains not printable characters */
    public abstract long mo۱۶۷۱۵l();

    /* renamed from: m, reason: contains not printable characters */
    public abstract InterfaceCe mo۱۶۷۱۶m();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Cc.m۱۶۵۴۲a(mo۱۶۷۱۶m());
    }

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCb0 m۱۶۴۵۹a(Cu contentType, byte[] content) {
        p۳۰۵f.Cc buffer = new p۳۰۵f.Cc().write(content);
        return m۱۶۴۵۸a(contentType, content.length, buffer);
    }

    /* renamed from: e.b0$a */
    final class a extends AbstractCb0 {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ long f۱۵۶۳۶c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ InterfaceCe f۱۵۶۳۷d;

        a(Cu cu, long j, InterfaceCe interfaceCe) {
            this.f۱۵۶۳۶c = j;
            this.f۱۵۶۳۷d = interfaceCe;
        }

        @Override // p۲۹۵e.AbstractCb0
        /* renamed from: l, reason: contains not printable characters */
        public long mo۱۶۷۱۵l() {
            return this.f۱۵۶۳۶c;
        }

        @Override // p۲۹۵e.AbstractCb0
        /* renamed from: m, reason: contains not printable characters */
        public InterfaceCe mo۱۶۷۱۶m() {
            return this.f۱۵۶۳۷d;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCb0 m۱۶۴۵۸a(Cu contentType, long contentLength, InterfaceCe content) {
        if (content == null) {
            throw new NullPointerException("source == null");
        }
        return new a(contentType, contentLength, content);
    }
}
