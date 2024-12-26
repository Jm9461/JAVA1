package p۱۴۹f;

import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: f.q  reason: invalid class name */
public final class Cq extends Cf {

    /* renamed from: h  reason: contains not printable characters */
    final transient byte[][] f۱۶۳۱۱h;

    /* renamed from: i  reason: contains not printable characters */
    final transient int[] f۱۶۳۱۲i;

    Cq(Cc buffer, int byteCount) {
        super(null);
        Cu.m۱۹۵۶۹a(buffer.f۱۶۲۷۰d, 0, (long) byteCount);
        int offset = 0;
        int segmentCount = 0;
        Co s = buffer.f۱۶۲۶۹c;
        while (offset < byteCount) {
            int i = s.f۱۶۳۰۴c;
            int i2 = s.f۱۶۳۰۳b;
            if (i != i2) {
                offset += i - i2;
                segmentCount++;
                s = s.f۱۶۳۰۷f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f۱۶۳۱۱h = new byte[segmentCount][];
        this.f۱۶۳۱۲i = new int[(segmentCount * 2)];
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

    @Override // p۱۴۹f.Cf
    /* renamed from: i  reason: contains not printable characters */
    public String m۱۹۵۵۱i() {
        return m۱۹۵۳۷j().m۱۹۴۵۴i();
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۵۴۰a() {
        return m۱۹۵۳۷j().m۱۹۴۴۲a();
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۵۴۴b() {
        return m۱۹۵۳۷j().m۱۹۴۴۶b();
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: g  reason: contains not printable characters */
    public Cf m۱۹۵۴۹g() {
        return m۱۹۵۳۷j().m۱۹۴۵۲g();
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: c  reason: contains not printable characters */
    public Cf m۱۹۵۴۵c() {
        return m۱۹۵۳۷j().m۱۹۴۴۸c();
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: d  reason: contains not printable characters */
    public Cf m۱۹۵۴۶d() {
        return m۱۹۵۳۷j().m۱۹۴۴۹d();
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: e  reason: contains not printable characters */
    public Cf m۱۹۵۴۷e() {
        return m۱۹۵۳۷j().m۱۹۴۵۰e();
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: a  reason: contains not printable characters */
    public Cf m۱۹۵۳۹a(int beginIndex, int endIndex) {
        return m۱۹۵۳۷j().m۱۹۴۴۱a(beginIndex, endIndex);
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: a  reason: contains not printable characters */
    public byte m۱۹۵۳۸a(int pos) {
        Cu.m۱۹۵۶۹a((long) this.f۱۶۳۱۲i[this.f۱۶۳۱۱h.length - 1], (long) pos, 1);
        int segment = m۱۹۵۳۶b(pos);
        int segmentOffset = segment == 0 ? 0 : this.f۱۶۳۱۲i[segment - 1];
        int[] iArr = this.f۱۶۳۱۲i;
        byte[][] bArr = this.f۱۶۳۱۱h;
        return bArr[segment][(pos - segmentOffset) + iArr[bArr.length + segment]];
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۹۵۳۶b(int pos) {
        int i = Arrays.binarySearch(this.f۱۶۳۱۲i, 0, this.f۱۶۳۱۱h.length, pos + 1);
        return i >= 0 ? i : i ^ -1;
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: f  reason: contains not printable characters */
    public int m۱۹۵۴۸f() {
        return this.f۱۶۳۱۲i[this.f۱۶۳۱۱h.length - 1];
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: h  reason: contains not printable characters */
    public byte[] m۱۹۵۵۰h() {
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

    /* access modifiers changed from: package-private */
    @Override // p۱۴۹f.Cf
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۵۴۱a(Cc buffer) {
        int segmentOffset = 0;
        int segmentCount = this.f۱۶۳۱۱h.length;
        for (int s = 0; s < segmentCount; s++) {
            int[] iArr = this.f۱۶۳۱۲i;
            int segmentPos = iArr[segmentCount + s];
            int nextSegmentOffset = iArr[s];
            Co segment = new Co(this.f۱۶۳۱۱h[s], segmentPos, (segmentPos + nextSegmentOffset) - segmentOffset, true, false);
            Co oVar = buffer.f۱۶۲۶۹c;
            if (oVar == null) {
                segment.f۱۶۳۰۸g = segment;
                segment.f۱۶۳۰۷f = segment;
                buffer.f۱۶۲۶۹c = segment;
            } else {
                oVar.f۱۶۳۰۸g.m۱۹۵۲۹a(segment);
            }
            segmentOffset = nextSegmentOffset;
        }
        buffer.f۱۶۲۷۰d += (long) segmentOffset;
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۵۴۲a(int offset, Cf other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > m۱۹۵۴۸f() - byteCount) {
            return false;
        }
        int s = m۱۹۵۳۶b(offset);
        while (byteCount > 0) {
            int segmentOffset = s == 0 ? 0 : this.f۱۶۳۱۲i[s - 1];
            int stepSize = Math.min(byteCount, (segmentOffset + (this.f۱۶۳۱۲i[s] - segmentOffset)) - offset);
            int[] iArr = this.f۱۶۳۱۲i;
            byte[][] bArr = this.f۱۶۳۱۱h;
            if (!other.m۱۹۴۴۵a(otherOffset, bArr[s], (offset - segmentOffset) + iArr[bArr.length + s], stepSize)) {
                return false;
            }
            offset += stepSize;
            otherOffset += stepSize;
            byteCount -= stepSize;
            s++;
        }
        return true;
    }

    @Override // p۱۴۹f.Cf
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۵۴۳a(int offset, byte[] other, int otherOffset, int byteCount) {
        if (offset < 0 || offset > m۱۹۵۴۸f() - byteCount || otherOffset < 0 || otherOffset > other.length - byteCount) {
            return false;
        }
        int s = m۱۹۵۳۶b(offset);
        while (byteCount > 0) {
            int segmentOffset = s == 0 ? 0 : this.f۱۶۳۱۲i[s - 1];
            int stepSize = Math.min(byteCount, (segmentOffset + (this.f۱۶۳۱۲i[s] - segmentOffset)) - offset);
            int[] iArr = this.f۱۶۳۱۲i;
            byte[][] bArr = this.f۱۶۳۱۱h;
            if (!Cu.m۱۹۵۷۱a(bArr[s], (offset - segmentOffset) + iArr[bArr.length + s], other, otherOffset, stepSize)) {
                return false;
            }
            offset += stepSize;
            otherOffset += stepSize;
            byteCount -= stepSize;
            s++;
        }
        return true;
    }

    /* renamed from: j  reason: contains not printable characters */
    private Cf m۱۹۵۳۷j() {
        return new Cf(m۱۹۵۵۰h());
    }

    @Override // p۱۴۹f.Cf
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Cf) || ((Cf) o).m۱۹۴۵۱f() != m۱۹۵۴۸f() || !m۱۹۵۴۲a(0, (Cf) o, 0, m۱۹۵۴۸f())) {
            return false;
        }
        return true;
    }

    @Override // p۱۴۹f.Cf
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
            int limit = segmentPos + (nextSegmentOffset - segmentOffset);
            for (int i = segmentPos; i < limit; i++) {
                result2 = (result2 * 31) + segment[i];
            }
            segmentOffset = nextSegmentOffset;
        }
        this.f۱۶۲۷۵d = result2;
        return result2;
    }

    @Override // p۱۴۹f.Cf
    public String toString() {
        return m۱۹۵۳۷j().toString();
    }
}
