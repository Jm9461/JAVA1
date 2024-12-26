package b.e.a.a.k;

import android.view.View;
import b.h.a.i;

public class a extends b.e.a.a.a {
    @Override // b.e.a.a.a
    public void b(View target) {
        int distance = target.getTop() + target.getHeight();
        a().a(i.a(target, "alpha", 0.0f, 1.0f), i.a(target, "translationY", (float) (-distance), 0.0f));
    }
}
