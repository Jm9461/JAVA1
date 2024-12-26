package android.support.p۰۴۷v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.p۰۴۷v7.widget.Cy0;

/* renamed from: android.support.v7.widget.y  reason: invalid class name */
class Cy extends Ca0 {
    Cy() {
    }

    /* renamed from: android.support.v7.widget.y$a  reason: invalid class name */
    class Ca implements Cy0.AbstractCa {
        Ca(Cy this$0) {
        }

        @Override // android.support.p۰۴۷v7.widget.Cy0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۷۱۴a(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
            canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.Ca0, android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۱۳a() {
        Cy0.f۱۲۴۱۲r = new Ca(this);
    }
}
