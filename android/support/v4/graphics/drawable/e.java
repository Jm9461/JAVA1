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
import android.support.v4.graphics.drawable.d;
import android.util.Log;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public class e extends d {
    private static Method j;

    e(Drawable drawable) {
        super(drawable);
        d();
    }

    e(d.a state, Resources resources) {
        super(state, resources);
        d();
    }

    public void setHotspot(float x, float y) {
        this.f۱۳۰۰h.setHotspot(x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        this.f۱۳۰۰h.setHotspotBounds(left, top, right, bottom);
    }

    public void getOutline(Outline outline) {
        this.f۱۳۰۰h.getOutline(outline);
    }

    public Rect getDirtyBounds() {
        return this.f۱۳۰۰h.getDirtyBounds();
    }

    @Override // android.support.v4.graphics.drawable.b, android.support.v4.graphics.drawable.d
    public void setTintList(ColorStateList tint) {
        if (b()) {
            super.setTintList(tint);
        } else {
            this.f۱۳۰۰h.setTintList(tint);
        }
    }

    @Override // android.support.v4.graphics.drawable.b, android.support.v4.graphics.drawable.d
    public void setTint(int tintColor) {
        if (b()) {
            super.setTint(tintColor);
        } else {
            this.f۱۳۰۰h.setTint(tintColor);
        }
    }

    @Override // android.support.v4.graphics.drawable.b, android.support.v4.graphics.drawable.d
    public void setTintMode(PorterDuff.Mode tintMode) {
        if (b()) {
            super.setTintMode(tintMode);
        } else {
            this.f۱۳۰۰h.setTintMode(tintMode);
        }
    }

    @Override // android.support.v4.graphics.drawable.d
    public boolean setState(int[] stateSet) {
        if (!super.setState(stateSet)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v4.graphics.drawable.d
    public boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f۱۳۰۰h;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v4.graphics.drawable.d
    public d.a c() {
        return new a(this.f۱۲۹۸f, null);
    }

    private static class a extends d.a {
        a(d.a orig, Resources res) {
            super(orig, res);
        }

        @Override // android.support.v4.graphics.drawable.d.a
        public Drawable newDrawable(Resources res) {
            return new e(this, res);
        }
    }

    private void d() {
        if (j == null) {
            try {
                j = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception ex) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ex);
            }
        }
    }
}
