package android.support.constraint.p۰۴۱i.p۰۴۲j;

import android.support.constraint.p۰۴۱i.Cc;
import java.util.ArrayList;

/* renamed from: android.support.constraint.i.j.o  reason: invalid class name */
public class Co extends Ce {

    /* renamed from: e0  reason: contains not printable characters */
    protected ArrayList<Ce> f۹۴۴۲e0 = new ArrayList<>();

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: B  reason: contains not printable characters */
    public void m۱۱۲۳۵B() {
        this.f۹۴۴۲e0.clear();
        super.m۱۱۰۹۶B();
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۲۴۲b(Ce widget) {
        this.f۹۴۴۲e0.add(widget);
        if (widget.m۱۱۱۵۱l() != null) {
            ((Co) widget.m۱۱۱۵۱l()).m۱۱۲۴۳c(widget);
        }
        widget.m۱۱۱۱۲a((Ce) this);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۱۲۴۳c(Ce widget) {
        this.f۹۴۴۲e0.remove(widget);
        widget.m۱۱۱۱۲a((Ce) null);
    }

    /* JADX INFO: Multiple debug info for r4v0 'this'  android.support.constraint.i.j.o: [D('container' android.support.constraint.i.j.f), D('item' android.support.constraint.i.j.e)] */
    /* renamed from: H  reason: contains not printable characters */
    public Cf m۱۱۲۳۷H() {
        Ce parent = m۱۱۱۵۱l();
        Cf container = null;
        if (this instanceof Cf) {
            container = (Cf) this;
        }
        while (parent != null) {
            parent = parent.m۱۱۱۵۱l();
            if (parent instanceof Cf) {
                container = (Cf) parent;
            }
        }
        return container;
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۱۲۴۱b(int x, int y) {
        super.m۱۱۱۲۲b(x, y);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            this.f۹۴۴۲e0.get(i).m۱۱۱۲۲b(m۱۱۱۵۹p(), m۱۱۱۶۰q());
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: F  reason: contains not printable characters */
    public void m۱۱۲۳۶F() {
        super.m۱۱۱۰۰F();
        ArrayList<Ce> arrayList = this.f۹۴۴۲e0;
        if (arrayList != null) {
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                Ce widget = this.f۹۴۴۲e0.get(i);
                widget.m۱۱۱۲۲b(m۱۱۱۴۱g(), m۱۱۱۴۳h());
                if (!(widget instanceof Cf)) {
                    widget.m۱۱۱۰۰F();
                }
            }
        }
    }

    /* renamed from: I  reason: contains not printable characters */
    public void m۱۱۲۳۸I() {
        m۱۱۲۳۶F();
        ArrayList<Ce> arrayList = this.f۹۴۴۲e0;
        if (arrayList != null) {
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                Ce widget = this.f۹۴۴۲e0.get(i);
                if (widget instanceof Co) {
                    ((Co) widget).m۱۱۲۳۸I();
                }
            }
        }
    }

    @Override // android.support.constraint.p۰۴۱i.p۰۴۲j.Ce
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۴۰a(Cc cache) {
        super.m۱۱۱۰۸a(cache);
        int count = this.f۹۴۴۲e0.size();
        for (int i = 0; i < count; i++) {
            this.f۹۴۴۲e0.get(i).m۱۱۱۰۸a(cache);
        }
    }

    /* renamed from: J  reason: contains not printable characters */
    public void m۱۱۲۳۹J() {
        this.f۹۴۴۲e0.clear();
    }
}
