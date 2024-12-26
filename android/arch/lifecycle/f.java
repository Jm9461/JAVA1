package android.arch.lifecycle;

import android.arch.lifecycle.LifecycleRegistry;
import android.arch.lifecycle.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class f extends c {

    /* renamed from: a  reason: collision with root package name */
    private a.a.a.b.a<d, b> f۵۴۰a = new a.a.a.b.a<>();

    /* renamed from: b  reason: collision with root package name */
    private c.b f۵۴۱b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<e> f۵۴۲c;

    /* renamed from: d  reason: collision with root package name */
    private int f۵۴۳d = 0;

    /* renamed from: e  reason: collision with root package name */
    private boolean f۵۴۴e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f۵۴۵f = false;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<c.b> f۵۴۶g = new ArrayList<>();

    public f(e provider) {
        this.f۵۴۲c = new WeakReference<>(provider);
        this.f۵۴۱b = c.b.INITIALIZED;
    }

    public void a(c.b state) {
        c(state);
    }

    public void a(c.a event) {
        c(b(event));
    }

    private void c(c.b next) {
        if (this.f۵۴۱b != next) {
            this.f۵۴۱b = next;
            if (this.f۵۴۴e || this.f۵۴۳d != 0) {
                this.f۵۴۵f = true;
                return;
            }
            this.f۵۴۴e = true;
            d();
            this.f۵۴۴e = false;
        }
    }

    private boolean b() {
        if (this.f۵۴۰a.size() == 0) {
            return true;
        }
        c.b eldestObserverState = this.f۵۴۰a.b().getValue().f۵۴۹a;
        c.b newestObserverState = this.f۵۴۰a.d().getValue().f۵۴۹a;
        if (eldestObserverState == newestObserverState && this.f۵۴۱b == newestObserverState) {
            return true;
        }
        return false;
    }

    private c.b c(d observer) {
        Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> previous = this.f۵۴۰a.b(observer);
        c.b parentState = null;
        c.b siblingState = previous != null ? ((b) previous.getValue()).f۵۴۹a : null;
        if (!this.f۵۴۶g.isEmpty()) {
            ArrayList<c.b> arrayList = this.f۵۴۶g;
            parentState = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.f۵۴۱b, siblingState), parentState);
    }

    @Override // android.arch.lifecycle.c
    public void a(d observer) {
        e lifecycleOwner;
        c.b bVar = this.f۵۴۱b;
        c.b initialState = c.b.DESTROYED;
        if (bVar != initialState) {
            initialState = c.b.INITIALIZED;
        }
        b statefulObserver = new b(observer, initialState);
        if (this.f۵۴۰a.b(observer, statefulObserver) == null && (lifecycleOwner = this.f۵۴۲c.get()) != null) {
            boolean isReentrance = this.f۵۴۳d != 0 || this.f۵۴۴e;
            c.b targetState = c(observer);
            this.f۵۴۳d++;
            while (statefulObserver.f۵۴۹a.compareTo((Enum) targetState) < 0 && this.f۵۴۰a.contains(observer)) {
                d(statefulObserver.f۵۴۹a);
                statefulObserver.a(lifecycleOwner, e(statefulObserver.f۵۴۹a));
                c();
                targetState = c(observer);
            }
            if (!isReentrance) {
                d();
            }
            this.f۵۴۳d--;
        }
    }

    private void c() {
        ArrayList<c.b> arrayList = this.f۵۴۶g;
        arrayList.remove(arrayList.size() - 1);
    }

    private void d(c.b state) {
        this.f۵۴۶g.add(state);
    }

    @Override // android.arch.lifecycle.c
    public void b(d observer) {
        this.f۵۴۰a.remove(observer);
    }

    @Override // android.arch.lifecycle.c
    public c.b a() {
        return this.f۵۴۱b;
    }

    static c.b b(c.a event) {
        switch (a.f۵۴۷a[event.ordinal()]) {
            case 1:
            case 2:
                return c.b.CREATED;
            case 3:
            case 4:
                return c.b.STARTED;
            case 5:
                return c.b.RESUMED;
            case 6:
                return c.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + event);
        }
    }

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f۵۴۷a = new int[c.a.values().length];

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f۵۴۸b = new int[c.b.values().length];

        static {
            try {
                f۵۴۸b[c.b.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۵۴۸b[c.b.CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۵۴۸b[c.b.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۵۴۸b[c.b.RESUMED.ordinal()] = 4;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۵۴۸b[c.b.DESTROYED.ordinal()] = 5;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۵۴۷a[c.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f۵۴۷a[c.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f۵۴۷a[c.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f۵۴۷a[c.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f۵۴۷a[c.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f۵۴۷a[c.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError e12) {
            }
            try {
                f۵۴۷a[c.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError e13) {
            }
        }
    }

    private static c.a b(c.b state) {
        int i = a.f۵۴۸b[state.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return c.a.ON_DESTROY;
        } else {
            if (i == 3) {
                return c.a.ON_STOP;
            }
            if (i == 4) {
                return c.a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + state);
            }
            throw new IllegalArgumentException();
        }
    }

    private static c.a e(c.b state) {
        int i = a.f۵۴۸b[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c.a.ON_START;
            }
            if (i == 3) {
                return c.a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + state);
            }
        }
        return c.a.ON_CREATE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: a.a.a.b.a<android.arch.lifecycle.d, android.arch.lifecycle.f$b> */
    /* JADX WARN: Multi-variable type inference failed */
    private void b(e lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> ascendingIterator = this.f۵۴۰a.c();
        while (ascendingIterator.hasNext() && !this.f۵۴۵f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = ascendingIterator.next();
            b observer = (b) entry.getValue();
            while (observer.f۵۴۹a.compareTo((Enum) this.f۵۴۱b) < 0 && !this.f۵۴۵f && this.f۵۴۰a.contains(entry.getKey())) {
                d(observer.f۵۴۹a);
                observer.a(lifecycleOwner, e(observer.f۵۴۹a));
                c();
            }
        }
    }

    private void a(e lifecycleOwner) {
        Iterator<Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState>> descendingIterator = this.f۵۴۰a.a();
        while (descendingIterator.hasNext() && !this.f۵۴۵f) {
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> entry = descendingIterator.next();
            b observer = (b) entry.getValue();
            while (observer.f۵۴۹a.compareTo((Enum) this.f۵۴۱b) > 0 && !this.f۵۴۵f && this.f۵۴۰a.contains(entry.getKey())) {
                c.a event = b(observer.f۵۴۹a);
                d(b(event));
                observer.a(lifecycleOwner, event);
                c();
            }
        }
    }

    private void d() {
        e lifecycleOwner = this.f۵۴۲c.get();
        if (lifecycleOwner == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn't try dispatch new events from it.");
            return;
        }
        while (!b()) {
            this.f۵۴۵f = false;
            if (this.f۵۴۱b.compareTo((Enum) this.f۵۴۰a.b().getValue().f۵۴۹a) < 0) {
                a(lifecycleOwner);
            }
            Map.Entry<LifecycleObserver, LifecycleRegistry.ObserverWithState> newest = this.f۵۴۰a.d();
            if (!this.f۵۴۵f && newest != null && this.f۵۴۱b.compareTo((Enum) ((b) newest.getValue()).f۵۴۹a) > 0) {
                b(lifecycleOwner);
            }
        }
        this.f۵۴۵f = false;
    }

    static c.b a(c.b state1, c.b state2) {
        return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        c.b f۵۴۹a;

        /* renamed from: b  reason: collision with root package name */
        GenericLifecycleObserver f۵۵۰b;

        b(d observer, c.b initialState) {
            this.f۵۵۰b = h.a(observer);
            this.f۵۴۹a = initialState;
        }

        /* access modifiers changed from: package-private */
        public void a(e owner, c.a event) {
            c.b newState = f.b(event);
            this.f۵۴۹a = f.a(this.f۵۴۹a, newState);
            this.f۵۵۰b.a(owner, event);
            this.f۵۴۹a = newState;
        }
    }
}
