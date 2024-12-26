package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.c  reason: invalid class name */
public abstract class AbstractCc {

    /* renamed from: android.arch.lifecycle.c$a  reason: invalid class name */
    public enum EnumCa {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: a  reason: contains not printable characters */
    public abstract EnumCb m۱۰۸۸۷a();

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۰۸۸۸a(AbstractCd dVar);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۰۸۸۹b(AbstractCd dVar);

    /* renamed from: android.arch.lifecycle.c$b  reason: invalid class name */
    public enum EnumCb {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۰۸۹۰a(EnumCb state) {
            return compareTo(state) >= 0;
        }
    }
}
