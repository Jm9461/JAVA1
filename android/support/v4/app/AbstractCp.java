package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.ComponentCallbacksCf;
import android.support.v4.view.AbstractCq;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.p, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCp extends AbstractCq {

    /* renamed from: c, reason: contains not printable characters */
    private final AbstractCk f۱۰۳۱۲c;

    /* renamed from: d, reason: contains not printable characters */
    private AbstractCq f۱۰۳۱۳d = null;

    /* renamed from: e, reason: contains not printable characters */
    private ArrayList<ComponentCallbacksCf.g> f۱۰۳۱۴e = new ArrayList<>();

    /* renamed from: f, reason: contains not printable characters */
    private ArrayList<ComponentCallbacksCf> f۱۰۳۱۵f = new ArrayList<>();

    /* renamed from: g, reason: contains not printable characters */
    private ComponentCallbacksCf f۱۰۳۱۶g = null;

    /* renamed from: c, reason: contains not printable characters */
    public abstract ComponentCallbacksCf mo۱۷۶۴۹c(int i);

    public AbstractCp(AbstractCk fm) {
        this.f۱۰۳۱۲c = fm;
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۴۸۹۹b(ViewGroup container) {
        if (container.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public Object mo۱۴۸۹۲a(ViewGroup container, int position) {
        ComponentCallbacksCf.g fss;
        ComponentCallbacksCf f2;
        if (this.f۱۰۳۱۵f.size() > position && (f2 = this.f۱۰۳۱۵f.get(position)) != null) {
            return f2;
        }
        if (this.f۱۰۳۱۳d == null) {
            this.f۱۰۳۱۳d = this.f۱۰۳۱۲c.mo۱۰۳۰۶a();
        }
        ComponentCallbacksCf fragment = mo۱۷۶۴۹c(position);
        if (this.f۱۰۳۱۴e.size() > position && (fss = this.f۱۰۳۱۴e.get(position)) != null) {
            fragment.m۱۰۱۰۱a(fss);
        }
        while (this.f۱۰۳۱۵f.size() <= position) {
            this.f۱۰۳۱۵f.add(null);
        }
        fragment.m۱۰۱۴۱g(false);
        fragment.m۱۰۱۴۴h(false);
        this.f۱۰۳۱۵f.set(position, fragment);
        this.f۱۰۳۱۳d.mo۱۰۴۰۶a(container.getId(), fragment);
        return fragment;
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۸۹۶a(ViewGroup container, int position, Object object) {
        ComponentCallbacksCf fragment = (ComponentCallbacksCf) object;
        if (this.f۱۰۳۱۳d == null) {
            this.f۱۰۳۱۳d = this.f۱۰۳۱۲c.mo۱۰۳۰۶a();
        }
        while (this.f۱۰۳۱۴e.size() <= position) {
            this.f۱۰۳۱۴e.add(null);
        }
        this.f۱۰۳۱۴e.set(position, fragment.m۱۰۰۵۸D() ? this.f۱۰۳۱۲c.mo۱۰۳۰۱a(fragment) : null);
        this.f۱۰۳۱۵f.set(position, null);
        this.f۱۰۳۱۳d.mo۱۰۴۰۸a(fragment);
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۴۹۰۰b(ViewGroup container, int position, Object object) {
        ComponentCallbacksCf fragment = (ComponentCallbacksCf) object;
        ComponentCallbacksCf componentCallbacksCf = this.f۱۰۳۱۶g;
        if (fragment != componentCallbacksCf) {
            if (componentCallbacksCf != null) {
                componentCallbacksCf.m۱۰۱۴۱g(false);
                this.f۱۰۳۱۶g.m۱۰۱۴۴h(false);
            }
            fragment.m۱۰۱۴۱g(true);
            fragment.m۱۰۱۴۴h(true);
            this.f۱۰۳۱۶g = fragment;
        }
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۸۹۵a(ViewGroup container) {
        AbstractCq abstractCq = this.f۱۰۳۱۳d;
        if (abstractCq != null) {
            abstractCq.mo۱۰۴۱۲c();
            this.f۱۰۳۱۳d = null;
        }
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۴۸۹۷a(View view, Object object) {
        return ((ComponentCallbacksCf) object).m۱۰۰۵۵A() == view;
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: c, reason: contains not printable characters */
    public Parcelable mo۱۴۹۰۱c() {
        Bundle state = null;
        if (this.f۱۰۳۱۴e.size() > 0) {
            state = new Bundle();
            ComponentCallbacksCf.g[] fss = new ComponentCallbacksCf.g[this.f۱۰۳۱۴e.size()];
            this.f۱۰۳۱۴e.toArray(fss);
            state.putParcelableArray("states", fss);
        }
        for (int i = 0; i < this.f۱۰۳۱۵f.size(); i++) {
            ComponentCallbacksCf f2 = this.f۱۰۳۱۵f.get(i);
            if (f2 != null && f2.m۱۰۰۵۸D()) {
                if (state == null) {
                    state = new Bundle();
                }
                String key = "f" + i;
                this.f۱۰۳۱۲c.mo۱۰۳۱۱a(state, key, f2);
            }
        }
        return state;
    }

    @Override // android.support.v4.view.AbstractCq
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۸۹۴a(Parcelable state, ClassLoader loader) {
        if (state != null) {
            Bundle bundle = (Bundle) state;
            bundle.setClassLoader(loader);
            Parcelable[] fss = bundle.getParcelableArray("states");
            this.f۱۰۳۱۴e.clear();
            this.f۱۰۳۱۵f.clear();
            if (fss != null) {
                for (Parcelable parcelable : fss) {
                    this.f۱۰۳۱۴e.add((ComponentCallbacksCf.g) parcelable);
                }
            }
            Iterable<String> keys = bundle.keySet();
            for (String key : keys) {
                if (key.startsWith("f")) {
                    int index = Integer.parseInt(key.substring(1));
                    ComponentCallbacksCf f2 = this.f۱۰۳۱۲c.mo۱۰۳۰۳a(bundle, key);
                    if (f2 != null) {
                        while (this.f۱۰۳۱۵f.size() <= index) {
                            this.f۱۰۳۱۵f.add(null);
                        }
                        f2.m۱۰۱۴۱g(false);
                        this.f۱۰۳۱۵f.set(index, f2);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + key);
                    }
                }
            }
        }
    }
}
