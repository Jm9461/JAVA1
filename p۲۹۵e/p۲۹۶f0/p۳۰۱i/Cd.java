package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Header;
import okio.ByteString;
import p۳۰۵f.Cc;
import p۳۰۵f.Cf;
import p۳۰۵f.Cl;
import p۳۰۵f.InterfaceCe;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.i.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cd {

    /* renamed from: a, reason: contains not printable characters */
    static final Cc[] f۱۵۸۹۱a = {new Cc(Cc.f۱۵۸۸۷i, ""), new Cc(Cc.f۱۵۸۸۴f, "GET"), new Cc(Cc.f۱۵۸۸۴f, "POST"), new Cc(Cc.f۱۵۸۸۵g, "/"), new Cc(Cc.f۱۵۸۸۵g, "/index.html"), new Cc(Cc.f۱۵۸۸۶h, "http"), new Cc(Cc.f۱۵۸۸۶h, "https"), new Cc(Cc.f۱۵۸۸۳e, "200"), new Cc(Cc.f۱۵۸۸۳e, "204"), new Cc(Cc.f۱۵۸۸۳e, "206"), new Cc(Cc.f۱۵۸۸۳e, "304"), new Cc(Cc.f۱۵۸۸۳e, "400"), new Cc(Cc.f۱۵۸۸۳e, "404"), new Cc(Cc.f۱۵۸۸۳e, "500"), new Cc("accept-charset", ""), new Cc("accept-encoding", "gzip, deflate"), new Cc("accept-language", ""), new Cc("accept-ranges", ""), new Cc("accept", ""), new Cc("access-control-allow-origin", ""), new Cc("age", ""), new Cc("allow", ""), new Cc("authorization", ""), new Cc("cache-control", ""), new Cc("content-disposition", ""), new Cc("content-encoding", ""), new Cc("content-language", ""), new Cc("content-length", ""), new Cc("content-location", ""), new Cc("content-range", ""), new Cc("content-type", ""), new Cc("cookie", ""), new Cc("date", ""), new Cc("etag", ""), new Cc("expect", ""), new Cc("expires", ""), new Cc("from", ""), new Cc("host", ""), new Cc("if-match", ""), new Cc("if-modified-since", ""), new Cc("if-none-match", ""), new Cc("if-range", ""), new Cc("if-unmodified-since", ""), new Cc("last-modified", ""), new Cc("link", ""), new Cc("location", ""), new Cc("max-forwards", ""), new Cc("proxy-authenticate", ""), new Cc("proxy-authorization", ""), new Cc("range", ""), new Cc("referer", ""), new Cc("refresh", ""), new Cc("retry-after", ""), new Cc("server", ""), new Cc("set-cookie", ""), new Cc("strict-transport-security", ""), new Cc("transfer-encoding", ""), new Cc("user-agent", ""), new Cc("vary", ""), new Cc("via", ""), new Cc("www-authenticate", "")};

    /* renamed from: b, reason: contains not printable characters */
    static final Map<Cf, Integer> f۱۵۸۹۲b = m۱۶۷۵۸a();

    /* renamed from: e.f0.i.d$a */
    static final class a {

        /* renamed from: a, reason: contains not printable characters */
        private final List<Cc> f۱۵۸۹۳a;

        /* renamed from: b, reason: contains not printable characters */
        private final InterfaceCe f۱۵۸۹۴b;

        /* renamed from: c, reason: contains not printable characters */
        private final int f۱۵۸۹۵c;

        /* renamed from: d, reason: contains not printable characters */
        private int f۱۵۸۹۶d;

        /* renamed from: e, reason: contains not printable characters */
        Cc[] f۱۵۸۹۷e;

        /* renamed from: f, reason: contains not printable characters */
        int f۱۵۸۹۸f;

        /* renamed from: g, reason: contains not printable characters */
        int f۱۵۸۹۹g;

        /* renamed from: h, reason: contains not printable characters */
        int f۱۵۹۰۰h;

        a(int headerTableSizeSetting, InterfaceCs source) {
            this(headerTableSizeSetting, headerTableSizeSetting, source);
        }

        a(int headerTableSizeSetting, int maxDynamicTableByteCount, InterfaceCs source) {
            this.f۱۵۸۹۳a = new ArrayList();
            this.f۱۵۸۹۷e = new Cc[8];
            this.f۱۵۸۹۸f = this.f۱۵۸۹۷e.length - 1;
            this.f۱۵۸۹۹g = 0;
            this.f۱۵۹۰۰h = 0;
            this.f۱۵۸۹۵c = headerTableSizeSetting;
            this.f۱۵۸۹۶d = maxDynamicTableByteCount;
            this.f۱۵۸۹۴b = Cl.m۱۷۴۰۳a(source);
        }

        /* renamed from: d, reason: contains not printable characters */
        private void m۱۶۷۶۳d() {
            int i = this.f۱۵۸۹۶d;
            int i2 = this.f۱۵۹۰۰h;
            if (i < i2) {
                if (i == 0) {
                    m۱۶۷۶۵e();
                } else {
                    m۱۶۷۶۱b(i2 - i);
                }
            }
        }

        /* renamed from: e, reason: contains not printable characters */
        private void m۱۶۷۶۵e() {
            Arrays.fill(this.f۱۵۸۹۷e, (Object) null);
            this.f۱۵۸۹۸f = this.f۱۵۸۹۷e.length - 1;
            this.f۱۵۸۹۹g = 0;
            this.f۱۵۹۰۰h = 0;
        }

        /* renamed from: b, reason: contains not printable characters */
        private int m۱۶۷۶۱b(int bytesToRecover) {
            int entriesToEvict = 0;
            if (bytesToRecover > 0) {
                int j = this.f۱۵۸۹۷e.length;
                while (true) {
                    j--;
                    if (j < this.f۱۵۸۹۸f || bytesToRecover <= 0) {
                        break;
                    }
                    Cc[] ccArr = this.f۱۵۸۹۷e;
                    bytesToRecover -= ccArr[j].f۱۵۸۹۰c;
                    this.f۱۵۹۰۰h -= ccArr[j].f۱۵۸۹۰c;
                    this.f۱۵۸۹۹g--;
                    entriesToEvict++;
                }
                Cc[] ccArr2 = this.f۱۵۸۹۷e;
                int i = this.f۱۵۸۹۸f;
                System.arraycopy(ccArr2, i + 1, ccArr2, i + 1 + entriesToEvict, this.f۱۵۸۹۹g);
                this.f۱۵۸۹۸f += entriesToEvict;
            }
            return entriesToEvict;
        }

        /* renamed from: c, reason: contains not printable characters */
        void m۱۶۷۷۵c() {
            while (!this.f۱۵۸۹۴b.mo۱۷۴۴۸i()) {
                int b2 = this.f۱۵۸۹۴b.readByte() & 255;
                if (b2 != 128) {
                    if ((b2 & 128) == 128) {
                        int index = m۱۶۷۷۲a(b2, 127);
                        m۱۶۷۶۶e(index - 1);
                    } else if (b2 == 64) {
                        m۱۶۷۶۹g();
                    } else if ((b2 & 64) == 64) {
                        int index2 = m۱۶۷۷۲a(b2, 63);
                        m۱۶۷۶۸f(index2 - 1);
                    } else if ((b2 & 32) == 32) {
                        this.f۱۵۸۹۶d = m۱۶۷۷۲a(b2, 31);
                        int i = this.f۱۵۸۹۶d;
                        if (i < 0 || i > this.f۱۵۸۹۵c) {
                            throw new IOException("Invalid dynamic table size update " + this.f۱۵۸۹۶d);
                        }
                        m۱۶۷۶۳d();
                    } else if (b2 == 16 || b2 == 0) {
                        m۱۶۷۷۱h();
                    } else {
                        int index3 = m۱۶۷۷۲a(b2, 15);
                        m۱۶۷۷۰g(index3 - 1);
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public List<Cc> m۱۶۷۷۳a() {
            List<Header> result = new ArrayList<>(this.f۱۵۸۹۳a);
            this.f۱۵۸۹۳a.clear();
            return result;
        }

        /* renamed from: e, reason: contains not printable characters */
        private void m۱۶۷۶۶e(int index) {
            if (m۱۶۷۶۴d(index)) {
                Cc staticEntry = Cd.f۱۵۸۹۱a[index];
                this.f۱۵۸۹۳a.add(staticEntry);
                return;
            }
            int dynamicTableIndex = m۱۶۷۵۹a(index - Cd.f۱۵۸۹۱a.length);
            if (dynamicTableIndex >= 0) {
                Cc[] ccArr = this.f۱۵۸۹۷e;
                if (dynamicTableIndex < ccArr.length) {
                    this.f۱۵۸۹۳a.add(ccArr[dynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        /* renamed from: a, reason: contains not printable characters */
        private int m۱۶۷۵۹a(int index) {
            return this.f۱۵۸۹۸f + 1 + index;
        }

        /* renamed from: g, reason: contains not printable characters */
        private void m۱۶۷۷۰g(int index) {
            Cf name = m۱۶۷۶۲c(index);
            Cf value = m۱۶۷۷۴b();
            this.f۱۵۸۹۳a.add(new Cc(name, value));
        }

        /* renamed from: h, reason: contains not printable characters */
        private void m۱۶۷۷۱h() {
            Cf name = Cd.m۱۶۷۵۷a(m۱۶۷۷۴b());
            Cf value = m۱۶۷۷۴b();
            this.f۱۵۸۹۳a.add(new Cc(name, value));
        }

        /* renamed from: f, reason: contains not printable characters */
        private void m۱۶۷۶۸f(int nameIndex) {
            Cf name = m۱۶۷۶۲c(nameIndex);
            Cf value = m۱۶۷۷۴b();
            m۱۶۷۶۰a(-1, new Cc(name, value));
        }

        /* renamed from: g, reason: contains not printable characters */
        private void m۱۶۷۶۹g() {
            Cf name = Cd.m۱۶۷۵۷a(m۱۶۷۷۴b());
            Cf value = m۱۶۷۷۴b();
            m۱۶۷۶۰a(-1, new Cc(name, value));
        }

        /* renamed from: c, reason: contains not printable characters */
        private Cf m۱۶۷۶۲c(int index) {
            if (m۱۶۷۶۴d(index)) {
                return Cd.f۱۵۸۹۱a[index].f۱۵۸۸۸a;
            }
            int dynamicTableIndex = m۱۶۷۵۹a(index - Cd.f۱۵۸۹۱a.length);
            if (dynamicTableIndex >= 0) {
                Cc[] ccArr = this.f۱۵۸۹۷e;
                if (dynamicTableIndex < ccArr.length) {
                    return ccArr[dynamicTableIndex].f۱۵۸۸۸a;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        /* renamed from: d, reason: contains not printable characters */
        private boolean m۱۶۷۶۴d(int index) {
            return index >= 0 && index <= Cd.f۱۵۸۹۱a.length - 1;
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۱۶۷۶۰a(int index, Cc entry) {
            this.f۱۵۸۹۳a.add(entry);
            int delta = entry.f۱۵۸۹۰c;
            if (index != -1) {
                delta -= this.f۱۵۸۹۷e[m۱۶۷۵۹a(index)].f۱۵۸۹۰c;
            }
            int i = this.f۱۵۸۹۶d;
            if (delta > i) {
                m۱۶۷۶۵e();
                return;
            }
            int bytesToRecover = (this.f۱۵۹۰۰h + delta) - i;
            int entriesEvicted = m۱۶۷۶۱b(bytesToRecover);
            if (index == -1) {
                int i2 = this.f۱۵۸۹۹g + 1;
                Cc[] ccArr = this.f۱۵۸۹۷e;
                if (i2 > ccArr.length) {
                    Cc[] doubled = new Cc[ccArr.length * 2];
                    System.arraycopy(ccArr, 0, doubled, ccArr.length, ccArr.length);
                    this.f۱۵۸۹۸f = this.f۱۵۸۹۷e.length - 1;
                    this.f۱۵۸۹۷e = doubled;
                }
                int index2 = this.f۱۵۸۹۸f;
                this.f۱۵۸۹۸f = index2 - 1;
                this.f۱۵۸۹۷e[index2] = entry;
                this.f۱۵۸۹۹g++;
            } else {
                this.f۱۵۸۹۷e[index + m۱۶۷۵۹a(index) + entriesEvicted] = entry;
            }
            this.f۱۵۹۰۰h += delta;
        }

        /* renamed from: f, reason: contains not printable characters */
        private int m۱۶۷۶۷f() {
            return this.f۱۵۸۹۴b.readByte() & 255;
        }

        /* renamed from: a, reason: contains not printable characters */
        int m۱۶۷۷۲a(int firstByte, int prefixMask) {
            int prefix = firstByte & prefixMask;
            if (prefix < prefixMask) {
                return prefix;
            }
            int result = prefixMask;
            int shift = 0;
            while (true) {
                int b2 = m۱۶۷۶۷f();
                if ((b2 & 128) != 0) {
                    result += (b2 & 127) << shift;
                    shift += 7;
                } else {
                    return result + (b2 << shift);
                }
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        Cf m۱۶۷۷۴b() {
            int firstByte = m۱۶۷۶۷f();
            boolean huffmanDecode = (firstByte & 128) == 128;
            int length = m۱۶۷۷۲a(firstByte, 127);
            if (huffmanDecode) {
                return Cf.m۱۷۳۵۸a(Ck.m۱۶۹۲۹b().m۱۶۹۳۲a(this.f۱۵۸۹۴b.mo۱۷۴۴۵f(length)));
            }
            return this.f۱۵۸۹۴b.mo۱۷۴۳۸b(length);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static Map<Cf, Integer> m۱۶۷۵۸a() {
        Map<ByteString, Integer> result = new LinkedHashMap<>(f۱۵۸۹۱a.length);
        int i = 0;
        while (true) {
            Cc[] ccArr = f۱۵۸۹۱a;
            if (i < ccArr.length) {
                if (!result.containsKey(ccArr[i].f۱۵۸۸۸a)) {
                    result.put(f۱۵۸۹۱a[i].f۱۵۸۸۸a, Integer.valueOf(i));
                }
                i++;
            } else {
                return Collections.unmodifiableMap(result);
            }
        }
    }

    /* renamed from: e.f0.i.d$b */
    static final class b {

        /* renamed from: a, reason: contains not printable characters */
        private final Cc f۱۵۹۰۱a;

        /* renamed from: b, reason: contains not printable characters */
        private final boolean f۱۵۹۰۲b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۱۵۹۰۳c;

        /* renamed from: d, reason: contains not printable characters */
        private boolean f۱۵۹۰۴d;

        /* renamed from: e, reason: contains not printable characters */
        int f۱۵۹۰۵e;

        /* renamed from: f, reason: contains not printable characters */
        Cc[] f۱۵۹۰۶f;

        /* renamed from: g, reason: contains not printable characters */
        int f۱۵۹۰۷g;

        /* renamed from: h, reason: contains not printable characters */
        int f۱۵۹۰۸h;

        /* renamed from: i, reason: contains not printable characters */
        int f۱۵۹۰۹i;

        b(Cc out) {
            this(4096, true, out);
        }

        b(int headerTableSizeSetting, boolean useCompression, Cc out) {
            this.f۱۵۹۰۳c = Integer.MAX_VALUE;
            this.f۱۵۹۰۶f = new Cc[8];
            this.f۱۵۹۰۷g = this.f۱۵۹۰۶f.length - 1;
            this.f۱۵۹۰۸h = 0;
            this.f۱۵۹۰۹i = 0;
            this.f۱۵۹۰۵e = headerTableSizeSetting;
            this.f۱۵۹۰۲b = useCompression;
            this.f۱۵۹۰۱a = out;
        }

        /* renamed from: b, reason: contains not printable characters */
        private void m۱۶۷۷۹b() {
            Arrays.fill(this.f۱۵۹۰۶f, (Object) null);
            this.f۱۵۹۰۷g = this.f۱۵۹۰۶f.length - 1;
            this.f۱۵۹۰۸h = 0;
            this.f۱۵۹۰۹i = 0;
        }

        /* renamed from: b, reason: contains not printable characters */
        private int m۱۶۷۷۸b(int bytesToRecover) {
            int entriesToEvict = 0;
            if (bytesToRecover > 0) {
                int j = this.f۱۵۹۰۶f.length;
                while (true) {
                    j--;
                    if (j < this.f۱۵۹۰۷g || bytesToRecover <= 0) {
                        break;
                    }
                    Cc[] ccArr = this.f۱۵۹۰۶f;
                    bytesToRecover -= ccArr[j].f۱۵۸۹۰c;
                    this.f۱۵۹۰۹i -= ccArr[j].f۱۵۸۹۰c;
                    this.f۱۵۹۰۸h--;
                    entriesToEvict++;
                }
                Cc[] ccArr2 = this.f۱۵۹۰۶f;
                int i = this.f۱۵۹۰۷g;
                System.arraycopy(ccArr2, i + 1, ccArr2, i + 1 + entriesToEvict, this.f۱۵۹۰۸h);
                Cc[] ccArr3 = this.f۱۵۹۰۶f;
                int i2 = this.f۱۵۹۰۷g;
                Arrays.fill(ccArr3, i2 + 1, i2 + 1 + entriesToEvict, (Object) null);
                this.f۱۵۹۰۷g += entriesToEvict;
            }
            return entriesToEvict;
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۱۶۷۷۷a(Cc entry) {
            int delta = entry.f۱۵۸۹۰c;
            int i = this.f۱۵۹۰۵e;
            if (delta > i) {
                m۱۶۷۷۹b();
                return;
            }
            int bytesToRecover = (this.f۱۵۹۰۹i + delta) - i;
            m۱۶۷۷۸b(bytesToRecover);
            int i2 = this.f۱۵۹۰۸h + 1;
            Cc[] ccArr = this.f۱۵۹۰۶f;
            if (i2 > ccArr.length) {
                Cc[] doubled = new Cc[ccArr.length * 2];
                System.arraycopy(ccArr, 0, doubled, ccArr.length, ccArr.length);
                this.f۱۵۹۰۷g = this.f۱۵۹۰۶f.length - 1;
                this.f۱۵۹۰۶f = doubled;
            }
            int index = this.f۱۵۹۰۷g;
            this.f۱۵۹۰۷g = index - 1;
            this.f۱۵۹۰۶f[index] = entry;
            this.f۱۵۹۰۸h++;
            this.f۱۵۹۰۹i += delta;
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۶۷۸۳a(List<Cc> list) {
            if (this.f۱۵۹۰۴d) {
                int i = this.f۱۵۹۰۳c;
                if (i < this.f۱۵۹۰۵e) {
                    m۱۶۷۸۱a(i, 31, 32);
                }
                this.f۱۵۹۰۴d = false;
                this.f۱۵۹۰۳c = Integer.MAX_VALUE;
                m۱۶۷۸۱a(this.f۱۵۹۰۵e, 31, 32);
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Cc header = list.get(i2);
                Cf name = header.f۱۵۸۸۸a.mo۱۷۴۷۲g();
                Cf value = header.f۱۵۸۸۹b;
                int headerIndex = -1;
                int headerNameIndex = -1;
                Integer staticIndex = Cd.f۱۵۸۹۲b.get(name);
                if (staticIndex != null && (headerNameIndex = staticIndex.intValue() + 1) > 1 && headerNameIndex < 8) {
                    if (p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۶a(Cd.f۱۵۸۹۱a[headerNameIndex - 1].f۱۵۸۸۹b, value)) {
                        headerIndex = headerNameIndex;
                    } else if (p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۶a(Cd.f۱۵۸۹۱a[headerNameIndex].f۱۵۸۸۹b, value)) {
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
                        if (p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۶a(this.f۱۵۹۰۶f[j].f۱۵۸۸۸a, name)) {
                            if (p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۴۶a(this.f۱۵۹۰۶f[j].f۱۵۸۸۹b, value)) {
                                headerIndex = (j - this.f۱۵۹۰۷g) + Cd.f۱۵۸۹۱a.length;
                                break;
                            } else if (headerNameIndex == -1) {
                                headerNameIndex = (j - this.f۱۵۹۰۷g) + Cd.f۱۵۸۹۱a.length;
                            }
                        }
                        j++;
                    }
                }
                if (headerIndex == -1) {
                    if (headerNameIndex == -1) {
                        this.f۱۵۹۰۱a.writeByte(64);
                        m۱۶۷۸۲a(name);
                        m۱۶۷۸۲a(value);
                        m۱۶۷۷۷a(header);
                    } else if (!name.m۱۷۳۷۰b(Cc.f۱۵۸۸۲d) || Cc.f۱۵۸۸۷i.equals(name)) {
                        m۱۶۷۸۱a(headerNameIndex, 63, 64);
                        m۱۶۷۸۲a(value);
                        m۱۶۷۷۷a(header);
                    } else {
                        m۱۶۷۸۱a(headerNameIndex, 15, 0);
                        m۱۶۷۸۲a(value);
                    }
                } else {
                    m۱۶۷۸۱a(headerIndex, 127, 128);
                }
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۶۷۸۱a(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.f۱۵۹۰۱a.writeByte(bits | value);
                return;
            }
            this.f۱۵۹۰۱a.writeByte(bits | prefixMask);
            int value2 = value - prefixMask;
            while (value2 >= 128) {
                int b2 = value2 & 127;
                this.f۱۵۹۰۱a.writeByte(b2 | 128);
                value2 >>>= 7;
            }
            this.f۱۵۹۰۱a.writeByte(value2);
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۶۷۸۲a(Cf data) {
            if (this.f۱۵۹۰۲b && Ck.m۱۶۹۲۹b().m۱۶۹۳۰a(data) < data.mo۱۷۴۷۱f()) {
                Cc huffmanBuffer = new Cc();
                Ck.m۱۶۹۲۹b().m۱۶۹۳۱a(data, huffmanBuffer);
                Cf huffmanBytes = huffmanBuffer.m۱۷۳۳۰o();
                m۱۶۷۸۱a(huffmanBytes.mo۱۷۴۷۱f(), 127, 128);
                this.f۱۵۹۰۱a.m۱۷۲۹۴a(huffmanBytes);
                return;
            }
            m۱۶۷۸۱a(data.mo۱۷۴۷۱f(), 127, 0);
            this.f۱۵۹۰۱a.m۱۷۲۹۴a(data);
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۶۷۸۰a(int headerTableSizeSetting) {
            int effectiveHeaderTableSize = Math.min(headerTableSizeSetting, 16384);
            int i = this.f۱۵۹۰۵e;
            if (i == effectiveHeaderTableSize) {
                return;
            }
            if (effectiveHeaderTableSize < i) {
                this.f۱۵۹۰۳c = Math.min(this.f۱۵۹۰۳c, effectiveHeaderTableSize);
            }
            this.f۱۵۹۰۴d = true;
            this.f۱۵۹۰۵e = effectiveHeaderTableSize;
            m۱۶۷۷۶a();
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۱۶۷۷۶a() {
            int i = this.f۱۵۹۰۵e;
            int i2 = this.f۱۵۹۰۹i;
            if (i < i2) {
                if (i == 0) {
                    m۱۶۷۷۹b();
                } else {
                    m۱۶۷۷۸b(i2 - i);
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static Cf m۱۶۷۵۷a(Cf name) {
        int length = name.mo۱۷۴۷۱f();
        for (int i = 0; i < length; i++) {
            byte c2 = name.mo۱۷۴۶۱a(i);
            if (c2 >= 65 && c2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.mo۱۷۴۷۴i());
            }
        }
        return name;
    }
}
