package com.mohamadamin.persianmaterialdatetimepicker.time;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.mohamadamin.persianmaterialdatetimepicker.Cg;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.d  reason: invalid class name */
public class Cd extends View {

    /* renamed from: A  reason: contains not printable characters */
    private float[] f۱۵۰۶۵A;

    /* renamed from: B  reason: contains not printable characters */
    private float[] f۱۵۰۶۶B;

    /* renamed from: C  reason: contains not printable characters */
    private float[] f۱۵۰۶۷C;

    /* renamed from: D  reason: contains not printable characters */
    private float f۱۵۰۶۸D;

    /* renamed from: E  reason: contains not printable characters */
    private float f۱۵۰۶۹E;

    /* renamed from: F  reason: contains not printable characters */
    private float f۱۵۰۷۰F;

    /* renamed from: G  reason: contains not printable characters */
    ObjectAnimator f۱۵۰۷۱G;

    /* renamed from: H  reason: contains not printable characters */
    ObjectAnimator f۱۵۰۷۲H;

    /* renamed from: I  reason: contains not printable characters */
    private Cb f۱۵۰۷۳I;

    /* renamed from: c  reason: contains not printable characters */
    private final Paint f۱۵۰۷۴c = new Paint();

    /* renamed from: d  reason: contains not printable characters */
    private final Paint f۱۵۰۷۵d = new Paint();

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۱۵۰۷۶e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۵۰۷۷f = false;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۵۰۷۸g = -1;

    /* renamed from: h  reason: contains not printable characters */
    private Typeface f۱۵۰۷۹h;

    /* renamed from: i  reason: contains not printable characters */
    private Typeface f۱۵۰۸۰i;

    /* renamed from: j  reason: contains not printable characters */
    private String[] f۱۵۰۸۱j;

    /* renamed from: k  reason: contains not printable characters */
    private String[] f۱۵۰۸۲k;

    /* renamed from: l  reason: contains not printable characters */
    private boolean f۱۵۰۸۳l;

    /* renamed from: m  reason: contains not printable characters */
    private boolean f۱۵۰۸۴m;

    /* renamed from: n  reason: contains not printable characters */
    private float f۱۵۰۸۵n;

    /* renamed from: o  reason: contains not printable characters */
    private float f۱۵۰۸۶o;

    /* renamed from: p  reason: contains not printable characters */
    private float f۱۵۰۸۷p;

    /* renamed from: q  reason: contains not printable characters */
    private float f۱۵۰۸۸q;

    /* renamed from: r  reason: contains not printable characters */
    private float f۱۵۰۸۹r;

    /* renamed from: s  reason: contains not printable characters */
    private float f۱۵۰۹۰s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۵۰۹۱t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۵۰۹۲u;

    /* renamed from: v  reason: contains not printable characters */
    private float f۱۵۰۹۳v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۵۰۹۴w;

    /* renamed from: x  reason: contains not printable characters */
    private float f۱۵۰۹۵x;

    /* renamed from: y  reason: contains not printable characters */
    private float f۱۵۰۹۶y;

    /* renamed from: z  reason: contains not printable characters */
    private float[] f۱۵۰۹۷z;

