package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.widget.Cj1;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements Ch.AbstractCb, AbstractCq, AdapterView.OnItemClickListener {

    /* renamed from: e  reason: contains not printable characters */
    private static final int[] f۱۱۱۵۵e = {16842964, 16843049};

    /* renamed from: c  reason: contains not printable characters */
    private Ch f۱۱۱۵۶c;

    /* renamed from: d  reason: contains not printable characters */
    private int f۱۱۱۵۷d;

    public ExpandedMenuView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        setOnItemClickListener(this);
        Cj1 a = Cj1.m۱۵۳۴۵a(context, attrs, f۱۱۱۵۵e, defStyleAttr, 0);
        if (a.m۱۵۳۶۴g(0)) {
            setBackgroundDrawable(a.m۱۵۳۵۴b(0));
        }
        if (a.m۱۵۳۶۴g(1)) {
            setDivider(a.m۱۵۳۵۴b(1));
        }
        a.m۱۵۳۵۰a();
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCq
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۴۵a(Ch menu) {
        this.f۱۱۱۵۶c = menu;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.support.p۰۴۷v7.view.menu.Ch.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۷۴۶a(Ck item) {
        return this.f۱۱۱۵۶c.m۱۳۸۵۵a(item, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView parent, View v, int position, long id) {
        m۱۳۷۴۶a((Ck) getAdapter().getItem(position));
    }

    public int getWindowAnimations() {
        return this.f۱۱۱۵۷d;
    }
}
