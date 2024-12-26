package p۱۵۹a.p۱۶۴b.p۱۶۷c.p۱۷۳p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: a.b.c.p.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Ca {
    /* renamed from: a, reason: contains not printable characters */
    public static ColorStateList m۷۹۶۳a(Context context, TypedArray attributes, int index) {
        int resourceId;
        ColorStateList value;
        if (attributes.hasValue(index) && (resourceId = attributes.getResourceId(index, 0)) != 0 && (value = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۳b(context, resourceId)) != null) {
            return value;
        }
        return attributes.getColorStateList(index);
    }

    /* renamed from: b, reason: contains not printable characters */
    public static Drawable m۷۹۶۴b(Context context, TypedArray attributes, int index) {
        int resourceId;
        Drawable value;
        if (attributes.hasValue(index) && (resourceId = attributes.getResourceId(index, 0)) != 0 && (value = p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۴c.p۱۹۵a.Ca.m۸۶۰۴c(context, resourceId)) != null) {
            return value;
        }
        return attributes.getDrawable(index);
    }
}
