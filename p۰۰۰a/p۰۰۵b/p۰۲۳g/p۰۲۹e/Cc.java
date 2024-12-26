package p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۲۹e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.b.g.e.c  reason: invalid class name */
public class Cc {

    /* renamed from: a  reason: contains not printable characters */
    private final Object f۸۶۸۹a = new Object();

    /* renamed from: b  reason: contains not printable characters */
    private HandlerThread f۸۶۹۰b;

    /* renamed from: c  reason: contains not printable characters */
    private Handler f۸۶۹۱c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۸۶۹۲d;

    /* renamed from: e  reason: contains not printable characters */
    private Handler.Callback f۸۶۹۳e = new Ca();

    /* renamed from: f  reason: contains not printable characters */
    private final int f۸۶۹۴f;

    /* renamed from: g  reason: contains not printable characters */
    private final int f۸۶۹۵g;

    /* renamed from: h  reason: contains not printable characters */
    private final String f۸۶۹۶h;

    /* renamed from: a.b.g.e.c$d  reason: invalid class name */
    public interface AbstractCd<T> {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۰۵۳۰a(T t);
    }

    /* renamed from: a.b.g.e.c$a  reason: invalid class name */
    class Ca implements Handler.Callback {
        Ca() {
        }

        public boolean handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                Cc.this.m۱۰۵۲۷a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                Cc.this.m۱۰۵۲۸a((Runnable) msg.obj);
                return true;
            }
        }
    }

    public Cc(String threadName, int priority, int destructAfterMillisec) {
        this.f۸۶۹۶h = threadName;
        this.f۸۶۹۵g = priority;
        this.f۸۶۹۴f = destructAfterMillisec;
        this.f۸۶۹۲d = 0;
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۵۲۵b(Runnable runnable) {
        synchronized (this.f۸۶۸۹a) {
            if (this.f۸۶۹۰b == null) {
                this.f۸۶۹۰b = new HandlerThread(this.f۸۶۹۶h, this.f۸۶۹۵g);
                this.f۸۶۹۰b.start();
                this.f۸۶۹۱c = new Handler(this.f۸۶۹۰b.getLooper(), this.f۸۶۹۳e);
                this.f۸۶۹۲d++;
            }
            this.f۸۶۹۱c.removeMessages(0);
            this.f۸۶۹۱c.sendMessage(this.f۸۶۹۱c.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.g.e.c$b  reason: invalid class name */
    public class RunnableCb implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ Callable f۸۶۹۸c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ Handler f۸۶۹۹d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ AbstractCd f۸۷۰۰e;

        RunnableCb(Cc this$0, Callable callable, Handler handler, AbstractCd dVar) {
            this.f۸۶۹۸c = callable;
            this.f۸۶۹۹d = handler;
            this.f۸۷۰۰e = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f۸۶۹۸c.call();
            } catch (Exception e) {
                obj = null;
            }
            this.f۸۶۹۹d.post(new RunnableCa(obj));
        }

        /* renamed from: a.b.g.e.c$b$a  reason: invalid class name */
        class RunnableCa implements Runnable {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ Object f۸۷۰۱c;

            RunnableCa(Object obj) {
                this.f۸۷۰۱c = obj;
            }

            public void run() {
                RunnableCb.this.f۸۷۰۰e.m۱۰۵۳۰a(this.f۸۷۰۱c);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public <T> void m۱۰۵۲۹a(Callable<T> callable, AbstractCd<T> dVar) {
        m۱۰۵۲۵b(new RunnableCb(this, callable, new Handler(), dVar));
    }

    /* renamed from: a  reason: contains not printable characters */
    public <T> T m۱۰۵۲۶a(Callable<T> callable, int timeoutMillis) {
        ReentrantLock lock = new ReentrantLock();
        Condition cond = lock.newCondition();
        AtomicReference<T> holder = new AtomicReference<>();
        AtomicBoolean running = new AtomicBoolean(true);
        m۱۰۵۲۵b(new RunnableCc(this, holder, callable, lock, running, cond));
        lock.lock();
        try {
            if (!running.get()) {
                return holder.get();
            }
            long remaining = TimeUnit.MILLISECONDS.toNanos((long) timeoutMillis);
            do {
                try {
                    remaining = cond.awaitNanos(remaining);
                } catch (InterruptedException e) {
                }
                if (!running.get()) {
                    T t = holder.get();
                    lock.unlock();
                    return t;
                }
            } while (remaining > 0);
            throw new InterruptedException("timeout");
        } finally {
            lock.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.g.e.c$c  reason: invalid class name */
    public class RunnableCc implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        final /* synthetic */ AtomicReference f۸۷۰۳c;

        /* renamed from: d  reason: contains not printable characters */
        final /* synthetic */ Callable f۸۷۰۴d;

        /* renamed from: e  reason: contains not printable characters */
        final /* synthetic */ ReentrantLock f۸۷۰۵e;

        /* renamed from: f  reason: contains not printable characters */
        final /* synthetic */ AtomicBoolean f۸۷۰۶f;

        /* renamed from: g  reason: contains not printable characters */
        final /* synthetic */ Condition f۸۷۰۷g;

        RunnableCc(Cc this$0, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f۸۷۰۳c = atomicReference;
            this.f۸۷۰۴d = callable;
            this.f۸۷۰۵e = reentrantLock;
            this.f۸۷۰۶f = atomicBoolean;
            this.f۸۷۰۷g = condition;
        }

        public void run() {
            try {
                this.f۸۷۰۳c.set(this.f۸۷۰۴d.call());
            } catch (Exception e) {
            }
            this.f۸۷۰۵e.lock();
            try {
                this.f۸۷۰۶f.set(false);
                this.f۸۷۰۷g.signal();
            } finally {
                this.f۸۷۰۵e.unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۵۲۸a(Runnable runnable) {
        runnable.run();
        synchronized (this.f۸۶۸۹a) {
            this.f۸۶۹۱c.removeMessages(0);
            this.f۸۶۹۱c.sendMessageDelayed(this.f۸۶۹۱c.obtainMessage(0), (long) this.f۸۶۹۴f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۵۲۷a() {
        synchronized (this.f۸۶۸۹a) {
            if (!this.f۸۶۹۱c.hasMessages(1)) {
                this.f۸۶۹۰b.quit();
                this.f۸۶۹۰b = null;
                this.f۸۶۹۱c = null;
            }
        }
    }
}
