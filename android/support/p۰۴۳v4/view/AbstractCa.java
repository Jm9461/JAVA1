package android.support.p۰۴۳v4.view;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.view.a  reason: invalid class name */
public abstract class AbstractCa implements Parcelable {
    public static final Parcelable.Creator<AbstractCa> CREATOR = new Cb();

    /* renamed from: d  reason: contains not printable characters */
    public static final AbstractCa f۱۰۵۸۴d = new Ca();

    /* renamed from: c  reason: contains not printable characters */
    private final Parcelable f۱۰۵۸۵c;

    /* renamed from: android.support.v4.view.a$a  reason: invalid class name */
    static class Ca extends AbstractCa {
        Ca() {
            super((Ca) null);
        }
    }

    /* synthetic */ AbstractCa(Ca x0) {
        this();
    }

    private AbstractCa() {
        this.f۱۰۵۸۵c = null;
    }

    protected AbstractCa(Parcelable superState) {
        if (superState != null) {
            this.f۱۰۵۸۵c = superState != f۱۰۵۸۴d ? superState : null;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbstractCa(Parcel source, ClassLoader loader) {
        Parcelable superState = source.readParcelable(loader);
        this.f۱۰۵۸۵c = superState != null ? superState : f۱۰۵۸۴d;
    }

    /* renamed from: a  reason: contains not printable characters */
    public final Parcelable m۱۲۷۹۱a() {
        return this.f۱۰۵۸۵c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.f۱۰۵۸۵c, flags);
    }

    /* renamed from: android.support.v4.view.a$b  reason: invalid class name */
    static class Cb implements Parcelable.ClassLoaderCreator<AbstractCa> {
        Cb() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbstractCa createFromParcel(Parcel in, ClassLoader loader) {
            if (in.readParcelable(loader) == null) {
                return AbstractCa.f۱۰۵۸۴d;
            }
            throw new IllegalStateException("superState must be null");
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
