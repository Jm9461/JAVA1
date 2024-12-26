package android.support.v4.graphics.drawable;

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
import android.support.v4.graphics.drawable.Cd;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.drawable.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ce extends Cd {

    /* renamed from: j, reason: contains not printable characters */
    private static Method f۱۰۵۰۶j;

    Ce(Drawable drawable) {
        super(drawable);
        m۱۰۶۶۲d();
    }

    Ce(Cd.a state, Resources resources) {
        super(state, resources);
        m۱۰۶۶۲d();
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float x, float y) {
        this.f۱۰۵۰۱h.setHotspot(x, y);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int left, int top, int right, int bottom) {
        this.f۱۰۵۰۱h.setHotspotBounds(left, top, right, bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f۱۰۵۰۱h.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f۱۰۵۰۱h.getDirtyBounds();
    }

    @Override // android.support.v4.graphics.drawable.Cd, android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTintList(ColorStateList tint) {
        if (mo۱۰۶۶۳b()) {
            super.setTintList(tint);
        } else {
            this.f۱۰۵۰۱h.setTintList(tint);
        }
    }

    @Override // android.support.v4.graphics.drawable.Cd, android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTint(int tintColor) {
        if (mo۱۰۶۶۳b()) {
            super.setTint(tintColor);
        } else {
            this.f۱۰۵۰۱h.setTint(tintColor);
        }
    }

    @Override // android.support.v4.graphics.drawable.Cd, android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.InterfaceCb
    public void setTintMode(PorterDuff.Mode tintMode) {
        if (mo۱۰۶۶۳b()) {
            super.setTintMode(tintMode);
        } else {
            this.f۱۰۵۰۱h.setTintMode(tintMode);
        }
    }

    @Override // android.support.v4.graphics.drawable.Cd, android.graphics.drawable.Drawable
    public boolean setState(int[] stateSet) {
        if (super.setState(stateSet)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.support.v4.graphics.drawable.Cd
    /* renamed from: b, reason: contains not printable characters */
    protected boolean mo۱۰۶۶۳b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f۱۰۵۰۱h;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    @Override // android.support.v4.graphics.drawable.Cd
    /* renamed from: c, reason: contains not printable characters */
    Cd.a mo۱۰۶۶۴c() {
        return new a(this.f۱۰۴۹۹f, null);
    }

    /* renamed from: android.support.v4.graphics.drawable.e$a */
    private static class a extends Cd.a {
        a(Cd.a orig, Resources res) {
            super(orig, res);
        }

        @Override // android.support.v4.graphics.drawable.Cd.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources res) {
            return new Ce(this, res);
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۰۶۶۲d() {
        if (f۱۰۵۰۶j == null) {
            try {
                f۱۰۵۰۶j = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ex);
            }
        }
    }
}
