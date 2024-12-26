package a.b.h.d.a;

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
import android.util.SparseArray;

/* access modifiers changed from: package-private */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: c  reason: collision with root package name */
    private c f۴۳۶c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f۴۳۷d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f۴۳۸e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f۴۳۹f;

    /* renamed from: g  reason: collision with root package name */
    private int f۴۴۰g = 255;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۴۴۱h;
    private int i = -1;
    private boolean j;
    private Runnable k;
    private long l;
    private long m;
    private C۰۰۱۹b n;

    /* access modifiers changed from: package-private */
    public c a() {
        throw null;
    }

    b() {
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f۴۳۸e;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f۴۳۹f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f۴۳۶c.getChangingConfigurations();
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(23)
    private boolean c() {
        return isAutoMirrored() && getLayoutDirection() == 1;
    }

    public boolean getPadding(Rect padding) {
        boolean result;
        Rect r = this.f۴۳۶c.h();
        if (r != null) {
            padding.set(r);
            result = (((r.left | r.top) | r.bottom) | r.right) != 0;
        } else {
            Drawable drawable = this.f۴۳۸e;
            if (drawable != null) {
                result = drawable.getPadding(padding);
            } else {
                result = super.getPadding(padding);
            }
        }
        if (c()) {
            int left = padding.left;
            padding.left = padding.right;
            padding.right = left;
        }
        return result;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f۴۳۸e;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public void setAlpha(int alpha) {
        if (!this.f۴۴۱h || this.f۴۴۰g != alpha) {
            this.f۴۴۱h = true;
            this.f۴۴۰g = alpha;
            Drawable drawable = this.f۴۳۸e;
            if (drawable == null) {
                return;
            }
            if (this.l == 0) {
                drawable.setAlpha(alpha);
            } else {
                a(false);
            }
        }
    }

    public int getAlpha() {
        return this.f۴۴۰g;
    }

    public void setDither(boolean dither) {
        c cVar = this.f۴۳۶c;
        if (cVar.x != dither) {
            cVar.x = dither;
            Drawable drawable = this.f۴۳۸e;
            if (drawable != null) {
                drawable.setDither(cVar.x);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f۴۳۶c;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f۴۳۸e;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setTintList(ColorStateList tint) {
        c cVar = this.f۴۳۶c;
        cVar.H = true;
        if (cVar.F != tint) {
            cVar.F = tint;
            android.support.v4.graphics.drawable.a.a(this.f۴۳۸e, tint);
        }
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        c cVar = this.f۴۳۶c;
        cVar.I = true;
        if (cVar.G != tintMode) {
            cVar.G = tintMode;
            android.support.v4.graphics.drawable.a.a(this.f۴۳۸e, tintMode);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۴۳۹f;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
        Drawable drawable2 = this.f۴۳۸e;
        if (drawable2 != null) {
            drawable2.setBounds(bounds);
        }
    }

    public void setAutoMirrored(boolean mirrored) {
        c cVar = this.f۴۳۶c;
        if (cVar.C != mirrored) {
            cVar.C = mirrored;
            Drawable drawable = this.f۴۳۸e;
            if (drawable != null) {
                android.support.v4.graphics.drawable.a.a(drawable, cVar.C);
            }
        }
    }

    public boolean isAutoMirrored() {
        return this.f۴۳۶c.C;
    }

    public void jumpToCurrentState() {
        boolean changed = false;
        Drawable drawable = this.f۴۳۹f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f۴۳۹f = null;
            changed = true;
        }
        Drawable drawable2 = this.f۴۳۸e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f۴۴۱h) {
                this.f۴۳۸e.setAlpha(this.f۴۴۰g);
            }
        }
        if (this.m != 0) {
            this.m = 0;
            changed = true;
        }
        if (this.l != 0) {
            this.l = 0;
            changed = true;
        }
        if (changed) {
            invalidateSelf();
        }
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f۴۳۸e;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Rect rect = this.f۴۳۷d;
        if (rect == null) {
            this.f۴۳۷d = new Rect(left, top, right, bottom);
        } else {
            rect.set(left, top, right, bottom);
        }
        Drawable drawable = this.f۴۳۸e;
        if (drawable != null) {
            android.support.v4.graphics.drawable.a.a(drawable, left, top, right, bottom);
        }
    }

    public void getHotspotBounds(Rect outRect) {
        Rect rect = this.f۴۳۷d;
        if (rect != null) {
            outRect.set(rect);
        } else {
            super.getHotspotBounds(outRect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] state) {
        Drawable drawable = this.f۴۳۹f;
        if (drawable != null) {
            return drawable.setState(state);
        }
        Drawable drawable2 = this.f۴۳۸e;
        if (drawable2 != null) {
            return drawable2.setState(state);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int level) {
        Drawable drawable = this.f۴۳۹f;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        Drawable drawable2 = this.f۴۳۸e;
        if (drawable2 != null) {
            return drawable2.setLevel(level);
        }
        return false;
    }

    public boolean onLayoutDirectionChanged(int layoutDirection) {
        return this.f۴۳۶c.b(layoutDirection, b());
    }

    public int getIntrinsicWidth() {
        if (this.f۴۳۶c.l()) {
            return this.f۴۳۶c.i();
        }
        Drawable drawable = this.f۴۳۸e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getIntrinsicHeight() {
        if (this.f۴۳۶c.l()) {
            return this.f۴۳۶c.e();
        }
        Drawable drawable = this.f۴۳۸e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getMinimumWidth() {
        if (this.f۴۳۶c.l()) {
            return this.f۴۳۶c.g();
        }
        Drawable drawable = this.f۴۳۸e;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getMinimumHeight() {
        if (this.f۴۳۶c.l()) {
            return this.f۴۳۶c.f();
        }
        Drawable drawable = this.f۴۳۸e;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public void invalidateDrawable(Drawable who) {
        c cVar = this.f۴۳۶c;
        if (cVar != null) {
            cVar.k();
        }
        if (who == this.f۴۳۸e && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        if (who == this.f۴۳۸e && getCallback() != null) {
            getCallback().scheduleDrawable(this, what, when);
        }
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        if (who == this.f۴۳۸e && getCallback() != null) {
            getCallback().unscheduleDrawable(this, what);
        }
    }

    public boolean setVisible(boolean visible, boolean restart) {
        boolean changed = super.setVisible(visible, restart);
        Drawable drawable = this.f۴۳۹f;
        if (drawable != null) {
            drawable.setVisible(visible, restart);
        }
        Drawable drawable2 = this.f۴۳۸e;
        if (drawable2 != null) {
            drawable2.setVisible(visible, restart);
        }
        return changed;
    }

    public int getOpacity() {
        Drawable drawable = this.f۴۳۸e;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f۴۳۶c.j();
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r10) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.h.d.a.b.a(int):boolean");
    }

    class a implements Runnable {
        a() {
        }

        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    private void a(Drawable d2) {
        if (this.n == null) {
            this.n = new C۰۰۱۹b();
        }
        C۰۰۱۹b bVar = this.n;
        bVar.a(d2.getCallback());
        d2.setCallback(bVar);
        try {
            if (this.f۴۳۶c.A <= 0 && this.f۴۴۱h) {
                d2.setAlpha(this.f۴۴۰g);
            }
            if (this.f۴۳۶c.E) {
                d2.setColorFilter(this.f۴۳۶c.D);
            } else {
                if (this.f۴۳۶c.H) {
                    android.support.v4.graphics.drawable.a.a(d2, this.f۴۳۶c.F);
                }
                if (this.f۴۳۶c.I) {
                    android.support.v4.graphics.drawable.a.a(d2, this.f۴۳۶c.G);
                }
            }
            d2.setVisible(isVisible(), true);
            d2.setDither(this.f۴۳۶c.x);
            d2.setState(getState());
            d2.setLevel(getLevel());
            d2.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                d2.setLayoutDirection(getLayoutDirection());
            }
            if (Build.VERSION.SDK_INT >= 19) {
                d2.setAutoMirrored(this.f۴۳۶c.C);
            }
            Rect hotspotBounds = this.f۴۳۷d;
            if (Build.VERSION.SDK_INT >= 21 && hotspotBounds != null) {
                d2.setHotspotBounds(hotspotBounds.left, hotspotBounds.top, hotspotBounds.right, hotspotBounds.bottom);
            }
        } finally {
            d2.setCallback(this.n.a());
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean schedule) {
        this.f۴۴۱h = true;
        long now = SystemClock.uptimeMillis();
        boolean animating = false;
        Drawable drawable = this.f۴۳۸e;
        if (drawable != null) {
            long j2 = this.l;
            if (j2 != 0) {
                if (j2 <= now) {
                    drawable.setAlpha(this.f۴۴۰g);
                    this.l = 0;
                } else {
                    drawable.setAlpha(((255 - (((int) ((j2 - now) * 255)) / this.f۴۳۶c.A)) * this.f۴۴۰g) / 255);
                    animating = true;
                }
            }
        } else {
            this.l = 0;
        }
        Drawable drawable2 = this.f۴۳۹f;
        if (drawable2 != null) {
            long j3 = this.m;
            if (j3 != 0) {
                if (j3 <= now) {
                    drawable2.setVisible(false, false);
                    this.f۴۳۹f = null;
                    this.m = 0;
                } else {
                    drawable2.setAlpha((this.f۴۴۰g * (((int) ((j3 - now) * 255)) / this.f۴۳۶c.B)) / 255);
                    animating = true;
                }
            }
        } else {
            this.m = 0;
        }
        if (schedule && animating) {
            scheduleSelf(this.k, 16 + now);
        }
    }

    public Drawable getCurrent() {
        return this.f۴۳۸e;
    }

    /* access modifiers changed from: package-private */
    public final void a(Resources res) {
        this.f۴۳۶c.a(res);
    }

    public void applyTheme(Resources.Theme theme) {
        this.f۴۳۶c.a(theme);
    }

    public boolean canApplyTheme() {
        return this.f۴۳۶c.canApplyTheme();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f۴۳۶c.a()) {
            return null;
        }
        this.f۴۳۶c.f۴۴۷d = getChangingConfigurations();
        return this.f۴۳۶c;
    }

    public Drawable mutate() {
        if (!this.j && super.mutate() == this) {
            c clone = a();
            clone.m();
            a(clone);
            this.j = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public static abstract class c extends Drawable.ConstantState {
        int A = 0;
        int B = 0;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a  reason: collision with root package name */
        final b f۴۴۴a;

        /* renamed from: b  reason: collision with root package name */
        Resources f۴۴۵b;

        /* renamed from: c  reason: collision with root package name */
        int f۴۴۶c = 160;

        /* renamed from: d  reason: collision with root package name */
        int f۴۴۷d;

        /* renamed from: e  reason: collision with root package name */
        int f۴۴۸e;

        /* renamed from: f  reason: collision with root package name */
        SparseArray<Drawable.ConstantState> f۴۴۹f;

        /* renamed from: g  reason: collision with root package name */
        Drawable[] f۴۵۰g;

        /* renamed from: h  reason: collision with root package name */
        int f۴۵۱h;
        boolean i = false;
        boolean j;
        Rect k;
        boolean l = false;
        boolean m;
        int n;
        int o;
        int p;
        int q;
        boolean r;
        int s;
        boolean t;
        boolean u;
        boolean v;
        boolean w;
        boolean x = true;
        boolean y;
        int z;

        /* access modifiers changed from: package-private */
        public abstract void m();

        c(c orig, b owner, Resources res) {
            this.f۴۴۴a = owner;
            this.f۴۴۵b = res != null ? res : orig != null ? orig.f۴۴۵b : null;
            this.f۴۴۶c = b.a(res, orig != null ? orig.f۴۴۶c : 0);
            if (orig != null) {
                this.f۴۴۷d = orig.f۴۴۷d;
                this.f۴۴۸e = orig.f۴۴۸e;
                this.v = true;
                this.w = true;
                this.i = orig.i;
                this.l = orig.l;
                this.x = orig.x;
                this.y = orig.y;
                this.z = orig.z;
                this.A = orig.A;
                this.B = orig.B;
                this.C = orig.C;
                this.D = orig.D;
                this.E = orig.E;
                this.F = orig.F;
                this.G = orig.G;
                this.H = orig.H;
                this.I = orig.I;
                if (orig.f۴۴۶c == this.f۴۴۶c) {
                    if (orig.j) {
                        this.k = new Rect(orig.k);
                        this.j = true;
                    }
                    if (orig.m) {
                        this.n = orig.n;
                        this.o = orig.o;
                        this.p = orig.p;
                        this.q = orig.q;
                        this.m = true;
                    }
                }
                if (orig.r) {
                    this.s = orig.s;
                    this.r = true;
                }
                if (orig.t) {
                    this.u = orig.u;
                    this.t = true;
                }
                Drawable[] origDr = orig.f۴۵۰g;
                this.f۴۵۰g = new Drawable[origDr.length];
                this.f۴۵۱h = orig.f۴۵۱h;
                SparseArray<Drawable.ConstantState> origDf = orig.f۴۴۹f;
                if (origDf != null) {
                    this.f۴۴۹f = origDf.clone();
                } else {
                    this.f۴۴۹f = new SparseArray<>(this.f۴۵۱h);
                }
                int count = this.f۴۵۱h;
                for (int i2 = 0; i2 < count; i2++) {
                    if (origDr[i2] != null) {
                        Drawable.ConstantState cs = origDr[i2].getConstantState();
                        if (cs != null) {
                            this.f۴۴۹f.put(i2, cs);
                        } else {
                            this.f۴۵۰g[i2] = origDr[i2];
                        }
                    }
                }
                return;
            }
            this.f۴۵۰g = new Drawable[10];
            this.f۴۵۱h = 0;
        }

        public int getChangingConfigurations() {
            return this.f۴۴۷d | this.f۴۴۸e;
        }

        public final int a(Drawable dr) {
            int pos = this.f۴۵۱h;
            if (pos >= this.f۴۵۰g.length) {
                a(pos, pos + 10);
            }
            dr.mutate();
            dr.setVisible(false, true);
            dr.setCallback(this.f۴۴۴a);
            this.f۴۵۰g[pos] = dr;
            this.f۴۵۱h++;
            this.f۴۴۸e |= dr.getChangingConfigurations();
            k();
            this.k = null;
            this.j = false;
            this.m = false;
            this.v = false;
            return pos;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            this.r = false;
            this.t = false;
        }

        /* access modifiers changed from: package-private */
        public final int c() {
            return this.f۴۵۰g.length;
        }

        private void n() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f۴۴۹f;
            if (sparseArray != null) {
                int futureCount = sparseArray.size();
                for (int keyIndex = 0; keyIndex < futureCount; keyIndex++) {
                    this.f۴۵۰g[this.f۴۴۹f.keyAt(keyIndex)] = b(this.f۴۴۹f.valueAt(keyIndex).newDrawable(this.f۴۴۵b));
                }
                this.f۴۴۹f = null;
            }
        }

        private Drawable b(Drawable child) {
            if (Build.VERSION.SDK_INT >= 23) {
                child.setLayoutDirection(this.z);
            }
            Drawable child2 = child.mutate();
            child2.setCallback(this.f۴۴۴a);
            return child2;
        }

        public final int d() {
            return this.f۴۵۱h;
        }

        public final Drawable a(int index) {
            int keyIndex;
            Drawable result = this.f۴۵۰g[index];
            if (result != null) {
                return result;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f۴۴۹f;
            if (sparseArray == null || (keyIndex = sparseArray.indexOfKey(index)) < 0) {
                return null;
            }
            Drawable prepared = b(this.f۴۴۹f.valueAt(keyIndex).newDrawable(this.f۴۴۵b));
            this.f۴۵۰g[index] = prepared;
            this.f۴۴۹f.removeAt(keyIndex);
            if (this.f۴۴۹f.size() == 0) {
                this.f۴۴۹f = null;
            }
            return prepared;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(int layoutDirection, int currentIndex) {
            boolean changed = false;
            int count = this.f۴۵۱h;
            Drawable[] drawables = this.f۴۵۰g;
            for (int i2 = 0; i2 < count; i2++) {
                if (drawables[i2] != null) {
                    boolean childChanged = false;
                    if (Build.VERSION.SDK_INT >= 23) {
                        childChanged = drawables[i2].setLayoutDirection(layoutDirection);
                    }
                    if (i2 == currentIndex) {
                        changed = childChanged;
                    }
                }
            }
            this.z = layoutDirection;
            return changed;
        }

        /* access modifiers changed from: package-private */
        public final void a(Resources res) {
            if (res != null) {
                this.f۴۴۵b = res;
                int targetDensity = b.a(res, this.f۴۴۶c);
                int sourceDensity = this.f۴۴۶c;
                this.f۴۴۶c = targetDensity;
                if (sourceDensity != targetDensity) {
                    this.m = false;
                    this.j = false;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(Resources.Theme theme) {
            if (theme != null) {
                n();
                int count = this.f۴۵۱h;
                Drawable[] drawables = this.f۴۵۰g;
                for (int i2 = 0; i2 < count; i2++) {
                    if (drawables[i2] != null && drawables[i2].canApplyTheme()) {
                        drawables[i2].applyTheme(theme);
                        this.f۴۴۸e |= drawables[i2].getChangingConfigurations();
                    }
                }
                a(theme.getResources());
            }
        }

        public boolean canApplyTheme() {
            int count = this.f۴۵۱h;
            Drawable[] drawables = this.f۴۵۰g;
            for (int i2 = 0; i2 < count; i2++) {
                Drawable d2 = drawables[i2];
                if (d2 == null) {
                    Drawable.ConstantState future = this.f۴۴۹f.get(i2);
                    if (future != null && future.canApplyTheme()) {
                        return true;
                    }
                } else if (d2.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final void b(boolean variable) {
            this.i = variable;
        }

        public final Rect h() {
            if (this.i) {
                return null;
            }
            if (this.k != null || this.j) {
                return this.k;
            }
            n();
            Rect r2 = null;
            Rect t2 = new Rect();
            int count = this.f۴۵۱h;
            Drawable[] drawables = this.f۴۵۰g;
            for (int i2 = 0; i2 < count; i2++) {
                if (drawables[i2].getPadding(t2)) {
                    if (r2 == null) {
                        r2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = t2.left;
                    if (i3 > r2.left) {
                        r2.left = i3;
                    }
                    int i4 = t2.top;
                    if (i4 > r2.top) {
                        r2.top = i4;
                    }
                    int i5 = t2.right;
                    if (i5 > r2.right) {
                        r2.right = i5;
                    }
                    int i6 = t2.bottom;
                    if (i6 > r2.bottom) {
                        r2.bottom = i6;
                    }
                }
            }
            this.j = true;
            this.k = r2;
            return r2;
        }

        public final void a(boolean constant) {
            this.l = constant;
        }

        public final boolean l() {
            return this.l;
        }

        public final int i() {
            if (!this.m) {
                b();
            }
            return this.n;
        }

        public final int e() {
            if (!this.m) {
                b();
            }
            return this.o;
        }

        public final int g() {
            if (!this.m) {
                b();
            }
            return this.p;
        }

        public final int f() {
            if (!this.m) {
                b();
            }
            return this.q;
        }

        /* access modifiers changed from: protected */
        public void b() {
            this.m = true;
            n();
            int count = this.f۴۵۱h;
            Drawable[] drawables = this.f۴۵۰g;
            this.o = -1;
            this.n = -1;
            this.q = 0;
            this.p = 0;
            for (int i2 = 0; i2 < count; i2++) {
                Drawable dr = drawables[i2];
                int s2 = dr.getIntrinsicWidth();
                if (s2 > this.n) {
                    this.n = s2;
                }
                int s3 = dr.getIntrinsicHeight();
                if (s3 > this.o) {
                    this.o = s3;
                }
                int s4 = dr.getMinimumWidth();
                if (s4 > this.p) {
                    this.p = s4;
                }
                int s5 = dr.getMinimumHeight();
                if (s5 > this.q) {
                    this.q = s5;
                }
            }
        }

        public final void b(int duration) {
            this.A = duration;
        }

        public final void c(int duration) {
            this.B = duration;
        }

        public final int j() {
            if (this.r) {
                return this.s;
            }
            n();
            int count = this.f۴۵۱h;
            Drawable[] drawables = this.f۴۵۰g;
            int op = count > 0 ? drawables[0].getOpacity() : -2;
            for (int i2 = 1; i2 < count; i2++) {
                op = Drawable.resolveOpacity(op, drawables[i2].getOpacity());
            }
            this.s = op;
            this.r = true;
            return op;
        }

        public void a(int oldSize, int newSize) {
            Drawable[] newDrawables = new Drawable[newSize];
            System.arraycopy(this.f۴۵۰g, 0, newDrawables, 0, oldSize);
            this.f۴۵۰g = newDrawables;
        }

        public synchronized boolean a() {
            if (this.v) {
                return this.w;
            }
            n();
            this.v = true;
            int count = this.f۴۵۱h;
            Drawable[] drawables = this.f۴۵۰g;
            for (int i2 = 0; i2 < count; i2++) {
                if (drawables[i2].getConstantState() == null) {
                    this.w = false;
                    return false;
                }
            }
            this.w = true;
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void a(c state) {
        this.f۴۳۶c = state;
        int i2 = this.i;
        if (i2 >= 0) {
            this.f۴۳۸e = state.a(i2);
            Drawable drawable = this.f۴۳۸e;
            if (drawable != null) {
                a(drawable);
            }
        }
        this.f۴۳۹f = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a.b.h.d.a.b$b  reason: collision with other inner class name */
    public static class C۰۰۱۹b implements Drawable.Callback {

        /* renamed from: c  reason: collision with root package name */
        private Drawable.Callback f۴۴۳c;

        C۰۰۱۹b() {
        }

        public C۰۰۱۹b a(Drawable.Callback callback) {
            this.f۴۴۳c = callback;
            return this;
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f۴۴۳c;
            this.f۴۴۳c = null;
            return callback;
        }

        public void invalidateDrawable(Drawable who) {
        }

        public void scheduleDrawable(Drawable who, Runnable what, long when) {
            Drawable.Callback callback = this.f۴۴۳c;
            if (callback != null) {
                callback.scheduleDrawable(who, what, when);
            }
        }

        public void unscheduleDrawable(Drawable who, Runnable what) {
            Drawable.Callback callback = this.f۴۴۳c;
            if (callback != null) {
                callback.unscheduleDrawable(who, what);
            }
        }
    }

    static int a(Resources r, int parentDensity) {
        int densityDpi = r == null ? parentDensity : r.getDisplayMetrics().densityDpi;
        if (densityDpi == 0) {
            return 160;
        }
        return densityDpi;
    }
}
