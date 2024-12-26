package p۳۰۵f;

import java.util.Arrays;

/* renamed from: f.q, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cq extends Cf {

    /* renamed from: h, reason: contains not printable characters */
    final transient byte[][] f۱۶۳۱۱h;

    /* renamed from: i, reason: contains not printable characters */
    final transient int[] f۱۶۳۱۲i;

    Cq(Cc buffer, int byteCount) {
        super(null);
        Cu.m۱۷۴۹۲a(buffer.f۱۶۲۷۰d, 0L, byteCount);
        int offset = 0;
        int segmentCount = 0;
        Co s = buffer.f۱۶۲۶۹c;
        while (offset < byteCount) {
            int i = s.f۱۶۳۰۴c;
            int i2 = s.f۱۶۳۰۳b;
            if (i == i2) {
                throw new AssertionError("s.limit == s.pos");
            }
            offset += i - i2;
            segmentCount++;
            s = s.f۱۶۳۰۷f;
        }
        this.f۱۶۳۱۱h = new byte[segmentCount][];
        this.f۱۶۳۱۲i = new int[segmentCount * 2];
        int offset2 = 0;
        int segmentCount2 = 0;
        Co s2 = buffer.f۱۶۲۶۹c;
        while (offset2 < byteCount) {
            this.f۱۶۳۱۱h[segmentCount2] = s2.f۱۶۳۰۲a;
            offset2 += s2.f۱۶۳۰۴c - s2.f۱۶۳۰۳b;
            if (offset2 > byteCount) {
                offset2 = byteCount;
            }
            int[] iArr = this.f۱۶۳۱۲i;
            iArr[segmentCount2] = offset2;
            iArr[this.f۱۶۳۱۱h.length + segmentCount2] = s2.f۱۶۳۰۳b;
            s2.f۱۶۳۰۵d = true;
            segmentCount2++;
            s2 = s2.f۱۶۳۰۷f;
        }
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: i, reason: contains not printable characters */
    public String mo۱۷۴۷۴i() {
        return m۱۷۴۶۰j().mo۱۷۴۷۴i();
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: a, reason: contains not printable characters */
    public String mo۱۷۴۶۳a() {
        return m۱۷۴۶۰j().mo۱۷۴۶۳a();
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: b, reason: contains not printable characters */
    public String mo۱۷۴۶۷b() {
        return m۱۷۴۶۰j().mo۱۷۴۶۷b();
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: g, reason: contains not printable characters */
    public Cf mo۱۷۴۷۲g() {
        return m۱۷۴۶۰j().mo۱۷۴۷۲g();
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: c, reason: contains not printable characters */
    public Cf mo۱۷۴۶۸c() {
        return m۱۷۴۶۰j().mo۱۷۴۶۸c();
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: d, reason: contains not printable characters */
    public Cf mo۱۷۴۶۹d() {
        return m۱۷۴۶۰j().mo۱۷۴۶۹d();
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: e, reason: contains not printable characters */
    public Cf mo۱۷۴۷۰e() {
        return m۱۷۴۶۰j().mo۱۷۴۷۰e();
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: a, reason: contains not printable characters */
    public Cf mo۱۷۴۶۲a(int beginIndex, int endIndex) {
        return m۱۷۴۶۰j().mo۱۷۴۶۲a(beginIndex, endIndex);
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: a, reason: contains not printable characters */
    public byte mo۱۷۴۶۱a(int pos) {
        Cu.m۱۷۴۹۲a(this.f۱۶۳۱۲i[this.f۱۶۳۱۱h.length - 1], pos, 1L);
        int segment = m۱۷۴۵۹b(pos);
        int segmentOffset = segment == 0 ? 0 : this.f۱۶۳۱۲i[segment - 1];
        int[] iArr = this.f۱۶۳۱۲i;
        byte[][] bArr = this.f۱۶۳۱۱h;
        int segmentPos = iArr[bArr.length + segment];
        return bArr[segment][(pos - segmentOffset) + segmentPos];
    }

    /* renamed from: b, reason: contains not printable characters */
    private int m۱۷۴۵۹b(int pos) {
        int i = Arrays.binarySearch(this.f۱۶۳۱۲i, 0, this.f۱۶۳۱۱h.length, pos + 1);
        return i >= 0 ? i : i ^ (-1);
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: f, reason: contains not printable characters */
    public int mo۱۷۴۷۱f() {
        return this.f۱۶۳۱۲i[this.f۱۶۳۱۱h.length - 1];
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: h, reason: contains not printable characters */
    public byte[] mo۱۷۴۷۳h() {
        int[] iArr = this.f۱۶۳۱۲i;
        byte[][] bArr = this.f۱۶۳۱۱h;
        byte[] result = new byte[iArr[bArr.length - 1]];
        int segmentOffset = 0;
        int segmentCount = bArr.length;
        for (int s = 0; s < segmentCount; s++) {
            int[] iArr2 = this.f۱۶۳۱۲i;
            int segmentPos = iArr2[segmentCount + s];
            int nextSegmentOffset = iArr2[s];
            System.arraycopy(this.f۱۶۳۱۱h[s], segmentPos, result, segmentOffset, nextSegmentOffset - segmentOffset);
            segmentOffset = nextSegmentOffset;
        }
        return result;
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: a, reason: contains not printable characters */
    void mo۱۷۴۶۴a(Cc buffer) {
        int segmentOffset = 0;
        int segmentCount = this.f۱۶۳۱۱h.length;
        for (int s = 0; s < segmentCount; s++) {
            int[] iArr = this.f۱۶۳۱۲i;
            int segmentPos = iArr[segmentCount + s];
            int nextSegmentOffset = iArr[s];
            Co segment = new Co(this.f۱۶۳۱۱h[s], segmentPos, (segmentPos + nextSegmentOffset) - segmentOffset, true, false);
            Co co = buffer.f۱۶۲۶۹c;
            if (co == null) {
                segment.f۱۶۳۰۸g = segment;
                segment.f۱۶۳۰۷f = segment;
                buffer.f۱۶۲۶۹c = segment;
            } else {
                co.f۱۶۳۰۸g.m۱۷۴۵۲a(segment);
            }
            segmentOffset = nextSegmentOffset;
        }
        buffer.f۱۶۲۷۰d += segmentOffset;
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۷۴۶۵a(int offset, Cf other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > mo۱۷۴۷۱f() - byteCount) {
            return false;
        }
        int s = m۱۷۴۵۹b(offset);
        while (byteCount > 0) {
            int segmentOffset = s == 0 ? 0 : this.f۱۶۳۱۲i[s - 1];
            int segmentSize = this.f۱۶۳۱۲i[s] - segmentOffset;
            int stepSize = Math.min(byteCount, (segmentOffset + segmentSize) - offset);
            int[] iArr = this.f۱۶۳۱۲i;
            byte[][] bArr = this.f۱۶۳۱۱h;
            int segmentPos = iArr[bArr.length + s];
            int arrayOffset = (offset - segmentOffset) + segmentPos;
            if (!other.mo۱۷۴۶۶a(otherOffset, bArr[s], arrayOffset, stepSize)) {
                return false;
            }
            offset += stepSize;
            otherOffset += stepSize;
            byteCount -= stepSize;
            s++;
        }
        return true;
    }

    @Override // p۳۰۵f.Cf
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۷۴۶۶a(int offset, byte[] other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > mo۱۷۴۷۱f() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int s = m۱۷۴۵۹b(offset);
        while (byteCount > 0) {
            int segmentOffset = s == 0 ? 0 : this.f۱۶۳۱۲i[s - 1];
            int segmentSize = this.f۱۶۳۱۲i[s] - segmentOffset;
            int stepSize = Math.min(byteCount, (segmentOffset + segmentSize) - offset);
            int[] iArr = this.f۱۶۳۱۲i;
            byte[][] bArr = this.f۱۶۳۱۱h;
            int segmentPos = iArr[bArr.length + s];
            int arrayOffset = (offset - segmentOffset) + segmentPos;
            if (!Cu.m۱۷۴۹۴a(bArr[s], arrayOffset, other, otherOffset, stepSize)) {
                return false;
            }
            offset += stepSize;
            otherOffset += stepSize;
            byteCount -= stepSize;
            s++;
        }
        return true;
    }

    /* renamed from: j, reason: contains not printable characters */
    private Cf m۱۷۴۶۰j() {
        return new Cf(mo۱۷۴۷۳h());
    }

    @Override // p۳۰۵f.Cf
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        return (o instanceof Cf) && ((Cf) o).mo۱۷۴۷۱f() == mo۱۷۴۷۱f() && mo۱۷۴۶۵a(0, (Cf) o, 0, mo۱۷۴۷۱f());
    }

    @Override // p۳۰۵f.Cf
    public int hashCode() {
        int result = this.f۱۶۲۷۵d;
        if (result != 0) {
            return result;
        }
        int result2 = 1;
        int segmentOffset = 0;
        int segmentCount = this.f۱۶۳۱۱h.length;
        for (int s = 0; s < segmentCount; s++) {
            byte[] segment = this.f۱۶۳۱۱h[s];
            int[] iArr = this.f۱۶۳۱۲i;
            int segmentPos = iArr[segmentCount + s];
            int nextSegmentOffset = iArr[s];
            int segmentSize = nextSegmentOffset - segmentOffset;
            int limit = segmentPos + segmentSize;
            for (int i = segmentPos; i < limit; i++) {
                result2 = (result2 * 31) + segment[i];
            }
            segmentOffset = nextSegmentOffset;
        }
        this.f۱۶۲۷۵d = result2;
        return result2;
    }

    @Override // p۳۰۵f.Cf
    public String toString() {
        return m۱۷۴۶۰j().toString();
    }
}
