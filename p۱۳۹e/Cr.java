package p۱۳۹e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p۱۳۹e.p۱۴۰f0.Cc;

/* renamed from: e.r  reason: invalid class name */
public final class Cr {

    /* renamed from: a  reason: contains not printable characters */
    private final String[] f۱۶۱۴۶a;

    Cr(Ca builder) {
        List<String> list = builder.f۱۶۱۴۷a;
        this.f۱۶۱۴۶a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۲۰۱a(String name) {
        return m۱۹۱۹۸a(this.f۱۶۱۴۶a, name);
    }

    /* renamed from: b  reason: contains not printable characters */
    public int m۱۹۲۰۲b() {
        return this.f۱۶۱۴۶a.length / 2;
    }

    /* renamed from: a  reason: contains not printable characters */
    public String m۱۹۲۰۰a(int index) {
        return this.f۱۶۱۴۶a[index * 2];
    }

    /* renamed from: b  reason: contains not printable characters */
    public String m۱۹۲۰۳b(int index) {
        return this.f۱۶۱۴۶a[(index * 2) + 1];
    }

    /* renamed from: b  reason: contains not printable characters */
    public List<String> m۱۹۲۰۴b(String name) {
        List<String> result = null;
        int size = m۱۹۲۰۲b();
        for (int i = 0; i < size; i++) {
            if (name.equalsIgnoreCase(m۱۹۲۰۰a(i))) {
                if (result == null) {
                    result = new ArrayList<>(2);
                }
                result.add(m۱۹۲۰۳b(i));
            }
        }
        if (result != null) {
            return Collections.unmodifiableList(result);
        }
        return Collections.emptyList();
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ca m۱۹۱۹۹a() {
        Ca result = new Ca();
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
        int size = m۱۹۲۰۲b();
        for (int i = 0; i < size; i++) {
            result.append(m۱۹۲۰۰a(i));
            result.append(": ");
            result.append(m۱۹۲۰۳b(i));
            result.append("\n");
        }
        return result.toString();
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۹۱۹۸a(String[] namesAndValues, String name) {
        for (int i = namesAndValues.length - 2; i >= 0; i -= 2) {
            if (name.equalsIgnoreCase(namesAndValues[i])) {
                return namesAndValues[i + 1];
            }
        }
        return null;
    }

    /* renamed from: e.r$a  reason: invalid class name */
    public static final class Ca {

        /* renamed from: a  reason: contains not printable characters */
        final List<String> f۱۶۱۴۷a = new ArrayList(20);

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۲۰۶a(String line) {
            int index = line.indexOf(":", 1);
            if (index != -1) {
                m۱۹۲۰۹b(line.substring(0, index), line.substring(index + 1));
                return this;
            } else if (line.startsWith(":")) {
                m۱۹۲۰۹b("", line.substring(1));
                return this;
            } else {
                m۱۹۲۰۹b("", line);
                return this;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public Ca m۱۹۲۰۷a(String name, String value) {
            m۱۹۲۰۵d(name, value);
            m۱۹۲۰۹b(name, value);
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public Ca m۱۹۲۰۹b(String name, String value) {
            this.f۱۶۱۴۷a.add(name);
            this.f۱۶۱۴۷a.add(value.trim());
            return this;
        }

        /* renamed from: c  reason: contains not printable characters */
        public Ca m۱۹۲۱۱c(String name) {
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

        /* renamed from: c  reason: contains not printable characters */
        public Ca m۱۹۲۱۲c(String name, String value) {
            m۱۹۲۰۵d(name, value);
            m۱۹۲۱۱c(name);
            m۱۹۲۰۹b(name, value);
            return this;
        }

        /* renamed from: d  reason: contains not printable characters */
        private void m۱۹۲۰۵d(String name, String value) {
            if (name == null) {
                throw new NullPointerException("name == null");
            } else if (!name.isEmpty()) {
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    char c = name.charAt(i);
                    if (c <= ' ' || c >= 127) {
                        throw new IllegalArgumentException(Cc.m۱۸۶۱۴a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(c), Integer.valueOf(i), name));
                    }
                }
                if (value != null) {
                    int length2 = value.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char c2 = value.charAt(i2);
                        if ((c2 <= 31 && c2 != '\t') || c2 >= 127) {
                            throw new IllegalArgumentException(Cc.m۱۸۶۱۴a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(c2), Integer.valueOf(i2), name, value));
                        }
                    }
                    return;
                }
                throw new NullPointerException("value for name " + name + " == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        public String m۱۹۲۱۰b(String name) {
            for (int i = this.f۱۶۱۴۷a.size() - 2; i >= 0; i -= 2) {
                if (name.equalsIgnoreCase(this.f۱۶۱۴۷a.get(i))) {
                    return this.f۱۶۱۴۷a.get(i + 1);
                }
            }
            return null;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cr m۱۹۲۰۸a() {
            return new Cr(this);
        }
    }
}
