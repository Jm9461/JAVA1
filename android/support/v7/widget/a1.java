package android.support.v7.widget;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* access modifiers changed from: package-private */
public class a1 {
    static int a(RecyclerView.a0 state, t0 orientation, View startChild, View endChild, RecyclerView.o lm, boolean smoothScrollbarEnabled, boolean reverseLayout) {
        int itemsBefore;
        if (lm.e() == 0 || state.a() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        int minPosition = Math.min(lm.l(startChild), lm.l(endChild));
        int maxPosition = Math.max(lm.l(startChild), lm.l(endChild));
        if (reverseLayout) {
            itemsBefore = Math.max(0, (state.a() - maxPosition) - 1);
        } else {
            itemsBefore = Math.max(0, minPosition);
        }
        if (!smoothScrollbarEnabled) {
            return itemsBefore;
        }
        return Math.round((((float) itemsBefore) * (((float) Math.abs(orientation.a(endChild) - orientation.d(startChild))) / ((float) (Math.abs(lm.l(startChild) - lm.l(endChild)) + 1)))) + ((float) (orientation.f() - orientation.d(startChild))));
    }

    static int a(RecyclerView.a0 state, t0 orientation, View startChild, View endChild, RecyclerView.o lm, boolean smoothScrollbarEnabled) {
        if (lm.e() == 0 || state.a() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return Math.abs(lm.l(startChild) - lm.l(endChild)) + 1;
        }
        return Math.min(orientation.g(), orientation.a(endChild) - orientation.d(startChild));
    }

    static int b(RecyclerView.a0 state, t0 orientation, View startChild, View endChild, RecyclerView.o lm, boolean smoothScrollbarEnabled) {
        if (lm.e() == 0 || state.a() == 0 || startChild == null || endChild == null) {
            return 0;
        }
        if (!smoothScrollbarEnabled) {
            return state.a();
        }
        return (int) ((((float) (orientation.a(endChild) - orientation.d(startChild))) / ((float) (Math.abs(lm.l(startChild) - lm.l(endChild)) + 1))) * ((float) state.a()));
    }
}
