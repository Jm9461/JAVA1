package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.view.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCa implements Parcelable {

    /* renamed from: c, reason: contains not printable characters */
    private final Parcelable f۱۰۵۸۵c;

    /* renamed from: d, reason: contains not printable characters */
    public static final AbstractCa f۱۰۵۸۴d = new a();
    public static final Parcelable.Creator<AbstractCa> CREATOR = new b();

    /* renamed from: android.support.v4.view.a$a */
    static class a extends AbstractCa {
        a() {
            super((a) null);
        }
    }

    /* synthetic */ AbstractCa(a x0) {
        this();
    }

    private AbstractCa() {
        this.f۱۰۵۸۵c = null;
    }

    protected AbstractCa(Parcelable superState) {
        if (superState == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f۱۰۵۸۵c = superState != f۱۰۵۸۴d ? superState : null;
    }

    protected AbstractCa(Parcel source, ClassLoader loader) {
        Parcelable superState = source.readParcelable(loader);
        this.f۱۰۵۸۵c = superState != null ? superState : f۱۰۵۸۴d;
    }

    /* renamed from: a, reason: contains not printable characters */
    public final Parcelable m۱۰۷۲۱a() {
        return this.f۱۰۵۸۵c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.f۱۰۵۸۵c, flags);
    }

    /* renamed from: android.support.v4.view.a$b */
    static class b implements Parcelable.ClassLoaderCreator<AbstractCa> {
        b() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbstractCa createFromParcel(Parcel in, ClassLoader loader) {
            Parcelable superState = in.readParcelable(loader);
            if (superState != null) {
                throw new IllegalStateException("superState must be null");
            }
            return AbstractCa.f۱۰۵۸۴d;
        }

        @Override // android.os.Parcelable.Creator
        public AbstractCa createFromParcel(Parcel in) {
            return createFromParcel(in, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.Creator
        public AbstractCa[] newArray(int size) {
            return new AbstractCa[size];
        }
    }
}
