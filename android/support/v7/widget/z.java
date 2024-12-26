package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

class z implements c0 {
    z() {
    }

    @Override // android.support.v7.widget.c0
    public void a(b0 cardView, Context context, ColorStateList backgroundColor, float radius, float elevation, float maxElevation) {
        cardView.a(new x0(backgroundColor, radius));
        View view = cardView.a();
        view.setClipToOutline(true);
        view.setElevation(elevation);
        c(cardView, maxElevation);
    }

    @Override // android.support.v7.widget.c0
    public void a(b0 cardView, float radius) {
        j(cardView).a(radius);
    }

    @Override // android.support.v7.widget.c0
    public void a() {
    }

    @Override // android.support.v7.widget.c0
    public void c(b0 cardView, float maxElevation) {
        j(cardView).a(maxElevation, cardView.b(), cardView.d());
        i(cardView);
    }

    @Override // android.support.v7.widget.c0
    public float h(b0 cardView) {
        return j(cardView).b();
    }

    @Override // android.support.v7.widget.c0
    public float b(b0 cardView) {
        return g(cardView) * 2.0f;
    }

    @Override // android.support.v7.widget.c0
    public float a(b0 cardView) {
        return g(cardView) * 2.0f;
    }

    @Override // android.support.v7.widget.c0
    public float g(b0 cardView) {
        return j(cardView).c();
    }

    @Override // android.support.v7.widget.c0
    public void b(b0 cardView, float elevation) {
        cardView.a().setElevation(elevation);
    }

    @Override // android.support.v7.widget.c0
    public float d(b0 cardView) {
        return cardView.a().getElevation();
    }

    public void i(b0 cardView) {
        if (!cardView.b()) {
            cardView.a(0, 0, 0, 0);
            return;
        }
        float elevation = h(cardView);
        float radius = g(cardView);
        int hPadding = (int) Math.ceil((double) y0.a(elevation, radius, cardView.d()));
        int vPadding = (int) Math.ceil((double) y0.b(elevation, radius, cardView.d()));
        cardView.a(hPadding, vPadding, hPadding, vPadding);
    }

    @Override // android.support.v7.widget.c0
    public void c(b0 cardView) {
        c(cardView, h(cardView));
    }

    @Override // android.support.v7.widget.c0
    public void f(b0 cardView) {
        c(cardView, h(cardView));
    }

    @Override // android.support.v7.widget.c0
    public void a(b0 cardView, ColorStateList color) {
        j(cardView).a(color);
    }

    @Override // android.support.v7.widget.c0
    public ColorStateList e(b0 cardView) {
        return j(cardView).a();
    }

    private x0 j(b0 cardView) {
        return (x0) cardView.c();
    }
}
