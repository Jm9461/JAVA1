package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    o[] f۱۱۴۶c;

    /* renamed from: d  reason: collision with root package name */
    int[] f۱۱۴۷d;

    /* renamed from: e  reason: collision with root package name */
    d[] f۱۱۴۸e;

    /* renamed from: f  reason: collision with root package name */
    int f۱۱۴۹f = -1;

    /* renamed from: g  reason: collision with root package name */
    int f۱۱۵۰g;

    public n() {
    }

    public n(Parcel in) {
        this.f۱۱۴۶c = (o[]) in.createTypedArray(o.CREATOR);
        this.f۱۱۴۷d = in.createIntArray();
        this.f۱۱۴۸e = (d[]) in.createTypedArray(d.CREATOR);
        this.f۱۱۴۹f = in.readInt();
        this.f۱۱۵۰g = in.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedArray(this.f۱۱۴۶c, flags);
        dest.writeIntArray(this.f۱۱۴۷d);
        dest.writeTypedArray(this.f۱۱۴۸e, flags);
        dest.writeInt(this.f۱۱۴۹f);
        dest.writeInt(this.f۱۱۵۰g);
    }

    static class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public n createFromParcel(Parcel in) {
            return new n(in);
        }

        @Override // android.os.Parcelable.Creator
        public n[] newArray(int size) {
            return new n[size];
        }
    }
}
