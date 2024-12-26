package p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۶d.p۱۹۷a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.Ca;

/* renamed from: a.b.h.d.a.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cc extends Drawable implements Drawable.Callback {

    /* renamed from: c, reason: contains not printable characters */
    private Drawable f۸۸۶۱c;

    public Cc(Drawable drawable) {
        m۸۶۷۹a(drawable);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f۸۸۶۱c.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        this.f۸۸۶۱c.setBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int configs) {
        this.f۸۸۶۱c.setChangingConfigurations(configs);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f۸۸۶۱c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean dither) {
        this.f۸۸۶۱c.setDither(dither);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean filter) {
        this.f۸۸۶۱c.setFilterBitmap(filter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.f۸۸۶۱c.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter cf) {
        this.f۸۸۶۱c.setColorFilter(cf);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f۸۸۶۱c.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] stateSet) {
        return this.f۸۸۶۱c.setState(stateSet);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f۸۸۶۱c.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Ca.m۱۰۶۵۱g(this.f۸۸۶۱c);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f۸۸۶۱c.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean visible, boolean restart) {
        return super.setVisible(visible, restart) || this.f۸۸۶۱c.setVisible(visible, restart);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f۸۸۶۱c.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f۸۸۶۱c.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f۸۸۶۱c.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f۸۸۶۱c.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f۸۸۶۱c.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f۸۸۶۱c.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        return this.f۸۸۶۱c.getPadding(padding);
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
        return this.f۸۸۶۱c.setLevel(level);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean mirrored) {
        Ca.m۱۰۶۴۲a(this.f۸۸۶۱c, mirrored);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return Ca.m۱۰۶۵۰f(this.f۸۸۶۱c);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int tint) {
        Ca.m۱۰۶۴۶b(this.f۸۸۶۱c, tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        Ca.m۱۰۶۳۸a(this.f۸۸۶۱c, tint);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        Ca.m۱۰۶۴۱a(this.f۸۸۶۱c, tintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float x, float y) {
        Ca.m۱۰۶۳۶a(this.f۸۸۶۱c, x, y);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int left, int top, int right, int bottom) {
        Ca.m۱۰۶۳۷a(this.f۸۸۶۱c, left, top, right, bottom);
    }

    /* renamed from: a, reason: contains not printable characters */
    public Drawable m۸۶۷۸a() {
        return this.f۸۸۶۱c;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۸۶۷۹a(Drawable drawable) {
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
