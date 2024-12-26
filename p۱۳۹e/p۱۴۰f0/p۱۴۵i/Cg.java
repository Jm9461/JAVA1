package p۱۳۹e.p۱۴۰f0.p۱۴۵i;

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
import p۱۳۹e.p۱۴۰f0.AbstractRunnableCb;
import p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch;
import p۱۴۹f.AbstractCd;
import p۱۴۹f.AbstractCe;

/* renamed from: e.f0.i.g  reason: invalid class name */
public final class Cg implements Closeable {

    /* renamed from: w  reason: contains not printable characters */
    private static final ExecutorService f۱۵۹۳۱w = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۹a("OkHttp Http2Connection", true));

    /* renamed from: c  reason: contains not printable characters */
    final boolean f۱۵۹۳۲c;

    /* renamed from: d  reason: contains not printable characters */
    final AbstractCh f۱۵۹۳۳d;

    /* renamed from: e  reason: contains not printable characters */
    final Map<Integer, Ci> f۱۵۹۳۴e = new LinkedHashMap();

    /* renamed from: f  reason: contains not printable characters */
    final String f۱۵۹۳۵f;

    /* renamed from: g  reason: contains not printable characters */
    int f۱۵۹۳۶g;

    /* renamed from: h  reason: contains not printable characters */
    int f۱۵۹۳۷h;

    /* renamed from: i  reason: contains not printable characters */
    boolean f۱۵۹۳۸i;

    /* renamed from: j  reason: contains not printable characters */
    private final ScheduledExecutorService f۱۵۹۳۹j;

    /* renamed from: k  reason: contains not printable characters */
    private final ExecutorService f۱۵۹۴۰k;

    /* renamed from: l  reason: contains not printable characters */
    final AbstractCl f۱۵۹۴۱l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۵۹۴۲m;

    /* renamed from: n  reason: contains not printable characters */
    long f۱۵۹۴۳n = 0;

    /* renamed from: o  reason: contains not printable characters */
    long f۱۵۹۴۴o;

    /* renamed from: p  reason: contains not printable characters */
    Cm f۱۵۹۴۵p = new Cm();

    /* renamed from: q  reason: contains not printable characters */
    final Cm f۱۵۹۴۶q = new Cm();

    /* renamed from: r  reason: contains not printable characters */
    boolean f۱۵۹۴۷r = false;

    /* renamed from: s  reason: contains not printable characters */
    final Socket f۱۵۹۴۸s;

    /* renamed from: t  reason: contains not printable characters */
    final Cj f۱۵۹۴۹t;

    /* renamed from: u  reason: contains not printable characters */
    final Cj f۱۵۹۵۰u;

    /* renamed from: v  reason: contains not printable characters */
    final Set<Integer> f۱۵۹۵۱v = new LinkedHashSet();

    Cg(Cg builder) {
        this.f۱۵۹۴۱l = builder.f۱۵۹۷۸f;
        boolean z = builder.f۱۵۹۷۹g;
        this.f۱۵۹۳۲c = z;
        this.f۱۵۹۳۳d = builder.f۱۵۹۷۷e;
        this.f۱۵۹۳۷h = z ? 1 : 2;
        if (builder.f۱۵۹۷۹g) {
            this.f۱۵۹۳۷h += 2;
        }
        if (builder.f۱۵۹۷۹g) {
            this.f۱۵۹۴۵p.m۱۹۰۲۱a(7, 16777216);
        }
        this.f۱۵۹۳۵f = builder.f۱۵۹۷۴b;
        this.f۱۵۹۳۹j = new ScheduledThreadPoolExecutor(1, p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۹a(p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۴a("OkHttp %s Writer", this.f۱۵۹۳۵f), false));
        if (builder.f۱۵۹۸۰h != 0) {
            ScheduledExecutorService scheduledExecutorService = this.f۱۵۹۳۹j;
            Ci iVar = new Ci(false, 0, 0);
            int i = builder.f۱۵۹۸۰h;
            scheduledExecutorService.scheduleAtFixedRate(iVar, (long) i, (long) i, TimeUnit.MILLISECONDS);
        }
        this.f۱۵۹۴۰k = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۹a(p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۱۴a("OkHttp %s Push Observer", this.f۱۵۹۳۵f), true));
        this.f۱۵۹۴۶q.m۱۹۰۲۱a(7, 65535);
        this.f۱۵۹۴۶q.m۱۹۰۲۱a(5, 16384);
        this.f۱۵۹۴۴o = (long) this.f۱۵۹۴۶q.m۱۹۰۲۶c();
        this.f۱۵۹۴۸s = builder.f۱۵۹۷۳a;
        this.f۱۵۹۴۹t = new Cj(builder.f۱۵۹۷۶d, this.f۱۵۹۳۲c);
        this.f۱۵۹۵۰u = new Cj(new Ch(builder.f۱۵۹۷۵c, this.f۱۵۹۳۲c));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public synchronized Ci m۱۸۸۸۳a(int id) {
        return this.f۱۵۹۳۴e.get(Integer.valueOf(id));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public synchronized Ci m۱۸۸۹۷c(int streamId) {
        Ci stream;
        stream = this.f۱۵۹۳۴e.remove(Integer.valueOf(streamId));
        notifyAll();
        return stream;
    }

    /* renamed from: m  reason: contains not printable characters */
    public synchronized int m۱۸۹۰۱m() {
        return this.f۱۵۹۴۶q.m۱۹۰۲۵b(Integer.MAX_VALUE);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Ci m۱۸۸۸۴a(List<Cc> list, boolean out) {
        return m۱۸۸۷۹b(0, list, out);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* renamed from: b  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ci m۱۸۸۷۹b(int r12, java.util.List<p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cc> r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cg.m۱۸۸۷۹b(int, java.util.List, boolean):e.f0.i.i");
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۹۰a(int streamId, boolean outFinished, p۱۴۹f.Cc buffer, long byteCount) {
        int toWrite;
        if (byteCount == 0) {
            this.f۱۵۹۴۹t.m۱۹۰۰۱a(outFinished, streamId, buffer, 0);
            return;
        }
        while (byteCount > 0) {
            synchronized (this) {
                while (this.f۱۵۹۴۴o <= 0) {
                    try {
                        if (this.f۱۵۹۳۴e.containsKey(Integer.valueOf(streamId))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException e) {
                        throw new InterruptedIOException();
                    }
                }
                toWrite = Math.min((int) Math.min(byteCount, this.f۱۵۹۴۴o), this.f۱۵۹۴۹t.m۱۹۰۰۵m());
                this.f۱۵۹۴۴o -= (long) toWrite;
            }
            byteCount -= (long) toWrite;
            this.f۱۵۹۴۹t.m۱۹۰۰۱a(outFinished && byteCount == 0, streamId, buffer, toWrite);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public void m۱۸۸۹۹g(long delta) {
        this.f۱۵۹۴۴o += delta;
        if (delta > 0) {
            notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.g$a  reason: invalid class name */
    public class Ca extends AbstractRunnableCb {

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۵۲d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ EnumCb f۱۵۹۵۳e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Ca(String format, Object[] args, int i, EnumCb bVar) {
            super(format, args);
            this.f۱۵۹۵۲d = i;
            this.f۱۵۹۵۳e = bVar;
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۹۰۳b() {
            try {
                Cg.this.m۱۸۸۹۵b(this.f۱۵۹۵۲d, this.f۱۵۹۵۳e);
            } catch (IOException e) {
                Cg.this.m۱۸۸۸۲p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۸۸۹۸c(int streamId, EnumCb errorCode) {
        try {
            this.f۱۵۹۳۹j.execute(new Ca("OkHttp %s stream %d", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, errorCode));
        } catch (RejectedExecutionException e) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۸۹۵b(int streamId, EnumCb statusCode) {
        this.f۱۵۹۴۹t.m۱۸۹۹۶a(streamId, statusCode);
    }

    /* renamed from: e.f0.i.g$b  reason: invalid class name */
    class Cb extends AbstractRunnableCb {

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۵۵d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ long f۱۵۹۵۶e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Cb(String format, Object[] args, int i, long j) {
            super(format, args);
            this.f۱۵۹۵۵d = i;
            this.f۱۵۹۵۶e = j;
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۹۰۴b() {
            try {
                Cg.this.f۱۵۹۴۹t.m۱۸۹۹۵a(this.f۱۵۹۵۵d, this.f۱۵۹۵۶e);
            } catch (IOException e) {
                Cg.this.m۱۸۸۸۲p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۸۵a(int streamId, long unacknowledgedBytesRead) {
        try {
            this.f۱۵۹۳۹j.execute(new Cb("OkHttp Window Update %s stream %d", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, unacknowledgedBytesRead));
        } catch (RejectedExecutionException e) {
        }
    }

    /* renamed from: e.f0.i.g$i  reason: invalid class name */
    final class Ci extends AbstractRunnableCb {

        /* renamed from: d  reason: contains not printable characters */
        final boolean f۱۵۹۸۲d;

        /* renamed from: e  reason: contains not printable characters */
        final int f۱۵۹۸۳e;

        /* renamed from: f  reason: contains not printable characters */
        final int f۱۵۹۸۴f;

        Ci(boolean reply, int payload1, int payload2) {
            super("OkHttp %s ping %08x%08x", Cg.this.f۱۵۹۳۵f, Integer.valueOf(payload1), Integer.valueOf(payload2));
            this.f۱۵۹۸۲d = reply;
            this.f۱۵۹۸۳e = payload1;
            this.f۱۵۹۸۴f = payload2;
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۹۱۶b() {
            Cg.this.m۱۸۸۹۴a(this.f۱۵۹۸۲d, this.f۱۵۹۸۳e, this.f۱۵۹۸۴f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۹۴a(boolean reply, int payload1, int payload2) {
        boolean failedDueToMissingPong;
        if (!reply) {
            synchronized (this) {
                failedDueToMissingPong = this.f۱۵۹۴۲m;
                this.f۱۵۹۴۲m = true;
            }
            if (failedDueToMissingPong) {
                m۱۸۸۸۲p();
                return;
            }
        }
        try {
            this.f۱۵۹۴۹t.m۱۸۹۹۹a(reply, payload1, payload2);
        } catch (IOException e) {
            m۱۸۸۸۲p();
        }
    }

    public void flush() {
        this.f۱۵۹۴۹t.flush();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۹۱a(EnumCb statusCode) {
        synchronized (this.f۱۵۹۴۹t) {
            synchronized (this) {
                if (!this.f۱۵۹۳۸i) {
                    this.f۱۵۹۳۸i = true;
                    this.f۱۵۹۴۹t.m۱۸۹۹۷a(this.f۱۵۹۳۶g, statusCode, p۱۳۹e.p۱۴۰f0.Cc.f۱۵۷۰۳a);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m۱۸۸۹۲a(EnumCb.NO_ERROR, EnumCb.CANCEL);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۹۲a(EnumCb connectionCode, EnumCb streamCode) {
        IOException thrown = null;
        try {
            m۱۸۸۹۱a(connectionCode);
        } catch (IOException e) {
            thrown = e;
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
                    stream.m۱۸۹۶۳a(streamCode);
                } catch (IOException e2) {
                    if (thrown != null) {
                        thrown = e2;
                    }
                }
            }
        }
        try {
            this.f۱۵۹۴۹t.close();
        } catch (IOException e3) {
            if (thrown == null) {
                thrown = e3;
            }
        }
        try {
            this.f۱۵۹۴۸s.close();
        } catch (IOException e4) {
            thrown = e4;
        }
        this.f۱۵۹۳۹j.shutdown();
        this.f۱۵۹۴۰k.shutdown();
        if (thrown != null) {
            throw thrown;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: p  reason: contains not printable characters */
    private void m۱۸۸۸۲p() {
        try {
            m۱۸۸۹۲a(EnumCb.PROTOCOL_ERROR, EnumCb.PROTOCOL_ERROR);
        } catch (IOException e) {
        }
    }

    /* renamed from: n  reason: contains not printable characters */
    public void m۱۸۹۰۲n() {
        m۱۸۸۹۳a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۹۳a(boolean sendConnectionPreface) {
        if (sendConnectionPreface) {
            this.f۱۵۹۴۹t.m۱۹۰۰۴l();
            this.f۱۵۹۴۹t.m۱۹۰۰۳b(this.f۱۵۹۴۵p);
            int windowSize = this.f۱۵۹۴۵p.m۱۹۰۲۶c();
            if (windowSize != 65535) {
                this.f۱۵۹۴۹t.m۱۸۹۹۵a(0, (long) (windowSize - 65535));
            }
        }
        new Thread(this.f۱۵۹۵۰u).start();
    }

    /* renamed from: l  reason: contains not printable characters */
    public synchronized boolean m۱۸۹۰۰l() {
        return this.f۱۵۹۳۸i;
    }

    /* renamed from: e.f0.i.g$g  reason: invalid class name */
    public static class Cg {

        /* renamed from: a  reason: contains not printable characters */
        Socket f۱۵۹۷۳a;

        /* renamed from: b  reason: contains not printable characters */
        String f۱۵۹۷۴b;

        /* renamed from: c  reason: contains not printable characters */
        AbstractCe f۱۵۹۷۵c;

        /* renamed from: d  reason: contains not printable characters */
        AbstractCd f۱۵۹۷۶d;

        /* renamed from: e  reason: contains not printable characters */
        AbstractCh f۱۵۹۷۷e = AbstractCh.f۱۵۹۸۱a;

        /* renamed from: f  reason: contains not printable characters */
        AbstractCl f۱۵۹۷۸f = AbstractCl.f۱۶۰۴۰a;

        /* renamed from: g  reason: contains not printable characters */
        boolean f۱۵۹۷۹g;

        /* renamed from: h  reason: contains not printable characters */
        int f۱۵۹۸۰h;

        public Cg(boolean client) {
            this.f۱۵۹۷۹g = client;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۸۹۱۱a(Socket socket, String hostname, AbstractCe source, AbstractCd sink) {
            this.f۱۵۹۷۳a = socket;
            this.f۱۵۹۷۴b = hostname;
            this.f۱۵۹۷۵c = source;
            this.f۱۵۹۷۶d = sink;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۸۹۱۰a(AbstractCh listener) {
            this.f۱۵۹۷۷e = listener;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۸۹۰۹a(int pingIntervalMillis) {
            this.f۱۵۹۸۰h = pingIntervalMillis;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cg m۱۸۹۱۲a() {
            return new Cg(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.g$j  reason: invalid class name */
    public class Cj extends AbstractRunnableCb implements Ch.AbstractCb {

        /* renamed from: d  reason: contains not printable characters */
        final Ch f۱۵۹۸۶d;

        Cj(Ch reader) {
            super("OkHttp %s", Cg.this.f۱۵۹۳۵f);
            this.f۱۵۹۸۶d = reader;
        }

        /* access modifiers changed from: protected */
        @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۹۲۸b() {
            EnumCb connectionErrorCode = EnumCb.INTERNAL_ERROR;
            EnumCb streamErrorCode = EnumCb.INTERNAL_ERROR;
            try {
                this.f۱۵۹۸۶d.m۱۸۹۴۵a(this);
                while (this.f۱۵۹۸۶d.m۱۸۹۴۶a(false, (Ch.AbstractCb) this)) {
                }
                try {
                    Cg.this.m۱۸۸۹۲a(EnumCb.NO_ERROR, EnumCb.CANCEL);
                } catch (IOException e) {
                }
            } catch (IOException e2) {
                connectionErrorCode = EnumCb.PROTOCOL_ERROR;
                try {
                    Cg.this.m۱۸۸۹۲a(connectionErrorCode, EnumCb.PROTOCOL_ERROR);
                } catch (IOException e3) {
                }
            } catch (Throwable th) {
                try {
                    Cg.this.m۱۸۸۹۲a(connectionErrorCode, streamErrorCode);
                } catch (IOException e4) {
                }
                p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(this.f۱۵۹۸۶d);
                throw th;
            }
            p۱۳۹e.p۱۴۰f0.Cc.m۱۸۶۲۱a(this.f۱۵۹۸۶d);
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۲۶a(boolean inFinished, int streamId, AbstractCe source, int length) {
            if (Cg.this.m۱۸۸۹۶b(streamId)) {
                Cg.this.m۱۸۸۸۷a(streamId, source, length, inFinished);
                return;
            }
            Ci dataStream = Cg.this.m۱۸۸۸۳a(streamId);
            if (dataStream == null) {
                Cg.this.m۱۸۸۹۸c(streamId, EnumCb.PROTOCOL_ERROR);
                source.skip((long) length);
                return;
            }
            dataStream.m۱۸۹۶۴a(source, length);
            if (inFinished) {
                dataStream.m۱۸۹۷۵i();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
            r1.m۱۸۹۶۵a(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
            if (r12 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
            r1.m۱۸۹۷۵i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m۱۸۹۲۵a(boolean r12, int r13, int r14, java.util.List<p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cc> r15) {
            /*
            // Method dump skipped, instructions count: 125
            */
            throw new UnsupportedOperationException("Method not decompiled: p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cg.Cj.m۱۸۹۲۵a(boolean, int, int, java.util.List):void");
        }

        /* renamed from: e.f0.i.g$j$a  reason: invalid class name */
        class Ca extends AbstractRunnableCb {

            /* renamed from: d  reason: contains not printable characters */
            final /* synthetic */ Ci f۱۵۹۸۸d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Ca(String format, Object[] args, Ci iVar) {
                super(format, args);
                this.f۱۵۹۸۸d = iVar;
            }

            @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
            /* renamed from: b  reason: contains not printable characters */
            public void m۱۸۹۲۹b() {
                try {
                    Cg.this.f۱۵۹۳۳d.m۱۸۹۱۴a(this.f۱۵۹۸۸d);
                } catch (IOException e) {
                    p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf d = p۱۳۹e.p۱۴۰f0.p۱۴۷k.Cf.m۱۹۰۸۶d();
                    d.m۱۹۰۹۱a(4, "Http2Connection.Listener failure for " + Cg.this.f۱۵۹۳۵f, e);
                    try {
                        this.f۱۵۹۸۸d.m۱۸۹۶۳a(EnumCb.PROTOCOL_ERROR);
                    } catch (IOException e2) {
                    }
                }
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۲۲a(int streamId, EnumCb errorCode) {
            if (Cg.this.m۱۸۸۹۶b(streamId)) {
                Cg.this.m۱۸۸۸۶a(streamId, errorCode);
                return;
            }
            Ci rstStream = Cg.this.m۱۸۸۹۷c(streamId);
            if (rstStream != null) {
                rstStream.m۱۸۹۶۹c(errorCode);
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۲۷a(boolean clearPrevious, Cm newSettings) {
            int i;
            long delta = 0;
            Ci[] streamsToNotify = null;
            synchronized (Cg.this) {
                int priorWriteWindowSize = Cg.this.f۱۵۹۴۶q.m۱۹۰۲۶c();
                if (clearPrevious) {
                    Cg.this.f۱۵۹۴۶q.m۱۹۰۲۲a();
                }
                Cg.this.f۱۵۹۴۶q.m۱۹۰۲۳a(newSettings);
                m۱۸۹۱۷a(newSettings);
                int peerInitialWindowSize = Cg.this.f۱۵۹۴۶q.m۱۹۰۲۶c();
                if (!(peerInitialWindowSize == -1 || peerInitialWindowSize == priorWriteWindowSize)) {
                    delta = (long) (peerInitialWindowSize - priorWriteWindowSize);
                    if (!Cg.this.f۱۵۹۴۷r) {
                        Cg.this.m۱۸۸۹۹g(delta);
                        Cg.this.f۱۵۹۴۷r = true;
                    }
                    if (!Cg.this.f۱۵۹۳۴e.isEmpty()) {
                        streamsToNotify = (Ci[]) Cg.this.f۱۵۹۳۴e.values().toArray(new Ci[Cg.this.f۱۵۹۳۴e.size()]);
                    }
                }
                Cg.f۱۵۹۳۱w.execute(new Cb("OkHttp %s settings", Cg.this.f۱۵۹۳۵f));
            }
            if (!(streamsToNotify == null || delta == 0)) {
                for (Ci stream : streamsToNotify) {
                    synchronized (stream) {
                        stream.m۱۸۹۶۲a(delta);
                    }
                }
            }
        }

        /* renamed from: e.f0.i.g$j$b  reason: invalid class name */
        class Cb extends AbstractRunnableCb {
            Cb(String format, Object... args) {
                super(format, args);
            }

            @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
            /* renamed from: b  reason: contains not printable characters */
            public void m۱۸۹۳۰b() {
                Cg gVar = Cg.this;
                gVar.f۱۵۹۳۳d.m۱۸۹۱۳a(gVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e.f0.i.g$j$c  reason: invalid class name */
        public class Cc extends AbstractRunnableCb {

            /* renamed from: d  reason: contains not printable characters */
            final /* synthetic */ Cm f۱۵۹۹۱d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            Cc(String format, Object[] args, Cm mVar) {
                super(format, args);
                this.f۱۵۹۹۱d = mVar;
            }

            @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
            /* renamed from: b  reason: contains not printable characters */
            public void m۱۸۹۳۱b() {
                try {
                    Cg.this.f۱۵۹۴۹t.m۱۸۹۹۸a(this.f۱۵۹۹۱d);
                } catch (IOException e) {
                    Cg.this.m۱۸۸۸۲p();
                }
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        private void m۱۸۹۱۷a(Cm peerSettings) {
            try {
                Cg.this.f۱۵۹۳۹j.execute(new Cc("OkHttp %s ACK Settings", new Object[]{Cg.this.f۱۵۹۳۵f}, peerSettings));
            } catch (RejectedExecutionException e) {
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۱۸a() {
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۲۴a(boolean reply, int payload1, int payload2) {
            if (reply) {
                synchronized (Cg.this) {
                    Cg.this.f۱۵۹۴۲m = false;
                    Cg.this.notifyAll();
                }
                return;
            }
            try {
                Cg.this.f۱۵۹۳۹j.execute(new Ci(true, payload1, payload2));
            } catch (RejectedExecutionException e) {
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۲۳a(int lastGoodStreamId, EnumCb errorCode, p۱۴۹f.Cf debugData) {
            Ci[] streamsCopy;
            debugData.m۱۹۴۵۱f();
            synchronized (Cg.this) {
                streamsCopy = (Ci[]) Cg.this.f۱۵۹۳۴e.values().toArray(new Ci[Cg.this.f۱۵۹۳۴e.size()]);
                Cg.this.f۱۵۹۳۸i = true;
            }
            for (Ci http2Stream : streamsCopy) {
                if (http2Stream.m۱۸۹۶۸c() > lastGoodStreamId && http2Stream.m۱۸۹۷۲f()) {
                    http2Stream.m۱۸۹۶۹c(EnumCb.REFUSED_STREAM);
                    Cg.this.m۱۸۸۹۷c(http2Stream.m۱۸۹۶۸c());
                }
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۲۱a(int streamId, long windowSizeIncrement) {
            if (streamId == 0) {
                synchronized (Cg.this) {
                    Cg.this.f۱۵۹۴۴o += windowSizeIncrement;
                    Cg.this.notifyAll();
                }
                return;
            }
            Ci stream = Cg.this.m۱۸۸۸۳a(streamId);
            if (stream != null) {
                synchronized (stream) {
                    stream.m۱۸۹۶۲a(windowSizeIncrement);
                }
            }
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۱۹a(int streamId, int streamDependency, int weight, boolean exclusive) {
        }

        @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Ch.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۲۰a(int streamId, int promisedStreamId, List<Cc> list) {
            Cg.this.m۱۸۸۸۸a(promisedStreamId, list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۸۸۹۶b(int streamId) {
        return streamId != 0 && (streamId & 1) == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۸۸a(int streamId, List<Cc> list) {
        synchronized (this) {
            if (this.f۱۵۹۵۱v.contains(Integer.valueOf(streamId))) {
                m۱۸۸۹۸c(streamId, EnumCb.PROTOCOL_ERROR);
                return;
            }
            this.f۱۵۹۵۱v.add(Integer.valueOf(streamId));
            try {
                this.f۱۵۹۴۰k.execute(new Cc("OkHttp %s Push Request[%s]", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, list));
            } catch (RejectedExecutionException e) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.g$c  reason: invalid class name */
    public class Cc extends AbstractRunnableCb {

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۵۸d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ List f۱۵۹۵۹e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Cc(String format, Object[] args, int i, List list) {
            super(format, args);
            this.f۱۵۹۵۸d = i;
            this.f۱۵۹۵۹e = list;
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۹۰۵b() {
            if (Cg.this.f۱۵۹۴۱l.m۱۹۰۱۴a(this.f۱۵۹۵۸d, this.f۱۵۹۵۹e)) {
                try {
                    Cg.this.f۱۵۹۴۹t.m۱۸۹۹۶a(this.f۱۵۹۵۸d, EnumCb.CANCEL);
                    synchronized (Cg.this) {
                        Cg.this.f۱۵۹۵۱v.remove(Integer.valueOf(this.f۱۵۹۵۸d));
                    }
                } catch (IOException e) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.g$d  reason: invalid class name */
    public class Cd extends AbstractRunnableCb {

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۶۱d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ List f۱۵۹۶۲e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۵۹۶۳f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Cd(String format, Object[] args, int i, List list, boolean z) {
            super(format, args);
            this.f۱۵۹۶۱d = i;
            this.f۱۵۹۶۲e = list;
            this.f۱۵۹۶۳f = z;
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۹۰۶b() {
            boolean cancel = Cg.this.f۱۵۹۴۱l.m۱۹۰۱۵a(this.f۱۵۹۶۱d, this.f۱۵۹۶۲e, this.f۱۵۹۶۳f);
            if (cancel) {
                try {
                    Cg.this.f۱۵۹۴۹t.m۱۸۹۹۶a(this.f۱۵۹۶۱d, EnumCb.CANCEL);
                } catch (IOException e) {
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

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۸۹a(int streamId, List<Cc> list, boolean inFinished) {
        try {
            this.f۱۵۹۴۰k.execute(new Cd("OkHttp %s Push Headers[%s]", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, list, inFinished));
        } catch (RejectedExecutionException e) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۸۷a(int streamId, AbstractCe source, int byteCount, boolean inFinished) {
        p۱۴۹f.Cc buffer = new p۱۴۹f.Cc();
        source.m۱۹۴۲۳d((long) byteCount);
        source.m۱۹۵۵۴b(buffer, (long) byteCount);
        if (buffer.m۱۹۴۱۰q() == ((long) byteCount)) {
            this.f۱۵۹۴۰k.execute(new Ce("OkHttp %s Push Data[%s]", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, buffer, byteCount, inFinished));
            return;
        }
        throw new IOException(buffer.m۱۹۴۱۰q() + " != " + byteCount);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.g$e  reason: invalid class name */
    public class Ce extends AbstractRunnableCb {

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۶۵d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ p۱۴۹f.Cc f۱۵۹۶۶e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۶۷f;

        /* renamed from: g  reason: contains not printable characters */
        final /* synthetic */ boolean f۱۵۹۶۸g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Ce(String format, Object[] args, int i, p۱۴۹f.Cc cVar, int i2, boolean z) {
            super(format, args);
            this.f۱۵۹۶۵d = i;
            this.f۱۵۹۶۶e = cVar;
            this.f۱۵۹۶۷f = i2;
            this.f۱۵۹۶۸g = z;
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۹۰۷b() {
            try {
                boolean cancel = Cg.this.f۱۵۹۴۱l.m۱۹۰۱۳a(this.f۱۵۹۶۵d, this.f۱۵۹۶۶e, this.f۱۵۹۶۷f, this.f۱۵۹۶۸g);
                if (cancel) {
                    Cg.this.f۱۵۹۴۹t.m۱۸۹۹۶a(this.f۱۵۹۶۵d, EnumCb.CANCEL);
                }
                if (cancel || this.f۱۵۹۶۸g) {
                    synchronized (Cg.this) {
                        Cg.this.f۱۵۹۵۱v.remove(Integer.valueOf(this.f۱۵۹۶۵d));
                    }
                }
            } catch (IOException e) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.f0.i.g$f  reason: invalid class name */
    public class Cf extends AbstractRunnableCb {

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ int f۱۵۹۷۰d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ EnumCb f۱۵۹۷۱e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        Cf(String format, Object[] args, int i, EnumCb bVar) {
            super(format, args);
            this.f۱۵۹۷۰d = i;
            this.f۱۵۹۷۱e = bVar;
        }

        @Override // p۱۳۹e.p۱۴۰f0.AbstractRunnableCb
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۸۹۰۸b() {
            Cg.this.f۱۵۹۴۱l.m۱۹۰۱۲a(this.f۱۵۹۷۰d, this.f۱۵۹۷۱e);
            synchronized (Cg.this) {
                Cg.this.f۱۵۹۵۱v.remove(Integer.valueOf(this.f۱۵۹۷۰d));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۸۸۶a(int streamId, EnumCb errorCode) {
        this.f۱۵۹۴۰k.execute(new Cf("OkHttp %s Push Reset[%s]", new Object[]{this.f۱۵۹۳۵f, Integer.valueOf(streamId)}, streamId, errorCode));
    }

    /* renamed from: e.f0.i.g$h  reason: invalid class name */
    public static abstract class AbstractCh {

        /* renamed from: a  reason: contains not printable characters */
        public static final AbstractCh f۱۵۹۸۱a = new Ca();

        /* renamed from: a  reason: contains not printable characters */
        public abstract void m۱۸۹۱۴a(Ci iVar);

        /* renamed from: e.f0.i.g$h$a  reason: invalid class name */
        class Ca extends AbstractCh {
            Ca() {
            }

            @Override // p۱۳۹e.p۱۴۰f0.p۱۴۵i.Cg.AbstractCh
            /* renamed from: a  reason: contains not printable characters */
            public void m۱۸۹۱۵a(Ci stream) {
                stream.m۱۸۹۶۳a(EnumCb.REFUSED_STREAM);
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۸۹۱۳a(Cg connection) {
        }
    }
}
