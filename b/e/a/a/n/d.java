package b.e.a.a.n;

import android.view.View;
import android.view.ViewGroup;
import b.e.a.a.a;
import b.h.a.i;

public class d extends a {
    /* access modifiers changed from: protected */
    @Override // b.e.a.a.a
    public void b(View target) {
        ViewGroup parent = (ViewGroup) target.getParent();
        int distance = parent.getWidth() - parent.getLeft();
        a().a(i.a(target, "alpha", 1.0f, 1.0f, 0.0f), i.a(target, "scaleX", 1.0f, 0.475f, 0.1f), i.a(target, "scaleY", 1.0f, 0.475f, 0.1f), i.a(target, "translationX", 0.0f, -42.0f, (float) distance));
    }
}
