package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: android.support.v7.widget.z  reason: invalid class name */
class Cz implements AbstractCc0 {
    Cz() {
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۴۰a(AbstractCb0 cardView, Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        cardView.m۱۴۹۹۴a(new Cx0(backgroundColor, radius));
        View view = cardView.m۱۴۹۹۱a();
        view.setClipToOutline(true);
        view.setElevation(elevation);
        m۱۵۷۴۵c(cardView, maxElevation);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۳۹a(AbstractCb0 cardView, float radius) {
        m۱۵۷۳۶j(cardView).m۱۵۷۰۸a(radius);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۳۸a() {
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۷۴۵c(AbstractCb0 cardView, float maxElevation) {
        m۱۵۷۳۶j(cardView).m۱۵۷۰۹a(maxElevation, cardView.m۱۴۹۹۵b(), cardView.m۱۴۹۹۷d());
        m۱۵۷۵۱i(cardView);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: h  reason: contains not printable characters */
    public float m۱۵۷۵۰h(AbstractCb0 cardView) {
        return m۱۵۷۳۶j(cardView).m۱۵۷۱۱b();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: b  reason: contains not printable characters */
    public float m۱۵۷۴۲b(AbstractCb0 cardView) {
        return m۱۵۷۴۹g(cardView) * 2.0f;
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public float m۱۵۷۳۷a(AbstractCb0 cardView) {
        return m۱۵۷۴۹g(cardView) * 2.0f;
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: g  reason: contains not printable characters */
    public float m۱۵۷۴۹g(AbstractCb0 cardView) {
        return m۱۵۷۳۶j(cardView).m۱۵۷۱۲c();
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۷۴۳b(AbstractCb0 cardView, float elevation) {
        cardView.m۱۴۹۹۱a().setElevation(elevation);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: d  reason: contains not printable characters */
    public float m۱۵۷۴۶d(AbstractCb0 cardView) {
        return cardView.m۱۴۹۹۱a().getElevation();
    }

    /* renamed from: i  reason: contains not printable characters */
    public void m۱۵۷۵۱i(AbstractCb0 cardView) {
        if (!cardView.m۱۴۹۹۵b()) {
            cardView.m۱۴۹۹۳a(0, 0, 0, 0);
            return;
        }
        float elevation = m۱۵۷۵۰h(cardView);
        float radius = m۱۵۷۴۹g(cardView);
        int hPadding = (int) Math.ceil((double) Cy0.m۱۵۷۱۵a(elevation, radius, cardView.m۱۴۹۹۷d()));
        int vPadding = (int) Math.ceil((double) Cy0.m۱۵۷۱۸b(elevation, radius, cardView.m۱۴۹۹۷d()));
        cardView.m۱۴۹۹۳a(hPadding, vPadding, hPadding, vPadding);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۷۴۴c(AbstractCb0 cardView) {
        m۱۵۷۴۵c(cardView, m۱۵۷۵۰h(cardView));
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: f  reason: contains not printable characters */
    public void m۱۵۷۴۸f(AbstractCb0 cardView) {
        m۱۵۷۴۵c(cardView, m۱۵۷۵۰h(cardView));
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۷۴۱a(AbstractCb0 cardView, ColorStateList color) {
        m۱۵۷۳۶j(cardView).m۱۵۷۱۰a(color);
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCc0
    /* renamed from: e  reason: contains not printable characters */
    public ColorStateList m۱۵۷۴۷e(AbstractCb0 cardView) {
        return m۱۵۷۳۶j(cardView).m۱۵۷۰۷a();
    }

    /* renamed from: j  reason: contains not printable characters */
    private Cx0 m۱۵۷۳۶j(AbstractCb0 cardView) {
        return (Cx0) cardView.m۱۴۹۹۶c();
    }
}
