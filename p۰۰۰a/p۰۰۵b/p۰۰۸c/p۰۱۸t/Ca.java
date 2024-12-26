package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۸t;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.AbstractCa;
import p۰۰۰a.p۰۰۵b.p۰۲۳g.p۰۳۱g.Cn;

/* renamed from: a.b.c.t.a  reason: invalid class name */
public class Ca extends AbstractCa {
    public static final Parcelable.Creator<Ca> CREATOR = new Ca();

    /* renamed from: e  reason: contains not printable characters */
    public final Cn<String, Bundle> f۸۳۲۸e;

    /* synthetic */ Ca(Parcel x0, ClassLoader x1, Ca x2) {
        this(x0, x1);
    }

    public Ca(Parcelable superState) {
        super(superState);
        this.f۸۳۲۸e = new Cn<>();
    }

    private Ca(Parcel in, ClassLoader loader) {
        super(in, loader);
        int size = in.readInt();
        String[] keys = new String[size];
        in.readStringArray(keys);
        Bundle[] states = new Bundle[size];
        in.readTypedArray(states, Bundle.CREATOR);
        this.f۸۳۲۸e = new Cn<>(size);
        for (int i = 0; i < size; i++) {
            this.f۸۳۲۸e.put(keys[i], states[i]);
        }
    }

    @Override // android.support.p۰۴۳v4.view.AbstractCa
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        int size = this.f۸۳۲۸e.size();
        out.writeInt(size);
        String[] keys = new String[size];
        Bundle[] states = new Bundle[size];
        for (int i = 0; i < size; i++) {
            keys[i] = this.f۸۳۲۸e.m۱۰۶۵۴b(i);
            states[i] = this.f۸۳۲۸e.m۱۰۶۵۶d(i);
        }
        out.writeStringArray(keys);
        out.writeTypedArray(states, 0);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f۸۳۲۸e + "}";
    }

    /* renamed from: a.b.c.t.a$a  reason: invalid class name */
    static class Ca implements Parcelable.ClassLoaderCreator<Ca> {
        Ca() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Ca createFromParcel(Parcel in, ClassLoader loader) {
            return new Ca(in, loader, null);
        }

        @Override // android.os.Parcelable.Creator
        public Ca createFromParcel(Parcel in) {
            return new Ca(in, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public Ca[] newArray(int size) {
            return new Ca[size];
        }
    }
}
