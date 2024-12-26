package b.h.b;

public abstract class a<T> extends c<T, Float> {
    public abstract void a(T t, float f2);

    public a(String name) {
        super(Float.class, name);
    }

    public final void a(T object, Float value) {
        a(object, value.floatValue());
    }
}
