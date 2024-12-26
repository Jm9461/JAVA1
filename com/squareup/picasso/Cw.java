package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Ct;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.w  reason: invalid class name */
public final class Cw {

    /* renamed from: u  reason: contains not printable characters */
    private static final long f۱۵۵۳۱u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a  reason: contains not printable characters */
    int f۱۵۵۳۲a;

    /* renamed from: b  reason: contains not printable characters */
    long f۱۵۵۳۳b;

    /* renamed from: c  reason: contains not printable characters */
    int f۱۵۵۳۴c;

    /* renamed from: d  reason: contains not printable characters */
    public final Uri f۱۵۵۳۵d;

    /* renamed from: e  reason: contains not printable characters */
    public final int f۱۵۵۳۶e;

    /* renamed from: f  reason: contains not printable characters */
    public final String f۱۵۵۳۷f;

    /* renamed from: g  reason: contains not printable characters */
    public final List<AbstractCc0> f۱۵۵۳۸g;

    /* renamed from: h  reason: contains not printable characters */
    public final int f۱۵۵۳۹h;

    /* renamed from: i  reason: contains not printable characters */
    public final int f۱۵۵۴۰i;

    /* renamed from: j  reason: contains not printable characters */
    public final boolean f۱۵۵۴۱j;

    /* renamed from: k  reason: contains not printable characters */
    public final int f۱۵۵۴۲k;

    /* renamed from: l  reason: contains not printable characters */
    public final boolean f۱۵۵۴۳l;

    /* renamed from: m  reason: contains not printable characters */
    public final boolean f۱۵۵۴۴m;

    /* renamed from: n  reason: contains not printable characters */
    public final float f۱۵۵۴۵n;

    /* renamed from: o  reason: contains not printable characters */
    public final float f۱۵۵۴۶o;

    /* renamed from: p  reason: contains not printable characters */
    public final float f۱۵۵۴۷p;

    /* renamed from: q  reason: contains not printable characters */
    public final boolean f۱۵۵۴۸q;

    /* renamed from: r  reason: contains not printable characters */
    public final boolean f۱۵۵۴۹r;

    /* renamed from: s  reason: contains not printable characters */
    public final Bitmap.Config f۱۵۵۵۰s;

    /* renamed from: t  reason: contains not printable characters */
    public final Ct.EnumCf f۱۵۵۵۱t;

