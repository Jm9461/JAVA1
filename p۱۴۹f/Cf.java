package p۱۴۹f;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: f.f  reason: invalid class name */
public class Cf implements Serializable, Comparable<Cf> {

    /* renamed from: f  reason: contains not printable characters */
    static final char[] f۱۶۲۷۲f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g  reason: contains not printable characters */
    public static final Cf f۱۶۲۷۳g = m۱۹۴۳۵a(new byte[0]);

    /* renamed from: c  reason: contains not printable characters */
    final byte[] f۱۶۲۷۴c;

    /* renamed from: d  reason: contains not printable characters */
    transient int f۱۶۲۷۵d;

    /* renamed from: e  reason: contains not printable characters */
    transient String f۱۶۲۷۶e;

    Cf(byte[] data) {
        this.f۱۶۲۷۴c = data;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cf m۱۹۴۳۵a(byte... data) {
        if (data != null) {
            return new Cf((byte[]) data.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: d  reason: contains not printable characters */
    public static Cf m۱۹۴۳۸d(String s) {
        if (s != null) {
            Cf byteString = new Cf(s.getBytes(Cu.f۱۶۳۱۷a));
            byteString.f۱۶۲۷۶e = s;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* renamed from: i  reason: contains not printable characters */
    public String m۱۹۴۵۴i() {
        String result = this.f۱۶۲۷۶e;
        if (result != null) {
            return result;
        }
        String str = new String(this.f۱۶۲۷۴c, Cu.f۱۶۳۱۷a);
        this.f۱۶۲۷۶e = str;
        return str;
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۴۴۲a() {
        return Cb.m۱۹۳۶۲a(this.f۱۶۲۷۴c);
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cf m۱۹۴۴۸c() {
        return m۱۹۴۳۷c("MD5");
    }

    /* renamed from: d  reason: contains not printable characters */
    public Cf m۱۹۴۴۹d() {
        return m۱۹۴۳۷c("SHA-1");
    }

    /* renamed from: e  reason: contains not printable characters */
    public Cf m۱۹۴۵۰e() {
        return m۱۹۴۳۷c("SHA-256");
    }

    /* renamed from: c  reason: contains not printable characters */
    private Cf m۱۹۴۳۷c(String algorithm) {
        try {
            return m۱۹۴۳۵a(MessageDigest.getInstance(algorithm).digest(this.f۱۶۲۷۴c));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cf m۱۹۴۳۴a(String base64) {
        if (base64 != null) {
            byte[] decoded = Cb.m۱۹۳۶۴a(base64);
            if (decoded != null) {
                return new Cf(decoded);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۴۴۶b() {
        byte[] bArr = this.f۱۶۲۷۴c;
        char[] result = new char[(bArr.length * 2)];
        int c = 0;
        for (byte b : bArr) {
            int c2 = c + 1;
            char[] cArr = f۱۶۲۷۲f;
            result[c] = cArr[(b >> 4) & 15];
            c = c2 + 1;
            result[c2] = cArr[b & 15];
        }
        return new String(result);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Cf m۱۹۴۳۶b(String hex) {
        if (hex == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (hex.length() % 2 == 0) {
            byte[] result = new byte[(hex.length() / 2)];
            for (int i = 0; i < result.length; i++) {
                result[i] = (byte) ((m۱۹۴۳۲a(hex.charAt(i * 2)) << 4) + m۱۹۴۳۲a(hex.charAt((i * 2) + 1)));
            }
            return m۱۹۴۳۵a(result);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + hex);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static int m۱۹۴۳۲a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 'A') + 10;
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* renamed from: g  reason: contains not printable characters */
    public Cf m۱۹۴۵۲g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f۱۶۲۷۴c;
            if (i >= bArr.length) {
                return this;
            }
            byte c = bArr[i];
            if (c < 65 || c > 90) {
                i++;
            } else {
                byte[] lowercase = (byte[]) bArr.clone();
                lowercase[i] = (byte) (c + 32);
                for (int i2 = i + 1; i2 < lowercase.length; i2++) {
                    byte c2 = lowercase[i2];
                    if (c2 >= 65 && c2 <= 90) {
                        lowercase[i2] = (byte) (c2 + 32);
                    }
                }
                return new Cf(lowercase);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cf m۱۹۴۴۱a(int beginIndex, int endIndex) {
        if (beginIndex >= 0) {
            byte[] bArr = this.f۱۶۲۷۴c;
            if (endIndex <= bArr.length) {
                int subLen = endIndex - beginIndex;
                if (subLen < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (beginIndex == 0 && endIndex == bArr.length) {
                    return this;
                } else {
                    byte[] copy = new byte[subLen];
                    System.arraycopy(this.f۱۶۲۷۴c, beginIndex, copy, 0, subLen);
                    return new Cf(copy);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f۱۶۲۷۴c.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public byte m۱۹۴۳۹a(int pos) {
        return this.f۱۶۲۷۴c[pos];
    }

    /* renamed from: f  reason: contains not printable characters */
    public int m۱۹۴۵۱f() {
        return this.f۱۶۲۷۴c.length;
    }

    /* renamed from: h  reason: contains not printable characters */
    public byte[] m۱۹۴۵۳h() {
        return (byte[]) this.f۱۶۲۷۴c.clone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۴۴۳a(Cc buffer) {
        byte[] bArr = this.f۱۶۲۷۴c;
        buffer.write(bArr, 0, bArr.length);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۴۴۴a(int offset, Cf other, int otherOffset, int byteCount) {
        return other.m۱۹۴۴۵a(otherOffset, this.f۱۶۲۷۴c, offset, byteCount);
    }

    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۹۴۴۵a(int offset, byte[] other, int otherOffset, int byteCount) {
        if (offset >= 0) {
            byte[] bArr = this.f۱۶۲۷۴c;
            return offset <= bArr.length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && Cu.m۱۹۵۷۱a(bArr, offset, other, otherOffset, byteCount);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public final boolean m۱۹۴۴۷b(Cf prefix) {
        return m۱۹۴۴۴a(0, prefix, 0, prefix.m۱۹۴۵۱f());
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof Cf) {
            int f = ((Cf) o).m۱۹۴۵۱f();
            byte[] bArr = this.f۱۶۲۷۴c;
            if (f != bArr.length || !((Cf) o).m۱۹۴۴۵a(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
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

    /* renamed from: a  reason: contains not printable characters */
    public int compareTo(Cf byteString) {
        int sizeA = m۱۹۴۵۱f();
        int sizeB = byteString.m۱۹۴۵۱f();
        int size = Math.min(sizeA, sizeB);
        for (int i = 0; i < size; i++) {
            int byteA = m۱۹۴۳۹a(i) & 255;
            int byteB = byteString.m۱۹۴۳۹a(i) & 255;
            if (byteA != byteB) {
                if (byteA < byteB) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (sizeA == sizeB) {
            return 0;
        }
        if (sizeA < sizeB) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        if (this.f۱۶۲۷۴c.length == 0) {
            return "[size=0]";
        }
        String text = m۱۹۴۵۴i();
        int i = m۱۹۴۳۳a(text, 64);
        if (i != -1) {
            String safeText = text.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < text.length()) {
                return "[size=" + this.f۱۶۲۷۴c.length + " text=" + safeText + "…]";
            }
            return "[text=" + safeText + "]";
        } else if (this.f۱۶۲۷۴c.length <= 64) {
            return "[hex=" + m۱۹۴۴۶b() + "]";
        } else {
            return "[size=" + this.f۱۶۲۷۴c.length + " hex=" + m۱۹۴۴۱a(0, 64).m۱۹۴۴۶b() + "…]";
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۹۴۳۳a(String s, int codePointCount) {
        int i = 0;
        int j = 0;
        int length = s.length();
        while (i < length) {
            if (j == codePointCount) {
                return i;
            }
            int c = s.codePointAt(i);
            if ((Character.isISOControl(c) && c != 10 && c != 13) || c == 65533) {
                return -1;
            }
            j++;
            i += Character.charCount(c);
        }
        return s.length();
    }
}
