package b.e.a.a.k;

import android.view.View;
import android.view.ViewGroup;
import b.e.a.a.a;
import b.h.a.i;

public class e extends a {
    @Override // b.e.a.a.a
    public void b(View target) {
        int distance = ((ViewGroup) target.getParent()).getHeight() - target.getTop();
        a().a(i.a(target, "alpha", 1.0f, 0.0f), i.a(target, "translationY", 0.0f, (float) distance));
    }
}
