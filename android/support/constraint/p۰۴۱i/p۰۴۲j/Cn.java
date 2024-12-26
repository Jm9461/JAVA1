package android.support.constraint.p۰۴۱i.p۰۴۲j;

import android.support.constraint.p۰۴۱i.p۰۴۲j.Cd;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.n  reason: invalid class name */
public class Cn {

    /* renamed from: a  reason: contains not printable characters */
    private int f۹۴۳۲a;

    /* renamed from: b  reason: contains not printable characters */
    private int f۹۴۳۳b;

    /* renamed from: c  reason: contains not printable characters */
    private int f۹۴۳۴c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۹۴۳۵d;

    /* renamed from: e  reason: contains not printable characters */
    private ArrayList<Ca> f۹۴۳۶e = new ArrayList<>();

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.constraint.i.j.n$a  reason: invalid class name */
    public static class Ca {

        /* renamed from: a  reason: contains not printable characters */
        private Cd f۹۴۳۷a;

        /* renamed from: b  reason: contains not printable characters */
        private Cd f۹۴۳۸b;

        /* renamed from: c  reason: contains not printable characters */
        private int f۹۴۳۹c;

        /* renamed from: d  reason: contains not printable characters */
        private Cd.EnumCc f۹۴۴۰d;

        /* renamed from: e  reason: contains not printable characters */
        private int f۹۴۴۱e;

        public Ca(Cd anchor) {
            this.f۹۴۳۷a = anchor;
            this.f۹۴۳۸b = anchor.m۱۱۰۸۹g();
            this.f۹۴۳۹c = anchor.m۱۱۰۸۴b();
            this.f۹۴۴۰d = anchor.m۱۱۰۸۸f();
            this.f۹۴۴۱e = anchor.m۱۱۰۷۹a();
        }

        /* renamed from: b  reason: contains not printable characters */
        public void m۱۱۲۳۴b(Ce widget) {
            this.f۹۴۳۷a = widget.m۱۱۱۰۲a(this.f۹۴۳۷a.m۱۱۰۹۰h());
            Cd dVar = this.f۹۴۳۷a;
            if (dVar != null) {
                this.f۹۴۳۸b = dVar.m۱۱۰۸۹g();
                this.f۹۴۳۹c = this.f۹۴۳۷a.m۱۱۰۸۴b();
                this.f۹۴۴۰d = this.f۹۴۳۷a.m۱۱۰۸۸f();
                this.f۹۴۴۱e = this.f۹۴۳۷a.m۱۱۰۷۹a();
                return;
            }
            this.f۹۴۳۸b = null;
            this.f۹۴۳۹c = 0;
            this.f۹۴۴۰d = Cd.EnumCc.STRONG;
            this.f۹۴۴۱e = 0;
        }

        /* renamed from: a  reason: contains not printable characters */
        public void m۱۱۲۳۳a(Ce widget) {
            widget.m۱۱۱۰۲a(this.f۹۴۳۷a.m۱۱۰۹۰h()).m۱۱۰۸۳a(this.f۹۴۳۸b, this.f۹۴۳۹c, this.f۹۴۴۰d, this.f۹۴۴۱e);
        }
    }

    public Cn(Ce widget) {
        this.f۹۴۳۲a = widget.m۱۱۱۶۶w();
        this.f۹۴۳۳b = widget.m۱۱۱۶۷x();
        this.f۹۴۳۴c = widget.m۱۱۱۶۳t();
        this.f۹۴۳۵d = widget.m۱۱۱۴۵i();
        ArrayList<ConstraintAnchor> anchors = widget.m۱۱۱۱۹b();
        int anchorsSize = anchors.size();
        for (int i = 0; i < anchorsSize; i++) {
            this.f۹۴۳۶e.add(new Ca((Cd) anchors.get(i)));
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۲۳۲b(Ce widget) {
        this.f۹۴۳۲a = widget.m۱۱۱۶۶w();
        this.f۹۴۳۳b = widget.m۱۱۱۶۷x();
        this.f۹۴۳۴c = widget.m۱۱۱۶۳t();
        this.f۹۴۳۵d = widget.m۱۱۱۴۵i();
        int connections = this.f۹۴۳۶e.size();
        for (int i = 0; i < connections; i++) {
            this.f۹۴۳۶e.get(i).m۱۱۲۳۴b(widget);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۳۱a(Ce widget) {
        widget.m۱۱۱۵۶n(this.f۹۴۳۲a);
        widget.m۱۱۱۵۸o(this.f۹۴۳۳b);
        widget.m۱۱۱۵۰k(this.f۹۴۳۴c);
        widget.m۱۱۱۳۰c(this.f۹۴۳۵d);
        int mConnectionsSize = this.f۹۴۳۶e.size();
        for (int i = 0; i < mConnectionsSize; i++) {
            this.f۹۴۳۶e.get(i).m۱۱۲۳۳a(widget);
        }
    }
}
