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
import com.mohamadamin.persianmaterialdatetimepicker.Cg;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.c  reason: invalid class name */
public class Cc extends View {

    /* renamed from: c  reason: contains not printable characters */
    private final Paint f۱۵۰۴۰c = new Paint();

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۵۰۴۱d = false;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۱۵۰۴۲e;

    /* renamed from: f  reason: contains not printable characters */
    private float f۱۵۰۴۳f;

    /* renamed from: g  reason: contains not printable characters */
    private float f۱۵۰۴۴g;

    /* renamed from: h  reason: contains not printable characters */
    private float f۱۵۰۴۵h;

    /* renamed from: i  reason: contains not printable characters */
    private float f۱۵۰۴۶i;

    /* renamed from: j  reason: contains not printable characters */
    private float f۱۵۰۴۷j;

    /* renamed from: k  reason: contains not printable characters */
    private float f۱۵۰۴۸k;

    /* renamed from: l  reason: contains not printable characters */
    private float f۱۵۰۴۹l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۵۰۵۰m;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۵۰۵۱n;

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۵۰۵۲o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۵۰۵۳p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۵۰۵۴q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۵۰۵۵r;

    /* renamed from: s  reason: contains not printable characters */
    private float f۱۵۰۵۶s;

    /* renamed from: t  reason: contains not printable characters */
    private float f۱۵۰۵۷t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۵۰۵۸u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۵۰۵۹v;

    /* renamed from: w  reason: contains not printable characters */
    private Cb f۱۵۰۶۰w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۵۰۶۱x;

    /* renamed from: y  reason: contains not printable characters */
    private double f۱۵۰۶۲y;

    /* renamed from: z  reason: contains not printable characters */
    private boolean f۱۵۰۶۳z;

