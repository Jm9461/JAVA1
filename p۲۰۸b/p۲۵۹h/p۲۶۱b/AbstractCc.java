package p۲۰۸b.p۲۵۹h.p۲۶۱b;

/* renamed from: b.h.b.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCc<T, V> {

    /* renamed from: a, reason: contains not printable characters */
    private final String f۱۲۹۶۵a;

    /* renamed from: a, reason: contains not printable characters */
    public abstract V mo۱۶۳۸۷a(T t);

    /* JADX WARN: Generic types in debug info not equals: b.h.b.c != com.nineoldandroids.util.Property<T, V> */
    public AbstractCc(Class<V> type, String name) {
        this.f۱۲۹۶۵a = name;
    }

    /* JADX WARN: Generic types in debug info not equals: b.h.b.c != com.nineoldandroids.util.Property<T, V> */
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۲۸۴a(T object, V value) {
        throw new UnsupportedOperationException("Property " + m۱۴۲۸۳a() + " is read-only");
    }

    /* JADX WARN: Generic types in debug info not equals: b.h.b.c != com.nineoldandroids.util.Property<T, V> */
    /* renamed from: a, reason: contains not printable characters */
    public String m۱۴۲۸۳a() {
        return this.f۱۲۹۶۵a;
    }
}
