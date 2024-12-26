package b.e.a.a.j;

import android.view.View;
import b.e.a.a.a;
import b.h.a.i;

public class b extends a {
    @Override // b.e.a.a.a
    public void b(View target) {
        float x = (float) target.getPaddingLeft();
        float y = (float) (target.getHeight() - target.getPaddingBottom());
        a().a(i.a(target, "alpha", 1.0f, 0.0f), i.a(target, "rotation", 0.0f, 90.0f), i.a(target, "pivotX", x, x), i.a(target, "pivotY", y, y));
    }
}
