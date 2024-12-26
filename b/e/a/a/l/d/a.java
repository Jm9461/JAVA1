package b.e.a.a.l.d;

import android.view.View;
import b.e.b.b;
import b.h.a.c;
import b.h.a.i;

public class a extends b.e.a.a.a {
    /* access modifiers changed from: protected */
    @Override // b.e.a.a.a
    public void b(View target) {
        int distance = target.getTop() + target.getHeight();
        c a2 = a();
        i a3 = i.a(target, "translationY", (float) (-distance), 0.0f);
        b.a(b.e.b.c.BounceEaseOut, (float) b(), a3);
        a2.a(i.a(target, "alpha", 0.0f, 1.0f), a3);
    }
}
