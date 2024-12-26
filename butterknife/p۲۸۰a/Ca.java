package butterknife.p۲۸۰a;

import android.util.TypedValue;
import android.view.View;

/* renamed from: butterknife.a.a, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Ca {
    static {
        new TypedValue();
    }

    /* renamed from: a, reason: contains not printable characters */
    public static View m۱۴۵۱۴a(View source, int id, String who) {
        View view = source.findViewById(id);
        if (view != null) {
            return view;
        }
        String name = m۱۴۵۱۶a(source, id);
        throw new IllegalStateException("Required view '" + name + "' with ID " + id + " for " + who + " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    }

    /* renamed from: b, reason: contains not printable characters */
    public static <T> T m۱۴۵۱۷b(View view, int i, String str, Class<T> cls) {
        return (T) m۱۴۵۱۵a(m۱۴۵۱۴a(view, i, str), i, str, cls);
    }

    /* renamed from: a, reason: contains not printable characters */
    public static <T> T m۱۴۵۱۵a(View view, int id, String who, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e2) {
            String name = m۱۴۵۱۶a(view, id);
            throw new IllegalStateException("View '" + name + "' with ID " + id + " for " + who + " was of the wrong type. See cause for more info.", e2);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private static String m۱۴۵۱۶a(View view, int id) {
        if (view.isInEditMode()) {
            return "<unavailable while editing>";
        }
        return view.getContext().getResources().getResourceEntryName(id);
    }
}
