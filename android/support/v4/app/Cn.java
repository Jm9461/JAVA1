package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.app.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class Cn implements Parcelable {
    public static final Parcelable.Creator<Cn> CREATOR = new a();

    /* renamed from: c, reason: contains not printable characters */
    Co[] f۱۰۲۹۵c;

    /* renamed from: d, reason: contains not printable characters */
    int[] f۱۰۲۹۶d;

    /* renamed from: e, reason: contains not printable characters */
    Cd[] f۱۰۲۹۷e;

    /* renamed from: f, reason: contains not printable characters */
    int f۱۰۲۹۸f;

    /* renamed from: g, reason: contains not printable characters */
    int f۱۰۲۹۹g;

    public Cn() {
        this.f۱۰۲۹۸f = -1;
    }

    public Cn(Parcel in) {
        this.f۱۰۲۹۸f = -1;
        this.f۱۰۲۹۵c = (Co[]) in.createTypedArray(Co.CREATOR);
        this.f۱۰۲۹۶d = in.createIntArray();
        this.f۱۰۲۹۷e = (Cd[]) in.createTypedArray(Cd.CREATOR);
        this.f۱۰۲۹۸f = in.readInt();
        this.f۱۰۲۹۹g = in.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedArray(this.f۱۰۲۹۵c, flags);
        dest.writeIntArray(this.f۱۰۲۹۶d);
        dest.writeTypedArray(this.f۱۰۲۹۷e, flags);
        dest.writeInt(this.f۱۰۲۹۸f);
        dest.writeInt(this.f۱۰۲۹۹g);
    }

    /* renamed from: android.support.v4.app.n$a */
    static class a implements Parcelable.Creator<Cn> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Cn createFromParcel(Parcel in) {
            return new Cn(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Cn[] newArray(int size) {
            return new Cn[size];
        }
    }
}
