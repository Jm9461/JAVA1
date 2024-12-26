package android.support.constraint.i.j;

import android.support.constraint.i.j.d;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import java.util.ArrayList;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private int f۷۰۸a;

    /* renamed from: b  reason: collision with root package name */
    private int f۷۰۹b;

    /* renamed from: c  reason: collision with root package name */
    private int f۷۱۰c;

    /* renamed from: d  reason: collision with root package name */
    private int f۷۱۱d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<a> f۷۱۲e = new ArrayList<>();

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private d f۷۱۳a;

        /* renamed from: b  reason: collision with root package name */
        private d f۷۱۴b;

        /* renamed from: c  reason: collision with root package name */
        private int f۷۱۵c;

        /* renamed from: d  reason: collision with root package name */
        private d.c f۷۱۶d;

        /* renamed from: e  reason: collision with root package name */
        private int f۷۱۷e;

        public a(d anchor) {
            this.f۷۱۳a = anchor;
            this.f۷۱۴b = anchor.g();
            this.f۷۱۵c = anchor.b();
            this.f۷۱۶d = anchor.f();
            this.f۷۱۷e = anchor.a();
        }

        public void b(e widget) {
            this.f۷۱۳a = widget.a(this.f۷۱۳a.h());
            d dVar = this.f۷۱۳a;
            if (dVar != null) {
                this.f۷۱۴b = dVar.g();
                this.f۷۱۵c = this.f۷۱۳a.b();
                this.f۷۱۶d = this.f۷۱۳a.f();
                this.f۷۱۷e = this.f۷۱۳a.a();
                return;
            }
            this.f۷۱۴b = null;
            this.f۷۱۵c = 0;
            this.f۷۱۶d = d.c.STRONG;
            this.f۷۱۷e = 0;
        }

        public void a(e widget) {
            widget.a(this.f۷۱۳a.h()).a(this.f۷۱۴b, this.f۷۱۵c, this.f۷۱۶d, this.f۷۱۷e);
        }
    }

    public n(e widget) {
        this.f۷۰۸a = widget.w();
        this.f۷۰۹b = widget.x();
        this.f۷۱۰c = widget.t();
        this.f۷۱۱d = widget.i();
        ArrayList<ConstraintAnchor> anchors = widget.b();
        int anchorsSize = anchors.size();
        for (int i = 0; i < anchorsSize; i++) {
            this.f۷۱۲e.add(new a((d) anchors.get(i)));
        }
    }

    public void b(e widget) {
        this.f۷۰۸a = widget.w();
        this.f۷۰۹b = widget.x();
        this.f۷۱۰c = widget.t();
        this.f۷۱۱d = widget.i();
        int connections = this.f۷۱۲e.size();
        for (int i = 0; i < connections; i++) {
            this.f۷۱۲e.get(i).b(widget);
        }
    }

    public void a(e widget) {
        widget.n(this.f۷۰۸a);
        widget.o(this.f۷۰۹b);
        widget.k(this.f۷۱۰c);
        widget.c(this.f۷۱۱d);
        int mConnectionsSize = this.f۷۱۲e.size();
        for (int i = 0; i < mConnectionsSize; i++) {
            this.f۷۱۲e.get(i).a(widget);
        }
    }
}
