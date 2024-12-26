package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.Cy0;

/* renamed from: android.support.v7.widget.a0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Ca0 implements InterfaceCc0 {

    /* renamed from: a, reason: contains not printable characters */
    final RectF f۱۱۹۱۱a = new RectF();

    Ca0() {
    }

    /* renamed from: android.support.v7.widget.a0$a */
    class a implements Cy0.a {
        a() {
        }

        @Override // android.support.v7.widget.Cy0.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۶۶۵a(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
            float twoRadius = cornerRadius * 2.0f;
            float innerWidth = (bounds.width() - twoRadius) - 1.0f;
            float innerHeight = (bounds.height() - twoRadius) - 1.0f;
            if (cornerRadius >= 1.0f) {
                float roundedCornerRadius = cornerRadius + 0.5f;
                Ca0.this.f۱۱۹۱۱a.set(-roundedCornerRadius, -roundedCornerRadius, roundedCornerRadius, roundedCornerRadius);
                int saved = canvas.save();
                canvas.translate(bounds.left + roundedCornerRadius, bounds.top + roundedCornerRadius);
                canvas.drawArc(Ca0.this.f۱۱۹۱۱a, 180.0f, 90.0f, true, paint);
                canvas.translate(innerWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(Ca0.this.f۱۱۹۱۱a, 180.0f, 90.0f, true, paint);
                canvas.translate(innerHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(Ca0.this.f۱۱۹۱۱a, 180.0f, 90.0f, true, paint);
                canvas.translate(innerWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(Ca0.this.f۱۱۹۱۱a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(saved);
                float f2 = (bounds.left + roundedCornerRadius) - 1.0f;
                float f3 = bounds.top;
                canvas.drawRect(f2, f3, (bounds.right - roundedCornerRadius) + 1.0f, f3 + roundedCornerRadius, paint);
                float f4 = (bounds.left + roundedCornerRadius) - 1.0f;
                float f5 = bounds.bottom;
                canvas.drawRect(f4, f5 - roundedCornerRadius, (bounds.right - roundedCornerRadius) + 1.0f, f5, paint);
            }
            canvas.drawRect(bounds.left, bounds.top + cornerRadius, bounds.right, bounds.bottom - cornerRadius, paint);
        }
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۶۶۸a() {
        Cy0.f۱۲۴۱۲r = new a();
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۶۷۰a(InterfaceCb0 cardView, Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        Cy0 background = m۱۲۹۰۰a(context, backgroundColor, radius, elevation, maxElevation);
        background.m۱۳۶۵۷a(cardView.mo۱۲۹۲۷d());
        cardView.mo۱۲۹۲۴a(background);
        m۱۲۹۱۶i(cardView);
    }

    /* renamed from: a, reason: contains not printable characters */
    private Cy0 m۱۲۹۰۰a(Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        return new Cy0(context.getResources(), backgroundColor, radius, elevation, maxElevation);
    }

    /* renamed from: i, reason: contains not printable characters */
    public void m۱۲۹۱۶i(InterfaceCb0 cardView) {
        Rect shadowPadding = new Rect();
        m۱۲۹۰۱j(cardView).m۱۳۶۵۶a(shadowPadding);
        cardView.mo۱۲۹۲۲a((int) Math.ceil(mo۱۳۶۷۲b(cardView)), (int) Math.ceil(mo۱۳۶۶۷a(cardView)));
        cardView.mo۱۲۹۲۳a(shadowPadding.left, shadowPadding.top, shadowPadding.right, shadowPadding.bottom);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۳۶۷۴c(InterfaceCb0 cardView) {
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: f, reason: contains not printable characters */
    public void mo۱۳۶۷۸f(InterfaceCb0 cardView) {
        m۱۲۹۰۱j(cardView).m۱۳۶۵۷a(cardView.mo۱۲۹۲۷d());
        m۱۲۹۱۶i(cardView);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۶۷۱a(InterfaceCb0 cardView, ColorStateList color) {
        m۱۲۹۰۱j(cardView).m۱۳۶۵۵a(color);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: e, reason: contains not printable characters */
    public ColorStateList mo۱۳۶۷۷e(InterfaceCb0 cardView) {
        return m۱۲۹۰۱j(cardView).m۱۳۶۵۳a();
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۶۶۹a(InterfaceCb0 cardView, float radius) {
        m۱۲۹۰۱j(cardView).m۱۳۶۵۴a(radius);
        m۱۲۹۱۶i(cardView);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: g, reason: contains not printable characters */
    public float mo۱۳۶۷۹g(InterfaceCb0 cardView) {
        return m۱۲۹۰۱j(cardView).m۱۳۶۵۸b();
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۶۷۳b(InterfaceCb0 cardView, float elevation) {
        m۱۲۹۰۱j(cardView).m۱۳۶۶۱c(elevation);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: d, reason: contains not printable characters */
    public float mo۱۳۶۷۶d(InterfaceCb0 cardView) {
        return m۱۲۹۰۱j(cardView).m۱۳۶۶۴f();
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۳۶۷۵c(InterfaceCb0 cardView, float maxElevation) {
        m۱۲۹۰۱j(cardView).m۱۳۶۵۹b(maxElevation);
        m۱۲۹۱۶i(cardView);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: h, reason: contains not printable characters */
    public float mo۱۳۶۸۰h(InterfaceCb0 cardView) {
        return m۱۲۹۰۱j(cardView).m۱۳۶۶۰c();
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: b, reason: contains not printable characters */
    public float mo۱۳۶۷۲b(InterfaceCb0 cardView) {
        return m۱۲۹۰۱j(cardView).m۱۳۶۶۳e();
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public float mo۱۳۶۶۷a(InterfaceCb0 cardView) {
        return m۱۲۹۰۱j(cardView).m۱۳۶۶۲d();
    }

    /* renamed from: j, reason: contains not printable characters */
    private Cy0 m۱۲۹۰۱j(InterfaceCb0 cardView) {
        return (Cy0) cardView.mo۱۲۹۲۶c();
    }
}
