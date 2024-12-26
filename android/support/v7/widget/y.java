package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.widget.y0;

class y extends a0 {
    y() {
    }

    class a implements y0.a {
        a(y this$0) {
        }

        @Override // android.support.v7.widget.y0.a
        public void a(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
            canvas.drawRoundRect(bounds, cornerRadius, cornerRadius, paint);
        }
    }

    @Override // android.support.v7.widget.a0, android.support.v7.widget.c0
    public void a() {
        y0.r = new a(this);
    }
}
