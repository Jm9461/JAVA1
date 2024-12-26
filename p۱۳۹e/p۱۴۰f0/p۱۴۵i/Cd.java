package p۱۳۹e.p۱۴۰f0.p۱۴۵i;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Header;
import okio.ByteString;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cc;
import p۱۴۹f.Cf;
import p۱۴۹f.Cl;

/* access modifiers changed from: package-private */
/* renamed from: e.f0.i.d  reason: invalid class name */
public final class Cd {

    /* renamed from: a  reason: contains not printable characters */
    static final Cc[] f۱۵۸۹۱a = {new Cc(Cc.f۱۵۸۸۷i, ""), new Cc(Cc.f۱۵۸۸۴f, "GET"), new Cc(Cc.f۱۵۸۸۴f, "POST"), new Cc(Cc.f۱۵۸۸۵g, "/"), new Cc(Cc.f۱۵۸۸۵g, "/index.html"), new Cc(Cc.f۱۵۸۸۶h, "http"), new Cc(Cc.f۱۵۸۸۶h, "https"), new Cc(Cc.f۱۵۸۸۳e, "200"), new Cc(Cc.f۱۵۸۸۳e, "204"), new Cc(Cc.f۱۵۸۸۳e, "206"), new Cc(Cc.f۱۵۸۸۳e, "304"), new Cc(Cc.f۱۵۸۸۳e, "400"), new Cc(Cc.f۱۵۸۸۳e, "404"), new Cc(Cc.f۱۵۸۸۳e, "500"), new Cc("accept-charset", ""), new Cc("accept-encoding", "gzip, deflate"), new Cc("accept-language", ""), new Cc("accept-ranges", ""), new Cc("accept", ""), new Cc("access-control-allow-origin", ""), new Cc("age", ""), new Cc("allow", ""), new Cc("authorization", ""), new Cc("cache-control", ""), new Cc("content-disposition", ""), new Cc("content-encoding", ""), new Cc("content-language", ""), new Cc("content-length", ""), new Cc("content-location", ""), new Cc("content-range", ""), new Cc("content-type", ""), new Cc("cookie", ""), new Cc("date", ""), new Cc("etag", ""), new Cc("expect", ""), new Cc("expires", ""), new Cc("from", ""), new Cc("host", ""), new Cc("if-match", ""), new Cc("if-modified-since", ""), new Cc("if-none-match", ""), new Cc("if-range", ""), new Cc("if-unmodified-since", ""), new Cc("last-modified", ""), new Cc("link", ""), new Cc("location", ""), new Cc("max-forwards", ""), new Cc("proxy-authenticate", ""), new Cc("proxy-authorization", ""), new Cc("range", ""), new Cc("referer", ""), new Cc("refresh", ""), new Cc("retry-after", ""), new Cc("server", ""), new Cc("set-cookie", ""), new Cc("strict-transport-security", ""), new Cc("transfer-encoding", ""), new Cc("user-agent", ""), new Cc("vary", ""), new Cc("via", ""), new Cc("www-authenticate", "")};

    /* renamed from: b  reason: contains not printable characters */
    static final Map<Cf, Integer> f۱۵۸۹۲b = m۱۸۸۳۷a();

    /* renamed from: e.f0.i.d$a  reason: invalid class name */
    static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private final List<Cc> f۱۵۸۹۳a;

        /* renamed from: b  reason: contains not printable characters */
        private final AbstractCe f۱۵۸۹۴b;

        /* renamed from: c  reason: contains not printable characters */
        private final int f۱۵۸۹۵c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۱۵۸۹۶d;

        /* renamed from: e  reason: contains not printable characters */
        Cc[] f۱۵۸۹۷e;

        /* renamed from: f  reason: contains not printable characters */
        int f۱۵۸۹۸f;

        /* renamed from: g  reason: contains not printable characters */
        int f۱۵۸۹۹g;

        /* renamed from: h  reason: contains not printable characters */
        int f۱۵۹۰۰h;

        Ca(int headerTableSizeSetting, AbstractCs source) {
            this(headerTableSizeSetting, headerTableSizeSetting, source);
        }

