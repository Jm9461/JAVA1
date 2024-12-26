package p۳۰۵f;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: f.f, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cf implements Serializable, Comparable<Cf> {

    /* renamed from: f, reason: contains not printable characters */
    static final char[] f۱۶۲۷۲f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g, reason: contains not printable characters */
    public static final Cf f۱۶۲۷۳g = m۱۷۳۵۸a(new byte[0]);

    /* renamed from: c, reason: contains not printable characters */
    final byte[] f۱۶۲۷۴c;

    /* renamed from: d, reason: contains not printable characters */
    transient int f۱۶۲۷۵d;

    /* renamed from: e, reason: contains not printable characters */
    transient String f۱۶۲۷۶e;

    Cf(byte[] data) {
        this.f۱۶۲۷۴c = data;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cf m۱۷۳۵۸a(byte... data) {
        if (data == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new Cf((byte[]) data.clone());
    }

    /* renamed from: d, reason: contains not printable characters */
    public static Cf m۱۷۳۶۱d(String s) {
        if (s == null) {
            throw new IllegalArgumentException("s == null");
        }
        Cf byteString = new Cf(s.getBytes(Cu.f۱۶۳۱۷a));
        byteString.f۱۶۲۷۶e = s;
        return byteString;
    }

    /* renamed from: i, reason: contains not printable characters */
    public String mo۱۷۴۷۴i() {
        String result = this.f۱۶۲۷۶e;
        if (result != null) {
            return result;
        }
        String str = new String(this.f۱۶۲۷۴c, Cu.f۱۶۳۱۷a);
        this.f۱۶۲۷۶e = str;
        return str;
    }

    /* renamed from: a, reason: contains not printable characters */
    public String mo۱۷۴۶۳a() {
        return Cb.m۱۷۲۸۴a(this.f۱۶۲۷۴c);
    }

    /* renamed from: c, reason: contains not printable characters */
    public Cf mo۱۷۴۶۸c() {
        return m۱۷۳۶۰c("MD5");
    }

    /* renamed from: d, reason: contains not printable characters */
    public Cf mo۱۷۴۶۹d() {
        return m۱۷۳۶۰c("SHA-1");
    }

    /* renamed from: e, reason: contains not printable characters */
    public Cf mo۱۷۴۷۰e() {
        return m۱۷۳۶۰c("SHA-256");
    }

    /* renamed from: c, reason: contains not printable characters */
    private Cf m۱۷۳۶۰c(String algorithm) {
        try {
            return m۱۷۳۵۸a(MessageDigest.getInstance(algorithm).digest(this.f۱۶۲۷۴c));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cf m۱۷۳۵۷a(String base64) {
        if (base64 == null) {
            throw new IllegalArgumentException("base64 == null");
        }
        byte[] decoded = Cb.m۱۷۲۸۶a(base64);
        if (decoded != null) {
            return new Cf(decoded);
        }
        return null;
    }

    /* renamed from: b, reason: contains not printable characters */
    public String mo۱۷۴۶۷b() {
        byte[] bArr = this.f۱۶۲۷۴c;
        char[] result = new char[bArr.length * 2];
        int c2 = 0;
        for (byte b2 : bArr) {
            int c3 = c2 + 1;
            char[] cArr = f۱۶۲۷۲f;
            result[c2] = cArr[(b2 >> 4) & 15];
            c2 = c3 + 1;
            result[c3] = cArr[b2 & 15];
        }
        return new String(result);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static Cf m۱۷۳۵۹b(String hex) {
        if (hex == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (hex.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + hex);
        }
        byte[] result = new byte[hex.length() / 2];
        for (int i = 0; i < result.length; i++) {
            int d1 = m۱۷۳۵۵a(hex.charAt(i * 2)) << 4;
            int d2 = m۱۷۳۵۵a(hex.charAt((i * 2) + 1));
            result[i] = (byte) (d1 + d2);
        }
        return m۱۷۳۵۸a(result);
    }

    /* renamed from: a, reason: contains not printable characters */
    private static int m۱۷۳۵۵a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return (c2 - 'a') + 10;
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return (c2 - 'A') + 10;
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* renamed from: g, reason: contains not printable characters */
    public Cf mo۱۷۴۷۲g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f۱۶۲۷۴c;
            if (i < bArr.length) {
                byte c2 = bArr[i];
                if (c2 < 65 || c2 > 90) {
                    i++;
                } else {
                    byte[] lowercase = (byte[]) bArr.clone();
                    lowercase[i] = (byte) (c2 + 32);
                    for (int i2 = i + 1; i2 < lowercase.length; i2++) {
                        byte c3 = lowercase[i2];
                        if (c3 >= 65 && c3 <= 90) {
                            lowercase[i2] = (byte) (c3 + 32);
                        }
                    }
                    return new Cf(lowercase);
                }
            } else {
                return this;
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public Cf mo۱۷۴۶۲a(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f۱۶۲۷۴c;
        if (endIndex > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f۱۶۲۷۴c.length + ")");
        }
        int subLen = endIndex - beginIndex;
        if (subLen < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (beginIndex == 0 && endIndex == bArr.length) {
            return this;
        }
        byte[] copy = new byte[subLen];
        System.arraycopy(this.f۱۶۲۷۴c, beginIndex, copy, 0, subLen);
        return new Cf(copy);
    }

    /* renamed from: a, reason: contains not printable characters */
    public byte mo۱۷۴۶۱a(int pos) {
        return this.f۱۶۲۷۴c[pos];
    }

    /* renamed from: f, reason: contains not printable characters */
    public int mo۱۷۴۷۱f() {
        return this.f۱۶۲۷۴c.length;
    }

    /* renamed from: h, reason: contains not printable characters */
    public byte[] mo۱۷۴۷۳h() {
        return (byte[]) this.f۱۶۲۷۴c.clone();
    }

    /* renamed from: a, reason: contains not printable characters */
    void mo۱۷۴۶۴a(Cc buffer) {
        byte[] bArr = this.f۱۶۲۷۴c;
        buffer.write(bArr, 0, bArr.length);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۷۴۶۵a(int offset, Cf other, int otherOffset, int byteCount) {
        return other.mo۱۷۴۶۶a(otherOffset, this.f۱۶۲۷۴c, offset, byteCount);
    }

    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۷۴۶۶a(int offset, byte[] other, int otherOffset, int byteCount) {
        if (offset >= 0) {
            byte[] bArr = this.f۱۶۲۷۴c;
            if (offset <= bArr.length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && Cu.m۱۷۴۹۴a(bArr, offset, other, otherOffset, byteCount)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b, reason: contains not printable characters */
    public final boolean m۱۷۳۷۰b(Cf prefix) {
        return mo۱۷۴۶۵a(0, prefix, 0, prefix.mo۱۷۴۷۱f());
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Cf) {
            int i = ((Cf) o).mo۱۷۴۷۱f();
            byte[] bArr = this.f۱۶۲۷۴c;
            if (i == bArr.length && ((Cf) o).mo۱۷۴۶۶a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int result = this.f۱۶۲۷۵d;
        if (result != 0) {
            return result;
        }
        int hashCode = Arrays.hashCode(this.f۱۶۲۷۴c);
        this.f۱۶۲۷۵d = hashCode;
        return hashCode;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(Cf byteString) {
        int sizeA = mo۱۷۴۷۱f();
        int sizeB = byteString.mo۱۷۴۷۱f();
        int size = Math.min(sizeA, sizeB);
        for (int i = 0; i < size; i++) {
            int byteA = mo۱۷۴۶۱a(i) & 255;
            int byteB = byteString.mo۱۷۴۶۱a(i) & 255;
            if (byteA != byteB) {
                return byteA < byteB ? -1 : 1;
            }
        }
        if (sizeA == sizeB) {
            return 0;
        }
        return sizeA < sizeB ? -1 : 1;
    }

    public String toString() {
        if (this.f۱۶۲۷۴c.length == 0) {
            return "[size=0]";
        }
        String text = mo۱۷۴۷۴i();
        int i = m۱۷۳۵۶a(text, 64);
        if (i == -1) {
            if (this.f۱۶۲۷۴c.length <= 64) {
                return "[hex=" + mo۱۷۴۶۷b() + "]";
            }
            return "[size=" + this.f۱۶۲۷۴c.length + " hex=" + mo۱۷۴۶۲a(0, 64).mo۱۷۴۶۷b() + "…]";
        }
        String safeText = text.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i < text.length()) {
            return "[size=" + this.f۱۶۲۷۴c.length + " text=" + safeText + "…]";
        }
        return "[text=" + safeText + "]";
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۱۷۳۵۶a(String s, int codePointCount) {
        int i = 0;
        int j = 0;
        int length = s.length();
        while (i < length) {
            if (j == codePointCount) {
                return i;
            }
            int c2 = s.codePointAt(i);
            if ((Character.isISOControl(c2) && c2 != 10 && c2 != 13) || c2 == 65533) {
                return -1;
            }
            j++;
            i += Character.charCount(c2);
        }
        int i2 = s.length();
        return i2;
    }
}
