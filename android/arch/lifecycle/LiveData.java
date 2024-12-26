package android.arch.lifecycle;

import android.arch.lifecycle.AbstractCc;
import java.util.Iterator;
import java.util.Map;
import p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۳a.Ca;
import p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Cb;

public abstract class LiveData<T> {

    /* renamed from: i  reason: contains not printable characters */
    private static final Object f۸۹۵۲i = new Object();

    /* renamed from: a  reason: contains not printable characters */
    private final Object f۸۹۵۳a = new Object();

    /* renamed from: b  reason: contains not printable characters */
    private Cb<AbstractCk<T>, LiveData<T>.AbstractCb> f۸۹۵۴b = new Cb<>();

    /* renamed from: c  reason: contains not printable characters */
    private int f۸۹۵۵c = 0;

    /* renamed from: d  reason: contains not printable characters */
    private volatile Object f۸۹۵۶d;

    /* renamed from: e  reason: contains not printable characters */
    private volatile Object f۸۹۵۷e;

    /* renamed from: f  reason: contains not printable characters */
    private int f۸۹۵۸f;

    /* renamed from: g  reason: contains not printable characters */
    private boolean f۸۹۵۹g;

    /* renamed from: h  reason: contains not printable characters */
    private boolean f۸۹۶۰h;

    public LiveData() {
        Object obj = f۸۹۵۲i;
        this.f۸۹۵۶d = obj;
        this.f۸۹۵۷e = obj;
        this.f۸۹۵۸f = -1;
        new RunnableCa();
    }

