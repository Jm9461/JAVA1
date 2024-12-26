package com.mohamadamin.persianmaterialdatetimepicker.time;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import com.mohamadamin.persianmaterialdatetimepicker.g;

public class c extends View {

    /* renamed from: c  reason: collision with root package name */
    private final Paint f۳۳۸۸c = new Paint();

    /* renamed from: d  reason: collision with root package name */
    private boolean f۳۳۸۹d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f۳۳۹۰e;

    /* renamed from: f  reason: collision with root package name */
    private float f۳۳۹۱f;

    /* renamed from: g  reason: collision with root package name */
    private float f۳۳۹۲g;

    /* renamed from: h  reason: collision with root package name */
    private float f۳۳۹۳h;
    private float i;
    private float j;
    private float k;
    private float l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private b w;
    private int x;
    private double y;
    private boolean z;

    public c(Context context) {
        super(context);
    }

    public void a(Context context, boolean is24HourMode, boolean hasInnerCircle, boolean disappearsOut, int selectionDegrees, boolean isInnerCircle) {
        if (this.f۳۳۸۹d) {
            Log.e("RadialSelectorView", "This RadialSelectorView may only be initialized once.");
            return;
        }
        Resources res = context.getResources();
        this.f۳۳۸۸c.setColor(res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_accent_color));
        this.f۳۳۸۸c.setAntiAlias(true);
        this.o = 255;
        this.m = is24HourMode;
        if (is24HourMode) {
            this.f۳۳۹۱f = Float.parseFloat(res.getString(g.mdtp_circle_radius_multiplier_24HourMode));
        } else {
            this.f۳۳۹۱f = Float.parseFloat(res.getString(g.mdtp_circle_radius_multiplier));
            this.f۳۳۹۲g = Float.parseFloat(res.getString(g.mdtp_ampm_circle_radius_multiplier));
        }
        this.n = hasInnerCircle;
        if (hasInnerCircle) {
            this.f۳۳۹۳h = Float.parseFloat(res.getString(g.mdtp_numbers_radius_multiplier_inner));
            this.i = Float.parseFloat(res.getString(g.mdtp_numbers_radius_multiplier_outer));
        } else {
            this.j = Float.parseFloat(res.getString(g.mdtp_numbers_radius_multiplier_normal));
        }
        this.k = Float.parseFloat(res.getString(g.mdtp_selection_radius_multiplier));
        this.l = 1.0f;
        int i2 = -1;
        this.s = (((float) (disappearsOut ? -1 : 1)) * 0.05f) + 1.0f;
        if (disappearsOut) {
            i2 = 1;
        }
        this.t = (((float) i2) * 0.3f) + 1.0f;
        this.w = new b();
        a(selectionDegrees, isInnerCircle, false);
        this.f۳۳۸۹d = true;
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, boolean themeDark) {
        int color;
        Resources res = context.getResources();
        if (themeDark) {
            color = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_red);
            this.o = 255;
        } else {
            color = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_accent_color);
            this.o = 255;
        }
        this.f۳۳۸۸c.setColor(color);
    }

    public void a(int selectionDegrees, boolean isInnerCircle, boolean forceDrawDot) {
        this.x = selectionDegrees;
        double d2 = (double) selectionDegrees;
        Double.isNaN(d2);
        this.y = (d2 * 3.141592653589793d) / 180.0d;
        this.z = forceDrawDot;
        if (!this.n) {
            return;
        }
        if (isInnerCircle) {
            this.j = this.f۳۳۹۳h;
        } else {
            this.j = this.i;
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void setAnimationRadiusMultiplier(float animationRadiusMultiplier) {
        this.l = animationRadiusMultiplier;
    }

    public int a(float pointX, float pointY, boolean forceLegal, Boolean[] isInnerCircle) {
        if (!this.f۳۳۹۰e) {
            return -1;
        }
        int i2 = this.q;
        float f2 = (pointY - ((float) i2)) * (pointY - ((float) i2));
        int i3 = this.p;
        double hypotenuse = Math.sqrt((double) (f2 + ((pointX - ((float) i3)) * (pointX - ((float) i3)))));
        boolean topSide = true;
        if (this.n) {
            if (forceLegal) {
                double d2 = (double) ((int) (((float) this.r) * this.f۳۳۹۳h));
                Double.isNaN(d2);
                int distanceToInnerNumber = (int) Math.abs(hypotenuse - d2);
                double d3 = (double) ((int) (((float) this.r) * this.i));
                Double.isNaN(d3);
                isInnerCircle[0] = Boolean.valueOf(distanceToInnerNumber <= ((int) Math.abs(hypotenuse - d3)));
            } else {
                int i4 = this.r;
                float f3 = this.f۳۳۹۳h;
                int i5 = this.v;
                float f4 = this.i;
                int maxAllowedHypotenuseForOuterNumber = ((int) (((float) i4) * f4)) + i5;
                int halfwayHypotenusePoint = (int) (((float) i4) * ((f4 + f3) / 2.0f));
                if (hypotenuse >= ((double) (((int) (((float) i4) * f3)) - i5)) && hypotenuse <= ((double) halfwayHypotenusePoint)) {
                    isInnerCircle[0] = true;
                } else if (hypotenuse > ((double) maxAllowedHypotenuseForOuterNumber) || hypotenuse < ((double) halfwayHypotenusePoint)) {
                    return -1;
                } else {
                    isInnerCircle[0] = false;
                }
            }
        } else if (!forceLegal) {
            double d4 = (double) this.u;
            Double.isNaN(d4);
            if (((int) Math.abs(hypotenuse - d4)) > ((int) (((float) this.r) * (1.0f - this.j)))) {
                return -1;
            }
        }
        double abs = (double) Math.abs(pointY - ((float) this.q));
        Double.isNaN(abs);
        int degrees = (int) ((180.0d * Math.asin(abs / hypotenuse)) / 3.141592653589793d);
        boolean rightSide = pointX > ((float) this.p);
        if (pointY >= ((float) this.q)) {
            topSide = false;
        }
        if (rightSide && topSide) {
            return 90 - degrees;
        }
        if (rightSide && !topSide) {
            return degrees + 90;
        }
        if (!rightSide && !topSide) {
            return 270 - degrees;
        }
        if (rightSide || !topSide) {
            return degrees;
        }
        return degrees + 270;
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.f۳۳۸۹d) {
            boolean z2 = true;
            if (!this.f۳۳۹۰e) {
                this.p = getWidth() / 2;
                this.q = getHeight() / 2;
                this.r = (int) (((float) Math.min(this.p, this.q)) * this.f۳۳۹۱f);
                if (!this.m) {
                    double d2 = (double) this.q;
                    double d3 = (double) ((int) (((float) this.r) * this.f۳۳۹۲g));
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    this.q = (int) (d2 - (d3 * 0.75d));
                }
                this.v = (int) (((float) this.r) * this.k);
                this.f۳۳۹۰e = true;
            }
            this.u = (int) (((float) this.r) * this.j * this.l);
            int i2 = this.p;
            double d4 = (double) this.u;
            double sin = Math.sin(this.y);
            Double.isNaN(d4);
            int pointX = i2 + ((int) (d4 * sin));
            int i3 = this.q;
            double d5 = (double) this.u;
            double cos = Math.cos(this.y);
            Double.isNaN(d5);
            int pointY = i3 - ((int) (d5 * cos));
            this.f۳۳۸۸c.setAlpha(this.o);
            canvas.drawCircle((float) pointX, (float) pointY, (float) this.v, this.f۳۳۸۸c);
            boolean z3 = this.z;
            if (this.x % 30 == 0) {
                z2 = false;
            }
            if (z2 || z3) {
                this.f۳۳۸۸c.setAlpha(255);
                canvas.drawCircle((float) pointX, (float) pointY, (float) ((this.v * 2) / 7), this.f۳۳۸۸c);
            } else {
                int lineLength = this.u - this.v;
                int i4 = this.p;
                double d6 = (double) lineLength;
                double sin2 = Math.sin(this.y);
                Double.isNaN(d6);
                pointX = i4 + ((int) (d6 * sin2));
                int i5 = this.q;
                double d7 = (double) lineLength;
                double cos2 = Math.cos(this.y);
                Double.isNaN(d7);
                pointY = i5 - ((int) (d7 * cos2));
            }
            this.f۳۳۸۸c.setAlpha(255);
            this.f۳۳۸۸c.setStrokeWidth(1.0f);
            canvas.drawLine((float) this.p, (float) this.q, (float) pointX, (float) pointY, this.f۳۳۸۸c);
        }
    }

    public ObjectAnimator getDisappearAnimator() {
        if (!this.f۳۳۸۹d || !this.f۳۳۹۰e) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        ObjectAnimator disappearAnimator = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.s), Keyframe.ofFloat(1.0f, this.t)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration((long) 500);
        disappearAnimator.addUpdateListener(this.w);
        return disappearAnimator;
    }

    public ObjectAnimator getReappearAnimator() {
        if (!this.f۳۳۸۹d || !this.f۳۳۹۰e) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        int totalDuration = (int) (((float) 500) * (1.0f + 0.25f));
        float delayPoint = (((float) 500) * 0.25f) / ((float) totalDuration);
        ObjectAnimator reappearAnimator = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.t), Keyframe.ofFloat(delayPoint, this.t), Keyframe.ofFloat(1.0f - ((1.0f - delayPoint) * 0.2f), this.s), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(delayPoint, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration((long) totalDuration);
        reappearAnimator.addUpdateListener(this.w);
        return reappearAnimator;
    }

    /* access modifiers changed from: private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        private b() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            c.this.invalidate();
        }
    }
}
