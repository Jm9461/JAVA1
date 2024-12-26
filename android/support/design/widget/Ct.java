package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: android.support.design.widget.t  reason: invalid class name */
public class Ct {

    /* renamed from: e  reason: contains not printable characters */
    private static Ct f۱۰۰۳۶e;

    /* renamed from: a  reason: contains not printable characters */
    private final Object f۱۰۰۳۷a = new Object();

    /* renamed from: b  reason: contains not printable characters */
    private final Handler f۱۰۰۳۸b = new Handler(Looper.getMainLooper(), new Ca());

    /* renamed from: c  reason: contains not printable characters */
    private Cc f۱۰۰۳۹c;

    /* renamed from: d  reason: contains not printable characters */
    private Cc f۱۰۰۴۰d;

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.design.widget.t$b  reason: invalid class name */
    public interface AbstractCb {
        /* renamed from: a  reason: contains not printable characters */
        void m۱۲۰۲۴a(int i);
    }

    /* renamed from: a  reason: contains not printable characters */
    static Ct m۱۲۰۱۷a() {
        if (f۱۰۰۳۶e == null) {
            f۱۰۰۳۶e = new Ct();
        }
        return f۱۰۰۳۶e;
    }

    private Ct() {
    }

    /* renamed from: android.support.design.widget.t$a  reason: invalid class name */
    class Ca implements Handler.Callback {
        Ca() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            Ct.this.m۱۲۰۲۲a((Cc) message.obj);
            return true;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۲۱a(AbstractCb callback) {
        synchronized (this.f۱۰۰۳۷a) {
            if (m۱۲۰۲۰c(callback) && !this.f۱۰۰۳۹c.f۱۰۰۴۴c) {
                this.f۱۰۰۳۹c.f۱۰۰۴۴c = true;
                this.f۱۰۰۳۸b.removeCallbacksAndMessages(this.f۱۰۰۳۹c);
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۰۲۳b(AbstractCb callback) {
        synchronized (this.f۱۰۰۳۷a) {
            if (m۱۲۰۲۰c(callback) && this.f۱۰۰۳۹c.f۱۰۰۴۴c) {
                this.f۱۰۰۳۹c.f۱۰۰۴۴c = false;
                m۱۲۰۱۹b(this.f۱۰۰۳۹c);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.design.widget.t$c  reason: invalid class name */
    public static class Cc {

        /* renamed from: a  reason: contains not printable characters */
        final WeakReference<AbstractCb> f۱۰۰۴۲a;

        /* renamed from: b  reason: contains not printable characters */
        int f۱۰۰۴۳b;

        /* renamed from: c  reason: contains not printable characters */
        boolean f۱۰۰۴۴c;

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۲۰۲۵a(AbstractCb callback) {
            return callback != null && this.f۱۰۰۴۲a.get() == callback;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۲۰۱۸a(Cc record, int event) {
        AbstractCb callback = record.f۱۰۰۴۲a.get();
        if (callback == null) {
            return false;
        }
        this.f۱۰۰۳۸b.removeCallbacksAndMessages(record);
        callback.m۱۲۰۲۴a(event);
        return true;
    }

    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۲۰۲۰c(AbstractCb callback) {
        Cc cVar = this.f۱۰۰۳۹c;
        return cVar != null && cVar.m۱۲۰۲۵a(callback);
    }

    /* renamed from: b  reason: contains not printable characters */
    private void m۱۲۰۱۹b(Cc r) {
        int i = r.f۱۰۰۴۳b;
        if (i != -2) {
            int durationMs = 2750;
            if (i > 0) {
                durationMs = r.f۱۰۰۴۳b;
            } else if (i == -1) {
                durationMs = 1500;
            }
            this.f۱۰۰۳۸b.removeCallbacksAndMessages(r);
            Handler handler = this.f۱۰۰۳۸b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, r), (long) durationMs);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۰۲۲a(Cc record) {
        synchronized (this.f۱۰۰۳۷a) {
            if (this.f۱۰۰۳۹c == record || this.f۱۰۰۴۰d == record) {
                m۱۲۰۱۸a(record, 2);
            }
        }
    }
}
