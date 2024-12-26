package p۱۵۹a.p۱۶۴b.p۱۸۱f;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: a.b.f.b0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cb0 implements InterfaceCc0 {

    /* renamed from: a, reason: contains not printable characters */
    private final ViewOverlay f۸۴۸۳a;

    Cb0(View view) {
        this.f۸۴۸۳a = view.getOverlay();
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.InterfaceCc0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۸۳۴۰a(Drawable drawable) {
        this.f۸۴۸۳a.add(drawable);
    }

    @Override // p۱۵۹a.p۱۶۴b.p۱۸۱f.InterfaceCc0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۸۳۴۲b(Drawable drawable) {
        this.f۸۴۸۳a.remove(drawable);
    }
}
