package b.e.a.a.l.e;

import android.view.View;
import b.e.b.b;
import b.h.a.c;
import b.h.a.i;

public class a extends b.e.a.a.a {
    /* access modifiers changed from: protected */
    @Override // b.e.a.a.a
    public void b(View target) {
        c a2 = a();
        i a3 = i.a(target, "scaleX", 1.0f, 1.5f);
        b.a(b.e.b.c.QuintEaseOut, (float) b(), a3);
        b.e.b.c cVar = b.e.b.c.QuintEaseOut;
        float b2 = (float) b();
        i a4 = i.a(target, "scaleY", 1.0f, 1.5f);
        b.a(cVar, b2, a4);
        b.e.b.c cVar2 = b.e.b.c.QuintEaseOut;
        float b3 = (float) b();
        i a5 = i.a(target, "alpha", 1.0f, 0.0f);
        b.a(cVar2, b3, a5);
        a2.a(a3, a4, a5);
    }
}
