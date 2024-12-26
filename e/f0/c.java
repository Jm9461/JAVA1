package e.f0;

import e.b0;
import e.z;
import f.f;
import f.s;
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

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f۳۷۴۲a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f۳۷۴۳b = new String[0];

    /* renamed from: c  reason: collision with root package name */
    public static final b0 f۳۷۴۴c = b0.a(null, f۳۷۴۲a);

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f۳۷۴۵d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f۳۷۴۶e = TimeZone.getTimeZone("GMT");

    /* renamed from: f  reason: collision with root package name */
    public static final Comparator<String> f۳۷۴۷f = new a();

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f۳۷۴۸g = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        z.a(null, f۳۷۴۲a);
        f.b("efbbbf");
        f.b("feff");
        f.b("fffe");
        f.b("0000ffff");
        f.b("ffff0000");
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
    }

    class a implements Comparator<String> {
        a() {
        }

        /* renamed from: a */
        public int compare(String a2, String b2) {
            return a2.compareTo(b2);
        }
    }

    public static void a(long arrayLength, long offset, long count) {
        if ((offset | count) < 0 || offset > arrayLength || arrayLength - offset < count) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean a(Object a2, Object b2) {
        return a2 == b2 || (a2 != null && a2.equals(b2));
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e2) {
            }
        }
    }

    public static void a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!a(e2)) {
                    throw e2;
                }
            } catch (RuntimeException rethrown) {
                throw rethrown;
            } catch (Exception e3) {
            }
        }
    }

    public static boolean a(s source, int timeout, TimeUnit timeUnit) {
        try {
            return b(source, timeout, timeUnit);
        } catch (IOException e2) {
            return false;
        }
    }

    public static boolean b(s source, int duration, TimeUnit timeUnit) {
        long originalDuration;
        long now = System.nanoTime();
        if (source.b().d()) {
            originalDuration = source.b().c() - now;
        } else {
            originalDuration = Long.MAX_VALUE;
        }
        source.b().a(Math.min(originalDuration, timeUnit.toNanos((long) duration)) + now);
        try {
            f.c skipBuffer = new f.c();
            while (source.b(skipBuffer, 8192) != -1) {
                skipBuffer.m();
            }
            if (originalDuration == Long.MAX_VALUE) {
                source.b().a();
            } else {
                source.b().a(now + originalDuration);
            }
            return true;
        } catch (InterruptedIOException e2) {
            if (originalDuration == Long.MAX_VALUE) {
                source.b().a();
            } else {
                source.b().a(now + originalDuration);
            }
            return false;
        } catch (Throwable th) {
            if (originalDuration == Long.MAX_VALUE) {
                source.b().a();
            } else {
                source.b().a(now + originalDuration);
            }
            throw th;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> a(T... elements) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) elements.clone()));
    }

    class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f۳۷۴۹a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f۳۷۵۰b;

        b(String str, boolean z) {
            this.f۳۷۴۹a = str;
            this.f۳۷۵۰b = z;
        }

        public Thread newThread(Runnable runnable) {
            Thread result = new Thread(runnable, this.f۳۷۴۹a);
            result.setDaemon(this.f۳۷۵۰b);
            return result;
        }
    }

    public static ThreadFactory a(String name, boolean daemon) {
        return new b(name, daemon);
    }

    public static String[] a(Comparator<? super String> comparator, String[] first, String[] second) {
        List<String> result = new ArrayList<>();
        for (String a2 : first) {
            int length = second.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(a2, second[i]) == 0) {
                    result.add(a2);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) result.toArray(new String[result.size()]);
    }

    public static boolean b(Comparator<String> comparator, String[] first, String[] second) {
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

    public static String a(e.s url, boolean includeDefaultPort) {
        String host;
        if (url.g().contains(":")) {
            host = "[" + url.g() + "]";
        } else {
            host = url.g();
        }
        if (!includeDefaultPort && url.j() == e.s.c(url.m())) {
            return host;
        }
        return host + ":" + url.j();
    }

    public static boolean a(AssertionError e2) {
        return (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static int a(Comparator<String> comparator, String[] array, String value) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            if (comparator.compare(array[i], value) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static String[] a(String[] array, String value) {
        String[] result = new String[(array.length + 1)];
        System.arraycopy(array, 0, result, 0, array.length);
        result[result.length - 1] = value;
        return result;
    }

    public static int b(String input, int pos, int limit) {
        for (int i = pos; i < limit; i++) {
            char charAt = input.charAt(i);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                return i;
            }
        }
        return limit;
    }

    public static int c(String input, int pos, int limit) {
        for (int i = limit - 1; i >= pos; i--) {
            char charAt = input.charAt(i);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                return i + 1;
            }
        }
        return pos;
    }

    public static String d(String string, int pos, int limit) {
        int start = b(string, pos, limit);
        return string.substring(start, c(string, start, limit));
    }

    public static int a(String input, int pos, int limit, String delimiters) {
        for (int i = pos; i < limit; i++) {
            if (delimiters.indexOf(input.charAt(i)) != -1) {
                return i;
            }
        }
        return limit;
    }

    public static int a(String input, int pos, int limit, char delimiter) {
        for (int i = pos; i < limit; i++) {
            if (input.charAt(i) == delimiter) {
                return i;
            }
        }
        return limit;
    }

    public static String a(String host) {
        InetAddress inetAddress;
        if (host.contains(":")) {
            if (!host.startsWith("[") || !host.endsWith("]")) {
                inetAddress = a(host, 0, host.length());
            } else {
                inetAddress = a(host, 1, host.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return a(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + host + "'");
        }
        try {
            String result = IDN.toASCII(host).toLowerCase(Locale.US);
            if (!result.isEmpty() && !b(result)) {
                return result;
            }
            return null;
        } catch (IllegalArgumentException e2) {
            return null;
        }
    }

    private static boolean b(String hostnameAscii) {
        for (int i = 0; i < hostnameAscii.length(); i++) {
            char c2 = hostnameAscii.charAt(i);
            if (c2 <= 31 || c2 >= 127 || " #%/:?@[\\]".indexOf(c2) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int c(String input) {
        int length = input.length();
        for (int i = 0; i < length; i++) {
            char c2 = input.charAt(i);
            if (c2 <= 31 || c2 >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static boolean d(String host) {
        return f۳۷۴۸g.matcher(host).matches();
    }

    public static String a(String format, Object... args) {
        return String.format(Locale.US, format, args);
    }

    public static AssertionError a(String message, Exception e2) {
        AssertionError assertionError = new AssertionError(message);
        try {
            assertionError.initCause(e2);
        } catch (IllegalStateException e3) {
        }
        return assertionError;
    }

    public static int a(char c2) {
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

    private static InetAddress a(String input, int pos, int limit) {
        byte[] address = new byte[16];
        int b2 = 0;
        int compress = -1;
        int groupOffset = -1;
        int i = pos;
        while (true) {
            if (i >= limit) {
                break;
            } else if (b2 == address.length) {
                return null;
            } else {
                if (i + 2 <= limit && input.regionMatches(i, "::", 0, 2)) {
                    if (compress == -1) {
                        i += 2;
                        b2 += 2;
                        compress = b2;
                        if (i == limit) {
                            break;
                        }
                    } else {
                        return null;
                    }
                } else if (b2 != 0) {
                    if (input.regionMatches(i, ":", 0, 1)) {
                        i++;
                    } else if (!input.regionMatches(i, ".", 0, 1) || !a(input, groupOffset, limit, address, b2 - 2)) {
                        return null;
                    } else {
                        b2 += 2;
                    }
                }
                int value = 0;
                groupOffset = i;
                while (i < limit) {
                    int hexDigit = a(input.charAt(i));
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
                int b3 = b2 + 1;
                address[b2] = (byte) ((value >>> 8) & 255);
                b2 = b3 + 1;
                address[b3] = (byte) (value & 255);
            }
        }
        if (b2 != address.length) {
            if (compress == -1) {
                return null;
            }
            System.arraycopy(address, compress, address, address.length - (b2 - compress), b2 - compress);
            Arrays.fill(address, compress, (address.length - b2) + compress, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(address);
        } catch (UnknownHostException e2) {
            throw new AssertionError();
        }
    }

    private static boolean a(String input, int pos, int limit, byte[] address, int addressOffset) {
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
            while (i < limit) {
                char c2 = input.charAt(i);
                if (c2 < '0' || c2 > '9') {
                    break;
                } else if ((value == 0 && i != i) || ((value * 10) + c2) - 48 > 255) {
                    return false;
                } else {
                    i++;
                }
            }
            if (i - i == 0) {
                return false;
            }
            address[b2] = (byte) value;
            b2++;
        }
        if (b2 != addressOffset + 4) {
            return false;
        }
        return true;
    }

    private static String a(byte[] address) {
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
        f.c result = new f.c();
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
                result.a((long) (((address[i2] & 255) << 8) | (address[i2 + 1] & 255)));
                i2 += 2;
            }
        }
        return result.p();
    }
}