    public Cc(Context context) {
        super(context);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۴۷a(Context context, boolean is24HourMode, boolean hasInnerCircle, boolean disappearsOut, int selectionDegrees, boolean isInnerCircle) {
        if (this.f۱۵۰۴۱d) {
            Log.e("RadialSelectorView", "This RadialSelectorView may only be initialized once.");
            return;
        }
        Resources res = context.getResources();
        this.f۱۵۰۴۰c.setColor(res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_accent_color));
        this.f۱۵۰۴۰c.setAntiAlias(true);
        this.f۱۵۰۵۲o = 255;
        this.f۱۵۰۵۰m = is24HourMode;
        if (is24HourMode) {
            this.f۱۵۰۴۳f = Float.parseFloat(res.getString(Cg.mdtp_circle_radius_multiplier_24HourMode));
        } else {
            this.f۱۵۰۴۳f = Float.parseFloat(res.getString(Cg.mdtp_circle_radius_multiplier));
            this.f۱۵۰۴۴g = Float.parseFloat(res.getString(Cg.mdtp_ampm_circle_radius_multiplier));
        }
        this.f۱۵۰۵۱n = hasInnerCircle;
        if (hasInnerCircle) {
            this.f۱۵۰۴۵h = Float.parseFloat(res.getString(Cg.mdtp_numbers_radius_multiplier_inner));
            this.f۱۵۰۴۶i = Float.parseFloat(res.getString(Cg.mdtp_numbers_radius_multiplier_outer));
        } else {
            this.f۱۵۰۴۷j = Float.parseFloat(res.getString(Cg.mdtp_numbers_radius_multiplier_normal));
        }
        this.f۱۵۰۴۸k = Float.parseFloat(res.getString(Cg.mdtp_selection_radius_multiplier));
        this.f۱۵۰۴۹l = 1.0f;
        int i = -1;
        this.f۱۵۰۵۶s = (((float) (disappearsOut ? -1 : 1)) * 0.05f) + 1.0f;
        if (disappearsOut) {
            i = 1;
        }
        this.f۱۵۰۵۷t = (((float) i) * 0.3f) + 1.0f;
        this.f۱۵۰۶۰w = new Cb();
        m۱۸۰۴۵a(selectionDegrees, isInnerCircle, false);
        this.f۱۵۰۴۱d = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۴۶a(Context context, boolean themeDark) {
        int color;
        Resources res = context.getResources();
        if (themeDark) {
            color = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_red);
            this.f۱۵۰۵۲o = 255;
        } else {
            color = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_accent_color);
            this.f۱۵۰۵۲o = 255;
        }
        this.f۱۵۰۴۰c.setColor(color);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۴۵a(int selectionDegrees, boolean isInnerCircle, boolean forceDrawDot) {
        this.f۱۵۰۶۱x = selectionDegrees;
        double d = (double) selectionDegrees;
        Double.isNaN(d);
        this.f۱۵۰۶۲y = (d * 3.141592653589793d) / 180.0d;
        this.f۱۵۰۶۳z = forceDrawDot;
        if (!this.f۱۵۰۵۱n) {
            return;
        }
        if (isInnerCircle) {
            this.f۱۵۰۴۷j = this.f۱۵۰۴۵h;
        } else {
            this.f۱۵۰۴۷j = this.f۱۵۰۴۶i;
        }
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void setAnimationRadiusMultiplier(float animationRadiusMultiplier) {
        this.f۱۵۰۴۹l = animationRadiusMultiplier;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۸۰۴۴a(float pointX, float pointY, boolean forceLegal, Boolean[] isInnerCircle) {
        if (!this.f۱۵۰۴۲e) {
            return -1;
        }
        int i = this.f۱۵۰۵۴q;
        float f = (pointY - ((float) i)) * (pointY - ((float) i));
        int i2 = this.f۱۵۰۵۳p;
        double hypotenuse = Math.sqrt((double) (f + ((pointX - ((float) i2)) * (pointX - ((float) i2)))));
        boolean topSide = true;
        if (this.f۱۵۰۵۱n) {
            if (forceLegal) {
                double d = (double) ((int) (((float) this.f۱۵۰۵۵r) * this.f۱۵۰۴۵h));
                Double.isNaN(d);
                int distanceToInnerNumber = (int) Math.abs(hypotenuse - d);
                double d2 = (double) ((int) (((float) this.f۱۵۰۵۵r) * this.f۱۵۰۴۶i));
                Double.isNaN(d2);
                isInnerCircle[0] = Boolean.valueOf(distanceToInnerNumber <= ((int) Math.abs(hypotenuse - d2)));
            } else {
                int i3 = this.f۱۵۰۵۵r;
                float f2 = this.f۱۵۰۴۵h;
                int i4 = this.f۱۵۰۵۹v;
                float f3 = this.f۱۵۰۴۶i;
                int maxAllowedHypotenuseForOuterNumber = ((int) (((float) i3) * f3)) + i4;
                int halfwayHypotenusePoint = (int) (((float) i3) * ((f3 + f2) / 2.0f));
                if (hypotenuse >= ((double) (((int) (((float) i3) * f2)) - i4)) && hypotenuse <= ((double) halfwayHypotenusePoint)) {
                    isInnerCircle[0] = true;
                } else if (hypotenuse > ((double) maxAllowedHypotenuseForOuterNumber) || hypotenuse < ((double) halfwayHypotenusePoint)) {
                    return -1;
                } else {
                    isInnerCircle[0] = false;
                }
            }
        } else if (!forceLegal) {
            double d3 = (double) this.f۱۵۰۵۸u;
            Double.isNaN(d3);
            if (((int) Math.abs(hypotenuse - d3)) > ((int) (((float) this.f۱۵۰۵۵r) * (1.0f - this.f۱۵۰۴۷j)))) {
                return -1;
            }
        }
        double abs = (double) Math.abs(pointY - ((float) this.f۱۵۰۵۴q));
        Double.isNaN(abs);
        int degrees = (int) ((180.0d * Math.asin(abs / hypotenuse)) / 3.141592653589793d);
        boolean rightSide = pointX > ((float) this.f۱۵۰۵۳p);
        if (pointY >= ((float) this.f۱۵۰۵۴q)) {
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
        if (getWidth() != 0 && this.f۱۵۰۴۱d) {
            boolean z = true;
            if (!this.f۱۵۰۴۲e) {
                this.f۱۵۰۵۳p = getWidth() / 2;
                this.f۱۵۰۵۴q = getHeight() / 2;
                this.f۱۵۰۵۵r = (int) (((float) Math.min(this.f۱۵۰۵۳p, this.f۱۵۰۵۴q)) * this.f۱۵۰۴۳f);
                if (!this.f۱۵۰۵۰m) {
                    double d = (double) this.f۱۵۰۵۴q;
                    double d2 = (double) ((int) (((float) this.f۱۵۰۵۵r) * this.f۱۵۰۴۴g));
                    Double.isNaN(d2);
                    Double.isNaN(d);
                    this.f۱۵۰۵۴q = (int) (d - (d2 * 0.75d));
                }
                this.f۱۵۰۵۹v = (int) (((float) this.f۱۵۰۵۵r) * this.f۱۵۰۴۸k);
                this.f۱۵۰۴۲e = true;
            }
            this.f۱۵۰۵۸u = (int) (((float) this.f۱۵۰۵۵r) * this.f۱۵۰۴۷j * this.f۱۵۰۴۹l);
            int i = this.f۱۵۰۵۳p;
            double d3 = (double) this.f۱۵۰۵۸u;
            double sin = Math.sin(this.f۱۵۰۶۲y);
            Double.isNaN(d3);
            int pointX = i + ((int) (d3 * sin));
            int i2 = this.f۱۵۰۵۴q;
            double d4 = (double) this.f۱۵۰۵۸u;
            double cos = Math.cos(this.f۱۵۰۶۲y);
            Double.isNaN(d4);
            int pointY = i2 - ((int) (d4 * cos));
            this.f۱۵۰۴۰c.setAlpha(this.f۱۵۰۵۲o);
            canvas.drawCircle((float) pointX, (float) pointY, (float) this.f۱۵۰۵۹v, this.f۱۵۰۴۰c);
            boolean z2 = this.f۱۵۰۶۳z;
            if (this.f۱۵۰۶۱x % 30 == 0) {
                z = false;
            }
            if (z || z2) {
                this.f۱۵۰۴۰c.setAlpha(255);
                canvas.drawCircle((float) pointX, (float) pointY, (float) ((this.f۱۵۰۵۹v * 2) / 7), this.f۱۵۰۴۰c);
            } else {
                int lineLength = this.f۱۵۰۵۸u - this.f۱۵۰۵۹v;
                int i3 = this.f۱۵۰۵۳p;
                double d5 = (double) lineLength;
                double sin2 = Math.sin(this.f۱۵۰۶۲y);
                Double.isNaN(d5);
                pointX = i3 + ((int) (d5 * sin2));
                int i4 = this.f۱۵۰۵۴q;
                double d6 = (double) lineLength;
                double cos2 = Math.cos(this.f۱۵۰۶۲y);
                Double.isNaN(d6);
                pointY = i4 - ((int) (d6 * cos2));
            }
            this.f۱۵۰۴۰c.setAlpha(255);
            this.f۱۵۰۴۰c.setStrokeWidth(1.0f);
            canvas.drawLine((float) this.f۱۵۰۵۳p, (float) this.f۱۵۰۵۴q, (float) pointX, (float) pointY, this.f۱۵۰۴۰c);
        }
    }

    public ObjectAnimator getDisappearAnimator() {
        if (!this.f۱۵۰۴۱d || !this.f۱۵۰۴۲e) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        ObjectAnimator disappearAnimator = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.f۱۵۰۵۶s), Keyframe.ofFloat(1.0f, this.f۱۵۰۵۷t)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration((long) 500);
        disappearAnimator.addUpdateListener(this.f۱۵۰۶۰w);
        return disappearAnimator;
    }

    public ObjectAnimator getReappearAnimator() {
        if (!this.f۱۵۰۴۱d || !this.f۱۵۰۴۲e) {
            Log.e("RadialSelectorView", "RadialSelectorView was not ready for animation.");
            return null;
        }
        int totalDuration = (int) (((float) 500) * (1.0f + 0.25f));
        float delayPoint = (((float) 500) * 0.25f) / ((float) totalDuration);
        ObjectAnimator reappearAnimator = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.f۱۵۰۵۷t), Keyframe.ofFloat(delayPoint, this.f۱۵۰۵۷t), Keyframe.ofFloat(1.0f - ((1.0f - delayPoint) * 0.2f), this.f۱۵۰۵۶s), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(delayPoint, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration((long) totalDuration);
        reappearAnimator.addUpdateListener(this.f۱۵۰۶۰w);
        return reappearAnimator;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.c$b  reason: invalid class name */
    public class Cb implements ValueAnimator.AnimatorUpdateListener {
        private Cb() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            Cc.this.invalidate();
        }
    }
}
