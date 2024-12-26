package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final a f۱۳۳۰d = new C۰۰۳۰a();

    /* renamed from: c  reason: collision with root package name */
    private final Parcelable f۱۳۳۱c;

    /* renamed from: android.support.v4.view.a$a  reason: collision with other inner class name */
    static class C۰۰۳۰a extends a {
        C۰۰۳۰a() {
            super((C۰۰۳۰a) null);
        }
    }

    /* synthetic */ a(C۰۰۳۰a x0) {
        this();
    }

    private a() {
        this.f۱۳۳۱c = null;
    }

    protected a(Parcelable superState) {
        if (superState != null) {
            this.f۱۳۳۱c = superState != f۱۳۳۰d ? superState : null;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected a(Parcel source, ClassLoader loader) {
        Parcelable superState = source.readParcelable(loader);
        this.f۱۳۳۱c = superState != null ? superState : f۱۳۳۰d;
    }

    public final Parcelable a() {
        return this.f۱۳۳۱c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.f۱۳۳۱c, flags);
    }

    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel in, ClassLoader loader) {
            if (in.readParcelable(loader) == null) {
                return a.f۱۳۳۰d;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel in) {
            return createFromParcel(in, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int size) {
            return new a[size];
        }
    }
}
