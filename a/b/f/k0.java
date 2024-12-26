package a.b.f;

import android.view.View;
import android.view.WindowId;

/* access modifiers changed from: package-private */
public class k0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private final WindowId f۲۳۸a;

    k0(View view) {
        this.f۲۳۸a = view.getWindowId();
    }

    public boolean equals(Object o) {
        return (o instanceof k0) && ((k0) o).f۲۳۸a.equals(this.f۲۳۸a);
    }

    public int hashCode() {
        return this.f۲۳۸a.hashCode();
    }
}
