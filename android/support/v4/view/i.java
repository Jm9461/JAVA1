package android.support.v4.view;

import android.view.MotionEvent;

public final class i {
    public static boolean a(MotionEvent event, int source) {
        return (event.getSource() & source) == source;
    }
}
