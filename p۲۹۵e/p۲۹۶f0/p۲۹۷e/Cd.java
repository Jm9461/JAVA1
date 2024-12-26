package p۲۹۵e.p۲۹۶f0.p۲۹۷e;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۳۰۲j.InterfaceCa;
import p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf;
import p۳۰۵f.Cl;
import p۳۰۵f.InterfaceCd;
import p۳۰۵f.InterfaceCe;
import p۳۰۵f.InterfaceCr;
import p۳۰۵f.InterfaceCs;

/* renamed from: e.f0.e.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cd implements Closeable, Flushable {

    /* renamed from: w, reason: contains not printable characters */
    static final Pattern f۱۵۷۳۱w = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: c, reason: contains not printable characters */
    final InterfaceCa f۱۵۷۳۲c;

    /* renamed from: d, reason: contains not printable characters */
    final File f۱۵۷۳۳d;

    /* renamed from: e, reason: contains not printable characters */
    private final File f۱۵۷۳۴e;

    /* renamed from: f, reason: contains not printable characters */
    private final File f۱۵۷۳۵f;

    /* renamed from: g, reason: contains not printable characters */
    private final File f۱۵۷۳۶g;

    /* renamed from: h, reason: contains not printable characters */
    private final int f۱۵۷۳۷h;

    /* renamed from: i, reason: contains not printable characters */
    private long f۱۵۷۳۸i;

    /* renamed from: j, reason: contains not printable characters */
    final int f۱۵۷۳۹j;

    /* renamed from: l, reason: contains not printable characters */
    InterfaceCd f۱۵۷۴۱l;

    /* renamed from: n, reason: contains not printable characters */
    int f۱۵۷۴۳n;

    /* renamed from: o, reason: contains not printable characters */
    boolean f۱۵۷۴۴o;

    /* renamed from: p, reason: contains not printable characters */
    boolean f۱۵۷۴۵p;

    /* renamed from: q, reason: contains not printable characters */
    boolean f۱۵۷۴۶q;

    /* renamed from: r, reason: contains not printable characters */
    boolean f۱۵۷۴۷r;

    /* renamed from: s, reason: contains not printable characters */
    boolean f۱۵۷۴۸s;

    /* renamed from: u, reason: contains not printable characters */
    private final Executor f۱۵۷۵۰u;

    /* renamed from: k, reason: contains not printable characters */
    private long f۱۵۷۴۰k = 0;

    /* renamed from: m, reason: contains not printable characters */
    final LinkedHashMap<String, d> f۱۵۷۴۲m = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: t, reason: contains not printable characters */
    private long f۱۵۷۴۹t = 0;

    /* renamed from: v, reason: contains not printable characters */
    private final Runnable f۱۵۷۵۱v = new a();

    /* renamed from: e.f0.e.d$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (Cd.this) {
                if ((!Cd.this.f۱۵۷۴۵p) || Cd.this.f۱۵۷۴۶q) {
                    return;
                }
                try {
                    Cd.this.m۱۶۵۹۵q();
                } catch (IOException e2) {
                    Cd.this.f۱۵۷۴۷r = true;
                }
                try {
                    if (Cd.this.m۱۶۵۹۳o()) {
                        Cd.this.m۱۶۵۹۴p();
                        Cd.this.f۱۵۷۴۳n = 0;
                    }
                } catch (IOException e3) {
                    Cd.this.f۱۵۷۴۸s = true;
                    Cd.this.f۱۵۷۴۱l = Cl.m۱۷۴۰۲a(Cl.m۱۷۴۰۴a());
                }
            }
        }
    }

    Cd(InterfaceCa fileSystem, File directory, int appVersion, int valueCount, long maxSize, Executor executor) {
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

    /* renamed from: m, reason: contains not printable characters */
    public synchronized void m۱۶۵۹۱m() {
        if (this.f۱۵۷۴۵p) {
            return;
        }
        if (this.f۱۵۷۳۲c.mo۱۶۹۶۵f(this.f۱۵۷۳۶g)) {
            if (this.f۱۵۷۳۲c.mo۱۶۹۶۵f(this.f۱۵۷۳۴e)) {
                this.f۱۵۷۳۲c.mo۱۶۹۵۹a(this.f۱۵۷۳۶g);
            } else {
                this.f۱۵۷۳۲c.mo۱۶۹۶۰a(this.f۱۵۷۳۶g, this.f۱۵۷۳۴e);
            }
        }
        if (this.f۱۵۷۳۲c.mo۱۶۹۶۵f(this.f۱۵۷۳۴e)) {
            try {
                m۱۶۵۸۳u();
                m۱۶۵۸۲t();
                this.f۱۵۷۴۵p = true;
                return;
            } catch (IOException journalIsCorrupt) {
                Cf.m۱۷۰۰۷d().mo۱۷۰۱۲a(5, "DiskLruCache " + this.f۱۵۷۳۳d + " is corrupt: " + journalIsCorrupt.getMessage() + ", removing", journalIsCorrupt);
                try {
                    m۱۶۵۹۰l();
                    this.f۱۵۷۴۶q = false;
                } catch (Throwable th) {
                    this.f۱۵۷۴۶q = false;
                    throw th;
                }
            }
        }
        m۱۶۵۹۴p();
        this.f۱۵۷۴۵p = true;
    }

    /* renamed from: a, reason: contains not printable characters */
    public static Cd m۱۶۵۷۷a(InterfaceCa fileSystem, File directory, int appVersion, int valueCount, long maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (valueCount <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        Executor executor = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Cc.m۱۶۵۴۰a("OkHttp DiskLruCache", true));
        return new Cd(fileSystem, directory, appVersion, valueCount, maxSize, executor);
    }

    /* renamed from: u, reason: contains not printable characters */
    private void m۱۶۵۸۳u() {
        InterfaceCe source = Cl.m۱۷۴۰۳a(this.f۱۵۷۳۲c.mo۱۶۹۶۱b(this.f۱۵۷۳۴e));
        try {
            String magic = source.mo۱۷۴۴۴f();
            String version = source.mo۱۷۴۴۴f();
            String appVersionString = source.mo۱۷۴۴۴f();
            String valueCountString = source.mo۱۷۴۴۴f();
            String blank = source.mo۱۷۴۴۴f();
            if (!"libcore.io.DiskLruCache".equals(magic) || !"1".equals(version) || !Integer.toString(this.f۱۵۷۳۷h).equals(appVersionString) || !Integer.toString(this.f۱۵۷۳۹j).equals(valueCountString) || !"".equals(blank)) {
                throw new IOException("unexpected journal header: [" + magic + ", " + version + ", " + valueCountString + ", " + blank + "]");
            }
            int lineCount = 0;
            while (true) {
                try {
                    m۱۶۵۷۸e(source.mo۱۷۴۴۴f());
                    lineCount++;
                } catch (EOFException e2) {
                    this.f۱۵۷۴۳n = lineCount - this.f۱۵۷۴۲m.size();
                    if (!source.mo۱۷۴۴۸i()) {
                        m۱۶۵۹۴p();
                    } else {
                        this.f۱۵۷۴۱l = m۱۶۵۸۱s();
                    }
                    Cc.m۱۶۵۴۲a(source);
                    return;
                }
            }
        } catch (Throwable th) {
            Cc.m۱۶۵۴۲a(source);
            throw th;
        }
    }

    /* renamed from: e.f0.e.d$b */
    class b extends Ce {
        b(InterfaceCr delegate) {
            super(delegate);
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.Ce
        /* renamed from: a, reason: contains not printable characters */
        protected void mo۱۶۶۰۹a(IOException e2) {
            Cd.this.f۱۵۷۴۴o = true;
        }
    }

    /* renamed from: s, reason: contains not printable characters */
    private InterfaceCd m۱۶۵۸۱s() {
        InterfaceCr fileSink = this.f۱۵۷۳۲c.mo۱۶۹۶۴e(this.f۱۵۷۳۴e);
        InterfaceCr faultHidingSink = new b(fileSink);
        return Cl.m۱۷۴۰۲a(faultHidingSink);
    }

    /* renamed from: e, reason: contains not printable characters */
    private void m۱۶۵۷۸e(String line) {
        String key;
        int firstSpace = line.indexOf(32);
        if (firstSpace == -1) {
            throw new IOException("unexpected journal line: " + line);
        }
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
        d entry = this.f۱۵۷۴۲m.get(key);
        if (entry == null) {
            entry = new d(key);
            this.f۱۵۷۴۲m.put(key, entry);
        }
        if (secondSpace != -1 && firstSpace == "CLEAN".length() && line.startsWith("CLEAN")) {
            String[] parts = line.substring(secondSpace + 1).split(" ");
            entry.f۱۵۷۶۳e = true;
            entry.f۱۵۷۶۴f = null;
            entry.m۱۶۶۰۵a(parts);
            return;
        }
        if (secondSpace == -1 && firstSpace == "DIRTY".length() && line.startsWith("DIRTY")) {
            entry.f۱۵۷۶۴f = new c(entry);
            return;
        }
        if (secondSpace != -1 || firstSpace != "READ".length() || !line.startsWith("READ")) {
            throw new IOException("unexpected journal line: " + line);
        }
    }

    /* renamed from: t, reason: contains not printable characters */
    private void m۱۶۵۸۲t() {
        this.f۱۵۷۳۲c.mo۱۶۹۵۹a(this.f۱۵۷۳۵f);
        Iterator<d> it = this.f۱۵۷۴۲m.values().iterator();
        while (it.hasNext()) {
            d entry = it.next();
            if (entry.f۱۵۷۶۴f == null) {
                for (int t = 0; t < this.f۱۵۷۳۹j; t++) {
                    this.f۱۵۷۴۰k += entry.f۱۵۷۶۰b[t];
                }
            } else {
                entry.f۱۵۷۶۴f = null;
                for (int t2 = 0; t2 < this.f۱۵۷۳۹j; t2++) {
                    this.f۱۵۷۳۲c.mo۱۶۹۵۹a(entry.f۱۵۷۶۱c[t2]);
                    this.f۱۵۷۳۲c.mo۱۶۹۵۹a(entry.f۱۵۷۶۲d[t2]);
                }
                it.remove();
            }
        }
    }

    /* renamed from: p, reason: contains not printable characters */
    synchronized void m۱۶۵۹۴p() {
        if (this.f۱۵۷۴۱l != null) {
            this.f۱۵۷۴۱l.close();
        }
        InterfaceCd writer = Cl.m۱۷۴۰۲a(this.f۱۵۷۳۲c.mo۱۶۹۶۲c(this.f۱۵۷۳۵f));
        try {
            writer.mo۱۷۴۲۶a("libcore.io.DiskLruCache").writeByte(10);
            writer.mo۱۷۴۲۶a("1").writeByte(10);
            writer.mo۱۷۴۳۰e(this.f۱۵۷۳۷h).writeByte(10);
            writer.mo۱۷۴۳۰e(this.f۱۵۷۳۹j).writeByte(10);
            writer.writeByte(10);
            for (d entry : this.f۱۵۷۴۲m.values()) {
                if (entry.f۱۵۷۶۴f != null) {
                    writer.mo۱۷۴۲۶a("DIRTY").writeByte(32);
                    writer.mo۱۷۴۲۶a(entry.f۱۵۷۵۹a);
                    writer.writeByte(10);
                } else {
                    writer.mo۱۷۴۲۶a("CLEAN").writeByte(32);
                    writer.mo۱۷۴۲۶a(entry.f۱۵۷۵۹a);
                    entry.m۱۶۶۰۴a(writer);
                    writer.writeByte(10);
                }
            }
            writer.close();
            if (this.f۱۵۷۳۲c.mo۱۶۹۶۵f(this.f۱۵۷۳۴e)) {
                this.f۱۵۷۳۲c.mo۱۶۹۶۰a(this.f۱۵۷۳۴e, this.f۱۵۷۳۶g);
            }
            this.f۱۵۷۳۲c.mo۱۶۹۶۰a(this.f۱۵۷۳۵f, this.f۱۵۷۳۴e);
            this.f۱۵۷۳۲c.mo۱۶۹۵۹a(this.f۱۵۷۳۶g);
            this.f۱۵۷۴۱l = m۱۶۵۸۱s();
            this.f۱۵۷۴۴o = false;
            this.f۱۵۷۴۸s = false;
        } catch (Throwable th) {
            writer.close();
            throw th;
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public synchronized e m۱۶۵۸۸c(String key) {
        m۱۶۵۹۱m();
        m۱۶۵۸۰r();
        m۱۶۵۷۹f(key);
        d entry = this.f۱۵۷۴۲m.get(key);
        if (entry != null && entry.f۱۵۷۶۳e) {
            e snapshot = entry.m۱۶۶۰۳a();
            if (snapshot == null) {
                return null;
            }
            this.f۱۵۷۴۳n++;
            this.f۱۵۷۴۱l.mo۱۷۴۲۶a("READ").writeByte(32).mo۱۷۴۲۶a(key).writeByte(10);
            if (m۱۶۵۹۳o()) {
                this.f۱۵۷۵۰u.execute(this.f۱۵۷۵۱v);
            }
            return snapshot;
        }
        return null;
    }

    /* renamed from: b, reason: contains not printable characters */
    public c m۱۶۵۸۷b(String key) {
        return m۱۶۵۸۴a(key, -1L);
    }

    /* renamed from: a, reason: contains not printable characters */
    synchronized c m۱۶۵۸۴a(String key, long expectedSequenceNumber) {
        m۱۶۵۹۱m();
        m۱۶۵۸۰r();
        m۱۶۵۷۹f(key);
        d entry = this.f۱۵۷۴۲m.get(key);
        if (expectedSequenceNumber != -1 && (entry == null || entry.f۱۵۷۶۵g != expectedSequenceNumber)) {
            return null;
        }
        if (entry != null && entry.f۱۵۷۶۴f != null) {
            return null;
        }
        if (!this.f۱۵۷۴۷r && !this.f۱۵۷۴۸s) {
            this.f۱۵۷۴۱l.mo۱۷۴۲۶a("DIRTY").writeByte(32).mo۱۷۴۲۶a(key).writeByte(10);
            this.f۱۵۷۴۱l.flush();
            if (this.f۱۵۷۴۴o) {
                return null;
            }
            if (entry == null) {
                entry = new d(key);
                this.f۱۵۷۴۲m.put(key, entry);
            }
            c editor = new c(entry);
            entry.f۱۵۷۶۴f = editor;
            return editor;
        }
        this.f۱۵۷۵۰u.execute(this.f۱۵۷۵۱v);
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    synchronized void m۱۶۵۸۵a(c editor, boolean success) {
        d entry = editor.f۱۵۷۵۴a;
        if (entry.f۱۵۷۶۴f != editor) {
            throw new IllegalStateException();
        }
        if (success && !entry.f۱۵۷۶۳e) {
            for (int i = 0; i < this.f۱۵۷۳۹j; i++) {
                if (!editor.f۱۵۷۵۵b[i]) {
                    editor.m۱۶۵۹۸a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!this.f۱۵۷۳۲c.mo۱۶۹۶۵f(entry.f۱۵۷۶۲d[i])) {
                    editor.m۱۶۵۹۸a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.f۱۵۷۳۹j; i2++) {
            File dirty = entry.f۱۵۷۶۲d[i2];
            if (success) {
                if (this.f۱۵۷۳۲c.mo۱۶۹۶۵f(dirty)) {
                    File clean = entry.f۱۵۷۶۱c[i2];
                    this.f۱۵۷۳۲c.mo۱۶۹۶۰a(dirty, clean);
                    long oldLength = entry.f۱۵۷۶۰b[i2];
                    long newLength = this.f۱۵۷۳۲c.mo۱۶۹۶۶g(clean);
                    entry.f۱۵۷۶۰b[i2] = newLength;
                    this.f۱۵۷۴۰k = (this.f۱۵۷۴۰k - oldLength) + newLength;
                }
            } else {
                this.f۱۵۷۳۲c.mo۱۶۹۵۹a(dirty);
            }
        }
        int i3 = this.f۱۵۷۴۳n;
        this.f۱۵۷۴۳n = i3 + 1;
        entry.f۱۵۷۶۴f = null;
        if (entry.f۱۵۷۶۳e | success) {
            entry.f۱۵۷۶۳e = true;
            this.f۱۵۷۴۱l.mo۱۷۴۲۶a("CLEAN").writeByte(32);
            this.f۱۵۷۴۱l.mo۱۷۴۲۶a(entry.f۱۵۷۵۹a);
            entry.m۱۶۶۰۴a(this.f۱۵۷۴۱l);
            this.f۱۵۷۴۱l.writeByte(10);
            if (success) {
                long j = this.f۱۵۷۴۹t;
                this.f۱۵۷۴۹t = 1 + j;
                entry.f۱۵۷۶۵g = j;
            }
        } else {
            this.f۱۵۷۴۲m.remove(entry.f۱۵۷۵۹a);
            this.f۱۵۷۴۱l.mo۱۷۴۲۶a("REMOVE").writeByte(32);
            this.f۱۵۷۴۱l.mo۱۷۴۲۶a(entry.f۱۵۷۵۹a);
            this.f۱۵۷۴۱l.writeByte(10);
        }
        this.f۱۵۷۴۱l.flush();
        if (this.f۱۵۷۴۰k > this.f۱۵۷۳۸i || m۱۶۵۹۳o()) {
            this.f۱۵۷۵۰u.execute(this.f۱۵۷۵۱v);
        }
    }

    /* renamed from: o, reason: contains not printable characters */
    boolean m۱۶۵۹۳o() {
        int i = this.f۱۵۷۴۳n;
        return i >= 2000 && i >= this.f۱۵۷۴۲m.size();
    }

    /* renamed from: d, reason: contains not printable characters */
    public synchronized boolean m۱۶۵۸۹d(String key) {
        m۱۶۵۹۱m();
        m۱۶۵۸۰r();
        m۱۶۵۷۹f(key);
        d entry = this.f۱۵۷۴۲m.get(key);
        if (entry == null) {
            return false;
        }
        boolean removed = m۱۶۵۸۶a(entry);
        if (removed && this.f۱۵۷۴۰k <= this.f۱۵۷۳۸i) {
            this.f۱۵۷۴۷r = false;
        }
        return removed;
    }

    /* renamed from: a, reason: contains not printable characters */
    boolean m۱۶۵۸۶a(d entry) {
        c cVar = entry.f۱۵۷۶۴f;
        if (cVar != null) {
            cVar.m۱۶۶۰۰c();
        }
        for (int i = 0; i < this.f۱۵۷۳۹j; i++) {
            this.f۱۵۷۳۲c.mo۱۶۹۵۹a(entry.f۱۵۷۶۱c[i]);
            long j = this.f۱۵۷۴۰k;
            long[] jArr = entry.f۱۵۷۶۰b;
            this.f۱۵۷۴۰k = j - jArr[i];
            jArr[i] = 0;
        }
        int i2 = this.f۱۵۷۴۳n;
        this.f۱۵۷۴۳n = i2 + 1;
        this.f۱۵۷۴۱l.mo۱۷۴۲۶a("REMOVE").writeByte(32).mo۱۷۴۲۶a(entry.f۱۵۷۵۹a).writeByte(10);
        this.f۱۵۷۴۲m.remove(entry.f۱۵۷۵۹a);
        if (m۱۶۵۹۳o()) {
            this.f۱۵۷۵۰u.execute(this.f۱۵۷۵۱v);
        }
        return true;
    }

    /* renamed from: n, reason: contains not printable characters */
    public synchronized boolean m۱۶۵۹۲n() {
        return this.f۱۵۷۴۶q;
    }

    /* renamed from: r, reason: contains not printable characters */
    private synchronized void m۱۶۵۸۰r() {
        if (m۱۶۵۹۲n()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f۱۵۷۴۵p) {
            m۱۶۵۸۰r();
            m۱۶۵۹۵q();
            this.f۱۵۷۴۱l.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f۱۵۷۴۵p && !this.f۱۵۷۴۶q) {
            for (d entry : (d[]) this.f۱۵۷۴۲m.values().toArray(new d[this.f۱۵۷۴۲m.size()])) {
                if (entry.f۱۵۷۶۴f != null) {
                    entry.f۱۵۷۶۴f.m۱۶۵۹۸a();
                }
            }
            m۱۶۵۹۵q();
            this.f۱۵۷۴۱l.close();
            this.f۱۵۷۴۱l = null;
            this.f۱۵۷۴۶q = true;
            return;
        }
        this.f۱۵۷۴۶q = true;
    }

    /* renamed from: q, reason: contains not printable characters */
    void m۱۶۵۹۵q() {
        while (this.f۱۵۷۴۰k > this.f۱۵۷۳۸i) {
            d toEvict = this.f۱۵۷۴۲m.values().iterator().next();
            m۱۶۵۸۶a(toEvict);
        }
        this.f۱۵۷۴۷r = false;
    }

    /* renamed from: l, reason: contains not printable characters */
    public void m۱۶۵۹۰l() {
        close();
        this.f۱۵۷۳۲c.mo۱۶۹۶۳d(this.f۱۵۷۳۳d);
    }

    /* renamed from: f, reason: contains not printable characters */
    private void m۱۶۵۷۹f(String key) {
        Matcher matcher = f۱۵۷۳۱w.matcher(key);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + key + "\"");
        }
    }

    /* renamed from: e.f0.e.d$e */
    public final class e implements Closeable {

        /* renamed from: c, reason: contains not printable characters */
        private final String f۱۵۷۶۷c;

        /* renamed from: d, reason: contains not printable characters */
        private final long f۱۵۷۶۸d;

        /* renamed from: e, reason: contains not printable characters */
        private final InterfaceCs[] f۱۵۷۶۹e;

        e(String key, long sequenceNumber, InterfaceCs[] sources, long[] lengths) {
            this.f۱۵۷۶۷c = key;
            this.f۱۵۷۶۸d = sequenceNumber;
            this.f۱۵۷۶۹e = sources;
        }

        /* renamed from: l, reason: contains not printable characters */
        public c m۱۶۶۰۷l() {
            return Cd.this.m۱۶۵۸۴a(this.f۱۵۷۶۷c, this.f۱۵۷۶۸d);
        }

        /* renamed from: a, reason: contains not printable characters */
        public InterfaceCs m۱۶۶۰۶a(int index) {
            return this.f۱۵۷۶۹e[index];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InterfaceCs in : this.f۱۵۷۶۹e) {
                Cc.m۱۶۵۴۲a(in);
            }
        }
    }

    /* renamed from: e.f0.e.d$c */
    public final class c {

        /* renamed from: a, reason: contains not printable characters */
        final d f۱۵۷۵۴a;

        /* renamed from: b, reason: contains not printable characters */
        final boolean[] f۱۵۷۵۵b;

        /* renamed from: c, reason: contains not printable characters */
        private boolean f۱۵۷۵۶c;

        c(d entry) {
            this.f۱۵۷۵۴a = entry;
            this.f۱۵۷۵۵b = entry.f۱۵۷۶۳e ? null : new boolean[Cd.this.f۱۵۷۳۹j];
        }

        /* renamed from: c, reason: contains not printable characters */
        void m۱۶۶۰۰c() {
            if (this.f۱۵۷۵۴a.f۱۵۷۶۴f == this) {
                int i = 0;
                while (true) {
                    Cd cd = Cd.this;
                    if (i < cd.f۱۵۷۳۹j) {
                        try {
                            cd.f۱۵۷۳۲c.mo۱۶۹۵۹a(this.f۱۵۷۵۴a.f۱۵۷۶۲d[i]);
                        } catch (IOException e2) {
                        }
                        i++;
                    } else {
                        this.f۱۵۷۵۴a.f۱۵۷۶۴f = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public InterfaceCr m۱۶۵۹۷a(int index) {
            synchronized (Cd.this) {
                if (this.f۱۵۷۵۶c) {
                    throw new IllegalStateException();
                }
                if (this.f۱۵۷۵۴a.f۱۵۷۶۴f != this) {
                    return Cl.m۱۷۴۰۴a();
                }
                if (!this.f۱۵۷۵۴a.f۱۵۷۶۳e) {
                    this.f۱۵۷۵۵b[index] = true;
                }
                File dirtyFile = this.f۱۵۷۵۴a.f۱۵۷۶۲d[index];
                try {
                    InterfaceCr sink = Cd.this.f۱۵۷۳۲c.mo۱۶۹۶۲c(dirtyFile);
                    return new a(sink);
                } catch (FileNotFoundException e2) {
                    return Cl.m۱۷۴۰۴a();
                }
            }
        }

        /* renamed from: e.f0.e.d$c$a */
        class a extends Ce {
            a(InterfaceCr delegate) {
                super(delegate);
            }

            @Override // p۲۹۵e.p۲۹۶f0.p۲۹۷e.Ce
            /* renamed from: a, reason: contains not printable characters */
            protected void mo۱۶۶۰۹a(IOException e2) {
                synchronized (Cd.this) {
                    c.this.m۱۶۶۰۰c();
                }
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        public void m۱۶۵۹۹b() {
            synchronized (Cd.this) {
                if (this.f۱۵۷۵۶c) {
                    throw new IllegalStateException();
                }
                if (this.f۱۵۷۵۴a.f۱۵۷۶۴f == this) {
                    Cd.this.m۱۶۵۸۵a(this, true);
                }
                this.f۱۵۷۵۶c = true;
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۱۶۵۹۸a() {
            synchronized (Cd.this) {
                if (this.f۱۵۷۵۶c) {
                    throw new IllegalStateException();
                }
                if (this.f۱۵۷۵۴a.f۱۵۷۶۴f == this) {
                    Cd.this.m۱۶۵۸۵a(this, false);
                }
                this.f۱۵۷۵۶c = true;
            }
        }
    }

    /* renamed from: e.f0.e.d$d */
    private final class d {

        /* renamed from: a, reason: contains not printable characters */
        final String f۱۵۷۵۹a;

        /* renamed from: b, reason: contains not printable characters */
        final long[] f۱۵۷۶۰b;

        /* renamed from: c, reason: contains not printable characters */
        final File[] f۱۵۷۶۱c;

        /* renamed from: d, reason: contains not printable characters */
        final File[] f۱۵۷۶۲d;

        /* renamed from: e, reason: contains not printable characters */
        boolean f۱۵۷۶۳e;

        /* renamed from: f, reason: contains not printable characters */
        c f۱۵۷۶۴f;

        /* renamed from: g, reason: contains not printable characters */
        long f۱۵۷۶۵g;

        d(String key) {
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

        /* renamed from: a, reason: contains not printable characters */
        void m۱۶۶۰۵a(String[] strings) {
            if (strings.length != Cd.this.f۱۵۷۳۹j) {
                m۱۶۶۰۲b(strings);
                throw null;
            }
            for (int i = 0; i < strings.length; i++) {
                try {
                    this.f۱۵۷۶۰b[i] = Long.parseLong(strings[i]);
                } catch (NumberFormatException e2) {
                    m۱۶۶۰۲b(strings);
                    throw null;
                }
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        void m۱۶۶۰۴a(InterfaceCd writer) {
            for (long length : this.f۱۵۷۶۰b) {
                writer.writeByte(32).mo۱۷۴۳۰e(length);
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        private IOException m۱۶۶۰۲b(String[] strings) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strings));
        }

        /* renamed from: a, reason: contains not printable characters */
        e m۱۶۶۰۳a() {
            if (!Thread.holdsLock(Cd.this)) {
                throw new AssertionError();
            }
            InterfaceCs[] sources = new InterfaceCs[Cd.this.f۱۵۷۳۹j];
            long[] lengths = (long[]) this.f۱۵۷۶۰b.clone();
            for (int i = 0; i < Cd.this.f۱۵۷۳۹j; i++) {
                try {
                    sources[i] = Cd.this.f۱۵۷۳۲c.mo۱۶۹۶۱b(this.f۱۵۷۶۱c[i]);
                } catch (FileNotFoundException e2) {
                    for (int i2 = 0; i2 < Cd.this.f۱۵۷۳۹j && sources[i2] != null; i2++) {
                        Cc.m۱۶۵۴۲a(sources[i2]);
                    }
                    try {
                        Cd.this.m۱۶۵۸۶a(this);
                        return null;
                    } catch (IOException e3) {
                        return null;
                    }
                }
            }
            return Cd.this.new e(this.f۱۵۷۵۹a, this.f۱۵۷۶۵g, sources, lengths);
        }
    }
}
