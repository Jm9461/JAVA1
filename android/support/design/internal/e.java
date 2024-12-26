package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public class e extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    public e() {
    }

    public e(Parcel source, ClassLoader loader) {
        int size = source.readInt();
        int[] keys = new int[size];
        source.readIntArray(keys);
        Parcelable[] values = source.readParcelableArray(loader);
        for (int i = 0; i < size; i++) {
            put(keys[i], values[i]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int flags) {
        int size = size();
        int[] keys = new int[size];
        Parcelable[] values = new Parcelable[size];
        for (int i = 0; i < size; i++) {
            keys[i] = keyAt(i);
            values[i] = (Parcelable) valueAt(i);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(keys);
        parcel.writeParcelableArray(values, flags);
    }

    static class a implements Parcelable.ClassLoaderCreator<e> {
        a() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public e createFromParcel(Parcel source, ClassLoader loader) {
            return new e(source, loader);
        }

        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel source) {
            return new e(source, null);
        }

        @Override // android.os.Parcelable.Creator
        public e[] newArray(int size) {
            return new e[size];
        }
    }
}
