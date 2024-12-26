package p۰۰۰a.p۰۰۵b.p۰۱۹d.p۰۲۰a;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.graphics.drawable.AbstractCb;
import android.support.p۰۴۳v4.graphics.drawable.Ca;

/* renamed from: a.b.d.a.h  reason: invalid class name */
abstract class AbstractCh extends Drawable implements AbstractCb {

    /* renamed from: c  reason: contains not printable characters */
    Drawable f۸۳۵۶c;

    AbstractCh() {
    }

    public void setColorFilter(int color, PorterDuff.Mode mode) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setColorFilter(color, mode);
        } else {
            super.setColorFilter(color, mode);
        }
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return Ca.m۱۲۷۱۸d(drawable);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int level) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setLevel(level);
        }
        return super.onLevelChange(level);
    }

    public void setHotspot(float x, float y) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۲۷۰۶a(drawable, x, y);
        }
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۲۷۰۷a(drawable, left, top, right, bottom);
        }
    }

    public void setFilterBitmap(boolean filter) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setFilterBitmap(filter);
        }
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۲۷۲۱g(drawable);
        }
    }

    public void applyTheme(Resources.Theme t) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            Ca.m۱۲۷۰۹a(drawable, t);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getPadding(padding);
        }
        return super.getPadding(padding);
    }

    public int[] getState() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void setChangingConfigurations(int configs) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            drawable.setChangingConfigurations(configs);
        } else {
            super.setChangingConfigurations(configs);
        }
    }

    public boolean setState(int[] stateSet) {
        Drawable drawable = this.f۸۳۵۶c;
        if (drawable != null) {
            return drawable.setState(stateSet);
        }
        return super.setState(stateSet);
    }
}
