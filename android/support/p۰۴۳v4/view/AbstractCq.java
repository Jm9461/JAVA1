package android.support.p۰۴۳v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.q  reason: invalid class name */
public abstract class AbstractCq {

    /* renamed from: a  reason: contains not printable characters */
    private final DataSetObservable f۱۰۶۲۰a = new DataSetObservable();

    /* renamed from: b  reason: contains not printable characters */
    private DataSetObserver f۱۰۶۲۱b;

    /* renamed from: a  reason: contains not printable characters */
    public abstract int m۱۲۹۵۱a();

    /* renamed from: a  reason: contains not printable characters */
    public abstract Object m۱۲۹۵۴a(ViewGroup viewGroup, int i);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۹۵۶a(Parcelable parcelable, ClassLoader classLoader);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۹۵۷a(ViewGroup viewGroup);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۲۹۵۸a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: a  reason: contains not printable characters */
    public abstract boolean m۱۲۹۵۹a(View view, Object obj);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۲۹۶۳b(ViewGroup viewGroup);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۲۹۶۴b(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: c  reason: contains not printable characters */
    public abstract Parcelable m۱۲۹۶۵c();

    /* renamed from: a  reason: contains not printable characters */
    public int m۱۲۹۵۲a(Object object) {
        return -1;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۹۶۱b() {
        synchronized (this) {
            if (this.f۱۰۶۲۱b != null) {
                this.f۱۰۶۲۱b.onChanged();
            }
        }
        this.f۱۰۶۲۰a.notifyChanged();
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۲۹۵۵a(DataSetObserver observer) {
        this.f۱۰۶۲۰a.registerObserver(observer);
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۲۹۶۶c(DataSetObserver observer) {
        this.f۱۰۶۲۰a.unregisterObserver(observer);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۲۹۶۲b(DataSetObserver observer) {
        synchronized (this) {
            this.f۱۰۶۲۱b = observer;
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public CharSequence m۱۲۹۵۳a(int position) {
        return null;
    }

    /* renamed from: b  reason: contains not printable characters */
    public float m۱۲۹۶۰b(int position) {
        return 1.0f;
    }
}
