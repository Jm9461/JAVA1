package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۷t;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbstractCa;
import p۱۵۹a.p۱۶۴b.p۱۸۲g.p۱۹۰g.Cn;

/* renamed from: a.b.c.t.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca extends AbstractCa {
    public static final Parcelable.Creator<Ca> CREATOR = new a();

    /* renamed from: e, reason: contains not printable characters */
    public final Cn<String, Bundle> f۸۳۲۸e;

    /* synthetic */ Ca(Parcel x0, ClassLoader x1, a x2) {
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

    @Override // android.support.v4.view.AbstractCa, android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        int size = this.f۸۳۲۸e.size();
        out.writeInt(size);
        String[] keys = new String[size];
        Bundle[] states = new Bundle[size];
        for (int i = 0; i < size; i++) {
            keys[i] = this.f۸۳۲۸e.m۸۵۸۴b(i);
            states[i] = this.f۸۳۲۸e.m۸۵۸۶d(i);
        }
        out.writeStringArray(keys);
        out.writeTypedArray(states, 0);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f۸۳۲۸e + "}";
    }

    /* renamed from: a.b.c.t.a$a */
    static class a implements Parcelable.ClassLoaderCreator<Ca> {
        a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public Ca createFromParcel(Parcel in, ClassLoader loader) {
            return new Ca(in, loader, null);
        }

        @Override // android.os.Parcelable.Creator
        public Ca createFromParcel(Parcel parcel) {
            return new Ca(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.Creator
        public Ca[] newArray(int size) {
            return new Ca[size];
        }
    }
}
