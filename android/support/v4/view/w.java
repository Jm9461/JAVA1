package android.support.v4.view;

import a.b.a.c;
import android.os.Build;
import android.view.ViewGroup;

public final class w {
    public static boolean a(ViewGroup group) {
        if (Build.VERSION.SDK_INT >= 21) {
            return group.isTransitionGroup();
        }
        Boolean explicit = (Boolean) group.getTag(c.tag_transition_group);
        return ((explicit == null || !explicit.booleanValue()) && group.getBackground() == null && u.q(group) == null) ? false : true;
    }
}
