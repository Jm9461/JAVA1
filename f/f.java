package f;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class f implements Serializable, Comparable<f> {

    /* renamed from: f  reason: collision with root package name */
    static final char[] f۴۱۷۹f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g  reason: collision with root package name */
    public static final f f۴۱۸۰g = a(new byte[0]);

    /* renamed from: c  reason: collision with root package name */
    final byte[] f۴۱۸۱c;

    /* renamed from: d  reason: collision with root package name */
    transient int f۴۱۸۲d;

    /* renamed from: e  reason: collision with root package name */
    transient String f۴۱۸۳e;

    f(byte[] data) {
        this.f۴۱۸۱c = data;
    }

    public static f a(byte... data) {
        if (data != null) {
            return new f((byte[]) data.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static f d(String s) {
        if (s != null) {
            f byteString = new f(s.getBytes(u.f۴۲۲۲a));
            byteString.f۴۱۸۳e = s;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    public String i() {
        String result = this.f۴۱۸۳e;
        if (result != null) {
            return result;
        }
        String str = new String(this.f۴۱۸۱c, u.f۴۲۲۲a);
        this.f۴۱۸۳e = str;
        return str;
    }

    public String a() {
        return b.a(this.f۴۱۸۱c);
    }

    public f c() {
        return c("MD5");
    }

    public f d() {
        return c("SHA-1");
    }

    public f e() {
        return c("SHA-256");
    }

    private f c(String algorithm) {
        try {
            return a(MessageDigest.getInstance(algorithm).digest(this.f۴۱۸۱c));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static f a(String base64) {
        if (base64 != null) {
            byte[] decoded = b.a(base64);
            if (decoded != null) {
                return new f(decoded);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public String b() {
        byte[] bArr = this.f۴۱۸۱c;
        char[] result = new char[(bArr.length * 2)];
        int c2 = 0;
        for (byte b2 : bArr) {
            int c3 = c2 + 1;
            char[] cArr = f۴۱۷۹f;
            result[c2] = cArr[(b2 >> 4) & 15];
            c2 = c3 + 1;
            result[c3] = cArr[b2 & 15];
        }
        return new String(result);
    }

    public static f b(String hex) {
        if (hex == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (hex.length() % 2 == 0) {
            byte[] result = new byte[(hex.length() / 2)];
            for (int i = 0; i < result.length; i++) {
                result[i] = (byte) ((a(hex.charAt(i * 2)) << 4) + a(hex.charAt((i * 2) + 1)));
            }
            return a(result);
        } else {
            throw new IllegalArgumentException("Unexpected hex string: " + hex);
        }
    }

    private static int a(char c2) {
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

    public f g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f۴۱۸۱c;
            if (i >= bArr.length) {
                return this;
            }
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
                return new f(lowercase);
            }
        }
    }

    public f a(int beginIndex, int endIndex) {
        if (beginIndex >= 0) {
            byte[] bArr = this.f۴۱۸۱c;
            if (endIndex <= bArr.length) {
                int subLen = endIndex - beginIndex;
                if (subLen < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (beginIndex == 0 && endIndex == bArr.length) {
                    return this;
                } else {
                    byte[] copy = new byte[subLen];
                    System.arraycopy(this.f۴۱۸۱c, beginIndex, copy, 0, subLen);
                    return new f(copy);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f۴۱۸۱c.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public byte a(int pos) {
        return this.f۴۱۸۱c[pos];
    }

    public int f() {
        return this.f۴۱۸۱c.length;
    }

    public byte[] h() {
        return (byte[]) this.f۴۱۸۱c.clone();
    }

    /* access modifiers changed from: package-private */
    public void a(c buffer) {
        byte[] bArr = this.f۴۱۸۱c;
        buffer.write(bArr, 0, bArr.length);
    }

    public boolean a(int offset, f other, int otherOffset, int byteCount) {
        return other.a(otherOffset, this.f۴۱۸۱c, offset, byteCount);
    }

    public boolean a(int offset, byte[] other, int otherOffset, int byteCount) {
        if (offset >= 0) {
            byte[] bArr = this.f۴۱۸۱c;
            return offset <= bArr.length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && u.a(bArr, offset, other, otherOffset, byteCount);
        }
    }

    public final boolean b(f prefix) {
        return a(0, prefix, 0, prefix.f());
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            int f2 = ((f) o).f();
            byte[] bArr = this.f۴۱۸۱c;
            if (f2 != bArr.length || !((f) o).a(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = this.f۴۱۸۲d;
        if (result != 0) {
            return result;
        }
        int hashCode = Arrays.hashCode(this.f۴۱۸۱c);
        this.f۴۱۸۲d = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public int compareTo(f byteString) {
        int sizeA = f();
        int sizeB = byteString.f();
        int size = Math.min(sizeA, sizeB);
        for (int i = 0; i < size; i++) {
            int byteA = a(i) & 255;
            int byteB = byteString.a(i) & 255;
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
        if (this.f۴۱۸۱c.length == 0) {
            return "[size=0]";
        }
        String text = i();
        int i = a(text, 64);
        if (i != -1) {
            String safeText = text.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < text.length()) {
                return "[size=" + this.f۴۱۸۱c.length + " text=" + safeText + "…]";
            }
            return "[text=" + safeText + "]";
        } else if (this.f۴۱۸۱c.length <= 64) {
            return "[hex=" + b() + "]";
        } else {
            return "[size=" + this.f۴۱۸۱c.length + " hex=" + a(0, 64).b() + "…]";
        }
    }

    static int a(String s, int codePointCount) {
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
        return s.length();
    }
}
