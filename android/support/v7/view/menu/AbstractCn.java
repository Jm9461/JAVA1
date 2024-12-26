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

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.view.menu.n, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public abstract class AbstractCn implements InterfaceCt, InterfaceCp, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: contains not printable characters */
    private Rect f۱۱۳۳۲c;

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۹۱۹a(int i);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۹۲۱a(Ch ch);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۹۲۴a(View view);

    /* renamed from: a, reason: contains not printable characters */
    public abstract void mo۱۱۹۲۵a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۹۲۸b(int i);

    /* renamed from: b, reason: contains not printable characters */
    public abstract void mo۱۱۹۲۹b(boolean z);

    /* renamed from: c, reason: contains not printable characters */
    public abstract void mo۱۱۹۳۲c(int i);

    /* renamed from: c, reason: contains not printable characters */
    public abstract void mo۱۱۹۳۳c(boolean z);

    AbstractCn() {
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۱۸۷۰a(Rect bounds) {
        this.f۱۱۳۳۲c = bounds;
    }

    /* renamed from: h, reason: contains not printable characters */
    public Rect m۱۱۸۸۱h() {
        return this.f۱۱۳۳۲c;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۵a(Context context, Ch menu) {
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۲۸۸۵b(Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۸۸۲a(Ch menu, Ck item) {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public int mo۱۲۸۷۷a() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ListAdapter outerAdapter = (ListAdapter) parent.getAdapter();
        Cg wrappedAdapter = m۱۱۸۶۵a(outerAdapter);
        wrappedAdapter.f۱۱۲۵۶c.m۱۱۷۸۶a((MenuItem) outerAdapter.getItem(position), this, mo۱۱۸۸۰g() ? 0 : 4);
    }

    /* renamed from: a, reason: contains not printable characters */
    protected static int m۱۱۸۶۴a(ListAdapter adapter, ViewGroup parent, Context context, int maxAllowedWidth) {
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

    /* renamed from: a, reason: contains not printable characters */
    protected static Cg m۱۱۸۶۵a(ListAdapter adapter) {
        if (adapter instanceof HeaderViewListAdapter) {
            return (Cg) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        }
        return (Cg) adapter;
    }

    /* renamed from: b, reason: contains not printable characters */
    protected static boolean m۱۱۸۶۶b(Ch menu) {
        int count = menu.size();
        for (int i = 0; i < count; i++) {
            MenuItem childItem = menu.getItem(i);
            if (childItem.isVisible() && childItem.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g, reason: contains not printable characters */
    protected boolean mo۱۱۸۸۰g() {
        return true;
    }
}
