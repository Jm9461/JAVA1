package com.afollestad.materialdialogs.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.p۰۴۳v4.view.Cu;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.Toast;

/* renamed from: com.afollestad.materialdialogs.color.a  reason: invalid class name */
public class Ca extends FrameLayout {

    /* renamed from: c  reason: contains not printable characters */
    private final int f۱۳۲۳۱c;

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۳۲۳۲d;

    /* renamed from: e  reason: contains not printable characters */
    private final Paint f۱۳۲۳۳e;

    /* renamed from: f  reason: contains not printable characters */
    private final Paint f۱۳۲۳۴f;

    /* renamed from: g  reason: contains not printable characters */
    private final Paint f۱۳۲۳۵g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۱۳۲۳۶h;

    public Ca(Context context) {
        this(context, null, 0);
    }

    public Ca(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Resources r = getResources();
        this.f۱۳۲۳۱c = (int) TypedValue.applyDimension(1, 3.0f, r.getDisplayMetrics());
        this.f۱۳۲۳۲d = (int) TypedValue.applyDimension(1, 5.0f, r.getDisplayMetrics());
        this.f۱۳۲۳۴f = new Paint();
        this.f۱۳۲۳۴f.setAntiAlias(true);
        this.f۱۳۲۳۴f.setColor(-1);
        this.f۱۳۲۳۵g = new Paint();
        this.f۱۳۲۳۵g.setAntiAlias(true);
        this.f۱۳۲۳۳e = new Paint();
        this.f۱۳۲۳۳e.setAntiAlias(true);
        m۱۶۶۷۵f(-12303292);
        setWillNotDraw(false);
    }

    /* renamed from: e  reason: contains not printable characters */
    private static int m۱۶۶۷۴e(int color) {
        return Color.argb(Math.round(((float) Color.alpha(color)) * 0.7f), Color.red(color), Color.green(color), Color.blue(color));
    }

    /* renamed from: a  reason: contains not printable characters */
    public static int m۱۶۶۷۰a(int color, float by) {
        if (by == 1.0f) {
            return color;
        }
        float[] hsv = new float[3];
        Color.colorToHSV(color, hsv);
        hsv[2] = hsv[2] * by;
        return Color.HSVToColor(hsv);
    }

    /* renamed from: c  reason: contains not printable characters */
    public static int m۱۶۶۷۲c(int color) {
        return m۱۶۶۷۰a(color, 0.9f);
    }

    /* renamed from: d  reason: contains not printable characters */
    public static int m۱۶۶۷۳d(int color) {
        return m۱۶۶۷۰a(color, 1.1f);
    }

    /* renamed from: f  reason: contains not printable characters */
    private void m۱۶۶۷۵f(int color) {
        this.f۱۳۲۳۵g.setColor(color);
        this.f۱۳۲۳۳e.setColor(m۱۶۶۷۲c(color));
        Drawable selector = m۱۶۶۷۱b(color);
        if (Build.VERSION.SDK_INT >= 21) {
            setForeground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{m۱۶۶۷۳d(color)}), selector, null));
            return;
        }
        setForeground(selector);
    }

    public void setBackgroundColor(int color) {
        m۱۶۶۷۵f(color);
        requestLayout();
        invalidate();
    }

    public void setBackgroundResource(int color) {
        setBackgroundColor(p۰۵۲b.p۰۵۳a.p۰۵۴a.p۰۵۶r.Ca.m۱۵۹۰۴c(getContext(), color));
    }

    @Deprecated
    public void setBackground(Drawable background) {
        throw new IllegalStateException("Cannot use setBackground() on CircleView.");
    }

    @Deprecated
    public void setBackgroundDrawable(Drawable background) {
        throw new IllegalStateException("Cannot use setBackgroundDrawable() on CircleView.");
    }

    @Deprecated
    public void setActivated(boolean activated) {
        throw new IllegalStateException("Cannot use setActivated() on CircleView.");
    }

    public void setSelected(boolean selected) {
        this.f۱۳۲۳۶h = selected;
        requestLayout();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int outerRadius = getMeasuredWidth() / 2;
        if (this.f۱۳۲۳۶h) {
            int whiteRadius = outerRadius - this.f۱۳۲۳۲d;
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) outerRadius, this.f۱۳۲۳۳e);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) whiteRadius, this.f۱۳۲۳۴f);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (whiteRadius - this.f۱۳۲۳۱c), this.f۱۳۲۳۵g);
            return;
        }
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) outerRadius, this.f۱۳۲۳۵g);
    }

    /* renamed from: b  reason: contains not printable characters */
    private Drawable m۱۶۶۷۱b(int color) {
        ShapeDrawable darkerCircle = new ShapeDrawable(new OvalShape());
        darkerCircle.getPaint().setColor(m۱۶۶۷۴e(m۱۶۶۷۳d(color)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, darkerCircle);
        return stateListDrawable;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۶۶۷۶a(int color) {
        int[] screenPos = new int[2];
        Rect displayFrame = new Rect();
        getLocationOnScreen(screenPos);
        getWindowVisibleDisplayFrame(displayFrame);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int midy = screenPos[1] + (height / 2);
        int referenceX = screenPos[0] + (width / 2);
        if (Cu.m۱۳۰۱۴k(this) == 0) {
            referenceX = context.getResources().getDisplayMetrics().widthPixels - referenceX;
        }
        Toast cheatSheet = Toast.makeText(context, String.format("#%06X", Integer.valueOf(16777215 & color)), 0);
        if (midy < displayFrame.height()) {
            cheatSheet.setGravity(8388661, referenceX, (screenPos[1] + height) - displayFrame.top);
        } else {
            cheatSheet.setGravity(81, 0, height);
        }
        cheatSheet.show();
    }
}
