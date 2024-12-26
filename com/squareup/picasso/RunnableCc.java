package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.NetworkInfo;
import android.os.Build;
import com.squareup.picasso.AbstractCy;
import com.squareup.picasso.Cr;
import com.squareup.picasso.Ct;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import p۱۴۹f.AbstractCe;
import p۱۴۹f.AbstractCs;
import p۱۴۹f.Cl;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.c  reason: invalid class name */
public class RunnableCc implements Runnable {

    /* renamed from: v  reason: contains not printable characters */
    private static final Object f۱۵۳۹۳v = new Object();

    /* renamed from: w  reason: contains not printable characters */
    private static final ThreadLocal<StringBuilder> f۱۵۳۹۴w = new Ca();

    /* renamed from: x  reason: contains not printable characters */
    private static final AtomicInteger f۱۵۳۹۵x = new AtomicInteger();

    /* renamed from: y  reason: contains not printable characters */
    private static final AbstractCy f۱۵۳۹۶y = new Cb();

    /* renamed from: c  reason: contains not printable characters */
    final int f۱۵۳۹۷c = f۱۵۳۹۵x.incrementAndGet();

    /* renamed from: d  reason: contains not printable characters */
    final Ct f۱۵۳۹۸d;

    /* renamed from: e  reason: contains not printable characters */
    final Ci f۱۵۳۹۹e;

    /* renamed from: f  reason: contains not printable characters */
    final AbstractCd f۱۵۴۰۰f;

    /* renamed from: g  reason: contains not printable characters */
    final Ca0 f۱۵۴۰۱g;

    /* renamed from: h  reason: contains not printable characters */
    final String f۱۵۴۰۲h;

    /* renamed from: i  reason: contains not printable characters */
    final Cw f۱۵۴۰۳i;

    /* renamed from: j  reason: contains not printable characters */
    final int f۱۵۴۰۴j;

    /* renamed from: k  reason: contains not printable characters */
    int f۱۵۴۰۵k;

    /* renamed from: l  reason: contains not printable characters */
    final AbstractCy f۱۵۴۰۶l;

    /* renamed from: m  reason: contains not printable characters */
    AbstractCa f۱۵۴۰۷m;

    /* renamed from: n  reason: contains not printable characters */
    List<AbstractCa> f۱۵۴۰۸n;

    /* renamed from: o  reason: contains not printable characters */
    Bitmap f۱۵۴۰۹o;

    /* renamed from: p  reason: contains not printable characters */
    Future<?> f۱۵۴۱۰p;

    /* renamed from: q  reason: contains not printable characters */
    Ct.EnumCe f۱۵۴۱۱q;

    /* renamed from: r  reason: contains not printable characters */
    Exception f۱۵۴۱۲r;

    /* renamed from: s  reason: contains not printable characters */
    int f۱۵۴۱۳s;

    /* renamed from: t  reason: contains not printable characters */
    int f۱۵۴۱۴t;

    /* renamed from: u  reason: contains not printable characters */
    Ct.EnumCf f۱۵۴۱۵u;

    /* renamed from: com.squareup.picasso.c$a  reason: invalid class name */
    static class Ca extends ThreadLocal<StringBuilder> {
        Ca() {
        }

        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* renamed from: com.squareup.picasso.c$b  reason: invalid class name */
    static class Cb extends AbstractCy {
        Cb() {
        }

        @Override // com.squareup.picasso.AbstractCy
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۸۳۰۰a(Cw data) {
            return true;
        }

        @Override // com.squareup.picasso.AbstractCy
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCy.Ca m۱۸۲۹۹a(Cw request, int networkPolicy) {
            throw new IllegalStateException("Unrecognized type of request: " + request);
        }
    }

