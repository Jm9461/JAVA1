package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.o  reason: invalid class name */
public class Co {

    /* renamed from: a  reason: contains not printable characters */
    private final AbstractCa f۸۹۹۸a;

    /* renamed from: b  reason: contains not printable characters */
    private final Cp f۸۹۹۹b;

    /* renamed from: android.arch.lifecycle.o$a  reason: invalid class name */
    public interface AbstractCa {
        /* renamed from: a  reason: contains not printable characters */
        <T extends AbstractCn> T m۱۰۹۳۱a(Class<T> cls);
    }

    public Co(Cp store, AbstractCa factory) {
        this.f۸۹۹۸a = factory;
        this.f۸۹۹۹b = store;
    }

    /* renamed from: a  reason: contains not printable characters */
    public <T extends AbstractCn> T m۱۰۹۲۹a(Class<T> modelClass) {
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m۱۰۹۳۰a("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a  reason: contains not printable characters */
    public <T extends AbstractCn> T m۱۰۹۳۰a(String key, Class<T> modelClass) {
        T t = (T) this.f۸۹۹۹b.m۱۰۹۳۲a(key);
        if (modelClass.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f۸۹۹۸a.m۱۰۹۳۱a(modelClass);
        this.f۸۹۹۹b.m۱۰۹۳۴a(key, t2);
        return t2;
    }
}
