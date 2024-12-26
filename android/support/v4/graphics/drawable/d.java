package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
public class d extends Drawable implements Drawable.Callback, c, b {
    static final PorterDuff.Mode i = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    private int f۱۲۹۵c;

    /* renamed from: d  reason: collision with root package name */
    private PorterDuff.Mode f۱۲۹۶d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f۱۲۹۷e;

    /* renamed from: f  reason: collision with root package name */
    a f۱۲۹۸f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f۱۲۹۹g;

    /* renamed from: h  reason: collision with root package name */
    Drawable f۱۳۰۰h;

    d(a state, Resources res) {
        this.f۱۲۹۸f = state;
        a(res);
    }

    d(Drawable dr) {
        this.f۱۲۹۸f = c();
        a(dr);
    }

    private void a(Resources res) {
        Drawable.ConstantState constantState;
        a aVar = this.f۱۲۹۸f;
        if (aVar != null && (constantState = aVar.f۱۳۰۲b) != null) {
            a(constantState.newDrawable(res));
        }
    }

    public void jumpToCurrentState() {
        this.f۱۳۰۰h.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f۱۳۰۰h.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۱۳۰۰h;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public void setChangingConfigurations(int configs) {
        this.f۱۳۰۰h.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        a aVar = this.f۱۲۹۸f;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f۱۳۰۰h.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f۱۳۰۰h.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f۱۳۰۰h.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f۱۳۰۰h.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۱۳۰۰h.setColorFilter(cf);
    }

    public boolean isStateful() {
        a aVar;
        ColorStateList tintList = (!b() || (aVar = this.f۱۲۹۸f) == null) ? null : aVar.f۱۳۰۳c;
        return (tintList != null && tintList.isStateful()) || this.f۱۳۰۰h.isStateful();
    }

    public boolean setState(int[] stateSet) {
        return a(stateSet) || this.f۱۳۰۰h.setState(stateSet);
    }

    public int[] getState() {
        return this.f۱۳۰۰h.getState();
    }

    public Drawable getCurrent() {
        return this.f۱۳۰۰h.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f۱۳۰۰h.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f۱۳۰۰h.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f۱۳۰۰h.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f۱۳۰۰h.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f۱۳۰۰h.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f۱۳۰۰h.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f۱۳۰۰h.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f۱۳۰۰h.getPadding(padding);
    }

    public void setAutoMirrored(boolean mirrored) {
        this.f۱۳۰۰h.setAutoMirrored(mirrored);
    }

    public boolean isAutoMirrored() {
        return this.f۱۳۰۰h.isAutoMirrored();
    }

    public Drawable.ConstantState getConstantState() {
        a aVar = this.f۱۲۹۸f;
        if (aVar == null || !aVar.a()) {
            return null;
        }
        this.f۱۲۹۸f.f۱۳۰۱a = getChangingConfigurations();
        return this.f۱۲۹۸f;
    }

    public Drawable mutate() {
        if (!this.f۱۲۹۹g && super.mutate() == this) {
            this.f۱۲۹۸f = c();
            Drawable drawable = this.f۱۳۰۰h;
            if (drawable != null) {
                drawable.mutate();
            }
            a aVar = this.f۱۲۹۸f;
            if (aVar != null) {
                Drawable drawable2 = this.f۱۳۰۰h;
                aVar.f۱۳۰۲b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f۱۲۹۹g = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public a c() {
        return new b(this.f۱۲۹۸f, null);
    }

    public void invalidateDrawable(Drawable who) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        scheduleSelf(what, when);
    }

    public void unscheduleDrawable(Drawable who, Runnable what) {
        unscheduleSelf(what);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int level) {
        return this.f۱۳۰۰h.setLevel(level);
    }

    @Override // android.support.v4.graphics.drawable.b
    public void setTint(int tint) {
        setTintList(ColorStateList.valueOf(tint));
    }

    @Override // android.support.v4.graphics.drawable.b
    public void setTintList(ColorStateList tint) {
        this.f۱۲۹۸f.f۱۳۰۳c = tint;
        a(getState());
    }

    @Override // android.support.v4.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f۱۲۹۸f.f۱۳۰۴d = tintMode;
        a(getState());
    }

    private boolean a(int[] state) {
        if (!b()) {
            return false;
        }
        a aVar = this.f۱۲۹۸f;
        ColorStateList tintList = aVar.f۱۳۰۳c;
        PorterDuff.Mode tintMode = aVar.f۱۳۰۴d;
        if (tintList == null || tintMode == null) {
            this.f۱۲۹۷e = false;
            clearColorFilter();
        } else {
            int color = tintList.getColorForState(state, tintList.getDefaultColor());
            if (!(this.f۱۲۹۷e && color == this.f۱۲۹۵c && tintMode == this.f۱۲۹۶d)) {
                setColorFilter(color, tintMode);
                this.f۱۲۹۵c = color;
                this.f۱۲۹۶d = tintMode;
                this.f۱۲۹۷e = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v4.graphics.drawable.c
    public final Drawable a() {
        return this.f۱۳۰۰h;
    }

    @Override // android.support.v4.graphics.drawable.c
    public final void a(Drawable dr) {
        Drawable drawable = this.f۱۳۰۰h;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f۱۳۰۰h = dr;
        if (dr != null) {
            dr.setCallback(this);
            setVisible(dr.isVisible(), true);
            setState(dr.getState());
            setLevel(dr.getLevel());
            setBounds(dr.getBounds());
            a aVar = this.f۱۲۹۸f;
            if (aVar != null) {
                aVar.f۱۳۰۲b = dr.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return true;
    }

    /* access modifiers changed from: protected */
    public static abstract class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f۱۳۰۱a;

        /* renamed from: b  reason: collision with root package name */
        Drawable.ConstantState f۱۳۰۲b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f۱۳۰۳c = null;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f۱۳۰۴d = d.i;

        public abstract Drawable newDrawable(Resources resources);

        a(a orig, Resources res) {
            if (orig != null) {
                this.f۱۳۰۱a = orig.f۱۳۰۱a;
                this.f۱۳۰۲b = orig.f۱۳۰۲b;
                this.f۱۳۰۳c = orig.f۱۳۰۳c;
                this.f۱۳۰۴d = orig.f۱۳۰۴d;
            }
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public int getChangingConfigurations() {
            int i = this.f۱۳۰۱a;
            Drawable.ConstantState constantState = this.f۱۳۰۲b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.f۱۳۰۲b != null;
        }
    }

    /* access modifiers changed from: private */
    public static class b extends a {
        b(a orig, Resources res) {
            super(orig, res);
        }

        @Override // android.support.v4.graphics.drawable.d.a
        public Drawable newDrawable(Resources res) {
            return new d(this, res);
        }
    }
}
