package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.t;
import com.squareup.picasso.w;
import java.util.concurrent.atomic.AtomicInteger;

public class x {
    private static final AtomicInteger m = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private final t f۳۶۳۹a;

    /* renamed from: b  reason: collision with root package name */
    private final w.b f۳۶۴۰b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f۳۶۴۱c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f۳۶۴۲d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f۳۶۴۳e = true;

    /* renamed from: f  reason: collision with root package name */
    private int f۳۶۴۴f;

    /* renamed from: g  reason: collision with root package name */
    private int f۳۶۴۵g;

    /* renamed from: h  reason: collision with root package name */
    private int f۳۶۴۶h;
    private int i;
    private Drawable j;
    private Drawable k;
    private Object l;

    x(t picasso, Uri uri, int resourceId) {
        if (!picasso.o) {
            this.f۳۶۳۹a = picasso;
            this.f۳۶۴۰b = new w.b(uri, resourceId, picasso.l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    public x c() {
        this.f۳۶۴۲d = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public x d() {
        this.f۳۶۴۲d = false;
        return this;
    }

    /* access modifiers changed from: package-private */
    public x b() {
        this.l = null;
        return this;
    }

    public x a(int targetWidth, int targetHeight) {
        this.f۳۶۴۰b.a(targetWidth, targetHeight);
        return this;
    }

    public x a() {
        this.f۳۶۴۰b.a(17);
        return this;
    }

    public void a(ImageView target) {
        a(target, (e) null);
    }

    public void a(ImageView target, e callback) {
        Bitmap bitmap;
        long started = System.nanoTime();
        d0.a();
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f۳۶۴۰b.b()) {
            this.f۳۶۳۹a.a(target);
            if (this.f۳۶۴۳e) {
                u.a(target, e());
            }
        } else {
            if (this.f۳۶۴۲d) {
                if (!this.f۳۶۴۰b.c()) {
                    int width = target.getWidth();
                    int height = target.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f۳۶۴۳e) {
                            u.a(target, e());
                        }
                        this.f۳۶۳۹a.a(target, new h(this, target, callback));
                        return;
                    }
                    this.f۳۶۴۰b.a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            w request = a(started);
            String requestKey = d0.a(request);
            if (!p.a(this.f۳۶۴۶h) || (bitmap = this.f۳۶۳۹a.a(requestKey)) == null) {
                if (this.f۳۶۴۳e) {
                    u.a(target, e());
                }
                this.f۳۶۳۹a.a(new l(this.f۳۶۳۹a, target, request, this.f۳۶۴۶h, this.i, this.f۳۶۴۵g, this.k, requestKey, this.l, callback, this.f۳۶۴۱c));
                return;
            }
            this.f۳۶۳۹a.a(target);
            t tVar = this.f۳۶۳۹a;
            u.a(target, tVar.f۳۵۸۹e, bitmap, t.e.MEMORY, this.f۳۶۴۱c, tVar.m);
            if (this.f۳۶۳۹a.n) {
                String g2 = request.g();
                d0.a("Main", "completed", g2, "from " + t.e.MEMORY);
            }
            if (callback != null) {
                callback.a();
            }
        }
    }

    private Drawable e() {
        int i2 = this.f۳۶۴۴f;
        if (i2 == 0) {
            return this.j;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return this.f۳۶۳۹a.f۳۵۸۹e.getDrawable(i2);
        }
        if (i3 >= 16) {
            return this.f۳۶۳۹a.f۳۵۸۹e.getResources().getDrawable(this.f۳۶۴۴f);
        }
        TypedValue value = new TypedValue();
        this.f۳۶۳۹a.f۳۵۸۹e.getResources().getValue(this.f۳۶۴۴f, value, true);
        return this.f۳۶۳۹a.f۳۵۸۹e.getResources().getDrawable(value.resourceId);
    }

    private w a(long started) {
        int id = m.getAndIncrement();
        w request = this.f۳۶۴۰b.a();
        request.f۳۶۲۳a = id;
        request.f۳۶۲۴b = started;
        boolean loggingEnabled = this.f۳۶۳۹a.n;
        if (loggingEnabled) {
            d0.a("Main", "created", request.g(), request.toString());
        }
        w transformed = this.f۳۶۳۹a.a(request);
        if (transformed != request) {
            transformed.f۳۶۲۳a = id;
            transformed.f۳۶۲۴b = started;
            if (loggingEnabled) {
                String d2 = transformed.d();
                d0.a("Main", "changed", d2, "into " + transformed);
            }
        }
        return transformed;
    }
}
