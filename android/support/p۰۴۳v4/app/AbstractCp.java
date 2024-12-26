package android.support.p۰۴۳v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p۰۴۳v4.app.ComponentCallbacksCf;
import android.support.p۰۴۳v4.view.AbstractCq;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.p  reason: invalid class name */
public abstract class AbstractCp extends AbstractCq {

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCk f۱۰۳۱۲c;

    /* renamed from: d  reason: contains not printable characters */
    private AbstractCq f۱۰۳۱۳d = null;

    /* renamed from: e  reason: contains not printable characters */
    private ArrayList<ComponentCallbacksCf.Cg> f۱۰۳۱۴e = new ArrayList<>();

    /* renamed from: f  reason: contains not printable characters */
    private ArrayList<ComponentCallbacksCf> f۱۰۳۱۵f = new ArrayList<>();

    /* renamed from: g  reason: contains not printable characters */
    private ComponentCallbacksCf f۱۰۳۱۶g = null;

    /* renamed from: c  reason: contains not printable characters */
    public abstract ComponentCallbacksCf m۱۲۴۷۴c(int i);

    public AbstractCp(AbstractCk fm) {
        this.f۱۰۳۱۲c = fm;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۴۷۱b(ViewGroup container) {
        if (container.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public Object m۱۲۴۶۶a(ViewGroup container, int position) {
        ComponentCallbacksCf.Cg fss;
        ComponentCallbacksCf f;
        if (this.f۱۰۳۱۵f.size() > position && (f = this.f۱۰۳۱۵f.get(position)) != null) {
            return f;
        }
        if (this.f۱۰۳۱۳d == null) {
            this.f۱۰۳۱۳d = this.f۱۰۳۱۲c.m۱۲۳۲۰a();
        }
        ComponentCallbacksCf fragment = m۱۲۴۷۴c(position);
        if (this.f۱۰۳۱۴e.size() > position && (fss = this.f۱۰۳۱۴e.get(position)) != null) {
            fragment.m۱۲۱۷۱a(fss);
        }
        while (this.f۱۰۳۱۵f.size() <= position) {
            this.f۱۰۳۱۵f.add(null);
        }
        fragment.m۱۲۲۱۱g(false);
        fragment.m۱۲۲۱۴h(false);
        this.f۱۰۳۱۵f.set(position, fragment);
        this.f۱۰۳۱۳d.m۱۲۴۷۶a(container.getId(), fragment);
        return fragment;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۴۶۹a(ViewGroup container, int position, Object object) {
        ComponentCallbacksCf fragment = (ComponentCallbacksCf) object;
        if (this.f۱۰۳۱۳d == null) {
            this.f۱۰۳۱۳d = this.f۱۰۳۱۲c.m۱۲۳۲۰a();
        }
        while (this.f۱۰۳۱۴e.size() <= position) {
            this.f۱۰۳۱۴e.add(null);
        }
        this.f۱۰۳۱۴e.set(position, fragment.m۱۲۱۲۸D() ? this.f۱۰۳۱۲c.m۱۲۳۱۷a(fragment) : null);
        this.f۱۰۳۱۵f.set(position, null);
        this.f۱۰۳۱۳d.m۱۲۴۷۸a(fragment);
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۴۷۲b(ViewGroup container, int position, Object object) {
        ComponentCallbacksCf fragment = (ComponentCallbacksCf) object;
        ComponentCallbacksCf fVar = this.f۱۰۳۱۶g;
        if (fragment != fVar) {
            if (fVar != null) {
                fVar.m۱۲۲۱۱g(false);
                this.f۱۰۳۱۶g.m۱۲۲۱۴h(false);
            }
            fragment.m۱۲۲۱۱g(true);
            fragment.m۱۲۲۱۴h(true);
            this.f۱۰۳۱۶g = fragment;
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۴۶۸a(ViewGroup container) {
        AbstractCq qVar = this.f۱۰۳۱۳d;
        if (qVar != null) {
            qVar.m۱۲۴۸۲c();
            this.f۱۰۳۱۳d = null;
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۲۴۷۰a(View view, Object object) {
        return ((ComponentCallbacksCf) object).m۱۲۱۲۵A() == view;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: c  reason: contains not printable characters */
    public Parcelable m۱۲۴۷۳c() {
        Bundle state = null;
        if (this.f۱۰۳۱۴e.size() > 0) {
            state = new Bundle();
            ComponentCallbacksCf.Cg[] fss = new ComponentCallbacksCf.Cg[this.f۱۰۳۱۴e.size()];
            this.f۱۰۳۱۴e.toArray(fss);
            state.putParcelableArray("states", fss);
        }
        for (int i = 0; i < this.f۱۰۳۱۵f.size(); i++) {
            ComponentCallbacksCf f = this.f۱۰۳۱۵f.get(i);
            if (f != null && f.m۱۲۱۲۸D()) {
                if (state == null) {
                    state = new Bundle();
                }
                this.f۱۰۳۱۲c.m۱۲۳۲۲a(state, "f" + i, f);
            }
        }
        return state;
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۴۶۷a(Parcelable state, ClassLoader loader) {
        if (state != null) {
            Bundle bundle = (Bundle) state;
            bundle.setClassLoader(loader);
            Parcelable[] fss = bundle.getParcelableArray("states");
            this.f۱۰۳۱۴e.clear();
            this.f۱۰۳۱۵f.clear();
            if (fss != null) {
                for (Parcelable parcelable : fss) {
                    this.f۱۰۳۱۴e.add((ComponentCallbacksCf.Cg) parcelable);
                }
            }
            for (String key : bundle.keySet()) {
                if (key.startsWith("f")) {
                    int index = Integer.parseInt(key.substring(1));
                    ComponentCallbacksCf f = this.f۱۰۳۱۲c.m۱۲۳۱۸a(bundle, key);
                    if (f != null) {
                        while (this.f۱۰۳۱۵f.size() <= index) {
                            this.f۱۰۳۱۵f.add(null);
                        }
                        f.m۱۲۲۱۱g(false);
                        this.f۱۰۳۱۵f.set(index, f);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + key);
                    }
                }
            }
        }
    }
}