    public Cd(Context context) {
        super(context);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۵۲a(Resources res, String[] texts, String[] innerTexts, boolean is24HourMode, boolean disappearsOut) {
        if (this.f۱۵۰۷۷f) {
            Log.e("RadialTextsView", "This RadialTextsView may only be initialized once.");
            return;
        }
        this.f۱۵۰۷۴c.setColor(res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_numbers_text_color));
        boolean z = false;
        this.f۱۵۰۷۹h = Typeface.create(res.getString(Cg.mdtp_radial_numbers_typeface), 0);
        this.f۱۵۰۸۰i = Typeface.create(res.getString(Cg.mdtp_sans_serif), 0);
        this.f۱۵۰۷۴c.setAntiAlias(true);
        this.f۱۵۰۷۴c.setTextAlign(Paint.Align.CENTER);
        this.f۱۵۰۷۵d.setColor(res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_white));
        this.f۱۵۰۷۵d.setAntiAlias(true);
        this.f۱۵۰۷۵d.setTextAlign(Paint.Align.CENTER);
        this.f۱۵۰۸۱j = texts;
        this.f۱۵۰۸۲k = innerTexts;
        this.f۱۵۰۸۳l = is24HourMode;
        if (innerTexts != null) {
            z = true;
        }
        this.f۱۵۰۸۴m = z;
        if (is24HourMode) {
            this.f۱۵۰۸۵n = Float.parseFloat(res.getString(Cg.mdtp_circle_radius_multiplier_24HourMode));
        } else {
            this.f۱۵۰۸۵n = Float.parseFloat(res.getString(Cg.mdtp_circle_radius_multiplier));
            this.f۱۵۰۸۶o = Float.parseFloat(res.getString(Cg.mdtp_ampm_circle_radius_multiplier));
        }
        this.f۱۵۰۹۷z = new float[7];
        this.f۱۵۰۶۵A = new float[7];
        if (this.f۱۵۰۸۴m) {
            this.f۱۵۰۸۷p = Float.parseFloat(res.getString(Cg.mdtp_numbers_radius_multiplier_outer));
            this.f۱۵۰۸۹r = Float.parseFloat(res.getString(Cg.mdtp_text_size_multiplier_outer));
            this.f۱۵۰۸۸q = Float.parseFloat(res.getString(Cg.mdtp_numbers_radius_multiplier_inner));
            this.f۱۵۰۹۰s = Float.parseFloat(res.getString(Cg.mdtp_text_size_multiplier_inner));
            this.f۱۵۰۶۶B = new float[7];
            this.f۱۵۰۶۷C = new float[7];
        } else {
            this.f۱۵۰۸۷p = Float.parseFloat(res.getString(Cg.mdtp_numbers_radius_multiplier_normal));
            this.f۱۵۰۸۹r = Float.parseFloat(res.getString(Cg.mdtp_text_size_multiplier_normal));
        }
        this.f۱۵۰۶۸D = 1.0f;
        int i = -1;
        this.f۱۵۰۶۹E = (((float) (disappearsOut ? -1 : 1)) * 0.05f) + 1.0f;
        if (disappearsOut) {
            i = 1;
        }
        this.f۱۵۰۷۰F = (((float) i) * 0.3f) + 1.0f;
        this.f۱۵۰۷۳I = new Cb();
        this.f۱۵۰۹۴w = true;
        this.f۱۵۰۷۷f = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۵۱a(Context context, boolean themeDark) {
        int textColor;
        Resources res = context.getResources();
        if (themeDark) {
            textColor = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_white);
        } else {
            textColor = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_numbers_text_color);
        }
        this.f۱۵۰۷۴c.setColor(textColor);
    }

    /* access modifiers changed from: protected */
    public void setSelection(int selection) {
        this.f۱۵۰۷۸g = selection;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void setAnimationRadiusMultiplier(float animationRadiusMultiplier) {
        this.f۱۵۰۶۸D = animationRadiusMultiplier;
        this.f۱۵۰۹۴w = true;
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.f۱۵۰۷۷f) {
            if (!this.f۱۵۰۷۶e) {
                this.f۱۵۰۹۱t = getWidth() / 2;
                this.f۱۵۰۹۲u = getHeight() / 2;
                this.f۱۵۰۹۳v = ((float) Math.min(this.f۱۵۰۹۱t, this.f۱۵۰۹۲u)) * this.f۱۵۰۸۵n;
                if (!this.f۱۵۰۸۳l) {
                    float amPmCircleRadius = this.f۱۵۰۹۳v * this.f۱۵۰۸۶o;
                    double d = (double) this.f۱۵۰۹۲u;
                    double d2 = (double) amPmCircleRadius;
                    Double.isNaN(d2);
                    Double.isNaN(d);
                    this.f۱۵۰۹۲u = (int) (d - (d2 * 0.75d));
                }
                float amPmCircleRadius2 = this.f۱۵۰۹۳v;
                this.f۱۵۰۹۵x = this.f۱۵۰۸۹r * amPmCircleRadius2;
                if (this.f۱۵۰۸۴m) {
                    this.f۱۵۰۹۶y = amPmCircleRadius2 * this.f۱۵۰۹۰s;
                }
                m۱۸۰۴۸a();
                this.f۱۵۰۹۴w = true;
                this.f۱۵۰۷۶e = true;
            }
            if (this.f۱۵۰۹۴w) {
                m۱۸۰۴۹a(this.f۱۵۰۹۳v * this.f۱۵۰۸۷p * this.f۱۵۰۶۸D, (float) this.f۱۵۰۹۱t, (float) this.f۱۵۰۹۲u, this.f۱۵۰۹۵x, this.f۱۵۰۹۷z, this.f۱۵۰۶۵A);
                if (this.f۱۵۰۸۴m) {
                    m۱۸۰۴۹a(this.f۱۵۰۹۳v * this.f۱۵۰۸۸q * this.f۱۵۰۶۸D, (float) this.f۱۵۰۹۱t, (float) this.f۱۵۰۹۲u, this.f۱۵۰۹۶y, this.f۱۵۰۶۶B, this.f۱۵۰۶۷C);
                }
                this.f۱۵۰۹۴w = false;
            }
            m۱۸۰۵۰a(canvas, this.f۱۵۰۹۵x, this.f۱۵۰۷۹h, this.f۱۵۰۸۱j, this.f۱۵۰۶۵A, this.f۱۵۰۹۷z);
            if (this.f۱۵۰۸۴m) {
                m۱۸۰۵۰a(canvas, this.f۱۵۰۹۶y, this.f۱۵۰۸۰i, this.f۱۵۰۸۲k, this.f۱۵۰۶۷C, this.f۱۵۰۶۶B);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۰۴۹a(float numbersRadius, float xCenter, float yCenter, float textSize, float[] textGridHeights, float[] textGridWidths) {
        float offset2 = (((float) Math.sqrt(3.0d)) * numbersRadius) / 2.0f;
        float offset3 = numbersRadius / 2.0f;
        this.f۱۵۰۷۴c.setTextSize(textSize);
        this.f۱۵۰۷۵d.setTextSize(textSize);
        float yCenter2 = yCenter - ((this.f۱۵۰۷۴c.descent() + this.f۱۵۰۷۴c.ascent()) / 2.0f);
        textGridHeights[0] = yCenter2 - numbersRadius;
        textGridWidths[0] = xCenter - numbersRadius;
        textGridHeights[1] = yCenter2 - offset2;
        textGridWidths[1] = xCenter - offset2;
        textGridHeights[2] = yCenter2 - offset3;
        textGridWidths[2] = xCenter - offset3;
        textGridHeights[3] = yCenter2;
        textGridWidths[3] = xCenter;
        textGridHeights[4] = yCenter2 + offset3;
        textGridWidths[4] = xCenter + offset3;
        textGridHeights[5] = yCenter2 + offset2;
        textGridWidths[5] = xCenter + offset2;
        textGridHeights[6] = yCenter2 + numbersRadius;
        textGridWidths[6] = xCenter + numbersRadius;
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۰۵۰a(Canvas canvas, float textSize, Typeface typeface, String[] texts, float[] textGridWidths, float[] textGridHeights) {
        this.f۱۵۰۷۴c.setTextSize(textSize);
        this.f۱۵۰۷۴c.setTypeface(typeface);
        com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca.m۱۸۰۰۰a(texts);
        canvas.drawText(texts[0], textGridWidths[3], textGridHeights[0], Integer.parseInt(texts[0]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[1], textGridWidths[4], textGridHeights[1], Integer.parseInt(texts[1]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[2], textGridWidths[5], textGridHeights[2], Integer.parseInt(texts[2]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[3], textGridWidths[6], textGridHeights[3], Integer.parseInt(texts[3]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[4], textGridWidths[5], textGridHeights[4], Integer.parseInt(texts[4]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[5], textGridWidths[4], textGridHeights[5], Integer.parseInt(texts[5]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[6], textGridWidths[3], textGridHeights[6], Integer.parseInt(texts[6]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[7], textGridWidths[2], textGridHeights[5], Integer.parseInt(texts[7]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[8], textGridWidths[1], textGridHeights[4], Integer.parseInt(texts[8]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[9], textGridWidths[0], textGridHeights[3], Integer.parseInt(texts[9]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[10], textGridWidths[1], textGridHeights[2], Integer.parseInt(texts[10]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
        canvas.drawText(texts[11], textGridWidths[2], textGridHeights[1], Integer.parseInt(texts[11]) == this.f۱۵۰۷۸g ? this.f۱۵۰۷۵d : this.f۱۵۰۷۴c);
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۸۰۴۸a() {
        this.f۱۵۰۷۱G = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.f۱۵۰۶۹E), Keyframe.ofFloat(1.0f, this.f۱۵۰۷۰F)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration((long) 500);
        this.f۱۵۰۷۱G.addUpdateListener(this.f۱۵۰۷۳I);
        int totalDuration = (int) (((float) 500) * (1.0f + 0.25f));
        float delayPoint = (((float) 500) * 0.25f) / ((float) totalDuration);
        this.f۱۵۰۷۲H = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.f۱۵۰۷۰F), Keyframe.ofFloat(delayPoint, this.f۱۵۰۷۰F), Keyframe.ofFloat(1.0f - ((1.0f - delayPoint) * 0.2f), this.f۱۵۰۶۹E), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(delayPoint, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration((long) totalDuration);
        this.f۱۵۰۷۲H.addUpdateListener(this.f۱۵۰۷۳I);
    }

    public ObjectAnimator getDisappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.f۱۵۰۷۷f && this.f۱۵۰۷۶e && (objectAnimator = this.f۱۵۰۷۱G) != null) {
            return objectAnimator;
        }
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    public ObjectAnimator getReappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.f۱۵۰۷۷f && this.f۱۵۰۷۶e && (objectAnimator = this.f۱۵۰۷۲H) != null) {
            return objectAnimator;
        }
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.d$b  reason: invalid class name */
    public class Cb implements ValueAnimator.AnimatorUpdateListener {
        private Cb() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            Cd.this.invalidate();
        }
    }
}
