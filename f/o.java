package f;

/* access modifiers changed from: package-private */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    final byte[] f۴۲۰۸a;

    /* renamed from: b  reason: collision with root package name */
    int f۴۲۰۹b;

    /* renamed from: c  reason: collision with root package name */
    int f۴۲۱۰c;

    /* renamed from: d  reason: collision with root package name */
    boolean f۴۲۱۱d;

    /* renamed from: e  reason: collision with root package name */
    boolean f۴۲۱۲e;

    /* renamed from: f  reason: collision with root package name */
    o f۴۲۱۳f;

    /* renamed from: g  reason: collision with root package name */
    o f۴۲۱۴g;

    o() {
        this.f۴۲۰۸a = new byte[8192];
        this.f۴۲۱۲e = true;
        this.f۴۲۱۱d = false;
    }

    o(byte[] data, int pos, int limit, boolean shared, boolean owner) {
        this.f۴۲۰۸a = data;
        this.f۴۲۰۹b = pos;
        this.f۴۲۱۰c = limit;
        this.f۴۲۱۱d = shared;
        this.f۴۲۱۲e = owner;
    }

    /* access modifiers changed from: package-private */
    public o c() {
        this.f۴۲۱۱d = true;
        return new o(this.f۴۲۰۸a, this.f۴۲۰۹b, this.f۴۲۱۰c, true, false);
    }

    public o b() {
        o result = this.f۴۲۱۳f;
        if (result == this) {
            result = null;
        }
        o oVar = this.f۴۲۱۴g;
        oVar.f۴۲۱۳f = this.f۴۲۱۳f;
        this.f۴۲۱۳f.f۴۲۱۴g = oVar;
        this.f۴۲۱۳f = null;
        this.f۴۲۱۴g = null;
        return result;
    }

    public o a(o segment) {
        segment.f۴۲۱۴g = this;
        segment.f۴۲۱۳f = this.f۴۲۱۳f;
        this.f۴۲۱۳f.f۴۲۱۴g = segment;
        this.f۴۲۱۳f = segment;
        return segment;
    }

    public o a(int byteCount) {
        o prefix;
        if (byteCount <= 0 || byteCount > this.f۴۲۱۰c - this.f۴۲۰۹b) {
            throw new IllegalArgumentException();
        }
        if (byteCount >= 1024) {
            prefix = c();
        } else {
            prefix = p.a();
            System.arraycopy(this.f۴۲۰۸a, this.f۴۲۰۹b, prefix.f۴۲۰۸a, 0, byteCount);
        }
        prefix.f۴۲۱۰c = prefix.f۴۲۰۹b + byteCount;
        this.f۴۲۰۹b += byteCount;
        this.f۴۲۱۴g.a(prefix);
        return prefix;
    }

    public void a() {
        o oVar = this.f۴۲۱۴g;
        if (oVar == this) {
            throw new IllegalStateException();
        } else if (oVar.f۴۲۱۲e) {
            int byteCount = this.f۴۲۱۰c - this.f۴۲۰۹b;
            if (byteCount <= (8192 - oVar.f۴۲۱۰c) + (oVar.f۴۲۱۱d ? 0 : oVar.f۴۲۰۹b)) {
                a(this.f۴۲۱۴g, byteCount);
                b();
                p.a(this);
            }
        }
    }

    public void a(o sink, int byteCount) {
        if (sink.f۴۲۱۲e) {
            int i = sink.f۴۲۱۰c;
            if (i + byteCount > 8192) {
                if (!sink.f۴۲۱۱d) {
                    int i2 = sink.f۴۲۰۹b;
                    if ((i + byteCount) - i2 <= 8192) {
                        byte[] bArr = sink.f۴۲۰۸a;
                        System.arraycopy(bArr, i2, bArr, 0, i - i2);
                        sink.f۴۲۱۰c -= sink.f۴۲۰۹b;
                        sink.f۴۲۰۹b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f۴۲۰۸a, this.f۴۲۰۹b, sink.f۴۲۰۸a, sink.f۴۲۱۰c, byteCount);
            sink.f۴۲۱۰c += byteCount;
            this.f۴۲۰۹b += byteCount;
            return;
        }
        throw new IllegalArgumentException();
    }
}
