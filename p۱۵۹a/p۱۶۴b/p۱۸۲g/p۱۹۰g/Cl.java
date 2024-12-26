package p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g;

/* renamed from: a.b.g.g.l, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cl<T> extends Ck<T> {

    /* renamed from: c, reason: contains not printable characters */
    private final Object f۸۷۷۹c;

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.l != android.support.v4.util.Pools$SynchronizedPool<T> */
    public Cl(int maxPoolSize) {
        super(maxPoolSize);
        this.f۸۷۷۹c = new Object();
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.l != android.support.v4.util.Pools$SynchronizedPool<T> */
    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ck, p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.InterfaceCj
    /* renamed from: a, reason: contains not printable characters */
    public T mo۸۵۶۹a() {
        T t;
        synchronized (this.f۸۷۷۹c) {
            t = (T) super.mo۸۵۶۹a();
        }
        return t;
    }

    /* JADX WARN: Generic types in debug info not equals: a.b.g.g.l != android.support.v4.util.Pools$SynchronizedPool<T> */
    @Override // p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Ck, p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.InterfaceCj
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۸۵۷۰a(T element) {
        boolean z;
        synchronized (this.f۸۷۷۹c) {
            z = super.mo۸۵۷۰a(element);
        }
        return z;
    }
}
