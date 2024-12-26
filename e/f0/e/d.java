package e.f0.e;

import e.f0.k.f;
import f.l;
import f.r;
import f.s;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.cache.DiskLruCache;

public final class d implements Closeable, Flushable {
    static final Pattern w = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: c  reason: collision with root package name */
    final e.f0.j.a f۳۷۶۶c;

    /* renamed from: d  reason: collision with root package name */
    final File f۳۷۶۷d;

    /* renamed from: e  reason: collision with root package name */
    private final File f۳۷۶۸e;

    /* renamed from: f  reason: collision with root package name */
    private final File f۳۷۶۹f;

    /* renamed from: g  reason: collision with root package name */
    private final File f۳۷۷۰g;

    /* renamed from: h  reason: collision with root package name */
    private final int f۳۷۷۱h;
    private long i;
    final int j;
    private long k = 0;
    f.d l;
    final LinkedHashMap<String, C۰۱۱۸d> m = new LinkedHashMap<>(0, 0.75f, true);
    int n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    private long t = 0;
    private final Executor u;
    private final Runnable v = new a();

    class a implements Runnable {
        a() {
        }

        public void run() {
            synchronized (d.this) {
                if (!(!d.this.p) && !d.this.q) {
                    try {
                        d.this.q();
                    } catch (IOException e2) {
                        d.this.r = true;
                    }
                    try {
                        if (d.this.o()) {
                            d.this.p();
                            d.this.n = 0;
                        }
                    } catch (IOException e3) {
                        d.this.s = true;
                        d.this.l = l.a(l.a());
                    }
                }
            }
        }
    }

    d(e.f0.j.a fileSystem, File directory, int appVersion, int valueCount, long maxSize, Executor executor) {
        this.f۳۷۶۶c = fileSystem;
        this.f۳۷۶۷d = directory;
        this.f۳۷۷۱h = appVersion;
        this.f۳۷۶۸e = new File(directory, "journal");
        this.f۳۷۶۹f = new File(directory, "journal.tmp");
        this.f۳۷۷۰g = new File(directory, "journal.bkp");
        this.j = valueCount;
        this.i = maxSize;
        this.u = executor;
    }

    public synchronized void m() {
        if (!this.p) {
            if (this.f۳۷۶۶c.f(this.f۳۷۷۰g)) {
                if (this.f۳۷۶۶c.f(this.f۳۷۶۸e)) {
                    this.f۳۷۶۶c.a(this.f۳۷۷۰g);
                } else {
                    this.f۳۷۶۶c.a(this.f۳۷۷۰g, this.f۳۷۶۸e);
                }
            }
            if (this.f۳۷۶۶c.f(this.f۳۷۶۸e)) {
                try {
                    u();
                    t();
                    this.p = true;
                    return;
                } catch (IOException journalIsCorrupt) {
                    f d2 = f.d();
                    d2.a(5, "DiskLruCache " + this.f۳۷۶۷d + " is corrupt: " + journalIsCorrupt.getMessage() + ", removing", journalIsCorrupt);
                    l();
                    this.q = false;
                } catch (Throwable th) {
                    this.q = false;
                    throw th;
                }
            }
            p();
            this.p = true;
        }
    }

