package p۱۴۹f;

/* access modifiers changed from: package-private */
/* renamed from: f.o  reason: invalid class name */
public final class Co {

    /* renamed from: a  reason: contains not printable characters */
    final byte[] f۱۶۳۰۲a;

    /* renamed from: b  reason: contains not printable characters */
    int f۱۶۳۰۳b;

    /* renamed from: c  reason: contains not printable characters */
    int f۱۶۳۰۴c;

    /* renamed from: d  reason: contains not printable characters */
    boolean f۱۶۳۰۵d;

    /* renamed from: e  reason: contains not printable characters */
    boolean f۱۶۳۰۶e;

    /* renamed from: f  reason: contains not printable characters */
    Co f۱۶۳۰۷f;

    /* renamed from: g  reason: contains not printable characters */
    Co f۱۶۳۰۸g;

    Co() {
        this.f۱۶۳۰۲a = new byte[8192];
        this.f۱۶۳۰۶e = true;
        this.f۱۶۳۰۵d = false;
    }

    Co(byte[] data, int pos, int limit, boolean shared, boolean owner) {
        this.f۱۶۳۰۲a = data;
        this.f۱۶۳۰۳b = pos;
        this.f۱۶۳۰۴c = limit;
        this.f۱۶۳۰۵d = shared;
        this.f۱۶۳۰۶e = owner;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public Co m۱۹۵۳۳c() {
        this.f۱۶۳۰۵d = true;
        return new Co(this.f۱۶۳۰۲a, this.f۱۶۳۰۳b, this.f۱۶۳۰۴c, true, false);
    }

    /* renamed from: b  reason: contains not printable characters */
    public Co m۱۹۵۳۲b() {
        Co result = this.f۱۶۳۰۷f;
        if (result == this) {
            result = null;
        }
        Co oVar = this.f۱۶۳۰۸g;
        oVar.f۱۶۳۰۷f = this.f۱۶۳۰۷f;
        this.f۱۶۳۰۷f.f۱۶۳۰۸g = oVar;
        this.f۱۶۳۰۷f = null;
        this.f۱۶۳۰۸g = null;
        return result;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Co m۱۹۵۲۹a(Co segment) {
        segment.f۱۶۳۰۸g = this;
        segment.f۱۶۳۰۷f = this.f۱۶۳۰۷f;
        this.f۱۶۳۰۷f.f۱۶۳۰۸g = segment;
        this.f۱۶۳۰۷f = segment;
        return segment;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Co m۱۹۵۲۸a(int byteCount) {
        Co prefix;
        if (byteCount <= 0 || byteCount > this.f۱۶۳۰۴c - this.f۱۶۳۰۳b) {
            throw new IllegalArgumentException();
        }
        if (byteCount >= 1024) {
            prefix = m۱۹۵۳۳c();
        } else {
            prefix = Cp.m۱۹۵۳۴a();
            System.arraycopy(this.f۱۶۳۰۲a, this.f۱۶۳۰۳b, prefix.f۱۶۳۰۲a, 0, byteCount);
        }
        prefix.f۱۶۳۰۴c = prefix.f۱۶۳۰۳b + byteCount;
        this.f۱۶۳۰۳b += byteCount;
        this.f۱۶۳۰۸g.m۱۹۵۲۹a(prefix);
        return prefix;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۵۳۰a() {
        Co oVar = this.f۱۶۳۰۸g;
        if (oVar == this) {
            throw new IllegalStateException();
        } else if (oVar.f۱۶۳۰۶e) {
            int byteCount = this.f۱۶۳۰۴c - this.f۱۶۳۰۳b;
            if (byteCount <= (8192 - oVar.f۱۶۳۰۴c) + (oVar.f۱۶۳۰۵d ? 0 : oVar.f۱۶۳۰۳b)) {
                m۱۹۵۳۱a(this.f۱۶۳۰۸g, byteCount);
                m۱۹۵۳۲b();
                Cp.m۱۹۵۳۵a(this);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۵۳۱a(Co sink, int byteCount) {
        if (sink.f۱۶۳۰۶e) {
            int i = sink.f۱۶۳۰۴c;
            if (i + byteCount > 8192) {
                if (!sink.f۱۶۳۰۵d) {
                    int i2 = sink.f۱۶۳۰۳b;
                    if ((i + byteCount) - i2 <= 8192) {
                        byte[] bArr = sink.f۱۶۳۰۲a;
                        System.arraycopy(bArr, i2, bArr, 0, i - i2);
                        sink.f۱۶۳۰۴c -= sink.f۱۶۳۰۳b;
                        sink.f۱۶۳۰۳b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f۱۶۳۰۲a, this.f۱۶۳۰۳b, sink.f۱۶۳۰۲a, sink.f۱۶۳۰۴c, byteCount);
            sink.f۱۶۳۰۴c += byteCount;
            this.f۱۶۳۰۳b += byteCount;
            return;
        }
        throw new IllegalArgumentException();
    }
}
