package android.support.p۰۴۳v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p۰۴۳v4.graphics.drawable.Cd;
import android.util.Log;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.graphics.drawable.e  reason: invalid class name */
public class Ce extends Cd {

    /* renamed from: j  reason: contains not printable characters */
    private static Method f۱۰۵۰۶j;

    Ce(Drawable drawable) {
        super(drawable);
        m۱۲۷۳۲d();
    }

    Ce(Cd.AbstractCa state, Resources resources) {
        super(state, resources);
        m۱۲۷۳۲d();
    }

    public void setHotspot(float x, float y) {
        this.f۱۰۵۰۱h.setHotspot(x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        this.f۱۰۵۰۱h.setHotspotBounds(left, top, right, bottom);
    }

    public void getOutline(Outline outline) {
        this.f۱۰۵۰۱h.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.f۱۰۵۰۱h.getDirtyBounds();
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb, android.support.p۰۴۳v4.graphics.drawable.Cd
    public void setTintList(ColorStateList tint) {
        if (m۱۲۷۳۳b()) {
            super.setTintList(tint);
        } else {
            this.f۱۰۵۰۱h.setTintList(tint);
        }
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb, android.support.p۰۴۳v4.graphics.drawable.Cd
    public void setTint(int tintColor) {
        if (m۱۲۷۳۳b()) {
            super.setTint(tintColor);
        } else {
            this.f۱۰۵۰۱h.setTint(tintColor);
        }
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.AbstractCb, android.support.p۰۴۳v4.graphics.drawable.Cd
    public void setTintMode(PorterDuff.Mode tintMode) {
        if (m۱۲۷۳۳b()) {
            super.setTintMode(tintMode);
        } else {
            this.f۱۰۵۰۱h.setTintMode(tintMode);
        }
    }

    @Override // android.support.p۰۴۳v4.graphics.drawable.Cd
    public boolean setState(int[] stateSet) {
        if (!super.setState(stateSet)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۳v4.graphics.drawable.Cd
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۲۷۳۳b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f۱۰۵۰۱h;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p۰۴۳v4.graphics.drawable.Cd
    /* renamed from: c  reason: contains not printable characters */
    public Cd.AbstractCa m۱۲۷۳۴c() {
        return new Ca(this.f۱۰۴۹۹f, null);
    }

    /* renamed from: android.support.v4.graphics.drawable.e$a  reason: invalid class name */
    private static class Ca extends Cd.AbstractCa {
        Ca(Cd.AbstractCa orig, Resources res) {
            super(orig, res);
        }

        @Override // android.support.p۰۴۳v4.graphics.drawable.Cd.AbstractCa
        public Drawable newDrawable(Resources res) {
            return new Ce(this, res);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۲۷۳۲d() {
        if (f۱۰۵۰۶j == null) {
            try {
                f۱۰۵۰۶j = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ex);
            }
        }
    }
}
