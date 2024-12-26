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
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import android.widget.Toast;

public class a extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    private final int f۲۷۰۵c;

    /* renamed from: d  reason: collision with root package name */
    private final int f۲۷۰۶d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f۲۷۰۷e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f۲۷۰۸f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f۲۷۰۹g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f۲۷۱۰h;

    public a(Context context) {
        this(context, null, 0);
    }

    public a(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Resources r = getResources();
        this.f۲۷۰۵c = (int) TypedValue.applyDimension(1, 3.0f, r.getDisplayMetrics());
        this.f۲۷۰۶d = (int) TypedValue.applyDimension(1, 5.0f, r.getDisplayMetrics());
        this.f۲۷۰۸f = new Paint();
        this.f۲۷۰۸f.setAntiAlias(true);
        this.f۲۷۰۸f.setColor(-1);
        this.f۲۷۰۹g = new Paint();
        this.f۲۷۰۹g.setAntiAlias(true);
        this.f۲۷۰۷e = new Paint();
        this.f۲۷۰۷e.setAntiAlias(true);
        f(-12303292);
        setWillNotDraw(false);
    }

    private static int e(int color) {
        return Color.argb(Math.round(((float) Color.alpha(color)) * 0.7f), Color.red(color), Color.green(color), Color.blue(color));
    }

    public static int a(int color, float by) {
        if (by == 1.0f) {
            return color;
        }
        float[] hsv = new float[3];
        Color.colorToHSV(color, hsv);
        hsv[2] = hsv[2] * by;
        return Color.HSVToColor(hsv);
    }

    public static int c(int color) {
        return a(color, 0.9f);
    }

    public static int d(int color) {
        return a(color, 1.1f);
    }

    private void f(int color) {
        this.f۲۷۰۹g.setColor(color);
        this.f۲۷۰۷e.setColor(c(color));
        Drawable selector = b(color);
        if (Build.VERSION.SDK_INT >= 21) {
            setForeground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{d(color)}), selector, null));
            return;
        }
        setForeground(selector);
    }

    public void setBackgroundColor(int color) {
        f(color);
        requestLayout();
        invalidate();
    }

    public void setBackgroundResource(int color) {
        setBackgroundColor(b.a.a.r.a.c(getContext(), color));
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
        this.f۲۷۱۰h = selected;
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
        if (this.f۲۷۱۰h) {
            int whiteRadius = outerRadius - this.f۲۷۰۶d;
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) outerRadius, this.f۲۷۰۷e);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) whiteRadius, this.f۲۷۰۸f);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (whiteRadius - this.f۲۷۰۵c), this.f۲۷۰۹g);
            return;
        }
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) outerRadius, this.f۲۷۰۹g);
    }

    private Drawable b(int color) {
        ShapeDrawable darkerCircle = new ShapeDrawable(new OvalShape());
        darkerCircle.getPaint().setColor(e(d(color)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, darkerCircle);
        return stateListDrawable;
    }

    public void a(int color) {
        int[] screenPos = new int[2];
        Rect displayFrame = new Rect();
        getLocationOnScreen(screenPos);
        getWindowVisibleDisplayFrame(displayFrame);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int midy = screenPos[1] + (height / 2);
        int referenceX = screenPos[0] + (width / 2);
        if (u.k(this) == 0) {
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
