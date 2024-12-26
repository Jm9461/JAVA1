package a.a.a.a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f۳a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f۴b = Executors.newFixedThreadPool(2);

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f۵c;

    @Override // a.a.a.a.c
    public void a(Runnable runnable) {
        this.f۴b.execute(runnable);
    }

    @Override // a.a.a.a.c
    public void b(Runnable runnable) {
        if (this.f۵c == null) {
            synchronized (this.f۳a) {
                if (this.f۵c == null) {
                    this.f۵c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f۵c.post(runnable);
    }

    @Override // a.a.a.a.c
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
