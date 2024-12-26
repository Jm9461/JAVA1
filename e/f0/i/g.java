package e.f0.i;

import e.f0.i.h;
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

public final class g implements Closeable {
    private static final ExecutorService w = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.f0.c.a("OkHttp Http2Connection", true));

    /* renamed from: c  reason: collision with root package name */
    final boolean f۳۹۱۷c;

    /* renamed from: d  reason: collision with root package name */
    final h f۳۹۱۸d;

    /* renamed from: e  reason: collision with root package name */
    final Map<Integer, i> f۳۹۱۹e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    final String f۳۹۲۰f;

    /* renamed from: g  reason: collision with root package name */
    int f۳۹۲۱g;

    /* renamed from: h  reason: collision with root package name */
    int f۳۹۲۲h;
    boolean i;
    private final ScheduledExecutorService j;
    private final ExecutorService k;
    final l l;
    private boolean m;
    long n = 0;
    long o;
    m p = new m();
    final m q = new m();
    boolean r = false;
    final Socket s;
    final j t;
    final j u;
    final Set<Integer> v = new LinkedHashSet();

    g(C۰۱۲۰g builder) {
        this.l = builder.f۳۹۴۹f;
        boolean z = builder.f۳۹۵۰g;
        this.f۳۹۱۷c = z;
        this.f۳۹۱۸d = builder.f۳۹۴۸e;
        this.f۳۹۲۲h = z ? 1 : 2;
        if (builder.f۳۹۵۰g) {
            this.f۳۹۲۲h += 2;
        }
        if (builder.f۳۹۵۰g) {
            this.p.a(7, 16777216);
        }
        this.f۳۹۲۰f = builder.f۳۹۴۵b;
        this.j = new ScheduledThreadPoolExecutor(1, e.f0.c.a(e.f0.c.a("OkHttp %s Writer", this.f۳۹۲۰f), false));
        if (builder.f۳۹۵۱h != 0) {
            ScheduledExecutorService scheduledExecutorService = this.j;
            i iVar = new i(false, 0, 0);
            int i2 = builder.f۳۹۵۱h;
            scheduledExecutorService.scheduleAtFixedRate(iVar, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.k = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), e.f0.c.a(e.f0.c.a("OkHttp %s Push Observer", this.f۳۹۲۰f), true));
        this.q.a(7, 65535);
        this.q.a(5, 16384);
        this.o = (long) this.q.c();
        this.s = builder.f۳۹۴۴a;
        this.t = new j(builder.f۳۹۴۷d, this.f۳۹۱۷c);
        this.u = new j(new h(builder.f۳۹۴۶c, this.f۳۹۱۷c));
    }

    /* access modifiers changed from: package-private */
    public synchronized i a(int id) {
        return this.f۳۹۱۹e.get(Integer.valueOf(id));
    }

    /* access modifiers changed from: package-private */
    public synchronized i c(int streamId) {
        i stream;
        stream = this.f۳۹۱۹e.remove(Integer.valueOf(streamId));
        notifyAll();
        return stream;
    }

    public synchronized int m() {
        return this.q.b(Integer.MAX_VALUE);
    }

    public i a(List<c> list, boolean out) {
        return b(0, list, out);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private e.f0.i.i b(int r12, java.util.List<e.f0.i.c> r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f0.i.g.b(int, java.util.List, boolean):e.f0.i.i");
    }

    public void a(int streamId, boolean outFinished, f.c buffer, long byteCount) {
        int toWrite;
        if (byteCount == 0) {
            this.t.a(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (this.o <= 0) {
                    try {
                        if (this.f۳۹۱۹e.containsKey(Integer.valueOf(streamId))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException e2) {
                        throw new InterruptedIOException();
                    }
                }
                toWrite = Math.min((int) Math.min(byteCount, this.o), this.t.m());
                this.o -= (long) toWrite;
            }
            byteCount -= (long) toWrite;
            this.t.a(outFinished && byteCount == 0, streamId, buffer, toWrite);
        }
    }

    /* access modifiers changed from: package-private */
    public void g(long delta) {
        this.o += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends e.f0.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۳۹۲۳d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f۳۹۲۴e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String format, Object[] args, int i, b bVar) {
            super(format, args);
            this.f۳۹۲۳d = i;
            this.f۳۹۲۴e = bVar;
        }

        @Override // e.f0.b
        public void b() {
            try {
                g.this.b(this.f۳۹۲۳d, this.f۳۹۲۴e);
            } catch (IOException e2) {
                g.this.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(int streamId, b errorCode) {
        try {
            this.j.execute(new a("OkHttp %s stream %d", new Object[]{this.f۳۹۲۰f, Integer.valueOf(streamId)}, streamId, errorCode));
        } catch (RejectedExecutionException e2) {
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int streamId, b statusCode) {
        this.t.a(streamId, statusCode);
    }

    class b extends e.f0.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۳۹۲۶d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f۳۹۲۷e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String format, Object[] args, int i, long j) {
            super(format, args);
            this.f۳۹۲۶d = i;
            this.f۳۹۲۷e = j;
        }

        @Override // e.f0.b
        public void b() {
            try {
                g.this.t.a(this.f۳۹۲۶d, this.f۳۹۲۷e);
            } catch (IOException e2) {
                g.this.p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int streamId, long unacknowledgedBytesRead) {
        try {
            this.j.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f۳۹۲۰f, Integer.valueOf(streamId)}, streamId, unacknowledgedBytesRead));
        } catch (RejectedExecutionException e2) {
        }
    }

    final class i extends e.f0.b {

        /* renamed from: d  reason: collision with root package name */
        final boolean f۳۹۵۳d;

        /* renamed from: e  reason: collision with root package name */
        final int f۳۹۵۴e;

        /* renamed from: f  reason: collision with root package name */
        final int f۳۹۵۵f;

        i(boolean reply, int payload1, int payload2) {
            super("OkHttp %s ping %08x%08x", g.this.f۳۹۲۰f, Integer.valueOf(payload1), Integer.valueOf(payload2));
            this.f۳۹۵۳d = reply;
            this.f۳۹۵۴e = payload1;
            this.f۳۹۵۵f = payload2;
        }

        @Override // e.f0.b
        public void b() {
            g.this.a(this.f۳۹۵۳d, this.f۳۹۵۴e, this.f۳۹۵۵f);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean reply, int payload1, int payload2) {
        boolean failedDueToMissingPong;
        if (!reply) {
            synchronized (this) {
                failedDueToMissingPong = this.m;
                this.m = true;
            }
            if (failedDueToMissingPong) {
                p();
                return;
            }
        }
        try {
            this.t.a(reply, payload1, payload2);
        } catch (IOException e2) {
            p();
        }
    }

    public void flush() {
        this.t.flush();
    }

    public void a(b statusCode) {
        synchronized (this.t) {
            synchronized (this) {
                if (!this.i) {
                    this.i = true;
                    this.t.a(this.f۳۹۲۱g, statusCode, e.f0.c.f۳۷۴۲a);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(b.NO_ERROR, b.CANCEL);
    }

    /* access modifiers changed from: package-private */
    public void a(b connectionCode, b streamCode) {
        IOException thrown = null;
        try {
            a(connectionCode);
        } catch (IOException e2) {
            thrown = e2;
        }
        i[] streamsToClose = null;
        synchronized (this) {
            if (!this.f۳۹۱۹e.isEmpty()) {
                streamsToClose = (i[]) this.f۳۹۱۹e.values().toArray(new i[this.f۳۹۱۹e.size()]);
                this.f۳۹۱۹e.clear();
            }
        }
        if (streamsToClose != null) {
            for (i stream : streamsToClose) {
                try {
                    stream.a(streamCode);
                } catch (IOException e3) {
                    if (thrown != null) {
                        thrown = e3;
                    }
                }
            }
        }
        try {
            this.t.close();
        } catch (IOException e4) {
            if (thrown == null) {
                thrown = e4;
            }
        }
        try {
            this.s.close();
        } catch (IOException e5) {
            thrown = e5;
        }
        this.j.shutdown();
        this.k.shutdown();
        if (thrown != null) {
            throw thrown;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void p() {
        try {
            a(b.PROTOCOL_ERROR, b.PROTOCOL_ERROR);
        } catch (IOException e2) {
        }
    }

    public void n() {
        a(true);
    }

    /* access modifiers changed from: package-private */
    public void a(boolean sendConnectionPreface) {
        if (sendConnectionPreface) {
            this.t.l();
            this.t.b(this.p);
            int windowSize = this.p.c();
            if (windowSize != 65535) {
                this.t.a(0, (long) (windowSize - 65535));
            }
        }
        new Thread(this.u).start();
    }

    public synchronized boolean l() {
        return this.i;
    }

    /* renamed from: e.f0.i.g$g  reason: collision with other inner class name */
    public static class C۰۱۲۰g {

        /* renamed from: a  reason: collision with root package name */
        Socket f۳۹۴۴a;

        /* renamed from: b  reason: collision with root package name */
        String f۳۹۴۵b;

        /* renamed from: c  reason: collision with root package name */
        f.e f۳۹۴۶c;

        /* renamed from: d  reason: collision with root package name */
        f.d f۳۹۴۷d;

        /* renamed from: e  reason: collision with root package name */
        h f۳۹۴۸e = h.f۳۹۵۲a;

        /* renamed from: f  reason: collision with root package name */
        l f۳۹۴۹f = l.f۴۰۰۶a;

        /* renamed from: g  reason: collision with root package name */
        boolean f۳۹۵۰g;

        /* renamed from: h  reason: collision with root package name */
        int f۳۹۵۱h;

        public C۰۱۲۰g(boolean client) {
            this.f۳۹۵۰g = client;
        }

        public C۰۱۲۰g a(Socket socket, String hostname, f.e source, f.d sink) {
            this.f۳۹۴۴a = socket;
            this.f۳۹۴۵b = hostname;
            this.f۳۹۴۶c = source;
            this.f۳۹۴۷d = sink;
            return this;
        }

        public C۰۱۲۰g a(h listener) {
            this.f۳۹۴۸e = listener;
            return this;
        }

        public C۰۱۲۰g a(int pingIntervalMillis) {
            this.f۳۹۵۱h = pingIntervalMillis;
            return this;
        }

        public g a() {
            return new g(this);
        }
    }

    /* access modifiers changed from: package-private */
    public class j extends e.f0.b implements h.b {

        /* renamed from: d  reason: collision with root package name */
        final h f۳۹۵۷d;

        j(h reader) {
            super("OkHttp %s", g.this.f۳۹۲۰f);
            this.f۳۹۵۷d = reader;
        }

        /* access modifiers changed from: protected */
        @Override // e.f0.b
        public void b() {
            b connectionErrorCode = b.INTERNAL_ERROR;
            b streamErrorCode = b.INTERNAL_ERROR;
            try {
                this.f۳۹۵۷d.a(this);
                while (this.f۳۹۵۷d.a(false, (h.b) this)) {
                }
                try {
                    g.this.a(b.NO_ERROR, b.CANCEL);
                } catch (IOException e2) {
                }
            } catch (IOException e3) {
                connectionErrorCode = b.PROTOCOL_ERROR;
                try {
                    g.this.a(connectionErrorCode, b.PROTOCOL_ERROR);
                } catch (IOException e4) {
                }
            } catch (Throwable th) {
                try {
                    g.this.a(connectionErrorCode, streamErrorCode);
                } catch (IOException e5) {
                }
                e.f0.c.a(this.f۳۹۵۷d);
                throw th;
            }
            e.f0.c.a(this.f۳۹۵۷d);
        }

        @Override // e.f0.i.h.b
        public void a(boolean inFinished, int streamId, f.e source, int length) {
            if (g.this.b(streamId)) {
                g.this.a(streamId, source, length, inFinished);
                return;
            }
            i dataStream = g.this.a(streamId);
            if (dataStream == null) {
                g.this.c(streamId, b.PROTOCOL_ERROR);
                source.skip((long) length);
                return;
            }
            dataStream.a(source, length);
            if (inFinished) {
                dataStream.i();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
            r1.a(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
            if (r12 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
            r1.i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        @Override // e.f0.i.h.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(boolean r12, int r13, int r14, java.util.List<e.f0.i.c> r15) {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f0.i.g.j.a(boolean, int, int, java.util.List):void");
        }

        class a extends e.f0.b {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ i f۳۹۵۹d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String format, Object[] args, i iVar) {
                super(format, args);
                this.f۳۹۵۹d = iVar;
            }

            @Override // e.f0.b
            public void b() {
                try {
                    g.this.f۳۹۱۸d.a(this.f۳۹۵۹d);
                } catch (IOException e2) {
                    e.f0.k.f d2 = e.f0.k.f.d();
                    d2.a(4, "Http2Connection.Listener failure for " + g.this.f۳۹۲۰f, e2);
                    try {
                        this.f۳۹۵۹d.a(b.PROTOCOL_ERROR);
                    } catch (IOException e3) {
                    }
                }
            }
        }

        @Override // e.f0.i.h.b
        public void a(int streamId, b errorCode) {
            if (g.this.b(streamId)) {
                g.this.a(streamId, errorCode);
                return;
            }
            i rstStream = g.this.c(streamId);
            if (rstStream != null) {
                rstStream.c(errorCode);
            }
        }

        @Override // e.f0.i.h.b
        public void a(boolean clearPrevious, m newSettings) {
            int i;
            long delta = 0;
            i[] streamsToNotify = null;
            synchronized (g.this) {
                int priorWriteWindowSize = g.this.q.c();
                if (clearPrevious) {
                    g.this.q.a();
                }
                g.this.q.a(newSettings);
                a(newSettings);
                int peerInitialWindowSize = g.this.q.c();
                if (!(peerInitialWindowSize == -1 || peerInitialWindowSize == priorWriteWindowSize)) {
                    delta = (long) (peerInitialWindowSize - priorWriteWindowSize);
                    if (!g.this.r) {
                        g.this.g(delta);
                        g.this.r = true;
                    }
                    if (!g.this.f۳۹۱۹e.isEmpty()) {
                        streamsToNotify = (i[]) g.this.f۳۹۱۹e.values().toArray(new i[g.this.f۳۹۱۹e.size()]);
                    }
                }
                g.w.execute(new b("OkHttp %s settings", g.this.f۳۹۲۰f));
            }
            if (!(streamsToNotify == null || delta == 0)) {
                for (i stream : streamsToNotify) {
                    synchronized (stream) {
                        stream.a(delta);
                    }
                }
            }
        }

        class b extends e.f0.b {
            b(String format, Object... args) {
                super(format, args);
            }

            @Override // e.f0.b
            public void b() {
                g gVar = g.this;
                gVar.f۳۹۱۸d.a(gVar);
            }
        }

        /* access modifiers changed from: package-private */
        public class c extends e.f0.b {

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ m f۳۹۶۲d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(String format, Object[] args, m mVar) {
                super(format, args);
                this.f۳۹۶۲d = mVar;
            }

            @Override // e.f0.b
            public void b() {
                try {
                    g.this.t.a(this.f۳۹۶۲d);
                } catch (IOException e2) {
                    g.this.p();
                }
            }
        }

        private void a(m peerSettings) {
            try {
                g.this.j.execute(new c("OkHttp %s ACK Settings", new Object[]{g.this.f۳۹۲۰f}, peerSettings));
            } catch (RejectedExecutionException e2) {
            }
        }

        @Override // e.f0.i.h.b
        public void a() {
        }

        @Override // e.f0.i.h.b
        public void a(boolean reply, int payload1, int payload2) {
            if (reply) {
                synchronized (g.this) {
                    g.this.m = false;
                    g.this.notifyAll();
                }
                return;
            }
            try {
                g.this.j.execute(new i(true, payload1, payload2));
            } catch (RejectedExecutionException e2) {
            }
        }

        @Override // e.f0.i.h.b
        public void a(int lastGoodStreamId, b errorCode, f.f debugData) {
            i[] streamsCopy;
            debugData.f();
            synchronized (g.this) {
                streamsCopy = (i[]) g.this.f۳۹۱۹e.values().toArray(new i[g.this.f۳۹۱۹e.size()]);
                g.this.i = true;
            }
            for (i http2Stream : streamsCopy) {
                if (http2Stream.c() > lastGoodStreamId && http2Stream.f()) {
                    http2Stream.c(b.REFUSED_STREAM);
                    g.this.c(http2Stream.c());
                }
            }
        }

        @Override // e.f0.i.h.b
        public void a(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                synchronized (g.this) {
                    g.this.o += windowSizeIncrement;
                    g.this.notifyAll();
                }
                return;
            }
            i stream = g.this.a(streamId);
            if (stream != null) {
                synchronized (stream) {
                    stream.a(windowSizeIncrement);
                }
            }
        }

        @Override // e.f0.i.h.b
        public void a(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        @Override // e.f0.i.h.b
        public void a(int streamId, int promisedStreamId, List<c> list) {
            g.this.a(promisedStreamId, list);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    public void a(int streamId, List<c> list) {
        synchronized (this) {
            if (this.v.contains(Integer.valueOf(streamId))) {
                c(streamId, b.PROTOCOL_ERROR);
                return;
            }
            this.v.add(Integer.valueOf(streamId));
            try {
                this.k.execute(new c("OkHttp %s Push Request[%s]", new Object[]{this.f۳۹۲۰f, Integer.valueOf(streamId)}, streamId, list));
            } catch (RejectedExecutionException e2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class c extends e.f0.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۳۹۲۹d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f۳۹۳۰e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String format, Object[] args, int i, List list) {
            super(format, args);
            this.f۳۹۲۹d = i;
            this.f۳۹۳۰e = list;
        }

        @Override // e.f0.b
        public void b() {
            if (g.this.l.a(this.f۳۹۲۹d, this.f۳۹۳۰e)) {
                try {
                    g.this.t.a(this.f۳۹۲۹d, b.CANCEL);
                    synchronized (g.this) {
                        g.this.v.remove(Integer.valueOf(this.f۳۹۲۹d));
                    }
                } catch (IOException e2) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d extends e.f0.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۳۹۳۲d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f۳۹۳۳e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f۳۹۳۴f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String format, Object[] args, int i, List list, boolean z) {
            super(format, args);
            this.f۳۹۳۲d = i;
            this.f۳۹۳۳e = list;
            this.f۳۹۳۴f = z;
        }

        @Override // e.f0.b
        public void b() {
            boolean cancel = g.this.l.a(this.f۳۹۳۲d, this.f۳۹۳۳e, this.f۳۹۳۴f);
            if (cancel) {
                try {
                    g.this.t.a(this.f۳۹۳۲d, b.CANCEL);
                } catch (IOException e2) {
                    return;
                }
            }
            if (cancel || this.f۳۹۳۴f) {
                synchronized (g.this) {
                    g.this.v.remove(Integer.valueOf(this.f۳۹۳۲d));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int streamId, List<c> list, boolean inFinished) {
        try {
            this.k.execute(new d("OkHttp %s Push Headers[%s]", new Object[]{this.f۳۹۲۰f, Integer.valueOf(streamId)}, streamId, list, inFinished));
        } catch (RejectedExecutionException e2) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int streamId, f.e source, int byteCount, boolean inFinished) {
        f.c buffer = new f.c();
        source.d((long) byteCount);
        source.b(buffer, (long) byteCount);
        if (buffer.q() == ((long) byteCount)) {
            this.k.execute(new e("OkHttp %s Push Data[%s]", new Object[]{this.f۳۹۲۰f, Integer.valueOf(streamId)}, streamId, buffer, byteCount, inFinished));
            return;
        }
        throw new IOException(buffer.q() + " != " + byteCount);
    }

    /* access modifiers changed from: package-private */
    public class e extends e.f0.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۳۹۳۶d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f.c f۳۹۳۷e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f۳۹۳۸f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f۳۹۳۹g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String format, Object[] args, int i, f.c cVar, int i2, boolean z) {
            super(format, args);
            this.f۳۹۳۶d = i;
            this.f۳۹۳۷e = cVar;
            this.f۳۹۳۸f = i2;
            this.f۳۹۳۹g = z;
        }

        @Override // e.f0.b
        public void b() {
            try {
                boolean cancel = g.this.l.a(this.f۳۹۳۶d, this.f۳۹۳۷e, this.f۳۹۳۸f, this.f۳۹۳۹g);
                if (cancel) {
                    g.this.t.a(this.f۳۹۳۶d, b.CANCEL);
                }
                if (cancel || this.f۳۹۳۹g) {
                    synchronized (g.this) {
                        g.this.v.remove(Integer.valueOf(this.f۳۹۳۶d));
                    }
                }
            } catch (IOException e2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class f extends e.f0.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f۳۹۴۱d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f۳۹۴۲e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String format, Object[] args, int i, b bVar) {
            super(format, args);
            this.f۳۹۴۱d = i;
            this.f۳۹۴۲e = bVar;
        }

        @Override // e.f0.b
        public void b() {
            g.this.l.a(this.f۳۹۴۱d, this.f۳۹۴۲e);
            synchronized (g.this) {
                g.this.v.remove(Integer.valueOf(this.f۳۹۴۱d));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int streamId, b errorCode) {
        this.k.execute(new f("OkHttp %s Push Reset[%s]", new Object[]{this.f۳۹۲۰f, Integer.valueOf(streamId)}, streamId, errorCode));
    }

    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        public static final h f۳۹۵۲a = new a();

        public abstract void a(i iVar);

        class a extends h {
            a() {
            }

            @Override // e.f0.i.g.h
            public void a(i stream) {
                stream.a(b.REFUSED_STREAM);
            }
        }

        public void a(g connection) {
        }
    }
}
