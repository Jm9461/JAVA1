package a.b.c.t;

import a.b.g.g.n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class a extends android.support.v4.view.a {
    public static final Parcelable.Creator<a> CREATOR = new C۰۰۰۴a();

    /* renamed from: e  reason: collision with root package name */
    public final n<String, Bundle> f۷۷e;

    /* synthetic */ a(Parcel x0, ClassLoader x1, C۰۰۰۴a x2) {
        this(x0, x1);
    }

    public a(Parcelable superState) {
        super(superState);
        this.f۷۷e = new n<>();
    }

    private a(Parcel in, ClassLoader loader) {
        super(in, loader);
        int size = in.readInt();
        String[] keys = new String[size];
        in.readStringArray(keys);
        Bundle[] states = new Bundle[size];
        in.readTypedArray(states, Bundle.CREATOR);
        this.f۷۷e = new n<>(size);
        for (int i = 0; i < size; i++) {
            this.f۷۷e.put(keys[i], states[i]);
        }
    }

    @Override // android.support.v4.view.a
    public void writeToParcel(Parcel out, int flags) {
        super.writeToParcel(out, flags);
        int size = this.f۷۷e.size();
        out.writeInt(size);
        String[] keys = new String[size];
        Bundle[] states = new Bundle[size];
        for (int i = 0; i < size; i++) {
            keys[i] = this.f۷۷e.b(i);
            states[i] = this.f۷۷e.d(i);
        }
        out.writeStringArray(keys);
        out.writeTypedArray(states, 0);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f۷۷e + "}";
    }

    /* renamed from: a.b.c.t.a$a  reason: collision with other inner class name */
    static class C۰۰۰۴a implements Parcelable.ClassLoaderCreator<a> {
        C۰۰۰۴a() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public a createFromParcel(Parcel in, ClassLoader loader) {
            return new a(in, loader, null);
        }

        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel in) {
            return new a(in, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int size) {
            return new a[size];
        }
    }
}
