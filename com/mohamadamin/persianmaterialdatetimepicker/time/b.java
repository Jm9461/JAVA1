package com.mohamadamin.persianmaterialdatetimepicker.time;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import com.mohamadamin.persianmaterialdatetimepicker.g;

public class b extends View {

    /* renamed from: c  reason: collision with root package name */
    private final Paint f۳۳۸۲c = new Paint();

    /* renamed from: d  reason: collision with root package name */
    private boolean f۳۳۸۳d;

    /* renamed from: e  reason: collision with root package name */
    private int f۳۳۸۴e;

    /* renamed from: f  reason: collision with root package name */
    private int f۳۳۸۵f;

    /* renamed from: g  reason: collision with root package name */
    private float f۳۳۸۶g;

    /* renamed from: h  reason: collision with root package name */
    private float f۳۳۸۷h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;

    public b(Context context) {
        super(context);
        Resources res = context.getResources();
        this.f۳۳۸۴e = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_circle_color);
        this.f۳۳۸۵f = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_numbers_text_color);
        this.f۳۳۸۲c.setAntiAlias(true);
        this.i = false;
    }

    public void a(Context context, boolean is24HourMode) {
        if (this.i) {
            Log.e("CircleView", "CircleView may only be initialized once.");
            return;
        }
        Resources res = context.getResources();
        this.f۳۳۸۳d = is24HourMode;
        if (is24HourMode) {
            this.f۳۳۸۶g = Float.parseFloat(res.getString(g.mdtp_circle_radius_multiplier_24HourMode));
        } else {
            this.f۳۳۸۶g = Float.parseFloat(res.getString(g.mdtp_circle_radius_multiplier));
            this.f۳۳۸۷h = Float.parseFloat(res.getString(g.mdtp_ampm_circle_radius_multiplier));
        }
        this.i = true;
    }

    /* access modifiers changed from: package-private */
    public void b(Context context, boolean dark) {
        Resources res = context.getResources();
        if (dark) {
            this.f۳۳۸۴e = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_circle_background_dark_theme);
            this.f۳۳۸۵f = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_white);
            return;
        }
        this.f۳۳۸۴e = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_circle_color);
        this.f۳۳۸۵f = res.getColor(com.mohamadamin.persianmaterialdatetimepicker.b.mdtp_numbers_text_color);
    }

    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && this.i) {
            if (!this.j) {
                this.k = getWidth() / 2;
                this.l = getHeight() / 2;
                this.m = (int) (((float) Math.min(this.k, this.l)) * this.f۳۳۸۶g);
                if (!this.f۳۳۸۳d) {
                    double d2 = (double) this.l;
                    double d3 = (double) ((int) (((float) this.m) * this.f۳۳۸۷h));
                    Double.isNaN(d3);
                    Double.isNaN(d2);
                    this.l = (int) (d2 - (d3 * 0.75d));
                }
                this.j = true;
            }
            this.f۳۳۸۲c.setColor(this.f۳۳۸۴e);
            canvas.drawCircle((float) this.k, (float) this.l, (float) this.m, this.f۳۳۸۲c);
            this.f۳۳۸۲c.setColor(this.f۳۳۸۵f);
            canvas.drawCircle((float) this.k, (float) this.l, 4.0f, this.f۳۳۸۲c);
        }
    }
}
