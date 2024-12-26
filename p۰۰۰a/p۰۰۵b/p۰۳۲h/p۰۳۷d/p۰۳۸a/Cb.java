package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a;

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
import android.support.p۰۴۳v4.graphics.drawable.Ca;
import android.util.SparseArray;

/* access modifiers changed from: package-private */
/* renamed from: a.b.h.d.a.b  reason: invalid class name */
public class Cb extends Drawable implements Drawable.Callback {

    /* renamed from: c  reason: contains not printable characters */
    private AbstractCc f۸۸۱۲c;

    /* renamed from: d  reason: contains not printable characters */
    private Rect f۸۸۱۳d;

    /* renamed from: e  reason: contains not printable characters */
    private Drawable f۸۸۱۴e;

    /* renamed from: f  reason: contains not printable characters */
    private Drawable f۸۸۱۵f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۸۸۱۶g = 255;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۸۸۱۷h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۸۸۱۸i = -1;

    /* renamed from: j  reason: contains not printable characters */
    private boolean f۸۸۱۹j;

    /* renamed from: k  reason: contains not printable characters */
    private Runnable f۸۸۲۰k;

    /* renamed from: l  reason: contains not printable characters */
    private long f۸۸۲۱l;

    /* renamed from: m  reason: contains not printable characters */
    private long f۸۸۲۲m;

    /* renamed from: n  reason: contains not printable characters */
    private Cb f۸۸۲۳n;

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc m۱۰۷۱۴a() {
        throw null;
    }

