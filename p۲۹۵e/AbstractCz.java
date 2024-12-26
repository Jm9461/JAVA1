package p۲۹۵e;

import p۲۹۵e.p۲۹۶f0.Cc;
import p۳۰۵f.InterfaceCd;

/* renamed from: e.z, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCz {
    /* renamed from: a, reason: contains not printable characters */
    public abstract long mo۱۷۲۶۵a();

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۷۲۶۶a(InterfaceCd interfaceCd);

    /* renamed from: b, reason: contains not printable characters */
    public abstract Cu mo۱۷۲۶۷b();

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCz m۱۷۲۶۰a(Cu contentType, byte[] content) {
        return m۱۷۲۶۱a(contentType, content, 0, content.length);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static AbstractCz m۱۷۲۶۱a(Cu contentType, byte[] content, int offset, int byteCount) {
        if (content == null) {
            throw new NullPointerException("content == null");
        }
        Cc.m۱۶۵۴۱a(content.length, offset, byteCount);
        return new a(contentType, byteCount, content, offset);
    }

    /* renamed from: e.z$a */
    final class a extends AbstractCz {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ Cu f۱۶۲۵۳a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ int f۱۶۲۵۴b;

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ byte[] f۱۶۲۵۵c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ int f۱۶۲۵۶d;

        a(Cu cu, int i, byte[] bArr, int i2) {
            this.f۱۶۲۵۳a = cu;
            this.f۱۶۲۵۴b = i;
            this.f۱۶۲۵۵c = bArr;
            this.f۱۶۲۵۶d = i2;
        }

        @Override // p۲۹۵e.AbstractCz
        /* renamed from: b, reason: contains not printable characters */
        public Cu mo۱۷۲۶۷b() {
            return this.f۱۶۲۵۳a;
        }

        @Override // p۲۹۵e.AbstractCz
        /* renamed from: a, reason: contains not printable characters */
        public long mo۱۷۲۶۵a() {
            return this.f۱۶۲۵۴b;
        }

        @Override // p۲۹۵e.AbstractCz
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۷۲۶۶a(InterfaceCd sink) {
            sink.write(this.f۱۶۲۵۵c, this.f۱۶۲۵۶d, this.f۱۶۲۵۴b);
        }
    }
}
