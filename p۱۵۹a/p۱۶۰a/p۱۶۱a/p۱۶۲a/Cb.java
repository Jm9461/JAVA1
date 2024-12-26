package p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۲a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: a.a.a.a.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cb extends AbstractCc {

    /* renamed from: a, reason: contains not printable characters */
    private final Object f۸۲۳۱a = new Object();

    /* renamed from: b, reason: contains not printable characters */
    private ExecutorService f۸۲۳۲b = Executors.newFixedThreadPool(2);

    /* renamed from: c, reason: contains not printable characters */
    private volatile Handler f۸۲۳۳c;

    @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۲a.AbstractCc
    /* renamed from: a, reason: contains not printable characters */
    public void mo۷۸۵۲a(Runnable runnable) {
        this.f۸۲۳۲b.execute(runnable);
    }

    @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۲a.AbstractCc
    /* renamed from: b, reason: contains not printable characters */
    public void mo۷۸۵۴b(Runnable runnable) {
        if (this.f۸۲۳۳c == null) {
            synchronized (this.f۸۲۳۱a) {
                if (this.f۸۲۳۳c == null) {
                    this.f۸۲۳۳c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f۸۲۳۳c.post(runnable);
    }

    @Override // p۱۵۹a.p۱۶۰a.p۱۶۱a.p۱۶۲a.AbstractCc
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۷۸۵۳a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