    Cb() {
    }

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

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f۸۸۱۲c.getChangingConfigurations();
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    /* renamed from: c  reason: contains not printable characters */
    private boolean m۱۰۷۱۳c() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    public boolean getPadding(Rect padding) {
        boolean result;
        Rect r = this.f۸۸۱۲c.m۱۰۷۴۱h();
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
        if (m۱۰۷۱۳c()) {
            int left = padding.left;
            padding.left = padding.right;
            padding.right = left;
        }
        return result;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int alpha) {
        if (!this.f۸۸۱۷h || this.f۸۸۱۶g != alpha) {
            this.f۸۸۱۷h = true;
            this.f۸۸۱۶g = alpha;
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable == null) {
                return;
            }
            if (this.f۸۸۲۱l == 0) {
                drawable.setAlpha(alpha);
            } else {
                m۱۰۷۱۷a(false);
            }
        }
    }

    public int getAlpha() {
        return this.f۸۸۱۶g;
    }

    public void setDither(boolean dither) {
        AbstractCc cVar = this.f۸۸۱۲c;
        if (cVar.f۸۸۵۸x != dither) {
            cVar.f۸۸۵۸x = dither;
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                drawable.setDither(cVar.f۸۸۵۸x);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        AbstractCc cVar = this.f۸۸۱۲c;
        cVar.f۸۸۳۰E = true;
        if (cVar.f۸۸۲۹D != colorFilter) {
            cVar.f۸۸۲۹D = colorFilter;
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList tint) {
        AbstractCc cVar = this.f۸۸۱۲c;
        cVar.f۸۸۳۳H = true;
        if (cVar.f۸۸۳۱F != tint) {
            cVar.f۸۸۳۱F = tint;
            Ca.m۱۲۷۰۸a(this.f۸۸۱۴e, tint);
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        AbstractCc cVar = this.f۸۸۱۲c;
        cVar.f۸۸۳۴I = true;
        if (cVar.f۸۸۳۲G != tintMode) {
            cVar.f۸۸۳۲G = tintMode;
            Ca.m۱۲۷۱۱a(this.f۸۸۱۴e, tintMode);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۸۸۱۵f;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        Drawable drawable2 = this.f۸۸۱۴e;
        if (drawable2 != null) {
            drawable2.setBounds(bounds);
        }
    }

    public void setAutoMirrored(boolean mirrored) {
        AbstractCc cVar = this.f۸۸۱۲c;
        if (cVar.f۸۸۲۸C != mirrored) {
            cVar.f۸۸۲۸C = mirrored;
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                Ca.m۱۲۷۱۲a(drawable, cVar.f۸۸۲۸C);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.f۸۸۱۲c.f۸۸۲۸C;
    }

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
            this.f۸۸۲۲m = 0;
            changed = true;
        }
        if (this.f۸۸۲۱l != 0) {
            this.f۸۸۲۱l = 0;
            changed = true;
        }
        if (changed) {
            invalidateSelf();
        }
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            Ca.m۱۲۷۰۶a(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Rect rect = this.f۸۸۱۳d;
        if (rect == null) {
            this.f۸۸۱۳d = new Rect(left, top, right, bottom);
        } else {
            rect.set(left, top, right, bottom);
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            Ca.m۱۲۷۰۷a(drawable, left, top, right, bottom);
        }
    }

    public void getHotspotBounds(Rect outRect) {
        Rect rect = this.f۸۸۱۳d;
        if (rect != null) {
            outRect.set(rect);
        } else {
            super.getHotspotBounds(outRect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
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

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int level) {
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

    public boolean onLayoutDirectionChanged(int layoutDirection) {
        return this.f۸۸۱۲c.m۱۰۷۳۴b(layoutDirection, m۱۰۷۱۹b());
    }

    public int getIntrinsicWidth() {
        if (this.f۸۸۱۲c.m۱۰۷۴۵l()) {
            return this.f۸۸۱۲c.m۱۰۷۴۲i();
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getIntrinsicHeight() {
        if (this.f۸۸۱۲c.m۱۰۷۴۵l()) {
            return this.f۸۸۱۲c.m۱۰۷۳۸e();
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getMinimumWidth() {
        if (this.f۸۸۱۲c.m۱۰۷۴۵l()) {
            return this.f۸۸۱۲c.m۱۰۷۴۰g();
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getMinimumHeight() {
        if (this.f۸۸۱۲c.m۱۰۷۴۵l()) {
            return this.f۸۸۱۲c.m۱۰۷۳۹f();
        }
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable who) {
        AbstractCc cVar = this.f۸۸۱۲c;
        if (cVar != null) {
            cVar.m۱۰۷۴۴k();
        }
        if (who == this.f۸۸۱۴e && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        if (who == this.f۸۸۱۴e && getCallback() != null) {
            getCallback().scheduleDrawable(this, what, when);
        }
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        if (who == this.f۸۸۱۴e && getCallback() != null) {
            getCallback().unscheduleDrawable(this, what);
        }
    }

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

    public int getOpacity() {
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f۸۸۱۲c.m۱۰۷۴۳j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public int m۱۰۷۱۹b() {
        return this.f۸۸۱۸i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* renamed from: a  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m۱۰۷۱۸a(int r10) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a.Cb.m۱۰۷۱۸a(int):boolean");
    }

    /* renamed from: a.b.h.d.a.b$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        public void run() {
            Cb.this.m۱۰۷۱۷a(true);
            Cb.this.invalidateSelf();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۷۱۲a(Drawable d) {
        if (this.f۸۸۲۳n == null) {
            this.f۸۸۲۳n = new Cb();
        }
        Cb bVar = this.f۸۸۲۳n;
        bVar.m۱۰۷۲۰a(d.getCallback());
        d.setCallback(bVar);
        try {
            if (this.f۸۸۱۲c.f۸۸۲۶A <= 0 && this.f۸۸۱۷h) {
                d.setAlpha(this.f۸۸۱۶g);
            }
            if (this.f۸۸۱۲c.f۸۸۳۰E) {
                d.setColorFilter(this.f۸۸۱۲c.f۸۸۲۹D);
            } else {
                if (this.f۸۸۱۲c.f۸۸۳۳H) {
                    Ca.m۱۲۷۰۸a(d, this.f۸۸۱۲c.f۸۸۳۱F);
                }
                if (this.f۸۸۱۲c.f۸۸۳۴I) {
                    Ca.m۱۲۷۱۱a(d, this.f۸۸۱۲c.f۸۸۳۲G);
                }
            }
            d.setVisible(isVisible(), true);
            d.setDither(this.f۸۸۱۲c.f۸۸۵۸x);
            d.setState(getState());
            d.setLevel(getLevel());
            d.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                d.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                d.setAutoMirrored(this.f۸۸۱۲c.f۸۸۲۸C);
            }
            Rect hotspotBounds = this.f۸۸۱۳d;
            if (Build.VERSION.SDK_INT >= 21 && hotspotBounds != null) {
                d.setHotspotBounds(hotspotBounds.left, hotspotBounds.top, hotspotBounds.right, hotspotBounds.bottom);
            }
        } finally {
            d.setCallback(this.f۸۸۲۳n.m۱۰۷۲۱a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۷۱۷a(boolean schedule) {
        this.f۸۸۱۷h = true;
        long now = SystemClock.uptimeMillis();
        boolean animating = false;
        Drawable drawable = this.f۸۸۱۴e;
        if (drawable != null) {
            long j = this.f۸۸۲۱l;
            if (j != 0) {
                if (j <= now) {
                    drawable.setAlpha(this.f۸۸۱۶g);
                    this.f۸۸۲۱l = 0;
                } else {
                    drawable.setAlpha(((255 - (((int) ((j - now) * 255)) / this.f۸۸۱۲c.f۸۸۲۶A)) * this.f۸۸۱۶g) / 255);
                    animating = true;
                }
            }
        } else {
            this.f۸۸۲۱l = 0;
        }
        Drawable drawable2 = this.f۸۸۱۵f;
        if (drawable2 != null) {
            long j2 = this.f۸۸۲۲m;
            if (j2 != 0) {
                if (j2 <= now) {
                    drawable2.setVisible(false, false);
                    this.f۸۸۱۵f = null;
                    this.f۸۸۲۲m = 0;
                } else {
                    drawable2.setAlpha((this.f۸۸۱۶g * (((int) ((j2 - now) * 255)) / this.f۸۸۱۲c.f۸۸۲۷B)) / 255);
                    animating = true;
                }
            }
        } else {
            this.f۸۸۲۲m = 0;
        }
        if (schedule && animating) {
            scheduleSelf(this.f۸۸۲۰k, 16 + now);
        }
    }

    public Drawable getCurrent() {
        return this.f۸۸۱۴e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۰۷۱۶a(Resources res) {
        this.f۸۸۱۲c.m۱۰۷۲۸a(res);
    }

    public void applyTheme(Resources.Theme theme) {
        this.f۸۸۱۲c.m۱۰۷۲۷a(theme);
    }

    public boolean canApplyTheme() {
        return this.f۸۸۱۲c.canApplyTheme();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f۸۸۱۲c.m۱۰۷۳۰a()) {
            return null;
        }
        this.f۸۸۱۲c.f۸۸۳۸d = getChangingConfigurations();
        return this.f۸۸۱۲c;
    }

    public Drawable mutate() {
        if (!this.f۸۸۱۹j && super.mutate() == this) {
            AbstractCc clone = m۱۰۷۱۴a();
            clone.m۱۰۷۴۶m();
            m۱۰۷۱۵a(clone);
            this.f۸۸۱۹j = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.h.d.a.b$c  reason: invalid class name */
    public static abstract class AbstractCc extends Drawable.ConstantState {

        /* renamed from: A  reason: contains not printable characters */
        int f۸۸۲۶A = 0;

        /* renamed from: B  reason: contains not printable characters */
        int f۸۸۲۷B = 0;

        /* renamed from: C  reason: contains not printable characters */
        boolean f۸۸۲۸C;

        /* renamed from: D  reason: contains not printable characters */
        ColorFilter f۸۸۲۹D;

        /* renamed from: E  reason: contains not printable characters */
        boolean f۸۸۳۰E;

        /* renamed from: F  reason: contains not printable characters */
        ColorStateList f۸۸۳۱F;

        /* renamed from: G  reason: contains not printable characters */
        PorterDuff.Mode f۸۸۳۲G;

        /* renamed from: H  reason: contains not printable characters */
        boolean f۸۸۳۳H;

        /* renamed from: I  reason: contains not printable characters */
        boolean f۸۸۳۴I;

        /* renamed from: a  reason: contains not printable characters */
        final Cb f۸۸۳۵a;

        /* renamed from: b  reason: contains not printable characters */
        Resources f۸۸۳۶b;

        /* renamed from: c  reason: contains not printable characters */
        int f۸۸۳۷c = 160;

        /* renamed from: d  reason: contains not printable characters */
        int f۸۸۳۸d;

        /* renamed from: e  reason: contains not printable characters */
        int f۸۸۳۹e;

        /* renamed from: f  reason: contains not printable characters */
        SparseArray<Drawable.ConstantState> f۸۸۴۰f;

        /* renamed from: g  reason: contains not printable characters */
        Drawable[] f۸۸۴۱g;

        /* renamed from: h  reason: contains not printable characters */
        int f۸۸۴۲h;

        /* renamed from: i  reason: contains not printable characters */
        boolean f۸۸۴۳i = false;

        /* renamed from: j  reason: contains not printable characters */
        boolean f۸۸۴۴j;

        /* renamed from: k  reason: contains not printable characters */
        Rect f۸۸۴۵k;

        /* renamed from: l  reason: contains not printable characters */
        boolean f۸۸۴۶l = false;

        /* renamed from: m  reason: contains not printable characters */
        boolean f۸۸۴۷m;

        /* renamed from: n  reason: contains not printable characters */
        int f۸۸۴۸n;

        /* renamed from: o  reason: contains not printable characters */
        int f۸۸۴۹o;

        /* renamed from: p  reason: contains not printable characters */
        int f۸۸۵۰p;

        /* renamed from: q  reason: contains not printable characters */
        int f۸۸۵۱q;

        /* renamed from: r  reason: contains not printable characters */
        boolean f۸۸۵۲r;

        /* renamed from: s  reason: contains not printable characters */
        int f۸۸۵۳s;

        /* renamed from: t  reason: contains not printable characters */
        boolean f۸۸۵۴t;

        /* renamed from: u  reason: contains not printable characters */
        boolean f۸۸۵۵u;

        /* renamed from: v  reason: contains not printable characters */
        boolean f۸۸۵۶v;

        /* renamed from: w  reason: contains not printable characters */
        boolean f۸۸۵۷w;

        /* renamed from: x  reason: contains not printable characters */
        boolean f۸۸۵۸x = true;

        /* renamed from: y  reason: contains not printable characters */
        boolean f۸۸۵۹y;

        /* renamed from: z  reason: contains not printable characters */
        int f۸۸۶۰z;

        /* access modifiers changed from: package-private */
        /* renamed from: m  reason: contains not printable characters */
        public abstract void m۱۰۷۴۶m();

        AbstractCc(AbstractCc orig, Cb owner, Resources res) {
            this.f۸۸۳۵a = owner;
            this.f۸۸۳۶b = res != null ? res : orig != null ? orig.f۸۸۳۶b : null;
            this.f۸۸۳۷c = Cb.m۱۰۷۱۱a(res, orig != null ? orig.f۸۸۳۷c : 0);
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

        public int getChangingConfigurations() {
            return this.f۸۸۳۸d | this.f۸۸۳۹e;
        }

        /* renamed from: a  reason: contains not printable characters */
        public final int m۱۰۷۲۴a(Drawable dr) {
            int pos = this.f۸۸۴۲h;
            if (pos >= this.f۸۸۴۱g.length) {
                m۱۰۷۲۶a(pos, pos + 10);
            }
            dr.mutate();
            dr.setVisible(false, true);
            dr.setCallback(this.f۸۸۳۵a);
            this.f۸۸۴۱g[pos] = dr;
            this.f۸۸۴۲h++;
            this.f۸۸۳۹e |= dr.getChangingConfigurations();
            m۱۰۷۴۴k();
            this.f۸۸۴۵k = null;
            this.f۸۸۴۴j = false;
            this.f۸۸۴۷m = false;
            this.f۸۸۵۶v = false;
            return pos;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k  reason: contains not printable characters */
        public void m۱۰۷۴۴k() {
            this.f۸۸۵۲r = false;
            this.f۸۸۵۴t = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c  reason: contains not printable characters */
        public final int m۱۰۷۳۵c() {
            return this.f۸۸۴۱g.length;
        }

        /* renamed from: n  reason: contains not printable characters */
        private void m۱۰۷۲۳n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f۸۸۴۰f;
            if (sparseArray != null) {
                int futureCount = sparseArray.size();
                for (int keyIndex = 0; keyIndex < futureCount; keyIndex++) {
                    this.f۸۸۴۱g[this.f۸۸۴۰f.keyAt(keyIndex)] = m۱۰۷۲۲b(this.f۸۸۴۰f.valueAt(keyIndex).newDrawable(this.f۸۸۳۶b));
                }
                this.f۸۸۴۰f = null;
            }
        }

        /* renamed from: b  reason: contains not printable characters */
        private Drawable m۱۰۷۲۲b(Drawable child) {
            if (Build.VERSION.SDK_INT >= 23) {
                child.setLayoutDirection(this.f۸۸۶۰z);
            }
            Drawable child2 = child.mutate();
            child2.setCallback(this.f۸۸۳۵a);
            return child2;
        }

        /* renamed from: d  reason: contains not printable characters */
        public final int m۱۰۷۳۷d() {
            return this.f۸۸۴۲h;
        }

        /* renamed from: a  reason: contains not printable characters */
        public final Drawable m۱۰۷۲۵a(int index) {
            int keyIndex;
            Drawable result = this.f۸۸۴۱g[index];
            if (result != null) {
                return result;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f۸۸۴۰f;
            if (sparseArray == null || (keyIndex = sparseArray.indexOfKey(index)) < 0) {
                return null;
            }
            Drawable prepared = m۱۰۷۲۲b(this.f۸۸۴۰f.valueAt(keyIndex).newDrawable(this.f۸۸۳۶b));
            this.f۸۸۴۱g[index] = prepared;
            this.f۸۸۴۰f.removeAt(keyIndex);
            if (this.f۸۸۴۰f.size() == 0) {
                this.f۸۸۴۰f = null;
            }
            return prepared;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public final boolean m۱۰۷۳۴b(int layoutDirection, int currentIndex) {
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

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public final void m۱۰۷۲۸a(Resources res) {
            if (res != null) {
                this.f۸۸۳۶b = res;
                int targetDensity = Cb.m۱۰۷۱۱a(res, this.f۸۸۳۷c);
                int sourceDensity = this.f۸۸۳۷c;
                this.f۸۸۳۷c = targetDensity;
                if (sourceDensity != targetDensity) {
                    this.f۸۸۴۷m = false;
                    this.f۸۸۴۴j = false;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public final void m۱۰۷۲۷a(Resources.Theme theme) {
            if (theme != null) {
                m۱۰۷۲۳n();
                int count = this.f۸۸۴۲h;
                Drawable[] drawables = this.f۸۸۴۱g;
                for (int i = 0; i < count; i++) {
                    if (drawables[i] != null && drawables[i].canApplyTheme()) {
                        drawables[i].applyTheme(theme);
                        this.f۸۸۳۹e |= drawables[i].getChangingConfigurations();
                    }
                }
                m۱۰۷۲۸a(theme.getResources());
            }
        }

        public boolean canApplyTheme() {
            int count = this.f۸۸۴۲h;
            Drawable[] drawables = this.f۸۸۴۱g;
            for (int i = 0; i < count; i++) {
                Drawable d = drawables[i];
                if (d == null) {
                    Drawable.ConstantState future = this.f۸۸۴۰f.get(i);
                    if (future != null && future.canApplyTheme()) {
                        return true;
                    }
                } else if (d.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b  reason: contains not printable characters */
        public final void m۱۰۷۳۳b(boolean variable) {
            this.f۸۸۴۳i = variable;
        }

        /* renamed from: h  reason: contains not printable characters */
        public final Rect m۱۰۷۴۱h() {
            if (this.f۸۸۴۳i) {
                return null;
            }
            if (this.f۸۸۴۵k != null || this.f۸۸۴۴j) {
                return this.f۸۸۴۵k;
            }
            m۱۰۷۲۳n();
            Rect r = null;
            Rect t = new Rect();
            int count = this.f۸۸۴۲h;
            Drawable[] drawables = this.f۸۸۴۱g;
            for (int i = 0; i < count; i++) {
                if (drawables[i].getPadding(t)) {
                    if (r == null) {
                        r = new Rect(0, 0, 0, 0);
                    }
                    int i2 = t.left;
                    if (i2 > r.left) {
                        r.left = i2;
                    }
                    int i3 = t.top;
                    if (i3 > r.top) {
                        r.top = i3;
                    }
                    int i4 = t.right;
                    if (i4 > r.right) {
                        r.right = i4;
                    }
                    int i5 = t.bottom;
                    if (i5 > r.bottom) {
                        r.bottom = i5;
                    }
                }
            }
            this.f۸۸۴۴j = true;
            this.f۸۸۴۵k = r;
            return r;
        }

        /* renamed from: a  reason: contains not printable characters */
        public final void m۱۰۷۲۹a(boolean constant) {
            this.f۸۸۴۶l = constant;
        }

        /* renamed from: l  reason: contains not printable characters */
        public final boolean m۱۰۷۴۵l() {
            return this.f۸۸۴۶l;
        }

        /* renamed from: i  reason: contains not printable characters */
        public final int m۱۰۷۴۲i() {
            if (!this.f۸۸۴۷m) {
                m۱۰۷۳۱b();
            }
            return this.f۸۸۴۸n;
        }

        /* renamed from: e  reason: contains not printable characters */
        public final int m۱۰۷۳۸e() {
            if (!this.f۸۸۴۷m) {
                m۱۰۷۳۱b();
            }
            return this.f۸۸۴۹o;
        }

        /* renamed from: g  reason: contains not printable characters */
        public final int m۱۰۷۴۰g() {
            if (!this.f۸۸۴۷m) {
                m۱۰۷۳۱b();
            }
            return this.f۸۸۵۰p;
        }

        /* renamed from: f  reason: contains not printable characters */
        public final int m۱۰۷۳۹f() {
            if (!this.f۸۸۴۷m) {
                m۱۰۷۳۱b();
            }
            return this.f۸۸۵۱q;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۰۷۳۱b() {
            this.f۸۸۴۷m = true;
            m۱۰۷۲۳n();
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

        /* renamed from: b  reason: contains not printable characters */
        public final void m۱۰۷۳۲b(int duration) {
            this.f۸۸۲۶A = duration;
        }

        /* renamed from: c  reason: contains not printable characters */
        public final void m۱۰۷۳۶c(int duration) {
            this.f۸۸۲۷B = duration;
        }

        /* renamed from: j  reason: contains not printable characters */
        public final int m۱۰۷۴۳j() {
            if (this.f۸۸۵۲r) {
                return this.f۸۸۵۳s;
            }
            m۱۰۷۲۳n();
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

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۷۲۶a(int oldSize, int newSize) {
            Drawable[] newDrawables = new Drawable[newSize];
            System.arraycopy(this.f۸۸۴۱g, 0, newDrawables, 0, oldSize);
            this.f۸۸۴۱g = newDrawables;
        }

        /* renamed from: a  reason: contains not printable characters */
        public synchronized boolean m۱۰۷۳۰a() {
            if (this.f۸۸۵۶v) {
                return this.f۸۸۵۷w;
            }
            m۱۰۷۲۳n();
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

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۷۱۵a(AbstractCc state) {
        this.f۸۸۱۲c = state;
        int i = this.f۸۸۱۸i;
        if (i >= 0) {
            this.f۸۸۱۴e = state.m۱۰۷۲۵a(i);
            Drawable drawable = this.f۸۸۱۴e;
            if (drawable != null) {
                m۱۰۷۱۲a(drawable);
            }
        }
        this.f۸۸۱۵f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.h.d.a.b$b  reason: invalid class name */
    public static class Cb implements Drawable.Callback {

        /* renamed from: c  reason: contains not printable characters */
        private Drawable.Callback f۸۸۲۵c;

        Cb() {
        }

        /* renamed from: a  reason: contains not printable characters */
        public Cb m۱۰۷۲۰a(Drawable.Callback callback) {
            this.f۸۸۲۵c = callback;
            return this;
        }

        /* renamed from: a  reason: contains not printable characters */
        public Drawable.Callback m۱۰۷۲۱a() {
            Drawable.Callback callback = this.f۸۸۲۵c;
            this.f۸۸۲۵c = null;
            return callback;
        }

        public void invalidateDrawable(Drawable who) {
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            Drawable.Callback callback = this.f۸۸۲۵c;
            if (callback != null) {
                callback.scheduleDrawable(who, what, when);
            }
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            Drawable.Callback callback = this.f۸۸۲۵c;
            if (callback != null) {
                callback.unscheduleDrawable(who, what);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    static int m۱۰۷۱۱a(Resources r, int parentDensity) {
        int densityDpi = r == null ? parentDensity : r.getDisplayMetrics().densityDpi;
        if (densityDpi == 0) {
            return 160;
        }
        return densityDpi;
    }
}
