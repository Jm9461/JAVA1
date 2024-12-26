package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.widget.ImageView;
import com.squareup.picasso.Ct;
import com.squareup.picasso.Cw;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.squareup.picasso.x  reason: invalid class name */
public class Cx {

    /* renamed from: m  reason: contains not printable characters */
    private static final AtomicInteger f۱۵۵۶۹m = new AtomicInteger();

    /* renamed from: a  reason: contains not printable characters */
    private final Ct f۱۵۵۷۰a;

    /* renamed from: b  reason: contains not printable characters */
    private final Cw.Cb f۱۵۵۷۱b;

    /* renamed from: c  reason: contains not printable characters */
    private boolean f۱۵۵۷۲c;

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۵۵۷۳d;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۱۵۵۷۴e = true;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۵۵۷۵f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۵۵۷۶g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۵۵۷۷h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۵۵۷۸i;

    /* renamed from: j  reason: contains not printable characters */
    private Drawable f۱۵۵۷۹j;

    /* renamed from: k  reason: contains not printable characters */
    private Drawable f۱۵۵۸۰k;

    /* renamed from: l  reason: contains not printable characters */
    private Object f۱۵۵۸۱l;

    Cx(Ct picasso, Uri uri, int resourceId) {
        if (!picasso.f۱۵۴۹۸o) {
            this.f۱۵۵۷۰a = picasso;
            this.f۱۵۵۷۱b = new Cw.Cb(uri, resourceId, picasso.f۱۵۴۹۵l);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    /* renamed from: c  reason: contains not printable characters */
    public Cx m۱۸۴۳۸c() {
        this.f۱۵۵۷۳d = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public Cx m۱۸۴۳۹d() {
        this.f۱۵۵۷۳d = false;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public Cx m۱۸۴۳۷b() {
        this.f۱۵۵۸۱l = null;
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cx m۱۸۴۳۴a(int targetWidth, int targetHeight) {
        this.f۱۵۵۷۱b.m۱۸۴۲۷a(targetWidth, targetHeight);
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public Cx m۱۸۴۳۳a() {
        this.f۱۵۵۷۱b.m۱۸۴۲۶a(17);
        return this;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۳۵a(ImageView target) {
        m۱۸۴۳۶a(target, (AbstractCe) null);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۴۳۶a(ImageView target, AbstractCe callback) {
        Bitmap bitmap;
        long started = System.nanoTime();
        Cd0.m۱۸۳۲۰a();
        if (target == null) {
            throw new IllegalArgumentException("Target must not be null.");
        } else if (!this.f۱۵۵۷۱b.m۱۸۴۲۹b()) {
            this.f۱۵۵۷۰a.m۱۸۴۰۱a(target);
            if (this.f۱۵۵۷۴e) {
                Cu.m۱۸۴۱۵a(target, m۱۸۴۳۲e());
            }
        } else {
            if (this.f۱۵۵۷۳d) {
                if (!this.f۱۵۵۷۱b.m۱۸۴۳۰c()) {
                    int width = target.getWidth();
                    int height = target.getHeight();
                    if (width == 0 || height == 0) {
                        if (this.f۱۵۵۷۴e) {
                            Cu.m۱۸۴۱۵a(target, m۱۸۴۳۲e());
                        }
                        this.f۱۵۵۷۰a.m۱۸۴۰۲a(target, new ViewTreeObserver$OnPreDrawListenerCh(this, target, callback));
                        return;
                    }
                    this.f۱۵۵۷۱b.m۱۸۴۲۷a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            Cw request = m۱۸۴۳۱a(started);
            String requestKey = Cd0.m۱۸۳۱۸a(request);
            if (!EnumCp.m۱۸۳۸۲a(this.f۱۵۵۷۷h) || (bitmap = this.f۱۵۵۷۰a.m۱۸۳۹۶a(requestKey)) == null) {
                if (this.f۱۵۵۷۴e) {
                    Cu.m۱۸۴۱۵a(target, m۱۸۴۳۲e());
                }
                this.f۱۵۵۷۰a.m۱۸۴۰۳a(new Cl(this.f۱۵۵۷۰a, target, request, this.f۱۵۵۷۷h, this.f۱۵۵۷۸i, this.f۱۵۵۷۶g, this.f۱۵۵۸۰k, requestKey, this.f۱۵۵۸۱l, callback, this.f۱۵۵۷۲c));
                return;
            }
            this.f۱۵۵۷۰a.m۱۸۴۰۱a(target);
            Ct tVar = this.f۱۵۵۷۰a;
            Cu.m۱۸۴۱۴a(target, tVar.f۱۵۴۸۸e, bitmap, Ct.EnumCe.MEMORY, this.f۱۵۵۷۲c, tVar.f۱۵۴۹۶m);
            if (this.f۱۵۵۷۰a.f۱۵۴۹۷n) {
                String g = request.m۱۸۴۲۵g();
                Cd0.m۱۸۳۲۳a("Main", "completed", g, "from " + Ct.EnumCe.MEMORY);
            }
            if (callback != null) {
                callback.m۱۸۳۲۹a();
            }
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private Drawable m۱۸۴۳۲e() {
        int i = this.f۱۵۵۷۵f;
        if (i == 0) {
            return this.f۱۵۵۷۹j;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            return this.f۱۵۵۷۰a.f۱۵۴۸۸e.getDrawable(i);
        }
        if (i2 >= 16) {
            return this.f۱۵۵۷۰a.f۱۵۴۸۸e.getResources().getDrawable(this.f۱۵۵۷۵f);
        }
        TypedValue value = new TypedValue();
        this.f۱۵۵۷۰a.f۱۵۴۸۸e.getResources().getValue(this.f۱۵۵۷۵f, value, true);
        return this.f۱۵۵۷۰a.f۱۵۴۸۸e.getResources().getDrawable(value.resourceId);
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cw m۱۸۴۳۱a(long started) {
        int id = f۱۵۵۶۹m.getAndIncrement();
        Cw request = this.f۱۵۵۷۱b.m۱۸۴۲۸a();
        request.f۱۵۵۳۲a = id;
        request.f۱۵۵۳۳b = started;
        boolean loggingEnabled = this.f۱۵۵۷۰a.f۱۵۴۹۷n;
        if (loggingEnabled) {
            Cd0.m۱۸۳۲۳a("Main", "created", request.m۱۸۴۲۵g(), request.toString());
        }
        Cw transformed = this.f۱۵۵۷۰a.m۱۸۳۹۷a(request);
        if (transformed != request) {
            transformed.f۱۵۵۳۲a = id;
            transformed.f۱۵۵۳۳b = started;
            if (loggingEnabled) {
                String d = transformed.m۱۸۴۲۲d();
                Cd0.m۱۸۳۲۳a("Main", "changed", d, "into " + transformed);
            }
        }
        return transformed;
    }
}
