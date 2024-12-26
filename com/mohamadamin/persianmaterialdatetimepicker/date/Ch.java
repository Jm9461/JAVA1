package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca;

/* renamed from: com.mohamadamin.persianmaterialdatetimepicker.date.h  reason: invalid class name */
public class Ch extends AbstractCe {
    public Ch(Context context, AttributeSet attr, AbstractCa controller) {
        super(context, attr, controller);
    }

    @Override // com.mohamadamin.persianmaterialdatetimepicker.date.AbstractCe
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۹۸۴a(Canvas canvas, int year, int month, int day, int x, int y, int startX, int stopX, int startY, int stopY) {
        if (this.f۱۴۹۴۷p == day) {
            canvas.drawCircle((float) x, (float) (y - (AbstractCe.f۱۴۹۲۲K / 3)), (float) AbstractCe.f۱۴۹۲۶O, this.f۱۴۹۳۹h);
        }
        if (m۱۷۹۶۳a(year, month, day)) {
            this.f۱۴۹۳۷f.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        } else {
            this.f۱۴۹۳۷f.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        }
        if (m۱۷۹۶۸b(year, month, day)) {
            this.f۱۴۹۳۷f.setColor(this.f۱۴۹۳۲F);
        } else if (this.f۱۴۹۴۷p == day) {
            this.f۱۴۹۳۷f.setColor(this.f۱۴۹۲۸B);
        } else if (!this.f۱۴۹۴۶o || this.f۱۴۹۴۸q != day) {
            this.f۱۴۹۳۷f.setColor(m۱۷۹۶۳a(year, month, day) ? this.f۱۴۹۳۱E : this.f۱۴۹۲۷A);
        } else {
            this.f۱۴۹۳۷f.setColor(this.f۱۴۹۳۰D);
        }
        canvas.drawText(Ca.m۱۸۰۰۱b(String.format("%d", Integer.valueOf(day))), (float) x, (float) y, this.f۱۴۹۳۷f);
    }
}
