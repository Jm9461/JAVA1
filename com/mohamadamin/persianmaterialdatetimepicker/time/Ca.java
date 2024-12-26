package com.mohamadamin.persianmaterialdatetimepicker.time;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.mohamadamin.persianmaterialdatetimepicker.Cb;
import com.mohamadamin.persianmaterialdatetimepicker.Cg;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.time.a  reason: invalid class name */
public class Ca extends View {

    /* renamed from: c  reason: contains not printable characters */
    private final Paint f۱۵۰۱۰c = new Paint();

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۵۰۱۱d;

    /* renamed from: e  reason: contains not printable characters */
    private int f۱۵۰۱۲e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۱۵۰۱۳f;

    /* renamed from: g  reason: contains not printable characters */
    private int f۱۵۰۱۴g;

    /* renamed from: h  reason: contains not printable characters */
    private int f۱۵۰۱۵h;

    /* renamed from: i  reason: contains not printable characters */
    private int f۱۵۰۱۶i;

    /* renamed from: j  reason: contains not printable characters */
    private float f۱۵۰۱۷j;

    /* renamed from: k  reason: contains not printable characters */
    private float f۱۵۰۱۸k;

    /* renamed from: l  reason: contains not printable characters */
    private String f۱۵۰۱۹l;

    /* renamed from: m  reason: contains not printable characters */
    private String f۱۵۰۲۰m;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۵۰۲۱n = false;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۱۵۰۲۲o;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۵۰۲۳p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۵۰۲۴q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۵۰۲۵r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۵۰۲۶s;

    /* renamed from: t  reason: contains not printable characters */
    private int f۱۵۰۲۷t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۵۰۲۸u;

