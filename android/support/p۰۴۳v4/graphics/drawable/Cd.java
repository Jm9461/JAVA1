package android.support.p۰۴۳v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.graphics.drawable.d  reason: invalid class name */
public class Cd extends Drawable implements Drawable.Callback, AbstractCc, AbstractCb {

    /* renamed from: i  reason: contains not printable characters */
    static final PorterDuff.Mode f۱۰۴۹۵i = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: contains not printable characters */
    private int f۱۰۴۹۶c;

    /* renamed from: d  reason: contains not printable characters */
    private PorterDuff.Mode f۱۰۴۹۷d;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۱۰۴۹۸e;

    /* renamed from: f  reason: contains not printable characters */
    AbstractCa f۱۰۴۹۹f;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۱۰۵۰۰g;

    /* renamed from: h  reason: contains not printable characters */
    Drawable f۱۰۵۰۱h;

    Cd(AbstractCa state, Resources res) {
        this.f۱۰۴۹۹f = state;
        m۱۲۷۲۵a(res);
    }

    Cd(Drawable dr) {
        this.f۱۰۴۹۹f = m۱۲۷۳۰c();
        m۱۲۷۲۸a(dr);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۲۷۲۵a(Resources res) {
        Drawable.ConstantState constantState;
        AbstractCa aVar = this.f۱۰۴۹۹f;
        if (aVar != null && (constantState = aVar.f۱۰۵۰۳b) != null) {
            m۱۲۷۲۸a(constantState.newDrawable(res));
        }
    }

    public void jumpToCurrentState() {
        this.f۱۰۵۰۱h.jumpToCurrentState();
    }

    public void draw(Canvas canvas) {
        this.f۱۰۵۰۱h.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        Drawable drawable = this.f۱۰۵۰۱h;
        if (drawable != null) {
            drawable.setBounds(bounds);
        }
    }

    public void setChangingConfigurations(int configs) {
        this.f۱۰۵۰۱h.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        AbstractCa aVar = this.f۱۰۴۹۹f;
        return changingConfigurations | (aVar != null ? aVar.getChangingConfigurations() : 0) | this.f۱۰۵۰۱h.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f۱۰۵۰۱h.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f۱۰۵۰۱h.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f۱۰۵۰۱h.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۱۰۵۰۱h.setColorFilter(cf);
    }

    public boolean isStateful() {
        AbstractCa aVar;
        ColorStateList tintList = (!m۱۲۷۲۹b() || (aVar = this.f۱۰۴۹۹f) == null) ? null : aVar.f۱۰۵۰۴c;
        return (tintList != null && tintList.isStateful()) || this.f۱۰۵۰۱h.isStateful();
    }

    public boolean setState(int[] stateSet) {
        return m۱۲۷۲۶a(stateSet) || this.f۱۰۵۰۱h.setState(stateSet);
    }

    public int[] getState() {
        return this.f۱۰۵۰۱h.getState();
    }

    public Drawable getCurrent() {
        return this.f۱۰۵۰۱h.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f۱۰۵۰۱h.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f۱۰۵۰۱h.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f۱۰۵۰۱h.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f۱۰۵۰۱h.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f۱۰۵۰۱h.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f۱۰۵۰۱h.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f۱۰۵۰۱h.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f۱۰۵۰۱h.getPadding(padding);
    }

    public void setAutoMirrored(boolean mirrored) {
        this.f۱۰۵۰۱h.setAutoMirrored(mirrored);
    }

    public boolean isAutoMirrored() {
        return this.f۱۰۵۰۱h.isAutoMirrored();
    }

    public Drawable.ConstantState getConstantState() {
        AbstractCa aVar = this.f۱۰۴۹۹f;
        if (aVar == null || !aVar.m۱۲۷۳۱a()) {
            return null;
        }
        this.f۱۰۴۹۹f.f۱۰۵۰۲a = getChangingConfigurations();
        return this.f۱۰۴۹۹f;
    }

    public Drawable mutate() {
        if (!this.f۱۰۵۰۰g && super.mutate() == this) {
            this.f۱۰۴۹۹f = m۱۲۷۳۰c();
            Drawable drawable = this.f۱۰۵۰۱h;
            if (drawable != null) {
                drawable.mutate();
            }
            AbstractCa aVar = this.f۱۰۴۹۹f;
            if (aVar != null) {
                Drawable drawable2 = this.f۱۰۵۰۱h;
                aVar.f۱۰۵۰۳b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f۱۰۵۰۰g = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c  reason: contains not printable characters */
    public AbstractCa m۱۲۷۳۰c() {
        return new Cb(this.f۱۰۴۹۹f, null);
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
        return this.f۱۰۵۰۱h.setLevel(level);
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb
    public void setTint(int tint) {
        setTintList(ColorStateList.valueOf(tint));
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb
    public void setTintList(ColorStateList tint) {
        this.f۱۰۴۹۹f.f۱۰۵۰۴c = tint;
        m۱۲۷۲۶a(getState());
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb
    public void setTintMode(PorterDuff.Mode tintMode) {
        this.f۱۰۴۹۹f.f۱۰۵۰۵d = tintMode;
        m۱۲۷۲۶a(getState());
    }

    /* renamed from: a  reason: contains not printable characters */
    private boolean m۱۲۷۲۶a(int[] state) {
        if (!m۱۲۷۲۹b()) {
            return false;
        }
        AbstractCa aVar = this.f۱۰۴۹۹f;
        ColorStateList tintList = aVar.f۱۰۵۰۴c;
        PorterDuff.Mode tintMode = aVar.f۱۰۵۰۵d;
        if (tintList == null || tintMode == null) {
            this.f۱۰۴۹۸e = false;
            clearColorFilter();
        } else {
            int color = tintList.getColorForState(state, tintList.getDefaultColor());
            if (!(this.f۱۰۴۹۸e && color == this.f۱۰۴۹۶c && tintMode == this.f۱۰۴۹۷d)) {
                setColorFilter(color, tintMode);
                this.f۱۰۴۹۶c = color;
                this.f۱۰۴۹۷d = tintMode;
                this.f۱۰۴۹۸e = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public final Drawable m۱۲۷۲۷a() {
        return this.f۱۰۵۰۱h;
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public final void m۱۲۷۲۸a(Drawable dr) {
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
            AbstractCa aVar = this.f۱۰۴۹۹f;
            if (aVar != null) {
                aVar.f۱۰۵۰۳b = dr.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۷۲۹b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: android.support.v4.graphics.drawable.d$a  reason: invalid class name */
    public static abstract class AbstractCa extends Drawable.ConstantState {

        /* renamed from: a  reason: contains not printable characters */
        int f۱۰۵۰۲a;

        /* renamed from: b  reason: contains not printable characters */
        Drawable.ConstantState f۱۰۵۰۳b;

        /* renamed from: c  reason: contains not printable characters */
        ColorStateList f۱۰۵۰۴c = null;

        /* renamed from: d  reason: contains not printable characters */
        PorterDuff.Mode f۱۰۵۰۵d = Cd.f۱۰۴۹۵i;

        public abstract Drawable newDrawable(Resources resources);

        AbstractCa(AbstractCa orig, Resources res) {
            if (orig != null) {
                this.f۱۰۵۰۲a = orig.f۱۰۵۰۲a;
                this.f۱۰۵۰۳b = orig.f۱۰۵۰۳b;
                this.f۱۰۵۰۴c = orig.f۱۰۵۰۴c;
                this.f۱۰۵۰۵d = orig.f۱۰۵۰۵d;
            }
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public int getChangingConfigurations() {
            int i = this.f۱۰۵۰۲a;
            Drawable.ConstantState constantState = this.f۱۰۵۰۳b;
            return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۲۷۳۱a() {
            return this.f۱۰۵۰۳b != null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.graphics.drawable.d$b  reason: invalid class name */
    public static class Cb extends AbstractCa {
        Cb(AbstractCa orig, Resources res) {
            super(orig, res);
        }

        @Override // android.support.p۰۴۳v4.graphics.drawable.Cd.AbstractCa
        public Drawable newDrawable(Resources res) {
            return new Cd(this, res);
        }
    }
}
