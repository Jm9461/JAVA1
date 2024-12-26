package p۱۳۹e.p۱۴۰f0.p۱۴۱e;

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
import p۱۳۹e.p۱۴۰f0.p۱۴۶j.AbstractCa;
import p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf;
import p۱۴۹f.AbstractCd;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.AbstractCr;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cl;

/* renamed from: e.f0.e.d  reason: invalid class name */
public final class Cd implements Closeable, Flushable {

    /* renamed from: w  reason: contains not printable characters */
    static final Pattern f۱۵۷۳۱w = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: c  reason: contains not printable characters */
    final AbstractCa f۱۵۷۳۲c;

    /* renamed from: d  reason: contains not printable characters */
    final File f۱۵۷۳۳d;

    /* renamed from: e  reason: contains not printable characters */
    private final File f۱۵۷۳۴e;

    /* renamed from: f  reason: contains not printable characters */
    private final File f۱۵۷۳۵f;

    /* renamed from: g  reason: contains not printable characters */
    private final File f۱۵۷۳۶g;

    /* renamed from: h  reason: contains not printable characters */
    private final int f۱۵۷۳۷h;

    /* renamed from: i  reason: contains not printable characters */
    private long f۱۵۷۳۸i;

    /* renamed from: j  reason: contains not printable characters */
    final int f۱۵۷۳۹j;

    /* renamed from: k  reason: contains not printable characters */
    private long f۱۵۷۴۰k = 0;

    /* renamed from: l  reason: contains not printable characters */
    AbstractCd f۱۵۷۴۱l;

    /* renamed from: m  reason: contains not printable characters */
    final LinkedHashMap<String, Cd> f۱۵۷۴۲m = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: n  reason: contains not printable characters */
    int f۱۵۷۴۳n;

    /* renamed from: o  reason: contains not printable characters */
    boolean f۱۵۷۴۴o;

    /* renamed from: p  reason: contains not printable characters */
    boolean f۱۵۷۴۵p;

    /* renamed from: q  reason: contains not printable characters */
    boolean f۱۵۷۴۶q;

    /* renamed from: r  reason: contains not printable characters */
    boolean f۱۵۷۴۷r;

    /* renamed from: s  reason: contains not printable characters */
    boolean f۱۵۷۴۸s;

    /* renamed from: t  reason: contains not printable characters */
    private long f۱۵۷۴۹t = 0;

    /* renamed from: u  reason: contains not printable characters */
    private final Executor f۱۵۷۵۰u;

    /* renamed from: v  reason: contains not printable characters */
    private final Runnable f۱۵۷۵۱v = new RunnableCa();

