package android.support.p۰۴۷v7.view.menu;

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
/* renamed from: android.support.v7.view.menu.n  reason: invalid class name */
public abstract class AbstractCn implements AbstractCt, AbstractCp, AdapterView.OnItemClickListener {

    /* renamed from: c  reason: contains not printable characters */
    private Rect f۱۱۳۳۲c;

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۹۳۸a(int i);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۹۴۱a(Ch hVar);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۹۴۲a(View view);

    /* renamed from: a  reason: contains not printable characters */
    public abstract void m۱۳۹۴۳a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۳۹۴۵b(int i);

    /* renamed from: b  reason: contains not printable characters */
    public abstract void m۱۳۹۴۶b(boolean z);

    /* renamed from: c  reason: contains not printable characters */
    public abstract void m۱۳۹۴۸c(int i);

    /* renamed from: c  reason: contains not printable characters */
    public abstract void m۱۳۹۴۹c(boolean z);

    AbstractCn() {
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۴۰a(Rect bounds) {
        this.f۱۱۳۳۲c = bounds;
    }

    /* renamed from: h  reason: contains not printable characters */
    public Rect m۱۳۹۵۱h() {
        return this.f۱۱۳۳۲c;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۳۹a(Context context, Ch menu) {
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۹۴۷b(Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۹۴۴a(Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public int m۱۳۹۳۷a() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListAdapter outerAdapter = (ListAdapter) parent.getAdapter();
        m۱۳۹۳۵a(outerAdapter).f۱۱۲۵۶c.m۱۳۸۵۶a((MenuItem) outerAdapter.getItem(position), this, m۱۳۹۵۰g() ? 0 : 4);
    }

    /* renamed from: a  reason: contains not printable characters */
    protected static int m۱۳۹۳۴a(ListAdapter adapter, ViewGroup parent, Context context, int maxAllowedWidth) {
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

    /* renamed from: a  reason: contains not printable characters */
    protected static Cg m۱۳۹۳۵a(ListAdapter adapter) {
        if (adapter instanceof HeaderViewListAdapter) {
            return (Cg) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        return (Cg) adapter;
    }

    /* renamed from: b  reason: contains not printable characters */
    protected static boolean m۱۳۹۳۶b(Ch menu) {
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
    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۳۹۵۰g() {
        return true;
    }
}
