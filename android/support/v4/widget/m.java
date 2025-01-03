package android.support.v4.widget;

import android.os.Build;
import android.view.View;
import android.widget.ListView;

public final class m {
    public static void a(ListView listView, int y) {
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
