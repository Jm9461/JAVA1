package android.support.v4.graphics.drawable;

import androidx.versionedparcelable.a;

public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer {
    public static IconCompat read(a parcel) {
        return androidx.core.graphics.drawable.IconCompatParcelizer.read(parcel);
    }

    public static void write(IconCompat obj, a parcel) {
        androidx.core.graphics.drawable.IconCompatParcelizer.write(obj, parcel);
    }
}