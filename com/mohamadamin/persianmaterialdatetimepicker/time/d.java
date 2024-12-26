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
import com.mohamadamin.persianmaterialdatetimepicker.g;

public class d extends View {
    private float[] A;
    private float[] B;
    private float[] C;
    private float D;
    private float E;
    private float F;
    ObjectAnimator G;
    ObjectAnimator H;
    private b I;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f۳۳۹۵c = new Paint();

    /* renamed from: d  reason: collision with root package name */
    private final Paint f۳۳۹۶d = new Paint();

    /* renamed from: e  reason: collision with root package name */
    private boolean f۳۳۹۷e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۳۳۹۸f = false;

    /* renamed from: g  reason: collision with root package name */
    private int f۳۳۹۹g = -1;

    /* renamed from: h  reason: collision with root package name */
    private Typeface f۳۴۰۰h;
    private Typeface i;
    private String[] j;
    private String[] k;
    private boolean l;
    private boolean m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private int t;
    private int u;
    private float v;
    private boolean w;
    private float x;
    private float y;
    private float[] z;

    public d(Context context) {
        super(context);
    }

    public void a(Resources res, String[] texts, String[] innerTexts, boolean is24HourMode, boolean disappearsOut) {
        if (this.f۳۳۹۸f) {
            Log.e("RadialTextsView", "This RadialTextsView may only be initialized once.");
            return;
        }
        this.f۳۳۹۵c.setColor(res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_numbers_text_color));
        boolean z2 = false;
        this.f۳۴۰۰h = Typeface.create(res.getString(g.mdtp_radial_numbers_typeface), 0);
        this.i = Typeface.create(res.getString(g.mdtp_sans_serif), 0);
        this.f۳۳۹۵c.setAntiAlias(true);
        this.f۳۳۹۵c.setTextAlign(Paint.Align.CENTER);
        this.f۳۳۹۶d.setColor(res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_white));
        this.f۳۳۹۶d.setAntiAlias(true);
        this.f۳۳۹۶d.setTextAlign(Paint.Align.CENTER);
        this.j = texts;
        this.k = innerTexts;
        this.l = is24HourMode;
        if (innerTexts != null) {
            z2 = true;
        }
        this.m = z2;
        if (is24HourMode) {
            this.n = Float.parseFloat(res.getString(g.mdtp_circle_radius_multiplier_24HourMode));
        } else {
            this.n = Float.parseFloat(res.getString(g.mdtp_circle_radius_multiplier));
            this.o = Float.parseFloat(res.getString(g.mdtp_ampm_circle_radius_multiplier));
        }
        this.z = new float[7];
        this.A = new float[7];
        if (this.m) {
            this.p = Float.parseFloat(res.getString(g.mdtp_numbers_radius_multiplier_outer));
            this.r = Float.parseFloat(res.getString(g.mdtp_text_size_multiplier_outer));
            this.q = Float.parseFloat(res.getString(g.mdtp_numbers_radius_multiplier_inner));
            this.s = Float.parseFloat(res.getString(g.mdtp_text_size_multiplier_inner));
            this.B = new float[7];
            this.C = new float[7];
        } else {
            this.p = Float.parseFloat(res.getString(g.mdtp_numbers_radius_multiplier_normal));
            this.r = Float.parseFloat(res.getString(g.mdtp_text_size_multiplier_normal));
        }
        this.D = 1.0f;
        int i2 = -1;
        this.E = (((float) (disappearsOut ? -1 : 1)) * 0.05f) + 1.0f;
        if (disappearsOut) {
            i2 = 1;
        }
        this.F = (((float) i2) * 0.3f) + 1.0f;
        this.I = new b();
        this.w = true;
        this.f۳۳۹۸f = true;
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, boolean themeDark) {
        int textColor;
        Resources res = context.getResources();
        if (themeDark) {
            textColor = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_white);
        } else {
            textColor = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_numbers_text_color);
        }
        this.f۳۳۹۵c.setColor(textColor);
    }

    /* access modifiers changed from: protected */
    public void setSelection(int selection) {
        this.f۳۳۹۹g = selection;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void setAnimationRadiusMultiplier(float animationRadiusMultiplier) {
        this.D = animationRadiusMultiplier;
        this.w = true;
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.f۳۳۹۸f) {
            if (!this.f۳۳۹۷e) {
                this.t = getWidth() / 2;
                this.u = getHeight() / 2;
                this.v = ((float) Math.min(this.t, this.u)) * this.n;
                if (!this.l) {
                    float amPmCircleRadius = this.v * this.o;
                    double d2 = (double) this.u;
                    double d3 = (double) amPmCircleRadius;
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    this.u = (int) (d2 - (d3 * 0.75d));
                }
                float amPmCircleRadius2 = this.v;
                this.x = this.r * amPmCircleRadius2;
                if (this.m) {
                    this.y = amPmCircleRadius2 * this.s;
                }
                a();
                this.w = true;
                this.f۳۳۹۷e = true;
            }
            if (this.w) {
                a(this.v * this.p * this.D, (float) this.t, (float) this.u, this.x, this.z, this.A);
                if (this.m) {
                    a(this.v * this.q * this.D, (float) this.t, (float) this.u, this.y, this.B, this.C);
                }
                this.w = false;
            }
            a(canvas, this.x, this.f۳۴۰۰h, this.j, this.A, this.z);
            if (this.m) {
                a(canvas, this.y, this.i, this.k, this.C, this.B);
            }
        }
    }

    private void a(float numbersRadius, float xCenter, float yCenter, float textSize, float[] textGridHeights, float[] textGridWidths) {
        float offset2 = (((float) Math.sqrt(3.0d)) * numbersRadius) / 2.0f;
        float offset3 = numbersRadius / 2.0f;
        this.f۳۳۹۵c.setTextSize(textSize);
        this.f۳۳۹۶d.setTextSize(textSize);
        float yCenter2 = yCenter - ((this.f۳۳۹۵c.descent() + this.f۳۳۹۵c.ascent()) / 2.0f);
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

    private void a(Canvas canvas, float textSize, Typeface typeface, String[] texts, float[] textGridWidths, float[] textGridHeights) {
        this.f۳۳۹۵c.setTextSize(textSize);
        this.f۳۳۹۵c.setTypeface(typeface);
        com.mohamadamin.persianmaterialdatetimepicker.j.a.a(texts);
        canvas.drawText(texts[0], textGridWidths[3], textGridHeights[0], Integer.parseInt(texts[0]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[1], textGridWidths[4], textGridHeights[1], Integer.parseInt(texts[1]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[2], textGridWidths[5], textGridHeights[2], Integer.parseInt(texts[2]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[3], textGridWidths[6], textGridHeights[3], Integer.parseInt(texts[3]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[4], textGridWidths[5], textGridHeights[4], Integer.parseInt(texts[4]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[5], textGridWidths[4], textGridHeights[5], Integer.parseInt(texts[5]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[6], textGridWidths[3], textGridHeights[6], Integer.parseInt(texts[6]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[7], textGridWidths[2], textGridHeights[5], Integer.parseInt(texts[7]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[8], textGridWidths[1], textGridHeights[4], Integer.parseInt(texts[8]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[9], textGridWidths[0], textGridHeights[3], Integer.parseInt(texts[9]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[10], textGridWidths[1], textGridHeights[2], Integer.parseInt(texts[10]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
        canvas.drawText(texts[11], textGridWidths[2], textGridHeights[1], Integer.parseInt(texts[11]) == this.f۳۳۹۹g ? this.f۳۳۹۶d : this.f۳۳۹۵c);
    }

    private void a() {
        this.G = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, this.E), Keyframe.ofFloat(1.0f, this.F)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(1.0f, 0.0f))).setDuration((long) 500);
        this.G.addUpdateListener(this.I);
        int totalDuration = (int) (((float) 500) * (1.0f + 0.25f));
        float delayPoint = (((float) 500) * 0.25f) / ((float) totalDuration);
        this.H = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("animationRadiusMultiplier", Keyframe.ofFloat(0.0f, this.F), Keyframe.ofFloat(delayPoint, this.F), Keyframe.ofFloat(1.0f - ((1.0f - delayPoint) * 0.2f), this.E), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe("alpha", Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(delayPoint, 0.0f), Keyframe.ofFloat(1.0f, 1.0f))).setDuration((long) totalDuration);
        this.H.addUpdateListener(this.I);
    }

    public ObjectAnimator getDisappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.f۳۳۹۸f && this.f۳۳۹۷e && (objectAnimator = this.G) != null) {
            return objectAnimator;
        }
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    public ObjectAnimator getReappearAnimator() {
        ObjectAnimator objectAnimator;
        if (this.f۳۳۹۸f && this.f۳۳۹۷e && (objectAnimator = this.H) != null) {
            return objectAnimator;
        }
        Log.e("RadialTextsView", "RadialTextView was not ready for animation.");
        return null;
    }

    /* access modifiers changed from: private */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        private b() {
        }

        public void onAnimationUpdate(ValueAnimator animation) {
            d.this.invalidate();
        }
    }
}
