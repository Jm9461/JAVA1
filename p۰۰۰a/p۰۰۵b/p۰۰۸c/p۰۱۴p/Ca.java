package p۰۰۰a.p۰۰۵b.p۰۰۸c.p۰۱۴p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

/* renamed from: a.b.c.p.a  reason: invalid class name */
public class Ca {
    /* renamed from: a  reason: contains not printable characters */
    public static ColorStateList m۱۰۰۳۰a(Context context, TypedArray attributes, int index) {
        int resourceId;
        ColorStateList value;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0 || (value = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۲b(context, resourceId)) == null) {
            return attributes.getColorStateList(index);
        }
        return value;
    }

    /* renamed from: b  reason: contains not printable characters */
    public static Drawable m۱۰۰۳۱b(Context context, TypedArray attributes, int index) {
        int resourceId;
        Drawable value;
        if (!attributes.hasValue(index) || (resourceId = attributes.getResourceId(index, 0)) == 0 || (value = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۵c.p۰۳۶a.Ca.m۱۰۶۷۳c(context, resourceId)) == null) {
            return attributes.getDrawable(index);
        }
        return value;
    }
}
