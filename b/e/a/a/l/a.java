package b.e.a.a.l;

import android.view.View;
import b.e.b.b;
import b.h.a.c;
import b.h.a.i;

public class a extends b.e.a.a.a {
    @Override // b.e.a.a.a
    public void b(View target) {
        float x = (float) target.getPaddingLeft();
        float y = (float) target.getPaddingTop();
        c a2 = a();
        b.e.b.c cVar = b.e.b.c.SineEaseInOut;
        i a3 = i.a(target, "rotation", 0.0f, 80.0f, 60.0f, 80.0f, 60.0f, 60.0f);
        b.a(cVar, 1300.0f, a3);
        a2.a(a3, i.a(target, "translationY", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 700.0f), i.a(target, "alpha", 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f), i.a(target, "pivotX", x, x, x, x, x, x), i.a(target, "pivotY", y, y, y, y, y, y));
        a(1300);
    }
}
