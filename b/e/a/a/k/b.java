package b.e.a.a.k;

import android.view.View;
import android.view.ViewGroup;
import b.e.a.a.a;
import b.h.a.i;

public class b extends a {
    @Override // b.e.a.a.a
    public void b(View target) {
        int distance = ((ViewGroup) target.getParent()).getWidth() - target.getLeft();
        a().a(i.a(target, "alpha", 0.0f, 1.0f), i.a(target, "translationX", (float) (-distance), 0.0f));
    }
}
