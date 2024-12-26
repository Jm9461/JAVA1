package android.arch.lifecycle;

import android.arch.lifecycle.AbstractCc;
import android.arch.lifecycle.LifecycleRegistry;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.arch.lifecycle.f  reason: invalid class name */
public class Cf extends AbstractCc {

    /* renamed from: a  reason: contains not printable characters */
    private p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Ca<AbstractCd, Cb> f۸۹۸۴a = new p۰۰۰a.p۰۰۱a.p۰۰۲a.p۰۰۴b.Ca<>();

    /* renamed from: b  reason: contains not printable characters */
    private AbstractCc.EnumCb f۸۹۸۵b;

    /* renamed from: c  reason: contains not printable characters */
    private final WeakReference<AbstractCe> f۸۹۸۶c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۸۹۸۷d = 0;

    /* renamed from: e  reason: contains not printable characters */
    private boolean f۸۹۸۸e = false;

    /* renamed from: f  reason: contains not printable characters */
    private boolean f۸۹۸۹f = false;

    /* renamed from: g  reason: contains not printable characters */
    private ArrayList<AbstractCc.EnumCb> f۸۹۹۰g = new ArrayList<>();

    public Cf(AbstractCe provider) {
        this.f۸۹۸۶c = new WeakReference<>(provider);
        this.f۸۹۸۵b = AbstractCc.EnumCb.INITIALIZED;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۰۶a(AbstractCc.EnumCb state) {
        m۱۰۹۰۰c(state);
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۰۵a(AbstractCc.EnumCa event) {
        m۱۰۹۰۰c(m۱۰۸۹۵b(event));
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۹۰۰c(AbstractCc.EnumCb next) {
        if (this.f۸۹۸۵b != next) {
            this.f۸۹۸۵b = next;
            if (this.f۸۹۸۸e || this.f۸۹۸۷d != 0) {
                this.f۸۹۸۹f = true;
                return;
            }
            this.f۸۹۸۸e = true;
            m۱۰۹۰۱d();
            this.f۸۹۸۸e = false;
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private boolean m۱۰۸۹۷b() {
        if (this.f۸۹۸۴a.size() == 0) {
            return true;
        }
        AbstractCc.EnumCb eldestObserverState = this.f۸۹۸۴a.m۹۹۳۰b().getValue().f۸۹۹۳a;
        AbstractCc.EnumCb newestObserverState = this.f۸۹۸۴a.m۹۹۳۲d().getValue().f۸۹۹۳a;
        if (eldestObserverState == newestObserverState && this.f۸۹۸۵b == newestObserverState) {
            return true;
        }
        return false;
    }

    /* renamed from: c  reason: contains not printable characters */
    private AbstractCc.EnumCb m۱۰۸۹۸c(AbstractCd observer) {
        Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> previous = this.f۸۹۸۴a.m۹۹۲۴b(observer);
        AbstractCc.EnumCb parentState = null;
        AbstractCc.EnumCb siblingState = previous != null ? ((Cb) previous.getValue()).f۸۹۹۳a : null;
        if (!this.f۸۹۹۰g.isEmpty()) {
            ArrayList<AbstractCc.EnumCb> arrayList = this.f۸۹۹۰g;
            parentState = arrayList.get(arrayList.size() - 1);
        }
        return m۱۰۸۹۲a(m۱۰۸۹۲a(this.f۸۹۸۵b, siblingState), parentState);
    }

    @Override // android.arch.lifecycle.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۹۰۷a(AbstractCd observer) {
        AbstractCe lifecycleOwner;
        AbstractCc.EnumCb bVar = this.f۸۹۸۵b;
        AbstractCc.EnumCb initialState = AbstractCc.EnumCb.DESTROYED;
        if (bVar != initialState) {
            initialState = AbstractCc.EnumCb.INITIALIZED;
        }
        Cb statefulObserver = new Cb(observer, initialState);
        if (this.f۸۹۸۴a.m۹۹۲۳b(observer, statefulObserver) == null && (lifecycleOwner = this.f۸۹۸۶c.get()) != null) {
            boolean isReentrance = this.f۸۹۸۷d != 0 || this.f۸۹۸۸e;
            AbstractCc.EnumCb targetState = m۱۰۸۹۸c(observer);
            this.f۸۹۸۷d++;
            while (statefulObserver.f۸۹۹۳a.compareTo((Enum) targetState) < 0 && this.f۸۹۸۴a.contains(observer)) {
                m۱۰۹۰۲d(statefulObserver.f۸۹۹۳a);
                statefulObserver.m۱۰۹۰۹a(lifecycleOwner, m۱۰۹۰۳e(statefulObserver.f۸۹۹۳a));
                m۱۰۸۹۹c();
                targetState = m۱۰۸۹۸c(observer);
            }
            if (!isReentrance) {
                m۱۰۹۰۱d();
            }
            this.f۸۹۸۷d--;
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    private void m۱۰۸۹۹c() {
        ArrayList<AbstractCc.EnumCb> arrayList = this.f۸۹۹۰g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۰۹۰۲d(AbstractCc.EnumCb state) {
        this.f۸۹۹۰g.add(state);
    }

    @Override // android.arch.lifecycle.AbstractCc
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۰۹۰۸b(AbstractCd observer) {
        this.f۸۹۸۴a.remove(observer);
    }

    @Override // android.arch.lifecycle.AbstractCc
    /* renamed from: a  reason: contains not printable characters */
    public AbstractCc.EnumCb m۱۰۹۰۴a() {
        return this.f۸۹۸۵b;
    }

    /* renamed from: b  reason: contains not printable characters */
    static AbstractCc.EnumCb m۱۰۸۹۵b(AbstractCc.EnumCa event) {
        switch (Ca.f۸۹۹۱a[event.ordinal()]) {
            case 1:
            case 2:
                return AbstractCc.EnumCb.CREATED;
            case 3:
            case 4:
                return AbstractCc.EnumCb.STARTED;
            case 5:
                return AbstractCc.EnumCb.RESUMED;
            case 6:
                return AbstractCc.EnumCb.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + event);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.f$a  reason: invalid class name */
    public static /* synthetic */ class Ca {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۸۹۹۱a = new int[AbstractCc.EnumCa.values().length];

        /* renamed from: b  reason: contains not printable characters */
        static final /* synthetic */ int[] f۸۹۹۲b = new int[AbstractCc.EnumCb.values().length];

        static {
            try {
                f۸۹۹۲b[AbstractCc.EnumCb.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f۸۹۹۲b[AbstractCc.EnumCb.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۸۹۹۲b[AbstractCc.EnumCb.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۸۹۹۲b[AbstractCc.EnumCb.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۸۹۹۲b[AbstractCc.EnumCb.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۸۹۹۱a[AbstractCc.EnumCa.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۸۹۹۱a[AbstractCc.EnumCa.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f۸۹۹۱a[AbstractCc.EnumCa.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f۸۹۹۱a[AbstractCc.EnumCa.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f۸۹۹۱a[AbstractCc.EnumCa.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f۸۹۹۱a[AbstractCc.EnumCa.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f۸۹۹۱a[AbstractCc.EnumCa.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError e12) {
            }
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    private static AbstractCc.EnumCa m۱۰۸۹۴b(AbstractCc.EnumCb state) {
        int i = Ca.f۸۹۹۲b[state.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return AbstractCc.EnumCa.ON_DESTROY;
        } else {
            if (i == 3) {
                return AbstractCc.EnumCa.ON_STOP;
            }
            if (i == 4) {
                return AbstractCc.EnumCa.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + state);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e  reason: contains not printable characters */
    private static AbstractCc.EnumCa m۱۰۹۰۳e(AbstractCc.EnumCb state) {
        int i = Ca.f۸۹۹۲b[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return AbstractCc.EnumCa.ON_START;
            }
            if (i == 3) {
                return AbstractCc.EnumCa.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + state);
            }
        }
        return AbstractCc.EnumCa.ON_CREATE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: a.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b  reason: contains not printable characters */
    private void m۱۰۸۹۶b(AbstractCe lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> ascendingIterator = this.f۸۹۸۴a.m۹۹۳۱c();
        while (ascendingIterator.hasNext() && !this.f۸۹۸۹f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = ascendingIterator.next();
            Cb observer = (Cb) entry.getValue();
            while (observer.f۸۹۹۳a.compareTo((Enum) this.f۸۹۸۵b) < 0 && !this.f۸۹۸۹f && this.f۸۹۸۴a.contains(entry.getKey())) {
                m۱۰۹۰۲d(observer.f۸۹۹۳a);
                observer.m۱۰۹۰۹a(lifecycleOwner, m۱۰۹۰۳e(observer.f۸۹۹۳a));
                m۱۰۸۹۹c();
            }
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private void m۱۰۸۹۳a(AbstractCe lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> descendingIterator = this.f۸۹۸۴a.m۹۹۲۸a();
        while (descendingIterator.hasNext() && !this.f۸۹۸۹f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = descendingIterator.next();
            Cb observer = (Cb) entry.getValue();
            while (observer.f۸۹۹۳a.compareTo((Enum) this.f۸۹۸۵b) > 0 && !this.f۸۹۸۹f && this.f۸۹۸۴a.contains(entry.getKey())) {
                AbstractCc.EnumCa event = m۱۰۸۹۴b(observer.f۸۹۹۳a);
                m۱۰۹۰۲d(m۱۰۸۹۵b(event));
                observer.m۱۰۹۰۹a(lifecycleOwner, event);
                m۱۰۸۹۹c();
            }
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۰۹۰۱d() {
        AbstractCe lifecycleOwner = this.f۸۹۸۶c.get();
        if (lifecycleOwner == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!m۱۰۸۹۷b()) {
            this.f۸۹۸۹f = false;
            if (this.f۸۹۸۵b.compareTo((Enum) this.f۸۹۸۴a.m۹۹۳۰b().getValue().f۸۹۹۳a) < 0) {
                m۱۰۸۹۳a(lifecycleOwner);
            }
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> newest = this.f۸۹۸۴a.m۹۹۳۲d();
            if (!this.f۸۹۸۹f && newest != null && this.f۸۹۸۵b.compareTo((Enum) ((Cb) newest.getValue()).f۸۹۹۳a) > 0) {
                m۱۰۸۹۶b(lifecycleOwner);
            }
        }
        this.f۸۹۸۹f = false;
    }

    /* renamed from: a  reason: contains not printable characters */
    static AbstractCc.EnumCb m۱۰۸۹۲a(AbstractCc.EnumCb state1, AbstractCc.EnumCb state2) {
        return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.arch.lifecycle.f$b  reason: invalid class name */
    public static class Cb {

        /* renamed from: a  reason: contains not printable characters */
        AbstractCc.EnumCb f۸۹۹۳a;

        /* renamed from: b  reason: contains not printable characters */
        GenericLifecycleObserver f۸۹۹۴b;

        Cb(AbstractCd observer, AbstractCc.EnumCb initialState) {
            this.f۸۹۹۴b = Ch.m۱۰۹۱۱a(observer);
            this.f۸۹۹۳a = initialState;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۰۹۰۹a(AbstractCe owner, AbstractCc.EnumCa event) {
            AbstractCc.EnumCb newState = Cf.m۱۰۸۹۵b(event);
            this.f۸۹۹۳a = Cf.m۱۰۸۹۲a(this.f۸۹۹۳a, newState);
            this.f۸۹۹۴b.m۱۰۸۵۲a(owner, event);
            this.f۸۹۹۳a = newState;
        }
    }
}
