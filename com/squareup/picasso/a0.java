package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
public class a0 {

    /* renamed from: a  reason: collision with root package name */
    final HandlerThread f۳۵۰۲a = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: b  reason: collision with root package name */
    final d f۳۵۰۳b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f۳۵۰۴c;

    /* renamed from: d  reason: collision with root package name */
    long f۳۵۰۵d;

    /* renamed from: e  reason: collision with root package name */
    long f۳۵۰۶e;

    /* renamed from: f  reason: collision with root package name */
    long f۳۵۰۷f;

    /* renamed from: g  reason: collision with root package name */
    long f۳۵۰۸g;

    /* renamed from: h  reason: collision with root package name */
    long f۳۵۰۹h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;

    a0(d cache) {
        this.f۳۵۰۳b = cache;
        this.f۳۵۰۲a.start();
        d0.a(this.f۳۵۰۲a.getLooper());
        this.f۳۵۰۴c = new a(this.f۳۵۰۲a.getLooper(), this);
    }

    /* access modifiers changed from: package-private */
    public void a(Bitmap bitmap) {
        a(bitmap, 2);
    }

    /* access modifiers changed from: package-private */
    public void b(Bitmap bitmap) {
        a(bitmap, 3);
    }

    /* access modifiers changed from: package-private */
    public void a(long size) {
        Handler handler = this.f۳۵۰۴c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(size)));
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f۳۵۰۴c.sendEmptyMessage(0);
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f۳۵۰۴c.sendEmptyMessage(1);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f۳۵۰۵d++;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f۳۵۰۶e++;
    }

    /* access modifiers changed from: package-private */
    public void a(Long size) {
        this.l++;
        this.f۳۵۰۷f += size.longValue();
        this.i = a(this.l, this.f۳۵۰۷f);
    }

    /* access modifiers changed from: package-private */
    public void b(long size) {
        this.m++;
        this.f۳۵۰۸g += size;
        this.j = a(this.m, this.f۳۵۰۸g);
    }

    /* access modifiers changed from: package-private */
    public void c(long size) {
        this.n++;
        this.f۳۵۰۹h += size;
        this.k = a(this.m, this.f۳۵۰۹h);
    }

    /* access modifiers changed from: package-private */
    public b0 a() {
        return new b0(this.f۳۵۰۳b.a(), this.f۳۵۰۳b.size(), this.f۳۵۰۵d, this.f۳۵۰۶e, this.f۳۵۰۷f, this.f۳۵۰۸g, this.f۳۵۰۹h, this.i, this.j, this.k, this.l, this.m, this.n, System.currentTimeMillis());
    }

    private void a(Bitmap bitmap, int what) {
        int bitmapSize = d0.a(bitmap);
        Handler handler = this.f۳۵۰۴c;
        handler.sendMessage(handler.obtainMessage(what, bitmapSize, 0));
    }

    private static long a(int count, long totalSize) {
        return totalSize / ((long) count);
    }

    private static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f۳۵۱۰a;

        a(Looper looper, a0 stats) {
            super(looper);
            this.f۳۵۱۰a = stats;
        }

        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                this.f۳۵۱۰a.d();
            } else if (i == 1) {
                this.f۳۵۱۰a.e();
            } else if (i == 2) {
                this.f۳۵۱۰a.b((long) msg.arg1);
            } else if (i == 3) {
                this.f۳۵۱۰a.c((long) msg.arg1);
            } else if (i != 4) {
                t.p.post(new RunnableC۰۱۱۲a(this, msg));
            } else {
                this.f۳۵۱۰a.a((Long) msg.obj);
            }
        }

        /* renamed from: com.squareup.picasso.a0$a$a  reason: collision with other inner class name */
        class RunnableC۰۱۱۲a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Message f۳۵۱۱c;

            RunnableC۰۱۱۲a(a this$0, Message message) {
                this.f۳۵۱۱c = message;
            }

            public void run() {
                throw new AssertionError("Unhandled stats message." + this.f۳۵۱۱c.what);
            }
        }
    }
}