    public static d a(e.f0.j.a fileSystem, File directory, int appVersion, int valueCount, long maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (valueCount > 0) {
            return new d(fileSystem, directory, appVersion, valueCount, maxSize, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), e.f0.c.a("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    private void u() {
        f.e source = l.a(this.f۳۷۶۶c.b(this.f۳۷۶۸e));
        try {
            String magic = source.f();
            String version = source.f();
            String appVersionString = source.f();
            String valueCountString = source.f();
            String blank = source.f();
            if (!"libcore.io.DiskLruCache".equals(magic) || !"1".equals(version) || !Integer.toString(this.f۳۷۷۱h).equals(appVersionString) || !Integer.toString(this.j).equals(valueCountString) || !"".equals(blank)) {
                throw new IOException("unexpected journal header: [" + magic + ", " + version + ", " + valueCountString + ", " + blank + "]");
            }
            int lineCount = 0;
            while (true) {
                try {
                    e(source.f());
                    lineCount++;
                } catch (EOFException e2) {
                    this.n = lineCount - this.m.size();
                    if (!source.i()) {
                        p();
                    } else {
                        this.l = s();
                    }
                    return;
                }
            }
        } finally {
            e.f0.c.a(source);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends e {
        b(r delegate) {
            super(delegate);
        }

        /* access modifiers changed from: protected */
        @Override // e.f0.e.e
        public void a(IOException e2) {
            d.this.o = true;
        }
    }

    private f.d s() {
        return l.a(new b(this.f۳۷۶۶c.e(this.f۳۷۶۸e)));
    }

    private void e(String line) {
        String key;
        int firstSpace = line.indexOf(32);
        if (firstSpace != -1) {
            int keyBegin = firstSpace + 1;
            int secondSpace = line.indexOf(32, keyBegin);
            if (secondSpace == -1) {
                key = line.substring(keyBegin);
                if (firstSpace == "REMOVE".length() && line.startsWith("REMOVE")) {
                    this.m.remove(key);
                    return;
                }
            } else {
                key = line.substring(keyBegin, secondSpace);
            }
            C۰۱۱۸d entry = this.m.get(key);
            if (entry == null) {
                entry = new C۰۱۱۸d(key);
                this.m.put(key, entry);
            }
            if (secondSpace != -1 && firstSpace == "CLEAN".length() && line.startsWith("CLEAN")) {
                String[] parts = line.substring(secondSpace + 1).split(" ");
                entry.f۳۷۸۳e = true;
                entry.f۳۷۸۴f = null;
                entry.a(parts);
            } else if (secondSpace == -1 && firstSpace == "DIRTY".length() && line.startsWith("DIRTY")) {
                entry.f۳۷۸۴f = new c(entry);
            } else if (secondSpace != -1 || firstSpace != "READ".length() || !line.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + line);
            }
        } else {
            throw new IOException("unexpected journal line: " + line);
        }
    }

    private void t() {
        this.f۳۷۶۶c.a(this.f۳۷۶۹f);
        Iterator<DiskLruCache.Entry> i2 = this.m.values().iterator();
        while (i2.hasNext()) {
            C۰۱۱۸d entry = (C۰۱۱۸d) i2.next();
            if (entry.f۳۷۸۴f == null) {
                for (int t2 = 0; t2 < this.j; t2++) {
                    this.k += entry.f۳۷۸۰b[t2];
                }
            } else {
                entry.f۳۷۸۴f = null;
                for (int t3 = 0; t3 < this.j; t3++) {
                    this.f۳۷۶۶c.a(entry.f۳۷۸۱c[t3]);
                    this.f۳۷۶۶c.a(entry.f۳۷۸۲d[t3]);
                }
                i2.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public synchronized void p() {
        if (this.l != null) {
            this.l.close();
        }
        f.d writer = l.a(this.f۳۷۶۶c.c(this.f۳۷۶۹f));
        try {
            writer.a("libcore.io.DiskLruCache").writeByte(10);
            writer.a("1").writeByte(10);
            writer.e((long) this.f۳۷۷۱h).writeByte(10);
            writer.e((long) this.j).writeByte(10);
            writer.writeByte(10);
            for (C۰۱۱۸d entry : this.m.values()) {
                if (entry.f۳۷۸۴f != null) {
                    writer.a("DIRTY").writeByte(32);
                    writer.a(entry.f۳۷۷۹a);
                    writer.writeByte(10);
                } else {
                    writer.a("CLEAN").writeByte(32);
                    writer.a(entry.f۳۷۷۹a);
                    entry.a(writer);
                    writer.writeByte(10);
                }
            }
            writer.close();
            if (this.f۳۷۶۶c.f(this.f۳۷۶۸e)) {
                this.f۳۷۶۶c.a(this.f۳۷۶۸e, this.f۳۷۷۰g);
            }
            this.f۳۷۶۶c.a(this.f۳۷۶۹f, this.f۳۷۶۸e);
            this.f۳۷۶۶c.a(this.f۳۷۷۰g);
            this.l = s();
            this.o = false;
            this.s = false;
        } catch (Throwable th) {
            writer.close();
            throw th;
        }
    }

    public synchronized e c(String key) {
        m();
        r();
        f(key);
        C۰۱۱۸d entry = this.m.get(key);
        if (entry != null) {
            if (entry.f۳۷۸۳e) {
                e snapshot = entry.a();
                if (snapshot == null) {
                    return null;
                }
                this.n++;
                this.l.a("READ").writeByte(32).a(key).writeByte(10);
                if (o()) {
                    this.u.execute(this.v);
                }
                return snapshot;
            }
        }
        return null;
    }

    public c b(String key) {
        return a(key, -1);
    }

    /* access modifiers changed from: package-private */
    public synchronized c a(String key, long expectedSequenceNumber) {
        m();
        r();
        f(key);
        C۰۱۱۸d entry = this.m.get(key);
        if (expectedSequenceNumber != -1 && (entry == null || entry.f۳۷۸۵g != expectedSequenceNumber)) {
            return null;
        }
        if (entry != null && entry.f۳۷۸۴f != null) {
            return null;
        }
        if (this.r || this.s) {
            this.u.execute(this.v);
            return null;
        }
        this.l.a("DIRTY").writeByte(32).a(key).writeByte(10);
        this.l.flush();
        if (this.o) {
            return null;
        }
        if (entry == null) {
            entry = new C۰۱۱۸d(key);
            this.m.put(key, entry);
        }
        c editor = new c(entry);
        entry.f۳۷۸۴f = editor;
        return editor;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(c editor, boolean success) {
        C۰۱۱۸d entry = editor.f۳۷۷۴a;
        if (entry.f۳۷۸۴f == editor) {
            if (success && !entry.f۳۷۸۳e) {
                for (int i2 = 0; i2 < this.j; i2++) {
                    if (!editor.f۳۷۷۵b[i2]) {
                        editor.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    } else if (!this.f۳۷۶۶c.f(entry.f۳۷۸۲d[i2])) {
                        editor.a();
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.j; i3++) {
                File dirty = entry.f۳۷۸۲d[i3];
                if (!success) {
                    this.f۳۷۶۶c.a(dirty);
                } else if (this.f۳۷۶۶c.f(dirty)) {
                    File clean = entry.f۳۷۸۱c[i3];
                    this.f۳۷۶۶c.a(dirty, clean);
                    long oldLength = entry.f۳۷۸۰b[i3];
                    long newLength = this.f۳۷۶۶c.g(clean);
                    entry.f۳۷۸۰b[i3] = newLength;
                    this.k = (this.k - oldLength) + newLength;
                }
            }
            this.n++;
            entry.f۳۷۸۴f = null;
            if (entry.f۳۷۸۳e || success) {
                entry.f۳۷۸۳e = true;
                this.l.a("CLEAN").writeByte(32);
                this.l.a(entry.f۳۷۷۹a);
                entry.a(this.l);
                this.l.writeByte(10);
                if (success) {
                    long j2 = this.t;
                    this.t = 1 + j2;
                    entry.f۳۷۸۵g = j2;
                }
            } else {
                this.m.remove(entry.f۳۷۷۹a);
                this.l.a("REMOVE").writeByte(32);
                this.l.a(entry.f۳۷۷۹a);
                this.l.writeByte(10);
            }
            this.l.flush();
            if (this.k > this.i || o()) {
                this.u.execute(this.v);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    public boolean o() {
        int i2 = this.n;
        return i2 >= 2000 && i2 >= this.m.size();
    }

    public synchronized boolean d(String key) {
        m();
        r();
        f(key);
        C۰۱۱۸d entry = this.m.get(key);
        if (entry == null) {
            return false;
        }
        boolean removed = a(entry);
        if (removed && this.k <= this.i) {
            this.r = false;
        }
        return removed;
    }

    /* access modifiers changed from: package-private */
    public boolean a(C۰۱۱۸d entry) {
        c cVar = entry.f۳۷۸۴f;
        if (cVar != null) {
            cVar.c();
        }
        for (int i2 = 0; i2 < this.j; i2++) {
            this.f۳۷۶۶c.a(entry.f۳۷۸۱c[i2]);
            long j2 = this.k;
            long[] jArr = entry.f۳۷۸۰b;
            this.k = j2 - jArr[i2];
            jArr[i2] = 0;
        }
        this.n++;
        this.l.a("REMOVE").writeByte(32).a(entry.f۳۷۷۹a).writeByte(10);
        this.m.remove(entry.f۳۷۷۹a);
        if (o()) {
            this.u.execute(this.v);
        }
        return true;
    }

    public synchronized boolean n() {
        return this.q;
    }

    private synchronized void r() {
        if (n()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.p) {
            r();
            q();
            this.l.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.p) {
            if (!this.q) {
                C۰۱۱۸d[] dVarArr = (C۰۱۱۸d[]) this.m.values().toArray(new C۰۱۱۸d[this.m.size()]);
                for (C۰۱۱۸d entry : dVarArr) {
                    if (entry.f۳۷۸۴f != null) {
                        entry.f۳۷۸۴f.a();
                    }
                }
                q();
                this.l.close();
                this.l = null;
                this.q = true;
                return;
            }
        }
        this.q = true;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        while (this.k > this.i) {
            a(this.m.values().iterator().next());
        }
        this.r = false;
    }

    public void l() {
        close();
        this.f۳۷۶۶c.d(this.f۳۷۶۷d);
    }

    private void f(String key) {
        if (!w.matcher(key).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + key + "\"");
        }
    }

    public final class e implements Closeable {

        /* renamed from: c  reason: collision with root package name */
        private final String f۳۷۸۷c;

        /* renamed from: d  reason: collision with root package name */
        private final long f۳۷۸۸d;

        /* renamed from: e  reason: collision with root package name */
        private final s[] f۳۷۸۹e;

        e(String key, long sequenceNumber, s[] sources, long[] lengths) {
            this.f۳۷۸۷c = key;
            this.f۳۷۸۸d = sequenceNumber;
            this.f۳۷۸۹e = sources;
        }

        public c l() {
            return d.this.a(this.f۳۷۸۷c, this.f۳۷۸۸d);
        }

        public s a(int index) {
            return this.f۳۷۸۹e[index];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (s in : this.f۳۷۸۹e) {
                e.f0.c.a(in);
            }
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        final C۰۱۱۸d f۳۷۷۴a;

        /* renamed from: b  reason: collision with root package name */
        final boolean[] f۳۷۷۵b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f۳۷۷۶c;

        c(C۰۱۱۸d entry) {
            this.f۳۷۷۴a = entry;
            this.f۳۷۷۵b = entry.f۳۷۸۳e ? null : new boolean[d.this.j];
        }

        /* access modifiers changed from: package-private */
        public void c() {
            if (this.f۳۷۷۴a.f۳۷۸۴f == this) {
                int i = 0;
                while (true) {
                    d dVar = d.this;
                    if (i < dVar.j) {
                        try {
                            dVar.f۳۷۶۶c.a(this.f۳۷۷۴a.f۳۷۸۲d[i]);
                        } catch (IOException e2) {
                        }
                        i++;
                    } else {
                        this.f۳۷۷۴a.f۳۷۸۴f = null;
                        return;
                    }
                }
            }
        }

        public r a(int index) {
            synchronized (d.this) {
                if (this.f۳۷۷۶c) {
                    throw new IllegalStateException();
                } else if (this.f۳۷۷۴a.f۳۷۸۴f != this) {
                    return l.a();
                } else {
                    if (!this.f۳۷۷۴a.f۳۷۸۳e) {
                        this.f۳۷۷۵b[index] = true;
                    }
                    try {
                        return new a(d.this.f۳۷۶۶c.c(this.f۳۷۷۴a.f۳۷۸۲d[index]));
                    } catch (FileNotFoundException e2) {
                        return l.a();
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public class a extends e {
            a(r delegate) {
                super(delegate);
            }

            /* access modifiers changed from: protected */
            @Override // e.f0.e.e
            public void a(IOException e2) {
                synchronized (d.this) {
                    c.this.c();
                }
            }
        }

        public void b() {
            synchronized (d.this) {
                if (!this.f۳۷۷۶c) {
                    if (this.f۳۷۷۴a.f۳۷۸۴f == this) {
                        d.this.a(this, true);
                    }
                    this.f۳۷۷۶c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        public void a() {
            synchronized (d.this) {
                if (!this.f۳۷۷۶c) {
                    if (this.f۳۷۷۴a.f۳۷۸۴f == this) {
                        d.this.a(this, false);
                    }
                    this.f۳۷۷۶c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.f0.e.d$d  reason: collision with other inner class name */
    public final class C۰۱۱۸d {

        /* renamed from: a  reason: collision with root package name */
        final String f۳۷۷۹a;

        /* renamed from: b  reason: collision with root package name */
        final long[] f۳۷۸۰b;

        /* renamed from: c  reason: collision with root package name */
        final File[] f۳۷۸۱c;

        /* renamed from: d  reason: collision with root package name */
        final File[] f۳۷۸۲d;

        /* renamed from: e  reason: collision with root package name */
        boolean f۳۷۸۳e;

        /* renamed from: f  reason: collision with root package name */
        c f۳۷۸۴f;

        /* renamed from: g  reason: collision with root package name */
        long f۳۷۸۵g;

        C۰۱۱۸d(String key) {
            this.f۳۷۷۹a = key;
            int i = d.this.j;
            this.f۳۷۸۰b = new long[i];
            this.f۳۷۸۱c = new File[i];
            this.f۳۷۸۲d = new File[i];
            StringBuilder fileBuilder = new StringBuilder(key).append('.');
            int truncateTo = fileBuilder.length();
            for (int i2 = 0; i2 < d.this.j; i2++) {
                fileBuilder.append(i2);
                this.f۳۷۸۱c[i2] = new File(d.this.f۳۷۶۷d, fileBuilder.toString());
                fileBuilder.append(".tmp");
                this.f۳۷۸۲d[i2] = new File(d.this.f۳۷۶۷d, fileBuilder.toString());
                fileBuilder.setLength(truncateTo);
            }
        }

        /* access modifiers changed from: package-private */
        public void a(String[] strings) {
            if (strings.length == d.this.j) {
                for (int i = 0; i < strings.length; i++) {
                    try {
                        this.f۳۷۸۰b[i] = Long.parseLong(strings[i]);
                    } catch (NumberFormatException e2) {
                        b(strings);
                        throw null;
                    }
                }
                return;
            }
            b(strings);
            throw null;
        }

        /* access modifiers changed from: package-private */
        public void a(f.d writer) {
            for (long length : this.f۳۷۸۰b) {
                writer.writeByte(32).e(length);
            }
        }

        private IOException b(String[] strings) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strings));
        }

        /* access modifiers changed from: package-private */
        public e a() {
            if (Thread.holdsLock(d.this)) {
                s[] sources = new s[d.this.j];
                long[] lengths = (long[]) this.f۳۷۸۰b.clone();
                for (int i = 0; i < d.this.j; i++) {
                    try {
                        sources[i] = d.this.f۳۷۶۶c.b(this.f۳۷۸۱c[i]);
                    } catch (FileNotFoundException e2) {
                        int i2 = 0;
                        while (i2 < d.this.j && sources[i2] != null) {
                            e.f0.c.a(sources[i2]);
                            i2++;
                        }
                        try {
                            d.this.a(this);
                            return null;
                        } catch (IOException e3) {
                            return null;
                        }
                    }
                }
                return new e(this.f۳۷۷۹a, this.f۳۷۸۵g, sources, lengths);
            }
            throw new AssertionError();
        }
    }
}
