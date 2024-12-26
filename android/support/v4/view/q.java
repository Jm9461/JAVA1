package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private final DataSetObservable f۱۳۶۶a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    private DataSetObserver f۱۳۶۷b;

    public abstract int a();

    public abstract Object a(ViewGroup viewGroup, int i);

    public abstract void a(Parcelable parcelable, ClassLoader classLoader);

    public abstract void a(ViewGroup viewGroup);

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    public abstract boolean a(View view, Object obj);

    public abstract void b(ViewGroup viewGroup);

    public abstract void b(ViewGroup viewGroup, int i, Object obj);

    public abstract Parcelable c();

    public int a(Object object) {
        return -1;
    }

    public void b() {
        synchronized (this) {
            if (this.f۱۳۶۷b != null) {
                this.f۱۳۶۷b.onChanged();
            }
        }
        this.f۱۳۶۶a.notifyChanged();
    }

    public void a(DataSetObserver observer) {
        this.f۱۳۶۶a.registerObserver(observer);
    }

    public void c(DataSetObserver observer) {
        this.f۱۳۶۶a.unregisterObserver(observer);
    }

    /* access modifiers changed from: package-private */
    public void b(DataSetObserver observer) {
        synchronized (this) {
            this.f۱۳۶۷b = observer;
        }
    }

    public CharSequence a(int position) {
        return null;
    }

    public float b(int position) {
        return 1.0f;
    }
}
