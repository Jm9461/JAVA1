package p۱۳۹e;

import java.io.Closeable;
import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۴۹f.AbstractCe;

/* renamed from: e.b0  reason: invalid class name */
public abstract class AbstractCb0 implements Closeable {
    /* renamed from: l  reason: contains not printable characters */
    public abstract long m۱۸۵۳۹l();

    /* renamed from: m  reason: contains not printable characters */
    public abstract AbstractCe m۱۸۵۴۰m();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Cc.m۱۸۶۲۱a(m۱۸۵۴۰m());
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCb0 m۱۸۵۳۸a(Cu contentType, byte[] content) {
        return m۱۸۵۳۷a(contentType, (long) content.length, new p۱۴۹f.Cc().write(content));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.b0$a  reason: invalid class name */
    public class Ca extends AbstractCb0 {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ long f۱۵۶۳۶c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ AbstractCe f۱۵۶۳۷d;

        Ca(Cu uVar, long j, AbstractCe eVar) {
            this.f۱۵۶۳۶c = j;
            this.f۱۵۶۳۷d = eVar;
        }

        @Override // p۱۳۹e.AbstractCb0
        /* renamed from: l  reason: contains not printable characters */
        public long m۱۸۵۴۱l() {
            return this.f۱۵۶۳۶c;
        }

        @Override // p۱۳۹e.AbstractCb0
        /* renamed from: m  reason: contains not printable characters */
        public AbstractCe m۱۸۵۴۲m() {
            return this.f۱۵۶۳۷d;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCb0 m۱۸۵۳۷a(Cu contentType, long contentLength, AbstractCe content) {
        if (content != null) {
            return new Ca(contentType, contentLength, content);
        }
        throw new NullPointerException("source == null");
    }
}