    public Ca(Context context) {
        super(context);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۴۰a(Context context, int amOrPm) {
        if (this.f۱۵۰۲۱n) {
            Log.e("AmPmCirclesView", "AmPmCirclesView may only be initialized once.");
            return;
        }
        Resources res = context.getResources();
        this.f۱۵۰۱۳f = res.getColor(Cb.mdtp_white);
        this.f۱۵۰۱۶i = res.getColor(Cb.mdtp_accent_color);
        this.f۱۵۰۱۲e = res.getColor(Cb.mdtp_accent_color_dark);
        this.f۱۵۰۱۴g = res.getColor(Cb.mdtp_ampm_text_color);
        this.f۱۵۰۱۵h = res.getColor(Cb.mdtp_white);
        this.f۱۵۰۱۱d = 255;
        this.f۱۵۰۱۰c.setTypeface(Typeface.create(res.getString(Cg.mdtp_sans_serif), 0));
        this.f۱۵۰۱۰c.setAntiAlias(true);
        this.f۱۵۰۱۰c.setTextAlign(Paint.Align.CENTER);
        this.f۱۵۰۱۷j = Float.parseFloat(res.getString(Cg.mdtp_circle_radius_multiplier));
        this.f۱۵۰۱۸k = Float.parseFloat(res.getString(Cg.mdtp_ampm_circle_radius_multiplier));
        this.f۱۵۰۱۹l = "قبل‌ازظهر";
        this.f۱۵۰۲۰m = "بعدازظهر";
        setAmOrPm(amOrPm);
        this.f۱۵۰۲۸u = -1;
        this.f۱۵۰۲۱n = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۸۰۴۱a(Context context, boolean themeDark) {
        Resources res = context.getResources();
        if (themeDark) {
            this.f۱۵۰۱۳f = res.getColor(Cb.mdtp_circle_background_dark_theme);
            this.f۱۵۰۱۶i = res.getColor(Cb.mdtp_red);
            this.f۱۵۰۱۴g = res.getColor(Cb.mdtp_white);
            this.f۱۵۰۱۱d = 255;
            return;
        }
        this.f۱۵۰۱۳f = res.getColor(Cb.mdtp_white);
        this.f۱۵۰۱۶i = res.getColor(Cb.mdtp_accent_color);
        this.f۱۵۰۱۴g = res.getColor(Cb.mdtp_ampm_text_color);
        this.f۱۵۰۱۱d = 255;
    }

    public void setAmOrPm(int amOrPm) {
        this.f۱۵۰۲۷t = amOrPm;
    }

    public void setAmOrPmPressed(int amOrPmPressed) {
        this.f۱۵۰۲۸u = amOrPmPressed;
    }

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۸۰۳۹a(float xCoord, float yCoord) {
        if (!this.f۱۵۰۲۲o) {
            return -1;
        }
        int i = this.f۱۵۰۲۶s;
        int squaredYDistance = (int) ((yCoord - ((float) i)) * (yCoord - ((float) i)));
        int i2 = this.f۱۵۰۲۴q;
        if (((int) Math.sqrt((double) (((xCoord - ((float) i2)) * (xCoord - ((float) i2))) + ((float) squaredYDistance)))) <= this.f۱۵۰۲۳p) {
            return 0;
        }
        int i3 = this.f۱۵۰۲۵r;
        if (((int) Math.sqrt((double) (((xCoord - ((float) i3)) * (xCoord - ((float) i3))) + ((float) squaredYDistance)))) <= this.f۱۵۰۲۳p) {
            return 1;
        }
        return -1;
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.f۱۵۰۲۱n) {
            if (!this.f۱۵۰۲۲o) {
                int layoutXCenter = getWidth() / 2;
                int layoutYCenter = getHeight() / 2;
                int circleRadius = (int) (((float) Math.min(layoutXCenter, layoutYCenter)) * this.f۱۵۰۱۷j);
                this.f۱۵۰۲۳p = (int) (((float) circleRadius) * this.f۱۵۰۱۸k);
                double d = (double) layoutYCenter;
                int i = this.f۱۵۰۲۳p;
                double d2 = (double) i;
                Double.isNaN(d2);
                Double.isNaN(d);
                int layoutYCenter2 = (int) (d + (d2 * 0.75d));
                this.f۱۵۰۱۰c.setTextSize((float) ((i * 3) / 4));
                int i2 = this.f۱۵۰۲۳p;
                this.f۱۵۰۲۶s = (layoutYCenter2 - (i2 / 2)) + circleRadius;
                this.f۱۵۰۲۴q = (layoutXCenter - circleRadius) + i2;
                this.f۱۵۰۲۵r = (layoutXCenter + circleRadius) - i2;
                this.f۱۵۰۲۲o = true;
            }
            int amColor = this.f۱۵۰۱۳f;
            int amAlpha = 255;
            int amTextColor = this.f۱۵۰۱۴g;
            int pmColor = this.f۱۵۰۱۳f;
            int pmAlpha = 255;
            int pmTextColor = this.f۱۵۰۱۴g;
            int i3 = this.f۱۵۰۲۷t;
            if (i3 == 0) {
                amColor = this.f۱۵۰۱۶i;
                amAlpha = this.f۱۵۰۱۱d;
                amTextColor = this.f۱۵۰۱۵h;
            } else if (i3 == 1) {
                pmColor = this.f۱۵۰۱۶i;
                pmAlpha = this.f۱۵۰۱۱d;
                pmTextColor = this.f۱۵۰۱۵h;
            }
            int i4 = this.f۱۵۰۲۸u;
            if (i4 == 0) {
                amColor = this.f۱۵۰۱۲e;
                amAlpha = this.f۱۵۰۱۱d;
            } else if (i4 == 1) {
                pmColor = this.f۱۵۰۱۲e;
                pmAlpha = this.f۱۵۰۱۱d;
            }
            this.f۱۵۰۱۰c.setColor(amColor);
            this.f۱۵۰۱۰c.setAlpha(amAlpha);
            canvas.drawCircle((float) this.f۱۵۰۲۴q, (float) this.f۱۵۰۲۶s, (float) this.f۱۵۰۲۳p, this.f۱۵۰۱۰c);
            this.f۱۵۰۱۰c.setColor(pmColor);
            this.f۱۵۰۱۰c.setAlpha(pmAlpha);
            canvas.drawCircle((float) this.f۱۵۰۲۵r, (float) this.f۱۵۰۲۶s, (float) this.f۱۵۰۲۳p, this.f۱۵۰۱۰c);
            this.f۱۵۰۱۰c.setColor(amTextColor);
            int textYCenter = this.f۱۵۰۲۶s - (((int) (this.f۱۵۰۱۰c.descent() + this.f۱۵۰۱۰c.ascent())) / 2);
            canvas.drawText(this.f۱۵۰۱۹l, (float) this.f۱۵۰۲۴q, (float) textYCenter, this.f۱۵۰۱۰c);
            this.f۱۵۰۱۰c.setColor(pmTextColor);
            canvas.drawText(this.f۱۵۰۲۰m, (float) this.f۱۵۰۲۵r, (float) textYCenter, this.f۱۵۰۱۰c);
        }
    }
}