    RunnableCc(Ct picasso, Ci dispatcher, AbstractCd cache, Ca0 stats, AbstractCa action, AbstractCy requestHandler) {
        this.f۱۵۳۹۸d = picasso;
        this.f۱۵۳۹۹e = dispatcher;
        this.f۱۵۴۰۰f = cache;
        this.f۱۵۴۰۱g = stats;
        this.f۱۵۴۰۷m = action;
        this.f۱۵۴۰۲h = action.m۱۸۲۴۶b();
        this.f۱۵۴۰۳i = action.m۱۸۲۵۱g();
        this.f۱۵۴۱۵u = action.m۱۸۲۵۰f();
        this.f۱۵۴۰۴j = action.m۱۸۲۴۷c();
        this.f۱۵۴۰۵k = action.m۱۸۲۴۸d();
        this.f۱۵۴۰۶l = requestHandler;
        this.f۱۵۴۱۴t = requestHandler.m۱۸۴۴۴a();
    }

    /* renamed from: a  reason: contains not printable characters */
    static Bitmap m۱۸۲۷۵a(AbstractCs source, Cw request) {
        AbstractCe bufferedSource = Cl.m۱۹۴۸۰a(source);
        boolean isWebPFile = Cd0.m۱۸۳۲۴a(bufferedSource);
        boolean isPurgeable = request.f۱۵۵۴۹r && Build.VERSION.SDK_INT < 21;
        BitmapFactory.Options options = AbstractCy.m۱۸۴۴۳b(request);
        boolean calculateSize = AbstractCy.m۱۸۴۴۲a(options);
        if (isWebPFile || isPurgeable) {
            byte[] bytes = bufferedSource.m۱۹۴۲۷g();
            if (calculateSize) {
                BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
                AbstractCy.m۱۸۴۴۱a(request.f۱۵۵۳۹h, request.f۱۵۵۴۰i, options, request);
            }
            return BitmapFactory.decodeByteArray(bytes, 0, bytes.length, options);
        }
        InputStream stream = bufferedSource.m۱۹۴۳۱k();
        if (calculateSize) {
            Cn markStream = new Cn(stream);
            stream = markStream;
            markStream.m۱۸۳۷۶a(false);
            long mark = markStream.m۱۸۳۷۵a(1024);
            BitmapFactory.decodeStream(stream, null, options);
            AbstractCy.m۱۸۴۴۱a(request.f۱۵۵۳۹h, request.f۱۵۵۴۰i, options, request);
            markStream.m۱۸۳۷۷g(mark);
            markStream.m۱۸۳۷۶a(true);
        }
        Bitmap bitmap = BitmapFactory.decodeStream(stream, null, options);
        if (bitmap != null) {
            return bitmap;
        }
        throw new IOException("Failed to decode stream.");
    }

