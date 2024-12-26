package a.b.f;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* access modifiers changed from: package-private */
public class b0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final ViewOverlay f۱۶۸a;

    b0(View view) {
        this.f۱۶۸a = view.getOverlay();
    }

    @Override // a.b.f.c0
    public void a(Drawable drawable) {
        this.f۱۶۸a.add(drawable);
    }

    @Override // a.b.f.c0
    public void b(Drawable drawable) {
        this.f۱۶۸a.remove(drawable);
    }
}
