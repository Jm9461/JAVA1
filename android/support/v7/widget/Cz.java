package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: android.support.v7.widget.z, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cz implements InterfaceCc0 {
    Cz() {
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۶۷۰a(InterfaceCb0 cardView, Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        Cx0 background = new Cx0(backgroundColor, radius);
        cardView.mo۱۲۹۲۴a(background);
        View view = cardView.mo۱۲۹۲۱a();
        view.setClipToOutline(true);
        view.setElevation(elevation);
        mo۱۳۶۷۵c(cardView, maxElevation);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۶۶۹a(InterfaceCb0 cardView, float radius) {
        m۱۳۶۶۶j(cardView).m۱۳۶۳۸a(radius);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۶۶۸a() {
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۳۶۷۵c(InterfaceCb0 cardView, float maxElevation) {
        m۱۳۶۶۶j(cardView).m۱۳۶۳۹a(maxElevation, cardView.mo۱۲۹۲۵b(), cardView.mo۱۲۹۲۷d());
        m۱۳۶۸۱i(cardView);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: h, reason: contains not printable characters */
    public float mo۱۳۶۸۰h(InterfaceCb0 cardView) {
        return m۱۳۶۶۶j(cardView).m۱۳۶۴۱b();
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: b, reason: contains not printable characters */
    public float mo۱۳۶۷۲b(InterfaceCb0 cardView) {
        return mo۱۳۶۷۹g(cardView) * 2.0f;
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public float mo۱۳۶۶۷a(InterfaceCb0 cardView) {
        return mo۱۳۶۷۹g(cardView) * 2.0f;
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: g, reason: contains not printable characters */
    public float mo۱۳۶۷۹g(InterfaceCb0 cardView) {
        return m۱۳۶۶۶j(cardView).m۱۳۶۴۲c();
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۶۷۳b(InterfaceCb0 cardView, float elevation) {
        cardView.mo۱۲۹۲۱a().setElevation(elevation);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: d, reason: contains not printable characters */
    public float mo۱۳۶۷۶d(InterfaceCb0 cardView) {
        return cardView.mo۱۲۹۲۱a().getElevation();
    }

    /* renamed from: i, reason: contains not printable characters */
    public void m۱۳۶۸۱i(InterfaceCb0 cardView) {
        if (!cardView.mo۱۲۹۲۵b()) {
            cardView.mo۱۲۹۲۳a(0, 0, 0, 0);
            return;
        }
        float elevation = mo۱۳۶۸۰h(cardView);
        float radius = mo۱۳۶۷۹g(cardView);
        int hPadding = (int) Math.ceil(Cy0.m۱۳۶۴۵a(elevation, radius, cardView.mo۱۲۹۲۷d()));
        int vPadding = (int) Math.ceil(Cy0.m۱۳۶۴۸b(elevation, radius, cardView.mo۱۲۹۲۷d()));
        cardView.mo۱۲۹۲۳a(hPadding, vPadding, hPadding, vPadding);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۳۶۷۴c(InterfaceCb0 cardView) {
        mo۱۳۶۷۵c(cardView, mo۱۳۶۸۰h(cardView));
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: f, reason: contains not printable characters */
    public void mo۱۳۶۷۸f(InterfaceCb0 cardView) {
        mo۱۳۶۷۵c(cardView, mo۱۳۶۸۰h(cardView));
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۶۷۱a(InterfaceCb0 cardView, ColorStateList color) {
        m۱۳۶۶۶j(cardView).m۱۳۶۴۰a(color);
    }

    @Override // android.support.v7.widget.InterfaceCc0
    /* renamed from: e, reason: contains not printable characters */
    public ColorStateList mo۱۳۶۷۷e(InterfaceCb0 cardView) {
        return m۱۳۶۶۶j(cardView).m۱۳۶۳۷a();
    }

    /* renamed from: j, reason: contains not printable characters */
    private Cx0 m۱۳۶۶۶j(InterfaceCb0 cardView) {
        return (Cx0) cardView.mo۱۲۹۲۶c();
    }
}