    public void run() {
        try {
            m۱۸۲۷۸a(this.f۱۵۴۰۳i);
            if (this.f۱۵۳۹۸d.f۱۵۴۹۷n) {
                Cd0.m۱۸۳۲۲a("Hunter", "executing", Cd0.m۱۸۳۱۶a(this));
            }
            this.f۱۵۴۰۹o = m۱۸۲۹۶l();
            if (this.f۱۵۴۰۹o == null) {
                this.f۱۵۳۹۹e.m۱۸۳۵۳b(this);
            } else {
                this.f۱۵۳۹۹e.m۱۸۳۴۷a(this);
            }
        } catch (Cr.Cb e) {
            if (!EnumCq.m۱۸۳۸۴a(e.f۱۵۴۸۰d) || e.f۱۵۴۷۹c != 504) {
                this.f۱۵۴۱۲r = e;
            }
            this.f۱۵۳۹۹e.m۱۸۳۵۳b(this);
        } catch (IOException e2) {
            this.f۱۵۴۱۲r = e2;
            this.f۱۵۳۹۹e.m۱۸۳۵۷c(this);
        } catch (OutOfMemoryError e3) {
            StringWriter writer = new StringWriter();
            this.f۱۵۴۰۱g.m۱۸۲۵۸a().m۱۸۲۷۲a(new PrintWriter(writer));
            this.f۱۵۴۱۲r = new RuntimeException(writer.toString(), e3);
            this.f۱۵۳۹۹e.m۱۸۳۵۳b(this);
        } catch (Exception e4) {
            this.f۱۵۴۱۲r = e4;
            this.f۱۵۳۹۹e.m۱۸۳۵۳b(this);
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l  reason: contains not printable characters */
    public Bitmap m۱۸۲۹۶l() {
        Bitmap bitmap = null;
        if (!EnumCp.m۱۸۳۸۲a(this.f۱۵۴۰۴j) || (bitmap = this.f۱۵۴۰۰f.m۱۸۳۰۴a(this.f۱۵۴۰۲h)) == null) {
            this.f۱۵۴۰۵k = this.f۱۵۴۱۴t == 0 ? EnumCq.OFFLINE.f۱۵۴۷۶c : this.f۱۵۴۰۵k;
            AbstractCy.Ca result = this.f۱۵۴۰۶l.m۱۸۴۴۵a(this.f۱۵۴۰۳i, this.f۱۵۴۰۵k);
            if (result != null) {
                this.f۱۵۴۱۱q = result.m۱۸۴۵۱c();
                this.f۱۵۴۱۳s = result.m۱۸۴۵۰b();
                bitmap = result.m۱۸۴۴۹a();
                if (bitmap == null) {
                    AbstractCs source = result.m۱۸۴۵۲d();
                    try {
                        bitmap = m۱۸۲۷۵a(source, this.f۱۵۴۰۳i);
                    } finally {
                        try {
                            source.close();
                        } catch (IOException e) {
                        }
                    }
                }
            }
            if (bitmap != null) {
                if (this.f۱۵۳۹۸d.f۱۵۴۹۷n) {
                    Cd0.m۱۸۳۲۲a("Hunter", "decoded", this.f۱۵۴۰۳i.m۱۸۴۲۲d());
                }
                this.f۱۵۴۰۱g.m۱۸۲۶۰a(bitmap);
                if (this.f۱۵۴۰۳i.m۱۸۴۲۴f() || this.f۱۵۴۱۳s != 0) {
                    synchronized (f۱۵۳۹۳v) {
                        if (this.f۱۵۴۰۳i.m۱۸۴۲۳e() || this.f۱۵۴۱۳s != 0) {
                            bitmap = m۱۸۲۷۴a(this.f۱۵۴۰۳i, bitmap, this.f۱۵۴۱۳s);
                            if (this.f۱۵۳۹۸d.f۱۵۴۹۷n) {
                                Cd0.m۱۸۳۲۲a("Hunter", "transformed", this.f۱۵۴۰۳i.m۱۸۴۲۲d());
                            }
                        }
                        if (this.f۱۵۴۰۳i.m۱۸۴۲۰b()) {
                            bitmap = m۱۸۲۷۶a(this.f۱۵۴۰۳i.f۱۵۵۳۸g, bitmap);
                            if (this.f۱۵۳۹۸d.f۱۵۴۹۷n) {
                                Cd0.m۱۸۳۲۳a("Hunter", "transformed", this.f۱۵۴۰۳i.m۱۸۴۲۲d(), "from custom transformations");
                            }
                        }
                    }
                    if (bitmap != null) {
                        this.f۱۵۴۰۱g.m۱۸۲۶۴b(bitmap);
                    }
                }
            }
            return bitmap;
        }
        this.f۱۵۴۰۱g.m۱۸۲۶۲b();
        this.f۱۵۴۱۱q = Ct.EnumCe.MEMORY;
        if (this.f۱۵۳۹۸d.f۱۵۴۹۷n) {
            Cd0.m۱۸۳۲۳a("Hunter", "decoded", this.f۱۵۴۰۳i.m۱۸۴۲۲d(), "from cache");
        }
        return bitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۸۲a(AbstractCa action) {
        boolean loggingEnabled = this.f۱۵۳۹۸d.f۱۵۴۹۷n;
        Cw request = action.f۱۵۳۴۷b;
        if (this.f۱۵۴۰۷m == null) {
            this.f۱۵۴۰۷m = action;
            if (loggingEnabled) {
                List<AbstractCa> list = this.f۱۵۴۰۸n;
                if (list == null || list.isEmpty()) {
                    Cd0.m۱۸۳۲۳a("Hunter", "joined", request.m۱۸۴۲۲d(), "to empty hunter");
                } else {
                    Cd0.m۱۸۳۲۳a("Hunter", "joined", request.m۱۸۴۲۲d(), Cd0.m۱۸۳۱۷a(this, "to "));
                }
            }
        } else {
            if (this.f۱۵۴۰۸n == null) {
                this.f۱۵۴۰۸n = new ArrayList(3);
            }
            this.f۱۵۴۰۸n.add(action);
            if (loggingEnabled) {
                Cd0.m۱۸۳۲۳a("Hunter", "joined", request.m۱۸۴۲۲d(), Cd0.m۱۸۳۱۷a(this, "to "));
            }
            Ct.EnumCf actionPriority = action.m۱۸۲۵۰f();
            if (actionPriority.ordinal() > this.f۱۵۴۱۵u.ordinal()) {
                this.f۱۵۴۱۵u = actionPriority;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۲۸۶b(AbstractCa action) {
        boolean detached = false;
        if (this.f۱۵۴۰۷m == action) {
            this.f۱۵۴۰۷m = null;
            detached = true;
        } else {
            List<AbstractCa> list = this.f۱۵۴۰۸n;
            if (list != null) {
                detached = list.remove(action);
            }
        }
        if (detached && action.m۱۸۲۵۰f() == this.f۱۵۴۱۵u) {
            this.f۱۵۴۱۵u = m۱۸۲۸۱o();
        }
        if (this.f۱۵۳۹۸d.f۱۵۴۹۷n) {
            Cd0.m۱۸۳۲۳a("Hunter", "removed", action.f۱۵۳۴۷b.m۱۸۴۲۲d(), Cd0.m۱۸۳۱۷a(this, "from "));
        }
    }

    /* renamed from: o  reason: contains not printable characters */
    private Ct.EnumCf m۱۸۲۸۱o() {
        Ct.EnumCf newPriority = Ct.EnumCf.LOW;
        List<AbstractCa> list = this.f۱۵۴۰۸n;
        boolean hasAny = false;
        boolean hasMultiple = list != null && !list.isEmpty();
        if (this.f۱۵۴۰۷m != null || hasMultiple) {
            hasAny = true;
        }
        if (!hasAny) {
            return newPriority;
        }
        AbstractCa aVar = this.f۱۵۴۰۷m;
        if (aVar != null) {
            newPriority = aVar.m۱۸۲۵۰f();
        }
        if (hasMultiple) {
            int n = this.f۱۵۴۰۸n.size();
            for (int i = 0; i < n; i++) {
                Ct.EnumCf actionPriority = this.f۱۵۴۰۸n.get(i).m۱۸۲۵۰f();
                if (actionPriority.ordinal() > newPriority.ordinal()) {
                    newPriority = actionPriority;
                }
            }
        }
        return newPriority;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۲۸۳a() {
        Future<?> future;
        if (this.f۱۵۴۰۷m != null) {
            return false;
        }
        List<AbstractCa> list = this.f۱۵۴۰۸n;
        if ((list == null || list.isEmpty()) && (future = this.f۱۵۴۱۰p) != null && future.cancel(false)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m  reason: contains not printable characters */
    public boolean m۱۸۲۹۷m() {
        Future<?> future = this.f۱۵۴۱۰p;
        return future != null && future.isCancelled();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۸۲۸۴a(boolean airplaneMode, NetworkInfo info2) {
        if (!(this.f۱۵۴۱۴t > 0)) {
            return false;
        }
        this.f۱۵۴۱۴t--;
        return this.f۱۵۴۰۶l.m۱۸۴۴۷a(airplaneMode, info2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n  reason: contains not printable characters */
    public boolean m۱۸۲۹۸n() {
        return this.f۱۵۴۰۶l.m۱۸۴۴۸b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k  reason: contains not printable characters */
    public Bitmap m۱۸۲۹۵k() {
        return this.f۱۵۴۰۹o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public String m۱۸۲۹۰f() {
        return this.f۱۵۴۰۲h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h  reason: contains not printable characters */
    public int m۱۸۲۹۲h() {
        return this.f۱۵۴۰۴j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public Cw m۱۸۲۸۸d() {
        return this.f۱۵۴۰۳i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public AbstractCa m۱۸۲۸۵b() {
        return this.f۱۵۴۰۷m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i  reason: contains not printable characters */
    public Ct m۱۸۲۹۳i() {
        return this.f۱۵۳۹۸d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public List<AbstractCa> m۱۸۲۸۷c() {
        return this.f۱۵۴۰۸n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public Exception m۱۸۲۸۹e() {
        return this.f۱۵۴۱۲r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public Ct.EnumCe m۱۸۲۹۱g() {
        return this.f۱۵۴۱۱q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j  reason: contains not printable characters */
    public Ct.EnumCf m۱۸۲۹۴j() {
        return this.f۱۵۴۱۵u;
    }

    /* renamed from: a  reason: contains not printable characters */
    static void m۱۸۲۷۸a(Cw data) {
        String name = data.m۱۸۴۱۹a();
        StringBuilder builder = f۱۵۳۹۴w.get();
        builder.ensureCapacity("Picasso-".length() + name.length());
        builder.replace("Picasso-".length(), builder.length(), name);
        Thread.currentThread().setName(builder.toString());
    }

    /* renamed from: a  reason: contains not printable characters */
    static RunnableCc m۱۸۲۷۷a(Ct picasso, Ci dispatcher, AbstractCd cache, Ca0 stats, AbstractCa action) {
        Cw request = action.m۱۸۲۵۱g();
        List<RequestHandler> requestHandlers = picasso.m۱۸۴۰۰a();
        int count = requestHandlers.size();
        for (int i = 0; i < count; i++) {
            AbstractCy requestHandler = (AbstractCy) requestHandlers.get(i);
            if (requestHandler.m۱۸۴۴۶a(request)) {
                return new RunnableCc(picasso, dispatcher, cache, stats, action, requestHandler);
            }
        }
        return new RunnableCc(picasso, dispatcher, cache, stats, action, f۱۵۳۹۶y);
    }

    /* renamed from: a  reason: contains not printable characters */
    static Bitmap m۱۸۲۷۶a(List<AbstractCc0> list, Bitmap result) {
        int count = list.size();
        for (int i = 0; i < count; i++) {
            AbstractCc0 transformation = list.get(i);
            try {
                Bitmap newResult = transformation.m۱۸۳۰۱a(result);
                if (newResult == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(transformation.m۱۸۳۰۲a());
                    sb.append(" returned null after ");
                    sb.append(i);
                    StringBuilder builder = sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (AbstractCc0 t : list) {
                        builder.append(t.m۱۸۳۰۲a());
                        builder.append('\n');
                    }
                    Ct.f۱۵۴۸۲p.post(new RunnableCd(builder));
                    return null;
                } else if (newResult == result && result.isRecycled()) {
                    Ct.f۱۵۴۸۲p.post(new RunnableCe(transformation));
                    return null;
                } else if (newResult == result || result.isRecycled()) {
                    result = newResult;
                } else {
                    Ct.f۱۵۴۸۲p.post(new RunnableCf(transformation));
                    return null;
                }
            } catch (RuntimeException e) {
                Ct.f۱۵۴۸۲p.post(new RunnableCc(transformation, e));
                return null;
            }
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$c  reason: invalid class name */
    public static class RunnableCc implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ AbstractCc0 f۱۵۴۱۶c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ RuntimeException f۱۵۴۱۷d;

        RunnableCc(AbstractCc0 c0Var, RuntimeException runtimeException) {
            this.f۱۵۴۱۶c = c0Var;
            this.f۱۵۴۱۷d = runtimeException;
        }

        public void run() {
            throw new RuntimeException("Transformation " + this.f۱۵۴۱۶c.m۱۸۳۰۲a() + " crashed with exception.", this.f۱۵۴۱۷d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$d  reason: invalid class name */
    public static class RunnableCd implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ StringBuilder f۱۵۴۱۸c;

        RunnableCd(StringBuilder sb) {
            this.f۱۵۴۱۸c = sb;
        }

        public void run() {
            throw new NullPointerException(this.f۱۵۴۱۸c.toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$e  reason: invalid class name */
    public static class RunnableCe implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ AbstractCc0 f۱۵۴۱۹c;

        RunnableCe(AbstractCc0 c0Var) {
            this.f۱۵۴۱۹c = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f۱۵۴۱۹c.m۱۸۳۰۲a() + " returned input Bitmap but recycled it.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.squareup.picasso.c$f  reason: invalid class name */
    public static class RunnableCf implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ AbstractCc0 f۱۵۴۲۰c;

        RunnableCf(AbstractCc0 c0Var) {
            this.f۱۵۴۲۰c = c0Var;
        }

        public void run() {
            throw new IllegalStateException("Transformation " + this.f۱۵۴۲۰c.m۱۸۳۰۲a() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static Bitmap m۱۸۲۷۴a(Cw data, Bitmap result, int exifOrientation) {
        int drawHeight;
        int drawWidth;
        int drawY;
        int drawX;
        Matrix matrix;
        int inWidth;
        boolean onlyScaleDown;
        int inHeight;
        int targetWidth;
        int targetHeight;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int inHeight2;
        int inWidth2;
        float widthRatio;
        float f9;
        float f10;
        float scaleY;
        float scaleX;
        int newSize;
        int drawX2;
        int drawY2;
        int inWidth3 = result.getWidth();
        int inHeight3 = result.getHeight();
        boolean onlyScaleDown2 = data.f۱۵۵۴۴m;
        Matrix matrix2 = new Matrix();
        if (data.m۱۸۴۲۳e() || exifOrientation != 0) {
            int targetWidth2 = data.f۱۵۵۳۹h;
            int targetHeight2 = data.f۱۵۵۴۰i;
            float targetRotation = data.f۱۵۵۴۵n;
            if (targetRotation != 0.0f) {
                double cosR = Math.cos(Math.toRadians((double) targetRotation));
                double sinR = Math.sin(Math.toRadians((double) targetRotation));
                drawX = 0;
                if (data.f۱۵۵۴۸q) {
                    drawY = 0;
                    matrix2.setRotate(targetRotation, data.f۱۵۵۴۶o, data.f۱۵۵۴۷p);
                    float f11 = data.f۱۵۵۴۶o;
                    drawWidth = inWidth3;
                    double d = (double) f11;
                    Double.isNaN(d);
                    drawHeight = inHeight3;
                    float f12 = data.f۱۵۵۴۷p;
                    double d2 = (double) f12;
                    Double.isNaN(d2);
                    double x1T = (d * (1.0d - cosR)) + (d2 * sinR);
                    double d3 = (double) f12;
                    Double.isNaN(d3);
                    double d4 = (double) f11;
                    Double.isNaN(d4);
                    double y1T = (d3 * (1.0d - cosR)) - (d4 * sinR);
                    int i = data.f۱۵۵۳۹h;
                    inHeight = inHeight3;
                    double d5 = (double) i;
                    Double.isNaN(d5);
                    double x2T = (d5 * cosR) + x1T;
                    onlyScaleDown = onlyScaleDown2;
                    double d6 = (double) i;
                    Double.isNaN(d6);
                    double y2T = (d6 * sinR) + y1T;
                    double y2T2 = (double) i;
                    Double.isNaN(y2T2);
                    inWidth = inWidth3;
                    int inWidth4 = data.f۱۵۵۴۰i;
                    double d7 = (double) inWidth4;
                    Double.isNaN(d7);
                    double x3T = ((y2T2 * cosR) + x1T) - (d7 * sinR);
                    double d8 = (double) i;
                    Double.isNaN(d8);
                    double d9 = (double) inWidth4;
                    Double.isNaN(d9);
                    double y3T = (d8 * sinR) + y1T + (d9 * cosR);
                    double d10 = (double) inWidth4;
                    Double.isNaN(d10);
                    double x4T = x1T - (d10 * sinR);
                    double sinR2 = (double) inWidth4;
                    Double.isNaN(sinR2);
                    double y4T = (sinR2 * cosR) + y1T;
                    double maxX = Math.max(x4T, Math.max(x3T, Math.max(x1T, x2T)));
                    double minX = Math.min(x4T, Math.min(x3T, Math.min(x1T, x2T)));
                    double maxY = Math.max(y4T, Math.max(y3T, Math.max(y1T, y2T)));
                    double minY = Math.min(y4T, Math.min(y3T, Math.min(y1T, y2T)));
                    targetWidth = (int) Math.floor(maxX - minX);
                    targetHeight = (int) Math.floor(maxY - minY);
                    matrix = matrix2;
                } else {
                    inWidth = inWidth3;
                    inHeight = inHeight3;
                    onlyScaleDown = onlyScaleDown2;
                    drawY = 0;
                    drawWidth = inWidth3;
                    drawHeight = inHeight3;
                    matrix = matrix2;
                    matrix.setRotate(targetRotation);
                    int i2 = data.f۱۵۵۳۹h;
                    double d11 = (double) i2;
                    Double.isNaN(d11);
                    double x2T2 = d11 * cosR;
                    double d12 = (double) i2;
                    Double.isNaN(d12);
                    double y2T3 = d12 * sinR;
                    double d13 = (double) i2;
                    Double.isNaN(d13);
                    int i3 = data.f۱۵۵۴۰i;
                    double y1T2 = (double) i3;
                    Double.isNaN(y1T2);
                    double x3T2 = (d13 * cosR) - (y1T2 * sinR);
                    double d14 = (double) i2;
                    Double.isNaN(d14);
                    double d15 = (double) i3;
                    Double.isNaN(d15);
                    double y3T2 = (d14 * sinR) + (d15 * cosR);
                    double d16 = (double) i3;
                    Double.isNaN(d16);
                    double x4T2 = -(d16 * sinR);
                    double d17 = (double) i3;
                    Double.isNaN(d17);
                    double y4T2 = d17 * cosR;
                    double maxX2 = Math.max(x4T2, Math.max(x3T2, Math.max(0.0d, x2T2)));
                    double minX2 = Math.min(x4T2, Math.min(x3T2, Math.min(0.0d, x2T2)));
                    double maxY2 = Math.max(y4T2, Math.max(y3T2, Math.max(0.0d, y2T3)));
                    double minY2 = Math.min(y4T2, Math.min(y3T2, Math.min(0.0d, y2T3)));
                    targetWidth = (int) Math.floor(maxX2 - minX2);
                    targetHeight = (int) Math.floor(maxY2 - minY2);
                }
            } else {
                inWidth = inWidth3;
                inHeight = inHeight3;
                onlyScaleDown = onlyScaleDown2;
                drawX = 0;
                drawY = 0;
                drawWidth = inWidth3;
                drawHeight = inHeight3;
                matrix = matrix2;
                targetWidth = targetWidth2;
                targetHeight = targetHeight2;
            }
            if (exifOrientation != 0) {
                int exifRotation = m۱۸۲۷۳a(exifOrientation);
                int exifTranslation = m۱۸۲۸۰b(exifOrientation);
                if (exifRotation != 0) {
                    matrix.preRotate((float) exifRotation);
                    if (exifRotation == 90 || exifRotation == 270) {
                        targetHeight = targetWidth;
                        targetWidth = targetHeight;
                    }
                }
                if (exifTranslation != 1) {
                    matrix.postScale((float) exifTranslation, 1.0f);
                }
            }
            if (data.f۱۵۵۴۱j) {
                if (targetWidth != 0) {
                    inWidth2 = inWidth;
                    widthRatio = ((float) targetWidth) / ((float) inWidth2);
                    inHeight2 = inHeight;
                } else {
                    inWidth2 = inWidth;
                    inHeight2 = inHeight;
                    widthRatio = ((float) targetHeight) / ((float) inHeight2);
                }
                if (targetHeight != 0) {
                    f10 = (float) targetHeight;
                    f9 = (float) inHeight2;
                } else {
                    f10 = (float) targetWidth;
                    f9 = (float) inWidth2;
                }
                float heightRatio = f10 / f9;
                if (widthRatio > heightRatio) {
                    newSize = (int) Math.ceil((double) (((float) inHeight2) * (heightRatio / widthRatio)));
                    int i4 = data.f۱۵۵۴۲k;
                    if ((i4 & 48) == 48) {
                        drawY2 = 0;
                    } else if ((i4 & 80) == 80) {
                        drawY2 = inHeight2 - newSize;
                    } else {
                        drawY2 = (inHeight2 - newSize) / 2;
                    }
                    scaleX = widthRatio;
                    scaleY = ((float) targetHeight) / ((float) newSize);
                    drawY = drawY2;
                } else if (widthRatio < heightRatio) {
                    int newSize2 = (int) Math.ceil((double) (((float) inWidth2) * (widthRatio / heightRatio)));
                    int i5 = data.f۱۵۵۴۲k;
                    if ((i5 & 3) == 3) {
                        drawX2 = 0;
                    } else if ((i5 & 5) == 5) {
                        drawX2 = inWidth2 - newSize2;
                    } else {
                        drawX2 = (inWidth2 - newSize2) / 2;
                    }
                    scaleX = ((float) targetWidth) / ((float) newSize2);
                    scaleY = heightRatio;
                    drawX = drawX2;
                    drawWidth = newSize2;
                    newSize = drawHeight;
                } else {
                    scaleY = heightRatio;
                    scaleX = heightRatio;
                    drawX = 0;
                    drawWidth = inWidth2;
                    newSize = drawHeight;
                }
                if (m۱۸۲۷۹a(onlyScaleDown, inWidth2, inHeight2, targetWidth, targetHeight)) {
                    matrix.preScale(scaleX, scaleY);
                }
                drawHeight = newSize;
            } else if (data.f۱۵۵۴۳l) {
                if (targetWidth != 0) {
                    f6 = (float) targetWidth;
                    f5 = (float) inWidth;
                } else {
                    f6 = (float) targetHeight;
                    f5 = (float) inHeight;
                }
                float widthRatio2 = f6 / f5;
                if (targetHeight != 0) {
                    f8 = (float) targetHeight;
                    f7 = (float) inHeight;
                } else {
                    f8 = (float) targetWidth;
                    f7 = (float) inWidth;
                }
                float heightRatio2 = f8 / f7;
                float scale = widthRatio2 < heightRatio2 ? widthRatio2 : heightRatio2;
                if (m۱۸۲۷۹a(onlyScaleDown, inWidth, inHeight, targetWidth, targetHeight)) {
                    matrix.preScale(scale, scale);
                }
            } else if (!((targetWidth == 0 && targetHeight == 0) || (targetWidth == inWidth && targetHeight == inHeight))) {
                if (targetWidth != 0) {
                    f2 = (float) targetWidth;
                    f = (float) inWidth;
                } else {
                    f2 = (float) targetHeight;
                    f = (float) inHeight;
                }
                float sx = f2 / f;
                if (targetHeight != 0) {
                    f4 = (float) targetHeight;
                    f3 = (float) inHeight;
                } else {
                    f4 = (float) targetWidth;
                    f3 = (float) inWidth;
                }
                float sy = f4 / f3;
                if (m۱۸۲۷۹a(onlyScaleDown, inWidth, inHeight, targetWidth, targetHeight)) {
                    matrix.preScale(sx, sy);
                }
            }
        } else {
            drawX = 0;
            drawY = 0;
            drawWidth = inWidth3;
            drawHeight = inHeight3;
            matrix = matrix2;
        }
        Bitmap newResult = Bitmap.createBitmap(result, drawX, drawY, drawWidth, drawHeight, matrix, true);
        if (newResult == result) {
            return result;
        }
        result.recycle();
        return newResult;
    }

    /* renamed from: a  reason: contains not printable characters */
    private static boolean m۱۸۲۷۹a(boolean onlyScaleDown, int inWidth, int inHeight, int targetWidth, int targetHeight) {
        return !onlyScaleDown || (targetWidth != 0 && inWidth > targetWidth) || (targetHeight != 0 && inHeight > targetHeight);
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۸۲۷۳a(int orientation) {
        switch (orientation) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    static int m۱۸۲۸۰b(int orientation) {
        if (orientation == 2 || orientation == 7 || orientation == 4 || orientation == 5) {
            return -1;
        }
        return 1;
    }
}
