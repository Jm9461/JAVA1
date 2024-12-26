package android.support.constraint.p۲۰۰i.p۲۰۱j;

import android.support.constraint.p۲۰۰i.p۲۰۱j.Cd;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cn {

    /* renamed from: a, reason: contains not printable characters */
    private int f۹۴۳۲a;

    /* renamed from: b, reason: contains not printable characters */
    private int f۹۴۳۳b;

    /* renamed from: c, reason: contains not printable characters */
    private int f۹۴۳۴c;

    /* renamed from: d, reason: contains not printable characters */
    private int f۹۴۳۵d;

    /* renamed from: e, reason: contains not printable characters */
    private ArrayList<a> f۹۴۳۶e = new ArrayList<>();

    /* renamed from: android.support.constraint.i.j.n$a */
    static class a {

        /* renamed from: a, reason: contains not printable characters */
        private Cd f۹۴۳۷a;

        /* renamed from: b, reason: contains not printable characters */
        private Cd f۹۴۳۸b;

        /* renamed from: c, reason: contains not printable characters */
        private int f۹۴۳۹c;

        /* renamed from: d, reason: contains not printable characters */
        private Cd.c f۹۴۴۰d;

        /* renamed from: e, reason: contains not printable characters */
        private int f۹۴۴۱e;

        public a(Cd anchor) {
            this.f۹۴۳۷a = anchor;
            this.f۹۴۳۸b = anchor.m۹۰۲۱g();
            this.f۹۴۳۹c = anchor.m۹۰۱۶b();
            this.f۹۴۴۰d = anchor.m۹۰۲۰f();
            this.f۹۴۴۱e = anchor.m۹۰۱۱a();
        }

        /* renamed from: b, reason: contains not printable characters */
        public void m۹۱۶۶b(Ce widget) {
            this.f۹۴۳۷a = widget.mo۹۱۲۵a(this.f۹۴۳۷a.m۹۰۲۲h());
            Cd cd = this.f۹۴۳۷a;
            if (cd != null) {
                this.f۹۴۳۸b = cd.m۹۰۲۱g();
                this.f۹۴۳۹c = this.f۹۴۳۷a.m۹۰۱۶b();
                this.f۹۴۴۰d = this.f۹۴۳۷a.m۹۰۲۰f();
                this.f۹۴۴۱e = this.f۹۴۳۷a.m۹۰۱۱a();
                return;
            }
            this.f۹۴۳۸b = null;
            this.f۹۴۳۹c = 0;
            this.f۹۴۴۰d = Cd.c.STRONG;
            this.f۹۴۴۱e = 0;
        }

        /* renamed from: a, reason: contains not printable characters */
        public void m۹۱۶۵a(Ce widget) {
            Cd anchor = widget.mo۹۱۲۵a(this.f۹۴۳۷a.m۹۰۲۲h());
            anchor.m۹۰۱۵a(this.f۹۴۳۸b, this.f۹۴۳۹c, this.f۹۴۴۰d, this.f۹۴۴۱e);
        }
    }

    public Cn(Ce widget) {
        this.f۹۴۳۲a = widget.m۹۰۹۸w();
        this.f۹۴۳۳b = widget.m۹۰۹۹x();
        this.f۹۴۳۴c = widget.m۹۰۹۵t();
        this.f۹۴۳۵d = widget.m۹۰۷۷i();
        ArrayList<Cd> arrayList = widget.mo۹۱۲۹b();
        int anchorsSize = arrayList.size();
        for (int i = 0; i < anchorsSize; i++) {
            Cd a2 = arrayList.get(i);
            this.f۹۴۳۶e.add(new a(a2));
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۹۱۶۴b(Ce widget) {
        this.f۹۴۳۲a = widget.m۹۰۹۸w();
        this.f۹۴۳۳b = widget.m۹۰۹۹x();
        this.f۹۴۳۴c = widget.m۹۰۹۵t();
        this.f۹۴۳۵d = widget.m۹۰۷۷i();
        int connections = this.f۹۴۳۶e.size();
        for (int i = 0; i < connections; i++) {
            a connection = this.f۹۴۳۶e.get(i);
            connection.m۹۱۶۶b(widget);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۹۱۶۳a(Ce widget) {
        widget.m۹۰۸۸n(this.f۹۴۳۲a);
        widget.m۹۰۹۰o(this.f۹۴۳۳b);
        widget.m۹۰۸۲k(this.f۹۴۳۴c);
        widget.m۹۰۶۲c(this.f۹۴۳۵d);
        int mConnectionsSize = this.f۹۴۳۶e.size();
        for (int i = 0; i < mConnectionsSize; i++) {
            a connection = this.f۹۴۳۶e.get(i);
            connection.m۹۱۶۵a(widget);
        }
    }
}
