package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.h;
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

public class r0 extends p0 implements q0 {
    private static Method L;
    private q0 K;

    static {
        try {
            L = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public r0(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /* access modifiers changed from: package-private */
    @Override // android.support.v7.widget.p0
    public i0 a(Context context, boolean hijackFocus) {
        a view = new a(context, hijackFocus);
        view.setHoverListener(this);
        return view;
    }

    public void a(Object enterTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.G.setEnterTransition((Transition) enterTransition);
        }
    }

    public void b(Object exitTransition) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.G.setExitTransition((Transition) exitTransition);
        }
    }

    public void a(q0 hoverListener) {
        this.K = hoverListener;
    }

    public void c(boolean touchModal) {
        Method method = L;
        if (method != null) {
            try {
                method.invoke(this.G, Boolean.valueOf(touchModal));
            } catch (Exception e2) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // android.support.v7.widget.q0
    public void a(h menu, MenuItem item) {
        q0 q0Var = this.K;
        if (q0Var != null) {
            q0Var.a(menu, item);
        }
    }

    @Override // android.support.v7.widget.q0
    public void b(h menu, MenuItem item) {
        q0 q0Var = this.K;
        if (q0Var != null) {
            q0Var.b(menu, item);
        }
    }

    public static class a extends i0 {
        final int q;
        final int r;
        private q0 s;
        private MenuItem t;

        @Override // android.widget.AbsListView, android.support.v7.widget.i0
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public a(Context context, boolean hijackFocus) {
            super(context, hijackFocus);
            Configuration config = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != config.getLayoutDirection()) {
                this.q = 22;
                this.r = 21;
                return;
            }
            this.q = 21;
            this.r = 22;
        }

        public void setHoverListener(q0 hoverListener) {
            this.s = hoverListener;
        }

        public boolean onKeyDown(int keyCode, KeyEvent event) {
            ListMenuItemView selectedItem = (ListMenuItemView) getSelectedView();
            if (selectedItem != null && keyCode == this.q) {
                if (selectedItem.isEnabled() && selectedItem.getItemData().hasSubMenu()) {
                    performItemClick(selectedItem, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (selectedItem == null || keyCode != this.r) {
                return super.onKeyDown(keyCode, event);
            } else {
                setSelection(-1);
                ((g) getAdapter()).b().a(false);
                return true;
            }
        }

        /* JADX INFO: Multiple debug info for r4v1 android.view.MenuItem: [D('position' int), D('oldMenuItem' android.view.MenuItem)] */
        @Override // android.support.v7.widget.i0
        public boolean onHoverEvent(MotionEvent ev) {
            int headersCount;
            g menuAdapter;
            int position;
            int itemPosition;
            if (this.s != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerAdapter.getHeadersCount();
                    menuAdapter = (g) headerAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    menuAdapter = (g) adapter;
                }
                MenuItem menuItem = null;
                if (ev.getAction() != 10 && (position = pointToPosition((int) ev.getX(), (int) ev.getY())) != -1 && (itemPosition = position - headersCount) >= 0 && itemPosition < menuAdapter.getCount()) {
                    menuItem = menuAdapter.getItem(itemPosition);
                }
                MenuItem oldMenuItem = this.t;
                if (oldMenuItem != menuItem) {
                    h menu = menuAdapter.b();
                    if (oldMenuItem != null) {
                        this.s.b(menu, oldMenuItem);
                    }
                    this.t = menuItem;
                    if (menuItem != null) {
                        this.s.a(menu, menuItem);
                    }
                }
            }
            return super.onHoverEvent(ev);
        }
    }
}
