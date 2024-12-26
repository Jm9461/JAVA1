package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v4.graphics.drawable.d, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cd extends Drawable implements Drawable.Callback, InterfaceCc, InterfaceCb {

    /* renamed from: i, reason: contains not printable characters */
    static final PorterDuff.Mode f۱۰۴۹۵i = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: contains not printable characters */
    private int f۱۰۴۹۶c;

    /* renamed from: d, reason: contains not printable characters */
    private PorterDuff.Mode f۱۰۴۹۷d;

    /* renamed from: e, reason: contains not printable characters */
    private boolean f۱۰۴۹۸e;

    /* renamed from: f, reason: contains not printable characters */
    a f۱۰۴۹۹f;

    /* renamed from: g, reason: contains not printable characters */
    private boolean f۱۰۵۰۰g;

    /* renamed from: h, reason: contains not printable characters */
    Drawable f۱۰۵۰۱h;

    Cd(a state, Resources res) {
        this.f۱۰۴۹۹f = state;
        m۱۰۶۵۵a(res);
    }

    Cd(Drawable dr) {
        this.f۱۰۴۹۹f = mo۱۰۶۶۴c();
        mo۱۰۶۵۸a(dr);
    }

    /* renamed from: a, reason: contains not printable characters */
    private void m۱۰۶۵۵a(Resources res) {
        Drawable.ConstantState constantState;
        a aVar = this.f۱۰۴۹۹f;
        if (aVar != null && (constantState = aVar.f۱۰۵۰۳b) != null) {
            mo۱۰۶۵۸a(constantState.newDrawable(res));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f۱۰۵۰۱h.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f۱۰۵۰۱h.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۱۰۵۰۱h;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int configs) {
        this.f۱۰۵۰۱h.setChangingConfigurations(configs);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        a aVar = this.f۱۰۴۹۹f;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f۱۰۵۰۱h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean dither) {
        this.f۱۰۵۰۱h.setDither(dither);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean filter) {
        this.f۱۰۵۰۱h.setFilterBitmap(filter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f۱۰۵۰۱h.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.f۱۰۵۰۱h.setColorFilter(cf);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        a aVar;
        ColorStateList tintList = (!mo۱۰۶۶۳b() || (aVar = this.f۱۰۴۹۹f) == null) ? null : aVar.f۱۰۵۰۴c;
        return (tintList != null && tintList.isStateful()) || this.f۱۰۵۰۱h.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] stateSet) {
        boolean handled = this.f۱۰۵۰۱h.setState(stateSet);
        boolean handled2 = m۱۰۶۵۶a(stateSet) || handled;
        return handled2;
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f۱۰۵۰۱h.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f۱۰۵۰۱h.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f۱۰۵۰۱h.setVisible(visible, restart);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f۱۰۵۰۱h.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f۱۰۵۰۱h.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f۱۰۵۰۱h.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f۱۰۵۰۱h.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f۱۰۵۰۱h.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f۱۰۵۰۱h.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        return this.f۱۰۵۰۱h.getPadding(padding);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean mirrored) {
        this.f۱۰۵۰۱h.setAutoMirrored(mirrored);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f۱۰۵۰۱h.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        a aVar = this.f۱۰۴۹۹f;
        if (aVar != null && aVar.m۱۰۶۶۱a()) {
            this.f۱۰۴۹۹f.f۱۰۵۰۲a = getChangingConfigurations();
            return this.f۱۰۴۹۹f;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f۱۰۵۰۰g && super.mutate() == this) {
            this.f۱۰۴۹۹f = mo۱۰۶۶۴c();
            Drawable drawable = this.f۱۰۵۰۱h;
            if (drawable != null) {
                drawable.mutate();
            }
            a aVar = this.f۱۰۴۹۹f;
            if (aVar != null) {
                Drawable drawable2 = this.f۱۰۵۰۱h;
                aVar.f۱۰۵۰۳b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f۱۰۵۰۰g = true;
        }
        return this;
    }

    /* renamed from: c, reason: contains not printable characters */
    a mo۱۰۶۶۴c() {
        return new b(this.f۱۰۴۹۹f, null);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable who) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable who, Runnable what, long when) {
        scheduleSelf(what, when);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable who, Runnable what) {
        unscheduleSelf(what);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int level) {
        return this.f۱۰۵۰۱h.setLevel(level);
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTint(int tint) {
        setTintList(ColorStateList.valueOf(tint));
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTintList(ColorStateList tint) {
        this.f۱۰۴۹۹f.f۱۰۵۰۴c = tint;
        m۱۰۶۵۶a(getState());
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f۱۰۴۹۹f.f۱۰۵۰۵d = tintMode;
        m۱۰۶۵۶a(getState());
    }

    /* renamed from: a, reason: contains not printable characters */
    private boolean m۱۰۶۵۶a(int[] state) {
        if (!mo۱۰۶۶۳b()) {
            return false;
        }
        a aVar = this.f۱۰۴۹۹f;
        ColorStateList tintList = aVar.f۱۰۵۰۴c;
        PorterDuff.Mode tintMode = aVar.f۱۰۵۰۵d;
        if (tintList != null && tintMode != null) {
            int color = tintList.getColorForState(state, tintList.getDefaultColor());
            if (!this.f۱۰۴۹۸e || color != this.f۱۰۴۹۶c || tintMode != this.f۱۰۴۹۷d) {
                setColorFilter(color, tintMode);
                this.f۱۰۴۹۶c = color;
                this.f۱۰۴۹۷d = tintMode;
                this.f۱۰۴۹۸e = true;
                return true;
            }
        } else {
            this.f۱۰۴۹۸e = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.support.v4.graphics.drawable.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public final Drawable mo۱۰۶۵۷a() {
        return this.f۱۰۵۰۱h;
    }

    @Override // android.support.v4.graphics.drawable.InterfaceCc
    /* renamed from: a, reason: contains not printable characters */
    public final void mo۱۰۶۵۸a(Drawable dr) {
        Drawable drawable = this.f۱۰۵۰۱h;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f۱۰۵۰۱h = dr;
        if (dr != null) {
            dr.setCallback(this);
            setVisible(dr.isVisible(), true);
            setState(dr.getState());
            setLevel(dr.getLevel());
            setBounds(dr.getBounds());
            a aVar = this.f۱۰۴۹۹f;
            if (aVar != null) {
                aVar.f۱۰۵۰۳b = dr.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* renamed from: b, reason: contains not printable characters */
    protected boolean mo۱۰۶۶۳b() {
        return true;
    }

    /* renamed from: android.support.v4.graphics.drawable.d$a */
    protected static abstract class a extends Drawable.ConstantState {

        /* renamed from: a, reason: contains not printable characters */
        int f۱۰۵۰۲a;

        /* renamed from: b, reason: contains not printable characters */
        Drawable.ConstantState f۱۰۵۰۳b;

        /* renamed from: c, reason: contains not printable characters */
        ColorStateList f۱۰۵۰۴c;

        /* renamed from: d, reason: contains not printable characters */
        PorterDuff.Mode f۱۰۵۰۵d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public abstract Drawable newDrawable(Resources resources);

        a(a orig, Resources res) {
            this.f۱۰۵۰۴c = null;
            this.f۱۰۵۰۵d = Cd.f۱۰۴۹۵i;
            if (orig != null) {
                this.f۱۰۵۰۲a = orig.f۱۰۵۰۲a;
                this.f۱۰۵۰۳b = orig.f۱۰۵۰۳b;
                this.f۱۰۵۰۴c = orig.f۱۰۵۰۴c;
                this.f۱۰۵۰۵d = orig.f۱۰۵۰۵d;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            int i = this.f۱۰۵۰۲a;
            Drawable.ConstantState constantState = this.f۱۰۵۰۳b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        /* renamed from: a, reason: contains not printable characters */
        boolean m۱۰۶۶۱a() {
            return this.f۱۰۵۰۳b != null;
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.d$b */
    private static class b extends a {
        b(a orig, Resources res) {
            super(orig, res);
        }

        @Override // android.support.v4.graphics.drawable.Cd.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            return new Cd(this, res);
        }
    }
}
