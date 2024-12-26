package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.q, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCq {

    /* renamed from: a, reason: contains not printable characters */
    private final DataSetObservable f۱۰۶۲۰a = new DataSetObservable();

    /* renamed from: b, reason: contains not printable characters */
    private DataSetObserver f۱۰۶۲۱b;

    /* renamed from: a, reason: contains not printable characters */
    public abstract int mo۱۷۶۴۸a();

    /* renamed from: a, reason: contains not printable characters */
    public abstract Object mo۱۴۸۹۲a(ViewGroup viewGroup, int i);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۴۸۹۴a(Parcelable parcelable, ClassLoader classLoader);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۴۸۹۵a(ViewGroup viewGroup);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۴۸۹۶a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: a, reason: contains not printable characters */
    public abstract boolean mo۱۴۸۹۷a(View view, Object obj);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۴۸۹۹b(ViewGroup viewGroup);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۴۹۰۰b(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: c, reason: contains not printable characters */
    public abstract Parcelable mo۱۴۹۰۱c();

    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۴۸۹۰a(Object object) {
        return -1;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۰۸۹۱b() {
        synchronized (this) {
            if (this.f۱۰۶۲۱b != null) {
                this.f۱۰۶۲۱b.onChanged();
            }
        }
        this.f۱۰۶۲۰a.notifyChanged();
    }

    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۴۸۹۳a(DataSetObserver observer) {
        this.f۱۰۶۲۰a.registerObserver(observer);
    }

    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۴۹۰۲c(DataSetObserver observer) {
        this.f۱۰۶۲۰a.unregisterObserver(observer);
    }

    /* renamed from: b, reason: contains not printable characters */
    void m۱۰۸۹۲b(DataSetObserver observer) {
        synchronized (this) {
            this.f۱۰۶۲۱b = observer;
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public CharSequence mo۱۴۸۹۱a(int position) {
        return null;
    }

    /* renamed from: b, reason: contains not printable characters */
    public float mo۱۴۸۹۸b(int position) {
        return 1.0f;
    }
}
