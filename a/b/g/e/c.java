package a.b.g.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f۳۲۶a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f۳۲۷b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f۳۲۸c;

    /* renamed from: d  reason: collision with root package name */
    private int f۳۲۹d;

    /* renamed from: e  reason: collision with root package name */
    private Handler.Callback f۳۳۰e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final int f۳۳۱f;

    /* renamed from: g  reason: collision with root package name */
    private final int f۳۳۲g;

    /* renamed from: h  reason: collision with root package name */
    private final String f۳۳۳h;

    public interface d<T> {
        void a(T t);
    }

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                c.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                c.this.a((Runnable) msg.obj);
                return true;
            }
        }
    }

    public c(String threadName, int priority, int destructAfterMillisec) {
        this.f۳۳۳h = threadName;
        this.f۳۳۲g = priority;
        this.f۳۳۱f = destructAfterMillisec;
        this.f۳۲۹d = 0;
    }

    private void b(Runnable runnable) {
        synchronized (this.f۳۲۶a) {
            if (this.f۳۲۷b == null) {
                this.f۳۲۷b = new HandlerThread(this.f۳۳۳h, this.f۳۳۲g);
                this.f۳۲۷b.start();
                this.f۳۲۸c = new Handler(this.f۳۲۷b.getLooper(), this.f۳۳۰e);
                this.f۳۲۹d++;
            }
            this.f۳۲۸c.removeMessages(0);
            this.f۳۲۸c.sendMessage(this.f۳۲۸c.obtainMessage(1, runnable));
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callable f۳۳۵c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Handler f۳۳۶d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f۳۳۷e;

        b(c this$0, Callable callable, Handler handler, d dVar) {
            this.f۳۳۵c = callable;
            this.f۳۳۶d = handler;
            this.f۳۳۷e = dVar;
        }

        public void run() {
            Object obj;
            try {
                obj = this.f۳۳۵c.call();
            } catch (Exception e2) {
                obj = null;
            }
            this.f۳۳۶d.post(new a(obj));
        }

        class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Object f۳۳۸c;

            a(Object obj) {
                this.f۳۳۸c = obj;
            }

            public void run() {
                b.this.f۳۳۷e.a(this.f۳۳۸c);
            }
        }
    }

    public <T> void a(Callable<T> callable, d<T> dVar) {
        b(new b(this, callable, new Handler(), dVar));
    }

    public <T> T a(Callable<T> callable, int timeoutMillis) {
        ReentrantLock lock = new ReentrantLock();
        Condition cond = lock.newCondition();
        AtomicReference<T> holder = new AtomicReference<>();
        AtomicBoolean running = new AtomicBoolean(true);
        b(new RunnableC۰۰۱۳c(this, holder, callable, lock, running, cond));
        lock.lock();
        try {
            if (!running.get()) {
                return holder.get();
            }
            long remaining = TimeUnit.MILLISECONDS.toNanos((long) timeoutMillis);
            do {
                try {
                    remaining = cond.awaitNanos(remaining);
                } catch (InterruptedException e2) {
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
    /* renamed from: a.b.g.e.c$c  reason: collision with other inner class name */
    public class RunnableC۰۰۱۳c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AtomicReference f۳۴۰c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Callable f۳۴۱d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ReentrantLock f۳۴۲e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f۳۴۳f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Condition f۳۴۴g;

        RunnableC۰۰۱۳c(c this$0, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f۳۴۰c = atomicReference;
            this.f۳۴۱d = callable;
            this.f۳۴۲e = reentrantLock;
            this.f۳۴۳f = atomicBoolean;
            this.f۳۴۴g = condition;
        }

        public void run() {
            try {
                this.f۳۴۰c.set(this.f۳۴۱d.call());
            } catch (Exception e2) {
            }
            this.f۳۴۲e.lock();
            try {
                this.f۳۴۳f.set(false);
                this.f۳۴۴g.signal();
            } finally {
                this.f۳۴۲e.unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        runnable.run();
        synchronized (this.f۳۲۶a) {
            this.f۳۲۸c.removeMessages(0);
            this.f۳۲۸c.sendMessageDelayed(this.f۳۲۸c.obtainMessage(0), (long) this.f۳۳۱f);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        synchronized (this.f۳۲۶a) {
            if (!this.f۳۲۸c.hasMessages(1)) {
                this.f۳۲۷b.quit();
                this.f۳۲۷b = null;
                this.f۳۲۸c = null;
            }
        }
    }
}
