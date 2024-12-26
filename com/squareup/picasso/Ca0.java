package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.a0  reason: invalid class name */
public class Ca0 {

    /* renamed from: a  reason: contains not printable characters */
    final HandlerThread f۱۵۳۵۹a = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: b  reason: contains not printable characters */
    final AbstractCd f۱۵۳۶۰b;

    /* renamed from: c  reason: contains not printable characters */
    final Handler f۱۵۳۶۱c;

    /* renamed from: d  reason: contains not printable characters */
    long f۱۵۳۶۲d;

    /* renamed from: e  reason: contains not printable characters */
    long f۱۵۳۶۳e;

    /* renamed from: f  reason: contains not printable characters */
    long f۱۵۳۶۴f;

    /* renamed from: g  reason: contains not printable characters */
    long f۱۵۳۶۵g;

    /* renamed from: h  reason: contains not printable characters */
    long f۱۵۳۶۶h;

    /* renamed from: i  reason: contains not printable characters */
    long f۱۵۳۶۷i;

    /* renamed from: j  reason: contains not printable characters */
    long f۱۵۳۶۸j;

    /* renamed from: k  reason: contains not printable characters */
    long f۱۵۳۶۹k;

    /* renamed from: l  reason: contains not printable characters */
    int f۱۵۳۷۰l;

    /* renamed from: m  reason: contains not printable characters */
    int f۱۵۳۷۱m;

    /* renamed from: n  reason: contains not printable characters */
    int f۱۵۳۷۲n;

    Ca0(AbstractCd cache) {
        this.f۱۵۳۶۰b = cache;
        this.f۱۵۳۵۹a.start();
        Cd0.m۱۸۳۲۱a(this.f۱۵۳۵۹a.getLooper());
        this.f۱۵۳۶۱c = new HandlerCa(this.f۱۵۳۵۹a.getLooper(), this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۶۰a(Bitmap bitmap) {
        m۱۸۲۵۷a(bitmap, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۲۶۴b(Bitmap bitmap) {
        m۱۸۲۵۷a(bitmap, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۵۹a(long size) {
        Handler handler = this.f۱۵۳۶۱c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(size)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۲۶۲b() {
        this.f۱۵۳۶۱c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۸۲۶۵c() {
        this.f۱۵۳۶۱c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۸۲۶۷d() {
        this.f۱۵۳۶۲d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public void m۱۸۲۶۸e() {
        this.f۱۵۳۶۳e++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۲۶۱a(Long size) {
        this.f۱۵۳۷۰l++;
        this.f۱۵۳۶۴f += size.longValue();
        this.f۱۵۳۶۷i = m۱۸۲۵۶a(this.f۱۵۳۷۰l, this.f۱۵۳۶۴f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۲۶۳b(long size) {
        this.f۱۵۳۷۱m++;
        this.f۱۵۳۶۵g += size;
        this.f۱۵۳۶۸j = m۱۸۲۵۶a(this.f۱۵۳۷۱m, this.f۱۵۳۶۵g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۸۲۶۶c(long size) {
        this.f۱۵۳۷۲n++;
        this.f۱۵۳۶۶h += size;
        this.f۱۵۳۶۹k = m۱۸۲۵۶a(this.f۱۵۳۷۱m, this.f۱۵۳۶۶h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public Cb0 m۱۸۲۵۸a() {
        return new Cb0(this.f۱۵۳۶۰b.m۱۸۳۰۳a(), this.f۱۵۳۶۰b.size(), this.f۱۵۳۶۲d, this.f۱۵۳۶۳e, this.f۱۵۳۶۴f, this.f۱۵۳۶۵g, this.f۱۵۳۶۶h, this.f۱۵۳۶۷i, this.f۱۵۳۶۸j, this.f۱۵۳۶۹k, this.f۱۵۳۷۰l, this.f۱۵۳۷۱m, this.f۱۵۳۷۲n, System.currentTimeMillis());
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۲۵۷a(Bitmap bitmap, int what) {
        int bitmapSize = Cd0.m۱۸۳۱۱a(bitmap);
        Handler handler = this.f۱۵۳۶۱c;
        handler.sendMessage(handler.obtainMessage(what, bitmapSize, 0));
    }

    /* renamed from: a  reason: contains not printable characters */
    private static long m۱۸۲۵۶a(int count, long totalSize) {
        return totalSize / ((long) count);
    }

    /* renamed from: com.squareup.picasso.a0$a  reason: invalid class name */
    private static class HandlerCa extends Handler {

        /* renamed from: a  reason: contains not printable characters */
        private final Ca0 f۱۵۳۷۳a;

        HandlerCa(Looper looper, Ca0 stats) {
            super(looper);
            this.f۱۵۳۷۳a = stats;
        }

        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                this.f۱۵۳۷۳a.m۱۸۲۶۷d();
            } else if (i == 1) {
                this.f۱۵۳۷۳a.m۱۸۲۶۸e();
            } else if (i == 2) {
                this.f۱۵۳۷۳a.m۱۸۲۶۳b((long) msg.arg1);
            } else if (i == 3) {
                this.f۱۵۳۷۳a.m۱۸۲۶۶c((long) msg.arg1);
            } else if (i != 4) {
                Ct.f۱۵۴۸۲p.post(new RunnableCa(this, msg));
            } else {
                this.f۱۵۳۷۳a.m۱۸۲۶۱a((Long) msg.obj);
            }
        }

        /* renamed from: com.squareup.picasso.a0$a$a  reason: invalid class name */
        class RunnableCa implements Runnable {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ Message f۱۵۳۷۴c;

            RunnableCa(HandlerCa this$0, Message message) {
                this.f۱۵۳۷۴c = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f۱۵۳۷۴c.what);
            }
        }
    }
}
