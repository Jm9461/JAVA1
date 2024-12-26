package p۲۰۸b.p۲۵۹h.p۲۶۱b;

/* renamed from: b.h.b.b, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCb<T> extends AbstractCc<T, Integer> {
    /* JADX WARN: Generic types in debug info not equals: b.h.b.b != com.nineoldandroids.util.IntProperty<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p۲۰۸b.p۲۵۹h.p۲۶۱b.AbstractCc
    /* renamed from: a, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ void mo۱۴۲۸۴a(Object obj, Integer num) {
        a2((AbstractCb<T>) obj, num);
    }

    /* JADX WARN: Generic types in debug info not equals: b.h.b.b != com.nineoldandroids.util.IntProperty<T> */
    public AbstractCb(String name) {
        super(Integer.class, name);
    }

    /* JADX WARN: Generic types in debug info not equals: b.h.b.b != com.nineoldandroids.util.IntProperty<T> */
    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(T object, Integer value) {
        a2((AbstractCb<T>) object, Integer.valueOf(value.intValue()));
    }
}
