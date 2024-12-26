package p۱۳۹e.p۱۴۰f0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
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
import p۱۳۹e.AbstractCb0;
import p۱۳۹e.AbstractCz;
import p۱۳۹e.Cs;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cf;

/* renamed from: e.f0.c  reason: invalid class name */
public final class Cc {

    /* renamed from: a  reason: contains not printable characters */
    public static final byte[] f۱۵۷۰۳a = new byte[0];

    /* renamed from: b  reason: contains not printable characters */
    public static final String[] f۱۵۷۰۴b = new String[0];

    /* renamed from: c  reason: contains not printable characters */
    public static final AbstractCb0 f۱۵۷۰۵c = AbstractCb0.m۱۸۵۳۸a(null, f۱۵۷۰۳a);

    /* renamed from: d  reason: contains not printable characters */
    public static final Charset f۱۵۷۰۶d = Charset.forName("UTF-8");

    /* renamed from: e  reason: contains not printable characters */
    public static final TimeZone f۱۵۷۰۷e = TimeZone.getTimeZone("GMT");

    /* renamed from: f  reason: contains not printable characters */
    public static final Comparator<String> f۱۵۷۰۸f = new Ca();

    /* renamed from: g  reason: contains not printable characters */
    private static final Pattern f۱۵۷۰۹g = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        AbstractCz.m۱۹۳۳۸a(null, f۱۵۷۰۳a);
        Cf.m۱۹۴۳۶b("efbbbf");
        Cf.m۱۹۴۳۶b("feff");
        Cf.m۱۹۴۳۶b("fffe");
        Cf.m۱۹۴۳۶b("0000ffff");
        Cf.m۱۹۴۳۶b("ffff0000");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
    }

    /* renamed from: e.f0.c$a  reason: invalid class name */
    class Ca implements Comparator<String> {
        Ca() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public int compare(String a, String b) {
            return a.compareTo(b);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۸۶۲۰a(long arrayLength, long offset, long count) {
        if ((offset | count) < 0 || offset > arrayLength || arrayLength - offset < count) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۸۶۲۵a(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۸۶۲۱a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۸۶۲۲a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m۱۸۶۲۴a(e)) {
                    throw e;
                }
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۸۶۲۳a(AbstractCs source, int timeout, TimeUnit timeUnit) {
        try {
            return m۱۸۶۳۰b(source, timeout, timeUnit);
        } catch (IOException e) {
            return false;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۸۶۳۰b(AbstractCs source, int duration, TimeUnit timeUnit) {
        long originalDuration;
        long now = System.nanoTime();
        if (source.m۱۹۵۵۵b().m۱۹۵۶۱d()) {
            originalDuration = source.m۱۹۵۵۵b().m۱۹۵۶۰c() - now;
        } else {
            originalDuration = Long.MAX_VALUE;
        }
        source.m۱۹۵۵۵b().m۱۹۵۵۷a(Math.min(originalDuration, timeUnit.toNanos((long) duration)) + now);
        try {
            p۱۴۹f.Cc skipBuffer = new p۱۴۹f.Cc();
            while (source.m۱۹۵۵۴b(skipBuffer, 8192) != -1) {
                skipBuffer.m۱۹۴۰۶m();
            }
            if (originalDuration == Long.MAX_VALUE) {
                source.m۱۹۵۵۵b().m۱۹۵۵۶a();
            } else {
                source.m۱۹۵۵۵b().m۱۹۵۵۷a(now + originalDuration);
            }
            return true;
        } catch (InterruptedIOException e) {
            if (originalDuration == Long.MAX_VALUE) {
                source.m۱۹۵۵۵b().m۱۹۵۵۶a();
            } else {
                source.m۱۹۵۵۵b().m۱۹۵۵۷a(now + originalDuration);
            }
            return false;
        } catch (Throwable th) {
            if (originalDuration == Long.MAX_VALUE) {
                source.m۱۹۵۵۵b().m۱۹۵۵۶a();
            } else {
                source.m۱۹۵۵۵b().m۱۹۵۵۷a(now + originalDuration);
            }
            throw th;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static <T> List<T> m۱۸۶۱۷a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static <T> List<T> m۱۸۶۱۸a(T... elements) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) elements.clone()));
    }

    /* renamed from: e.f0.c$b  reason: invalid class name */
    class ThreadFactoryCb implements ThreadFactory {

        /* renamed from: a  reason: contains not printable characters */
        final /* synthetic */ String f۱۵۷۱۰a;

        /* renamed from: b  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۵۷۱۱b;

        ThreadFactoryCb(String str, boolean z) {
            this.f۱۵۷۱۰a = str;
            this.f۱۵۷۱۱b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread result = new Thread(runnable, this.f۱۵۷۱۰a);
            result.setDaemon(this.f۱۵۷۱۱b);
            return result;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static ThreadFactory m۱۸۶۱۹a(String name, boolean daemon) {
        return new ThreadFactoryCb(name, daemon);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String[] m۱۸۶۲۷a(Comparator<? super String> comparator, String[] first, String[] second) {
        List<String> result = new ArrayList<>();
        for (String a : first) {
            int length = second.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(a, second[i]) == 0) {
                    result.add(a);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) result.toArray(new String[result.size()]);
    }

    /* renamed from: b  reason: contains not printable characters */
    public static boolean m۱۸۶۳۲b(Comparator<String> comparator, String[] first, String[] second) {
        if (first == null || second == null || first.length == 0 || second.length == 0) {
            return false;
        }
        for (String a : first) {
            for (String b : second) {
                if (comparator.compare(a, b) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۸۶۱۲a(Cs url, boolean includeDefaultPort) {
        String host;
        if (url.m۱۹۲۳۴g().contains(":")) {
            host = "[" + url.m۱۹۲۳۴g() + "]";
        } else {
            host = url.m۱۹۲۳۴g();
        }
        if (!includeDefaultPort && url.m۱۹۲۳۷j() == Cs.m۱۹۲۲۳c(url.m۱۹۲۴۰m())) {
            return host;
        }
        return host + ":" + url.m۱۹۲۳۷j();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static boolean m۱۸۶۲۴a(AssertionError e) {
        return (e.getCause() == null || e.getMessage() == null || !e.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۸۶۱۰a(Comparator<String> comparator, String[] array, String value) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (comparator.compare(array[i], value) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String[] m۱۸۶۲۸a(String[] array, String value) {
        String[] result = new String[(array.length + 1)];
        System.arraycopy(array, 0, result, 0, array.length);
        result[result.length - 1] = value;
        return result;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static int m۱۸۶۲۹b(String input, int pos, int limit) {
        for (int i = pos; i < limit; i++) {
            char charAt = input.charAt(i);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                return i;
            }
        }
        return limit;
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۸۶۳۴c(String input, int pos, int limit) {
        for (int i = limit - 1; i >= pos; i--) {
            char charAt = input.charAt(i);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                return i + 1;
            }
        }
        return pos;
    }

    /* renamed from: d  reason: contains not printable characters */
    public static String m۱۸۶۳۵d(String string, int pos, int limit) {
        int start = m۱۸۶۲۹b(string, pos, limit);
        return string.substring(start, m۱۸۶۳۴c(string, start, limit));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۸۶۰۹a(String input, int pos, int limit, String delimiters) {
        for (int i = pos; i < limit; i++) {
            if (delimiters.indexOf(input.charAt(i)) != -1) {
                return i;
            }
        }
        return limit;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۸۶۰۸a(String input, int pos, int limit, char delimiter) {
        for (int i = pos; i < limit; i++) {
            if (input.charAt(i) == delimiter) {
                return i;
            }
        }
        return limit;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۸۶۱۳a(String host) {
        InetAddress inetAddress;
        if (host.contains(":")) {
            if (!host.startsWith("[") || !host.endsWith("]")) {
                inetAddress = m۱۸۶۱۶a(host, 0, host.length());
            } else {
                inetAddress = m۱۸۶۱۶a(host, 1, host.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return m۱۸۶۱۵a(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + host + "'");
        }
        try {
            String result = IDN.toASCII(host).toLowerCase(Locale.US);
            if (!result.isEmpty() && !m۱۸۶۳۱b(result)) {
                return result;
            }
            return null;
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static boolean m۱۸۶۳۱b(String hostnameAscii) {
        for (int i = 0; i < hostnameAscii.length(); i++) {
            char c = hostnameAscii.charAt(i);
            if (c <= 31 || c >= 127 || " #%/:?@[\\]".indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۸۶۳۳c(String input) {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char c = input.charAt(i);
            if (c <= 31 || c >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d  reason: contains not printable characters */
    public static boolean m۱۸۶۳۶d(String host) {
        return f۱۵۷۰۹g.matcher(host).matches();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static String m۱۸۶۱۴a(String format, Object... args) {
        return String.format(Locale.US, format, args);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static AssertionError m۱۸۶۱۱a(String message, Exception e) {
        AssertionError assertionError = new AssertionError(message);
        try {
            assertionError.initCause(e);
        } catch (IllegalStateException e2) {
        }
        return assertionError;
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۸۶۰۷a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return (c - 'a') + 10;
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return (c - 'A') + 10;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static InetAddress m۱۸۶۱۶a(String input, int pos, int limit) {
        byte[] address = new byte[16];
        int b = 0;
        int compress = -1;
        int groupOffset = -1;
        int i = pos;
        while (true) {
            if (i >= limit) {
                break;
            } else if (b == address.length) {
                return null;
            } else {
                if (i + 2 <= limit && input.regionMatches(i, "::", 0, 2)) {
                    if (compress == -1) {
                        i += 2;
                        b += 2;
                        compress = b;
                        if (i == limit) {
                            break;
                        }
                    } else {
                        return null;
                    }
                } else if (b != 0) {
                    if (input.regionMatches(i, ":", 0, 1)) {
                        i++;
                    } else if (!input.regionMatches(i, ".", 0, 1) || !m۱۸۶۲۶a(input, groupOffset, limit, address, b - 2)) {
                        return null;
                    } else {
                        b += 2;
                    }
                }
                int value = 0;
                groupOffset = i;
                while (i < limit) {
                    int hexDigit = m۱۸۶۰۷a(input.charAt(i));
                    if (hexDigit == -1) {
                        break;
                    }
                    value = (value << 4) + hexDigit;
                    i++;
                }
                int groupLength = i - groupOffset;
                if (groupLength == 0 || groupLength > 4) {
                    return null;
                }
                int b2 = b + 1;
                address[b] = (byte) ((value >>> 8) & 255);
                b = b2 + 1;
                address[b2] = (byte) (value & 255);
            }
        }
        if (b != address.length) {
            if (compress == -1) {
                return null;
            }
            System.arraycopy(address, compress, address, address.length - (b - compress), b - compress);
            Arrays.fill(address, compress, (address.length - b) + compress, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(address);
        } catch (UnknownHostException e) {
            throw new AssertionError();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۸۶۲۶a(String input, int pos, int limit, byte[] address, int addressOffset) {
        int b = addressOffset;
        int i = pos;
        while (i < limit) {
            if (b == address.length) {
                return false;
            }
            if (b != addressOffset) {
                if (input.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int value = 0;
            while (i < limit) {
                char c = input.charAt(i);
                if (c < '0' || c > '9') {
                    break;
                } else if ((value == 0 && i != i) || ((value * 10) + c) - 48 > 255) {
                    return false;
                } else {
                    i++;
                }
            }
            if (i - i == 0) {
                return false;
            }
            address[b] = (byte) value;
            b++;
        }
        if (b != addressOffset + 4) {
            return false;
        }
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۸۶۱۵a(byte[] address) {
        int longestRunOffset = -1;
        int longestRunLength = 0;
        int i = 0;
        while (i < address.length) {
            while (i < 16 && address[i] == 0 && address[i + 1] == 0) {
                i += 2;
            }
            int currentRunLength = i - i;
            if (currentRunLength > longestRunLength && currentRunLength >= 4) {
                longestRunOffset = i;
                longestRunLength = currentRunLength;
            }
            i += 2;
        }
        p۱۴۹f.Cc result = new p۱۴۹f.Cc();
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
                result.m۱۹۳۷۰a((long) (((address[i2] & 255) << 8) | (address[i2 + 1] & 255)));
                i2 += 2;
            }
        }
        return result.m۱۹۴۰۹p();
    }
}
