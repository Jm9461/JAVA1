package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.Cg;
import android.support.v7.view.menu.Ch;
import android.support.v7.view.menu.ListMenuItemView;
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

/* renamed from: android.support.v7.widget.r0, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
public class Cr0 extends Cp0 implements InterfaceCq0 {

    /* renamed from: L, reason: contains not printable characters */
    private static Method f۱۲۳۲۴L;

    /* renamed from: K, reason: contains not printable characters */
    private InterfaceCq0 f۱۲۳۲۵K;

    static {
        try {
            f۱۲۳۲۴L = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public Cr0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override // android.support.v7.widget.Cp0
    /* renamed from: a, reason: contains not printable characters */
    Ci0 mo۱۳۴۸۹a(Context context, boolean hijackFocus) {
        a view = new a(context, hijackFocus);
        view.setHoverListener(this);
        return view;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۹۲a(Object enterTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f۱۲۲۷۴G.setEnterTransition((Transition) enterTransition);
        }
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۳۴۹۴b(Object exitTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f۱۲۲۷۴G.setExitTransition((Transition) exitTransition);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۳۴۹۱a(InterfaceCq0 hoverListener) {
        this.f۱۲۳۲۵K = hoverListener;
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۳۴۹۵c(boolean touchModal) {
        Method method = f۱۲۳۲۴L;
        if (method != null) {
            try {
                method.invoke(this.f۱۲۲۷۴G, Boolean.valueOf(touchModal));
            } catch (Exception e2) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // android.support.v7.widget.InterfaceCq0
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۳۴۹۰a(Ch menu, MenuItem item) {
        InterfaceCq0 interfaceCq0 = this.f۱۲۳۲۵K;
        if (interfaceCq0 != null) {
            interfaceCq0.mo۱۳۴۹۰a(menu, item);
        }
    }

    @Override // android.support.v7.widget.InterfaceCq0
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۳۴۹۳b(Ch menu, MenuItem item) {
        InterfaceCq0 interfaceCq0 = this.f۱۲۳۲۵K;
        if (interfaceCq0 != null) {
            interfaceCq0.mo۱۳۴۹۳b(menu, item);
        }
    }

    /* renamed from: android.support.v7.widget.r0$a */
    public static class a extends Ci0 {

        /* renamed from: q, reason: contains not printable characters */
        final int f۱۲۳۲۶q;

        /* renamed from: r, reason: contains not printable characters */
        final int f۱۲۳۲۷r;

        /* renamed from: s, reason: contains not printable characters */
        private InterfaceCq0 f۱۲۳۲۸s;

        /* renamed from: t, reason: contains not printable characters */
        private MenuItem f۱۲۳۲۹t;

        @Override // android.support.v7.widget.Ci0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public a(Context context, boolean hijackFocus) {
            super(context, hijackFocus);
            Resources res = context.getResources();
            Configuration config = res.getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == config.getLayoutDirection()) {
                this.f۱۲۳۲۶q = 21;
                this.f۱۲۳۲۷r = 22;
            } else {
                this.f۱۲۳۲۶q = 22;
                this.f۱۲۳۲۷r = 21;
            }
        }

        public void setHoverListener(InterfaceCq0 hoverListener) {
            this.f۱۲۳۲۸s = hoverListener;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int keyCode, KeyEvent event) {
            ListMenuItemView selectedItem = (ListMenuItemView) getSelectedView();
            if (selectedItem != null && keyCode == this.f۱۲۳۲۶q) {
                if (selectedItem.isEnabled() && selectedItem.getItemData().hasSubMenu()) {
                    performItemClick(selectedItem, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (selectedItem != null && keyCode == this.f۱۲۳۲۷r) {
                setSelection(-1);
                ((Cg) getAdapter()).m۱۱۷۵۷b().m۱۱۷۸۲a(false);
                return true;
            }
            return super.onKeyDown(keyCode, event);
        }

        @Override // android.support.v7.widget.Ci0, android.view.View
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
                    Ch menu = menuAdapter.m۱۱۷۵۷b();
                    if (oldMenuItem != null) {
                        this.f۱۲۳۲۸s.mo۱۳۴۹۳b(menu, oldMenuItem);
                    }
                    this.f۱۲۳۲۹t = menuItem;
                    if (menuItem != null) {
                        this.f۱۲۳۲۸s.mo۱۳۴۹۰a(menu, menuItem);
                    }
                }
            }
            return super.onHoverEvent(ev);
        }
    }
}
