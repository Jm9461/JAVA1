package a.b.f;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* access modifiers changed from: package-private */
public class v implements w {

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroupOverlay f۲۷۴a;

    v(ViewGroup group) {
        this.f۲۷۴a = group.getOverlay();
    }

    @Override // a.b.f.c0
    public void a(Drawable drawable) {
        this.f۲۷۴a.add(drawable);
    }

    @Override // a.b.f.c0
    public void b(Drawable drawable) {
        this.f۲۷۴a.remove(drawable);
    }

    @Override // a.b.f.w
    public void a(View view) {
        this.f۲۷۴a.add(view);
    }

    @Override // a.b.f.w
    public void b(View view) {
        this.f۲۷۴a.remove(view);
    }
}
