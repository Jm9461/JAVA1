package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.graphics.drawable.Ca;
import android.util.SparseArray;

/* renamed from: a.b.h.d.a.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cb extends Drawable implements Drawable.Callback {

    /* renamed from: c, reason: contains not printable characters */
    private c f۸۸۱۲c;

    /* renamed from: d, reason: contains not printable characters */
    private Rect f۸۸۱۳d;

    /* renamed from: e, reason: contains not printable characters */
    private Drawable f۸۸۱۴e;

    /* renamed from: f, reason: contains not printable characters */
    private Drawable f۸۸۱۵f;

    /* renamed from: h, reason: contains not printable characters */
    private boolean f۸۸۱۷h;

    /* renamed from: j, reason: contains not printable characters */
    private boolean f۸۸۱۹j;

    /* renamed from: k, reason: contains not printable characters */
    private Runnable f۸۸۲۰k;

    /* renamed from: l, reason: contains not printable characters */
    private long f۸۸۲۱l;

    /* renamed from: m, reason: contains not printable characters */
    private long f۸۸۲۲m;

    /* renamed from: n, reason: contains not printable characters */
    private b f۸۸۲۳n;

    /* renamed from: g, reason: contains not printable characters */
    private int f۸۸۱۶g = 255;

    /* renamed from: i, reason: contains not printable characters */
    private int f۸۸۱۸i = -1;

    /* renamed from: a, reason: contains not printable characters */
    c mo۸۶۸۸a() {
        throw null;
    }

    Cb() {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f۸۸۱۵f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f۸۸۱۲c.getChangingConfigurations();
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: c, reason: contains not printable characters */
    private boolean m۸۶۴۴c() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        boolean result;
        Rect r = this.f۸۸۱۲c.m۸۶۷۲h();
        if (r != null) {
            padding.set(r);
            result = (((r.left | r.top) | r.bottom) | r.right) != 0;
        } else {
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                result = drawable.getPadding(padding);
            } else {
                result = super.getPadding(padding);
            }
        }
        if (m۸۶۴۴c()) {
            int left = padding.left;
            int right = padding.right;
            padding.left = right;
            padding.right = left;
        }
        return result;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        if (!this.f۸۸۱۷h || this.f۸۸۱۶g != alpha) {
            this.f۸۸۱۷h = true;
            this.f۸۸۱۶g = alpha;
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                if (this.f۸۸۲۱l == 0) {
                    drawable.setAlpha(alpha);
                } else {
                    m۸۶۴۸a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f۸۸۱۶g;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean dither) {
        c cVar = this.f۸۸۱۲c;
        if (cVar.f۸۸۵۸x != dither) {
            cVar.f۸۸۵۸x = dither;
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                drawable.setDither(cVar.f۸۸۵۸x);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f۸۸۱۲c;
        cVar.f۸۸۳۰E = true;
        if (cVar.f۸۸۲۹D != colorFilter) {
            cVar.f۸۸۲۹D = colorFilter;
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        c cVar = this.f۸۸۱۲c;
        cVar.f۸۸۳۳H = true;
        if (cVar.f۸۸۳۱F != tint) {
            cVar.f۸۸۳۱F = tint;
            Ca.m۱۰۶۳۸a(this.f۸۸۱۴e, tint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        c cVar = this.f۸۸۱۲c;
        cVar.f۸۸۳۴I = true;
        if (cVar.f۸۸۳۲G != tintMode) {
            cVar.f۸۸۳۲G = tintMode;
            Ca.m۱۰۶۴۱a(this.f۸۸۱۴e, tintMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۸۸۱۵f;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        Drawable drawable2 = this.f۸۸۱۴e;
        if (drawable2 != null) {
            drawable2.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean mirrored) {
        c cVar = this.f۸۸۱۲c;
        if (cVar.f۸۸۲۸C != mirrored) {
            cVar.f۸۸۲۸C = mirrored;
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                Ca.m۱۰۶۴۲a(drawable, cVar.f۸۸۲۸C);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f۸۸۱۲c.f۸۸۲۸C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean changed = false;
        Drawable drawable = this.f۸۸۱۵f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f۸۸۱۵f = null;
            changed = true;
        }
        Drawable drawable2 = this.f۸۸۱۴e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f۸۸۱۷h) {
                this.f۸۸۱۴e.setAlpha(this.f۸۸۱۶g);
            }
        }
        if (this.f۸۸۲۲m != 0) {
            this.f۸۸۲۲m = 0L;
            changed = true;
        }
        if (this.f۸۸۲۱l != 0) {
            this.f۸۸۲۱l = 0L;
            changed = true;
        }
        if (changed) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float x, float y) {
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            Ca.m۱۰۶۳۶a(drawable, x, y);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Rect rect = this.f۸۸۱۳d;
        if (rect == null) {
            this.f۸۸۱۳d = new Rect(left, top, right, bottom);
        } else {
            rect.set(left, top, right, bottom);
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            Ca.m۱۰۶۳۷a(drawable, left, top, right, bottom);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect outRect) {
        Rect rect = this.f۸۸۱۳d;
        if (rect != null) {
            outRect.set(rect);
        } else {
            super.getHotspotBounds(outRect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        Drawable drawable = this.f۸۸۱۵f;
        if (drawable != null) {
            return drawable.setState(state);
        }
        Drawable drawable2 = this.f۸۸۱۴e;
        if (drawable2 != null) {
            return drawable2.setState(state);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int level) {
        Drawable drawable = this.f۸۸۱۵f;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        Drawable drawable2 = this.f۸۸۱۴e;
        if (drawable2 != null) {
            return drawable2.setLevel(level);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int layoutDirection) {
        return this.f۸۸۱۲c.m۸۶۶۵b(layoutDirection, m۸۶۵۰b());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f۸۸۱۲c.m۸۶۷۶l()) {
            return this.f۸۸۱۲c.m۸۶۷۳i();
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f۸۸۱۲c.m۸۶۷۶l()) {
            return this.f۸۸۱۲c.m۸۶۶۹e();
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f۸۸۱۲c.m۸۶۷۶l()) {
            return this.f۸۸۱۲c.m۸۶۷۱g();
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f۸۸۱۲c.m۸۶۷۶l()) {
            return this.f۸۸۱۲c.m۸۶۷۰f();
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        c cVar = this.f۸۸۱۲c;
        if (cVar != null) {
            cVar.m۸۶۷۵k();
        }
        if (who == this.f۸۸۱۴e && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        if (who == this.f۸۸۱۴e && getCallback() != null) {
            getCallback().scheduleDrawable(this, what, when);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
        if (who == this.f۸۸۱۴e && getCallback() != null) {
            getCallback().unscheduleDrawable(this, what);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        Drawable drawable = this.f۸۸۱۵f;
        if (drawable != null) {
            drawable.setVisible(visible, restart);
        }
        Drawable drawable2 = this.f۸۸۱۴e;
        if (drawable2 != null) {
            drawable2.setVisible(visible, restart);
        }
        return changed;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f۸۸۱۲c.m۸۶۷۴j();
    }

    /* renamed from: b, reason: contains not printable characters */
    int m۸۶۵۰b() {
        return this.f۸۸۱۸i;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* renamed from: a, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m۸۶۴۹a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f۸۸۱۸i
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            a.b.h.d.a.b$c r0 = r9.f۸۸۱۲c
            int r0 = r0.f۸۸۲۷B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L30
            android.graphics.drawable.Drawable r0 = r9.f۸۸۱۵f
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f۸۸۱۴e
            if (r0 == 0) goto L2a
            r9.f۸۸۱۵f = r0
            a.b.h.d.a.b$c r0 = r9.f۸۸۱۲c
            int r0 = r0.f۸۸۲۷B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f۸۸۲۲m = r0
            goto L37
        L2a:
            r9.f۸۸۱۵f = r4
            r9.f۸۸۲۲m = r5
            goto L37
        L30:
            android.graphics.drawable.Drawable r0 = r9.f۸۸۱۴e
            if (r0 == 0) goto L37
            r0.setVisible(r1, r1)
        L37:
            if (r10 < 0) goto L57
            a.b.h.d.a.b$c r0 = r9.f۸۸۱۲c
            int r1 = r0.f۸۸۴۲h
            if (r10 >= r1) goto L57
            android.graphics.drawable.Drawable r0 = r0.m۸۶۵۶a(r10)
            r9.f۸۸۱۴e = r0
            r9.f۸۸۱۸i = r10
            if (r0 == 0) goto L56
            a.b.h.d.a.b$c r1 = r9.f۸۸۱۲c
            int r1 = r1.f۸۸۲۶A
            if (r1 <= 0) goto L53
            long r7 = (long) r1
            long r7 = r7 + r2
            r9.f۸۸۲۱l = r7
        L53:
            r9.m۸۶۴۳a(r0)
        L56:
            goto L5c
        L57:
            r9.f۸۸۱۴e = r4
            r0 = -1
            r9.f۸۸۱۸i = r0
        L5c:
            long r0 = r9.f۸۸۲۱l
            r4 = 1
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 != 0) goto L69
            long r0 = r9.f۸۸۲۲m
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 == 0) goto L7b
        L69:
            java.lang.Runnable r0 = r9.f۸۸۲۰k
            if (r0 != 0) goto L75
            a.b.h.d.a.b$a r0 = new a.b.h.d.a.b$a
            r0.<init>()
            r9.f۸۸۲۰k = r0
            goto L78
        L75:
            r9.unscheduleSelf(r0)
        L78:
            r9.m۸۶۴۸a(r4)
        L7b:
            r9.invalidateSelf()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a.Cb.m۸۶۴۹a(int):boolean");
    }

    /* renamed from: a.b.h.d.a.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Cb.this.m۸۶۴۸a(true);
            Cb.this.invalidateSelf();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۸۶۴۳a(Drawable d2) {
        if (this.f۸۸۲۳n == null) {
            this.f۸۸۲۳n = new b();
        }
        b bVar = this.f۸۸۲۳n;
        bVar.m۸۶۵۱a(d2.getCallback());
        d2.setCallback(bVar);
        try {
            if (this.f۸۸۱۲c.f۸۸۲۶A <= 0 && this.f۸۸۱۷h) {
                d2.setAlpha(this.f۸۸۱۶g);
            }
            if (this.f۸۸۱۲c.f۸۸۳۰E) {
                d2.setColorFilter(this.f۸۸۱۲c.f۸۸۲۹D);
            } else {
                if (this.f۸۸۱۲c.f۸۸۳۳H) {
                    Ca.m۱۰۶۳۸a(d2, this.f۸۸۱۲c.f۸۸۳۱F);
                }
                if (this.f۸۸۱۲c.f۸۸۳۴I) {
                    Ca.m۱۰۶۴۱a(d2, this.f۸۸۱۲c.f۸۸۳۲G);
                }
            }
            d2.setVisible(isVisible(), true);
            d2.setDither(this.f۸۸۱۲c.f۸۸۵۸x);
            d2.setState(getState());
            d2.setLevel(getLevel());
            d2.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                d2.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                d2.setAutoMirrored(this.f۸۸۱۲c.f۸۸۲۸C);
            }
            Rect hotspotBounds = this.f۸۸۱۳d;
            if (Build.VERSION.SDK_INT >= 21 && hotspotBounds != null) {
                d2.setHotspotBounds(hotspotBounds.left, hotspotBounds.top, hotspotBounds.right, hotspotBounds.bottom);
            }
        } finally {
            d2.setCallback(this.f۸۸۲۳n.m۸۶۵۲a());
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    void m۸۶۴۸a(boolean schedule) {
        this.f۸۸۱۷h = true;
        long now = SystemClock.uptimeMillis();
        boolean animating = false;
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            long j = this.f۸۸۲۱l;
            if (j != 0) {
                if (j <= now) {
                    drawable.setAlpha(this.f۸۸۱۶g);
                    this.f۸۸۲۱l = 0L;
                } else {
                    int animAlpha = ((int) ((j - now) * 255)) / this.f۸۸۱۲c.f۸۸۲۶A;
                    drawable.setAlpha(((255 - animAlpha) * this.f۸۸۱۶g) / 255);
                    animating = true;
                }
            }
        } else {
            this.f۸۸۲۱l = 0L;
        }
        Drawable drawable2 = this.f۸۸۱۵f;
        if (drawable2 != null) {
            long j2 = this.f۸۸۲۲m;
            if (j2 != 0) {
                if (j2 <= now) {
                    drawable2.setVisible(false, false);
                    this.f۸۸۱۵f = null;
                    this.f۸۸۲۲m = 0L;
                } else {
                    int animAlpha2 = ((int) ((j2 - now) * 255)) / this.f۸۸۱۲c.f۸۸۲۷B;
                    drawable2.setAlpha((this.f۸۸۱۶g * animAlpha2) / 255);
                    animating = true;
                }
            }
        } else {
            this.f۸۸۲۲m = 0L;
        }
        if (schedule && animating) {
            scheduleSelf(this.f۸۸۲۰k, 16 + now);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f۸۸۱۴e;
    }

    /* renamed from: a, reason: contains not printable characters */
    final void m۸۶۴۷a(Resources res) {
        this.f۸۸۱۲c.m۸۶۵۹a(res);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f۸۸۱۲c.m۸۶۵۸a(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f۸۸۱۲c.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f۸۸۱۲c.m۸۶۶۱a()) {
            this.f۸۸۱۲c.f۸۸۳۸d = getChangingConfigurations();
            return this.f۸۸۱۲c;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f۸۸۱۹j && super.mutate() == this) {
            c clone = mo۸۶۸۸a();
            clone.mo۸۶۹۴m();
            mo۸۶۸۹a(clone);
            this.f۸۸۱۹j = true;
        }
        return this;
    }

    /* renamed from: a.b.h.d.a.b$c */
    static abstract class c extends Drawable.ConstantState {

        /* renamed from: A, reason: contains not printable characters */
        int f۸۸۲۶A;

        /* renamed from: B, reason: contains not printable characters */
        int f۸۸۲۷B;

        /* renamed from: C, reason: contains not printable characters */
        boolean f۸۸۲۸C;

        /* renamed from: D, reason: contains not printable characters */
        ColorFilter f۸۸۲۹D;

        /* renamed from: E, reason: contains not printable characters */
        boolean f۸۸۳۰E;

        /* renamed from: F, reason: contains not printable characters */
        ColorStateList f۸۸۳۱F;

        /* renamed from: G, reason: contains not printable characters */
        PorterDuff.Mode f۸۸۳۲G;

        /* renamed from: H, reason: contains not printable characters */
        boolean f۸۸۳۳H;

        /* renamed from: I, reason: contains not printable characters */
        boolean f۸۸۳۴I;

        /* renamed from: a, reason: contains not printable characters */
        final Cb f۸۸۳۵a;

        /* renamed from: b, reason: contains not printable characters */
        Resources f۸۸۳۶b;

        /* renamed from: c, reason: contains not printable characters */
        int f۸۸۳۷c;

        /* renamed from: d, reason: contains not printable characters */
        int f۸۸۳۸d;

        /* renamed from: e, reason: contains not printable characters */
        int f۸۸۳۹e;

        /* renamed from: f, reason: contains not printable characters */
        SparseArray<Drawable.ConstantState> f۸۸۴۰f;

        /* renamed from: g, reason: contains not printable characters */
        Drawable[] f۸۸۴۱g;

        /* renamed from: h, reason: contains not printable characters */
        int f۸۸۴۲h;

        /* renamed from: i, reason: contains not printable characters */
        boolean f۸۸۴۳i;

        /* renamed from: j, reason: contains not printable characters */
        boolean f۸۸۴۴j;

        /* renamed from: k, reason: contains not printable characters */
        Rect f۸۸۴۵k;

        /* renamed from: l, reason: contains not printable characters */
        boolean f۸۸۴۶l;

        /* renamed from: m, reason: contains not printable characters */
        boolean f۸۸۴۷m;

        /* renamed from: n, reason: contains not printable characters */
        int f۸۸۴۸n;

        /* renamed from: o, reason: contains not printable characters */
        int f۸۸۴۹o;

        /* renamed from: p, reason: contains not printable characters */
        int f۸۸۵۰p;

        /* renamed from: q, reason: contains not printable characters */
        int f۸۸۵۱q;

        /* renamed from: r, reason: contains not printable characters */
        boolean f۸۸۵۲r;

        /* renamed from: s, reason: contains not printable characters */
        int f۸۸۵۳s;

        /* renamed from: t, reason: contains not printable characters */
        boolean f۸۸۵۴t;

        /* renamed from: u, reason: contains not printable characters */
        boolean f۸۸۵۵u;

        /* renamed from: v, reason: contains not printable characters */
        boolean f۸۸۵۶v;

        /* renamed from: w, reason: contains not printable characters */
        boolean f۸۸۵۷w;

        /* renamed from: x, reason: contains not printable characters */
        boolean f۸۸۵۸x;

        /* renamed from: y, reason: contains not printable characters */
        boolean f۸۸۵۹y;

        /* renamed from: z, reason: contains not printable characters */
        int f۸۸۶۰z;

        /* renamed from: m, reason: contains not printable characters */
        abstract void mo۸۶۹۴m();

        c(c orig, Cb owner, Resources res) {
            this.f۸۸۳۷c = 160;
            this.f۸۸۴۳i = false;
            this.f۸۸۴۶l = false;
            this.f۸۸۵۸x = true;
            this.f۸۸۲۶A = 0;
            this.f۸۸۲۷B = 0;
            this.f۸۸۳۵a = owner;
            this.f۸۸۳۶b = res != null ? res : orig != null ? orig.f۸۸۳۶b : null;
            this.f۸۸۳۷c = Cb.m۸۶۴۲a(res, orig != null ? orig.f۸۸۳۷c : 0);
            if (orig != null) {
                this.f۸۸۳۸d = orig.f۸۸۳۸d;
                this.f۸۸۳۹e = orig.f۸۸۳۹e;
                this.f۸۸۵۶v = true;
                this.f۸۸۵۷w = true;
                this.f۸۸۴۳i = orig.f۸۸۴۳i;
                this.f۸۸۴۶l = orig.f۸۸۴۶l;
                this.f۸۸۵۸x = orig.f۸۸۵۸x;
                this.f۸۸۵۹y = orig.f۸۸۵۹y;
                this.f۸۸۶۰z = orig.f۸۸۶۰z;
                this.f۸۸۲۶A = orig.f۸۸۲۶A;
                this.f۸۸۲۷B = orig.f۸۸۲۷B;
                this.f۸۸۲۸C = orig.f۸۸۲۸C;
                this.f۸۸۲۹D = orig.f۸۸۲۹D;
                this.f۸۸۳۰E = orig.f۸۸۳۰E;
                this.f۸۸۳۱F = orig.f۸۸۳۱F;
                this.f۸۸۳۲G = orig.f۸۸۳۲G;
                this.f۸۸۳۳H = orig.f۸۸۳۳H;
                this.f۸۸۳۴I = orig.f۸۸۳۴I;
                if (orig.f۸۸۳۷c == this.f۸۸۳۷c) {
                    if (orig.f۸۸۴۴j) {
                        this.f۸۸۴۵k = new Rect(orig.f۸۸۴۵k);
                        this.f۸۸۴۴j = true;
                    }
                    if (orig.f۸۸۴۷m) {
                        this.f۸۸۴۸n = orig.f۸۸۴۸n;
                        this.f۸۸۴۹o = orig.f۸۸۴۹o;
                        this.f۸۸۵۰p = orig.f۸۸۵۰p;
                        this.f۸۸۵۱q = orig.f۸۸۵۱q;
                        this.f۸۸۴۷m = true;
                    }
                }
                if (orig.f۸۸۵۲r) {
                    this.f۸۸۵۳s = orig.f۸۸۵۳s;
                    this.f۸۸۵۲r = true;
                }
                if (orig.f۸۸۵۴t) {
                    this.f۸۸۵۵u = orig.f۸۸۵۵u;
                    this.f۸۸۵۴t = true;
                }
                Drawable[] origDr = orig.f۸۸۴۱g;
                this.f۸۸۴۱g = new Drawable[origDr.length];
                this.f۸۸۴۲h = orig.f۸۸۴۲h;
                SparseArray<Drawable.ConstantState> origDf = orig.f۸۸۴۰f;
                if (origDf != null) {
                    this.f۸۸۴۰f = origDf.clone();
                } else {
                    this.f۸۸۴۰f = new SparseArray<>(this.f۸۸۴۲h);
                }
                int count = this.f۸۸۴۲h;
                for (int i = 0; i < count; i++) {
                    if (origDr[i] != null) {
                        Drawable.ConstantState cs = origDr[i].getConstantState();
                        if (cs != null) {
                            this.f۸۸۴۰f.put(i, cs);
                        } else {
                            this.f۸۸۴۱g[i] = origDr[i];
                        }
                    }
                }
                return;
            }
            this.f۸۸۴۱g = new Drawable[10];
            this.f۸۸۴۲h = 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f۸۸۳۸d | this.f۸۸۳۹e;
        }

        /* renamed from: a, reason: contains not printable characters */
        public final int m۸۶۵۵a(Drawable dr) {
            int pos = this.f۸۸۴۲h;
            if (pos >= this.f۸۸۴۱g.length) {
                mo۸۶۹۳a(pos, pos + 10);
            }
            dr.mutate();
            dr.setVisible(false, true);
            dr.setCallback(this.f۸۸۳۵a);
            this.f۸۸۴۱g[pos] = dr;
            this.f۸۸۴۲h++;
            this.f۸۸۳۹e |= dr.getChangingConfigurations();
            m۸۶۷۵k();
            this.f۸۸۴۵k = null;
            this.f۸۸۴۴j = false;
            this.f۸۸۴۷m = false;
            this.f۸۸۵۶v = false;
            return pos;
        }

        /* renamed from: k, reason: contains not printable characters */
        void m۸۶۷۵k() {
            this.f۸۸۵۲r = false;
            this.f۸۸۵۴t = false;
        }

        /* renamed from: c, reason: contains not printable characters */
        final int m۸۶۶۶c() {
            return this.f۸۸۴۱g.length;
        }

        /* renamed from: n, reason: contains not printable characters */
        private void m۸۶۵۴n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f۸۸۴۰f;
            if (sparseArray != null) {
                int futureCount = sparseArray.size();
                for (int keyIndex = 0; keyIndex < futureCount; keyIndex++) {
                    int index = this.f۸۸۴۰f.keyAt(keyIndex);
                    Drawable.ConstantState cs = this.f۸۸۴۰f.valueAt(keyIndex);
                    this.f۸۸۴۱g[index] = m۸۶۵۳b(cs.newDrawable(this.f۸۸۳۶b));
                }
                this.f۸۸۴۰f = null;
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        private Drawable m۸۶۵۳b(Drawable child) {
            if (Build.VERSION.SDK_INT >= 23) {
                child.setLayoutDirection(this.f۸۸۶۰z);
            }
            Drawable child2 = child.mutate();
            child2.setCallback(this.f۸۸۳۵a);
            return child2;
        }

        /* renamed from: d, reason: contains not printable characters */
        public final int m۸۶۶۸d() {
            return this.f۸۸۴۲h;
        }

        /* renamed from: a, reason: contains not printable characters */
        public final Drawable m۸۶۵۶a(int index) {
            int keyIndex;
            Drawable result = this.f۸۸۴۱g[index];
            if (result != null) {
                return result;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f۸۸۴۰f;
            if (sparseArray == null || (keyIndex = sparseArray.indexOfKey(index)) < 0) {
                return null;
            }
            Drawable.ConstantState cs = this.f۸۸۴۰f.valueAt(keyIndex);
            Drawable prepared = m۸۶۵۳b(cs.newDrawable(this.f۸۸۳۶b));
            this.f۸۸۴۱g[index] = prepared;
            this.f۸۸۴۰f.removeAt(keyIndex);
            if (this.f۸۸۴۰f.size() == 0) {
                this.f۸۸۴۰f = null;
            }
            return prepared;
        }

        /* renamed from: b, reason: contains not printable characters */
        final boolean m۸۶۶۵b(int layoutDirection, int currentIndex) {
            boolean changed = false;
            int count = this.f۸۸۴۲h;
            Drawable[] drawables = this.f۸۸۴۱g;
            for (int i = 0; i < count; i++) {
                if (drawables[i] != null) {
                    boolean childChanged = false;
                    if (Build.VERSION.SDK_INT >= 23) {
                        childChanged = drawables[i].setLayoutDirection(layoutDirection);
                    }
                    if (i == currentIndex) {
                        changed = childChanged;
                    }
                }
            }
            this.f۸۸۶۰z = layoutDirection;
            return changed;
        }

        /* renamed from: a, reason: contains not printable characters */
        final void m۸۶۵۹a(Resources res) {
            if (res != null) {
                this.f۸۸۳۶b = res;
                int targetDensity = Cb.m۸۶۴۲a(res, this.f۸۸۳۷c);
                int sourceDensity = this.f۸۸۳۷c;
                this.f۸۸۳۷c = targetDensity;
                if (sourceDensity != targetDensity) {
                    this.f۸۸۴۷m = false;
                    this.f۸۸۴۴j = false;
                }
            }
        }

        /* renamed from: a, reason: contains not printable characters */
        final void m۸۶۵۸a(Resources.Theme theme) {
            if (theme != null) {
                m۸۶۵۴n();
                int count = this.f۸۸۴۲h;
                Drawable[] drawables = this.f۸۸۴۱g;
                for (int i = 0; i < count; i++) {
                    if (drawables[i] != null && drawables[i].canApplyTheme()) {
                        drawables[i].applyTheme(theme);
                        this.f۸۸۳۹e |= drawables[i].getChangingConfigurations();
                    }
                }
                m۸۶۵۹a(theme.getResources());
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int count = this.f۸۸۴۲h;
            Drawable[] drawables = this.f۸۸۴۱g;
            for (int i = 0; i < count; i++) {
                Drawable d2 = drawables[i];
                if (d2 != null) {
                    if (d2.canApplyTheme()) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState future = this.f۸۸۴۰f.get(i);
                    if (future != null && future.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: b, reason: contains not printable characters */
        public final void m۸۶۶۴b(boolean variable) {
            this.f۸۸۴۳i = variable;
        }

        /* renamed from: h, reason: contains not printable characters */
        public final Rect m۸۶۷۲h() {
            if (this.f۸۸۴۳i) {
                return null;
            }
            if (this.f۸۸۴۵k != null || this.f۸۸۴۴j) {
                Rect r = this.f۸۸۴۵k;
                return r;
            }
            m۸۶۵۴n();
            Rect r2 = null;
            Rect t = new Rect();
            int count = this.f۸۸۴۲h;
            Drawable[] drawables = this.f۸۸۴۱g;
            for (int i = 0; i < count; i++) {
                if (drawables[i].getPadding(t)) {
                    if (r2 == null) {
                        r2 = new Rect(0, 0, 0, 0);
                    }
                    int i2 = t.left;
                    if (i2 > r2.left) {
                        r2.left = i2;
                    }
                    int i3 = t.top;
                    if (i3 > r2.top) {
                        r2.top = i3;
                    }
                    int i4 = t.right;
                    if (i4 > r2.right) {
                        r2.right = i4;
                    }
                    int i5 = t.bottom;
                    if (i5 > r2.bottom) {
                        r2.bottom = i5;
                    }
                }
            }
            this.f۸۸۴۴j = true;
            this.f۸۸۴۵k = r2;
            return r2;
        }

        /* renamed from: a, reason: contains not printable characters */
        public final void m۸۶۶۰a(boolean constant) {
            this.f۸۸۴۶l = constant;
        }

        /* renamed from: l, reason: contains not printable characters */
        public final boolean m۸۶۷۶l() {
            return this.f۸۸۴۶l;
        }

        /* renamed from: i, reason: contains not printable characters */
        public final int m۸۶۷۳i() {
            if (!this.f۸۸۴۷m) {
                m۸۶۶۲b();
            }
            return this.f۸۸۴۸n;
        }

        /* renamed from: e, reason: contains not printable characters */
        public final int m۸۶۶۹e() {
            if (!this.f۸۸۴۷m) {
                m۸۶۶۲b();
            }
            return this.f۸۸۴۹o;
        }

        /* renamed from: g, reason: contains not printable characters */
        public final int m۸۶۷۱g() {
            if (!this.f۸۸۴۷m) {
                m۸۶۶۲b();
            }
            return this.f۸۸۵۰p;
        }

        /* renamed from: f, reason: contains not printable characters */
        public final int m۸۶۷۰f() {
            if (!this.f۸۸۴۷m) {
                m۸۶۶۲b();
            }
            return this.f۸۸۵۱q;
        }

        /* renamed from: b, reason: contains not printable characters */
        protected void m۸۶۶۲b() {
            this.f۸۸۴۷m = true;
            m۸۶۵۴n();
            int count = this.f۸۸۴۲h;
            Drawable[] drawables = this.f۸۸۴۱g;
            this.f۸۸۴۹o = -1;
            this.f۸۸۴۸n = -1;
            this.f۸۸۵۱q = 0;
            this.f۸۸۵۰p = 0;
            for (int i = 0; i < count; i++) {
                Drawable dr = drawables[i];
                int s = dr.getIntrinsicWidth();
                if (s > this.f۸۸۴۸n) {
                    this.f۸۸۴۸n = s;
                }
                int s2 = dr.getIntrinsicHeight();
                if (s2 > this.f۸۸۴۹o) {
                    this.f۸۸۴۹o = s2;
                }
                int s3 = dr.getMinimumWidth();
                if (s3 > this.f۸۸۵۰p) {
                    this.f۸۸۵۰p = s3;
                }
                int s4 = dr.getMinimumHeight();
                if (s4 > this.f۸۸۵۱q) {
                    this.f۸۸۵۱q = s4;
                }
            }
        }

        /* renamed from: b, reason: contains not printable characters */
        public final void m۸۶۶۳b(int duration) {
            this.f۸۸۲۶A = duration;
        }

        /* renamed from: c, reason: contains not printable characters */
        public final void m۸۶۶۷c(int duration) {
            this.f۸۸۲۷B = duration;
        }

        /* renamed from: j, reason: contains not printable characters */
        public final int m۸۶۷۴j() {
            if (this.f۸۸۵۲r) {
                return this.f۸۸۵۳s;
            }
            m۸۶۵۴n();
            int count = this.f۸۸۴۲h;
            Drawable[] drawables = this.f۸۸۴۱g;
            int op = count > 0 ? drawables[0].getOpacity() : -2;
            for (int i = 1; i < count; i++) {
                op = Drawable.resolveOpacity(op, drawables[i].getOpacity());
            }
            this.f۸۸۵۳s = op;
            this.f۸۸۵۲r = true;
            return op;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void mo۸۶۹۳a(int oldSize, int newSize) {
            Drawable[] newDrawables = new Drawable[newSize];
            System.arraycopy(this.f۸۸۴۱g, 0, newDrawables, 0, oldSize);
            this.f۸۸۴۱g = newDrawables;
        }

        /* renamed from: a, reason: contains not printable characters */
        public synchronized boolean m۸۶۶۱a() {
            if (this.f۸۸۵۶v) {
                return this.f۸۸۵۷w;
            }
            m۸۶۵۴n();
            this.f۸۸۵۶v = true;
            int count = this.f۸۸۴۲h;
            Drawable[] drawables = this.f۸۸۴۱g;
            for (int i = 0; i < count; i++) {
                if (drawables[i].getConstantState() == null) {
                    this.f۸۸۵۷w = false;
                    return false;
                }
            }
            this.f۸۸۵۷w = true;
            return true;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    protected void mo۸۶۸۹a(c state) {
        this.f۸۸۱۲c = state;
        int i = this.f۸۸۱۸i;
        if (i >= 0) {
            this.f۸۸۱۴e = state.m۸۶۵۶a(i);
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                m۸۶۴۳a(drawable);
            }
        }
        this.f۸۸۱۵f = null;
    }

    /* renamed from: a.b.h.d.a.b$b */
    static class b implements Drawable.Callback {

        /* renamed from: c, reason: contains not printable characters */
        private Drawable.Callback f۸۸۲۵c;

        b() {
        }

        /* renamed from: a, reason: contains not printable characters */
        public b m۸۶۵۱a(Drawable.Callback callback) {
            this.f۸۸۲۵c = callback;
            return this;
        }

        /* renamed from: a, reason: contains not printable characters */
        public Drawable.Callback m۸۶۵۲a() {
            Drawable.Callback callback = this.f۸۸۲۵c;
            this.f۸۸۲۵c = null;
            return callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable who) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            Drawable.Callback callback = this.f۸۸۲۵c;
            if (callback != null) {
                callback.scheduleDrawable(who, what, when);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable who, Runnable what) {
            Drawable.Callback callback = this.f۸۸۲۵c;
            if (callback != null) {
                callback.unscheduleDrawable(who, what);
            }
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    static int m۸۶۴۲a(Resources r, int parentDensity) {
        int densityDpi = r == null ? parentDensity : r.getDisplayMetrics().densityDpi;
        if (densityDpi == 0) {
            return 160;
        }
        return densityDpi;
    }
}
