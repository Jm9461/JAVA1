package android.support.design.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p۰۴۷v7.widget.Co0;
import android.util.AttributeSet;
import android.view.Gravity;
import p۰۰۰a.p۰۰۵b.p۰۰۸c.Ck;

/* renamed from: android.support.design.internal.a  reason: invalid class name */
public class Ca extends Co0 {

    /* renamed from: r  reason: contains not printable characters */
    private Drawable f۹۴۸۰r;

    /* renamed from: s  reason: contains not printable characters */
    private final Rect f۹۴۸۱s;

    /* renamed from: t  reason: contains not printable characters */
    private final Rect f۹۴۸۲t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۹۴۸۳u;

    /* renamed from: v  reason: contains not printable characters */
    protected boolean f۹۴۸۴v;

    /* renamed from: w  reason: contains not printable characters */
    boolean f۹۴۸۵w;

    public Ca(Context context) {
        this(context, null);
    }

    public Ca(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Ca(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f۹۴۸۱s = new Rect();
        this.f۹۴۸۲t = new Rect();
        this.f۹۴۸۳u = 119;
        this.f۹۴۸۴v = true;
        this.f۹۴۸۵w = false;
        TypedArray a = Cg.m۱۱۳۶۰c(context, attrs, Ck.ForegroundLinearLayout, defStyle, 0, new int[0]);
        this.f۹۴۸۳u = a.getInt(Ck.ForegroundLinearLayout_android_foregroundGravity, this.f۹۴۸۳u);
        Drawable d = a.getDrawable(Ck.ForegroundLinearLayout_android_foreground);
        if (d != null) {
            setForeground(d);
        }
        this.f۹۴۸۴v = a.getBoolean(Ck.ForegroundLinearLayout_foregroundInsidePadding, true);
        a.recycle();
    }

    public int getForegroundGravity() {
        return this.f۹۴۸۳u;
    }

    public void setForegroundGravity(int foregroundGravity) {
        if (this.f۹۴۸۳u != foregroundGravity) {
            if ((8388615 & foregroundGravity) == 0) {
                foregroundGravity |= 8388611;
            }
            if ((foregroundGravity & 112) == 0) {
                foregroundGravity |= 48;
            }
            this.f۹۴۸۳u = foregroundGravity;
            if (this.f۹۴۸۳u == 119 && this.f۹۴۸۰r != null) {
                this.f۹۴۸۰r.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.f۹۴۸۰r;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f۹۴۸۰r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f۹۴۸۰r;
        if (drawable != null && drawable.isStateful()) {
            this.f۹۴۸۰r.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f۹۴۸۰r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f۹۴۸۰r);
            }
            this.f۹۴۸۰r = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f۹۴۸۳u == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public Drawable getForeground() {
        return this.f۹۴۸۰r;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.widget.Co0
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.f۹۴۸۵w |= changed;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.f۹۴۸۵w = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f۹۴۸۰r != null) {
            Drawable foreground = this.f۹۴۸۰r;
            if (this.f۹۴۸۵w) {
                this.f۹۴۸۵w = false;
                Rect selfBounds = this.f۹۴۸۱s;
                Rect overlayBounds = this.f۹۴۸۲t;
                int w = getRight() - getLeft();
                int h = getBottom() - getTop();
                if (this.f۹۴۸۴v) {
                    selfBounds.set(0, 0, w, h);
                } else {
                    selfBounds.set(getPaddingLeft(), getPaddingTop(), w - getPaddingRight(), h - getPaddingBottom());
                }
                Gravity.apply(this.f۹۴۸۳u, foreground.getIntrinsicWidth(), foreground.getIntrinsicHeight(), selfBounds, overlayBounds);
                foreground.setBounds(overlayBounds);
            }
            foreground.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float x, float y) {
        super.drawableHotspotChanged(x, y);
        Drawable drawable = this.f۹۴۸۰r;
        if (drawable != null) {
            drawable.setHotspot(x, y);
        }
    }
}
