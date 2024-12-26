package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class t {

    /* renamed from: e  reason: collision with root package name */
    private static t f۱۰۰۹e;

    /* renamed from: a  reason: collision with root package name */
    private final Object f۱۰۱۰a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f۱۰۱۱b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    private c f۱۰۱۲c;

    /* renamed from: d  reason: collision with root package name */
    private c f۱۰۱۳d;

    /* access modifiers changed from: package-private */
    public interface b {
        void a(int i);
    }

    static t a() {
        if (f۱۰۰۹e == null) {
            f۱۰۰۹e = new t();
        }
        return f۱۰۰۹e;
    }

    private t() {
    }

    class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            t.this.a((c) message.obj);
            return true;
        }
    }

    public void a(b callback) {
        synchronized (this.f۱۰۱۰a) {
            if (c(callback) && !this.f۱۰۱۲c.f۱۰۱۷c) {
                this.f۱۰۱۲c.f۱۰۱۷c = true;
                this.f۱۰۱۱b.removeCallbacksAndMessages(this.f۱۰۱۲c);
            }
        }
    }

    public void b(b callback) {
        synchronized (this.f۱۰۱۰a) {
            if (c(callback) && this.f۱۰۱۲c.f۱۰۱۷c) {
                this.f۱۰۱۲c.f۱۰۱۷c = false;
                b(this.f۱۰۱۲c);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<b> f۱۰۱۵a;

        /* renamed from: b  reason: collision with root package name */
        int f۱۰۱۶b;

        /* renamed from: c  reason: collision with root package name */
        boolean f۱۰۱۷c;

        /* access modifiers changed from: package-private */
        public boolean a(b callback) {
            return callback != null && this.f۱۰۱۵a.get() == callback;
        }
    }

    private boolean a(c record, int event) {
        b callback = record.f۱۰۱۵a.get();
        if (callback == null) {
            return false;
        }
        this.f۱۰۱۱b.removeCallbacksAndMessages(record);
        callback.a(event);
        return true;
    }

    private boolean c(b callback) {
        c cVar = this.f۱۰۱۲c;
        return cVar != null && cVar.a(callback);
    }

    private void b(c r) {
        int i = r.f۱۰۱۶b;
        if (i != -2) {
            int durationMs = 2750;
            if (i > 0) {
                durationMs = r.f۱۰۱۶b;
            } else if (i == -1) {
                durationMs = 1500;
            }
            this.f۱۰۱۱b.removeCallbacksAndMessages(r);
            Handler handler = this.f۱۰۱۱b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, r), (long) durationMs);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(c record) {
        synchronized (this.f۱۰۱۰a) {
            if (this.f۱۰۱۲c == record || this.f۱۰۱۳d == record) {
                a(record, 2);
            }
        }
    }
}
