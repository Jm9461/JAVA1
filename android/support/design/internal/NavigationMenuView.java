package android.support.design.internal;

import android.content.Context;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.widget.LinearLayoutManager;
import android.support.p۰۴۷v7.widget.RecyclerView;
import android.util.AttributeSet;

public class NavigationMenuView extends RecyclerView implements AbstractCq {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۱۲۹۹a(Ch menu) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
