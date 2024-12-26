package b.e.a.a.m;

import android.view.View;
import android.view.ViewGroup;
import b.e.a.a.a;
import b.h.a.i;

public class e extends a {
    @Override // b.e.a.a.a
    public void b(View target) {
        int distance = ((ViewGroup) target.getParent()).getHeight() - target.getTop();
        a().a(i.a(target, "alpha", 0.0f, 1.0f, 1.0f), i.a(target, "scaleX", 0.1f, 0.475f, 1.0f), i.a(target, "scaleY", 0.1f, 0.475f, 1.0f), i.a(target, "translationY", (float) distance, -60.0f, 0.0f));
    }
}
