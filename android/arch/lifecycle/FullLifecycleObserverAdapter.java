package android.arch.lifecycle;

import android.arch.lifecycle.AbstractCc;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {

    /* renamed from: a  reason: contains not printable characters */
    private final FullLifecycleObserver f۸۹۵۰a;

    FullLifecycleObserverAdapter(FullLifecycleObserver observer) {
        this.f۸۹۵۰a = observer;
    }

    /* renamed from: android.arch.lifecycle.FullLifecycleObserverAdapter$a  reason: invalid class name */
    static /* synthetic */ class Ca {

        /* renamed from: a  reason: contains not printable characters */
        static final /* synthetic */ int[] f۸۹۵۱a = new int[AbstractCc.EnumCa.values().length];

        static {
            try {
                f۸۹۵۱a[AbstractCc.EnumCa.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f۸۹۵۱a[AbstractCc.EnumCa.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f۸۹۵۱a[AbstractCc.EnumCa.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f۸۹۵۱a[AbstractCc.EnumCa.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f۸۹۵۱a[AbstractCc.EnumCa.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f۸۹۵۱a[AbstractCc.EnumCa.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f۸۹۵۱a[AbstractCc.EnumCa.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    @Override // android.arch.lifecycle.GenericLifecycleObserver
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۰۸۵۱a(AbstractCe source, AbstractCc.EnumCa event) {
        switch (Ca.f۸۹۵۱a[event.ordinal()]) {
            case 1:
                this.f۸۹۵۰a.m۱۰۸۴۸d(source);
                return;
            case 2:
                this.f۸۹۵۰a.m۱۰۸۴۷c(source);
                return;
            case 3:
                this.f۸۹۵۰a.m۱۰۸۵۰f(source);
                return;
            case 4:
                this.f۸۹۵۰a.m۱۰۸۴۹e(source);
                return;
            case 5:
                this.f۸۹۵۰a.m۱۰۸۴۶b(source);
                return;
            case 6:
                this.f۸۹۵۰a.m۱۰۸۴۵a(source);
                return;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                return;
        }
    }
}
