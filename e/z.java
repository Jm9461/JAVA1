package e;

import e.f0.c;
import f.d;

public abstract class z {
    public abstract long a();

    public abstract void a(d dVar);

    public abstract u b();

    public static z a(u contentType, byte[] content) {
        return a(contentType, content, 0, content.length);
    }

    public static z a(u contentType, byte[] content, int offset, int byteCount) {
        if (content != null) {
            c.a((long) content.length, (long) offset, (long) byteCount);
            return new a(contentType, byteCount, content, offset);
        }
        throw new NullPointerException("content == null");
    }

    /* access modifiers changed from: package-private */
    public class a extends z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f۴۱۶۲a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f۴۱۶۳b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f۴۱۶۴c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۴۱۶۵d;

        a(u uVar, int i, byte[] bArr, int i2) {
            this.f۴۱۶۲a = uVar;
            this.f۴۱۶۳b = i;
            this.f۴۱۶۴c = bArr;
            this.f۴۱۶۵d = i2;
        }

        @Override // e.z
        public u b() {
            return this.f۴۱۶۲a;
        }

        @Override // e.z
        public long a() {
            return (long) this.f۴۱۶۳b;
        }

        @Override // e.z
        public void a(d sink) {
            sink.write(this.f۴۱۶۴c, this.f۴۱۶۵d, this.f۴۱۶۳b);
        }
    }
}
