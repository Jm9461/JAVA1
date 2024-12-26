package butterknife.a;

import android.util.TypedValue;
import android.view.View;

public final class a {
    static {
        new TypedValue();
    }

    public static View a(View source, int id, String who) {
        View view = source.findViewById(id);
        if (view != null) {
            return view;
        }
        String name = a(source, id);
        throw new IllegalStateException("Required view '" + name + "' with ID " + id + " for " + who + " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    }

    public static <T> T b(View source, int id, String who, Class<T> cls) {
        return (T) a(a(source, id, who), id, who, cls);
    }

    public static <T> T a(View view, int id, String who, Class<T> cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e2) {
            String name = a(view, id);
            throw new IllegalStateException("View '" + name + "' with ID " + id + " for " + who + " was of the wrong type. See cause for more info.", e2);
        }
    }

    private static String a(View view, int id) {
        if (view.isInEditMode()) {
            return "<unavailable while editing>";
        }
        return view.getContext().getResources().getResourceEntryName(id);
    }
}
