package android.support.v7.view.menu;

import a.b.h.a.d;
import a.b.h.a.g;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.view.menu.p;
import android.support.v7.widget.r0;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

final class u extends n implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, p, View.OnKeyListener {
    private static final int x = g.abc_popup_menu_item_layout;

    /* renamed from: d  reason: collision with root package name */
    private final Context f۱۷۳۸d;

    /* renamed from: e  reason: collision with root package name */
    private final h f۱۷۳۹e;

    /* renamed from: f  reason: collision with root package name */
    private final g f۱۷۴۰f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f۱۷۴۱g;

    /* renamed from: h  reason: collision with root package name */
    private final int f۱۷۴۲h;
    private final int i;
    private final int j;
    final r0 k;
    final ViewTreeObserver.OnGlobalLayoutListener l = new a();
    private final View.OnAttachStateChangeListener m = new b();
    private PopupWindow.OnDismissListener n;
    private View o;
    View p;
    private p.a q;
    ViewTreeObserver r;
    private boolean s;
    private boolean t;
    private int u;
    private int v = 0;
    private boolean w;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        public void onGlobalLayout() {
            if (u.this.e() && !u.this.k.k()) {
                View anchor = u.this.p;
                if (anchor == null || !anchor.isShown()) {
                    u.this.dismiss();
                } else {
                    u.this.k.d();
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
            ViewTreeObserver viewTreeObserver = u.this.r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    u.this.r = v.getViewTreeObserver();
                }
                u uVar = u.this;
                uVar.r.removeGlobalOnLayoutListener(uVar.l);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    public u(Context context, h menu, View anchorView, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f۱۷۳۸d = context;
        this.f۱۷۳۹e = menu;
        this.f۱۷۴۱g = overflowOnly;
        this.f۱۷۴۰f = new g(menu, LayoutInflater.from(context), this.f۱۷۴۱g, x);
        this.i = popupStyleAttr;
        this.j = popupStyleRes;
        Resources res = context.getResources();
        this.f۱۷۴۲h = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(d.abc_config_prefDialogWidth));
        this.o = anchorView;
        this.k = new r0(this.f۱۷۳۸d, null, this.i, this.j);
        menu.a(this, context);
    }

    @Override // android.support.v7.view.menu.n
    public void b(boolean forceShow) {
        this.f۱۷۴۰f.a(forceShow);
    }

    @Override // android.support.v7.view.menu.n
    public void a(int gravity) {
        this.v = gravity;
    }

    private boolean i() {
        View view;
        if (e()) {
            return true;
        }
        if (this.s || (view = this.o) == null) {
            return false;
        }
        this.p = view;
        this.k.a((PopupWindow.OnDismissListener) this);
        this.k.a((AdapterView.OnItemClickListener) this);
        this.k.a(true);
        View anchor = this.p;
        boolean addGlobalListener = this.r == null;
        this.r = anchor.getViewTreeObserver();
        if (addGlobalListener) {
            this.r.addOnGlobalLayoutListener(this.l);
        }
        anchor.addOnAttachStateChangeListener(this.m);
        this.k.a(anchor);
        this.k.c(this.v);
        if (!this.t) {
            this.u = n.a(this.f۱۷۴۰f, null, this.f۱۷۳۸d, this.f۱۷۴۲h);
            this.t = true;
        }
        this.k.b(this.u);
        this.k.e(2);
        this.k.a(h());
        this.k.d();
        ListView listView = this.k.f();
        listView.setOnKeyListener(this);
        if (this.w && this.f۱۷۳۹e.h() != null) {
            FrameLayout titleItemView = (FrameLayout) LayoutInflater.from(this.f۱۷۳۸d).inflate(g.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView titleView = (TextView) titleItemView.findViewById(16908310);
            if (titleView != null) {
                titleView.setText(this.f۱۷۳۹e.h());
            }
            titleItemView.setEnabled(false);
            listView.addHeaderView(titleItemView, null, false);
        }
        this.k.a((ListAdapter) this.f۱۷۴۰f);
        this.k.d();
        return true;
    }

    @Override // android.support.v7.view.menu.t
    public void d() {
        if (!i()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.v7.view.menu.t
    public void dismiss() {
        if (e()) {
            this.k.dismiss();
        }
    }

    @Override // android.support.v7.view.menu.n
    public void a(h menu) {
    }

    @Override // android.support.v7.view.menu.t
    public boolean e() {
        return !this.s && this.k.e();
    }

    public void onDismiss() {
        this.s = true;
        this.f۱۷۳۹e.close();
        ViewTreeObserver viewTreeObserver = this.r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.r = this.p.getViewTreeObserver();
            }
            this.r.removeGlobalOnLayoutListener(this.l);
            this.r = null;
        }
        this.p.removeOnAttachStateChangeListener(this.m);
        PopupWindow.OnDismissListener onDismissListener = this.n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.support.v7.view.menu.p
    public void a(boolean cleared) {
        this.t = false;
        g gVar = this.f۱۷۴۰f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.p
    public void a(p.a cb) {
        this.q = cb;
    }

    @Override // android.support.v7.view.menu.p
    public boolean a(v subMenu) {
        if (subMenu.hasVisibleItems()) {
            o subPopup = new o(this.f۱۷۳۸d, subMenu, this.p, this.f۱۷۴۱g, this.i, this.j);
            subPopup.a(this.q);
            subPopup.a(n.b(subMenu));
            subPopup.a(this.n);
            this.n = null;
            this.f۱۷۳۹e.a(false);
            int horizontalOffset = this.k.g();
            int verticalOffset = this.k.h();
            if ((Gravity.getAbsoluteGravity(this.v, android.support.v4.view.u.k(this.o)) & 7) == 5) {
                horizontalOffset += this.o.getWidth();
            }
            if (subPopup.a(horizontalOffset, verticalOffset)) {
                p.a aVar = this.q;
                if (aVar == null) {
                    return true;
                }
                aVar.a(subMenu);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.p
    public void a(h menu, boolean allMenusAreClosing) {
        if (menu == this.f۱۷۳۹e) {
            dismiss();
            p.a aVar = this.q;
            if (aVar != null) {
                aVar.a(menu, allMenusAreClosing);
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
    public void a(View anchor) {
        this.o = anchor;
    }

    public boolean onKey(View v2, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.support.v7.view.menu.n
    public void a(PopupWindow.OnDismissListener listener) {
        this.n = listener;
    }

    @Override // android.support.v7.view.menu.t
    public ListView f() {
        return this.k.f();
    }

    @Override // android.support.v7.view.menu.n
    public void b(int x2) {
        this.k.d(x2);
    }

    @Override // android.support.v7.view.menu.n
    public void c(int y) {
        this.k.h(y);
    }

    @Override // android.support.v7.view.menu.n
    public void c(boolean showTitle) {
        this.w = showTitle;
    }
}
