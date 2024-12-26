package p۲۹۵e.p۲۹۶f0.p۳۰۱i;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p۲۹۵e.p۲۹۶f0.AbstractRunnableCb;
import p۲۹۵e.p۲۹۶f0.Cc;
import p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch;
import p۲۹۵e.p۲۹۶f0.p۳۰۳k.Cf;
import p۳۰۵f.InterfaceCd;
import p۳۰۵f.InterfaceCe;

/* renamed from: e.f0.i.g, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cg implements Closeable {

    /* renamed from: w, reason: contains not printable characters */
    private static final ExecutorService f۱۵۹۳۱w = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Cc.m۱۶۵۴۰a("OkHttp Http2Connection", true));

    /* renamed from: c, reason: contains not printable characters */
    final boolean f۱۵۹۳۲c;

    /* renamed from: d, reason: contains not printable characters */
    final h f۱۵۹۳۳d;

    /* renamed from: f, reason: contains not printable characters */
    final String f۱۵۹۳۵f;

    /* renamed from: g, reason: contains not printable characters */
    int f۱۵۹۳۶g;

    /* renamed from: h, reason: contains not printable characters */
    int f۱۵۹۳۷h;

    /* renamed from: i, reason: contains not printable characters */
    boolean f۱۵۹۳۸i;

    /* renamed from: j, reason: contains not printable characters */
    private final ScheduledExecutorService f۱۵۹۳۹j;

    /* renamed from: k, reason: contains not printable characters */
    private final ExecutorService f۱۵۹۴۰k;

    /* renamed from: l, reason: contains not printable characters */
    final InterfaceCl f۱۵۹۴۱l;

    /* renamed from: m, reason: contains not printable characters */
    private boolean f۱۵۹۴۲m;

    /* renamed from: o, reason: contains not printable characters */
    long f۱۵۹۴۴o;

    /* renamed from: s, reason: contains not printable characters */
    final Socket f۱۵۹۴۸s;

    /* renamed from: t, reason: contains not printable characters */
    final Cj f۱۵۹۴۹t;

    /* renamed from: u, reason: contains not printable characters */
    final j f۱۵۹۵۰u;

    /* renamed from: e, reason: contains not printable characters */
    final Map<Integer, Ci> f۱۵۹۳۴e = new LinkedHashMap();

    /* renamed from: n, reason: contains not printable characters */
    long f۱۵۹۴۳n = 0;

    /* renamed from: p, reason: contains not printable characters */
    Cm f۱۵۹۴۵p = new Cm();

    /* renamed from: q, reason: contains not printable characters */
    final Cm f۱۵۹۴۶q = new Cm();

    /* renamed from: r, reason: contains not printable characters */
    boolean f۱۵۹۴۷r = false;

    /* renamed from: v, reason: contains not printable characters */
    final Set<Integer> f۱۵۹۵۱v = new LinkedHashSet();

    Cg(g builder) {
        this.f۱۵۹۴۱l = builder.f۱۵۹۷۸f;
        boolean z = builder.f۱۵۹۷۹g;
        this.f۱۵۹۳۲c = z;
        this.f۱۵۹۳۳d = builder.f۱۵۹۷۷e;
        this.f۱۵۹۳۷h = z ? 1 : 2;
        if (builder.f۱۵۹۷۹g) {
            this.f۱۵۹۳۷h += 2;
        }
        if (builder.f۱۵۹۷۹g) {
            this.f۱۵۹۴۵p.m۱۶۹۴۲a(7, 16777216);
        }
        this.f۱۵۹۳۵f = builder.f۱۵۹۷۴b;
        this.f۱۵۹۳۹j = new ScheduledThreadPoolExecutor(1, Cc.m۱۶۵۴۰a(Cc.m۱۶۵۳۵a("OkHttp %s Writer", this.f۱۵۹۳۵f), false));
        if (builder.f۱۵۹۸۰h != 0) {
            ScheduledExecutorService scheduledExecutorService = this.f۱۵۹۳۹j;
            i iVar = new i(false, 0, 0);
            int i2 = builder.f۱۵۹۸۰h;
            scheduledExecutorService.scheduleAtFixedRate(iVar, i2, i2, TimeUnit.MILLISECONDS);
        }
        this.f۱۵۹۴۰k = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Cc.m۱۶۵۴۰a(Cc.m۱۶۵۳۵a("OkHttp %s Push Observer", this.f۱۵۹۳۵f), true));
        this.f۱۵۹۴۶q.m۱۶۹۴۲a(7, 65535);
        this.f۱۵۹۴۶q.m۱۶۹۴۲a(5, 16384);
        this.f۱۵۹۴۴o = this.f۱۵۹۴۶q.m۱۶۹۴۷c();
        this.f۱۵۹۴۸s = builder.f۱۵۹۷۳a;
        this.f۱۵۹۴۹t = new Cj(builder.f۱۵۹۷۶d, this.f۱۵۹۳۲c);
        this.f۱۵۹۵۰u = new j(new Ch(builder.f۱۵۹۷۵c, this.f۱۵۹۳۲c));
    }

    /* renamed from: a, reason: contains not printable characters */
    synchronized Ci m۱۶۸۰۴a(int id) {
        return this.f۱۵۹۳۴e.get(Integer.valueOf(id));
    }

    /* renamed from: c, reason: contains not printable characters */
    synchronized Ci m۱۶۸۱۸c(int streamId) {
        Ci stream;
        stream = this.f۱۵۹۳۴e.remove(Integer.valueOf(streamId));
        notifyAll();
        return stream;
    }

    /* renamed from: m, reason: contains not printable characters */
    public synchronized int m۱۶۸۲۲m() {
        return this.f۱۵۹۴۶q.m۱۶۹۴۶b(Integer.MAX_VALUE);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Ci m۱۶۸۰۵a(List<Cc> list, boolean out) {
        return m۱۶۸۰۰b(0, list, out);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000e, B:9:0x0013, B:11:0x0017, B:13:0x002e, B:15:0x0036, B:19:0x0040, B:21:0x0046, B:22:0x004f, B:36:0x0072, B:37:0x0077), top: B:5:0x0007, outer: #1 }] */
    /* renamed from: b, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ci m۱۶۸۰۰b(int r12, java.util.List<p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cc> r13, boolean r14) {
        /*
            r11 = this;
            r0 = r14 ^ 1
            r7 = 0
            e.f0.i.j r8 = r11.f۱۵۹۴۹t
            monitor-enter(r8)
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L7b
            int r1 = r11.f۱۵۹۳۷h     // Catch: java.lang.Throwable -> L78
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 <= r2) goto L13
            e.f0.i.b r1 = p۲۹۵e.p۲۹۶f0.p۳۰۱i.EnumCb.REFUSED_STREAM     // Catch: java.lang.Throwable -> L78
            r11.m۱۶۸۱۲a(r1)     // Catch: java.lang.Throwable -> L78
        L13:
            boolean r1 = r11.f۱۵۹۳۸i     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L72
            int r1 = r11.f۱۵۹۳۷h     // Catch: java.lang.Throwable -> L78
            r9 = r1
            int r1 = r11.f۱۵۹۳۷h     // Catch: java.lang.Throwable -> L78
            int r1 = r1 + 2
            r11.f۱۵۹۳۷h = r1     // Catch: java.lang.Throwable -> L78
            e.f0.i.i r10 = new e.f0.i.i     // Catch: java.lang.Throwable -> L78
            r1 = r10
            r2 = r9
            r3 = r11
            r4 = r0
            r5 = r7
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L78
            r1 = r10
            if (r14 == 0) goto L3f
            long r2 = r11.f۱۵۹۴۴o     // Catch: java.lang.Throwable -> L78
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L3f
            long r2 = r1.f۱۶۰۰۵b     // Catch: java.lang.Throwable -> L78
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L3d
            goto L3f
        L3d:
            r2 = 0
            goto L40
        L3f:
            r2 = 1
        L40:
            boolean r3 = r1.m۱۶۸۹۴g()     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L4f
            java.util.Map<java.lang.Integer, e.f0.i.i> r3 = r11.f۱۵۹۳۴e     // Catch: java.lang.Throwable -> L78
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L78
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L78
        L4f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L78
            if (r12 != 0) goto L58
            e.f0.i.j r3 = r11.f۱۵۹۴۹t     // Catch: java.lang.Throwable -> L7b
            r3.m۱۶۹۲۱a(r0, r9, r12, r13)     // Catch: java.lang.Throwable -> L7b
            goto L61
        L58:
            boolean r3 = r11.f۱۵۹۳۲c     // Catch: java.lang.Throwable -> L7b
            if (r3 != 0) goto L6a
            e.f0.i.j r3 = r11.f۱۵۹۴۹t     // Catch: java.lang.Throwable -> L7b
            r3.m۱۶۹۱۵a(r12, r9, r13)     // Catch: java.lang.Throwable -> L7b
        L61:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L69
            e.f0.i.j r3 = r11.f۱۵۹۴۹t
            r3.flush()
        L69:
            return r1
        L6a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r4 = "client streams shouldn't have associated stream IDs"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            throw r3     // Catch: java.lang.Throwable -> L7b
        L72:
            e.f0.i.a r1 = new e.f0.i.a     // Catch: java.lang.Throwable -> L78
            r1.<init>()     // Catch: java.lang.Throwable -> L78
            throw r1     // Catch: java.lang.Throwable -> L78
        L78:
            r1 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L78
            throw r1     // Catch: java.lang.Throwable -> L7b
        L7b:
            r1 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L7b
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cg.m۱۶۸۰۰b(int, java.util.List, boolean):e.f0.i.i");
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۸۱۱a(int streamId, boolean outFinished, p۳۰۵f.Cc buffer, long byteCount) {
        int toWrite;
        if (byteCount == 0) {
            this.f۱۵۹۴۹t.m۱۶۹۲۲a(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (this.f۱۵۹۴۴o <= 0) {
                    try {
                        if (!this.f۱۵۹۳۴e.containsKey(Integer.valueOf(streamId))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException e2) {
                        throw new InterruptedIOException();
                    }
                }
                toWrite = Math.min((int) Math.min(byteCount, this.f۱۵۹۴۴o), this.f۱۵۹۴۹t.m۱۶۹۲۶m());
                this.f۱۵۹۴۴o -= toWrite;
            }
            byteCount -= toWrite;
            this.f۱۵۹۴۹t.m۱۶۹۲۲a(outFinished && byteCount == 0, streamId, buffer, toWrite);
        }
    }

    /* renamed from: g, reason: contains not printable characters */
    void m۱۶۸۲۰g(long delta) {
        this.f۱۵۹۴۴o += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    /* renamed from: e.f0.i.g$a */
    class a extends AbstractRunnableCb {

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۵۲d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ EnumCb f۱۵۹۵۳e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String format, Object[] args, int i, EnumCb enumCb) {
            super(format, args);
            this.f۱۵۹۵۲d = i;
            this.f۱۵۹۵۳e = enumCb;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۷۲۴۰b() {
            try {
                Cg.this.m۱۶۸۱۶b(this.f۱۵۹۵۲d, this.f۱۵۹۵۳e);
            } catch (IOException e2) {
                Cg.this.m۱۶۸۰۳p();
            }
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    void m۱۶۸۱۹c(int streamId, EnumCb errorCode) {
        try {
            this.f۱۵۹۳۹j.execute(new a("OkHttp %s stream %d", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, errorCode));
        } catch (RejectedExecutionException e2) {
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۶۸۱۶b(int streamId, EnumCb statusCode) {
        this.f۱۵۹۴۹t.m۱۶۹۱۷a(streamId, statusCode);
    }

    /* renamed from: e.f0.i.g$b */
    class b extends AbstractRunnableCb {

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۵۵d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ long f۱۵۹۵۶e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String format, Object[] args, int i, long j) {
            super(format, args);
            this.f۱۵۹۵۵d = i;
            this.f۱۵۹۵۶e = j;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۷۲۴۰b() {
            try {
                Cg.this.f۱۵۹۴۹t.m۱۶۹۱۶a(this.f۱۵۹۵۵d, this.f۱۵۹۵۶e);
            } catch (IOException e2) {
                Cg.this.m۱۶۸۰۳p();
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۰۶a(int streamId, long unacknowledgedBytesRead) {
        try {
            this.f۱۵۹۳۹j.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, unacknowledgedBytesRead));
        } catch (RejectedExecutionException e2) {
        }
    }

    /* renamed from: e.f0.i.g$i */
    final class i extends AbstractRunnableCb {

        /* renamed from: d, reason: contains not printable characters */
        final boolean f۱۵۹۸۲d;

        /* renamed from: e, reason: contains not printable characters */
        final int f۱۵۹۸۳e;

        /* renamed from: f, reason: contains not printable characters */
        final int f۱۵۹۸۴f;

        i(boolean reply, int payload1, int payload2) {
            super("OkHttp %s ping %08x%08x", Cg.this.f۱۵۹۳۵f, Integer.valueOf(payload1), Integer.valueOf(payload2));
            this.f۱۵۹۸۲d = reply;
            this.f۱۵۹۸۳e = payload1;
            this.f۱۵۹۸۴f = payload2;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۷۲۴۰b() {
            Cg.this.m۱۶۸۱۵a(this.f۱۵۹۸۲d, this.f۱۵۹۸۳e, this.f۱۵۹۸۴f);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۱۵a(boolean reply, int payload1, int payload2) {
        boolean failedDueToMissingPong;
        if (!reply) {
            synchronized (this) {
                failedDueToMissingPong = this.f۱۵۹۴۲m;
                this.f۱۵۹۴۲m = true;
            }
            if (failedDueToMissingPong) {
                m۱۶۸۰۳p();
                return;
            }
        }
        try {
            this.f۱۵۹۴۹t.m۱۶۹۲۰a(reply, payload1, payload2);
        } catch (IOException e2) {
            m۱۶۸۰۳p();
        }
    }

    public void flush() {
        this.f۱۵۹۴۹t.flush();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۶۸۱۲a(EnumCb statusCode) {
        synchronized (this.f۱۵۹۴۹t) {
            synchronized (this) {
                if (this.f۱۵۹۳۸i) {
                    return;
                }
                this.f۱۵۹۳۸i = true;
                int lastGoodStreamId = this.f۱۵۹۳۶g;
                this.f۱۵۹۴۹t.m۱۶۹۱۸a(lastGoodStreamId, statusCode, Cc.f۱۵۷۰۳a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m۱۶۸۱۳a(EnumCb.NO_ERROR, EnumCb.CANCEL);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۱۳a(EnumCb connectionCode, EnumCb streamCode) {
        IOException thrown = null;
        try {
            m۱۶۸۱۲a(connectionCode);
        } catch (IOException e2) {
            thrown = e2;
        }
        Ci[] streamsToClose = null;
        synchronized (this) {
            if (!this.f۱۵۹۳۴e.isEmpty()) {
                streamsToClose = (Ci[]) this.f۱۵۹۳۴e.values().toArray(new Ci[this.f۱۵۹۳۴e.size()]);
                this.f۱۵۹۳۴e.clear();
            }
        }
        if (streamsToClose != null) {
            for (Ci stream : streamsToClose) {
                try {
                    stream.m۱۶۸۸۴a(streamCode);
                } catch (IOException e3) {
                    if (thrown != null) {
                        thrown = e3;
                    }
                }
            }
        }
        try {
            this.f۱۵۹۴۹t.close();
        } catch (IOException e4) {
            if (thrown == null) {
                thrown = e4;
            }
        }
        try {
            this.f۱۵۹۴۸s.close();
        } catch (IOException e5) {
            thrown = e5;
        }
        this.f۱۵۹۳۹j.shutdown();
        this.f۱۵۹۴۰k.shutdown();
        if (thrown != null) {
            throw thrown;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p, reason: contains not printable characters */
    public void m۱۶۸۰۳p() {
        try {
            m۱۶۸۱۳a(EnumCb.PROTOCOL_ERROR, EnumCb.PROTOCOL_ERROR);
        } catch (IOException e2) {
        }
    }

    /* renamed from: n, reason: contains not printable characters */
    public void m۱۶۸۲۳n() {
        m۱۶۸۱۴a(true);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۱۴a(boolean sendConnectionPreface) {
        if (sendConnectionPreface) {
            this.f۱۵۹۴۹t.m۱۶۹۲۵l();
            this.f۱۵۹۴۹t.m۱۶۹۲۴b(this.f۱۵۹۴۵p);
            int windowSize = this.f۱۵۹۴۵p.m۱۶۹۴۷c();
            if (windowSize != 65535) {
                this.f۱۵۹۴۹t.m۱۶۹۱۶a(0, windowSize - 65535);
            }
        }
        new Thread(this.f۱۵۹۵۰u).start();
    }

    /* renamed from: l, reason: contains not printable characters */
    public synchronized boolean m۱۶۸۲۱l() {
        return this.f۱۵۹۳۸i;
    }

    /* renamed from: e.f0.i.g$g */
    public static class g {

        /* renamed from: a, reason: contains not printable characters */
        Socket f۱۵۹۷۳a;

        /* renamed from: b, reason: contains not printable characters */
        String f۱۵۹۷۴b;

        /* renamed from: c, reason: contains not printable characters */
        InterfaceCe f۱۵۹۷۵c;

        /* renamed from: d, reason: contains not printable characters */
        InterfaceCd f۱۵۹۷۶d;

        /* renamed from: e, reason: contains not printable characters */
        h f۱۵۹۷۷e = h.f۱۵۹۸۱a;

        /* renamed from: f, reason: contains not printable characters */
        InterfaceCl f۱۵۹۷۸f = InterfaceCl.f۱۶۰۴۰a;

        /* renamed from: g, reason: contains not printable characters */
        boolean f۱۵۹۷۹g;

        /* renamed from: h, reason: contains not printable characters */
        int f۱۵۹۸۰h;

        public g(boolean client) {
            this.f۱۵۹۷۹g = client;
        }

        /* renamed from: a, reason: contains not printable characters */
        public g m۱۶۸۳۲a(Socket socket, String hostname, InterfaceCe source, InterfaceCd sink) {
            this.f۱۵۹۷۳a = socket;
            this.f۱۵۹۷۴b = hostname;
            this.f۱۵۹۷۵c = source;
            this.f۱۵۹۷۶d = sink;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public g m۱۶۸۳۱a(h listener) {
            this.f۱۵۹۷۷e = listener;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public g m۱۶۸۳۰a(int pingIntervalMillis) {
            this.f۱۵۹۸۰h = pingIntervalMillis;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Cg m۱۶۸۳۳a() {
            return new Cg(this);
        }
    }

    /* renamed from: e.f0.i.g$j */
    class j extends AbstractRunnableCb implements Ch.b {

        /* renamed from: d, reason: contains not printable characters */
        final Ch f۱۵۹۸۶d;

        j(Ch reader) {
            super("OkHttp %s", Cg.this.f۱۵۹۳۵f);
            this.f۱۵۹۸۶d = reader;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
        /* renamed from: b, reason: contains not printable characters */
        protected void mo۱۷۲۴۰b() {
            EnumCb connectionErrorCode = EnumCb.INTERNAL_ERROR;
            EnumCb streamErrorCode = EnumCb.INTERNAL_ERROR;
            try {
                try {
                    this.f۱۵۹۸۶d.m۱۶۸۶۶a(this);
                    while (this.f۱۵۹۸۶d.m۱۶۸۶۷a(false, (Ch.b) this)) {
                    }
                    connectionErrorCode = EnumCb.NO_ERROR;
                    streamErrorCode = EnumCb.CANCEL;
                    try {
                        Cg.this.m۱۶۸۱۳a(connectionErrorCode, streamErrorCode);
                    } catch (IOException e2) {
                    }
                } catch (IOException e3) {
                    connectionErrorCode = EnumCb.PROTOCOL_ERROR;
                    streamErrorCode = EnumCb.PROTOCOL_ERROR;
                }
            } finally {
                try {
                    Cg.this.m۱۶۸۱۳a(connectionErrorCode, streamErrorCode);
                } catch (IOException e4) {
                }
                Cc.m۱۶۵۴۲a(this.f۱۵۹۸۶d);
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۷۹a(boolean inFinished, int streamId, InterfaceCe source, int length) {
            if (Cg.this.m۱۶۸۱۷b(streamId)) {
                Cg.this.m۱۶۸۰۸a(streamId, source, length, inFinished);
                return;
            }
            Ci dataStream = Cg.this.m۱۶۸۰۴a(streamId);
            if (dataStream == null) {
                Cg.this.m۱۶۸۱۹c(streamId, EnumCb.PROTOCOL_ERROR);
                source.skip(length);
            } else {
                dataStream.m۱۶۸۸۵a(source, length);
                if (inFinished) {
                    dataStream.m۱۶۸۹۶i();
                }
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۷۸a(boolean inFinished, int streamId, int associatedStreamId, List<Cc> list) {
            if (Cg.this.m۱۶۸۱۷b(streamId)) {
                Cg.this.m۱۶۸۱۰a(streamId, list, inFinished);
                return;
            }
            synchronized (Cg.this) {
                Ci stream = Cg.this.m۱۶۸۰۴a(streamId);
                if (stream == null) {
                    if (Cg.this.f۱۵۹۳۸i) {
                        return;
                    }
                    if (streamId <= Cg.this.f۱۵۹۳۶g) {
                        return;
                    }
                    if (streamId % 2 == Cg.this.f۱۵۹۳۷h % 2) {
                        return;
                    }
                    Ci newStream = new Ci(streamId, Cg.this, false, inFinished, list);
                    Cg.this.f۱۵۹۳۶g = streamId;
                    Cg.this.f۱۵۹۳۴e.put(Integer.valueOf(streamId), newStream);
                    Cg.f۱۵۹۳۱w.execute(new a("OkHttp %s stream %d", new Object[]{Cg.this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, newStream));
                    return;
                }
                stream.m۱۶۸۸۶a(list);
                if (inFinished) {
                    stream.m۱۶۸۹۶i();
                }
            }
        }

        /* renamed from: e.f0.i.g$j$a */
        class a extends AbstractRunnableCb {

            /* renamed from: d, reason: contains not printable characters */
            final /* synthetic */ Ci f۱۵۹۸۸d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String format, Object[] args, Ci ci) {
                super(format, args);
                this.f۱۵۹۸۸d = ci;
            }

            @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
            /* renamed from: b, reason: contains not printable characters */
            public void mo۱۷۲۴۰b() {
                try {
                    Cg.this.f۱۵۹۳۳d.mo۱۶۸۳۶a(this.f۱۵۹۸۸d);
                } catch (IOException e2) {
                    Cf.m۱۷۰۰۷d().mo۱۷۰۱۲a(4, "Http2Connection.Listener failure for " + Cg.this.f۱۵۹۳۵f, e2);
                    try {
                        this.f۱۵۹۸۸d.m۱۶۸۸۴a(EnumCb.PROTOCOL_ERROR);
                    } catch (IOException e3) {
                    }
                }
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۷۵a(int streamId, EnumCb errorCode) {
            if (Cg.this.m۱۶۸۱۷b(streamId)) {
                Cg.this.m۱۶۸۰۷a(streamId, errorCode);
                return;
            }
            Ci rstStream = Cg.this.m۱۶۸۱۸c(streamId);
            if (rstStream != null) {
                rstStream.m۱۶۸۹۰c(errorCode);
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۸۰a(boolean clearPrevious, Cm newSettings) {
            int i;
            long delta = 0;
            Ci[] streamsToNotify = null;
            synchronized (Cg.this) {
                int priorWriteWindowSize = Cg.this.f۱۵۹۴۶q.m۱۶۹۴۷c();
                if (clearPrevious) {
                    Cg.this.f۱۵۹۴۶q.m۱۶۹۴۳a();
                }
                Cg.this.f۱۵۹۴۶q.m۱۶۹۴۴a(newSettings);
                m۱۶۸۳۸a(newSettings);
                int peerInitialWindowSize = Cg.this.f۱۵۹۴۶q.m۱۶۹۴۷c();
                if (peerInitialWindowSize != -1 && peerInitialWindowSize != priorWriteWindowSize) {
                    delta = peerInitialWindowSize - priorWriteWindowSize;
                    if (!Cg.this.f۱۵۹۴۷r) {
                        Cg.this.m۱۶۸۲۰g(delta);
                        Cg.this.f۱۵۹۴۷r = true;
                    }
                    if (!Cg.this.f۱۵۹۳۴e.isEmpty()) {
                        streamsToNotify = (Ci[]) Cg.this.f۱۵۹۳۴e.values().toArray(new Ci[Cg.this.f۱۵۹۳۴e.size()]);
                    }
                }
                Cg.f۱۵۹۳۱w.execute(new b("OkHttp %s settings", Cg.this.f۱۵۹۳۵f));
            }
            if (streamsToNotify != null && delta != 0) {
                for (Ci stream : streamsToNotify) {
                    synchronized (stream) {
                        stream.m۱۶۸۸۳a(delta);
                    }
                }
            }
        }

        /* renamed from: e.f0.i.g$j$b */
        class b extends AbstractRunnableCb {
            b(String format, Object... args) {
                super(format, args);
            }

            @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
            /* renamed from: b, reason: contains not printable characters */
            public void mo۱۷۲۴۰b() {
                Cg cg = Cg.this;
                cg.f۱۵۹۳۳d.mo۱۶۸۳۴a(cg);
            }
        }

        /* renamed from: e.f0.i.g$j$c */
        class c extends AbstractRunnableCb {

            /* renamed from: d, reason: contains not printable characters */
            final /* synthetic */ Cm f۱۵۹۹۱d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String format, Object[] args, Cm cm) {
                super(format, args);
                this.f۱۵۹۹۱d = cm;
            }

            @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
            /* renamed from: b, reason: contains not printable characters */
            public void mo۱۷۲۴۰b() {
                try {
                    Cg.this.f۱۵۹۴۹t.m۱۶۹۱۹a(this.f۱۵۹۹۱d);
                } catch (IOException e2) {
                    Cg.this.m۱۶۸۰۳p();
                }
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        private void m۱۶۸۳۸a(Cm peerSettings) {
            try {
                Cg.this.f۱۵۹۳۹j.execute(new c("OkHttp %s ACK Settings", new Object[]{Cg.this.f۱۵۹۳۵f}, peerSettings));
            } catch (RejectedExecutionException e2) {
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۷۱a() {
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۷۷a(boolean reply, int payload1, int payload2) {
            if (!reply) {
                try {
                    Cg.this.f۱۵۹۳۹j.execute(Cg.this.new i(true, payload1, payload2));
                } catch (RejectedExecutionException e2) {
                }
            } else {
                synchronized (Cg.this) {
                    Cg.this.f۱۵۹۴۲m = false;
                    Cg.this.notifyAll();
                }
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۷۶a(int lastGoodStreamId, EnumCb errorCode, p۳۰۵f.Cf debugData) {
            Ci[] streamsCopy;
            debugData.mo۱۷۴۷۱f();
            synchronized (Cg.this) {
                streamsCopy = (Ci[]) Cg.this.f۱۵۹۳۴e.values().toArray(new Ci[Cg.this.f۱۵۹۳۴e.size()]);
                Cg.this.f۱۵۹۳۸i = true;
            }
            for (Ci http2Stream : streamsCopy) {
                if (http2Stream.m۱۶۸۸۹c() > lastGoodStreamId && http2Stream.m۱۶۸۹۳f()) {
                    http2Stream.m۱۶۸۹۰c(EnumCb.REFUSED_STREAM);
                    Cg.this.m۱۶۸۱۸c(http2Stream.m۱۶۸۸۹c());
                }
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۷۴a(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                synchronized (Cg.this) {
                    Cg.this.f۱۵۹۴۴o += windowSizeIncrement;
                    Cg.this.notifyAll();
                }
                return;
            }
            Ci stream = Cg.this.m۱۶۸۰۴a(streamId);
            if (stream != null) {
                synchronized (stream) {
                    stream.m۱۶۸۸۳a(windowSizeIncrement);
                }
            }
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۷۲a(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Ch.b
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۷۳a(int streamId, int promisedStreamId, List<Cc> list) {
            Cg.this.m۱۶۸۰۹a(promisedStreamId, list);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    boolean m۱۶۸۱۷b(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۰۹a(int streamId, List<Cc> list) {
        synchronized (this) {
            if (this.f۱۵۹۵۱v.contains(Integer.valueOf(streamId))) {
                m۱۶۸۱۹c(streamId, EnumCb.PROTOCOL_ERROR);
                return;
            }
            this.f۱۵۹۵۱v.add(Integer.valueOf(streamId));
            try {
                this.f۱۵۹۴۰k.execute(new c("OkHttp %s Push Request[%s]", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, list));
            } catch (RejectedExecutionException e2) {
            }
        }
    }

    /* renamed from: e.f0.i.g$c */
    class c extends AbstractRunnableCb {

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۵۸d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ List f۱۵۹۵۹e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String format, Object[] args, int i, List list) {
            super(format, args);
            this.f۱۵۹۵۸d = i;
            this.f۱۵۹۵۹e = list;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۷۲۴۰b() {
            boolean cancel = Cg.this.f۱۵۹۴۱l.mo۱۶۹۳۹a(this.f۱۵۹۵۸d, this.f۱۵۹۵۹e);
            if (cancel) {
                try {
                    Cg.this.f۱۵۹۴۹t.m۱۶۹۱۷a(this.f۱۵۹۵۸d, EnumCb.CANCEL);
                    synchronized (Cg.this) {
                        Cg.this.f۱۵۹۵۱v.remove(Integer.valueOf(this.f۱۵۹۵۸d));
                    }
                } catch (IOException e2) {
                }
            }
        }
    }

    /* renamed from: e.f0.i.g$d */
    class d extends AbstractRunnableCb {

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۶۱d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ List f۱۵۹۶۲e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ boolean f۱۵۹۶۳f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String format, Object[] args, int i, List list, boolean z) {
            super(format, args);
            this.f۱۵۹۶۱d = i;
            this.f۱۵۹۶۲e = list;
            this.f۱۵۹۶۳f = z;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۷۲۴۰b() {
            boolean cancel = Cg.this.f۱۵۹۴۱l.mo۱۶۹۴۰a(this.f۱۵۹۶۱d, this.f۱۵۹۶۲e, this.f۱۵۹۶۳f);
            if (cancel) {
                try {
                    Cg.this.f۱۵۹۴۹t.m۱۶۹۱۷a(this.f۱۵۹۶۱d, EnumCb.CANCEL);
                } catch (IOException e2) {
                    return;
                }
            }
            if (cancel || this.f۱۵۹۶۳f) {
                synchronized (Cg.this) {
                    Cg.this.f۱۵۹۵۱v.remove(Integer.valueOf(this.f۱۵۹۶۱d));
                }
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۱۰a(int streamId, List<Cc> list, boolean inFinished) {
        try {
            this.f۱۵۹۴۰k.execute(new d("OkHttp %s Push Headers[%s]", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, list, inFinished));
        } catch (RejectedExecutionException e2) {
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۰۸a(int streamId, InterfaceCe source, int byteCount, boolean inFinished) {
        p۳۰۵f.Cc buffer = new p۳۰۵f.Cc();
        source.mo۱۷۴۴۲d(byteCount);
        source.mo۱۷۴۷۷b(buffer, byteCount);
        if (buffer.m۱۷۳۳۲q() != byteCount) {
            throw new IOException(buffer.m۱۷۳۳۲q() + " != " + byteCount);
        }
        this.f۱۵۹۴۰k.execute(new e("OkHttp %s Push Data[%s]", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, buffer, byteCount, inFinished));
    }

    /* renamed from: e.f0.i.g$e */
    class e extends AbstractRunnableCb {

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۶۵d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ p۳۰۵f.Cc f۱۵۹۶۶e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۶۷f;

        /* renamed from: g, reason: contains not printable characters */
        final /* synthetic */ boolean f۱۵۹۶۸g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String format, Object[] args, int i, p۳۰۵f.Cc cc, int i2, boolean z) {
            super(format, args);
            this.f۱۵۹۶۵d = i;
            this.f۱۵۹۶۶e = cc;
            this.f۱۵۹۶۷f = i2;
            this.f۱۵۹۶۸g = z;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۷۲۴۰b() {
            try {
                boolean cancel = Cg.this.f۱۵۹۴۱l.mo۱۶۹۳۸a(this.f۱۵۹۶۵d, this.f۱۵۹۶۶e, this.f۱۵۹۶۷f, this.f۱۵۹۶۸g);
                if (cancel) {
                    Cg.this.f۱۵۹۴۹t.m۱۶۹۱۷a(this.f۱۵۹۶۵d, EnumCb.CANCEL);
                }
                if (cancel || this.f۱۵۹۶۸g) {
                    synchronized (Cg.this) {
                        Cg.this.f۱۵۹۵۱v.remove(Integer.valueOf(this.f۱۵۹۶۵d));
                    }
                }
            } catch (IOException e2) {
            }
        }
    }

    /* renamed from: e.f0.i.g$f */
    class f extends AbstractRunnableCb {

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۷۰d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ EnumCb f۱۵۹۷۱e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String format, Object[] args, int i, EnumCb enumCb) {
            super(format, args);
            this.f۱۵۹۷۰d = i;
            this.f۱۵۹۷۱e = enumCb;
        }

        @Override // p۲۹۵e.p۲۹۶f0.AbstractRunnableCb
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۷۲۴۰b() {
            Cg.this.f۱۵۹۴۱l.mo۱۶۹۳۷a(this.f۱۵۹۷۰d, this.f۱۵۹۷۱e);
            synchronized (Cg.this) {
                Cg.this.f۱۵۹۵۱v.remove(Integer.valueOf(this.f۱۵۹۷۰d));
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۶۸۰۷a(int streamId, EnumCb errorCode) {
        this.f۱۵۹۴۰k.execute(new f("OkHttp %s Push Reset[%s]", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, errorCode));
    }

    /* renamed from: e.f0.i.g$h */
    public static abstract class h {

        /* renamed from: a, reason: contains not printable characters */
        public static final h f۱۵۹۸۱a = new a();

        /* renamed from: a, reason: contains not printable characters */
        public abstract void mo۱۶۸۳۶a(Ci ci);

        /* renamed from: e.f0.i.g$h$a */
        final class a extends h {
            a() {
            }

            @Override // p۲۹۵e.p۲۹۶f0.p۳۰۱i.Cg.h
            /* renamed from: a, reason: contains not printable characters */
            public void mo۱۶۸۳۶a(Ci stream) {
                stream.m۱۶۸۸۴a(EnumCb.REFUSED_STREAM);
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۶۸۳۴a(Cg connection) {
        }
    }
}
