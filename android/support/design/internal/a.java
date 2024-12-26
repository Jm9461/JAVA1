package android.support.design.internal;

import a.b.c.k;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.o0;
import android.util.AttributeSet;
import android.view.Gravity;

public class a extends o0 {
    private Drawable r;
    private final Rect s;
    private final Rect t;
    private int u;
    protected boolean v;
    boolean w;

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public a(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.s = new Rect();
        this.t = new Rect();
        this.u = 119;
        this.v = true;
        this.w = false;
        TypedArray a2 = g.c(context, attrs, k.ForegroundLinearLayout, defStyle, 0, new int[0]);
        this.u = a2.getInt(k.ForegroundLinearLayout_android_foregroundGravity, this.u);
        Drawable d2 = a2.getDrawable(k.ForegroundLinearLayout_android_foreground);
        if (d2 != null) {
            setForeground(d2);
        }
        this.v = a2.getBoolean(k.ForegroundLinearLayout_foregroundInsidePadding, true);
        a2.recycle();
    }

    public int getForegroundGravity() {
        return this.u;
    }

    public void setForegroundGravity(int foregroundGravity) {
        if (this.u != foregroundGravity) {
            if ((8388615 & foregroundGravity) == 0) {
                foregroundGravity |= 8388611;
            }
            if ((foregroundGravity & 112) == 0) {
                foregroundGravity |= 48;
            }
            this.u = foregroundGravity;
            if (this.u == 119 && this.r != null) {
                this.r.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable who) {
        return super.verifyDrawable(who) || who == this.r;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.r;
        if (drawable != null && drawable.isStateful()) {
            this.r.setState(getDrawableState());
        }
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.r);
            }
            this.r = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.u == 119) {
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
        return this.r;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.widget.o0
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.w |= changed;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        this.w = true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.r != null) {
            Drawable foreground = this.r;
            if (this.w) {
                this.w = false;
                Rect selfBounds = this.s;
                Rect overlayBounds = this.t;
                int w2 = getRight() - getLeft();
                int h2 = getBottom() - getTop();
                if (this.v) {
                    selfBounds.set(0, 0, w2, h2);
                } else {
                    selfBounds.set(getPaddingLeft(), getPaddingTop(), w2 - getPaddingRight(), h2 - getPaddingBottom());
                }
                Gravity.apply(this.u, foreground.getIntrinsicWidth(), foreground.getIntrinsicHeight(), selfBounds, overlayBounds);
                foreground.setBounds(overlayBounds);
            }
            foreground.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float x, float y) {
        super.drawableHotspotChanged(x, y);
        Drawable drawable = this.r;
        if (drawable != null) {
            drawable.setHotspot(x, y);
        }
    }
}
