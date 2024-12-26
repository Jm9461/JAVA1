package android.support.constraint.i.j;

import android.support.constraint.i.c;
import java.util.ArrayList;

public class o extends e {
    protected ArrayList<e> e0 = new ArrayList<>();

    @Override // android.support.constraint.i.j.e
    public void B() {
        this.e0.clear();
        super.B();
    }

    public void b(e widget) {
        this.e0.add(widget);
        if (widget.l() != null) {
            ((o) widget.l()).c(widget);
        }
        widget.a((e) this);
    }

    public void c(e widget) {
        this.e0.remove(widget);
        widget.a((e) null);
    }

    /* JADX INFO: Multiple debug info for r4v0 'this'  android.support.constraint.i.j.o: [D('container' android.support.constraint.i.j.f), D('item' android.support.constraint.i.j.e)] */
    public f H() {
        e parent = l();
        f container = null;
        if (this instanceof f) {
            container = (f) this;
        }
        while (parent != null) {
            parent = parent.l();
            if (parent instanceof f) {
                container = (f) parent;
            }
        }
        return container;
    }

    @Override // android.support.constraint.i.j.e
    public void b(int x, int y) {
        super.b(x, y);
        int count = this.e0.size();
        for (int i = 0; i < count; i++) {
            this.e0.get(i).b(p(), q());
        }
    }

    @Override // android.support.constraint.i.j.e
    public void F() {
        super.F();
        ArrayList<e> arrayList = this.e0;
        if (arrayList != null) {
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                e widget = this.e0.get(i);
                widget.b(g(), h());
                if (!(widget instanceof f)) {
                    widget.F();
                }
            }
        }
    }

    public void I() {
        F();
        ArrayList<e> arrayList = this.e0;
        if (arrayList != null) {
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                e widget = this.e0.get(i);
                if (widget instanceof o) {
                    ((o) widget).I();
                }
            }
        }
    }

    @Override // android.support.constraint.i.j.e
    public void a(c cache) {
        super.a(cache);
        int count = this.e0.size();
        for (int i = 0; i < count; i++) {
            this.e0.get(i).a(cache);
        }
    }

    public void J() {
        this.e0.clear();
    }
}
