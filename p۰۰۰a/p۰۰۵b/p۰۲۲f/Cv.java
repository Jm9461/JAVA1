package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* access modifiers changed from: package-private */
/* renamed from: a.b.f.v  reason: invalid class name */
public class Cv implements AbstractCw {

    /* renamed from: a  reason: contains not printable characters */
    private final ViewGroupOverlay f۸۶۳۷a;

    Cv(ViewGroup group) {
        this.f۸۶۳۷a = group.getOverlay();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۴۰۵a(Drawable drawable) {
        this.f۸۶۳۷a.add(drawable);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCc0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۴۰۷b(Drawable drawable) {
        this.f۸۶۳۷a.remove(drawable);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCw
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۴۰۶a(View view) {
        this.f۸۶۳۷a.add(view);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCw
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۴۰۸b(View view) {
        this.f۸۶۳۷a.remove(view);
    }
}
