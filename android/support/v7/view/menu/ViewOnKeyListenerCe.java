package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.Cu;
import android.support.v7.view.menu.InterfaceCp;
import android.support.v7.widget.Cr0;
import android.support.v7.widget.InterfaceCq0;
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
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cd;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg;

/* renamed from: android.support.v7.view.menu.e, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class ViewOnKeyListenerCe extends AbstractCn implements InterfaceCp, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: D, reason: contains not printable characters */
    private static final int f۱۱۲۰۷D = Cg.abc_cascading_menu_item_layout;

    /* renamed from: A, reason: contains not printable characters */
    ViewTreeObserver f۱۱۲۰۸A;

    /* renamed from: B, reason: contains not printable characters */
    private PopupWindow.OnDismissListener f۱۱۲۰۹B;

    /* renamed from: C, reason: contains not printable characters */
    boolean f۱۱۲۱۰C;

    /* renamed from: d, reason: contains not printable characters */
    private final Context f۱۱۲۱۱d;

    /* renamed from: e, reason: contains not printable characters */
    private final int f۱۱۲۱۲e;

    /* renamed from: f, reason: contains not printable characters */
    private final int f۱۱۲۱۳f;

    /* renamed from: g, reason: contains not printable characters */
    private final int f۱۱۲۱۴g;

    /* renamed from: h, reason: contains not printable characters */
    private final boolean f۱۱۲۱۵h;

    /* renamed from: i, reason: contains not printable characters */
    final Handler f۱۱۲۱۶i;

    /* renamed from: q, reason: contains not printable characters */
    private View f۱۱۲۲۴q;

    /* renamed from: r, reason: contains not printable characters */
    View f۱۱۲۲۵r;

    /* renamed from: t, reason: contains not printable characters */
    private boolean f۱۱۲۲۷t;

    /* renamed from: u, reason: contains not printable characters */
    private boolean f۱۱۲۲۸u;

    /* renamed from: v, reason: contains not printable characters */
    private int f۱۱۲۲۹v;

    /* renamed from: w, reason: contains not printable characters */
    private int f۱۱۲۳۰w;

    /* renamed from: y, reason: contains not printable characters */
    private boolean f۱۱۲۳۲y;

    /* renamed from: z, reason: contains not printable characters */
    private InterfaceCp.a f۱۱۲۳۳z;

    /* renamed from: j, reason: contains not printable characters */
    private final List<Ch> f۱۱۲۱۷j = new ArrayList();

    /* renamed from: k, reason: contains not printable characters */
    final List<d> f۱۱۲۱۸k = new ArrayList();

    /* renamed from: l, reason: contains not printable characters */
    final ViewTreeObserver.OnGlobalLayoutListener f۱۱۲۱۹l = new a();

    /* renamed from: m, reason: contains not printable characters */
    private final View.OnAttachStateChangeListener f۱۱۲۲۰m = new b();

    /* renamed from: n, reason: contains not printable characters */
    private final InterfaceCq0 f۱۱۲۲۱n = new c();

    /* renamed from: o, reason: contains not printable characters */
    private int f۱۱۲۲۲o = 0;

    /* renamed from: p, reason: contains not printable characters */
    private int f۱۱۲۲۳p = 0;

    /* renamed from: x, reason: contains not printable characters */
    private boolean f۱۱۲۳۱x = false;

    /* renamed from: s, reason: contains not printable characters */
    private int f۱۱۲۲۶s = m۱۱۷۱۶j();

    /* renamed from: android.support.v7.view.menu.e$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewOnKeyListenerCe.this.mo۱۳۴۳۳e() && ViewOnKeyListenerCe.this.f۱۱۲۱۸k.size() > 0 && !ViewOnKeyListenerCe.this.f۱۱۲۱۸k.get(0).f۱۱۲۴۱a.m۱۳۴۴۳k()) {
                View anchor = ViewOnKeyListenerCe.this.f۱۱۲۲۵r;
                if (anchor == null || !anchor.isShown()) {
                    ViewOnKeyListenerCe.this.dismiss();
                    return;
                }
                for (d info2 : ViewOnKeyListenerCe.this.f۱۱۲۱۸k) {
                    info2.f۱۱۲۴۱a.mo۱۳۵۷۵d();
                }
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.e$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerCe.this.f۱۱۲۰۸A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerCe.this.f۱۱۲۰۸A = v.getViewTreeObserver();
                }
                ViewOnKeyListenerCe viewOnKeyListenerCe = ViewOnKeyListenerCe.this;
                viewOnKeyListenerCe.f۱۱۲۰۸A.removeGlobalOnLayoutListener(viewOnKeyListenerCe.f۱۱۲۱۹l);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: android.support.v7.view.menu.e$c */
    class c implements InterfaceCq0 {
        c() {
        }

        @Override // android.support.v7.widget.InterfaceCq0
        /* renamed from: b, reason: contains not printable characters */
        public void mo۱۳۴۹۳b(Ch menu, MenuItem item) {
            ViewOnKeyListenerCe.this.f۱۱۲۱۶i.removeCallbacksAndMessages(menu);
        }

        @Override // android.support.v7.widget.InterfaceCq0
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۳۴۹۰a(Ch menu, MenuItem item) {
            d nextInfo;
            ViewOnKeyListenerCe.this.f۱۱۲۱۶i.removeCallbacksAndMessages(null);
            int menuIndex = -1;
            int i = 0;
            int count = ViewOnKeyListenerCe.this.f۱۱۲۱۸k.size();
            while (true) {
                if (i >= count) {
                    break;
                }
                if (menu != ViewOnKeyListenerCe.this.f۱۱۲۱۸k.get(i).f۱۱۲۴۲b) {
                    i++;
                } else {
                    menuIndex = i;
                    break;
                }
            }
            if (menuIndex == -1) {
                return;
            }
            int nextIndex = menuIndex + 1;
            if (nextIndex < ViewOnKeyListenerCe.this.f۱۱۲۱۸k.size()) {
                nextInfo = ViewOnKeyListenerCe.this.f۱۱۲۱۸k.get(nextIndex);
            } else {
                nextInfo = null;
            }
            Runnable runnable = new a(nextInfo, item, menu);
            long uptimeMillis = SystemClock.uptimeMillis() + 200;
            ViewOnKeyListenerCe.this.f۱۱۲۱۶i.postAtTime(runnable, menu, uptimeMillis);
        }

        /* renamed from: android.support.v7.view.menu.e$c$a */
        class a implements Runnable {

            /* renamed from: c, reason: contains not printable characters */
            final /* synthetic */ d f۱۱۲۳۷c;

            /* renamed from: d, reason: contains not printable characters */
            final /* synthetic */ MenuItem f۱۱۲۳۸d;

            /* renamed from: e, reason: contains not printable characters */
            final /* synthetic */ Ch f۱۱۲۳۹e;

            a(d dVar, MenuItem menuItem, Ch ch) {
                this.f۱۱۲۳۷c = dVar;
                this.f۱۱۲۳۸d = menuItem;
                this.f۱۱۲۳۹e = ch;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f۱۱۲۳۷c;
                if (dVar != null) {
                    ViewOnKeyListenerCe.this.f۱۱۲۱۰C = true;
                    dVar.f۱۱۲۴۲b.m۱۱۷۸۲a(false);
                    ViewOnKeyListenerCe.this.f۱۱۲۱۰C = false;
                }
                if (this.f۱۱۲۳۸d.isEnabled() && this.f۱۱۲۳۸d.hasSubMenu()) {
                    this.f۱۱۲۳۹e.m۱۱۷۸۵a(this.f۱۱۲۳۸d, 4);
                }
            }
        }
    }

    public ViewOnKeyListenerCe(Context context, View anchor, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f۱۱۲۱۱d = context;
        this.f۱۱۲۲۴q = anchor;
        this.f۱۱۲۱۳f = popupStyleAttr;
        this.f۱۱۲۱۴g = popupStyleRes;
        this.f۱۱۲۱۵h = overflowOnly;
        Resources res = context.getResources();
        this.f۱۱۲۱۲e = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(Cd.abc_config_prefDialogWidth));
        this.f۱۱۲۱۶i = new Handler();
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۹۲۹b(boolean forceShow) {
        this.f۱۱۲۳۱x = forceShow;
    }

    /* renamed from: i, reason: contains not printable characters */
    private Cr0 m۱۱۷۱۵i() {
        Cr0 popupWindow = new Cr0(this.f۱۱۲۱۱d, null, this.f۱۱۲۱۳f, this.f۱۱۲۱۴g);
        popupWindow.m۱۳۴۹۱a(this.f۱۱۲۲۱n);
        popupWindow.m۱۳۴۲۱a((AdapterView.OnItemClickListener) this);
        popupWindow.m۱۳۴۲۳a((PopupWindow.OnDismissListener) this);
        popupWindow.m۱۳۴۲۰a(this.f۱۱۲۲۴q);
        popupWindow.m۱۳۴۲۹c(this.f۱۱۲۲۳p);
        popupWindow.m۱۳۴۲۴a(true);
        popupWindow.m۱۳۴۳۲e(2);
        return popupWindow;
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۳۵۷۵d() {
        if (mo۱۳۴۳۳e()) {
            return;
        }
        for (Ch menu : this.f۱۱۲۱۷j) {
            m۱۱۷۱۴d(menu);
        }
        this.f۱۱۲۱۷j.clear();
        this.f۱۱۲۲۵r = this.f۱۱۲۲۴q;
        if (this.f۱۱۲۲۵r != null) {
            boolean addGlobalListener = this.f۱۱۲۰۸A == null;
            this.f۱۱۲۰۸A = this.f۱۱۲۲۵r.getViewTreeObserver();
            if (addGlobalListener) {
                this.f۱۱۲۰۸A.addOnGlobalLayoutListener(this.f۱۱۲۱۹l);
            }
            this.f۱۱۲۲۵r.addOnAttachStateChangeListener(this.f۱۱۲۲۰m);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    public void dismiss() {
        int length = this.f۱۱۲۱۸k.size();
        if (length > 0) {
            d[] addedMenus = (d[]) this.f۱۱۲۱۸k.toArray(new d[length]);
            for (int i = length - 1; i >= 0; i--) {
                d info2 = addedMenus[i];
                if (info2.f۱۱۲۴۱a.mo۱۳۴۳۳e()) {
                    info2.f۱۱۲۴۱a.dismiss();
                }
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == 1 && keyCode == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    /* renamed from: j, reason: contains not printable characters */
    private int m۱۱۷۱۶j() {
        int layoutDirection = Cu.m۱۰۹۴۴k(this.f۱۱۲۲۴q);
        return layoutDirection == 1 ? 0 : 1;
    }

    /* renamed from: d, reason: contains not printable characters */
    private int m۱۱۷۱۳d(int nextMenuWidth) {
        List<d> list = this.f۱۱۲۱۸k;
        ListView lastListView = list.get(list.size() - 1).m۱۱۷۳۸a();
        int[] screenLocation = new int[2];
        lastListView.getLocationOnScreen(screenLocation);
        Rect displayFrame = new Rect();
        this.f۱۱۲۲۵r.getWindowVisibleDisplayFrame(displayFrame);
        if (this.f۱۱۲۲۶s == 1) {
            int right = screenLocation[0] + lastListView.getWidth() + nextMenuWidth;
            return right > displayFrame.right ? 0 : 1;
        }
        int right2 = screenLocation[0];
        int left = right2 - nextMenuWidth;
        return left < 0 ? 1 : 0;
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۲۱a(Ch menu) {
        menu.m۱۱۷۷۹a(this, this.f۱۱۲۱۱d);
        if (mo۱۳۴۳۳e()) {
            m۱۱۷۱۴d(menu);
        } else {
            this.f۱۱۲۱۷j.add(menu);
        }
    }

    /* renamed from: d, reason: contains not printable characters */
    private void m۱۱۷۱۴d(Ch menu) {
        d parentInfo;
        View parentView;
        int parentOffsetX;
        int parentOffsetY;
        int x;
        LayoutInflater from = LayoutInflater.from(this.f۱۱۲۱۱d);
        Cg adapter = new Cg(menu, from, this.f۱۱۲۱۵h, f۱۱۲۰۷D);
        if (!mo۱۳۴۳۳e() && this.f۱۱۲۳۱x) {
            adapter.m۱۱۷۵۶a(true);
        } else if (mo۱۳۴۳۳e()) {
            adapter.m۱۱۷۵۶a(AbstractCn.m۱۱۸۶۶b(menu));
        }
        int menuWidth = AbstractCn.m۱۱۸۶۴a(adapter, null, this.f۱۱۲۱۱d, this.f۱۱۲۱۲e);
        Cr0 popupWindow = m۱۱۷۱۵i();
        popupWindow.mo۱۳۵۷۲a((ListAdapter) adapter);
        popupWindow.m۱۳۴۲۶b(menuWidth);
        popupWindow.m۱۳۴۲۹c(this.f۱۱۲۲۳p);
        if (this.f۱۱۲۱۸k.size() > 0) {
            List<d> list = this.f۱۱۲۱۸k;
            parentInfo = list.get(list.size() - 1);
            parentView = m۱۱۷۱۱a(parentInfo, menu);
        } else {
            parentInfo = null;
            parentView = null;
        }
        if (parentView != null) {
            popupWindow.m۱۳۴۹۵c(false);
            popupWindow.m۱۳۴۹۲a((Object) null);
            int nextMenuPosition = m۱۱۷۱۳d(menuWidth);
            boolean showOnRight = nextMenuPosition == 1;
            this.f۱۱۲۲۶s = nextMenuPosition;
            if (Build.VERSION.SDK_INT >= 26) {
                popupWindow.m۱۳۴۲۰a(parentView);
                parentOffsetX = 0;
                parentOffsetY = 0;
            } else {
                int[] anchorScreenLocation = new int[2];
                this.f۱۱۲۲۴q.getLocationOnScreen(anchorScreenLocation);
                int[] parentViewScreenLocation = new int[2];
                parentView.getLocationOnScreen(parentViewScreenLocation);
                if ((this.f۱۱۲۲۳p & 7) == 5) {
                    anchorScreenLocation[0] = anchorScreenLocation[0] + this.f۱۱۲۲۴q.getWidth();
                    parentViewScreenLocation[0] = parentViewScreenLocation[0] + parentView.getWidth();
                }
                parentOffsetX = parentViewScreenLocation[0] - anchorScreenLocation[0];
                parentOffsetY = parentViewScreenLocation[1] - anchorScreenLocation[1];
            }
            if ((this.f۱۱۲۲۳p & 5) == 5) {
                if (showOnRight) {
                    x = parentOffsetX + menuWidth;
                } else {
                    int x2 = parentView.getWidth();
                    x = parentOffsetX - x2;
                }
            } else if (showOnRight) {
                x = parentView.getWidth() + parentOffsetX;
            } else {
                x = parentOffsetX - menuWidth;
            }
            popupWindow.m۱۳۴۳۱d(x);
            popupWindow.m۱۳۴۲۷b(true);
            popupWindow.m۱۳۴۳۹h(parentOffsetY);
        } else {
            if (this.f۱۱۲۲۷t) {
                popupWindow.m۱۳۴۳۱d(this.f۱۱۲۲۹v);
            }
            if (this.f۱۱۲۲۸u) {
                popupWindow.m۱۳۴۳۹h(this.f۱۱۲۳۰w);
            }
            Rect epicenterBounds = m۱۱۸۸۱h();
            popupWindow.m۱۳۴۱۸a(epicenterBounds);
        }
        d menuInfo = new d(popupWindow, menu, this.f۱۱۲۲۶s);
        this.f۱۱۲۱۸k.add(menuInfo);
        popupWindow.mo۱۳۵۷۵d();
        ListView listView = popupWindow.mo۱۳۴۳۴f();
        listView.setOnKeyListener(this);
        if (parentInfo == null && this.f۱۱۲۳۲y && menu.m۱۱۸۰۶h() != null) {
            FrameLayout titleItemView = (FrameLayout) from.inflate(Cg.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView titleView = (TextView) titleItemView.findViewById(R.id.title);
            titleItemView.setEnabled(false);
            titleView.setText(menu.m۱۱۸۰۶h());
            listView.addHeaderView(titleItemView, null, false);
            popupWindow.mo۱۳۵۷۵d();
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    private MenuItem m۱۱۷۱۰a(Ch parent, Ch submenu) {
        int count = parent.size();
        for (int i = 0; i < count; i++) {
            MenuItem item = parent.getItem(i);
            if (item.hasSubMenu() && submenu == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a, reason: contains not printable characters */
    private View m۱۱۷۱۱a(d parentInfo, Ch submenu) {
        int headersCount;
        Cg menuAdapter;
        int ownerViewPosition;
        MenuItem owner = m۱۱۷۱۰a(parentInfo.f۱۱۲۴۲b, submenu);
        if (owner == null) {
            return null;
        }
        ListView listView = parentInfo.m۱۱۷۳۸a();
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerAdapter = (HeaderViewListAdapter) listAdapter;
            headersCount = headerAdapter.getHeadersCount();
            menuAdapter = (Cg) headerAdapter.getWrappedAdapter();
        } else {
            headersCount = 0;
            menuAdapter = (Cg) listAdapter;
        }
        int ownerPosition = -1;
        int i = 0;
        int count = menuAdapter.getCount();
        while (true) {
            if (i >= count) {
                break;
            }
            if (owner != menuAdapter.getItem(i)) {
                i++;
            } else {
                ownerPosition = i;
                break;
            }
        }
        if (ownerPosition == -1 || (ownerViewPosition = (ownerPosition + headersCount) - listView.getFirstVisiblePosition()) < 0 || ownerViewPosition >= listView.getChildCount()) {
            return null;
        }
        return listView.getChildAt(ownerViewPosition);
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    /* renamed from: e, reason: contains not printable characters */
    public boolean mo۱۳۴۳۳e() {
        return this.f۱۱۲۱۸k.size() > 0 && this.f۱۱۲۱۸k.get(0).f۱۱۲۴۱a.mo۱۳۴۳۳e();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dismissedInfo = null;
        int i = 0;
        int count = this.f۱۱۲۱۸k.size();
        while (true) {
            if (i >= count) {
                break;
            }
            d info2 = this.f۱۱۲۱۸k.get(i);
            if (info2.f۱۱۲۴۱a.mo۱۳۴۳۳e()) {
                i++;
            } else {
                dismissedInfo = info2;
                break;
            }
        }
        if (dismissedInfo != null) {
            dismissedInfo.f۱۱۲۴۲b.m۱۱۷۸۲a(false);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۵۲a(boolean cleared) {
        for (d info2 : this.f۱۱۲۱۸k) {
            AbstractCn.m۱۱۸۶۵a(info2.m۱۱۷۳۸a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۲۳a(InterfaceCp.a cb) {
        this.f۱۱۲۳۳z = cb;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۵۴a(SubMenuCv subMenu) {
        for (d info2 : this.f۱۱۲۱۸k) {
            if (subMenu == info2.f۱۱۲۴۲b) {
                info2.m۱۱۷۳۸a().requestFocus();
                return true;
            }
        }
        if (subMenu.hasVisibleItems()) {
            mo۱۱۹۲۱a((Ch) subMenu);
            InterfaceCp.a aVar = this.f۱۱۲۳۳z;
            if (aVar != null) {
                aVar.mo۱۲۹۷۷a(subMenu);
            }
            return true;
        }
        return false;
    }

    /* renamed from: c, reason: contains not printable characters */
    private int m۱۱۷۱۲c(Ch menu) {
        int count = this.f۱۱۲۱۸k.size();
        for (int i = 0; i < count; i++) {
            d info2 = this.f۱۱۲۱۸k.get(i);
            if (menu == info2.f۱۱۲۴۲b) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۹a(Ch menu, boolean allMenusAreClosing) {
        int menuIndex = m۱۱۷۱۲c(menu);
        if (menuIndex < 0) {
            return;
        }
        int nextMenuIndex = menuIndex + 1;
        if (nextMenuIndex < this.f۱۱۲۱۸k.size()) {
            d childInfo = this.f۱۱۲۱۸k.get(nextMenuIndex);
            childInfo.f۱۱۲۴۲b.m۱۱۷۸۲a(false);
        }
        d info2 = this.f۱۱۲۱۸k.remove(menuIndex);
        info2.f۱۱۲۴۲b.m۱۱۷۹۰b(this);
        if (this.f۱۱۲۱۰C) {
            info2.f۱۱۲۴۱a.m۱۳۴۹۴b((Object) null);
            info2.f۱۱۲۴۱a.m۱۳۴۱۷a(0);
        }
        info2.f۱۱۲۴۱a.dismiss();
        int count = this.f۱۱۲۱۸k.size();
        if (count > 0) {
            this.f۱۱۲۲۶s = this.f۱۱۲۱۸k.get(count - 1).f۱۱۲۴۳c;
        } else {
            this.f۱۱۲۲۶s = m۱۱۷۱۶j();
        }
        if (count == 0) {
            dismiss();
            InterfaceCp.a aVar = this.f۱۱۲۳۳z;
            if (aVar != null) {
                aVar.mo۱۲۹۷۶a(menu, true);
            }
            ViewTreeObserver viewTreeObserver = this.f۱۱۲۰۸A;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f۱۱۲۰۸A.removeGlobalOnLayoutListener(this.f۱۱۲۱۹l);
                }
                this.f۱۱۲۰۸A = null;
            }
            this.f۱۱۲۲۵r.removeOnAttachStateChangeListener(this.f۱۱۲۲۰m);
            this.f۱۱۲۰۹B.onDismiss();
            return;
        }
        if (allMenusAreClosing) {
            d rootInfo = this.f۱۱۲۱۸k.get(0);
            rootInfo.f۱۱۲۴۲b.m۱۱۷۸۲a(false);
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: b, reason: contains not printable characters */
    public boolean mo۱۲۹۵۸b() {
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: c, reason: contains not printable characters */
    public Parcelable mo۱۲۹۵۹c() {
        return null;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۸a(Parcelable state) {
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۱۹a(int dropDownGravity) {
        if (this.f۱۱۲۲۲o != dropDownGravity) {
            this.f۱۱۲۲۲o = dropDownGravity;
            this.f۱۱۲۲۳p = android.support.v4.view.Cd.m۱۰۷۵۵a(dropDownGravity, Cu.m۱۰۹۴۴k(this.f۱۱۲۲۴q));
        }
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۲۴a(View anchor) {
        if (this.f۱۱۲۲۴q != anchor) {
            this.f۱۱۲۲۴q = anchor;
            this.f۱۱۲۲۳p = android.support.v4.view.Cd.m۱۰۷۵۵a(this.f۱۱۲۲۲o, Cu.m۱۰۹۴۴k(this.f۱۱۲۲۴q));
        }
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۲۵a(PopupWindow.OnDismissListener listener) {
        this.f۱۱۲۰۹B = listener;
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    /* renamed from: f, reason: contains not printable characters */
    public ListView mo۱۳۴۳۴f() {
        if (this.f۱۱۲۱۸k.isEmpty()) {
            return null;
        }
        return this.f۱۱۲۱۸k.get(r0.size() - 1).m۱۱۷۳۸a();
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۹۲۸b(int x) {
        this.f۱۱۲۲۷t = true;
        this.f۱۱۲۲۹v = x;
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۱۹۳۲c(int y) {
        this.f۱۱۲۲۸u = true;
        this.f۱۱۲۳۰w = y;
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۱۹۳۳c(boolean showTitle) {
        this.f۱۱۲۳۲y = showTitle;
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: g, reason: contains not printable characters */
    protected boolean mo۱۱۸۸۰g() {
        return false;
    }

    /* renamed from: android.support.v7.view.menu.e$d */
    private static class d {

        /* renamed from: a, reason: contains not printable characters */
        public final Cr0 f۱۱۲۴۱a;

        /* renamed from: b, reason: contains not printable characters */
        public final Ch f۱۱۲۴۲b;

        /* renamed from: c, reason: contains not printable characters */
        public final int f۱۱۲۴۳c;

        public d(Cr0 window, Ch menu, int position) {
            this.f۱۱۲۴۱a = window;
            this.f۱۱۲۴۲b = menu;
            this.f۱۱۲۴۳c = position;
        }

        /* renamed from: a, reason: contains not printable characters */
        public ListView m۱۱۷۳۸a() {
            return this.f۱۱۲۴۱a.mo۱۳۴۳۴f();
        }
    }
}
