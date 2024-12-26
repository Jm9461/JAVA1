package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.widget.AbstractCq0;
import android.support.p۰۴۷v7.widget.Cr0;
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
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg;

/* renamed from: android.support.v7.view.menu.e  reason: invalid class name */
final class View$OnKeyListenerCe extends AbstractCn implements AbstractCp, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: D  reason: contains not printable characters */
    private static final int f۱۱۲۰۷D = Cg.abc_cascading_menu_item_layout;

    /* renamed from: A  reason: contains not printable characters */
    ViewTreeObserver f۱۱۲۰۸A;

    /* renamed from: B  reason: contains not printable characters */
    private PopupWindow.OnDismissListener f۱۱۲۰۹B;

    /* renamed from: C  reason: contains not printable characters */
    boolean f۱۱۲۱۰C;

    /* renamed from: d  reason: contains not printable characters */
    private final Context f۱۱۲۱۱d;

    /* renamed from: e  reason: contains not printable characters */
    private final int f۱۱۲۱۲e;

    /* renamed from: f  reason: contains not printable characters */
    private final int f۱۱۲۱۳f;

    /* renamed from: g  reason: contains not printable characters */
    private final int f۱۱۲۱۴g;

    /* renamed from: h  reason: contains not printable characters */
    private final boolean f۱۱۲۱۵h;

    /* renamed from: i  reason: contains not printable characters */
    final Handler f۱۱۲۱۶i;

    /* renamed from: j  reason: contains not printable characters */
    private final List<Ch> f۱۱۲۱۷j = new ArrayList();

    /* renamed from: k  reason: contains not printable characters */
    final List<Cd> f۱۱۲۱۸k = new ArrayList();

    /* renamed from: l  reason: contains not printable characters */
    final ViewTreeObserver.OnGlobalLayoutListener f۱۱۲۱۹l = new ViewTreeObserver$OnGlobalLayoutListenerCa();

    /* renamed from: m  reason: contains not printable characters */
    private final View.OnAttachStateChangeListener f۱۱۲۲۰m = new View$OnAttachStateChangeListenerCb();

    /* renamed from: n  reason: contains not printable characters */
    private final AbstractCq0 f۱۱۲۲۱n = new Cc();

    /* renamed from: o  reason: contains not printable characters */
    private int f۱۱۲۲۲o = 0;

    /* renamed from: p  reason: contains not printable characters */
    private int f۱۱۲۲۳p = 0;

    /* renamed from: q  reason: contains not printable characters */
    private View f۱۱۲۲۴q;

    /* renamed from: r  reason: contains not printable characters */
    View f۱۱۲۲۵r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۱۲۲۶s;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۱۲۲۷t;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۱۲۲۸u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۱۲۲۹v;

    /* renamed from: w  reason: contains not printable characters */
    private int f۱۱۲۳۰w;

    /* renamed from: x  reason: contains not printable characters */
    private boolean f۱۱۲۳۱x;

    /* renamed from: y  reason: contains not printable characters */
    private boolean f۱۱۲۳۲y;

    /* renamed from: z  reason: contains not printable characters */
    private AbstractCp.AbstractCa f۱۱۲۳۳z;

    /* renamed from: android.support.v7.view.menu.e$a  reason: invalid class name */
    class ViewTreeObserver$OnGlobalLayoutListenerCa implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerCa() {
        }

        public void onGlobalLayout() {
            if (View$OnKeyListenerCe.this.m۱۳۸۰۳e() && View$OnKeyListenerCe.this.f۱۱۲۱۸k.size() > 0 && !View$OnKeyListenerCe.this.f۱۱۲۱۸k.get(0).f۱۱۲۴۱a.m۱۵۵۱۳k()) {
                View anchor = View$OnKeyListenerCe.this.f۱۱۲۲۵r;
                if (anchor == null || !anchor.isShown()) {
                    View$OnKeyListenerCe.this.dismiss();
                    return;
                }
                for (Cd info2 : View$OnKeyListenerCe.this.f۱۱۲۱۸k) {
                    info2.f۱۱۲۴۱a.m۱۵۵۰۰d();
                }
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.e$b  reason: invalid class name */
    class View$OnAttachStateChangeListenerCb implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerCb() {
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerCe.this.f۱۱۲۰۸A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerCe.this.f۱۱۲۰۸A = v.getViewTreeObserver();
                }
                View$OnKeyListenerCe eVar = View$OnKeyListenerCe.this;
                eVar.f۱۱۲۰۸A.removeGlobalOnLayoutListener(eVar.f۱۱۲۱۹l);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: android.support.v7.view.menu.e$c  reason: invalid class name */
    class Cc implements AbstractCq0 {
        Cc() {
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCq0
        /* renamed from: b  reason: contains not printable characters */
        public void m۱۳۸۰۷b(Ch menu, MenuItem item) {
            View$OnKeyListenerCe.this.f۱۱۲۱۶i.removeCallbacksAndMessages(menu);
        }

        @Override // android.support.p۰۴۷v7.widget.AbstractCq0
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۳۸۰۶a(Ch menu, MenuItem item) {
            Cd nextInfo;
            View$OnKeyListenerCe.this.f۱۱۲۱۶i.removeCallbacksAndMessages(null);
            int menuIndex = -1;
            int i = 0;
            int count = View$OnKeyListenerCe.this.f۱۱۲۱۸k.size();
            while (true) {
                if (i >= count) {
                    break;
                } else if (menu == View$OnKeyListenerCe.this.f۱۱۲۱۸k.get(i).f۱۱۲۴۲b) {
                    menuIndex = i;
                    break;
                } else {
                    i++;
                }
            }
            if (menuIndex != -1) {
                int nextIndex = menuIndex + 1;
                if (nextIndex < View$OnKeyListenerCe.this.f۱۱۲۱۸k.size()) {
                    nextInfo = View$OnKeyListenerCe.this.f۱۱۲۱۸k.get(nextIndex);
                } else {
                    nextInfo = null;
                }
                View$OnKeyListenerCe.this.f۱۱۲۱۶i.postAtTime(new RunnableCa(nextInfo, item, menu), menu, SystemClock.uptimeMillis() + 200);
            }
        }

        /* renamed from: android.support.v7.view.menu.e$c$a  reason: invalid class name */
        class RunnableCa implements Runnable {

            /* renamed from: c  reason: contains not printable characters */
            final /* synthetic */ Cd f۱۱۲۳۷c;

            /* renamed from: d  reason: contains not printable characters */
            final /* synthetic */ MenuItem f۱۱۲۳۸d;

            /* renamed from: e  reason: contains not printable characters */
            final /* synthetic */ Ch f۱۱۲۳۹e;

            RunnableCa(Cd dVar, MenuItem menuItem, Ch hVar) {
                this.f۱۱۲۳۷c = dVar;
                this.f۱۱۲۳۸d = menuItem;
                this.f۱۱۲۳۹e = hVar;
            }

            public void run() {
                Cd dVar = this.f۱۱۲۳۷c;
                if (dVar != null) {
                    View$OnKeyListenerCe.this.f۱۱۲۱۰C = true;
                    dVar.f۱۱۲۴۲b.m۱۳۸۵۲a(false);
                    View$OnKeyListenerCe.this.f۱۱۲۱۰C = false;
                }
                if (this.f۱۱۲۳۸d.isEnabled() && this.f۱۱۲۳۸d.hasSubMenu()) {
                    this.f۱۱۲۳۹e.m۱۳۸۵۵a(this.f۱۱۲۳۸d, 4);
                }
            }
        }
    }

    public View$OnKeyListenerCe(Context context, View anchor, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f۱۱۲۱۱d = context;
        this.f۱۱۲۲۴q = anchor;
        this.f۱۱۲۱۳f = popupStyleAttr;
        this.f۱۱۲۱۴g = popupStyleRes;
        this.f۱۱۲۱۵h = overflowOnly;
        this.f۱۱۲۳۱x = false;
        this.f۱۱۲۲۶s = m۱۳۷۸۶j();
        Resources res = context.getResources();
        this.f۱۱۲۱۲e = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cd.abc_config_prefDialogWidth));
        this.f۱۱۲۱۶i = new Handler();
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۷۹۷b(boolean forceShow) {
        this.f۱۱۲۳۱x = forceShow;
    }

    /* renamed from: i  reason: contains not printable characters */
    private Cr0 m۱۳۷۸۵i() {
        Cr0 popupWindow = new Cr0(this.f۱۱۲۱۱d, null, this.f۱۱۲۱۳f, this.f۱۱۲۱۴g);
        popupWindow.m۱۵۵۶۱a(this.f۱۱۲۲۱n);
        popupWindow.m۱۵۴۹۱a((AdapterView.OnItemClickListener) this);
        popupWindow.m۱۵۴۹۳a((PopupWindow.OnDismissListener) this);
        popupWindow.m۱۵۴۹۰a(this.f۱۱۲۲۴q);
        popupWindow.m۱۵۴۹۹c(this.f۱۱۲۲۳p);
        popupWindow.m۱۵۴۹۴a(true);
        popupWindow.m۱۵۵۰۲e(2);
        return popupWindow;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCt
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۳۸۰۲d() {
        if (!m۱۳۸۰۳e()) {
            for (Ch menu : this.f۱۱۲۱۷j) {
                m۱۳۷۸۴d(menu);
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
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCt
    public void dismiss() {
        int length = this.f۱۱۲۱۸k.size();
        if (length > 0) {
            Cd[] addedMenus = (Cd[]) this.f۱۱۲۱۸k.toArray(new Cd[length]);
            for (int i = length - 1; i >= 0; i--) {
                Cd info2 = addedMenus[i];
                if (info2.f۱۱۲۴۱a.m۱۵۵۰۳e()) {
                    info2.f۱۱۲۴۱a.dismiss();
                }
            }
        }
    }

    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: j  reason: contains not printable characters */
    private int m۱۳۷۸۶j() {
        return Cu.m۱۳۰۱۴k(this.f۱۱۲۲۴q) == 1 ? 0 : 1;
    }

    /* renamed from: d  reason: contains not printable characters */
    private int m۱۳۷۸۳d(int nextMenuWidth) {
        List<Cd> list = this.f۱۱۲۱۸k;
        ListView lastListView = list.get(list.size() - 1).m۱۳۸۰۸a();
        int[] screenLocation = new int[2];
        lastListView.getLocationOnScreen(screenLocation);
        Rect displayFrame = new Rect();
        this.f۱۱۲۲۵r.getWindowVisibleDisplayFrame(displayFrame);
        if (this.f۱۱۲۲۶s == 1) {
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

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۸۹a(Ch menu) {
        menu.m۱۳۸۴۹a(this, this.f۱۱۲۱۱d);
        if (m۱۳۸۰۳e()) {
            m۱۳۷۸۴d(menu);
        } else {
            this.f۱۱۲۱۷j.add(menu);
        }
    }

    /* renamed from: d  reason: contains not printable characters */
    private void m۱۳۷۸۴d(Ch menu) {
        View parentView;
        Cd parentInfo;
        int parentOffsetY;
        int parentOffsetX;
        int x;
        LayoutInflater inflater = LayoutInflater.from(this.f۱۱۲۱۱d);
        Cg adapter = new Cg(menu, inflater, this.f۱۱۲۱۵h, f۱۱۲۰۷D);
        if (!m۱۳۸۰۳e() && this.f۱۱۲۳۱x) {
            adapter.m۱۳۸۲۶a(true);
        } else if (m۱۳۸۰۳e()) {
            adapter.m۱۳۸۲۶a(AbstractCn.m۱۳۹۳۶b(menu));
        }
        int menuWidth = AbstractCn.m۱۳۹۳۴a(adapter, null, this.f۱۱۲۱۱d, this.f۱۱۲۱۲e);
        Cr0 popupWindow = m۱۳۷۸۵i();
        popupWindow.m۱۵۴۹۲a((ListAdapter) adapter);
        popupWindow.m۱۵۴۹۶b(menuWidth);
        popupWindow.m۱۵۴۹۹c(this.f۱۱۲۲۳p);
        if (this.f۱۱۲۱۸k.size() > 0) {
            List<Cd> list = this.f۱۱۲۱۸k;
            parentInfo = list.get(list.size() - 1);
            parentView = m۱۳۷۸۱a(parentInfo, menu);
        } else {
            parentInfo = null;
            parentView = null;
        }
        if (parentView != null) {
            popupWindow.m۱۵۵۶۵c(false);
            popupWindow.m۱۵۵۶۲a((Object) null);
            int nextMenuPosition = m۱۳۷۸۳d(menuWidth);
            boolean showOnRight = nextMenuPosition == 1;
            this.f۱۱۲۲۶s = nextMenuPosition;
            if (Build.VERSION.SDK_INT >= 26) {
                popupWindow.m۱۵۴۹۰a(parentView);
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
                    x = parentOffsetX - parentView.getWidth();
                }
            } else if (showOnRight) {
                x = parentView.getWidth() + parentOffsetX;
            } else {
                x = parentOffsetX - menuWidth;
            }
            popupWindow.m۱۵۵۰۱d(x);
            popupWindow.m۱۵۴۹۷b(true);
            popupWindow.m۱۵۵۰۹h(parentOffsetY);
        } else {
            if (this.f۱۱۲۲۷t) {
                popupWindow.m۱۵۵۰۱d(this.f۱۱۲۲۹v);
            }
            if (this.f۱۱۲۲۸u) {
                popupWindow.m۱۵۵۰۹h(this.f۱۱۲۳۰w);
            }
            popupWindow.m۱۵۴۸۸a(m۱۳۹۵۱h());
        }
        this.f۱۱۲۱۸k.add(new Cd(popupWindow, menu, this.f۱۱۲۲۶s));
        popupWindow.m۱۵۵۰۰d();
        ListView listView = popupWindow.m۱۵۵۰۴f();
        listView.setOnKeyListener(this);
        if (parentInfo == null && this.f۱۱۲۳۲y && menu.m۱۳۸۷۶h() != null) {
            FrameLayout titleItemView = (FrameLayout) inflater.inflate(Cg.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            titleItemView.setEnabled(false);
            ((TextView) titleItemView.findViewById(16908310)).setText(menu.m۱۳۸۷۶h());
            listView.addHeaderView(titleItemView, null, false);
            popupWindow.m۱۵۵۰۰d();
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    private MenuItem m۱۳۷۸۰a(Ch parent, Ch submenu) {
        int count = parent.size();
        for (int i = 0; i < count; i++) {
            MenuItem item = parent.getItem(i);
            if (item.hasSubMenu() && submenu == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a  reason: contains not printable characters */
    private View m۱۳۷۸۱a(Cd parentInfo, Ch submenu) {
        int headersCount;
        Cg menuAdapter;
        int ownerViewPosition;
        MenuItem owner = m۱۳۷۸۰a(parentInfo.f۱۱۲۴۲b, submenu);
        if (owner == null) {
            return null;
        }
        ListView listView = parentInfo.m۱۳۸۰۸a();
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
            } else if (owner == menuAdapter.getItem(i)) {
                ownerPosition = i;
                break;
            } else {
                i++;
            }
        }
        if (ownerPosition != -1 && (ownerViewPosition = (ownerPosition + headersCount) - listView.getFirstVisiblePosition()) >= 0 && ownerViewPosition < listView.getChildCount()) {
            return listView.getChildAt(ownerViewPosition);
        }
        return null;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCt
    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۳۸۰۳e() {
        return this.f۱۱۲۱۸k.size() > 0 && this.f۱۱۲۱۸k.get(0).f۱۱۲۴۱a.m۱۵۵۰۳e();
    }

    public void onDismiss() {
        Cd dismissedInfo = null;
        int i = 0;
        int count = this.f۱۱۲۱۸k.size();
        while (true) {
            if (i >= count) {
                break;
            }
            Cd info2 = this.f۱۱۲۱۸k.get(i);
            if (!info2.f۱۱۲۴۱a.m۱۵۵۰۳e()) {
                dismissedInfo = info2;
                break;
            }
            i++;
        }
        if (dismissedInfo != null) {
            dismissedInfo.f۱۱۲۴۲b.m۱۳۸۵۲a(false);
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۹۴a(boolean cleared) {
        for (Cd info2 : this.f۱۱۲۱۸k) {
            AbstractCn.m۱۳۹۳۵a(info2.m۱۳۸۰۸a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۹۱a(AbstractCp.AbstractCa cb) {
        this.f۱۱۲۳۳z = cb;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۷۹۵a(SubMenuCv subMenu) {
        for (Cd info2 : this.f۱۱۲۱۸k) {
            if (subMenu == info2.f۱۱۲۴۲b) {
                info2.m۱۳۸۰۸a().requestFocus();
                return true;
            }
        }
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        m۱۳۷۸۹a((Ch) subMenu);
        AbstractCp.AbstractCa aVar = this.f۱۱۲۳۳z;
        if (aVar != null) {
            aVar.m۱۳۹۷۸a(subMenu);
        }
        return true;
    }

    /* renamed from: c  reason: contains not printable characters */
    private int m۱۳۷۸۲c(Ch menu) {
        int count = this.f۱۱۲۱۸k.size();
        for (int i = 0; i < count; i++) {
            if (menu == this.f۱۱۲۱۸k.get(i).f۱۱۲۴۲b) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۹۰a(Ch menu, boolean allMenusAreClosing) {
        int menuIndex = m۱۳۷۸۲c(menu);
        if (menuIndex >= 0) {
            int nextMenuIndex = menuIndex + 1;
            if (nextMenuIndex < this.f۱۱۲۱۸k.size()) {
                this.f۱۱۲۱۸k.get(nextMenuIndex).f۱۱۲۴۲b.m۱۳۸۵۲a(false);
            }
            Cd info2 = this.f۱۱۲۱۸k.remove(menuIndex);
            info2.f۱۱۲۴۲b.m۱۳۸۶۰b(this);
            if (this.f۱۱۲۱۰C) {
                info2.f۱۱۲۴۱a.m۱۵۵۶۴b((Object) null);
                info2.f۱۱۲۴۱a.m۱۵۴۸۷a(0);
            }
            info2.f۱۱۲۴۱a.dismiss();
            int count = this.f۱۱۲۱۸k.size();
            if (count > 0) {
                this.f۱۱۲۲۶s = this.f۱۱۲۱۸k.get(count - 1).f۱۱۲۴۳c;
            } else {
                this.f۱۱۲۲۶s = m۱۳۷۸۶j();
            }
            if (count == 0) {
                dismiss();
                AbstractCp.AbstractCa aVar = this.f۱۱۲۳۳z;
                if (aVar != null) {
                    aVar.m۱۳۹۷۷a(menu, true);
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
            } else if (allMenusAreClosing) {
                this.f۱۱۲۱۸k.get(0).f۱۱۲۴۲b.m۱۳۸۵۲a(false);
            }
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۳۷۹۸b() {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public Parcelable m۱۳۷۹۹c() {
        return null;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۸۸a(Parcelable state) {
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۸۷a(int dropDownGravity) {
        if (this.f۱۱۲۲۲o != dropDownGravity) {
            this.f۱۱۲۲۲o = dropDownGravity;
            this.f۱۱۲۲۳p = android.support.p۰۴۳v4.view.Cd.m۱۲۸۲۵a(dropDownGravity, Cu.m۱۳۰۱۴k(this.f۱۱۲۲۴q));
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۹۲a(View anchor) {
        if (this.f۱۱۲۲۴q != anchor) {
            this.f۱۱۲۲۴q = anchor;
            this.f۱۱۲۲۳p = android.support.p۰۴۳v4.view.Cd.m۱۲۸۲۵a(this.f۱۱۲۲۲o, Cu.m۱۳۰۱۴k(this.f۱۱۲۲۴q));
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۷۹۳a(PopupWindow.OnDismissListener listener) {
        this.f۱۱۲۰۹B = listener;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCt
    /* renamed from: f  reason: contains not printable characters */
    public ListView m۱۳۸۰۴f() {
        if (this.f۱۱۲۱۸k.isEmpty()) {
            return null;
        }
        List<Cd> list = this.f۱۱۲۱۸k;
        return list.get(list.size() - 1).m۱۳۸۰۸a();
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۷۹۶b(int x) {
        this.f۱۱۲۲۷t = true;
        this.f۱۱۲۲۹v = x;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۸۰۰c(int y) {
        this.f۱۱۲۲۸u = true;
        this.f۱۱۲۳۰w = y;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۳۸۰۱c(boolean showTitle) {
        this.f۱۱۲۳۲y = showTitle;
    }

    /* access modifiers changed from: protected */
    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۳۸۰۵g() {
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.view.menu.e$d  reason: invalid class name */
    public static class Cd {

        /* renamed from: a  reason: contains not printable characters */
        public final Cr0 f۱۱۲۴۱a;

        /* renamed from: b  reason: contains not printable characters */
        public final Ch f۱۱۲۴۲b;

        /* renamed from: c  reason: contains not printable characters */
        public final int f۱۱۲۴۳c;

        public Cd(Cr0 window, Ch menu, int position) {
            this.f۱۱۲۴۱a = window;
            this.f۱۱۲۴۲b = menu;
            this.f۱۱۲۴۳c = position;
        }

        /* renamed from: a  reason: contains not printable characters */
        public ListView m۱۳۸۰۸a() {
            return this.f۱۱۲۴۱a.m۱۵۵۰۴f();
        }
    }
}
