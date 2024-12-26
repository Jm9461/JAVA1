package android.support.v4.widget;

import android.widget.ListView;

public class l extends a {
    private final ListView u;

    public l(ListView target) {
        super(target);
        this.u = target;
    }

    @Override // android.support.v4.widget.a
    public void a(int deltaX, int deltaY) {
        m.a(this.u, deltaY);
    }

    @Override // android.support.v4.widget.a
    public boolean a(int direction) {
        return false;
    }

    @Override // android.support.v4.widget.a
    public boolean b(int direction) {
        ListView target = this.u;
        int itemCount = target.getCount();
        if (itemCount == 0) {
            return false;
        }
        int childCount = target.getChildCount();
        int firstPosition = target.getFirstVisiblePosition();
        int lastPosition = firstPosition + childCount;
        if (direction > 0) {
            if (lastPosition < itemCount || target.getChildAt(childCount - 1).getBottom() > target.getHeight()) {
                return true;
            }
            return false;
        } else if (direction >= 0) {
            return false;
        } else {
            if (firstPosition > 0 || target.getChildAt(0).getTop() < 0) {
                return true;
            }
            return false;
        }
    }
}
