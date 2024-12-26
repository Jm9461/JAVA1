package b.e.a.a.d;

import android.view.View;
import b.e.a.a.a;
import b.h.a.i;

public class f extends a {
    @Override // b.e.a.a.a
    public void b(View target) {
        float x = (float) ((((target.getWidth() - target.getPaddingLeft()) - target.getPaddingRight()) / 2) + target.getPaddingLeft());
        float y = (float) (target.getHeight() - target.getPaddingBottom());
        a().a(i.a(target, "pivotX", x, x, x, x, x), i.a(target, "pivotY", y, y, y, y, y), i.a(target, "rotationX", 55.0f, -30.0f, 15.0f, -15.0f, 0.0f));
    }
}
