package com.mohamadamin.persianmaterialdatetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.mohamadamin.persianmaterialdatetimepicker.Cb;
import com.mohamadamin.persianmaterialdatetimepicker.Cc;
import com.mohamadamin.persianmaterialdatetimepicker.Cg;
import com.mohamadamin.persianmaterialdatetimepicker.p۱۳۵j.Ca;

public class TextViewWithCircularIndicator extends TextView {

    /* renamed from: c  reason: contains not printable characters */
    Paint f۱۴۸۶۳c = new Paint();

    /* renamed from: d  reason: contains not printable characters */
    private final int f۱۴۸۶۴d;

    /* renamed from: e  reason: contains not printable characters */
    private final String f۱۴۸۶۵e;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۱۴۸۶۶f;

    public TextViewWithCircularIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        Resources res = context.getResources();
        this.f۱۴۸۶۴d = res.getColor(Cb.mdtp_accent_color);
        res.getDimensionPixelOffset(Cc.mdtp_month_select_circle_radius);
        this.f۱۴۸۶۵e = context.getResources().getString(Cg.mdtp_item_is_selected);
        m۱۷۸۹۴a();
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۷۸۹۴a() {
        this.f۱۴۸۶۳c.setFakeBoldText(true);
        this.f۱۴۸۶۳c.setAntiAlias(true);
        this.f۱۴۸۶۳c.setColor(this.f۱۴۸۶۴d);
        this.f۱۴۸۶۳c.setTextAlign(Paint.Align.CENTER);
        this.f۱۴۸۶۳c.setStyle(Paint.Style.FILL);
        this.f۱۴۸۶۳c.setAlpha(255);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۷۸۹۵a(boolean drawCircle) {
        this.f۱۴۸۶۶f = drawCircle;
    }

    public void onDraw(Canvas canvas) {
        if (this.f۱۴۸۶۶f) {
            int width = getWidth();
            int height = getHeight();
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (Math.min(width, height) / 2), this.f۱۴۸۶۳c);
        }
        setSelected(this.f۱۴۸۶۶f);
        super.onDraw(canvas);
    }

    public CharSequence getContentDescription() {
        String itemText = Ca.m۱۸۰۰۱b(getText().toString());
        if (!this.f۱۴۸۶۶f) {
            return itemText;
        }
        return String.format(this.f۱۴۸۶۵e, itemText);
    }
}
