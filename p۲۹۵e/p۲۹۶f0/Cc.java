package p۲۹۵e.p۲۹۶f0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p۲۹۵e.AbstractCb0;
import p۲۹۵e.AbstractCz;
import p۲۹۵e.Cs;
import p۳۰۵f.Cf;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cc {

    /* renamed from: a, reason: contains not printable characters */
    public static final byte[] f۱۵۷۰۳a = new byte[0];

    /* renamed from: b, reason: contains not printable characters */
    public static final String[] f۱۵۷۰۴b = new String[0];

    /* renamed from: c, reason: contains not printable characters */
    public static final AbstractCb0 f۱۵۷۰۵c = AbstractCb0.m۱۶۴۵۹a(null, f۱۵۷۰۳a);

    /* renamed from: d, reason: contains not printable characters */
    public static final Charset f۱۵۷۰۶d;

    /* renamed from: e, reason: contains not printable characters */
    public static final TimeZone f۱۵۷۰۷e;

    /* renamed from: f, reason: contains not printable characters */
    public static final Comparator<String> f۱۵۷۰۸f;

    /* renamed from: g, reason: contains not printable characters */
    private static final Pattern f۱۵۷۰۹g;

    static {
        AbstractCz.m۱۷۲۶۰a(null, f۱۵۷۰۳a);
        Cf.m۱۷۳۵۹b("efbbbf");
        Cf.m۱۷۳۵۹b("feff");
        Cf.m۱۷۳۵۹b("fffe");
        Cf.m۱۷۳۵۹b("0000ffff");
        Cf.m۱۷۳۵۹b("ffff0000");
        f۱۵۷۰۶d = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        f۱۵۷۰۷e = TimeZone.getTimeZone("GMT");
        f۱۵۷۰۸f = new a();
        f۱۵۷۰۹g = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* renamed from: e.f0.c$a */
    final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(String a2, String b2) {
            return a2.compareTo(b2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۶۵۴۱a(long arrayLength, long offset, long count) {
        if ((offset | count) < 0 || offset > arrayLength || arrayLength - offset < count) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۶۵۴۶a(Object a2, Object b2) {
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۶۵۴۲a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۶۵۴۳a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!m۱۶۵۴۵a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e3) {
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۶۵۴۴a(InterfaceCs source, int timeout, TimeUnit timeUnit) {
        try {
            return m۱۶۵۵۱b(source, timeout, timeUnit);
        } catch (IOException e2) {
            return false;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public static boolean m۱۶۵۵۱b(InterfaceCs source, int duration, TimeUnit timeUnit) {
        long originalDuration;
        long now = System.nanoTime();
        if (source.mo۱۷۴۷۸b().mo۱۷۴۸۴d()) {
            originalDuration = source.mo۱۷۴۷۸b().mo۱۷۴۸۳c() - now;
        } else {
            originalDuration = Long.MAX_VALUE;
        }
        source.mo۱۷۴۷۸b().mo۱۷۴۸۷a(Math.min(originalDuration, timeUnit.toNanos(duration)) + now);
        try {
            p۳۰۵f.Cc skipBuffer = new p۳۰۵f.Cc();
            while (source.mo۱۷۴۷۷b(skipBuffer, 8192L) != -1) {
                skipBuffer.m۱۷۳۲۸m();
            }
            if (originalDuration == Long.MAX_VALUE) {
                source.mo۱۷۴۷۸b().mo۱۷۴۷۹a();
            } else {
                source.mo۱۷۴۷۸b().mo۱۷۴۸۷a(now + originalDuration);
            }
            return true;
        } catch (InterruptedIOException e2) {
            if (originalDuration == Long.MAX_VALUE) {
                source.mo۱۷۴۷۸b().mo۱۷۴۷۹a();
            } else {
                source.mo۱۷۴۷۸b().mo۱۷۴۸۷a(now + originalDuration);
            }
            return false;
        } catch (Throwable th) {
            if (originalDuration == Long.MAX_VALUE) {
                source.mo۱۷۴۷۸b().mo۱۷۴۷۹a();
            } else {
                source.mo۱۷۴۷۸b().mo۱۷۴۸۷a(now + originalDuration);
            }
            throw th;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static <T> List<T> m۱۶۵۳۸a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a, reason: contains not printable characters */
    public static <T> List<T> m۱۶۵۳۹a(T... elements) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) elements.clone()));
    }

    /* renamed from: e.f0.c$b */
    final class b implements ThreadFactory {

        /* renamed from: a, reason: contains not printable characters */
        final /* synthetic */ String f۱۵۷۱۰a;

        /* renamed from: b, reason: contains not printable characters */
        final /* synthetic */ boolean f۱۵۷۱۱b;

        b(String str, boolean z) {
            this.f۱۵۷۱۰a = str;
            this.f۱۵۷۱۱b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread result = new Thread(runnable, this.f۱۵۷۱۰a);
            result.setDaemon(this.f۱۵۷۱۱b);
            return result;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public static ThreadFactory m۱۶۵۴۰a(String name, boolean daemon) {
        return new b(name, daemon);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String[] m۱۶۵۴۸a(Comparator<? super String> comparator, String[] first, String[] second) {
        List<String> result = new ArrayList<>();
        for (String a2 : first) {
            int length = second.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    String b2 = second[i];
                    if (comparator.compare(a2, b2) != 0) {
                        i++;
                    } else {
                        result.add(a2);
                        break;
                    }
                }
            }
        }
        return (String[]) result.toArray(new String[result.size()]);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static boolean m۱۶۵۵۳b(Comparator<String> comparator, String[] first, String[] second) {
        if (first == null || second == null || first.length == 0 || second.length == 0) {
            return false;
        }
        for (String a2 : first) {
            for (String b2 : second) {
                if (comparator.compare(a2, b2) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۶۵۳۳a(Cs url, boolean includeDefaultPort) {
        String host;
        if (url.m۱۷۱۵۵g().contains(":")) {
            host = "[" + url.m۱۷۱۵۵g() + "]";
        } else {
            host = url.m۱۷۱۵۵g();
        }
        if (includeDefaultPort || url.m۱۷۱۵۸j() != Cs.m۱۷۱۴۴c(url.m۱۷۱۶۱m())) {
            return host + ":" + url.m۱۷۱۵۸j();
        }
        return host;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static boolean m۱۶۵۴۵a(AssertionError e2) {
        return (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۶۵۳۱a(Comparator<String> comparator, String[] array, String value) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (comparator.compare(array[i], value) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String[] m۱۶۵۴۹a(String[] array, String value) {
        String[] result = new String[array.length + 1];
        System.arraycopy(array, 0, result, 0, array.length);
        result[result.length - 1] = value;
        return result;
    }

    /* renamed from: b, reason: contains not printable characters */
    public static int m۱۶۵۵۰b(String input, int pos, int limit) {
        for (int i = pos; i < limit; i++) {
            char charAt = input.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
        }
        return limit;
    }

    /* renamed from: c, reason: contains not printable characters */
    public static int m۱۶۵۵۵c(String input, int pos, int limit) {
        for (int i = limit - 1; i >= pos; i--) {
            char charAt = input.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i + 1;
            }
        }
        return pos;
    }

    /* renamed from: d, reason: contains not printable characters */
    public static String m۱۶۵۵۶d(String string, int pos, int limit) {
        int start = m۱۶۵۵۰b(string, pos, limit);
        int end = m۱۶۵۵۵c(string, start, limit);
        return string.substring(start, end);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۶۵۳۰a(String input, int pos, int limit, String delimiters) {
        for (int i = pos; i < limit; i++) {
            if (delimiters.indexOf(input.charAt(i)) != -1) {
                return i;
            }
        }
        return limit;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۶۵۲۹a(String input, int pos, int limit, char delimiter) {
        for (int i = pos; i < limit; i++) {
            if (input.charAt(i) == delimiter) {
                return i;
            }
        }
        return limit;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۶۵۳۴a(String host) {
        InetAddress inetAddress;
        if (host.contains(":")) {
            if (host.startsWith("[") && host.endsWith("]")) {
                inetAddress = m۱۶۵۳۷a(host, 1, host.length() - 1);
            } else {
                inetAddress = m۱۶۵۳۷a(host, 0, host.length());
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return m۱۶۵۳۶a(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + host + "'");
        }
        try {
            String result = IDN.toASCII(host).toLowerCase(Locale.US);
            if (result.isEmpty()) {
                return null;
            }
            if (m۱۶۵۵۲b(result)) {
                return null;
            }
            return result;
        } catch (IllegalArgumentException e2) {
            return null;
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private static boolean m۱۶۵۵۲b(String hostnameAscii) {
        for (int i = 0; i < hostnameAscii.length(); i++) {
            char c2 = hostnameAscii.charAt(i);
            if (c2 <= 31 || c2 >= 127 || " #%/:?@[\\]".indexOf(c2) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c, reason: contains not printable characters */
    public static int m۱۶۵۵۴c(String input) {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char c2 = input.charAt(i);
            if (c2 <= 31 || c2 >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d, reason: contains not printable characters */
    public static boolean m۱۶۵۵۷d(String host) {
        return f۱۵۷۰۹g.matcher(host).matches();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static String m۱۶۵۳۵a(String format, Object... args) {
        return String.format(Locale.US, format, args);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static AssertionError m۱۶۵۳۲a(String message, Exception e2) {
        AssertionError assertionError = new AssertionError(message);
        try {
            assertionError.initCause(e2);
        } catch (IllegalStateException e3) {
        }
        return assertionError;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static int m۱۶۵۲۸a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return (c2 - 'a') + 10;
        }
        if (c2 < 'A' || c2 > 'F') {
            return -1;
        }
        return (c2 - 'A') + 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress m۱۶۵۳۷a(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = -1
            r3 = -1
            r4 = r12
        L8:
            r5 = -1
            r6 = 0
            r7 = 0
            if (r4 >= r13) goto L7c
            int r8 = r0.length
            if (r1 != r8) goto L11
            return r7
        L11:
            int r8 = r4 + 2
            if (r8 > r13) goto L29
            r8 = 2
            java.lang.String r9 = "::"
            boolean r8 = r11.regionMatches(r4, r9, r6, r8)
            if (r8 == 0) goto L29
            if (r2 == r5) goto L21
            return r7
        L21:
            int r4 = r4 + 2
            int r1 = r1 + 2
            r2 = r1
            if (r4 != r13) goto L4c
            goto L7c
        L29:
            if (r1 == 0) goto L4c
            r8 = 1
            java.lang.String r9 = ":"
            boolean r9 = r11.regionMatches(r4, r9, r6, r8)
            if (r9 == 0) goto L37
            int r4 = r4 + 1
            goto L4c
        L37:
            java.lang.String r9 = "."
            boolean r8 = r11.regionMatches(r4, r9, r6, r8)
            if (r8 == 0) goto L4b
            int r8 = r1 + (-2)
            boolean r8 = m۱۶۵۴۷a(r11, r3, r13, r0, r8)
            if (r8 != 0) goto L48
            return r7
        L48:
            int r1 = r1 + 2
            goto L7c
        L4b:
            return r7
        L4c:
            r6 = 0
            r3 = r4
        L4e:
            if (r4 >= r13) goto L62
            char r8 = r11.charAt(r4)
            int r9 = m۱۶۵۲۸a(r8)
            if (r9 != r5) goto L5b
            goto L62
        L5b:
            int r10 = r6 << 4
            int r6 = r10 + r9
            int r4 = r4 + 1
            goto L4e
        L62:
            int r5 = r4 - r3
            if (r5 == 0) goto L7b
            r8 = 4
            if (r5 <= r8) goto L6a
            goto L7b
        L6a:
            int r7 = r1 + 1
            int r8 = r6 >>> 8
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r0[r1] = r8
            int r1 = r7 + 1
            r8 = r6 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r0[r7] = r8
            goto L8
        L7b:
            return r7
        L7c:
            int r4 = r0.length
            if (r1 == r4) goto L91
            if (r2 != r5) goto L82
            return r7
        L82:
            int r4 = r0.length
            int r5 = r1 - r2
            int r4 = r4 - r5
            int r5 = r1 - r2
            java.lang.System.arraycopy(r0, r2, r0, r4, r5)
            int r4 = r0.length
            int r4 = r4 - r1
            int r4 = r4 + r2
            java.util.Arrays.fill(r0, r2, r4, r6)
        L91:
            java.net.InetAddress r4 = java.net.InetAddress.getByAddress(r0)     // Catch: java.net.UnknownHostException -> L96
            return r4
        L96:
            r4 = move-exception
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            goto L9e
        L9d:
            throw r5
        L9e:
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: p۲۹۵e.p۲۹۶f0.Cc.m۱۶۵۳۷a(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: a, reason: contains not printable characters */
    private static boolean m۱۶۵۴۷a(String input, int pos, int limit, byte[] address, int addressOffset) {
        int b2 = addressOffset;
        int i = pos;
        while (i < limit) {
            if (b2 == address.length) {
                return false;
            }
            if (b2 != addressOffset) {
                if (input.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int value = 0;
            int groupOffset = i;
            while (i < limit) {
                char c2 = input.charAt(i);
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                if ((value == 0 && groupOffset != i) || ((value * 10) + c2) - 48 > 255) {
                    return false;
                }
                i++;
            }
            int groupLength = i - groupOffset;
            if (groupLength == 0) {
                return false;
            }
            address[b2] = (byte) value;
            b2++;
        }
        int i2 = addressOffset + 4;
        return b2 == i2;
    }

    /* renamed from: a, reason: contains not printable characters */
    private static String m۱۶۵۳۶a(byte[] address) {
        int longestRunOffset = -1;
        int longestRunLength = 0;
        int i = 0;
        while (i < address.length) {
            int currentRunOffset = i;
            while (i < 16 && address[i] == 0 && address[i + 1] == 0) {
                i += 2;
            }
            int currentRunLength = i - currentRunOffset;
            if (currentRunLength > longestRunLength && currentRunLength >= 4) {
                longestRunOffset = currentRunOffset;
                longestRunLength = currentRunLength;
            }
            i += 2;
        }
        p۳۰۵f.Cc result = new p۳۰۵f.Cc();
        int i2 = 0;
        while (i2 < address.length) {
            if (i2 == longestRunOffset) {
                result.writeByte(58);
                i2 += longestRunLength;
                if (i2 == 16) {
                    result.writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    result.writeByte(58);
                }
                int group = ((address[i2] & 255) << 8) | (address[i2 + 1] & 255);
                result.mo۱۷۴۲۵a(group);
                i2 += 2;
            }
        }
        return result.m۱۷۳۳۱p();
    }
}
