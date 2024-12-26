package android.support.v7.view.menu;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.widget.j1;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements h.b, q, AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f۱۶۴۴e = {16842964, 16843049};

    /* renamed from: c  reason: collision with root package name */
    private h f۱۶۴۵c;

    /* renamed from: d  reason: collision with root package name */
    private int f۱۶۴۶d;

    public ExpandedMenuView(Context context, AttributeSet attrs) {
        this(context, attrs, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs);
        setOnItemClickListener(this);
        j1 a2 = j1.a(context, attrs, f۱۶۴۴e, defStyleAttr, 0);
        if (a2.g(0)) {
            setBackgroundDrawable(a2.b(0));
        }
        if (a2.g(1)) {
            setDivider(a2.b(1));
        }
        a2.a();
    }

    @Override // android.support.v7.view.menu.q
    public void a(h menu) {
        this.f۱۶۴۵c = menu;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.support.v7.view.menu.h.b
    public boolean a(k item) {
        return this.f۱۶۴۵c.a(item, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView parent, View v, int position, long id) {
        a((k) getAdapter().getItem(position));
    }

    public int getWindowAnimations() {
        return this.f۱۶۴۶d;
    }
}