    private Cw(Uri uri, int resourceId, String stableKey, List<AbstractCc0> list, int targetWidth, int targetHeight, boolean centerCrop, boolean centerInside, int centerCropGravity, boolean onlyScaleDown, float rotationDegrees, float rotationPivotX, float rotationPivotY, boolean hasRotationPivot, boolean purgeable, Bitmap.Config config, Ct.EnumCf priority) {
        this.f۱۵۵۳۵d = uri;
        this.f۱۵۵۳۶e = resourceId;
        this.f۱۵۵۳۷f = stableKey;
        if (list == null) {
            this.f۱۵۵۳۸g = null;
        } else {
            this.f۱۵۵۳۸g = Collections.unmodifiableList(list);
        }
        this.f۱۵۵۳۹h = targetWidth;
        this.f۱۵۵۴۰i = targetHeight;
        this.f۱۵۵۴۱j = centerCrop;
        this.f۱۵۵۴۳l = centerInside;
        this.f۱۵۵۴۲k = centerCropGravity;
        this.f۱۵۵۴۴m = onlyScaleDown;
        this.f۱۵۵۴۵n = rotationDegrees;
        this.f۱۵۵۴۶o = rotationPivotX;
        this.f۱۵۵۴۷p = rotationPivotY;
        this.f۱۵۵۴۸q = hasRotationPivot;
        this.f۱۵۵۴۹r = purgeable;
        this.f۱۵۵۵۰s = config;
        this.f۱۵۵۵۱t = priority;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("Request{");
        int i = this.f۱۵۵۳۶e;
        if (i > 0) {
            builder.append(i);
        } else {
            builder.append(this.f۱۵۵۳۵d);
        }
        List<AbstractCc0> list = this.f۱۵۵۳۸g;
        if (list != null && !list.isEmpty()) {
            for (AbstractCc0 transformation : this.f۱۵۵۳۸g) {
                builder.append(' ');
                builder.append(transformation.m۱۸۳۰۲a());
            }
        }
        if (this.f۱۵۵۳۷f != null) {
            builder.append(" stableKey(");
            builder.append(this.f۱۵۵۳۷f);
            builder.append(')');
        }
        if (this.f۱۵۵۳۹h > 0) {
            builder.append(" resize(");
            builder.append(this.f۱۵۵۳۹h);
            builder.append(',');
            builder.append(this.f۱۵۵۴۰i);
            builder.append(')');
        }
        if (this.f۱۵۵۴۱j) {
            builder.append(" centerCrop");
        }
        if (this.f۱۵۵۴۳l) {
            builder.append(" centerInside");
        }
        if (this.f۱۵۵۴۵n != 0.0f) {
            builder.append(" rotation(");
            builder.append(this.f۱۵۵۴۵n);
            if (this.f۱۵۵۴۸q) {
                builder.append(" @ ");
                builder.append(this.f۱۵۵۴۶o);
                builder.append(',');
                builder.append(this.f۱۵۵۴۷p);
            }
            builder.append(')');
        }
        if (this.f۱۵۵۴۹r) {
            builder.append(" purgeable");
        }
        if (this.f۱۵۵۵۰s != null) {
            builder.append(' ');
            builder.append(this.f۱۵۵۵۰s);
        }
        builder.append('}');
        return builder.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d  reason: contains not printable characters */
    public String m۱۸۴۲۲d() {
        long delta = System.nanoTime() - this.f۱۵۵۳۳b;
        if (delta > f۱۵۵۳۱u) {
            return m۱۸۴۲۵g() + '+' + TimeUnit.NANOSECONDS.toSeconds(delta) + 's';
        }
        return m۱۸۴۲۵g() + '+' + TimeUnit.NANOSECONDS.toMillis(delta) + "ms";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g  reason: contains not printable characters */
    public String m۱۸۴۲۵g() {
        return "[R" + this.f۱۵۵۳۲a + ']';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public String m۱۸۴۱۹a() {
        Uri uri = this.f۱۵۵۳۵d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f۱۵۵۳۶e);
    }

    /* renamed from: c  reason: contains not printable characters */
    public boolean m۱۸۴۲۱c() {
        return (this.f۱۵۵۳۹h == 0 && this.f۱۵۵۴۰i == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f  reason: contains not printable characters */
    public boolean m۱۸۴۲۴f() {
        return m۱۸۴۲۳e() || m۱۸۴۲۰b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۸۴۲۳e() {
        return m۱۸۴۲۱c() || this.f۱۵۵۴۵n != 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۸۴۲۰b() {
        return this.f۱۵۵۳۸g != null;
    }

    /* renamed from: com.squareup.picasso.w$b  reason: invalid class name */
    public static final class Cb {

        /* renamed from: a  reason: contains not printable characters */
        private Uri f۱۵۵۵۲a;

        /* renamed from: b  reason: contains not printable characters */
        private int f۱۵۵۵۳b;

        /* renamed from: c  reason: contains not printable characters */
        private String f۱۵۵۵۴c;

        /* renamed from: d  reason: contains not printable characters */
        private int f۱۵۵۵۵d;

        /* renamed from: e  reason: contains not printable characters */
        private int f۱۵۵۵۶e;

        /* renamed from: f  reason: contains not printable characters */
        private boolean f۱۵۵۵۷f;

        /* renamed from: g  reason: contains not printable characters */
        private int f۱۵۵۵۸g;

        /* renamed from: h  reason: contains not printable characters */
        private boolean f۱۵۵۵۹h;

        /* renamed from: i  reason: contains not printable characters */
        private boolean f۱۵۵۶۰i;

        /* renamed from: j  reason: contains not printable characters */
        private float f۱۵۵۶۱j;

        /* renamed from: k  reason: contains not printable characters */
        private float f۱۵۵۶۲k;

        /* renamed from: l  reason: contains not printable characters */
        private float f۱۵۵۶۳l;

        /* renamed from: m  reason: contains not printable characters */
        private boolean f۱۵۵۶۴m;

        /* renamed from: n  reason: contains not printable characters */
        private boolean f۱۵۵۶۵n;

        /* renamed from: o  reason: contains not printable characters */
        private List<AbstractCc0> f۱۵۵۶۶o;

        /* renamed from: p  reason: contains not printable characters */
        private Bitmap.Config f۱۵۵۶۷p;

        /* renamed from: q  reason: contains not printable characters */
        private Ct.EnumCf f۱۵۵۶۸q;

        Cb(Uri uri, int resourceId, Bitmap.Config bitmapConfig) {
            this.f۱۵۵۵۲a = uri;
            this.f۱۵۵۵۳b = resourceId;
            this.f۱۵۵۶۷p = bitmapConfig;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۸۴۲۹b() {
            return (this.f۱۵۵۵۲a == null && this.f۱۵۵۵۳b == 0) ? false : true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public boolean m۱۸۴۳۰c() {
            return (this.f۱۵۵۵۵d == 0 && this.f۱۵۵۵۶e == 0) ? false : true;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۸۴۲۷a(int targetWidth, int targetHeight) {
            if (targetWidth < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (targetHeight < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (targetHeight == 0 && targetWidth == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f۱۵۵۵۵d = targetWidth;
                this.f۱۵۵۵۶e = targetHeight;
                return this;
            }
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۸۴۲۶a(int alignGravity) {
            if (!this.f۱۵۵۵۹h) {
                this.f۱۵۵۵۷f = true;
                this.f۱۵۵۵۸g = alignGravity;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cw m۱۸۴۲۸a() {
            if (this.f۱۵۵۵۹h && this.f۱۵۵۵۷f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f۱۵۵۵۷f && this.f۱۵۵۵۵d == 0 && this.f۱۵۵۵۶e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (this.f۱۵۵۵۹h && this.f۱۵۵۵۵d == 0 && this.f۱۵۵۵۶e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f۱۵۵۶۸q == null) {
                    this.f۱۵۵۶۸q = Ct.EnumCf.NORMAL;
                }
                return new Cw(this.f۱۵۵۵۲a, this.f۱۵۵۵۳b, this.f۱۵۵۵۴c, this.f۱۵۵۶۶o, this.f۱۵۵۵۵d, this.f۱۵۵۵۶e, this.f۱۵۵۵۷f, this.f۱۵۵۵۹h, this.f۱۵۵۵۸g, this.f۱۵۵۶۰i, this.f۱۵۵۶۱j, this.f۱۵۵۶۲k, this.f۱۵۵۶۳l, this.f۱۵۵۶۴m, this.f۱۵۵۶۵n, this.f۱۵۵۶۷p, this.f۱۵۵۶۸q);
            }
        }
    }
}