    /* renamed from: android.arch.lifecycle.LiveData$a  reason: invalid class name */
    class RunnableCa implements Runnable {
        RunnableCa() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: android.arch.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            Throwable th;
            synchronized (LiveData.this.f۸۹۵۳a) {
                try {
                    Object newValue = LiveData.this.f۸۹۵۷e;
                    try {
                        LiveData.this.f۸۹۵۷e = LiveData.f۸۹۵۲i;
                        LiveData.this.m۱۰۸۶۶a(newValue);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: android.arch.lifecycle.k<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۸۵۶a(LiveData<T>.AbstractCb bVar) {
        if (bVar.f۸۹۶۵b) {
            if (!bVar.m۱۰۸۷۵b()) {
                bVar.m۱۰۸۷۳a(false);
                return;
            }
            int i = bVar.f۸۹۶۶c;
            int i2 = this.f۸۹۵۸f;
            if (i < i2) {
                bVar.f۸۹۶۶c = i2;
                bVar.f۸۹۶۴a.m۱۰۹۱۹a(this.f۸۹۵۶d);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۸۶۰b(LiveData<T>.AbstractCb bVar) {
        if (this.f۸۹۵۹g) {
            this.f۸۹۶۰h = true;
            return;
        }
        this.f۸۹۵۹g = true;
        do {
            this.f۸۹۶۰h = false;
            if (bVar == null) {
                Iterator<Map.Entry<Observer<T>, LiveData<T>.ObserverWrapper>> iterator = this.f۸۹۵۴b.m۹۹۳۱c();
                while (iterator.hasNext()) {
                    m۱۰۸۵۶a((LiveData<T>.AbstractCb) ((AbstractCb) iterator.next().getValue()));
                    if (this.f۸۹۶۰h) {
                        break;
                    }
                }
            } else {
                m۱۰۸۵۶a(bVar);
                bVar = null;
            }
        } while (this.f۸۹۶۰h);
        this.f۸۹۵۹g = false;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۶۴a(AbstractCe owner, AbstractCk<T> kVar) {
        if (owner.m۱۰۸۹۱a().m۱۰۸۸۷a() != AbstractCc.EnumCb.DESTROYED) {
            LiveData<T>.LifecycleBoundObserver wrapper = new LifecycleBoundObserver(owner, kVar);
            LiveData<T>.ObserverWrapper existing = (AbstractCb) this.f۸۹۵۴b.m۹۹۲۹b(kVar, wrapper);
            if (existing != null && !existing.m۱۰۸۷۴a(owner)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (existing == null) {
                owner.m۱۰۸۹۱a().m۱۰۸۸۸a(wrapper);
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۶۵a(AbstractCk<T> kVar) {
        m۱۰۸۵۸a("removeObserver");
        LiveData<T>.ObserverWrapper removed = (AbstractCb) this.f۸۹۵۴b.remove(kVar);
        if (removed != null) {
            removed.m۱۰۸۷۲a();
            removed.m۱۰۸۷۳a(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۶۶a(T value) {
        m۱۰۸۵۸a("setValue");
        this.f۸۹۵۸f++;
        this.f۸۹۵۶d = value;
        m۱۰۸۶۰b((LiveData<T>.AbstractCb) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۶۳a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۸۶۷b() {
    }

    class LifecycleBoundObserver extends LiveData<T>.AbstractCb implements GenericLifecycleObserver {

        /* renamed from: e  reason: contains not printable characters */
        final AbstractCe f۸۹۶۱e;

        LifecycleBoundObserver(AbstractCe owner, AbstractCk<T> kVar) {
            super(kVar);
            this.f۸۹۶۱e = owner;
        }

        /* access modifiers changed from: package-private */
        @Override // android.arch.lifecycle.LiveData.AbstractCb
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۰۸۷۱b() {
            return this.f۸۹۶۱e.m۱۰۸۹۱a().m۱۰۸۸۷a().m۱۰۸۹۰a(AbstractCc.EnumCb.STARTED);
        }

        @Override // android.arch.lifecycle.GenericLifecycleObserver
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۶۹a(AbstractCe source, AbstractCc.EnumCa event) {
            if (this.f۸۹۶۱e.m۱۰۸۹۱a().m۱۰۸۸۷a() == AbstractCc.EnumCb.DESTROYED) {
                LiveData.this.m۱۰۸۶۵a((AbstractCk) this.f۸۹۶۴a);
            } else {
                m۱۰۸۷۳a(m۱۰۸۷۱b());
            }
        }

        /* access modifiers changed from: package-private */
        @Override // android.arch.lifecycle.LiveData.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۸۷۰a(AbstractCe owner) {
            return this.f۸۹۶۱e == owner;
        }

        /* access modifiers changed from: package-private */
        @Override // android.arch.lifecycle.LiveData.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۶۸a() {
            this.f۸۹۶۱e.m۱۰۸۹۱a().m۱۰۸۸۹b(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.arch.lifecycle.LiveData$b  reason: invalid class name */
    public abstract class AbstractCb {

        /* renamed from: a  reason: contains not printable characters */
        final AbstractCk<T> f۸۹۶۴a;

        /* renamed from: b  reason: contains not printable characters */
        boolean f۸۹۶۵b;

        /* renamed from: c  reason: contains not printable characters */
        int f۸۹۶۶c = -1;

        /* access modifiers changed from: package-private */
        /* renamed from: b  reason: contains not printable characters */
        public abstract boolean m۱۰۸۷۵b();

        AbstractCb(AbstractCk<T> kVar) {
            this.f۸۹۶۴a = kVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۸۷۴a(AbstractCe owner) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۷۲a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۸۷۳a(boolean newActive) {
            if (newActive != this.f۸۹۶۵b) {
                this.f۸۹۶۵b = newActive;
                int i = 1;
                boolean wasInactive = LiveData.this.f۸۹۵۵c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f۸۹۵۵c;
                if (!this.f۸۹۶۵b) {
                    i = -1;
                }
                liveData.f۸۹۵۵c = i2 + i;
                if (wasInactive && this.f۸۹۶۵b) {
                    LiveData.this.m۱۰۸۶۳a();
                }
                if (LiveData.this.f۸۹۵۵c == 0 && !this.f۸۹۶۵b) {
                    LiveData.this.m۱۰۸۶۷b();
                }
                if (this.f۸۹۶۵b) {
                    LiveData.this.m۱۰۸۶۰b((LiveData) this);
                }
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static void m۱۰۸۵۸a(String methodName) {
        if (!Ca.m۹۹۱۲b().m۹۹۱۴a()) {
            throw new IllegalStateException("Cannot invoke " + methodName + " on a background" + " thread");
        }
    }
}
