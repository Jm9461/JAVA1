package e;

import e.f0.c;
import e.x;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.RealCall;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private int f۴۰۸۵a = 64;

    /* renamed from: b  reason: collision with root package name */
    private int f۴۰۸۶b = 5;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f۴۰۸۷c;

    /* renamed from: d  reason: collision with root package name */
    private ExecutorService f۴۰۸۸d;

    /* renamed from: e  reason: collision with root package name */
    private final Deque<x.a> f۴۰۸۹e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    private final Deque<x.a> f۴۰۹۰f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final Deque<x> f۴۰۹۱g = new ArrayDeque();

    public synchronized ExecutorService a() {
        if (this.f۴۰۸۸d == null) {
            this.f۴۰۸۸d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), c.a("OkHttp Dispatcher", false));
        }
        return this.f۴۰۸۸d;
    }

    private void c() {
        if (this.f۴۰۹۰f.size() < this.f۴۰۸۵a && !this.f۴۰۸۹e.isEmpty()) {
            Iterator<RealCall.AsyncCall> i = this.f۴۰۸۹e.iterator();
            while (i.hasNext()) {
                x.a call = (x.a) i.next();
                if (b(call) < this.f۴۰۸۶b) {
                    i.remove();
                    this.f۴۰۹۰f.add(call);
                    a().execute(call);
                }
                if (this.f۴۰۹۰f.size() >= this.f۴۰۸۵a) {
                    return;
                }
            }
        }
    }

    private int b(x.a call) {
        int result = 0;
        for (x.a c2 : this.f۴۰۹۰f) {
            if (!c2.c().f۴۱۴۷g && c2.d().equals(call.d())) {
                result++;
            }
        }
        return result;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(x call) {
        this.f۴۰۹۱g.add(call);
    }

    /* access modifiers changed from: package-private */
    public void a(x.a call) {
        a(this.f۴۰۹۰f, call, true);
    }

    /* access modifiers changed from: package-private */
    public void b(x call) {
        a(this.f۴۰۹۱g, call, false);
    }

    private <T> void a(Deque<T> calls, T call, boolean promoteCalls) {
        int runningCallsCount;
        Runnable idleCallback;
        synchronized (this) {
            if (calls.remove(call)) {
                if (promoteCalls) {
                    c();
                }
                runningCallsCount = b();
                idleCallback = this.f۴۰۸۷c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (runningCallsCount == 0 && idleCallback != null) {
            idleCallback.run();
        }
    }

    public synchronized int b() {
        return this.f۴۰۹۰f.size() + this.f۴۰۹۱g.size();
    }
}