    /* renamed from: e.f0.e.d$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            synchronized (Cd.this) {
                if (!(!Cd.this.f۱۵۷۴۵p) && !Cd.this.f۱۵۷۴۶q) {
                    try {
                        Cd.this.m۱۸۶۷۴q();
                    } catch (IOException e) {
                        Cd.this.f۱۵۷۴۷r = true;
                    }
                    try {
                        if (Cd.this.m۱۸۶۷۲o()) {
                            Cd.this.m۱۸۶۷۳p();
                            Cd.this.f۱۵۷۴۳n = 0;
                        }
                    } catch (IOException e2) {
                        Cd.this.f۱۵۷۴۸s = true;
                        Cd.this.f۱۵۷۴۱l = Cl.m۱۹۴۷۹a(Cl.m۱۹۴۸۱a());
                    }
                }
            }
        }
    }

    Cd(AbstractCa fileSystem, File directory, int appVersion, int valueCount, long maxSize, Executor executor) {
        this.f۱۵۷۳۲c = fileSystem;
        this.f۱۵۷۳۳d = directory;
        this.f۱۵۷۳۷h = appVersion;
        this.f۱۵۷۳۴e = new File(directory, "journal");
        this.f۱۵۷۳۵f = new File(directory, "journal.tmp");
        this.f۱۵۷۳۶g = new File(directory, "journal.bkp");
        this.f۱۵۷۳۹j = valueCount;
        this.f۱۵۷۳۸i = maxSize;
        this.f۱۵۷۵۰u = executor;
    }

    /* renamed from: m  reason: contains not printable characters */
    public synchronized void m۱۸۶۷۰m() {
        if (!this.f۱۵۷۴۵p) {
            if (this.f۱۵۷۳۲c.m۱۹۰۳۶f(this.f۱۵۷۳۶g)) {
                if (this.f۱۵۷۳۲c.m۱۹۰۳۶f(this.f۱۵۷۳۴e)) {
                    this.f۱۵۷۳۲c.m۱۹۰۳۰a(this.f۱۵۷۳۶g);
                } else {
                    this.f۱۵۷۳۲c.m۱۹۰۳۱a(this.f۱۵۷۳۶g, this.f۱۵۷۳۴e);
                }
            }
            if (this.f۱۵۷۳۲c.m۱۹۰۳۶f(this.f۱۵۷۳۴e)) {
                try {
                    m۱۸۶۶۲u();
                    m۱۸۶۶۱t();
                    this.f۱۵۷۴۵p = true;
                    return;
                } catch (IOException journalIsCorrupt) {
                    Cf d = Cf.m۱۹۰۸۶d();
                    d.m۱۹۰۹۱a(5, "DiskLruCache " + this.f۱۵۷۳۳d + " is corrupt: " + journalIsCorrupt.getMessage() + ", removing", journalIsCorrupt);
                    m۱۸۶۶۹l();
                    this.f۱۵۷۴۶q = false;
                } catch (Throwable th) {
                    this.f۱۵۷۴۶q = false;
                    throw th;
                }
            }
            m۱۸۶۷۳p();
            this.f۱۵۷۴۵p = true;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public static Cd m۱۸۶۵۶a(AbstractCa fileSystem, File directory, int appVersion, int valueCount, long maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (valueCount > 0) {
            return new Cd(fileSystem, directory, appVersion, valueCount, maxSize, new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۹a("OkHttp DiskLruCache", true)));
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: u  reason: contains not printable characters */
    private void m۱۸۶۶۲u() {
        AbstractCe source = Cl.m۱۹۴۸۰a(this.f۱۵۷۳۲c.m۱۹۰۳۲b(this.f۱۵۷۳۴e));
        try {
            String magic = source.m۱۹۴۲۵f();
            String version = source.m۱۹۴۲۵f();
            String appVersionString = source.m۱۹۴۲۵f();
            String valueCountString = source.m۱۹۴۲۵f();
            String blank = source.m۱۹۴۲۵f();
            if (!"libcore.io.DiskLruCache".equals(magic) || !"1".equals(version) || !Integer.toString(this.f۱۵۷۳۷h).equals(appVersionString) || !Integer.toString(this.f۱۵۷۳۹j).equals(valueCountString) || !"".equals(blank)) {
                throw new IOException("unexpected journal header: [" + magic + ", " + version + ", " + valueCountString + ", " + blank + "]");
            }
            int lineCount = 0;
            while (true) {
                try {
                    m۱۸۶۵۷e(source.m۱۹۴۲۵f());
                    lineCount++;
                } catch (EOFException e) {
                    this.f۱۵۷۴۳n = lineCount - this.f۱۵۷۴۲m.size();
                    if (!source.m۱۹۴۲۹i()) {
                        m۱۸۶۷۳p();
                    } else {
                        this.f۱۵۷۴۱l = m۱۸۶۶۰s();
                    }
                    return;
                }
            }
        } finally {
            p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(source);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.e.d$b  reason: invalid class name */
    public class Cb extends Ce {
        Cb(AbstractCr delegate) {
            super(delegate);
        }

        /* access modifiers changed from: protected */
        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.Ce
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۶۷۵a(IOException e) {
            Cd.this.f۱۵۷۴۴o = true;
        }
    }

    /* renamed from: s  reason: contains not printable characters */
    private AbstractCd m۱۸۶۶۰s() {
        return Cl.m۱۹۴۷۹a(new Cb(this.f۱۵۷۳۲c.m۱۹۰۳۵e(this.f۱۵۷۳۴e)));
    }

    /* renamed from: e  reason: contains not printable characters */
    private void m۱۸۶۵۷e(String line) {
        String key;
        int firstSpace = line.indexOf(32);
        if (firstSpace != -1) {
            int keyBegin = firstSpace + 1;
            int secondSpace = line.indexOf(32, keyBegin);
            if (secondSpace == -1) {
                key = line.substring(keyBegin);
                if (firstSpace == "REMOVE".length() && line.startsWith("REMOVE")) {
                    this.f۱۵۷۴۲m.remove(key);
                    return;
                }
            } else {
                key = line.substring(keyBegin, secondSpace);
            }
            Cd entry = this.f۱۵۷۴۲m.get(key);
            if (entry == null) {
                entry = new Cd(key);
                this.f۱۵۷۴۲m.put(key, entry);
            }
            if (secondSpace != -1 && firstSpace == "CLEAN".length() && line.startsWith("CLEAN")) {
                String[] parts = line.substring(secondSpace + 1).split(" ");
                entry.f۱۵۷۶۳e = true;
                entry.f۱۵۷۶۴f = null;
                entry.m۱۸۶۸۴a(parts);
            } else if (secondSpace == -1 && firstSpace == "DIRTY".length() && line.startsWith("DIRTY")) {
                entry.f۱۵۷۶۴f = new Cc(entry);
            } else if (secondSpace != -1 || firstSpace != "READ".length() || !line.startsWith("READ")) {
                throw new IOException("unexpected journal line: " + line);
            }
        } else {
            throw new IOException("unexpected journal line: " + line);
        }
    }

    /* renamed from: t  reason: contains not printable characters */
    private void m۱۸۶۶۱t() {
        this.f۱۵۷۳۲c.m۱۹۰۳۰a(this.f۱۵۷۳۵f);
        Iterator<DiskLruCache.Entry> i = this.f۱۵۷۴۲m.values().iterator();
        while (i.hasNext()) {
            Cd entry = (Cd) i.next();
            if (entry.f۱۵۷۶۴f == null) {
                for (int t = 0; t < this.f۱۵۷۳۹j; t++) {
                    this.f۱۵۷۴۰k += entry.f۱۵۷۶۰b[t];
                }
            } else {
                entry.f۱۵۷۶۴f = null;
                for (int t2 = 0; t2 < this.f۱۵۷۳۹j; t2++) {
                    this.f۱۵۷۳۲c.m۱۹۰۳۰a(entry.f۱۵۷۶۱c[t2]);
                    this.f۱۵۷۳۲c.m۱۹۰۳۰a(entry.f۱۵۷۶۲d[t2]);
                }
                i.remove();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* renamed from: p  reason: contains not printable characters */
    public synchronized void m۱۸۶۷۳p() {
        if (this.f۱۵۷۴۱l != null) {
            this.f۱۵۷۴۱l.close();
        }
        AbstractCd writer = Cl.m۱۹۴۷۹a(this.f۱۵۷۳۲c.m۱۹۰۳۳c(this.f۱۵۷۳۵f));
        try {
            writer.m۱۹۴۱۴a("libcore.io.DiskLruCache").writeByte(10);
            writer.m۱۹۴۱۴a("1").writeByte(10);
            writer.m۱۹۴۱۶e((long) this.f۱۵۷۳۷h).writeByte(10);
            writer.m۱۹۴۱۶e((long) this.f۱۵۷۳۹j).writeByte(10);
            writer.writeByte(10);
            for (Cd entry : this.f۱۵۷۴۲m.values()) {
                if (entry.f۱۵۷۶۴f != null) {
                    writer.m۱۹۴۱۴a("DIRTY").writeByte(32);
                    writer.m۱۹۴۱۴a(entry.f۱۵۷۵۹a);
                    writer.writeByte(10);
                } else {
                    writer.m۱۹۴۱۴a("CLEAN").writeByte(32);
                    writer.m۱۹۴۱۴a(entry.f۱۵۷۵۹a);
                    entry.m۱۸۶۸۳a(writer);
                    writer.writeByte(10);
                }
            }
            writer.close();
            if (this.f۱۵۷۳۲c.m۱۹۰۳۶f(this.f۱۵۷۳۴e)) {
                this.f۱۵۷۳۲c.m۱۹۰۳۱a(this.f۱۵۷۳۴e, this.f۱۵۷۳۶g);
            }
            this.f۱۵۷۳۲c.m۱۹۰۳۱a(this.f۱۵۷۳۵f, this.f۱۵۷۳۴e);
            this.f۱۵۷۳۲c.m۱۹۰۳۰a(this.f۱۵۷۳۶g);
            this.f۱۵۷۴۱l = m۱۸۶۶۰s();
            this.f۱۵۷۴۴o = false;
            this.f۱۵۷۴۸s = false;
        } catch (Throwable th) {
            writer.close();
            throw th;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public synchronized Ce m۱۸۶۶۷c(String key) {
        m۱۸۶۷۰m();
        m۱۸۶۵۹r();
        m۱۸۶۵۸f(key);
        Cd entry = this.f۱۵۷۴۲m.get(key);
        if (entry != null) {
            if (entry.f۱۵۷۶۳e) {
                Ce snapshot = entry.m۱۸۶۸۲a();
                if (snapshot == null) {
                    return null;
                }
                this.f۱۵۷۴۳n++;
                this.f۱۵۷۴۱l.m۱۹۴۱۴a("READ").writeByte(32).m۱۹۴۱۴a(key).writeByte(10);
                if (m۱۸۶۷۲o()) {
                    this.f۱۵۷۵۰u.execute(this.f۱۵۷۵۱v);
                }
                return snapshot;
            }
        }
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public Cc m۱۸۶۶۶b(String key) {
        return m۱۸۶۶۳a(key, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public synchronized Cc m۱۸۶۶۳a(String key, long expectedSequenceNumber) {
        m۱۸۶۷۰m();
        m۱۸۶۵۹r();
        m۱۸۶۵۸f(key);
        Cd entry = this.f۱۵۷۴۲m.get(key);
        if (expectedSequenceNumber != -1 && (entry == null || entry.f۱۵۷۶۵g != expectedSequenceNumber)) {
            return null;
        }
        if (entry != null && entry.f۱۵۷۶۴f != null) {
            return null;
        }
        if (this.f۱۵۷۴۷r || this.f۱۵۷۴۸s) {
            this.f۱۵۷۵۰u.execute(this.f۱۵۷۵۱v);
            return null;
        }
        this.f۱۵۷۴۱l.m۱۹۴۱۴a("DIRTY").writeByte(32).m۱۹۴۱۴a(key).writeByte(10);
        this.f۱۵۷۴۱l.flush();
        if (this.f۱۵۷۴۴o) {
            return null;
        }
        if (entry == null) {
            entry = new Cd(key);
            this.f۱۵۷۴۲m.put(key, entry);
        }
        Cc editor = new Cc(entry);
        entry.f۱۵۷۶۴f = editor;
        return editor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۸۶۶۴a(Cc editor, boolean success) {
        Cd entry = editor.f۱۵۷۵۴a;
        if (entry.f۱۵۷۶۴f == editor) {
            if (success && !entry.f۱۵۷۶۳e) {
                for (int i = 0; i < this.f۱۵۷۳۹j; i++) {
                    if (!editor.f۱۵۷۵۵b[i]) {
                        editor.m۱۸۶۷۷a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    } else if (!this.f۱۵۷۳۲c.m۱۹۰۳۶f(entry.f۱۵۷۶۲d[i])) {
                        editor.m۱۸۶۷۷a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f۱۵۷۳۹j; i2++) {
                File dirty = entry.f۱۵۷۶۲d[i2];
                if (!success) {
                    this.f۱۵۷۳۲c.m۱۹۰۳۰a(dirty);
                } else if (this.f۱۵۷۳۲c.m۱۹۰۳۶f(dirty)) {
                    File clean = entry.f۱۵۷۶۱c[i2];
                    this.f۱۵۷۳۲c.m۱۹۰۳۱a(dirty, clean);
                    long oldLength = entry.f۱۵۷۶۰b[i2];
                    long newLength = this.f۱۵۷۳۲c.m۱۹۰۳۷g(clean);
                    entry.f۱۵۷۶۰b[i2] = newLength;
                    this.f۱۵۷۴۰k = (this.f۱۵۷۴۰k - oldLength) + newLength;
                }
            }
            this.f۱۵۷۴۳n++;
            entry.f۱۵۷۶۴f = null;
            if (entry.f۱۵۷۶۳e || success) {
                entry.f۱۵۷۶۳e = true;
                this.f۱۵۷۴۱l.m۱۹۴۱۴a("CLEAN").writeByte(32);
                this.f۱۵۷۴۱l.m۱۹۴۱۴a(entry.f۱۵۷۵۹a);
                entry.m۱۸۶۸۳a(this.f۱۵۷۴۱l);
                this.f۱۵۷۴۱l.writeByte(10);
                if (success) {
                    long j = this.f۱۵۷۴۹t;
                    this.f۱۵۷۴۹t = 1 + j;
                    entry.f۱۵۷۶۵g = j;
                }
            } else {
                this.f۱۵۷۴۲m.remove(entry.f۱۵۷۵۹a);
                this.f۱۵۷۴۱l.m۱۹۴۱۴a("REMOVE").writeByte(32);
                this.f۱۵۷۴۱l.m۱۹۴۱۴a(entry.f۱۵۷۵۹a);
                this.f۱۵۷۴۱l.writeByte(10);
            }
            this.f۱۵۷۴۱l.flush();
            if (this.f۱۵۷۴۰k > this.f۱۵۷۳۸i || m۱۸۶۷۲o()) {
                this.f۱۵۷۵۰u.execute(this.f۱۵۷۵۱v);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o  reason: contains not printable characters */
    public boolean m۱۸۶۷۲o() {
        int i = this.f۱۵۷۴۳n;
        return i >= 2000 && i >= this.f۱۵۷۴۲m.size();
    }

    /* renamed from: d  reason: contains not printable characters */
    public synchronized boolean m۱۸۶۶۸d(String key) {
        m۱۸۶۷۰m();
        m۱۸۶۵۹r();
        m۱۸۶۵۸f(key);
        Cd entry = this.f۱۵۷۴۲m.get(key);
        if (entry == null) {
            return false;
        }
        boolean removed = m۱۸۶۶۵a(entry);
        if (removed && this.f۱۵۷۴۰k <= this.f۱۵۷۳۸i) {
            this.f۱۵۷۴۷r = false;
        }
        return removed;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۶۶۵a(Cd entry) {
        Cc cVar = entry.f۱۵۷۶۴f;
        if (cVar != null) {
            cVar.m۱۸۶۷۹c();
        }
        for (int i = 0; i < this.f۱۵۷۳۹j; i++) {
            this.f۱۵۷۳۲c.m۱۹۰۳۰a(entry.f۱۵۷۶۱c[i]);
            long j = this.f۱۵۷۴۰k;
            long[] jArr = entry.f۱۵۷۶۰b;
            this.f۱۵۷۴۰k = j - jArr[i];
            jArr[i] = 0;
        }
        this.f۱۵۷۴۳n++;
        this.f۱۵۷۴۱l.m۱۹۴۱۴a("REMOVE").writeByte(32).m۱۹۴۱۴a(entry.f۱۵۷۵۹a).writeByte(10);
        this.f۱۵۷۴۲m.remove(entry.f۱۵۷۵۹a);
        if (m۱۸۶۷۲o()) {
            this.f۱۵۷۵۰u.execute(this.f۱۵۷۵۱v);
        }
        return true;
    }

    /* renamed from: n  reason: contains not printable characters */
    public synchronized boolean m۱۸۶۷۱n() {
        return this.f۱۵۷۴۶q;
    }

    /* renamed from: r  reason: contains not printable characters */
    private synchronized void m۱۸۶۵۹r() {
        if (m۱۸۶۷۱n()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f۱۵۷۴۵p) {
            m۱۸۶۵۹r();
            m۱۸۶۷۴q();
            this.f۱۵۷۴۱l.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f۱۵۷۴۵p) {
            if (!this.f۱۵۷۴۶q) {
                Cd[] dVarArr = (Cd[]) this.f۱۵۷۴۲m.values().toArray(new Cd[this.f۱۵۷۴۲m.size()]);
                for (Cd entry : dVarArr) {
                    if (entry.f۱۵۷۶۴f != null) {
                        entry.f۱۵۷۶۴f.m۱۸۶۷۷a();
                    }
                }
                m۱۸۶۷۴q();
                this.f۱۵۷۴۱l.close();
                this.f۱۵۷۴۱l = null;
                this.f۱۵۷۴۶q = true;
                return;
            }
        }
        this.f۱۵۷۴۶q = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q  reason: contains not printable characters */
    public void m۱۸۶۷۴q() {
        while (this.f۱۵۷۴۰k > this.f۱۵۷۳۸i) {
            m۱۸۶۶۵a(this.f۱۵۷۴۲m.values().iterator().next());
        }
        this.f۱۵۷۴۷r = false;
    }

    /* renamed from: l  reason: contains not printable characters */
    public void m۱۸۶۶۹l() {
        close();
        this.f۱۵۷۳۲c.m۱۹۰۳۴d(this.f۱۵۷۳۳d);
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۸۶۵۸f(String key) {
        if (!f۱۵۷۳۱w.matcher(key).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + key + "\"");
        }
    }

    /* renamed from: e.f0.e.d$e  reason: invalid class name */
    public final class Ce implements Closeable {

        /* renamed from: c  reason: contains not printable characters */
        private final String f۱۵۷۶۷c;

        /* renamed from: d  reason: contains not printable characters */
        private final long f۱۵۷۶۸d;

        /* renamed from: e  reason: contains not printable characters */
        private final AbstractCs[] f۱۵۷۶۹e;

        Ce(String key, long sequenceNumber, AbstractCs[] sources, long[] lengths) {
            this.f۱۵۷۶۷c = key;
            this.f۱۵۷۶۸d = sequenceNumber;
            this.f۱۵۷۶۹e = sources;
        }

        /* renamed from: l  reason: contains not printable characters */
        public Cc m۱۸۶۸۶l() {
            return Cd.this.m۱۸۶۶۳a(this.f۱۵۷۶۷c, this.f۱۵۷۶۸d);
        }

        /* renamed from: a  reason: contains not printable characters */
        public AbstractCs m۱۸۶۸۵a(int index) {
            return this.f۱۵۷۶۹e[index];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (AbstractCs in : this.f۱۵۷۶۹e) {
                p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(in);
            }
        }
    }

    /* renamed from: e.f0.e.d$c  reason: invalid class name */
    public final class Cc {

        /* renamed from: a  reason: contains not printable characters */
        final Cd f۱۵۷۵۴a;

        /* renamed from: b  reason: contains not printable characters */
        final boolean[] f۱۵۷۵۵b;

        /* renamed from: c  reason: contains not printable characters */
        private boolean f۱۵۷۵۶c;

        Cc(Cd entry) {
            this.f۱۵۷۵۴a = entry;
            this.f۱۵۷۵۵b = entry.f۱۵۷۶۳e ? null : new boolean[Cd.this.f۱۵۷۳۹j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public void m۱۸۶۷۹c() {
            if (this.f۱۵۷۵۴a.f۱۵۷۶۴f == this) {
                int i = 0;
                while (true) {
                    Cd dVar = Cd.this;
                    if (i < dVar.f۱۵۷۳۹j) {
                        try {
                            dVar.f۱۵۷۳۲c.m۱۹۰۳۰a(this.f۱۵۷۵۴a.f۱۵۷۶۲d[i]);
                        } catch (IOException e) {
                        }
                        i++;
                    } else {
                        this.f۱۵۷۵۴a.f۱۵۷۶۴f = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public AbstractCr m۱۸۶۷۶a(int index) {
            synchronized (Cd.this) {
                if (this.f۱۵۷۵۶c) {
                    throw new IllegalStateException();
                } else if (this.f۱۵۷۵۴a.f۱۵۷۶۴f != this) {
                    return Cl.m۱۹۴۸۱a();
                } else {
                    if (!this.f۱۵۷۵۴a.f۱۵۷۶۳e) {
                        this.f۱۵۷۵۵b[index] = true;
                    }
                    try {
                        return new Ca(Cd.this.f۱۵۷۳۲c.m۱۹۰۳۳c(this.f۱۵۷۵۴a.f۱۵۷۶۲d[index]));
                    } catch (FileNotFoundException e) {
                        return Cl.m۱۹۴۸۱a();
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e.f0.e.d$c$a  reason: invalid class name */
        public class Ca extends Ce {
            Ca(AbstractCr delegate) {
                super(delegate);
            }

            /* access modifiers changed from: protected */
            @Override // p۱۳۹e.p۱۴۰f0.p۱۴۱e.Ce
            /* renamed from: a  reason: contains not printable characters */
            public void m۱۸۶۸۰a(IOException e) {
                synchronized (Cd.this) {
                    Cc.this.m۱۸۶۷۹c();
                }
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۶۷۸b() {
            synchronized (Cd.this) {
                if (!this.f۱۵۷۵۶c) {
                    if (this.f۱۵۷۵۴a.f۱۵۷۶۴f == this) {
                        Cd.this.m۱۸۶۶۴a(this, true);
                    }
                    this.f۱۵۷۵۶c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۶۷۷a() {
            synchronized (Cd.this) {
                if (!this.f۱۵۷۵۶c) {
                    if (this.f۱۵۷۵۴a.f۱۵۷۶۴f == this) {
                        Cd.this.m۱۸۶۶۴a(this, false);
                    }
                    this.f۱۵۷۵۶c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.f0.e.d$d  reason: invalid class name */
    public final class Cd {

        /* renamed from: a  reason: contains not printable characters */
        final String f۱۵۷۵۹a;

        /* renamed from: b  reason: contains not printable characters */
        final long[] f۱۵۷۶۰b;

        /* renamed from: c  reason: contains not printable characters */
        final File[] f۱۵۷۶۱c;

        /* renamed from: d  reason: contains not printable characters */
        final File[] f۱۵۷۶۲d;

        /* renamed from: e  reason: contains not printable characters */
        boolean f۱۵۷۶۳e;

        /* renamed from: f  reason: contains not printable characters */
        Cc f۱۵۷۶۴f;

        /* renamed from: g  reason: contains not printable characters */
        long f۱۵۷۶۵g;

        Cd(String key) {
            this.f۱۵۷۵۹a = key;
            int i = Cd.this.f۱۵۷۳۹j;
            this.f۱۵۷۶۰b = new long[i];
            this.f۱۵۷۶۱c = new File[i];
            this.f۱۵۷۶۲d = new File[i];
            StringBuilder fileBuilder = new StringBuilder(key).append('.');
            int truncateTo = fileBuilder.length();
            for (int i2 = 0; i2 < Cd.this.f۱۵۷۳۹j; i2++) {
                fileBuilder.append(i2);
                this.f۱۵۷۶۱c[i2] = new File(Cd.this.f۱۵۷۳۳d, fileBuilder.toString());
                fileBuilder.append(".tmp");
                this.f۱۵۷۶۲d[i2] = new File(Cd.this.f۱۵۷۳۳d, fileBuilder.toString());
                fileBuilder.setLength(truncateTo);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۶۸۴a(String[] strings) {
            if (strings.length == Cd.this.f۱۵۷۳۹j) {
                for (int i = 0; i < strings.length; i++) {
                    try {
                        this.f۱۵۷۶۰b[i] = Long.parseLong(strings[i]);
                    } catch (NumberFormatException e) {
                        m۱۸۶۸۱b(strings);
                        throw null;
                    }
                }
                return;
            }
            m۱۸۶۸۱b(strings);
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۶۸۳a(AbstractCd writer) {
            for (long length : this.f۱۵۷۶۰b) {
                writer.writeByte(32).m۱۹۴۱۶e(length);
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        private IOException m۱۸۶۸۱b(String[] strings) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strings));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public Ce m۱۸۶۸۲a() {
            if (Thread.holdsLock(Cd.this)) {
                AbstractCs[] sources = new AbstractCs[Cd.this.f۱۵۷۳۹j];
                long[] lengths = (long[]) this.f۱۵۷۶۰b.clone();
                for (int i = 0; i < Cd.this.f۱۵۷۳۹j; i++) {
                    try {
                        sources[i] = Cd.this.f۱۵۷۳۲c.m۱۹۰۳۲b(this.f۱۵۷۶۱c[i]);
                    } catch (FileNotFoundException e) {
                        int i2 = 0;
                        while (i2 < Cd.this.f۱۵۷۳۹j && sources[i2] != null) {
                            p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(sources[i2]);
                            i2++;
                        }
                        try {
                            Cd.this.m۱۸۶۶۵a(this);
                            return null;
                        } catch (IOException e2) {
                            return null;
                        }
                    }
                }
                return new Ce(this.f۱۵۷۵۹a, this.f۱۵۷۶۵g, sources, lengths);
            }
            throw new AssertionError();
        }
    }
}
