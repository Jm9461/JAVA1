package android.arch.lifecycle;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private final a f۵۵۴a;

    /* renamed from: b  reason: collision with root package name */
    private final p f۵۵۵b;

    public interface a {
        <T extends n> T a(Class<T> cls);
    }

    public o(p store, a factory) {
        this.f۵۵۴a = factory;
        this.f۵۵۵b = store;
    }

    public <T extends n> T a(Class<T> modelClass) {
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) a("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends n> T a(String key, Class<T> modelClass) {
        T t = (T) this.f۵۵۵b.a(key);
        if (modelClass.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f۵۵۴a.a(modelClass);
        this.f۵۵۵b.a(key, t2);
        return t2;
    }
}
