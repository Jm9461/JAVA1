package b.h.b;

public abstract class b<T> extends c<T, Integer> {
    public b(String name) {
        super(Integer.class, name);
    }

    public final void a(T object, Integer value) {
        a((Object) object, Integer.valueOf(value.intValue()));
    }
}
