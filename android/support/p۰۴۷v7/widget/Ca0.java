package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p۰۴۷v7.widget.Cy0;

/* renamed from: android.support.v7.widget.a0  reason: invalid class name */
class Ca0 implements AbstractCc0 {

    /* renamed from: a  reason: contains not printable characters */
    final RectF f۱۱۹۱۱a = new RectF();

    Ca0() {
    }

    /* renamed from: android.support.v7.widget.a0$a  reason: invalid class name */
    class Ca implements Cy0.AbstractCa {
        Ca() {
        }

        @Override // android.support.p۰۴۷v7.widget.Cy0.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۴۹۸۷a(Canvas canvas, RectF bounds, float cornerRadius, Paint paint) {
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
                float f = bounds.top;
                canvas.drawRect((bounds.left + roundedCornerRadius) - 1.0f, f, (bounds.right - roundedCornerRadius) + 1.0f, f + roundedCornerRadius, paint);
                float f2 = bounds.bottom;
                canvas.drawRect((bounds.left + roundedCornerRadius) - 1.0f, f2 - roundedCornerRadius, (bounds.right - roundedCornerRadius) + 1.0f, f2, paint);
            }
            canvas.drawRect(bounds.left, bounds.top + cornerRadius, bounds.right, bounds.bottom - cornerRadius, paint);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۹۷۳a() {
        Cy0.f۱۲۴۱۲r = new Ca();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۹۷۵a(AbstractCb0 cardView, Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        Cy0 background = m۱۴۹۷۰a(context, backgroundColor, radius, elevation, maxElevation);
        background.m۱۵۷۲۷a(cardView.m۱۴۹۹۷d());
        cardView.m۱۴۹۹۴a(background);
        m۱۴۹۸۶i(cardView);
    }

    /* renamed from: a  reason: contains not printable characters */
    private Cy0 m۱۴۹۷۰a(Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        return new Cy0(context.getResources(), backgroundColor, radius, elevation, maxElevation);
    }

    /* renamed from: i  reason: contains not printable characters */
    public void m۱۴۹۸۶i(AbstractCb0 cardView) {
        Rect shadowPadding = new Rect();
        m۱۴۹۷۱j(cardView).m۱۵۷۲۶a(shadowPadding);
        cardView.m۱۴۹۹۲a((int) Math.ceil((double) m۱۴۹۷۷b(cardView)), (int) Math.ceil((double) m۱۴۹۷۲a(cardView)));
        cardView.m۱۴۹۹۳a(shadowPadding.left, shadowPadding.top, shadowPadding.right, shadowPadding.bottom);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۹۷۹c(AbstractCb0 cardView) {
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۴۹۸۳f(AbstractCb0 cardView) {
        m۱۴۹۷۱j(cardView).m۱۵۷۲۷a(cardView.m۱۴۹۹۷d());
        m۱۴۹۸۶i(cardView);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۹۷۶a(AbstractCb0 cardView, ColorStateList color) {
        m۱۴۹۷۱j(cardView).m۱۵۷۲۵a(color);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: e  reason: contains not printable characters */
    public ColorStateList m۱۴۹۸۲e(AbstractCb0 cardView) {
        return m۱۴۹۷۱j(cardView).m۱۵۷۲۳a();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۴۹۷۴a(AbstractCb0 cardView, float radius) {
        m۱۴۹۷۱j(cardView).m۱۵۷۲۴a(radius);
        m۱۴۹۸۶i(cardView);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: g  reason: contains not printable characters */
    public float m۱۴۹۸۴g(AbstractCb0 cardView) {
        return m۱۴۹۷۱j(cardView).m۱۵۷۲۸b();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۴۹۷۸b(AbstractCb0 cardView, float elevation) {
        m۱۴۹۷۱j(cardView).m۱۵۷۳۱c(elevation);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: d  reason: contains not printable characters */
    public float m۱۴۹۸۱d(AbstractCb0 cardView) {
        return m۱۴۹۷۱j(cardView).m۱۵۷۳۴f();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۹۸۰c(AbstractCb0 cardView, float maxElevation) {
        m۱۴۹۷۱j(cardView).m۱۵۷۲۹b(maxElevation);
        m۱۴۹۸۶i(cardView);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: h  reason: contains not printable characters */
    public float m۱۴۹۸۵h(AbstractCb0 cardView) {
        return m۱۴۹۷۱j(cardView).m۱۵۷۳۰c();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: b  reason: contains not printable characters */
    public float m۱۴۹۷۷b(AbstractCb0 cardView) {
        return m۱۴۹۷۱j(cardView).m۱۵۷۳۳e();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public float m۱۴۹۷۲a(AbstractCb0 cardView) {
        return m۱۴۹۷۱j(cardView).m۱۵۷۳۲d();
    }

    /* renamed from: j  reason: contains not printable characters */
    private Cy0 m۱۴۹۷۱j(AbstractCb0 cardView) {
        return (Cy0) cardView.m۱۴۹۹۶c();
    }
}
