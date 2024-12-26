package p۲۹۵e;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p۲۹۵e.Cx;
import p۲۹۵e.p۲۹۶f0.Cc;

/* renamed from: e.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cn {

    /* renamed from: c, reason: contains not printable characters */
    private Runnable f۱۶۱۳۴c;

    /* renamed from: d, reason: contains not printable characters */
    private ExecutorService f۱۶۱۳۵d;

    /* renamed from: a, reason: contains not printable characters */
    private int f۱۶۱۳۲a = 64;

    /* renamed from: b, reason: contains not printable characters */
    private int f۱۶۱۳۳b = 5;

    /* renamed from: e, reason: contains not printable characters */
    private final Deque<Cx.a> f۱۶۱۳۶e = new ArrayDeque();

    /* renamed from: f, reason: contains not printable characters */
    private final Deque<Cx.a> f۱۶۱۳۷f = new ArrayDeque();

    /* renamed from: g, reason: contains not printable characters */
    private final Deque<Cx> f۱۶۱۳۸g = new ArrayDeque();

    /* renamed from: a, reason: contains not printable characters */
    public synchronized ExecutorService m۱۷۰۸۳a() {
        if (this.f۱۶۱۳۵d == null) {
            this.f۱۶۱۳۵d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Cc.m۱۶۵۴۰a("OkHttp Dispatcher", false));
        }
        return this.f۱۶۱۳۵d;
    }

    /* renamed from: c, reason: contains not printable characters */
    private void m۱۷۰۸۲c() {
        if (this.f۱۶۱۳۷f.size() < this.f۱۶۱۳۲a && !this.f۱۶۱۳۶e.isEmpty()) {
            Iterator<Cx.a> it = this.f۱۶۱۳۶e.iterator();
            while (it.hasNext()) {
                Cx.a call = it.next();
                if (m۱۷۰۸۱b(call) < this.f۱۶۱۳۳b) {
                    it.remove();
                    this.f۱۶۱۳۷f.add(call);
                    m۱۷۰۸۳a().execute(call);
                }
                if (this.f۱۶۱۳۷f.size() >= this.f۱۶۱۳۲a) {
                    return;
                }
            }
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    private int m۱۷۰۸۱b(Cx.a call) {
        int result = 0;
        for (Cx.a c2 : this.f۱۶۱۳۷f) {
            if (!c2.m۱۷۲۴۱c().f۱۶۲۳۸g && c2.m۱۷۲۴۲d().equals(call.m۱۷۲۴۲d())) {
                result++;
            }
        }
        return result;
    }

    /* renamed from: a, reason: contains not printable characters */
    synchronized void m۱۷۰۸۵a(Cx call) {
        this.f۱۶۱۳۸g.add(call);
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۱۷۰۸۴a(Cx.a call) {
        m۱۷۰۸۰a(this.f۱۶۱۳۷f, call, true);
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۷۰۸۷b(Cx call) {
        m۱۷۰۸۰a(this.f۱۶۱۳۸g, call, false);
    }

    /* renamed from: a, reason: contains not printable characters */
    private <T> void m۱۷۰۸۰a(Deque<T> calls, T call, boolean promoteCalls) {
        int runningCallsCount;
        Runnable idleCallback;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            if (promoteCalls) {
                m۱۷۰۸۲c();
            }
            runningCallsCount = m۱۷۰۸۶b();
            idleCallback = this.f۱۶۱۳۴c;
        }
        if (runningCallsCount == 0 && idleCallback != null) {
            idleCallback.run();
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public synchronized int m۱۷۰۸۶b() {
        return this.f۱۶۱۳۷f.size() + this.f۱۶۱۳۸g.size();
    }
}
