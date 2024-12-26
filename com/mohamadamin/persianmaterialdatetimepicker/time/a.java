package com.mohamadamin.persianmaterialdatetimepicker.time;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.mohamadamin.persianmaterialdatetimepicker.b;
import com.mohamadamin.persianmaterialdatetimepicker.g;

public class a extends View {

    /* renamed from: c  reason: collision with root package name */
    private final Paint f۳۳۷۶c = new Paint();

    /* renamed from: d  reason: collision with root package name */
    private int f۳۳۷۷d;

    /* renamed from: e  reason: collision with root package name */
    private int f۳۳۷۸e;

    /* renamed from: f  reason: collision with root package name */
    private int f۳۳۷۹f;

    /* renamed from: g  reason: collision with root package name */
    private int f۳۳۸۰g;

    /* renamed from: h  reason: collision with root package name */
    private int f۳۳۸۱h;
    private int i;
    private float j;
    private float k;
    private String l;
    private String m;
    private boolean n = false;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;

    public a(Context context) {
        super(context);
    }

    public void a(Context context, int amOrPm) {
        if (this.n) {
            Log.e("AmPmCirclesView", "AmPmCirclesView may only be initialized once.");
            return;
        }
        Resources res = context.getResources();
        this.f۳۳۷۹f = res.getColor(b.mdtp_white);
        this.i = res.getColor(b.mdtp_accent_color);
        this.f۳۳۷۸e = res.getColor(b.mdtp_accent_color_dark);
        this.f۳۳۸۰g = res.getColor(b.mdtp_ampm_text_color);
        this.f۳۳۸۱h = res.getColor(b.mdtp_white);
        this.f۳۳۷۷d = 255;
        this.f۳۳۷۶c.setTypeface(Typeface.create(res.getString(g.mdtp_sans_serif), 0));
        this.f۳۳۷۶c.setAntiAlias(true);
        this.f۳۳۷۶c.setTextAlign(Paint.Align.CENTER);
        this.j = Float.parseFloat(res.getString(g.mdtp_circle_radius_multiplier));
        this.k = Float.parseFloat(res.getString(g.mdtp_ampm_circle_radius_multiplier));
        this.l = "قبل‌ازظهر";
        this.m = "بعدازظهر";
        setAmOrPm(amOrPm);
        this.u = -1;
        this.n = true;
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, boolean themeDark) {
        Resources res = context.getResources();
        if (themeDark) {
            this.f۳۳۷۹f = res.getColor(b.mdtp_circle_background_dark_theme);
            this.i = res.getColor(b.mdtp_red);
            this.f۳۳۸۰g = res.getColor(b.mdtp_white);
            this.f۳۳۷۷d = 255;
            return;
        }
        this.f۳۳۷۹f = res.getColor(b.mdtp_white);
        this.i = res.getColor(b.mdtp_accent_color);
        this.f۳۳۸۰g = res.getColor(b.mdtp_ampm_text_color);
        this.f۳۳۷۷d = 255;
    }

    public void setAmOrPm(int amOrPm) {
        this.t = amOrPm;
    }

    public void setAmOrPmPressed(int amOrPmPressed) {
        this.u = amOrPmPressed;
    }

    public int a(float xCoord, float yCoord) {
        if (!this.o) {
            return -1;
        }
        int i2 = this.s;
        int squaredYDistance = (int) ((yCoord - ((float) i2)) * (yCoord - ((float) i2)));
        int i3 = this.q;
        if (((int) Math.sqrt((double) (((xCoord - ((float) i3)) * (xCoord - ((float) i3))) + ((float) squaredYDistance)))) <= this.p) {
            return 0;
        }
        int i4 = this.r;
        if (((int) Math.sqrt((double) (((xCoord - ((float) i4)) * (xCoord - ((float) i4))) + ((float) squaredYDistance)))) <= this.p) {
            return 1;
        }
        return -1;
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.n) {
            if (!this.o) {
                int layoutXCenter = getWidth() / 2;
                int layoutYCenter = getHeight() / 2;
                int circleRadius = (int) (((float) Math.min(layoutXCenter, layoutYCenter)) * this.j);
                this.p = (int) (((float) circleRadius) * this.k);
                double d2 = (double) layoutYCenter;
                int i2 = this.p;
                double d3 = (double) i2;
                Double.isNaN(d3);
                Double.isNaN(d2);
                int layoutYCenter2 = (int) (d2 + (d3 * 0.75d));
                this.f۳۳۷۶c.setTextSize((float) ((i2 * 3) / 4));
                int i3 = this.p;
                this.s = (layoutYCenter2 - (i3 / 2)) + circleRadius;
                this.q = (layoutXCenter - circleRadius) + i3;
                this.r = (layoutXCenter + circleRadius) - i3;
                this.o = true;
            }
            int amColor = this.f۳۳۷۹f;
            int amAlpha = 255;
            int amTextColor = this.f۳۳۸۰g;
            int pmColor = this.f۳۳۷۹f;
            int pmAlpha = 255;
            int pmTextColor = this.f۳۳۸۰g;
            int i4 = this.t;
            if (i4 == 0) {
                amColor = this.i;
                amAlpha = this.f۳۳۷۷d;
                amTextColor = this.f۳۳۸۱h;
            } else if (i4 == 1) {
                pmColor = this.i;
                pmAlpha = this.f۳۳۷۷d;
                pmTextColor = this.f۳۳۸۱h;
            }
            int i5 = this.u;
            if (i5 == 0) {
                amColor = this.f۳۳۷۸e;
                amAlpha = this.f۳۳۷۷d;
            } else if (i5 == 1) {
                pmColor = this.f۳۳۷۸e;
                pmAlpha = this.f۳۳۷۷d;
            }
            this.f۳۳۷۶c.setColor(amColor);
            this.f۳۳۷۶c.setAlpha(amAlpha);
            canvas.drawCircle((float) this.q, (float) this.s, (float) this.p, this.f۳۳۷۶c);
            this.f۳۳۷۶c.setColor(pmColor);
            this.f۳۳۷۶c.setAlpha(pmAlpha);
            canvas.drawCircle((float) this.r, (float) this.s, (float) this.p, this.f۳۳۷۶c);
            this.f۳۳۷۶c.setColor(amTextColor);
            int textYCenter = this.s - (((int) (this.f۳۳۷۶c.descent() + this.f۳۳۷۶c.ascent())) / 2);
            canvas.drawText(this.l, (float) this.q, (float) textYCenter, this.f۳۳۷۶c);
            this.f۳۳۷۶c.setColor(pmTextColor);
            canvas.drawText(this.m, (float) this.r, (float) textYCenter, this.f۳۳۷۶c);
        }
    }
}
