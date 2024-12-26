package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.mohamadamin.persianmaterialdatetimepicker.j.a;

public class h extends e {
    public h(Context context, AttributeSet attr, a controller) {
        super(context, attr, controller);
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.e
    public void a(Canvas canvas, int year, int month, int day, int x, int y, int startX, int stopX, int startY, int stopY) {
        if (this.p == day) {
            canvas.drawCircle((float) x, (float) (y - (e.K / 3)), (float) e.O, this.f۳۳۵۰h);
        }
        if (a(year, month, day)) {
            this.f۳۳۴۸f.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        } else {
            this.f۳۳۴۸f.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        }
        if (b(year, month, day)) {
            this.f۳۳۴۸f.setColor(this.F);
        } else if (this.p == day) {
            this.f۳۳۴۸f.setColor(this.B);
        } else if (!this.o || this.q != day) {
            this.f۳۳۴۸f.setColor(a(year, month, day) ? this.E : this.A);
        } else {
            this.f۳۳۴۸f.setColor(this.D);
        }
        canvas.drawText(a.b(String.format("%d", Integer.valueOf(day))), (float) x, (float) y, this.f۳۳۴۸f);
    }
}
