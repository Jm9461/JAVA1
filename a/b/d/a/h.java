package a.b.d.a;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;
import android.support.v4.graphics.drawable.b;

abstract class h extends Drawable implements b {

    /* renamed from: c  reason: collision with root package name */
    Drawable f۱۰۱c;

    h() {
    }

    public void setColorFilter(int color, PorterDuff.Mode mode) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.setColorFilter(color, mode);
        } else {
            super.setColorFilter(color, mode);
        }
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return a.d(drawable);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int level) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return super.onLevelChange(level);
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            a.a(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            a.a(drawable, left, top, right, bottom);
        }
    }

    public void setFilterBitmap(boolean filter) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.setFilterBitmap(filter);
        }
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            a.g(drawable);
        }
    }

    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            a.a(drawable, t);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getPadding(padding);
        }
        return super.getPadding(padding);
    }

    public int[] getState() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int configs) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            drawable.setChangingConfigurations(configs);
        } else {
            super.setChangingConfigurations(configs);
        }
    }

    public boolean setState(int[] stateSet) {
        Drawable drawable = this.f۱۰۱c;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        return super.setState(stateSet);
    }
}
