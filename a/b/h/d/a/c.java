package a.b.h.d.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.a;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: c  reason: collision with root package name */
    private Drawable f۴۵۲c;

    public c(Drawable drawable) {
        a(drawable);
    }

    public void draw(Canvas canvas) {
        this.f۴۵۲c.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        this.f۴۵۲c.setBounds(bounds);
    }

    public void setChangingConfigurations(int configs) {
        this.f۴۵۲c.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        return this.f۴۵۲c.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f۴۵۲c.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f۴۵۲c.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f۴۵۲c.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۴۵۲c.setColorFilter(cf);
    }

    public boolean isStateful() {
        return this.f۴۵۲c.isStateful();
    }

    public boolean setState(int[] stateSet) {
        return this.f۴۵۲c.setState(stateSet);
    }

    public int[] getState() {
        return this.f۴۵۲c.getState();
    }

    public void jumpToCurrentState() {
        a.g(this.f۴۵۲c);
    }

    public Drawable getCurrent() {
        return this.f۴۵۲c.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f۴۵۲c.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f۴۵۲c.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f۴۵۲c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f۴۵۲c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f۴۵۲c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f۴۵۲c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f۴۵۲c.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f۴۵۲c.getPadding(padding);
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
        return this.f۴۵۲c.setLevel(level);
    }

    public void setAutoMirrored(boolean mirrored) {
        a.a(this.f۴۵۲c, mirrored);
    }

    public boolean isAutoMirrored() {
        return a.f(this.f۴۵۲c);
    }

    public void setTint(int tint) {
        a.b(this.f۴۵۲c, tint);
    }

    public void setTintList(ColorStateList tint) {
        a.a(this.f۴۵۲c, tint);
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        a.a(this.f۴۵۲c, tintMode);
    }

    public void setHotspot(float x, float y) {
        a.a(this.f۴۵۲c, x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        a.a(this.f۴۵۲c, left, top, right, bottom);
    }

    public Drawable a() {
        return this.f۴۵۲c;
    }

    public void a(Drawable drawable) {
        Drawable drawable2 = this.f۴۵۲c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f۴۵۲c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
