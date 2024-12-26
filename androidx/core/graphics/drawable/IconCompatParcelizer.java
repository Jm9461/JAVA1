package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.support.p۰۴۳v4.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractCa;

public class IconCompatParcelizer {
    public static IconCompat read(AbstractCa parcel) {
        IconCompat obj = new IconCompat();
        obj.f۱۰۴۸۲a = parcel.m۱۵۷۶۴a(obj.f۱۰۴۸۲a, 1);
        obj.f۱۰۴۸۴c = parcel.m۱۵۷۷۴a(obj.f۱۰۴۸۴c, 2);
        obj.f۱۰۴۸۵d = parcel.m۱۵۷۶۵a(obj.f۱۰۴۸۵d, 3);
        obj.f۱۰۴۸۶e = parcel.m۱۵۷۶۴a(obj.f۱۰۴۸۶e, 4);
        obj.f۱۰۴۸۷f = parcel.m۱۵۷۶۴a(obj.f۱۰۴۸۷f, 5);
        obj.f۱۰۴۸۸g = (ColorStateList) parcel.m۱۵۷۶۵a(obj.f۱۰۴۸۸g, 6);
        obj.f۱۰۴۹۰i = parcel.m۱۵۷۶۶a(obj.f۱۰۴۹۰i, 7);
        obj.m۱۲۷۰۵c();
        return obj;
    }

    public static void write(IconCompat obj, AbstractCa parcel) {
        parcel.m۱۵۷۷۱a(true, true);
        obj.m۱۲۷۰۳a(parcel.m۱۵۷۸۲c());
        parcel.m۱۵۷۷۷b(obj.f۱۰۴۸۲a, 1);
        parcel.m۱۵۷۸۰b(obj.f۱۰۴۸۴c, 2);
        parcel.m۱۵۷۷۸b(obj.f۱۰۴۸۵d, 3);
        parcel.m۱۵۷۷۷b(obj.f۱۰۴۸۶e, 4);
        parcel.m۱۵۷۷۷b(obj.f۱۰۴۸۷f, 5);
        parcel.m۱۵۷۷۸b(obj.f۱۰۴۸۸g, 6);
        parcel.m۱۵۷۷۹b(obj.f۱۰۴۹۰i, 7);
    }
}
