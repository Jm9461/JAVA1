package b.e.a.a.l.d;

import android.view.View;
import b.e.a.a.a;
import b.h.a.c;
import b.h.a.i;

public class b extends a {
    /* access modifiers changed from: protected */
    @Override // b.e.a.a.a
    public void b(View target) {
        c a2 = a();
        i a3 = i.a(target, "scaleX", 1.5f, 1.0f);
        b.e.b.b.a(b.e.b.c.QuintEaseOut, (float) b(), a3);
        b.e.b.c cVar = b.e.b.c.QuintEaseOut;
        float b2 = (float) b();
        i a4 = i.a(target, "scaleY", 1.5f, 1.0f);
        b.e.b.b.a(cVar, b2, a4);
        b.e.b.c cVar2 = b.e.b.c.QuintEaseOut;
        float b3 = (float) b();
        i a5 = i.a(target, "alpha", 0.0f, 1.0f);
        b.e.b.b.a(cVar2, b3, a5);
        a2.a(a3, a4, a5);
    }
}
