package butterknife.p۱۲۴a;

import android.util.TypedValue;
import android.view.View;

/* renamed from: butterknife.a.a  reason: invalid class name */
public final class Ca {
    static {
        new TypedValue();
    }

    /* renamed from: a  reason: contains not printable characters */
    public static View m۱۶۵۸۹a(View source, int id, String who) {
        View view = source.findViewById(id);
        if (view != null) {
            return view;
        }
        String name = m۱۶۵۹۱a(source, id);
        throw new IllegalStateException("Required view '" + name + "' with ID " + id + " for " + who + " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    }

    /* renamed from: b  reason: contains not printable characters */
    public static <T> T m۱۶۵۹۲b(View source, int id, String who, Class<T> cls) {
        return (T) m۱۶۵۹۰a(m۱۶۵۸۹a(source, id, who), id, who, cls);
    }

    /* renamed from: a  reason: contains not printable characters */
    public static <T> T m۱۶۵۹۰a(View view, int id, String who, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e) {
            String name = m۱۶۵۹۱a(view, id);
            throw new IllegalStateException("View '" + name + "' with ID " + id + " for " + who + " was of the wrong type. See cause for more info.", e);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private static String m۱۶۵۹۱a(View view, int id) {
        if (view.isInEditMode()) {
            return "<unavailable while editing>";
        }
        return view.getContext().getResources().getResourceEntryName(id);
    }
}
