package android.support.v7.view.menu;

import a.b.h.a.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.u;
import android.support.v7.view.menu.p;
import android.support.v7.widget.q0;
import android.support.v7.widget.r0;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

final class e extends n implements p, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int D = g.abc_cascading_menu_item_layout;
    ViewTreeObserver A;
    private PopupWindow.OnDismissListener B;
    boolean C;

    /* renamed from: d  reason: collision with root package name */
    private final Context f۱۶۷۱d;

    /* renamed from: e  reason: collision with root package name */
    private final int f۱۶۷۲e;

    /* renamed from: f  reason: collision with root package name */
    private final int f۱۶۷۳f;

    /* renamed from: g  reason: collision with root package name */
    private final int f۱۶۷۴g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f۱۶۷۵h;
    final Handler i;
    private final List<h> j = new ArrayList();
    final List<d> k = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener l = new a();
    private final View.OnAttachStateChangeListener m = new b();
    private final q0 n = new c();
    private int o = 0;
    private int p = 0;
    private View q;
    View r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private p.a z;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (e.this.e() && e.this.k.size() > 0 && !e.this.k.get(0).f۱۶۸۳a.k()) {
                View anchor = e.this.r;
                if (anchor == null || !anchor.isShown()) {
                    e.this.dismiss();
                    return;
                }
                for (d info2 : e.this.k) {
                    info2.f۱۶۸۳a.d();
                }
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = e.this.A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    e.this.A = v.getViewTreeObserver();
                }
                e eVar = e.this;
                eVar.A.removeGlobalOnLayoutListener(eVar.l);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements q0 {
        c() {
        }

        @Override // android.support.v7.widget.q0
        public void b(h menu, MenuItem item) {
            e.this.i.removeCallbacksAndMessages(menu);
        }

        @Override // android.support.v7.widget.q0
        public void a(h menu, MenuItem item) {
            d nextInfo;
            e.this.i.removeCallbacksAndMessages(null);
            int menuIndex = -1;
            int i = 0;
            int count = e.this.k.size();
            while (true) {
                if (i >= count) {
                    break;
                } else if (menu == e.this.k.get(i).f۱۶۸۴b) {
                    menuIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            if (menuIndex != -1) {
                int nextIndex = menuIndex + 1;
                if (nextIndex < e.this.k.size()) {
                    nextInfo = e.this.k.get(nextIndex);
                } else {
                    nextInfo = null;
                }
                e.this.i.postAtTime(new a(nextInfo, item, menu), menu, SystemClock.uptimeMillis() + 200);
            }
        }

        class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ d f۱۶۷۹c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ MenuItem f۱۶۸۰d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ h f۱۶۸۱e;

            a(d dVar, MenuItem menuItem, h hVar) {
                this.f۱۶۷۹c = dVar;
                this.f۱۶۸۰d = menuItem;
                this.f۱۶۸۱e = hVar;
            }

            public void run() {
                d dVar = this.f۱۶۷۹c;
                if (dVar != null) {
                    e.this.C = true;
                    dVar.f۱۶۸۴b.a(false);
                    e.this.C = false;
                }
                if (this.f۱۶۸۰d.isEnabled() && this.f۱۶۸۰d.hasSubMenu()) {
                    this.f۱۶۸۱e.a(this.f۱۶۸۰d, 4);
                }
            }
        }
    }

    public e(Context context, View anchor, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f۱۶۷۱d = context;
        this.q = anchor;
        this.f۱۶۷۳f = popupStyleAttr;
        this.f۱۶۷۴g = popupStyleRes;
        this.f۱۶۷۵h = overflowOnly;
        this.x = false;
        this.s = j();
        Resources res = context.getResources();
        this.f۱۶۷۲e = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(a.b.h.a.d.abc_config_prefDialogWidth));
        this.i = new Handler();
    }

    @Override // android.support.v7.view.menu.n
    public void b(boolean forceShow) {
        this.x = forceShow;
    }

    private r0 i() {
        r0 popupWindow = new r0(this.f۱۶۷۱d, null, this.f۱۶۷۳f, this.f۱۶۷۴g);
        popupWindow.a(this.n);
        popupWindow.a((AdapterView.OnItemClickListener) this);
        popupWindow.a((PopupWindow.OnDismissListener) this);
        popupWindow.a(this.q);
        popupWindow.c(this.p);
        popupWindow.a(true);
        popupWindow.e(2);
        return popupWindow;
    }

    @Override // android.support.v7.view.menu.t
    public void d() {
        if (!e()) {
            for (h menu : this.j) {
                d(menu);
            }
            this.j.clear();
            this.r = this.q;
            if (this.r != null) {
                boolean addGlobalListener = this.A == null;
                this.A = this.r.getViewTreeObserver();
                if (addGlobalListener) {
                    this.A.addOnGlobalLayoutListener(this.l);
                }
                this.r.addOnAttachStateChangeListener(this.m);
            }
        }
    }

    @Override // android.support.v7.view.menu.t
    public void dismiss() {
        int length = this.k.size();
        if (length > 0) {
            d[] addedMenus = (d[]) this.k.toArray(new d[length]);
            for (int i2 = length - 1; i2 >= 0; i2--) {
                d info2 = addedMenus[i2];
                if (info2.f۱۶۸۳a.e()) {
                    info2.f۱۶۸۳a.dismiss();
                }
            }
        }
    }

    public boolean onKey(View v2, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    private int j() {
        return u.k(this.q) == 1 ? 0 : 1;
    }

    private int d(int nextMenuWidth) {
        List<d> list = this.k;
        ListView lastListView = list.get(list.size() - 1).a();
        int[] screenLocation = new int[2];
        lastListView.getLocationOnScreen(screenLocation);
        Rect displayFrame = new Rect();
        this.r.getWindowVisibleDisplayFrame(displayFrame);
        if (this.s == 1) {
            if (screenLocation[0] + lastListView.getWidth() + nextMenuWidth > displayFrame.right) {
                return 0;
            }
            return 1;
        } else if (screenLocation[0] - nextMenuWidth < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // android.support.v7.view.menu.n
    public void a(h menu) {
        menu.a(this, this.f۱۶۷۱d);
        if (e()) {
            d(menu);
        } else {
            this.j.add(menu);
        }
    }

    private void d(h menu) {
        View parentView;
        d parentInfo;
        int parentOffsetY;
        int parentOffsetX;
        int x2;
        LayoutInflater inflater = LayoutInflater.from(this.f۱۶۷۱d);
        g adapter = new g(menu, inflater, this.f۱۶۷۵h, D);
        if (!e() && this.x) {
            adapter.a(true);
        } else if (e()) {
            adapter.a(n.b(menu));
        }
        int menuWidth = n.a(adapter, null, this.f۱۶۷۱d, this.f۱۶۷۲e);
        r0 popupWindow = i();
        popupWindow.a((ListAdapter) adapter);
        popupWindow.b(menuWidth);
        popupWindow.c(this.p);
        if (this.k.size() > 0) {
            List<d> list = this.k;
            parentInfo = list.get(list.size() - 1);
            parentView = a(parentInfo, menu);
        } else {
            parentInfo = null;
            parentView = null;
        }
        if (parentView != null) {
            popupWindow.c(false);
            popupWindow.a((Object) null);
            int nextMenuPosition = d(menuWidth);
            boolean showOnRight = nextMenuPosition == 1;
            this.s = nextMenuPosition;
            if (Build.VERSION.SDK_INT >= 26) {
                popupWindow.a(parentView);
                parentOffsetX = 0;
                parentOffsetY = 0;
            } else {
                int[] anchorScreenLocation = new int[2];
                this.q.getLocationOnScreen(anchorScreenLocation);
                int[] parentViewScreenLocation = new int[2];
                parentView.getLocationOnScreen(parentViewScreenLocation);
                if ((this.p & 7) == 5) {
                    anchorScreenLocation[0] = anchorScreenLocation[0] + this.q.getWidth();
                    parentViewScreenLocation[0] = parentViewScreenLocation[0] + parentView.getWidth();
                }
                parentOffsetX = parentViewScreenLocation[0] - anchorScreenLocation[0];
                parentOffsetY = parentViewScreenLocation[1] - anchorScreenLocation[1];
            }
            if ((this.p & 5) == 5) {
                if (showOnRight) {
                    x2 = parentOffsetX + menuWidth;
                } else {
                    x2 = parentOffsetX - parentView.getWidth();
                }
            } else if (showOnRight) {
                x2 = parentView.getWidth() + parentOffsetX;
            } else {
                x2 = parentOffsetX - menuWidth;
            }
            popupWindow.d(x2);
            popupWindow.b(true);
            popupWindow.h(parentOffsetY);
        } else {
            if (this.t) {
                popupWindow.d(this.v);
            }
            if (this.u) {
                popupWindow.h(this.w);
            }
            popupWindow.a(h());
        }
        this.k.add(new d(popupWindow, menu, this.s));
        popupWindow.d();
        ListView listView = popupWindow.f();
        listView.setOnKeyListener(this);
        if (parentInfo == null && this.y && menu.h() != null) {
            FrameLayout titleItemView = (FrameLayout) inflater.inflate(g.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            titleItemView.setEnabled(false);
            ((TextView) titleItemView.findViewById(16908310)).setText(menu.h());
            listView.addHeaderView(titleItemView, null, false);
            popupWindow.d();
        }
    }

    private MenuItem a(h parent, h submenu) {
        int count = parent.size();
        for (int i2 = 0; i2 < count; i2++) {
            MenuItem item = parent.getItem(i2);
            if (item.hasSubMenu() && submenu == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View a(d parentInfo, h submenu) {
        int headersCount;
        g menuAdapter;
        int ownerViewPosition;
        MenuItem owner = a(parentInfo.f۱۶۸۴b, submenu);
        if (owner == null) {
            return null;
        }
        ListView listView = parentInfo.a();
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) listAdapter;
            headersCount = headerAdapter.getHeadersCount();
            menuAdapter = (g) headerAdapter.getWrappedAdapter();
        } else {
            headersCount = 0;
            menuAdapter = (g) listAdapter;
        }
        int ownerPosition = -1;
        int i2 = 0;
        int count = menuAdapter.getCount();
        while (true) {
            if (i2 >= count) {
                break;
            } else if (owner == menuAdapter.getItem(i2)) {
                ownerPosition = i2;
                break;
            } else {
                i2++;
            }
        }
        if (ownerPosition != -1 && (ownerViewPosition = (ownerPosition + headersCount) - listView.getFirstVisiblePosition()) >= 0 && ownerViewPosition < listView.getChildCount()) {
            return listView.getChildAt(ownerViewPosition);
        }
        return null;
    }

    @Override // android.support.v7.view.menu.t
    public boolean e() {
        return this.k.size() > 0 && this.k.get(0).f۱۶۸۳a.e();
    }

    public void onDismiss() {
        d dismissedInfo = null;
        int i2 = 0;
        int count = this.k.size();
        while (true) {
            if (i2 >= count) {
                break;
            }
            d info2 = this.k.get(i2);
            if (!info2.f۱۶۸۳a.e()) {
                dismissedInfo = info2;
                break;
            }
            i2++;
        }
        if (dismissedInfo != null) {
            dismissedInfo.f۱۶۸۴b.a(false);
        }
    }

    @Override // android.support.v7.view.menu.p
    public void a(boolean cleared) {
        for (d info2 : this.k) {
            n.a(info2.a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.p
    public void a(p.a cb) {
        this.z = cb;
    }

    @Override // android.support.v7.view.menu.p
    public boolean a(v subMenu) {
        for (d info2 : this.k) {
            if (subMenu == info2.f۱۶۸۴b) {
                info2.a().requestFocus();
                return true;
            }
        }
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        a((h) subMenu);
        p.a aVar = this.z;
        if (aVar != null) {
            aVar.a(subMenu);
        }
        return true;
    }

    private int c(h menu) {
        int count = this.k.size();
        for (int i2 = 0; i2 < count; i2++) {
            if (menu == this.k.get(i2).f۱۶۸۴b) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.support.v7.view.menu.p
    public void a(h menu, boolean allMenusAreClosing) {
        int menuIndex = c(menu);
        if (menuIndex >= 0) {
            int nextMenuIndex = menuIndex + 1;
            if (nextMenuIndex < this.k.size()) {
                this.k.get(nextMenuIndex).f۱۶۸۴b.a(false);
            }
            d info2 = this.k.remove(menuIndex);
            info2.f۱۶۸۴b.b(this);
            if (this.C) {
                info2.f۱۶۸۳a.b((Object) null);
                info2.f۱۶۸۳a.a(0);
            }
            info2.f۱۶۸۳a.dismiss();
            int count = this.k.size();
            if (count > 0) {
                this.s = this.k.get(count - 1).f۱۶۸۵c;
            } else {
                this.s = j();
            }
            if (count == 0) {
                dismiss();
                p.a aVar = this.z;
                if (aVar != null) {
                    aVar.a(menu, true);
                }
                ViewTreeObserver viewTreeObserver = this.A;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.A.removeGlobalOnLayoutListener(this.l);
                    }
                    this.A = null;
                }
                this.r.removeOnAttachStateChangeListener(this.m);
                this.B.onDismiss();
            } else if (allMenusAreClosing) {
                this.k.get(0).f۱۶۸۴b.a(false);
            }
        }
    }

    @Override // android.support.v7.view.menu.p
    public boolean b() {
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public Parcelable c() {
        return null;
    }

    @Override // android.support.v7.view.menu.p
    public void a(Parcelable state) {
    }

    @Override // android.support.v7.view.menu.n
    public void a(int dropDownGravity) {
        if (this.o != dropDownGravity) {
            this.o = dropDownGravity;
            this.p = android.support.v4.view.d.a(dropDownGravity, u.k(this.q));
        }
    }

    @Override // android.support.v7.view.menu.n
    public void a(View anchor) {
        if (this.q != anchor) {
            this.q = anchor;
            this.p = android.support.v4.view.d.a(this.o, u.k(this.q));
        }
    }

    @Override // android.support.v7.view.menu.n
    public void a(PopupWindow.OnDismissListener listener) {
        this.B = listener;
    }

    @Override // android.support.v7.view.menu.t
    public ListView f() {
        if (this.k.isEmpty()) {
            return null;
        }
        List<d> list = this.k;
        return list.get(list.size() - 1).a();
    }

    @Override // android.support.v7.view.menu.n
    public void b(int x2) {
        this.t = true;
        this.v = x2;
    }

    @Override // android.support.v7.view.menu.n
    public void c(int y2) {
        this.u = true;
        this.w = y2;
    }

    @Override // android.support.v7.view.menu.n
    public void c(boolean showTitle) {
        this.y = showTitle;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.v7.view.menu.n
    public boolean g() {
        return false;
    }

    /* access modifiers changed from: private */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final r0 f۱۶۸۳a;

        /* renamed from: b  reason: collision with root package name */
        public final h f۱۶۸۴b;

        /* renamed from: c  reason: collision with root package name */
        public final int f۱۶۸۵c;

        public d(r0 window, h menu, int position) {
            this.f۱۶۸۳a = window;
            this.f۱۶۸۴b = menu;
            this.f۱۶۸۵c = position;
        }

        public ListView a() {
            return this.f۱۶۸۳a.f();
        }
    }
}
