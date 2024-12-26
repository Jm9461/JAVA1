package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.f;
import android.support.v4.view.q;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class p extends q {

    /* renamed from: c  reason: collision with root package name */
    private final k f۱۱۵۷c;

    /* renamed from: d  reason: collision with root package name */
    private q f۱۱۵۸d = null;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<f.g> f۱۱۵۹e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<f> f۱۱۶۰f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private f f۱۱۶۱g = null;

    public abstract f c(int i);

    public p(k fm) {
        this.f۱۱۵۷c = fm;
    }

    @Override // android.support.v4.view.q
    public void b(ViewGroup container) {
        if (container.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // android.support.v4.view.q
    public Object a(ViewGroup container, int position) {
        f.g fss;
        f f2;
        if (this.f۱۱۶۰f.size() > position && (f2 = this.f۱۱۶۰f.get(position)) != null) {
            return f2;
        }
        if (this.f۱۱۵۸d == null) {
            this.f۱۱۵۸d = this.f۱۱۵۷c.a();
        }
        f fragment = c(position);
        if (this.f۱۱۵۹e.size() > position && (fss = this.f۱۱۵۹e.get(position)) != null) {
            fragment.a(fss);
        }
        while (this.f۱۱۶۰f.size() <= position) {
            this.f۱۱۶۰f.add(null);
        }
        fragment.g(false);
        fragment.h(false);
        this.f۱۱۶۰f.set(position, fragment);
        this.f۱۱۵۸d.a(container.getId(), fragment);
        return fragment;
    }

    @Override // android.support.v4.view.q
    public void a(ViewGroup container, int position, Object object) {
        f fragment = (f) object;
        if (this.f۱۱۵۸d == null) {
            this.f۱۱۵۸d = this.f۱۱۵۷c.a();
        }
        while (this.f۱۱۵۹e.size() <= position) {
            this.f۱۱۵۹e.add(null);
        }
        this.f۱۱۵۹e.set(position, fragment.D() ? this.f۱۱۵۷c.a(fragment) : null);
        this.f۱۱۶۰f.set(position, null);
        this.f۱۱۵۸d.a(fragment);
    }

    @Override // android.support.v4.view.q
    public void b(ViewGroup container, int position, Object object) {
        f fragment = (f) object;
        f fVar = this.f۱۱۶۱g;
        if (fragment != fVar) {
            if (fVar != null) {
                fVar.g(false);
                this.f۱۱۶۱g.h(false);
            }
            fragment.g(true);
            fragment.h(true);
            this.f۱۱۶۱g = fragment;
        }
    }

    @Override // android.support.v4.view.q
    public void a(ViewGroup container) {
        q qVar = this.f۱۱۵۸d;
        if (qVar != null) {
            qVar.c();
            this.f۱۱۵۸d = null;
        }
    }

    @Override // android.support.v4.view.q
    public boolean a(View view, Object object) {
        return ((f) object).A() == view;
    }

    @Override // android.support.v4.view.q
    public Parcelable c() {
        Bundle state = null;
        if (this.f۱۱۵۹e.size() > 0) {
            state = new Bundle();
            f.g[] fss = new f.g[this.f۱۱۵۹e.size()];
            this.f۱۱۵۹e.toArray(fss);
            state.putParcelableArray("states", fss);
        }
        for (int i = 0; i < this.f۱۱۶۰f.size(); i++) {
            f f2 = this.f۱۱۶۰f.get(i);
            if (f2 != null && f2.D()) {
                if (state == null) {
                    state = new Bundle();
                }
                this.f۱۱۵۷c.a(state, "f" + i, f2);
            }
        }
        return state;
    }

    @Override // android.support.v4.view.q
    public void a(Parcelable state, ClassLoader loader) {
        if (state != null) {
            Bundle bundle = (Bundle) state;
            bundle.setClassLoader(loader);
            Parcelable[] fss = bundle.getParcelableArray("states");
            this.f۱۱۵۹e.clear();
            this.f۱۱۶۰f.clear();
            if (fss != null) {
                for (Parcelable parcelable : fss) {
                    this.f۱۱۵۹e.add((f.g) parcelable);
                }
            }
            for (String key : bundle.keySet()) {
                if (key.startsWith("f")) {
                    int index = Integer.parseInt(key.substring(1));
                    f f2 = this.f۱۱۵۷c.a(bundle, key);
                    if (f2 != null) {
                        while (this.f۱۱۶۰f.size() <= index) {
                            this.f۱۱۶۰f.add(null);
                        }
                        f2.g(false);
                        this.f۱۱۶۰f.set(index, f2);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + key);
                    }
                }
            }
        }
    }
}
