package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.t;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class w {
    private static final long u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a  reason: collision with root package name */
    int f۳۶۲۳a;

    /* renamed from: b  reason: collision with root package name */
    long f۳۶۲۴b;

    /* renamed from: c  reason: collision with root package name */
    int f۳۶۲۵c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f۳۶۲۶d;

    /* renamed from: e  reason: collision with root package name */
    public final int f۳۶۲۷e;

    /* renamed from: f  reason: collision with root package name */
    public final String f۳۶۲۸f;

    /* renamed from: g  reason: collision with root package name */
    public final List<c0> f۳۶۲۹g;

    /* renamed from: h  reason: collision with root package name */
    public final int f۳۶۳۰h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final float n;
    public final float o;
    public final float p;
    public final boolean q;
    public final boolean r;
    public final Bitmap.Config s;
    public final t.f t;

    private w(Uri uri, int resourceId, String stableKey, List<c0> list, int targetWidth, int targetHeight, boolean centerCrop, boolean centerInside, int centerCropGravity, boolean onlyScaleDown, float rotationDegrees, float rotationPivotX, float rotationPivotY, boolean hasRotationPivot, boolean purgeable, Bitmap.Config config, t.f priority) {
        this.f۳۶۲۶d = uri;
        this.f۳۶۲۷e = resourceId;
        this.f۳۶۲۸f = stableKey;
        if (list == null) {
            this.f۳۶۲۹g = null;
        } else {
            this.f۳۶۲۹g = Collections.unmodifiableList(list);
        }
        this.f۳۶۳۰h = targetWidth;
        this.i = targetHeight;
        this.j = centerCrop;
        this.l = centerInside;
        this.k = centerCropGravity;
        this.m = onlyScaleDown;
        this.n = rotationDegrees;
        this.o = rotationPivotX;
        this.p = rotationPivotY;
        this.q = hasRotationPivot;
        this.r = purgeable;
        this.s = config;
        this.t = priority;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("Request{");
        int i2 = this.f۳۶۲۷e;
        if (i2 > 0) {
            builder.append(i2);
        } else {
            builder.append(this.f۳۶۲۶d);
        }
        List<c0> list = this.f۳۶۲۹g;
        if (list != null && !list.isEmpty()) {
            for (c0 transformation : this.f۳۶۲۹g) {
                builder.append(' ');
                builder.append(transformation.a());
            }
        }
        if (this.f۳۶۲۸f != null) {
            builder.append(" stableKey(");
            builder.append(this.f۳۶۲۸f);
            builder.append(')');
        }
        if (this.f۳۶۳۰h > 0) {
            builder.append(" resize(");
            builder.append(this.f۳۶۳۰h);
            builder.append(',');
            builder.append(this.i);
            builder.append(')');
        }
        if (this.j) {
            builder.append(" centerCrop");
        }
        if (this.l) {
            builder.append(" centerInside");
        }
        if (this.n != 0.0f) {
            builder.append(" rotation(");
            builder.append(this.n);
            if (this.q) {
                builder.append(" @ ");
                builder.append(this.o);
                builder.append(',');
                builder.append(this.p);
            }
            builder.append(')');
        }
        if (this.r) {
            builder.append(" purgeable");
        }
        if (this.s != null) {
            builder.append(' ');
            builder.append(this.s);
        }
        builder.append('}');
        return builder.toString();
    }

    /* access modifiers changed from: package-private */
    public String d() {
        long delta = System.nanoTime() - this.f۳۶۲۴b;
        if (delta > u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(delta) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(delta) + "ms";
    }

    /* access modifiers changed from: package-private */
    public String g() {
        return "[R" + this.f۳۶۲۳a + ']';
    }

    /* access modifiers changed from: package-private */
    public String a() {
        Uri uri = this.f۳۶۲۶d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f۳۶۲۷e);
    }

    public boolean c() {
        return (this.f۳۶۳۰h == 0 && this.i == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return e() || b();
    }

    /* access modifiers changed from: package-private */
    public boolean e() {
        return c() || this.n != 0.0f;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f۳۶۲۹g != null;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private Uri f۳۶۳۱a;

        /* renamed from: b  reason: collision with root package name */
        private int f۳۶۳۲b;

        /* renamed from: c  reason: collision with root package name */
        private String f۳۶۳۳c;

        /* renamed from: d  reason: collision with root package name */
        private int f۳۶۳۴d;

        /* renamed from: e  reason: collision with root package name */
        private int f۳۶۳۵e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f۳۶۳۶f;

        /* renamed from: g  reason: collision with root package name */
        private int f۳۶۳۷g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f۳۶۳۸h;
        private boolean i;
        private float j;
        private float k;
        private float l;
        private boolean m;
        private boolean n;
        private List<c0> o;
        private Bitmap.Config p;
        private t.f q;

        b(Uri uri, int resourceId, Bitmap.Config bitmapConfig) {
            this.f۳۶۳۱a = uri;
            this.f۳۶۳۲b = resourceId;
            this.p = bitmapConfig;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return (this.f۳۶۳۱a == null && this.f۳۶۳۲b == 0) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return (this.f۳۶۳۴d == 0 && this.f۳۶۳۵e == 0) ? false : true;
        }

        public b a(int targetWidth, int targetHeight) {
            if (targetWidth < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (targetHeight < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (targetHeight == 0 && targetWidth == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f۳۶۳۴d = targetWidth;
                this.f۳۶۳۵e = targetHeight;
                return this;
            }
        }

        public b a(int alignGravity) {
            if (!this.f۳۶۳۸h) {
                this.f۳۶۳۶f = true;
                this.f۳۶۳۷g = alignGravity;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        public w a() {
            if (this.f۳۶۳۸h && this.f۳۶۳۶f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f۳۶۳۶f && this.f۳۶۳۴d == 0 && this.f۳۶۳۵e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f۳۶۳۸h && this.f۳۶۳۴d == 0 && this.f۳۶۳۵e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.q == null) {
                    this.q = t.f.NORMAL;
                }
                return new w(this.f۳۶۳۱a, this.f۳۶۳۲b, this.f۳۶۳۳c, this.o, this.f۳۶۳۴d, this.f۳۶۳۵e, this.f۳۶۳۶f, this.f۳۶۳۸h, this.f۳۶۳۷g, this.i, this.j, this.k, this.l, this.m, this.n, this.p, this.q);
            }
        }
    }
}
