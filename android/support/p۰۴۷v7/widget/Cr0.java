package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p۰۴۷v7.view.menu.Cg;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.r0  reason: invalid class name */
public class Cr0 extends Cp0 implements AbstractCq0 {

    /* renamed from: L  reason: contains not printable characters */
    private static Method f۱۲۳۲۴L;

    /* renamed from: K  reason: contains not printable characters */
    private AbstractCq0 f۱۲۳۲۵K;

    static {
        try {
            f۱۲۳۲۴L = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public Cr0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.p۰۴۷v7.widget.Cp0
    /* renamed from: a  reason: contains not printable characters */
    public Ci0 m۱۵۵۵۹a(Context context, boolean hijackFocus) {
        Ca view = new Ca(context, hijackFocus);
        view.setHoverListener(this);
        return view;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۶۲a(Object enterTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f۱۲۲۷۴G.setEnterTransition((Transition) enterTransition);
        }
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۵۶۴b(Object exitTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f۱۲۲۷۴G.setExitTransition((Transition) exitTransition);
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۶۱a(AbstractCq0 hoverListener) {
        this.f۱۲۳۲۵K = hoverListener;
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۵۶۵c(boolean touchModal) {
        Method method = f۱۲۳۲۴L;
        if (method != null) {
            try {
                method.invoke(this.f۱۲۲۷۴G, Boolean.valueOf(touchModal));
            } catch (Exception e) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCq0
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۵۶۰a(Ch menu, MenuItem item) {
        AbstractCq0 q0Var = this.f۱۲۳۲۵K;
        if (q0Var != null) {
            q0Var.m۱۵۵۲۸a(menu, item);
        }
    }

    @Override // android.support.p۰۴۷v7.widget.AbstractCq0
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۵۶۳b(Ch menu, MenuItem item) {
        AbstractCq0 q0Var = this.f۱۲۳۲۵K;
        if (q0Var != null) {
            q0Var.m۱۵۵۲۹b(menu, item);
        }
    }

    /* renamed from: android.support.v7.widget.r0$a  reason: invalid class name */
    public static class Ca extends Ci0 {

        /* renamed from: q  reason: contains not printable characters */
        final int f۱۲۳۲۶q;

        /* renamed from: r  reason: contains not printable characters */
        final int f۱۲۳۲۷r;

        /* renamed from: s  reason: contains not printable characters */
        private AbstractCq0 f۱۲۳۲۸s;

        /* renamed from: t  reason: contains not printable characters */
        private MenuItem f۱۲۳۲۹t;

        @Override // android.widget.AbsListView, android.support.p۰۴۷v7.widget.Ci0
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public Ca(Context context, boolean hijackFocus) {
            super(context, hijackFocus);
            Configuration config = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != config.getLayoutDirection()) {
                this.f۱۲۳۲۶q = 22;
                this.f۱۲۳۲۷r = 21;
                return;
            }
            this.f۱۲۳۲۶q = 21;
            this.f۱۲۳۲۷r = 22;
        }

        public void setHoverListener(AbstractCq0 hoverListener) {
            this.f۱۲۳۲۸s = hoverListener;
        }

        public boolean onKeyDown(int keyCode, KeyEvent event) {
            ListMenuItemView selectedItem = (ListMenuItemView) getSelectedView();
            if (selectedItem != null && keyCode == this.f۱۲۳۲۶q) {
                if (selectedItem.isEnabled() && selectedItem.getItemData().hasSubMenu()) {
                    performItemClick(selectedItem, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (selectedItem == null || keyCode != this.f۱۲۳۲۷r) {
                return super.onKeyDown(keyCode, event);
            } else {
                setSelection(-1);
                ((Cg) getAdapter()).m۱۳۸۲۷b().m۱۳۸۵۲a(false);
                return true;
            }
        }

        /* JADX INFO: Multiple debug info for r4v1 android.view.MenuItem: [D('position' int), D('oldMenuItem' android.view.MenuItem)] */
        @Override // android.support.p۰۴۷v7.widget.Ci0
        public boolean onHoverEvent(MotionEvent ev) {
            int headersCount;
            Cg menuAdapter;
            int position;
            int itemPosition;
            if (this.f۱۲۳۲۸s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerAdapter.getHeadersCount();
                    menuAdapter = (Cg) headerAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    menuAdapter = (Cg) adapter;
                }
                MenuItem menuItem = null;
                if (ev.getAction() != 10 && (position = pointToPosition((int) ev.getX(), (int) ev.getY())) != -1 && (itemPosition = position - headersCount) >= 0 && itemPosition < menuAdapter.getCount()) {
                    menuItem = menuAdapter.getItem(itemPosition);
                }
                MenuItem oldMenuItem = this.f۱۲۳۲۹t;
                if (oldMenuItem != menuItem) {
                    Ch menu = menuAdapter.m۱۳۸۲۷b();
                    if (oldMenuItem != null) {
                        this.f۱۲۳۲۸s.m۱۵۵۲۹b(menu, oldMenuItem);
                    }
                    this.f۱۲۳۲۹t = menuItem;
                    if (menuItem != null) {
                        this.f۱۲۳۲۸s.m۱۵۵۲۸a(menu, menuItem);
                    }
                }
            }
            return super.onHoverEvent(ev);
        }
    }
}
