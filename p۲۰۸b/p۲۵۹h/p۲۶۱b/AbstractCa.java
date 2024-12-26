package p۲۰۸b.p۲۵۹h.p۲۶۱b;

/* renamed from: b.h.b.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCa<T> extends AbstractCc<T, Float> {
    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۶۳۸۸a(T t, float f2);

    /* JADX WARN: Generic types in debug info not equals: b.h.b.a != com.nineoldandroids.util.FloatProperty<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p۲۰۸b.p۲۵۹h.p۲۶۱b.AbstractCc
    /* renamed from: a, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ void mo۱۴۲۸۴a(Object obj, Float f2) {
        a2((AbstractCa<T>) obj, f2);
    }

    /* JADX WARN: Generic types in debug info not equals: b.h.b.a != com.nineoldandroids.util.FloatProperty<T> */
    public AbstractCa(String name) {
        super(Float.class, name);
    }

    /* JADX WARN: Generic types in debug info not equals: b.h.b.a != com.nineoldandroids.util.FloatProperty<T> */
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(T object, Float value) {
        mo۱۶۳۸۸a((AbstractCa<T>) object, value.floatValue());
    }
}
