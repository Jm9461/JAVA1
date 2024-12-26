package com.mohamadamin.persianmaterialdatetimepicker.time;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import com.mohamadamin.persianmaterialdatetimepicker.Cg;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.b  reason: invalid class name */
public class Cb extends View {

    /* renamed from: c  reason: contains not printable characters */
    private final Paint f۱۵۰۲۹c = new Paint();

    /* renamed from: d  reason: contains not printable characters */
    private boolean f۱۵۰۳۰d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۵۰۳۱e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۵۰۳۲f;

    /* renamed from: g  reason: contains not printable characters */
    private float f۱۵۰۳۳g;

    /* renamed from: h  reason: contains not printable characters */
    private float f۱۵۰۳۴h;

    /* renamed from: i  reason: contains not printable characters */
    private boolean f۱۵۰۳۵i;

    /* renamed from: j  reason: contains not printable characters */
    private boolean f۱۵۰۳۶j;

    /* renamed from: k  reason: contains not printable characters */
    private int f۱۵۰۳۷k;

    /* renamed from: l  reason: contains not printable characters */
    private int f۱۵۰۳۸l;

    /* renamed from: m  reason: contains not printable characters */
    private int f۱۵۰۳۹m;

    public Cb(Context context) {
        super(context);
        Resources res = context.getResources();
        this.f۱۵۰۳۱e = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_circle_color);
        this.f۱۵۰۳۲f = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_numbers_text_color);
        this.f۱۵۰۲۹c.setAntiAlias(true);
        this.f۱۵۰۳۵i = false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۴۲a(Context context, boolean is24HourMode) {
        if (this.f۱۵۰۳۵i) {
            Log.e("CircleView", "CircleView may only be initialized once.");
            return;
        }
        Resources res = context.getResources();
        this.f۱۵۰۳۰d = is24HourMode;
        if (is24HourMode) {
            this.f۱۵۰۳۳g = Float.parseFloat(res.getString(Cg.mdtp_circle_radius_multiplier_24HourMode));
        } else {
            this.f۱۵۰۳۳g = Float.parseFloat(res.getString(Cg.mdtp_circle_radius_multiplier));
            this.f۱۵۰۳۴h = Float.parseFloat(res.getString(Cg.mdtp_ampm_circle_radius_multiplier));
        }
        this.f۱۵۰۳۵i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۸۰۴۳b(Context context, boolean dark) {
        Resources res = context.getResources();
        if (dark) {
            this.f۱۵۰۳۱e = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_circle_background_dark_theme);
            this.f۱۵۰۳۲f = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_white);
            return;
        }
        this.f۱۵۰۳۱e = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_circle_color);
        this.f۱۵۰۳۲f = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.Cb.mdtp_numbers_text_color);
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.f۱۵۰۳۵i) {
            if (!this.f۱۵۰۳۶j) {
                this.f۱۵۰۳۷k = getWidth() / 2;
                this.f۱۵۰۳۸l = getHeight() / 2;
                this.f۱۵۰۳۹m = (int) (((float) Math.min(this.f۱۵۰۳۷k, this.f۱۵۰۳۸l)) * this.f۱۵۰۳۳g);
                if (!this.f۱۵۰۳۰d) {
                    double d = (double) this.f۱۵۰۳۸l;
                    double d2 = (double) ((int) (((float) this.f۱۵۰۳۹m) * this.f۱۵۰۳۴h));
                    Double.isNaN(d2);
                    Double.isNaN(d);
                    this.f۱۵۰۳۸l = (int) (d - (d2 * 0.75d));
                }
                this.f۱۵۰۳۶j = true;
            }
            this.f۱۵۰۲۹c.setColor(this.f۱۵۰۳۱e);
            canvas.drawCircle((float) this.f۱۵۰۳۷k, (float) this.f۱۵۰۳۸l, (float) this.f۱۵۰۳۹m, this.f۱۵۰۲۹c);
            this.f۱۵۰۲۹c.setColor(this.f۱۵۰۳۲f);
            canvas.drawCircle((float) this.f۱۵۰۳۷k, (float) this.f۱۵۰۳۸l, 4.0f, this.f۱۵۰۲۹c);
        }
    }
}
