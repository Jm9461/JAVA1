package p۱۳۹e;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.RealCall;
import p۱۳۹e.Cx;
import p۱۳۹e.p۱۴۰f0.Cc;

/* renamed from: e.n  reason: invalid class name */
public final class Cn {

    /* renamed from: a  reason: contains not printable characters */
    private int f۱۶۱۳۲a = 64;

    /* renamed from: b  reason: contains not printable characters */
    private int f۱۶۱۳۳b = 5;

    /* renamed from: c  reason: contains not printable characters */
    private Runnable f۱۶۱۳۴c;

    /* renamed from: d  reason: contains not printable characters */
    private ExecutorService f۱۶۱۳۵d;

    /* renamed from: e  reason: contains not printable characters */
    private final Deque<Cx.Ca> f۱۶۱۳۶e = new ArrayDeque();

    /* renamed from: f  reason: contains not printable characters */
    private final Deque<Cx.Ca> f۱۶۱۳۷f = new ArrayDeque();

    /* renamed from: g  reason: contains not printable characters */
    private final Deque<Cx> f۱۶۱۳۸g = new ArrayDeque();

    /* renamed from: a  reason: contains not printable characters */
    public synchronized ExecutorService m۱۹۱۶۲a() {
        if (this.f۱۶۱۳۵d == null) {
            this.f۱۶۱۳۵d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Cc.m۱۸۶۱۹a("OkHttp Dispatcher", false));
        }
        return this.f۱۶۱۳۵d;
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۹۱۶۱c() {
        if (this.f۱۶۱۳۷f.size() < this.f۱۶۱۳۲a && !this.f۱۶۱۳۶e.isEmpty()) {
            Iterator<RealCall.AsyncCall> i = this.f۱۶۱۳۶e.iterator();
            while (i.hasNext()) {
                Cx.Ca call = (Cx.Ca) i.next();
                if (m۱۹۱۶۰b(call) < this.f۱۶۱۳۳b) {
                    i.remove();
                    this.f۱۶۱۳۷f.add(call);
                    m۱۹۱۶۲a().execute(call);
                }
                if (this.f۱۶۱۳۷f.size() >= this.f۱۶۱۳۲a) {
                    return;
                }
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private int m۱۹۱۶۰b(Cx.Ca call) {
        int result = 0;
        for (Cx.Ca c : this.f۱۶۱۳۷f) {
            if (!c.m۱۹۳۱۹c().f۱۶۲۳۸g && c.m۱۹۳۲۰d().equals(call.m۱۹۳۲۰d())) {
                result++;
            }
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public synchronized void m۱۹۱۶۴a(Cx call) {
        this.f۱۶۱۳۸g.add(call);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۹۱۶۳a(Cx.Ca call) {
        m۱۹۱۵۹a(this.f۱۶۱۳۷f, call, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۹۱۶۶b(Cx call) {
        m۱۹۱۵۹a(this.f۱۶۱۳۸g, call, false);
    }

    /* renamed from: a  reason: contains not printable characters */
    private <T> void m۱۹۱۵۹a(Deque<T> calls, T call, boolean promoteCalls) {
        int runningCallsCount;
        Runnable idleCallback;
        synchronized (this) {
            if (calls.remove(call)) {
                if (promoteCalls) {
                    m۱۹۱۶۱c();
                }
                runningCallsCount = m۱۹۱۶۵b();
                idleCallback = this.f۱۶۱۳۴c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (runningCallsCount == 0 && idleCallback != null) {
            idleCallback.run();
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public synchronized int m۱۹۱۶۵b() {
        return this.f۱۶۱۳۷f.size() + this.f۱۶۱۳۸g.size();
    }
}
