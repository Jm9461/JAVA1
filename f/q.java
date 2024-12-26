package f;

import java.util.Arrays;

/* access modifiers changed from: package-private */
public final class q extends f {

    /* renamed from: h  reason: collision with root package name */
    final transient byte[][] f۴۲۱۷h;
    final transient int[] i;

    q(c buffer, int byteCount) {
        super(null);
        u.a(buffer.f۴۱۷۷d, 0, (long) byteCount);
        int offset = 0;
        int segmentCount = 0;
        o s = buffer.f۴۱۷۶c;
        while (offset < byteCount) {
            int i2 = s.f۴۲۱۰c;
            int i3 = s.f۴۲۰۹b;
            if (i2 != i3) {
                offset += i2 - i3;
                segmentCount++;
                s = s.f۴۲۱۳f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f۴۲۱۷h = new byte[segmentCount][];
        this.i = new int[(segmentCount * 2)];
        int offset2 = 0;
        int segmentCount2 = 0;
        o s2 = buffer.f۴۱۷۶c;
        while (offset2 < byteCount) {
            this.f۴۲۱۷h[segmentCount2] = s2.f۴۲۰۸a;
            offset2 += s2.f۴۲۱۰c - s2.f۴۲۰۹b;
            if (offset2 > byteCount) {
                offset2 = byteCount;
            }
            int[] iArr = this.i;
            iArr[segmentCount2] = offset2;
            iArr[this.f۴۲۱۷h.length + segmentCount2] = s2.f۴۲۰۹b;
            s2.f۴۲۱۱d = true;
            segmentCount2++;
            s2 = s2.f۴۲۱۳f;
        }
    }

    @Override // f.f
    public String i() {
        return j().i();
    }

    @Override // f.f
    public String a() {
        return j().a();
    }

    @Override // f.f
    public String b() {
        return j().b();
    }

    @Override // f.f
    public f g() {
        return j().g();
    }

    @Override // f.f
    public f c() {
        return j().c();
    }

    @Override // f.f
    public f d() {
        return j().d();
    }

    @Override // f.f
    public f e() {
        return j().e();
    }

    @Override // f.f
    public f a(int beginIndex, int endIndex) {
        return j().a(beginIndex, endIndex);
    }

    @Override // f.f
    public byte a(int pos) {
        u.a((long) this.i[this.f۴۲۱۷h.length - 1], (long) pos, 1);
        int segment = b(pos);
        int segmentOffset = segment == 0 ? 0 : this.i[segment - 1];
        int[] iArr = this.i;
        byte[][] bArr = this.f۴۲۱۷h;
        return bArr[segment][(pos - segmentOffset) + iArr[bArr.length + segment]];
    }

    private int b(int pos) {
        int i2 = Arrays.binarySearch(this.i, 0, this.f۴۲۱۷h.length, pos + 1);
        return i2 >= 0 ? i2 : i2 ^ -1;
    }

    @Override // f.f
    public int f() {
        return this.i[this.f۴۲۱۷h.length - 1];
    }

    @Override // f.f
    public byte[] h() {
        int[] iArr = this.i;
        byte[][] bArr = this.f۴۲۱۷h;
        byte[] result = new byte[iArr[bArr.length - 1]];
        int segmentOffset = 0;
        int segmentCount = bArr.length;
        for (int s = 0; s < segmentCount; s++) {
            int[] iArr2 = this.i;
            int segmentPos = iArr2[segmentCount + s];
            int nextSegmentOffset = iArr2[s];
            System.arraycopy(this.f۴۲۱۷h[s], segmentPos, result, segmentOffset, nextSegmentOffset - segmentOffset);
            segmentOffset = nextSegmentOffset;
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    @Override // f.f
    public void a(c buffer) {
        int segmentOffset = 0;
        int segmentCount = this.f۴۲۱۷h.length;
        for (int s = 0; s < segmentCount; s++) {
            int[] iArr = this.i;
            int segmentPos = iArr[segmentCount + s];
            int nextSegmentOffset = iArr[s];
            o segment = new o(this.f۴۲۱۷h[s], segmentPos, (segmentPos + nextSegmentOffset) - segmentOffset, true, false);
            o oVar = buffer.f۴۱۷۶c;
            if (oVar == null) {
                segment.f۴۲۱۴g = segment;
                segment.f۴۲۱۳f = segment;
                buffer.f۴۱۷۶c = segment;
            } else {
                oVar.f۴۲۱۴g.a(segment);
            }
            segmentOffset = nextSegmentOffset;
        }
        buffer.f۴۱۷۷d += (long) segmentOffset;
    }

    @Override // f.f
    public boolean a(int offset, f other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > f() - byteCount) {
            return false;
        }
        int s = b(offset);
        while (byteCount > 0) {
            int segmentOffset = s == 0 ? 0 : this.i[s - 1];
            int stepSize = Math.min(byteCount, (segmentOffset + (this.i[s] - segmentOffset)) - offset);
            int[] iArr = this.i;
            byte[][] bArr = this.f۴۲۱۷h;
            if (!other.a(otherOffset, bArr[s], (offset - segmentOffset) + iArr[bArr.length + s], stepSize)) {
                return false;
            }
            offset += stepSize;
            otherOffset += stepSize;
            byteCount -= stepSize;
            s++;
        }
        return true;
    }

    @Override // f.f
    public boolean a(int offset, byte[] other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > f() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int s = b(offset);
        while (byteCount > 0) {
            int segmentOffset = s == 0 ? 0 : this.i[s - 1];
            int stepSize = Math.min(byteCount, (segmentOffset + (this.i[s] - segmentOffset)) - offset);
            int[] iArr = this.i;
            byte[][] bArr = this.f۴۲۱۷h;
            if (!u.a(bArr[s], (offset - segmentOffset) + iArr[bArr.length + s], other, otherOffset, stepSize)) {
                return false;
            }
            offset += stepSize;
            otherOffset += stepSize;
            byteCount -= stepSize;
            s++;
        }
        return true;
    }

    private f j() {
        return new f(h());
    }

    @Override // f.f
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof f) || ((f) o).f() != f() || !a(0, (f) o, 0, f())) {
            return false;
        }
        return true;
    }

    @Override // f.f
    public int hashCode() {
        int result = this.f۴۱۸۲d;
        if (result != 0) {
            return result;
        }
        int result2 = 1;
        int segmentOffset = 0;
        int segmentCount = this.f۴۲۱۷h.length;
        for (int s = 0; s < segmentCount; s++) {
            byte[] segment = this.f۴۲۱۷h[s];
            int[] iArr = this.i;
            int segmentPos = iArr[segmentCount + s];
            int nextSegmentOffset = iArr[s];
            int limit = segmentPos + (nextSegmentOffset - segmentOffset);
            for (int i2 = segmentPos; i2 < limit; i2++) {
                result2 = (result2 * 31) + segment[i2];
            }
            segmentOffset = nextSegmentOffset;
        }
        this.f۴۱۸۲d = result2;
        return result2;
    }

    @Override // f.f
    public String toString() {
        return j().toString();
    }
}
