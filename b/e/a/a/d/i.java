package b.e.a.a.d;

import android.view.View;
import b.e.a.a.a;

public class i extends a {
    @Override // b.e.a.a.a
    public void b(View target) {
        float x = (float) ((((target.getWidth() - target.getPaddingLeft()) - target.getPaddingRight()) / 2) + target.getPaddingLeft());
        float y = (float) (target.getHeight() - target.getPaddingBottom());
        a().a(b.h.a.i.a(target, "rotation", 12.0f, -12.0f, 3.0f, -3.0f, 0.0f), b.h.a.i.a(target, "pivotX", x, x, x, x, x), b.h.a.i.a(target, "pivotY", y, y, y, y, y));
    }
}
