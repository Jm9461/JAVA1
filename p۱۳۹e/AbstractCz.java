package p۱۳۹e;

import p۱۳۹e.p۱۴۰f0.Cc;
import p۱۴۹f.AbstractCd;

/* renamed from: e.z  reason: invalid class name */
public abstract class AbstractCz {
    /* renamed from: a  reason: contains not printable characters */
    public abstract long m۱۹۳۴۰a();

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۹۳۴۱a(AbstractCd dVar);

    /* renamed from: b  reason: contains not printable characters */
    public abstract Cu m۱۹۳۴۲b();

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCz m۱۹۳۳۸a(Cu contentType, byte[] content) {
        return m۱۹۳۳۹a(contentType, content, 0, content.length);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AbstractCz m۱۹۳۳۹a(Cu contentType, byte[] content, int offset, int byteCount) {
        if (content != null) {
            Cc.m۱۸۶۲۰a((long) content.length, (long) offset, (long) byteCount);
            return new Ca(contentType, byteCount, content, offset);
        }
        throw new NullPointerException("content == null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.z$a  reason: invalid class name */
    public class Ca extends AbstractCz {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ Cu f۱۶۲۵۳a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ int f۱۶۲۵۴b;

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ byte[] f۱۶۲۵۵c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۱۶۲۵۶d;

        Ca(Cu uVar, int i, byte[] bArr, int i2) {
            this.f۱۶۲۵۳a = uVar;
            this.f۱۶۲۵۴b = i;
            this.f۱۶۲۵۵c = bArr;
            this.f۱۶۲۵۶d = i2;
        }

        @Override // p۱۳۹e.AbstractCz
        /* renamed from: b  reason: contains not printable characters */
        public Cu m۱۹۳۴۵b() {
            return this.f۱۶۲۵۳a;
        }

        @Override // p۱۳۹e.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public long m۱۹۳۴۳a() {
            return (long) this.f۱۶۲۵۴b;
        }

        @Override // p۱۳۹e.AbstractCz
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۹۳۴۴a(AbstractCd sink) {
            sink.write(this.f۱۶۲۵۵c, this.f۱۶۲۵۶d, this.f۱۶۲۵۴b);
        }
    }
}
