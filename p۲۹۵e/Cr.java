package p۲۹۵e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.r, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cr {

    /* renamed from: a, reason: contains not printable characters */
    private final String[] f۱۶۱۴۶a;

    Cr(a builder) {
        List<String> list = builder.f۱۶۱۴۷a;
        this.f۱۶۱۴۶a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۱۲۲a(String name) {
        return m۱۷۱۱۹a(this.f۱۶۱۴۶a, name);
    }

    /* renamed from: b, reason: contains not printable characters */
    public int m۱۷۱۲۳b() {
        return this.f۱۶۱۴۶a.length / 2;
    }

    /* renamed from: a, reason: contains not printable characters */
    public String m۱۷۱۲۱a(int index) {
        return this.f۱۶۱۴۶a[index * 2];
    }

    /* renamed from: b, reason: contains not printable characters */
    public String m۱۷۱۲۴b(int index) {
        return this.f۱۶۱۴۶a[(index * 2) + 1];
    }

    /* renamed from: b, reason: contains not printable characters */
    public List<String> m۱۷۱۲۵b(String name) {
        List<String> result = null;
        int size = m۱۷۱۲۳b();
        for (int i = 0; i < size; i++) {
            if (name.equalsIgnoreCase(m۱۷۱۲۱a(i))) {
                if (result == null) {
                    result = new ArrayList<>(2);
                }
                result.add(m۱۷۱۲۴b(i));
            }
        }
        if (result != null) {
            return Collections.unmodifiableList(result);
        }
        return Collections.emptyList();
    }

    /* renamed from: a, reason: contains not printable characters */
    public a m۱۷۱۲۰a() {
        a result = new a();
        Collections.addAll(result.f۱۶۱۴۷a, this.f۱۶۱۴۶a);
        return result;
    }

    public boolean equals(Object other) {
        return (other instanceof Cr) && Arrays.equals(((Cr) other).f۱۶۱۴۶a, this.f۱۶۱۴۶a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f۱۶۱۴۶a);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        int size = m۱۷۱۲۳b();
        for (int i = 0; i < size; i++) {
            result.append(m۱۷۱۲۱a(i));
            result.append(": ");
            result.append(m۱۷۱۲۴b(i));
            result.append("\n");
        }
        return result.toString();
    }

    /* renamed from: a, reason: contains not printable characters */
    private static String m۱۷۱۱۹a(String[] namesAndValues, String name) {
        for (int i = namesAndValues.length - 2; i >= 0; i -= 2) {
            if (name.equalsIgnoreCase(namesAndValues[i])) {
                return namesAndValues[i + 1];
            }
        }
        return null;
    }

    /* renamed from: e.r$a */
    public static final class a {

        /* renamed from: a, reason: contains not printable characters */
        final List<String> f۱۶۱۴۷a = new ArrayList(20);

        /* renamed from: a, reason: contains not printable characters */
        a m۱۷۱۲۷a(String line) {
            int index = line.indexOf(":", 1);
            if (index != -1) {
                m۱۷۱۳۰b(line.substring(0, index), line.substring(index + 1));
                return this;
            }
            if (line.startsWith(":")) {
                m۱۷۱۳۰b("", line.substring(1));
                return this;
            }
            m۱۷۱۳۰b("", line);
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public a m۱۷۱۲۸a(String name, String value) {
            m۱۷۱۲۶d(name, value);
            m۱۷۱۳۰b(name, value);
            return this;
        }

        /* renamed from: b, reason: contains not printable characters */
        a m۱۷۱۳۰b(String name, String value) {
            this.f۱۶۱۴۷a.add(name);
            this.f۱۶۱۴۷a.add(value.trim());
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public a m۱۷۱۳۲c(String name) {
            int i = 0;
            while (i < this.f۱۶۱۴۷a.size()) {
                if (name.equalsIgnoreCase(this.f۱۶۱۴۷a.get(i))) {
                    this.f۱۶۱۴۷a.remove(i);
                    this.f۱۶۱۴۷a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: c, reason: contains not printable characters */
        public a m۱۷۱۳۳c(String name, String value) {
            m۱۷۱۲۶d(name, value);
            m۱۷۱۳۲c(name);
            m۱۷۱۳۰b(name, value);
            return this;
        }

        /* renamed from: d, reason: contains not printable characters */
        private void m۱۷۱۲۶d(String name, String value) {
            if (name == null) {
                throw new NullPointerException("name == null");
            }
            if (name.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char c2 = name.charAt(i);
                if (c2 <= ' ' || c2 >= 127) {
                    throw new IllegalArgumentException(Cc.m۱۶۵۳۵a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(c2), Integer.valueOf(i), name));
                }
            }
            if (value == null) {
                throw new NullPointerException("value for name " + name + " == null");
            }
            int length2 = value.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char c3 = value.charAt(i2);
                if ((c3 <= 31 && c3 != '\t') || c3 >= 127) {
                    throw new IllegalArgumentException(Cc.m۱۶۵۳۵a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(c3), Integer.valueOf(i2), name, value));
                }
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        public String m۱۷۱۳۱b(String name) {
            for (int i = this.f۱۶۱۴۷a.size() - 2; i >= 0; i -= 2) {
                if (name.equalsIgnoreCase(this.f۱۶۱۴۷a.get(i))) {
                    return this.f۱۶۱۴۷a.get(i + 1);
                }
            }
            return null;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Cr m۱۷۱۲۹a() {
            return new Cr(this);
        }
    }
}
