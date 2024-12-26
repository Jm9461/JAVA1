package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.y0;

class a0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    final RectF f۱۹۷۵a = new RectF();

    a0() {
    }

    class a implements y0.a {
        a() {
        }

        @Override // android.support.v7.widget.y0.a
        public void a(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
            float twoRadius = cornerRadius * 2.0f;
            float innerWidth = (bounds.width() - twoRadius) - 1.0f;
            float innerHeight = (bounds.height() - twoRadius) - 1.0f;
            if (cornerRadius >= 1.0f) {
                float roundedCornerRadius = cornerRadius + 0.5f;
                a0.this.f۱۹۷۵a.set(-roundedCornerRadius, -roundedCornerRadius, roundedCornerRadius, roundedCornerRadius);
                int saved = canvas.save();
                canvas.translate(bounds.left + roundedCornerRadius, bounds.top + roundedCornerRadius);
                canvas.drawArc(a0.this.f۱۹۷۵a, 180.0f, 90.0f, true, paint);
                canvas.translate(innerWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(a0.this.f۱۹۷۵a, 180.0f, 90.0f, true, paint);
                canvas.translate(innerHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(a0.this.f۱۹۷۵a, 180.0f, 90.0f, true, paint);
                canvas.translate(innerWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(a0.this.f۱۹۷۵a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(saved);
                float f2 = bounds.top;
                canvas.drawRect((bounds.left + roundedCornerRadius) - 1.0f, f2, (bounds.right - roundedCornerRadius) + 1.0f, f2 + roundedCornerRadius, paint);
                float f3 = bounds.bottom;
                canvas.drawRect((bounds.left + roundedCornerRadius) - 1.0f, f3 - roundedCornerRadius, (bounds.right - roundedCornerRadius) + 1.0f, f3, paint);
            }
            canvas.drawRect(bounds.left, bounds.top + cornerRadius, bounds.right, bounds.bottom - cornerRadius, paint);
        }
    }

    @Override // android.support.v7.widget.c0
    public void a() {
        y0.r = new a();
    }

    @Override // android.support.v7.widget.c0
    public void a(b0 cardView, Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        y0 background = a(context, backgroundColor, radius, elevation, maxElevation);
        background.a(cardView.d());
        cardView.a(background);
        i(cardView);
    }

    private y0 a(Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        return new y0(context.getResources(), backgroundColor, radius, elevation, maxElevation);
    }

    public void i(b0 cardView) {
        Rect shadowPadding = new Rect();
        j(cardView).a(shadowPadding);
        cardView.a((int) Math.ceil((double) b(cardView)), (int) Math.ceil((double) a(cardView)));
        cardView.a(shadowPadding.left, shadowPadding.top, shadowPadding.right, shadowPadding.bottom);
    }

    @Override // android.support.v7.widget.c0
    public void c(b0 cardView) {
    }

    @Override // android.support.v7.widget.c0
    public void f(b0 cardView) {
        j(cardView).a(cardView.d());
        i(cardView);
    }

    @Override // android.support.v7.widget.c0
    public void a(b0 cardView, ColorStateList color) {
        j(cardView).a(color);
    }

    @Override // android.support.v7.widget.c0
    public ColorStateList e(b0 cardView) {
        return j(cardView).a();
    }

    @Override // android.support.v7.widget.c0
    public void a(b0 cardView, float radius) {
        j(cardView).a(radius);
        i(cardView);
    }

    @Override // android.support.v7.widget.c0
    public float g(b0 cardView) {
        return j(cardView).b();
    }

    @Override // android.support.v7.widget.c0
    public void b(b0 cardView, float elevation) {
        j(cardView).c(elevation);
    }

    @Override // android.support.v7.widget.c0
    public float d(b0 cardView) {
        return j(cardView).f();
    }

    @Override // android.support.v7.widget.c0
    public void c(b0 cardView, float maxElevation) {
        j(cardView).b(maxElevation);
        i(cardView);
    }

    @Override // android.support.v7.widget.c0
    public float h(b0 cardView) {
        return j(cardView).c();
    }

    @Override // android.support.v7.widget.c0
    public float b(b0 cardView) {
        return j(cardView).e();
    }

    @Override // android.support.v7.widget.c0
    public float a(b0 cardView) {
        return j(cardView).d();
    }

    private y0 j(b0 cardView) {
        return (y0) cardView.c();
    }
}
