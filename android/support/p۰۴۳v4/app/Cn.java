package android.support.p۰۴۳v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.app.n  reason: invalid class name */
public final class Cn implements Parcelable {
    public static final Parcelable.Creator<Cn> CREATOR = new Ca();

    /* renamed from: c  reason: contains not printable characters */
    Co[] f۱۰۲۹۵c;

    /* renamed from: d  reason: contains not printable characters */
    int[] f۱۰۲۹۶d;

    /* renamed from: e  reason: contains not printable characters */
    Cd[] f۱۰۲۹۷e;

    /* renamed from: f  reason: contains not printable characters */
    int f۱۰۲۹۸f = -1;

    /* renamed from: g  reason: contains not printable characters */
    int f۱۰۲۹۹g;

    public Cn() {
    }

    public Cn(Parcel in) {
        this.f۱۰۲۹۵c = (Co[]) in.createTypedArray(Co.CREATOR);
        this.f۱۰۲۹۶d = in.createIntArray();
        this.f۱۰۲۹۷e = (Cd[]) in.createTypedArray(Cd.CREATOR);
        this.f۱۰۲۹۸f = in.readInt();
        this.f۱۰۲۹۹g = in.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedArray(this.f۱۰۲۹۵c, flags);
        dest.writeIntArray(this.f۱۰۲۹۶d);
        dest.writeTypedArray(this.f۱۰۲۹۷e, flags);
        dest.writeInt(this.f۱۰۲۹۸f);
        dest.writeInt(this.f۱۰۲۹۹g);
    }

    /* renamed from: android.support.v4.app.n$a  reason: invalid class name */
    static class Ca implements Parcelable.Creator<Cn> {
        Ca() {
        }

        @Override // android.os.Parcelable.Creator
        public Cn createFromParcel(Parcel in) {
            return new Cn(in);
        }

        @Override // android.os.Parcelable.Creator
        public Cn[] newArray(int size) {
            return new Cn[size];
        }
    }
}
