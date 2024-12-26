package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* access modifiers changed from: package-private */
public abstract class n implements t, p, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    private Rect f۱۷۲۸c;

    public abstract void a(int i);

    public abstract void a(h hVar);

    public abstract void a(View view);

    public abstract void a(PopupWindow.OnDismissListener onDismissListener);

    public abstract void b(int i);

    public abstract void b(boolean z);

    public abstract void c(int i);

    public abstract void c(boolean z);

    n() {
    }

    public void a(Rect bounds) {
        this.f۱۷۲۸c = bounds;
    }

    public Rect h() {
        return this.f۱۷۲۸c;
    }

    @Override // android.support.v7.view.menu.p
    public void a(Context context, h menu) {
    }

    @Override // android.support.v7.view.menu.p
    public boolean b(h menu, k item) {
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public boolean a(h menu, k item) {
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public int a() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListAdapter outerAdapter = (ListAdapter) parent.getAdapter();
        a(outerAdapter).f۱۶۹۴c.a((MenuItem) outerAdapter.getItem(position), this, g() ? 0 : 4);
    }

    protected static int a(ListAdapter adapter, ViewGroup parent, Context context, int maxAllowedWidth) {
        int maxWidth = 0;
        View itemView = null;
        int itemType = 0;
        int widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            int positionType = adapter.getItemViewType(i);
            if (positionType != itemType) {
                itemType = positionType;
                itemView = null;
            }
            if (parent == null) {
                parent = new FrameLayout(context);
            }
            itemView = adapter.getView(i, itemView, parent);
            itemView.measure(widthMeasureSpec, heightMeasureSpec);
            int itemWidth = itemView.getMeasuredWidth();
            if (itemWidth >= maxAllowedWidth) {
                return maxAllowedWidth;
            }
            if (itemWidth > maxWidth) {
                maxWidth = itemWidth;
            }
        }
        return maxWidth;
    }

    protected static g a(ListAdapter adapter) {
        if (adapter instanceof HeaderViewListAdapter) {
            return (g) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        return (g) adapter;
    }

    protected static boolean b(h menu) {
        int count = menu.size();
        for (int i = 0; i < count; i++) {
            MenuItem childItem = menu.getItem(i);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return true;
    }
}
