package android.support.v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.m, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public final class Cm {
    /* renamed from: a, reason: contains not printable characters */
    public static void m۱۱۲۲۲a(ListView listView, int y) {
        View firstView;
        if (Build.VERSION.SDK_INT >= 19) {
            listView.scrollListBy(y);
            return;
        }
        int firstPosition = listView.getFirstVisiblePosition();
        if (firstPosition == -1 || (firstView = listView.getChildAt(0)) == null) {
            return;
        }
        int newTop = firstView.getTop() - y;
        listView.setSelectionFromTop(firstPosition, newTop);
    }
}
