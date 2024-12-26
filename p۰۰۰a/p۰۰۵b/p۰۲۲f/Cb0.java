package p۰۰۰a.p۰۰۵b.p۰۲۲f;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* access modifiers changed from: package-private */
/* renamed from: a.b.f.b0  reason: invalid class name */
public class Cb0 implements AbstractCc0 {

    /* renamed from: a  reason: contains not printable characters */
    private final ViewOverlay f۸۴۸۳a;

    Cb0(View view) {
        this.f۸۴۸۳a = view.getOverlay();
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCc0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۱۷۸a(Drawable drawable) {
        this.f۸۴۸۳a.add(drawable);
    }

    @Override // p۰۰۰a.p۰۰۵b.p۰۲۲f.AbstractCc0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۱۷۹b(Drawable drawable) {
        this.f۸۴۸۳a.remove(drawable);
    }
}
