package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: android.support.design.internal.e  reason: invalid class name */
public class Ce extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<Ce> CREATOR = new Ca();

    public Ce() {
    }

    public Ce(Parcel source, ClassLoader loader) {
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

    /* renamed from: android.support.design.internal.e$a  reason: invalid class name */
    static class Ca implements Parcelable.ClassLoaderCreator<Ce> {
        Ca() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public Ce createFromParcel(Parcel source, ClassLoader loader) {
            return new Ce(source, loader);
        }

        @Override // android.os.Parcelable.Creator
        public Ce createFromParcel(Parcel source) {
            return new Ce(source, null);
        }

        @Override // android.os.Parcelable.Creator
        public Ce[] newArray(int size) {
            return new Ce[size];
        }
    }
}
