package e;

import e.f0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f۴۰۹۹a;

    r(a builder) {
        List<String> list = builder.f۴۱۰۰a;
        this.f۴۰۹۹a = (String[]) list.toArray(new String[list.size()]);
    }

    public String a(String name) {
        return a(this.f۴۰۹۹a, name);
    }

    public int b() {
        return this.f۴۰۹۹a.length / 2;
    }

    public String a(int index) {
        return this.f۴۰۹۹a[index * 2];
    }

    public String b(int index) {
        return this.f۴۰۹۹a[(index * 2) + 1];
    }

    public List<String> b(String name) {
        List<String> result = null;
        int size = b();
        for (int i = 0; i < size; i++) {
            if (name.equalsIgnoreCase(a(i))) {
                if (result == null) {
                    result = new ArrayList<>(2);
                }
                result.add(b(i));
            }
        }
        if (result != null) {
            return Collections.unmodifiableList(result);
        }
        return Collections.emptyList();
    }

    public a a() {
        a result = new a();
        Collections.addAll(result.f۴۱۰۰a, this.f۴۰۹۹a);
        return result;
    }

    public boolean equals(Object other) {
        return (other instanceof r) && Arrays.equals(((r) other).f۴۰۹۹a, this.f۴۰۹۹a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f۴۰۹۹a);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        int size = b();
        for (int i = 0; i < size; i++) {
            result.append(a(i));
            result.append(": ");
            result.append(b(i));
            result.append("\n");
        }
        return result.toString();
    }

    private static String a(String[] namesAndValues, String name) {
        for (int i = namesAndValues.length - 2; i >= 0; i -= 2) {
            if (name.equalsIgnoreCase(namesAndValues[i])) {
                return namesAndValues[i + 1];
            }
        }
        return null;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<String> f۴۱۰۰a = new ArrayList(20);

        /* access modifiers changed from: package-private */
        public a a(String line) {
            int index = line.indexOf(":", 1);
            if (index != -1) {
                b(line.substring(0, index), line.substring(index + 1));
                return this;
            } else if (line.startsWith(":")) {
                b("", line.substring(1));
                return this;
            } else {
                b("", line);
                return this;
            }
        }

        public a a(String name, String value) {
            d(name, value);
            b(name, value);
            return this;
        }

        /* access modifiers changed from: package-private */
        public a b(String name, String value) {
            this.f۴۱۰۰a.add(name);
            this.f۴۱۰۰a.add(value.trim());
            return this;
        }

        public a c(String name) {
            int i = 0;
            while (i < this.f۴۱۰۰a.size()) {
                if (name.equalsIgnoreCase(this.f۴۱۰۰a.get(i))) {
                    this.f۴۱۰۰a.remove(i);
                    this.f۴۱۰۰a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public a c(String name, String value) {
            d(name, value);
            c(name);
            b(name, value);
            return this;
        }

        private void d(String name, String value) {
            if (name == null) {
                throw new NullPointerException("name == null");
            } else if (!name.isEmpty()) {
                int length = name.length();
                for (int i = 0; i < length; i++) {
                    char c2 = name.charAt(i);
                    if (c2 <= ' ' || c2 >= 127) {
                        throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(c2), Integer.valueOf(i), name));
                    }
                }
                if (value != null) {
                    int length2 = value.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char c3 = value.charAt(i2);
                        if ((c3 <= 31 && c3 != '\t') || c3 >= 127) {
                            throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(c3), Integer.valueOf(i2), name, value));
                        }
                    }
                    return;
                }
                throw new NullPointerException("value for name " + name + " == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        public String b(String name) {
            for (int i = this.f۴۱۰۰a.size() - 2; i >= 0; i -= 2) {
                if (name.equalsIgnoreCase(this.f۴۱۰۰a.get(i))) {
                    return this.f۴۱۰۰a.get(i + 1);
                }
            }
            return null;
        }

        public r a() {
            return new r(this);
        }
    }
}
