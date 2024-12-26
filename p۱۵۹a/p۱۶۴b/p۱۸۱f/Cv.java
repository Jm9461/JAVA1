package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: a.b.f.v, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cv implements InterfaceCw {

    /* renamed from: a, reason: contains not printable characters */
    private final ViewGroupOverlay f۸۶۳۷a;

    Cv(ViewGroup group) {
        this.f۸۶۳۷a = group.getOverlay();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۴۰a(Drawable drawable) {
        this.f۸۶۳۷a.add(drawable);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.InterfaceCc0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۸۳۴۲b(Drawable drawable) {
        this.f۸۶۳۷a.remove(drawable);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.InterfaceCw
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۴۴a(View view) {
        this.f۸۶۳۷a.add(view);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.InterfaceCw
    /* renamed from: b, reason: contains not printable characters */
    public void mo۸۳۴۵b(View view) {
        this.f۸۶۳۷a.remove(view);
    }
}
