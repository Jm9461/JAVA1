package e.f0.i;

import f.c;
import f.e;
import f.f;
import f.l;
import f.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Header;
import okio.ByteString;

/* access modifiers changed from: package-private */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    static final c[] f۳۸۸۴a = {new c(c.i, ""), new c(c.f۳۸۷۸f, "GET"), new c(c.f۳۸۷۸f, "POST"), new c(c.f۳۸۷۹g, "/"), new c(c.f۳۸۷۹g, "/index.html"), new c(c.f۳۸۸۰h, "http"), new c(c.f۳۸۸۰h, "https"), new c(c.f۳۸۷۷e, "200"), new c(c.f۳۸۷۷e, "204"), new c(c.f۳۸۷۷e, "206"), new c(c.f۳۸۷۷e, "304"), new c(c.f۳۸۷۷e, "400"), new c(c.f۳۸۷۷e, "404"), new c(c.f۳۸۷۷e, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};

    /* renamed from: b  reason: collision with root package name */
    static final Map<f, Integer> f۳۸۸۵b = a();

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f۳۸۸۶a;

        /* renamed from: b  reason: collision with root package name */
        private final e f۳۸۸۷b;

        /* renamed from: c  reason: collision with root package name */
        private final int f۳۸۸۸c;

        /* renamed from: d  reason: collision with root package name */
        private int f۳۸۸۹d;

        /* renamed from: e  reason: collision with root package name */
        c[] f۳۸۹۰e;

        /* renamed from: f  reason: collision with root package name */
        int f۳۸۹۱f;

        /* renamed from: g  reason: collision with root package name */
        int f۳۸۹۲g;

        /* renamed from: h  reason: collision with root package name */
        int f۳۸۹۳h;

        a(int headerTableSizeSetting, s source) {
            this(headerTableSizeSetting, headerTableSizeSetting, source);
        }

        a(int headerTableSizeSetting, int maxDynamicTableByteCount, s source) {
            this.f۳۸۸۶a = new ArrayList();
            this.f۳۸۹۰e = new c[8];
            this.f۳۸۹۱f = this.f۳۸۹۰e.length - 1;
            this.f۳۸۹۲g = 0;
            this.f۳۸۹۳h = 0;
            this.f۳۸۸۸c = headerTableSizeSetting;
            this.f۳۸۸۹d = maxDynamicTableByteCount;
            this.f۳۸۸۷b = l.a(source);
        }

        private void d() {
            int i = this.f۳۸۸۹d;
            int i2 = this.f۳۸۹۳h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                e();
            } else {
                b(i2 - i);
            }
        }

        private void e() {
            Arrays.fill(this.f۳۸۹۰e, (Object) null);
            this.f۳۸۹۱f = this.f۳۸۹۰e.length - 1;
            this.f۳۸۹۲g = 0;
            this.f۳۸۹۳h = 0;
        }

        private int b(int bytesToRecover) {
            int entriesToEvict = 0;
            if (bytesToRecover > 0) {
                int j = this.f۳۸۹۰e.length;
                while (true) {
                    j--;
                    if (j < this.f۳۸۹۱f || bytesToRecover <= 0) {
                        c[] cVarArr = this.f۳۸۹۰e;
                        int i = this.f۳۸۹۱f;
                        System.arraycopy(cVarArr, i + 1, cVarArr, i + 1 + entriesToEvict, this.f۳۸۹۲g);
                        this.f۳۸۹۱f += entriesToEvict;
                    } else {
                        c[] cVarArr2 = this.f۳۸۹۰e;
                        bytesToRecover -= cVarArr2[j].f۳۸۸۳c;
                        this.f۳۸۹۳h -= cVarArr2[j].f۳۸۸۳c;
                        this.f۳۸۹۲g--;
                        entriesToEvict++;
                    }
                }
                c[] cVarArr3 = this.f۳۸۹۰e;
                int i2 = this.f۳۸۹۱f;
                System.arraycopy(cVarArr3, i2 + 1, cVarArr3, i2 + 1 + entriesToEvict, this.f۳۸۹۲g);
                this.f۳۸۹۱f += entriesToEvict;
            }
            return entriesToEvict;
        }

        /* access modifiers changed from: package-private */
        public void c() {
            while (!this.f۳۸۸۷b.i()) {
                int b2 = this.f۳۸۸۷b.readByte() & 255;
                if (b2 == 128) {
                    throw new IOException("index == 0");
                } else if ((b2 & 128) == 128) {
                    e(a(b2, 127) - 1);
                } else if (b2 == 64) {
                    g();
                } else if ((b2 & 64) == 64) {
                    f(a(b2, 63) - 1);
                } else if ((b2 & 32) == 32) {
                    this.f۳۸۸۹d = a(b2, 31);
                    int i = this.f۳۸۸۹d;
                    if (i < 0 || i > this.f۳۸۸۸c) {
                        throw new IOException("Invalid dynamic table size update " + this.f۳۸۸۹d);
                    }
                    d();
                } else if (b2 == 16 || b2 == 0) {
                    h();
                } else {
                    g(a(b2, 15) - 1);
                }
            }
        }

        public List<c> a() {
            List<Header> result = new ArrayList<>(this.f۳۸۸۶a);
            this.f۳۸۸۶a.clear();
            return result;
        }

        private void e(int index) {
            if (d(index)) {
                this.f۳۸۸۶a.add(d.f۳۸۸۴a[index]);
                return;
            }
            int dynamicTableIndex = a(index - d.f۳۸۸۴a.length);
            if (dynamicTableIndex >= 0) {
                c[] cVarArr = this.f۳۸۹۰e;
                if (dynamicTableIndex < cVarArr.length) {
                    this.f۳۸۸۶a.add(cVarArr[dynamicTableIndex]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private int a(int index) {
            return this.f۳۸۹۱f + 1 + index;
        }

        private void g(int index) {
            this.f۳۸۸۶a.add(new c(c(index), b()));
        }

        private void h() {
            this.f۳۸۸۶a.add(new c(d.a(b()), b()));
        }

        private void f(int nameIndex) {
            a(-1, new c(c(nameIndex), b()));
        }

        private void g() {
            a(-1, new c(d.a(b()), b()));
        }

        private f c(int index) {
            if (d(index)) {
                return d.f۳۸۸۴a[index].f۳۸۸۱a;
            }
            int dynamicTableIndex = a(index - d.f۳۸۸۴a.length);
            if (dynamicTableIndex >= 0) {
                c[] cVarArr = this.f۳۸۹۰e;
                if (dynamicTableIndex < cVarArr.length) {
                    return cVarArr[dynamicTableIndex].f۳۸۸۱a;
                }
            }
            throw new IOException("Header index too large " + (index + 1));
        }

        private boolean d(int index) {
            return index >= 0 && index <= d.f۳۸۸۴a.length - 1;
        }

        /* JADX INFO: Multiple debug info for r1v8 int: [D('doubled' e.f0.i.c[]), D('index' int)] */
        private void a(int index, c entry) {
            this.f۳۸۸۶a.add(entry);
            int delta = entry.f۳۸۸۳c;
            if (index != -1) {
                delta -= this.f۳۸۹۰e[a(index)].f۳۸۸۳c;
            }
            int i = this.f۳۸۸۹d;
            if (delta > i) {
                e();
                return;
            }
            int entriesEvicted = b((this.f۳۸۹۳h + delta) - i);
            if (index == -1) {
                int i2 = this.f۳۸۹۲g + 1;
                c[] cVarArr = this.f۳۸۹۰e;
                if (i2 > cVarArr.length) {
                    c[] doubled = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, doubled, cVarArr.length, cVarArr.length);
                    this.f۳۸۹۱f = this.f۳۸۹۰e.length - 1;
                    this.f۳۸۹۰e = doubled;
                }
                int index2 = this.f۳۸۹۱f;
                this.f۳۸۹۱f = index2 - 1;
                this.f۳۸۹۰e[index2] = entry;
                this.f۳۸۹۲g++;
            } else {
                this.f۳۸۹۰e[index + a(index) + entriesEvicted] = entry;
            }
            this.f۳۸۹۳h += delta;
        }

        private int f() {
            return this.f۳۸۸۷b.readByte() & 255;
        }

        /* access modifiers changed from: package-private */
        public int a(int firstByte, int prefixMask) {
            int prefix = firstByte & prefixMask;
            if (prefix < prefixMask) {
                return prefix;
            }
            int result = prefixMask;
            int shift = 0;
            while (true) {
                int b2 = f();
                if ((b2 & 128) == 0) {
                    return result + (b2 << shift);
                }
                result += (b2 & 127) << shift;
                shift += 7;
            }
        }

        /* access modifiers changed from: package-private */
        public f b() {
            int firstByte = f();
            boolean huffmanDecode = (firstByte & 128) == 128;
            int length = a(firstByte, 127);
            if (huffmanDecode) {
                return f.a(k.b().a(this.f۳۸۸۷b.f((long) length)));
            }
            return this.f۳۸۸۷b.b((long) length);
        }
    }

    private static Map<f, Integer> a() {
        Map<ByteString, Integer> result = new LinkedHashMap<>(f۳۸۸۴a.length);
        int i = 0;
        while (true) {
            c[] cVarArr = f۳۸۸۴a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(result);
            }
            if (!result.containsKey(cVarArr[i].f۳۸۸۱a)) {
                result.put(f۳۸۸۴a[i].f۳۸۸۱a, Integer.valueOf(i));
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f۳۸۹۴a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f۳۸۹۵b;

        /* renamed from: c  reason: collision with root package name */
        private int f۳۸۹۶c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f۳۸۹۷d;

        /* renamed from: e  reason: collision with root package name */
        int f۳۸۹۸e;

        /* renamed from: f  reason: collision with root package name */
        c[] f۳۸۹۹f;

        /* renamed from: g  reason: collision with root package name */
        int f۳۹۰۰g;

        /* renamed from: h  reason: collision with root package name */
        int f۳۹۰۱h;
        int i;

        b(c out) {
            this(4096, true, out);
        }

        b(int headerTableSizeSetting, boolean useCompression, c out) {
            this.f۳۸۹۶c = Integer.MAX_VALUE;
            this.f۳۸۹۹f = new c[8];
            this.f۳۹۰۰g = this.f۳۸۹۹f.length - 1;
            this.f۳۹۰۱h = 0;
            this.i = 0;
            this.f۳۸۹۸e = headerTableSizeSetting;
            this.f۳۸۹۵b = useCompression;
            this.f۳۸۹۴a = out;
        }

        private void b() {
            Arrays.fill(this.f۳۸۹۹f, (Object) null);
            this.f۳۹۰۰g = this.f۳۸۹۹f.length - 1;
            this.f۳۹۰۱h = 0;
            this.i = 0;
        }

        private int b(int bytesToRecover) {
            int entriesToEvict = 0;
            if (bytesToRecover > 0) {
                int j = this.f۳۸۹۹f.length;
                while (true) {
                    j--;
                    if (j < this.f۳۹۰۰g || bytesToRecover <= 0) {
                        c[] cVarArr = this.f۳۸۹۹f;
                        int i2 = this.f۳۹۰۰g;
                        System.arraycopy(cVarArr, i2 + 1, cVarArr, i2 + 1 + entriesToEvict, this.f۳۹۰۱h);
                        c[] cVarArr2 = this.f۳۸۹۹f;
                        int i3 = this.f۳۹۰۰g;
                        Arrays.fill(cVarArr2, i3 + 1, i3 + 1 + entriesToEvict, (Object) null);
                        this.f۳۹۰۰g += entriesToEvict;
                    } else {
                        c[] cVarArr3 = this.f۳۸۹۹f;
                        bytesToRecover -= cVarArr3[j].f۳۸۸۳c;
                        this.i -= cVarArr3[j].f۳۸۸۳c;
                        this.f۳۹۰۱h--;
                        entriesToEvict++;
                    }
                }
                c[] cVarArr4 = this.f۳۸۹۹f;
                int i22 = this.f۳۹۰۰g;
                System.arraycopy(cVarArr4, i22 + 1, cVarArr4, i22 + 1 + entriesToEvict, this.f۳۹۰۱h);
                c[] cVarArr22 = this.f۳۸۹۹f;
                int i32 = this.f۳۹۰۰g;
                Arrays.fill(cVarArr22, i32 + 1, i32 + 1 + entriesToEvict, (Object) null);
                this.f۳۹۰۰g += entriesToEvict;
            }
            return entriesToEvict;
        }

        /* JADX INFO: Multiple debug info for r1v3 int: [D('doubled' e.f0.i.c[]), D('index' int)] */
        private void a(c entry) {
            int delta = entry.f۳۸۸۳c;
            int i2 = this.f۳۸۹۸e;
            if (delta > i2) {
                b();
                return;
            }
            b((this.i + delta) - i2);
            int i3 = this.f۳۹۰۱h + 1;
            c[] cVarArr = this.f۳۸۹۹f;
            if (i3 > cVarArr.length) {
                c[] doubled = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, doubled, cVarArr.length, cVarArr.length);
                this.f۳۹۰۰g = this.f۳۸۹۹f.length - 1;
                this.f۳۸۹۹f = doubled;
            }
            int index = this.f۳۹۰۰g;
            this.f۳۹۰۰g = index - 1;
            this.f۳۸۹۹f[index] = entry;
            this.f۳۹۰۱h++;
            this.i += delta;
        }

        /* access modifiers changed from: package-private */
        public void a(List<c> list) {
            if (this.f۳۸۹۷d) {
                int i2 = this.f۳۸۹۶c;
                if (i2 < this.f۳۸۹۸e) {
                    a(i2, 31, 32);
                }
                this.f۳۸۹۷d = false;
                this.f۳۸۹۶c = Integer.MAX_VALUE;
                a(this.f۳۸۹۸e, 31, 32);
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                c header = list.get(i3);
                f name = header.f۳۸۸۱a.g();
                f value = header.f۳۸۸۲b;
                int headerIndex = -1;
                int headerNameIndex = -1;
                Integer staticIndex = d.f۳۸۸۵b.get(name);
                if (staticIndex != null && (headerNameIndex = staticIndex.intValue() + 1) > 1 && headerNameIndex < 8) {
                    if (e.f0.c.a(d.f۳۸۸۴a[headerNameIndex - 1].f۳۸۸۲b, value)) {
                        headerIndex = headerNameIndex;
                    } else if (e.f0.c.a(d.f۳۸۸۴a[headerNameIndex].f۳۸۸۲b, value)) {
                        headerIndex = headerNameIndex + 1;
                    }
                }
                if (headerIndex == -1) {
                    int j = this.f۳۹۰۰g + 1;
                    int length = this.f۳۸۹۹f.length;
                    while (true) {
                        if (j >= length) {
                            break;
                        }
                        if (e.f0.c.a(this.f۳۸۹۹f[j].f۳۸۸۱a, name)) {
                            if (e.f0.c.a(this.f۳۸۹۹f[j].f۳۸۸۲b, value)) {
                                headerIndex = (j - this.f۳۹۰۰g) + d.f۳۸۸۴a.length;
                                break;
                            } else if (headerNameIndex == -1) {
                                headerNameIndex = (j - this.f۳۹۰۰g) + d.f۳۸۸۴a.length;
                            }
                        }
                        j++;
                    }
                }
                if (headerIndex != -1) {
                    a(headerIndex, 127, 128);
                } else if (headerNameIndex == -1) {
                    this.f۳۸۹۴a.writeByte(64);
                    a(name);
                    a(value);
                    a(header);
                } else if (!name.b(c.f۳۸۷۶d) || c.i.equals(name)) {
                    a(headerNameIndex, 63, 64);
                    a(value);
                    a(header);
                } else {
                    a(headerNameIndex, 15, 0);
                    a(value);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.f۳۸۹۴a.writeByte(bits | value);
                return;
            }
            this.f۳۸۹۴a.writeByte(bits | prefixMask);
            int value2 = value - prefixMask;
            while (value2 >= 128) {
                this.f۳۸۹۴a.writeByte((value2 & 127) | 128);
                value2 >>>= 7;
            }
            this.f۳۸۹۴a.writeByte(value2);
        }

        /* access modifiers changed from: package-private */
        public void a(f data) {
            if (!this.f۳۸۹۵b || k.b().a(data) >= data.f()) {
                a(data.f(), 127, 0);
                this.f۳۸۹۴a.a(data);
                return;
            }
            c huffmanBuffer = new c();
            k.b().a(data, huffmanBuffer);
            f huffmanBytes = huffmanBuffer.o();
            a(huffmanBytes.f(), 127, 128);
            this.f۳۸۹۴a.a(huffmanBytes);
        }

        /* access modifiers changed from: package-private */
        public void a(int headerTableSizeSetting) {
            int effectiveHeaderTableSize = Math.min(headerTableSizeSetting, 16384);
            int i2 = this.f۳۸۹۸e;
            if (i2 != effectiveHeaderTableSize) {
                if (effectiveHeaderTableSize < i2) {
                    this.f۳۸۹۶c = Math.min(this.f۳۸۹۶c, effectiveHeaderTableSize);
                }
                this.f۳۸۹۷d = true;
                this.f۳۸۹۸e = effectiveHeaderTableSize;
                a();
            }
        }

        private void a() {
            int i2 = this.f۳۸۹۸e;
            int i3 = this.i;
            if (i2 >= i3) {
                return;
            }
            if (i2 == 0) {
                b();
            } else {
                b(i3 - i2);
            }
        }
    }

    static f a(f name) {
        int length = name.f();
        for (int i = 0; i < length; i++) {
            byte c2 = name.a(i);
            if (c2 >= 65 && c2 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.i());
            }
        }
        return name;
    }
}
