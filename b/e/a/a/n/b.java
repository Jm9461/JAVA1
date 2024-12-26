package b.e.a.a.n;

import android.view.View;
import android.view.ViewGroup;
import b.e.a.a.a;
import b.h.a.i;

public class b extends a {
    /* access modifiers changed from: protected */
    @Override // b.e.a.a.a
    public void b(View target) {
        int distance = ((ViewGroup) target.getParent()).getHeight() - target.getTop();
        a().a(i.a(target, "alpha", 1.0f, 1.0f, 0.0f), i.a(target, "scaleX", 1.0f, 0.475f, 0.1f), i.a(target, "scaleY", 1.0f, 0.475f, 0.1f), i.a(target, "translationY", 0.0f, -60.0f, (float) distance));
    }
}
