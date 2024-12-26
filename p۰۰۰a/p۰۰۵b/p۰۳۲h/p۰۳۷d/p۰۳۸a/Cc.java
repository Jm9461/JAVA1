package p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۷d.p۰۳۸a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۳v4.graphics.drawable.Ca;

/* renamed from: a.b.h.d.a.c  reason: invalid class name */
public class Cc extends Drawable implements Drawable.Callback {

    /* renamed from: c  reason: contains not printable characters */
    private Drawable f۸۸۶۱c;

    public Cc(Drawable drawable) {
        m۱۰۷۴۸a(drawable);
    }

    public void draw(Canvas canvas) {
        this.f۸۸۶۱c.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect bounds) {
        this.f۸۸۶۱c.setBounds(bounds);
    }

    public void setChangingConfigurations(int configs) {
        this.f۸۸۶۱c.setChangingConfigurations(configs);
    }

    public int getChangingConfigurations() {
        return this.f۸۸۶۱c.getChangingConfigurations();
    }

    public void setDither(boolean dither) {
        this.f۸۸۶۱c.setDither(dither);
    }

    public void setFilterBitmap(boolean filter) {
        this.f۸۸۶۱c.setFilterBitmap(filter);
    }

    public void setAlpha(int alpha) {
        this.f۸۸۶۱c.setAlpha(alpha);
    }

    public void setColorFilter(ColorFilter cf) {
        this.f۸۸۶۱c.setColorFilter(cf);
    }

    public boolean isStateful() {
        return this.f۸۸۶۱c.isStateful();
    }

    public boolean setState(int[] stateSet) {
        return this.f۸۸۶۱c.setState(stateSet);
    }

    public int[] getState() {
        return this.f۸۸۶۱c.getState();
    }

    public void jumpToCurrentState() {
        Ca.m۱۲۷۲۱g(this.f۸۸۶۱c);
    }

    public Drawable getCurrent() {
        return this.f۸۸۶۱c.getCurrent();
    }

    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f۸۸۶۱c.setVisible(visible, restart);
    }

    public int getOpacity() {
        return this.f۸۸۶۱c.getOpacity();
    }

    public Region getTransparentRegion() {
        return this.f۸۸۶۱c.getTransparentRegion();
    }

    public int getIntrinsicWidth() {
        return this.f۸۸۶۱c.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f۸۸۶۱c.getIntrinsicHeight();
    }

    public int getMinimumWidth() {
        return this.f۸۸۶۱c.getMinimumWidth();
    }

    public int getMinimumHeight() {
        return this.f۸۸۶۱c.getMinimumHeight();
    }

    public boolean getPadding(Rect padding) {
        return this.f۸۸۶۱c.getPadding(padding);
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
        return this.f۸۸۶۱c.setLevel(level);
    }

    public void setAutoMirrored(boolean mirrored) {
        Ca.m۱۲۷۱۲a(this.f۸۸۶۱c, mirrored);
    }

    public boolean isAutoMirrored() {
        return Ca.m۱۲۷۲۰f(this.f۸۸۶۱c);
    }

    public void setTint(int tint) {
        Ca.m۱۲۷۱۶b(this.f۸۸۶۱c, tint);
    }

    public void setTintList(ColorStateList tint) {
        Ca.m۱۲۷۰۸a(this.f۸۸۶۱c, tint);
    }

    public void setTintMode(PorterDuff.Mode tintMode) {
        Ca.m۱۲۷۱۱a(this.f۸۸۶۱c, tintMode);
    }

    public void setHotspot(float x, float y) {
        Ca.m۱۲۷۰۶a(this.f۸۸۶۱c, x, y);
    }

    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Ca.m۱۲۷۰۷a(this.f۸۸۶۱c, left, top, right, bottom);
    }

    /* renamed from: a  reason: contains not printable characters */
    public Drawable m۱۰۷۴۷a() {
        return this.f۸۸۶۱c;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۷۴۸a(Drawable drawable) {
        Drawable drawable2 = this.f۸۸۶۱c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f۸۸۶۱c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
