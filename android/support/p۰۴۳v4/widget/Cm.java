package android.support.p۰۴۳v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.m  reason: invalid class name */
public final class Cm {
    /* renamed from: a  reason: contains not printable characters */
    public static void m۱۳۲۹۲a(ListView listView, int y) {
        View firstView;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(y);
            return;
        }
        int firstPosition = listView.getFirstVisiblePosition();
        if (firstPosition != -1 && (firstView = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstPosition, firstView.getTop() - y);
        }
    }
}
