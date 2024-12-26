package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۸۸e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a.b.g.e.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc {

    /* renamed from: b, reason: contains not printable characters */
    private HandlerThread f۸۶۹۰b;

    /* renamed from: c, reason: contains not printable characters */
    private Handler f۸۶۹۱c;

    /* renamed from: f, reason: contains not printable characters */
    private final int f۸۶۹۴f;

    /* renamed from: g, reason: contains not printable characters */
    private final int f۸۶۹۵g;

    /* renamed from: h, reason: contains not printable characters */
    private final String f۸۶۹۶h;

    /* renamed from: a, reason: contains not printable characters */
    private final Object f۸۶۸۹a = new Object();

    /* renamed from: e, reason: contains not printable characters */
    private Handler.Callback f۸۶۹۳e = new a();

    /* renamed from: d, reason: contains not printable characters */
    private int f۸۶۹۲d = 0;

    /* renamed from: a.b.g.e.c$d */
    public interface d<T> {
        /* renamed from: a, reason: contains not printable characters */
        void mo۸۴۵۹a(T t);
    }

    /* renamed from: a.b.g.e.c$a */
    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                Cc.this.m۸۴۵۶a();
                return true;
            }
            if (i != 1) {
                return true;
            }
            Cc.this.m۸۴۵۷a((Runnable) msg.obj);
            return true;
        }
    }

    public Cc(String threadName, int priority, int destructAfterMillisec) {
        this.f۸۶۹۶h = threadName;
        this.f۸۶۹۵g = priority;
        this.f۸۶۹۴f = destructAfterMillisec;
    }

    /* renamed from: b, reason: contains not printable characters */
    private void m۸۴۵۴b(Runnable runnable) {
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

    /* renamed from: a.b.g.e.c$b */
    class b implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ Callable f۸۶۹۸c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ Handler f۸۶۹۹d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ d f۸۷۰۰e;

        b(Cc this$0, Callable callable, Handler handler, d dVar) {
            this.f۸۶۹۸c = callable;
            this.f۸۶۹۹d = handler;
            this.f۸۷۰۰e = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f۸۶۹۸c.call();
            } catch (Exception e2) {
                obj = null;
            }
            this.f۸۶۹۹d.post(new a(obj));
        }

        /* renamed from: a.b.g.e.c$b$a */
        class a implements Runnable {

            /* renamed from: c, reason: contains not printable characters */
            final /* synthetic */ Object f۸۷۰۱c;

            a(Object obj) {
                this.f۸۷۰۱c = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f۸۷۰۰e.mo۸۴۵۹a(this.f۸۷۰۱c);
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.e.c$d != android.support.v4.provider.SelfDestructiveThread$ReplyCallback<T> */
    /* renamed from: a, reason: contains not printable characters */
    public <T> void m۸۴۵۸a(Callable<T> callable, d<T> dVar) {
        Handler callingHandler = new Handler();
        m۸۴۵۴b(new b(this, callable, callingHandler, dVar));
    }

    /* renamed from: a, reason: contains not printable characters */
    public <T> T m۸۴۵۵a(Callable<T> callable, int timeoutMillis) {
        ReentrantLock lock = new ReentrantLock();
        Condition cond = lock.newCondition();
        AtomicReference<T> holder = new AtomicReference<>();
        AtomicBoolean running = new AtomicBoolean(true);
        m۸۴۵۴b(new c(this, holder, callable, lock, running, cond));
        lock.lock();
        try {
            if (!running.get()) {
                return holder.get();
            }
            long remaining = TimeUnit.MILLISECONDS.toNanos(timeoutMillis);
            do {
                try {
                    remaining = cond.awaitNanos(remaining);
                } catch (InterruptedException e2) {
                }
                if (!running.get()) {
                    return holder.get();
                }
            } while (remaining > 0);
            throw new InterruptedException("timeout");
        } finally {
            lock.unlock();
        }
    }

    /* renamed from: a.b.g.e.c$c */
    class c implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        final /* synthetic */ AtomicReference f۸۷۰۳c;

        /* renamed from: d, reason: contains not printable characters */
        final /* synthetic */ Callable f۸۷۰۴d;

        /* renamed from: e, reason: contains not printable characters */
        final /* synthetic */ ReentrantLock f۸۷۰۵e;

        /* renamed from: f, reason: contains not printable characters */
        final /* synthetic */ AtomicBoolean f۸۷۰۶f;

        /* renamed from: g, reason: contains not printable characters */
        final /* synthetic */ Condition f۸۷۰۷g;

        c(Cc this$0, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f۸۷۰۳c = atomicReference;
            this.f۸۷۰۴d = callable;
            this.f۸۷۰۵e = reentrantLock;
            this.f۸۷۰۶f = atomicBoolean;
            this.f۸۷۰۷g = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f۸۷۰۳c.set(this.f۸۷۰۴d.call());
            } catch (Exception e2) {
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

    /* renamed from: a, reason: contains not printable characters */
    void m۸۴۵۷a(Runnable runnable) {
        runnable.run();
        synchronized (this.f۸۶۸۹a) {
            this.f۸۶۹۱c.removeMessages(0);
            this.f۸۶۹۱c.sendMessageDelayed(this.f۸۶۹۱c.obtainMessage(0), this.f۸۶۹۴f);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۸۴۵۶a() {
        synchronized (this.f۸۶۸۹a) {
            if (this.f۸۶۹۱c.hasMessages(1)) {
                return;
            }
            this.f۸۶۹۰b.quit();
            this.f۸۶۹۰b = null;
            this.f۸۶۹۱c = null;
        }
    }
}