        Ca(int headerTableSizeSetting, int maxDynamicTableByteCount, AbstractCs source) {
            this.f۱۵۸۹۳a = new ArrayList();
            this.f۱۵۸۹۷e = new Cc[8];
            this.f۱۵۸۹۸f = this.f۱۵۸۹۷e.length - 1;
            this.f۱۵۸۹۹g = 0;
            this.f۱۵۹۰۰h = 0;
            this.f۱۵۸۹۵c = headerTableSizeSetting;
            this.f۱۵۸۹۶d = maxDynamicTableByteCount;
            this.f۱۵۸۹۴b = Cl.m۱۹۴۸۰a(source);
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۸۸۴۲d() {
            int i = this.f۱۵۸۹۶d;
            int i2 = this.f۱۵۹۰۰h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m۱۸۸۴۴e();
            } else {
                m۱۸۸۴۰b(i2 - i);
            }
        }

        /* renamed from: e  reason: contains not printable characters */
        private void m۱۸۸۴۴e() {
            Arrays.fill(this.f۱۵۸۹۷e, (Object) null);
            this.f۱۵۸۹۸f = this.f۱۵۸۹۷e.length - 1;
            this.f۱۵۸۹۹g = 0;
            this.f۱۵۹۰۰h = 0;
        }

        /* renamed from: b  reason: contains not printable characters */
        private int m۱۸۸۴۰b(int bytesToRecover) {
            int entriesToEvict = 0;
            if (bytesToRecover > 0) {
                int j = this.f۱۵۸۹۷e.length;
                while (true) {
                    j--;
                    if (j < this.f۱۵۸۹۸f || bytesToRecover <= 0) {
                        Cc[] cVarArr = this.f۱۵۸۹۷e;
                        int i = this.f۱۵۸۹۸f;
                        System.arraycopy(cVarArr, i + 1, cVarArr, i + 1 + entriesToEvict, this.f۱۵۸۹۹g);
                        this.f۱۵۸۹۸f += entriesToEvict;
                    } else {
                        Cc[] cVarArr2 = this.f۱۵۸۹۷e;
                        bytesToRecover -= cVarArr2[j].f۱۵۸۹۰c;
                        this.f۱۵۹۰۰h -= cVarArr2[j].f۱۵۸۹۰c;
                        this.f۱۵۸۹۹g--;
                        entriesToEvict++;
                    }
                }
                Cc[] cVarArr3 = this.f۱۵۸۹۷e;
                int i2 = this.f۱۵۸۹۸f;
                System.arraycopy(cVarArr3, i2 + 1, cVarArr3, i2 + 1 + entriesToEvict, this.f۱۵۸۹۹g);
                this.f۱۵۸۹۸f += entriesToEvict;
            }
            return entriesToEvict;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۸۸۵۴c() {
            while (!this.f۱۵۸۹۴b.m۱۹۴۲۹i()) {
                int b = this.f۱۵۸۹۴b.readByte() & 255;
                if (b == 128) {
                    throw new IOException("index == 0");
                } else if ((b & 128) == 128) {
                    m۱۸۸۴۵e(m۱۸۸۵۱a(b, 127) - 1);
                } else if (b == 64) {
                    m۱۸۸۴۸g();
                } else if ((b & 64) == 64) {
                    m۱۸۸۴۷f(m۱۸۸۵۱a(b, 63) - 1);
                } else if ((b & 32) == 32) {
                    this.f۱۵۸۹۶d = m۱۸۸۵۱a(b, 31);
                    int i = this.f۱۵۸۹۶d;
                    if (i < 0 || i > this.f۱۵۸۹۵c) {
                        throw new IOException("Invalid dynamic table size update " + this.f۱۵۸۹۶d);
                    }
                    m۱۸۸۴۲d();
                } else if (b == 16 || b == 0) {
                    m۱۸۸۵۰h();
                } else {
                    m۱۸۸۴۹g(m۱۸۸۵۱a(b, 15) - 1);
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public List<Cc> m۱۸۸۵۲a() {
            List<Header> result = new ArrayList<>(this.f۱۵۸۹۳a);
            this.f۱۵۸۹۳a.clear();
            return result;
        }

        /* renamed from: e  reason: contains not printable characters */
        private void m۱۸۸۴۵e(int index) {
            if (m۱۸۸۴۳d(index)) {
                this.f۱۵۸۹۳a.add(Cd.f۱۵۸۹۱a[index]);
                return;
            }
            int dynamicTableIndex = m۱۸۸۳۸a(index - Cd.f۱۵۸۹۱a.length);
            if (dynamicTableIndex >= 0) {
                Cc[] cVarArr = this.f۱۵۸۹۷e;
                if (dynamicTableIndex < cVarArr.length) {
                    this.f۱۵۸۹۳a.add(cVarArr[dynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        /* renamed from: a  reason: contains not printable characters */
        private int m۱۸۸۳۸a(int index) {
            return this.f۱۵۸۹۸f + 1 + index;
        }

        /* renamed from: g  reason: contains not printable characters */
        private void m۱۸۸۴۹g(int index) {
            this.f۱۵۸۹۳a.add(new Cc(m۱۸۸۴۱c(index), m۱۸۸۵۳b()));
        }

        /* renamed from: h  reason: contains not printable characters */
        private void m۱۸۸۵۰h() {
            this.f۱۵۸۹۳a.add(new Cc(Cd.m۱۸۸۳۶a(m۱۸۸۵۳b()), m۱۸۸۵۳b()));
        }

        /* renamed from: f  reason: contains not printable characters */
        private void m۱۸۸۴۷f(int nameIndex) {
            m۱۸۸۳۹a(-1, new Cc(m۱۸۸۴۱c(nameIndex), m۱۸۸۵۳b()));
        }

        /* renamed from: g  reason: contains not printable characters */
        private void m۱۸۸۴۸g() {
            m۱۸۸۳۹a(-1, new Cc(Cd.m۱۸۸۳۶a(m۱۸۸۵۳b()), m۱۸۸۵۳b()));
        }

        /* renamed from: c  reason: contains not printable characters */
        private Cf m۱۸۸۴۱c(int index) {
            if (m۱۸۸۴۳d(index)) {
                return Cd.f۱۵۸۹۱a[index].f۱۵۸۸۸a;
            }
            int dynamicTableIndex = m۱۸۸۳۸a(index - Cd.f۱۵۸۹۱a.length);
            if (dynamicTableIndex >= 0) {
                Cc[] cVarArr = this.f۱۵۸۹۷e;
                if (dynamicTableIndex < cVarArr.length) {
                    return cVarArr[dynamicTableIndex].f۱۵۸۸۸a;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        /* renamed from: d  reason: contains not printable characters */
        private boolean m۱۸۸۴۳d(int index) {
            return index >= 0 && index <= Cd.f۱۵۸۹۱a.length - 1;
        }

        /* JADX INFO: Multiple debug info for r1v8 int: [D('doubled' e.f0.i.c[]), D('index' int)] */
        /* renamed from: a  reason: contains not printable characters */
        private void m۱۸۸۳۹a(int index, Cc entry) {
            this.f۱۵۸۹۳a.add(entry);
            int delta = entry.f۱۵۸۹۰c;
            if (index != -1) {
                delta -= this.f۱۵۸۹۷e[m۱۸۸۳۸a(index)].f۱۵۸۹۰c;
            }
            int i = this.f۱۵۸۹۶d;
            if (delta > i) {
                m۱۸۸۴۴e();
                return;
            }
            int entriesEvicted = m۱۸۸۴۰b((this.f۱۵۹۰۰h + delta) - i);
            if (index == -1) {
                int i2 = this.f۱۵۸۹۹g + 1;
                Cc[] cVarArr = this.f۱۵۸۹۷e;
                if (i2 > cVarArr.length) {
                    Cc[] doubled = new Cc[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, doubled, cVarArr.length, cVarArr.length);
                    this.f۱۵۸۹۸f = this.f۱۵۸۹۷e.length - 1;
                    this.f۱۵۸۹۷e = doubled;
                }
                int index2 = this.f۱۵۸۹۸f;
                this.f۱۵۸۹۸f = index2 - 1;
                this.f۱۵۸۹۷e[index2] = entry;
                this.f۱۵۸۹۹g++;
            } else {
                this.f۱۵۸۹۷e[index + m۱۸۸۳۸a(index) + entriesEvicted] = entry;
            }
            this.f۱۵۹۰۰h += delta;
        }

        /* renamed from: f  reason: contains not printable characters */
        private int m۱۸۸۴۶f() {
            return this.f۱۵۸۹۴b.readByte() & 255;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public int m۱۸۸۵۱a(int firstByte, int prefixMask) {
            int prefix = firstByte & prefixMask;
            if (prefix < prefixMask) {
                return prefix;
            }
            int result = prefixMask;
            int shift = 0;
            while (true) {
                int b = m۱۸۸۴۶f();
                if ((b & 128) == 0) {
                    return result + (b << shift);
                }
                result += (b & 127) << shift;
                shift += 7;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public Cf m۱۸۸۵۳b() {
            int firstByte = m۱۸۸۴۶f();
            boolean huffmanDecode = (firstByte & 128) == 128;
            int length = m۱۸۸۵۱a(firstByte, 127);
            if (huffmanDecode) {
                return Cf.m۱۹۴۳۵a(Ck.m۱۹۰۰۸b().m۱۹۰۱۱a(this.f۱۵۸۹۴b.m۱۹۴۲۶f((long) length)));
            }
            return this.f۱۵۸۹۴b.m۱۹۴۲۰b((long) length);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static Map<Cf, Integer> m۱۸۸۳۷a() {
        Map<ByteString, Integer> result = new LinkedHashMap<>(f۱۵۸۹۱a.length);
        int i = 0;
        while (true) {
            Cc[] cVarArr = f۱۵۸۹۱a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(result);
            }
            if (!result.containsKey(cVarArr[i].f۱۵۸۸۸a)) {
                result.put(f۱۵۸۹۱a[i].f۱۵۸۸۸a, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.d$b  reason: invalid class name */
    public static final class Cb {

        /* renamed from: a  reason: contains not printable characters */
        private final Cc f۱۵۹۰۱a;

        /* renamed from: b  reason: contains not printable characters */
        private final boolean f۱۵۹۰۲b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۱۵۹۰۳c;

        /* renamed from: d  reason: contains not printable characters */
        private boolean f۱۵۹۰۴d;

        /* renamed from: e  reason: contains not printable characters */
        int f۱۵۹۰۵e;

        /* renamed from: f  reason: contains not printable characters */
        Cc[] f۱۵۹۰۶f;

        /* renamed from: g  reason: contains not printable characters */
        int f۱۵۹۰۷g;

        /* renamed from: h  reason: contains not printable characters */
        int f۱۵۹۰۸h;

        /* renamed from: i  reason: contains not printable characters */
        int f۱۵۹۰۹i;

        Cb(Cc out) {
            this(4096, true, out);
        }

        Cb(int headerTableSizeSetting, boolean useCompression, Cc out) {
            this.f۱۵۹۰۳c = Integer.MAX_VALUE;
            this.f۱۵۹۰۶f = new Cc[8];
            this.f۱۵۹۰۷g = this.f۱۵۹۰۶f.length - 1;
            this.f۱۵۹۰۸h = 0;
            this.f۱۵۹۰۹i = 0;
            this.f۱۵۹۰۵e = headerTableSizeSetting;
            this.f۱۵۹۰۲b = useCompression;
            this.f۱۵۹۰۱a = out;
        }

        /* renamed from: b  reason: contains not printable characters */
        private void m۱۸۸۵۸b() {
            Arrays.fill(this.f۱۵۹۰۶f, (Object) null);
            this.f۱۵۹۰۷g = this.f۱۵۹۰۶f.length - 1;
            this.f۱۵۹۰۸h = 0;
            this.f۱۵۹۰۹i = 0;
        }

        /* renamed from: b  reason: contains not printable characters */
        private int m۱۸۸۵۷b(int bytesToRecover) {
            int entriesToEvict = 0;
            if (bytesToRecover > 0) {
                int j = this.f۱۵۹۰۶f.length;
                while (true) {
                    j--;
                    if (j < this.f۱۵۹۰۷g || bytesToRecover <= 0) {
                        Cc[] cVarArr = this.f۱۵۹۰۶f;
                        int i = this.f۱۵۹۰۷g;
                        System.arraycopy(cVarArr, i + 1, cVarArr, i + 1 + entriesToEvict, this.f۱۵۹۰۸h);
                        Cc[] cVarArr2 = this.f۱۵۹۰۶f;
                        int i2 = this.f۱۵۹۰۷g;
                        Arrays.fill(cVarArr2, i2 + 1, i2 + 1 + entriesToEvict, (Object) null);
                        this.f۱۵۹۰۷g += entriesToEvict;
                    } else {
                        Cc[] cVarArr3 = this.f۱۵۹۰۶f;
                        bytesToRecover -= cVarArr3[j].f۱۵۸۹۰c;
                        this.f۱۵۹۰۹i -= cVarArr3[j].f۱۵۸۹۰c;
                        this.f۱۵۹۰۸h--;
                        entriesToEvict++;
                    }
                }
                Cc[] cVarArr4 = this.f۱۵۹۰۶f;
                int i3 = this.f۱۵۹۰۷g;
                System.arraycopy(cVarArr4, i3 + 1, cVarArr4, i3 + 1 + entriesToEvict, this.f۱۵۹۰۸h);
                Cc[] cVarArr22 = this.f۱۵۹۰۶f;
                int i22 = this.f۱۵۹۰۷g;
                Arrays.fill(cVarArr22, i22 + 1, i22 + 1 + entriesToEvict, (Object) null);
                this.f۱۵۹۰۷g += entriesToEvict;
            }
            return entriesToEvict;
        }

        /* JADX INFO: Multiple debug info for r1v3 int: [D('doubled' e.f0.i.c[]), D('index' int)] */
        /* renamed from: a  reason: contains not printable characters */
        private void m۱۸۸۵۶a(Cc entry) {
            int delta = entry.f۱۵۸۹۰c;
            int i = this.f۱۵۹۰۵e;
            if (delta > i) {
                m۱۸۸۵۸b();
                return;
            }
            m۱۸۸۵۷b((this.f۱۵۹۰۹i + delta) - i);
            int i2 = this.f۱۵۹۰۸h + 1;
            Cc[] cVarArr = this.f۱۵۹۰۶f;
            if (i2 > cVarArr.length) {
                Cc[] doubled = new Cc[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, doubled, cVarArr.length, cVarArr.length);
                this.f۱۵۹۰۷g = this.f۱۵۹۰۶f.length - 1;
                this.f۱۵۹۰۶f = doubled;
            }
            int index = this.f۱۵۹۰۷g;
            this.f۱۵۹۰۷g = index - 1;
            this.f۱۵۹۰۶f[index] = entry;
            this.f۱۵۹۰۸h++;
            this.f۱۵۹۰۹i += delta;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۸۶۲a(List<Cc> list) {
            if (this.f۱۵۹۰۴d) {
                int i = this.f۱۵۹۰۳c;
                if (i < this.f۱۵۹۰۵e) {
                    m۱۸۸۶۰a(i, 31, 32);
                }
                this.f۱۵۹۰۴d = false;
                this.f۱۵۹۰۳c = Integer.MAX_VALUE;
                m۱۸۸۶۰a(this.f۱۵۹۰۵e, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Cc header = list.get(i2);
                Cf name = header.f۱۵۸۸۸a.m۱۹۴۵۲g();
                Cf value = header.f۱۵۸۸۹b;
                int headerIndex = -1;
                int headerNameIndex = -1;
                Integer staticIndex = Cd.f۱۵۸۹۲b.get(name);
                if (staticIndex != null && (headerNameIndex = staticIndex.intValue() + 1) > 1 && headerNameIndex < 8) {
                    if (p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۵a(Cd.f۱۵۸۹۱a[headerNameIndex - 1].f۱۵۸۸۹b, value)) {
                        headerIndex = headerNameIndex;
                    } else if (p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۵a(Cd.f۱۵۸۹۱a[headerNameIndex].f۱۵۸۸۹b, value)) {
                        headerIndex = headerNameIndex + 1;
                    }
                }
                if (headerIndex == -1) {
                    int j = this.f۱۵۹۰۷g + 1;
                    int length = this.f۱۵۹۰۶f.length;
                    while (true) {
                        if (j >= length) {
                            break;
                        }
                        if (p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۵a(this.f۱۵۹۰۶f[j].f۱۵۸۸۸a, name)) {
                            if (p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۵a(this.f۱۵۹۰۶f[j].f۱۵۸۸۹b, value)) {
                                headerIndex = (j - this.f۱۵۹۰۷g) + Cd.f۱۵۸۹۱a.length;
                                break;
                            } else if (headerNameIndex == -1) {
                                headerNameIndex = (j - this.f۱۵۹۰۷g) + Cd.f۱۵۸۹۱a.length;
                            }
                        }
                        j++;
                    }
                }
                if (headerIndex != -1) {
                    m۱۸۸۶۰a(headerIndex, 127, 128);
                } else if (headerNameIndex == -1) {
                    this.f۱۵۹۰۱a.writeByte(64);
                    m۱۸۸۶۱a(name);
                    m۱۸۸۶۱a(value);
                    m۱۸۸۵۶a(header);
                } else if (!name.m۱۹۴۴۷b(Cc.f۱۵۸۸۲d) || Cc.f۱۵۸۸۷i.equals(name)) {
                    m۱۸۸۶۰a(headerNameIndex, 63, 64);
                    m۱۸۸۶۱a(value);
                    m۱۸۸۵۶a(header);
                } else {
                    m۱۸۸۶۰a(headerNameIndex, 15, 0);
                    m۱۸۸۶۱a(value);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۸۶۰a(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.f۱۵۹۰۱a.writeByte(bits | value);
                return;
            }
            this.f۱۵۹۰۱a.writeByte(bits | prefixMask);
            int value2 = value - prefixMask;
            while (value2 >= 128) {
                this.f۱۵۹۰۱a.writeByte((value2 & 127) | 128);
                value2 >>>= 7;
            }
            this.f۱۵۹۰۱a.writeByte(value2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۸۶۱a(Cf data) {
            if (!this.f۱۵۹۰۲b || Ck.m۱۹۰۰۸b().m۱۹۰۰۹a(data) >= data.m۱۹۴۵۱f()) {
                m۱۸۸۶۰a(data.m۱۹۴۵۱f(), 127, 0);
                this.f۱۵۹۰۱a.m۱۹۳۷۲a(data);
                return;
            }
            Cc huffmanBuffer = new Cc();
            Ck.m۱۹۰۰۸b().m۱۹۰۱۰a(data, huffmanBuffer);
            Cf huffmanBytes = huffmanBuffer.m۱۹۴۰۸o();
            m۱۸۸۶۰a(huffmanBytes.m۱۹۴۵۱f(), 127, 128);
            this.f۱۵۹۰۱a.m۱۹۳۷۲a(huffmanBytes);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۸۵۹a(int headerTableSizeSetting) {
            int effectiveHeaderTableSize = Math.min(headerTableSizeSetting, 16384);
            int i = this.f۱۵۹۰۵e;
            if (i != effectiveHeaderTableSize) {
                if (effectiveHeaderTableSize < i) {
                    this.f۱۵۹۰۳c = Math.min(this.f۱۵۹۰۳c, effectiveHeaderTableSize);
                }
                this.f۱۵۹۰۴d = true;
                this.f۱۵۹۰۵e = effectiveHeaderTableSize;
                m۱۸۸۵۵a();
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۸۸۵۵a() {
            int i = this.f۱۵۹۰۵e;
            int i2 = this.f۱۵۹۰۹i;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m۱۸۸۵۸b();
            } else {
                m۱۸۸۵۷b(i2 - i);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static Cf m۱۸۸۳۶a(Cf name) {
        int length = name.m۱۹۴۵۱f();
        for (int i = 0; i < length; i++) {
            byte c = name.m۱۹۴۳۹a(i);
            if (c >= 65 && c <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.m۱۹۴۵۴i());
            }
        }
        return name;
    }
}
