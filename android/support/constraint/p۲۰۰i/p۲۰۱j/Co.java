package android.support.constraint.p۲۰۰i.p۲۰۱j;

import android.support.constraint.p۲۰۰i.Cc;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.o, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Co extends Ce {

    /* renamed from: e0, reason: contains not printable characters */
    protected ArrayList<Ce> f۹۴۴۲e0 = new ArrayList<>();

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: B, reason: contains not printable characters */
    public void mo۹۱۶۷B() {
        this.f۹۴۴۲e0.clear();
        super.mo۹۱۶۷B();
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۹۱۷۴b(Ce widget) {
        this.f۹۴۴۲e0.add(widget);
        if (widget.m۹۰۸۳l() != null) {
            Co container = (Co) widget.m۹۰۸۳l();
            container.m۹۱۷۵c(widget);
        }
        widget.m۹۰۴۴a((Ce) this);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۹۱۷۵c(Ce widget) {
        this.f۹۴۴۲e0.remove(widget);
        widget.m۹۰۴۴a((Ce) null);
    }

    /* renamed from: H, reason: contains not printable characters */
    public Cf m۹۱۶۹H() {
        Ce parent = m۹۰۸۳l();
        Cf container = null;
        if (this instanceof Cf) {
            container = (Cf) this;
        }
        while (parent != null) {
            Ce item = parent;
            parent = item.m۹۰۸۳l();
            if (item instanceof Cf) {
                container = (Cf) item;
            }
        }
        return container;
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: b, reason: contains not printable characters */
    public void mo۹۱۷۳b(int x, int y) {
        super.mo۹۱۷۳b(x, y);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            Ce widget = this.f۹۴۴۲e0.get(i);
            widget.mo۹۱۷۳b(m۹۰۹۱p(), m۹۰۹۲q());
        }
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: F, reason: contains not printable characters */
    public void mo۹۱۶۸F() {
        super.mo۹۱۶۸F();
        ArrayList<Ce> arrayList = this.f۹۴۴۲e0;
        if (arrayList == null) {
            return;
        }
        int count = arrayList.size();
        for (int i = 0; i < count; i++) {
            Ce widget = this.f۹۴۴۲e0.get(i);
            widget.mo۹۱۷۳b(m۹۰۷۳g(), m۹۰۷۵h());
            if (!(widget instanceof Cf)) {
                widget.mo۹۱۶۸F();
            }
        }
    }

    /* renamed from: I, reason: contains not printable characters */
    public void mo۹۱۷۰I() {
        mo۹۱۶۸F();
        ArrayList<Ce> arrayList = this.f۹۴۴۲e0;
        if (arrayList == null) {
            return;
        }
        int count = arrayList.size();
        for (int i = 0; i < count; i++) {
            Ce widget = this.f۹۴۴۲e0.get(i);
            if (widget instanceof Co) {
                ((Co) widget).mo۹۱۷۰I();
            }
        }
    }

    @Override // android.support.constraint.p۲۰۰i.p۲۰۱j.Ce
    /* renamed from: a, reason: contains not printable characters */
    public void mo۹۱۷۲a(Cc cache) {
        super.mo۹۱۷۲a(cache);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            Ce widget = this.f۹۴۴۲e0.get(i);
            widget.mo۹۱۷۲a(cache);
        }
    }

    /* renamed from: J, reason: contains not printable characters */
    public void m۹۱۷۱J() {
        this.f۹۴۴۲e0.clear();
    }
}
