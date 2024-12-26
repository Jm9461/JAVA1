package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Ca();

    /* renamed from: c  reason: contains not printable characters */
    private final AbstractCc f۱۲۴۳۷c;

    protected ParcelImpl(Parcel in) {
        this.f۱۲۴۳۷c = new Cb(in).m۱۵۷۸۷h();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        new Cb(dest).m۱۵۷۶۹a(this.f۱۲۴۳۷c);
    }

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a  reason: invalid class name */
    static class Ca implements Parcelable.Creator<ParcelImpl> {
        Ca() {
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel in) {
            return new ParcelImpl(in);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int size) {
            return new ParcelImpl[size];
        }
    }
}
