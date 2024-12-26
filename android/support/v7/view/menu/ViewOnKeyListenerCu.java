package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v4.view.Cu;
import android.support.v7.view.menu.InterfaceCp;
import android.support.v7.widget.Cr0;
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
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cd;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg;

/* renamed from: android.support.v7.view.menu.u, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
final class ViewOnKeyListenerCu extends AbstractCn implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, InterfaceCp, View.OnKeyListener {

    /* renamed from: x, reason: contains not printable characters */
    private static final int f۱۱۳۴۶x = Cg.abc_popup_menu_item_layout;

    /* renamed from: d, reason: contains not printable characters */
    private final Context f۱۱۳۴۷d;

    /* renamed from: e, reason: contains not printable characters */
    private final Ch f۱۱۳۴۸e;

    /* renamed from: f, reason: contains not printable characters */
    private final Cg f۱۱۳۴۹f;

    /* renamed from: g, reason: contains not printable characters */
    private final boolean f۱۱۳۵۰g;

    /* renamed from: h, reason: contains not printable characters */
    private final int f۱۱۳۵۱h;

    /* renamed from: i, reason: contains not printable characters */
    private final int f۱۱۳۵۲i;

    /* renamed from: j, reason: contains not printable characters */
    private final int f۱۱۳۵۳j;

    /* renamed from: k, reason: contains not printable characters */
    final Cr0 f۱۱۳۵۴k;

    /* renamed from: n, reason: contains not printable characters */
    private PopupWindow.OnDismissListener f۱۱۳۵۷n;

    /* renamed from: o, reason: contains not printable characters */
    private View f۱۱۳۵۸o;

    /* renamed from: p, reason: contains not printable characters */
    View f۱۱۳۵۹p;

    /* renamed from: q, reason: contains not printable characters */
    private InterfaceCp.a f۱۱۳۶۰q;

    /* renamed from: r, reason: contains not printable characters */
    ViewTreeObserver f۱۱۳۶۱r;

    /* renamed from: s, reason: contains not printable characters */
    private boolean f۱۱۳۶۲s;

    /* renamed from: t, reason: contains not printable characters */
    private boolean f۱۱۳۶۳t;

    /* renamed from: u, reason: contains not printable characters */
    private int f۱۱۳۶۴u;

    /* renamed from: w, reason: contains not printable characters */
    private boolean f۱۱۳۶۶w;

    /* renamed from: l, reason: contains not printable characters */
    final ViewTreeObserver.OnGlobalLayoutListener f۱۱۳۵۵l = new a();

    /* renamed from: m, reason: contains not printable characters */
    private final View.OnAttachStateChangeListener f۱۱۳۵۶m = new b();

    /* renamed from: v, reason: contains not printable characters */
    private int f۱۱۳۶۵v = 0;

    /* renamed from: android.support.v7.view.menu.u$a */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ViewOnKeyListenerCu.this.mo۱۳۴۳۳e() && !ViewOnKeyListenerCu.this.f۱۱۳۵۴k.m۱۳۴۴۳k()) {
                View anchor = ViewOnKeyListenerCu.this.f۱۱۳۵۹p;
                if (anchor == null || !anchor.isShown()) {
                    ViewOnKeyListenerCu.this.dismiss();
                } else {
                    ViewOnKeyListenerCu.this.f۱۱۳۵۴k.mo۱۳۵۷۵d();
                }
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.u$b */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerCu.this.f۱۱۳۶۱r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerCu.this.f۱۱۳۶۱r = v.getViewTreeObserver();
                }
                ViewOnKeyListenerCu viewOnKeyListenerCu = ViewOnKeyListenerCu.this;
                viewOnKeyListenerCu.f۱۱۳۶۱r.removeGlobalOnLayoutListener(viewOnKeyListenerCu.f۱۱۳۵۵l);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerCu(Context context, Ch menu, View anchorView, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f۱۱۳۴۷d = context;
        this.f۱۱۳۴۸e = menu;
        this.f۱۱۳۵۰g = overflowOnly;
        LayoutInflater inflater = LayoutInflater.from(context);
        this.f۱۱۳۴۹f = new Cg(menu, inflater, this.f۱۱۳۵۰g, f۱۱۳۴۶x);
        this.f۱۱۳۵۲i = popupStyleAttr;
        this.f۱۱۳۵۳j = popupStyleRes;
        Resources res = context.getResources();
        this.f۱۱۳۵۱h = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(Cd.abc_config_prefDialogWidth));
        this.f۱۱۳۵۸o = anchorView;
        this.f۱۱۳۵۴k = new Cr0(this.f۱۱۳۴۷d, null, this.f۱۱۳۵۲i, this.f۱۱۳۵۳j);
        menu.m۱۱۷۷۹a(this, context);
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۹۲۹b(boolean forceShow) {
        this.f۱۱۳۴۹f.m۱۱۷۵۶a(forceShow);
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۱۹a(int gravity) {
        this.f۱۱۳۶۵v = gravity;
    }

    /* renamed from: i, reason: contains not printable characters */
    private boolean m۱۱۹۱۸i() {
        View view;
        if (mo۱۳۴۳۳e()) {
            return true;
        }
        if (this.f۱۱۳۶۲s || (view = this.f۱۱۳۵۸o) == null) {
            return false;
        }
        this.f۱۱۳۵۹p = view;
        this.f۱۱۳۵۴k.m۱۳۴۲۳a((PopupWindow.OnDismissListener) this);
        this.f۱۱۳۵۴k.m۱۳۴۲۱a((AdapterView.OnItemClickListener) this);
        this.f۱۱۳۵۴k.m۱۳۴۲۴a(true);
        View anchor = this.f۱۱۳۵۹p;
        boolean addGlobalListener = this.f۱۱۳۶۱r == null;
        this.f۱۱۳۶۱r = anchor.getViewTreeObserver();
        if (addGlobalListener) {
            this.f۱۱۳۶۱r.addOnGlobalLayoutListener(this.f۱۱۳۵۵l);
        }
        anchor.addOnAttachStateChangeListener(this.f۱۱۳۵۶m);
        this.f۱۱۳۵۴k.m۱۳۴۲۰a(anchor);
        this.f۱۱۳۵۴k.m۱۳۴۲۹c(this.f۱۱۳۶۵v);
        if (!this.f۱۱۳۶۳t) {
            this.f۱۱۳۶۴u = AbstractCn.m۱۱۸۶۴a(this.f۱۱۳۴۹f, null, this.f۱۱۳۴۷d, this.f۱۱۳۵۱h);
            this.f۱۱۳۶۳t = true;
        }
        this.f۱۱۳۵۴k.m۱۳۴۲۶b(this.f۱۱۳۶۴u);
        this.f۱۱۳۵۴k.m۱۳۴۳۲e(2);
        this.f۱۱۳۵۴k.m۱۳۴۱۸a(m۱۱۸۸۱h());
        this.f۱۱۳۵۴k.mo۱۳۵۷۵d();
        ListView listView = this.f۱۱۳۵۴k.mo۱۳۴۳۴f();
        listView.setOnKeyListener(this);
        if (this.f۱۱۳۶۶w && this.f۱۱۳۴۸e.m۱۱۸۰۶h() != null) {
            FrameLayout titleItemView = (FrameLayout) LayoutInflater.from(this.f۱۱۳۴۷d).inflate(Cg.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView titleView = (TextView) titleItemView.findViewById(R.id.title);
            if (titleView != null) {
                titleView.setText(this.f۱۱۳۴۸e.m۱۱۸۰۶h());
            }
            titleItemView.setEnabled(false);
            listView.addHeaderView(titleItemView, null, false);
        }
        this.f۱۱۳۵۴k.mo۱۳۵۷۲a((ListAdapter) this.f۱۱۳۴۹f);
        this.f۱۱۳۵۴k.mo۱۳۵۷۵d();
        return true;
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    /* renamed from: d, reason: contains not printable characters */
    public void mo۱۳۵۷۵d() {
        if (!m۱۱۹۱۸i()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    public void dismiss() {
        if (mo۱۳۴۳۳e()) {
            this.f۱۱۳۵۴k.dismiss();
        }
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۲۱a(Ch menu) {
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    /* renamed from: e, reason: contains not printable characters */
    public boolean mo۱۳۴۳۳e() {
        return !this.f۱۱۳۶۲s && this.f۱۱۳۵۴k.mo۱۳۴۳۳e();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f۱۱۳۶۲s = true;
        this.f۱۱۳۴۸e.close();
        ViewTreeObserver viewTreeObserver = this.f۱۱۳۶۱r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f۱۱۳۶۱r = this.f۱۱۳۵۹p.getViewTreeObserver();
            }
            this.f۱۱۳۶۱r.removeGlobalOnLayoutListener(this.f۱۱۳۵۵l);
            this.f۱۱۳۶۱r = null;
        }
        this.f۱۱۳۵۹p.removeOnAttachStateChangeListener(this.f۱۱۳۵۶m);
        PopupWindow.OnDismissListener onDismissListener = this.f۱۱۳۵۷n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۵۲a(boolean cleared) {
        this.f۱۱۳۶۳t = false;
        Cg cg = this.f۱۱۳۴۹f;
        if (cg != null) {
            cg.notifyDataSetChanged();
        }
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۲۳a(InterfaceCp.a cb) {
        this.f۱۱۳۶۰q = cb;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۵۴a(SubMenuCv subMenu) {
        if (subMenu.hasVisibleItems()) {
            Co subPopup = new Co(this.f۱۱۳۴۷d, subMenu, this.f۱۱۳۵۹p, this.f۱۱۳۵۰g, this.f۱۱۳۵۲i, this.f۱۱۳۵۳j);
            subPopup.m۱۱۸۸۶a(this.f۱۱۳۶۰q);
            subPopup.m۱۱۸۸۹a(AbstractCn.m۱۱۸۶۶b(subMenu));
            subPopup.m۱۱۸۸۸a(this.f۱۱۳۵۷n);
            this.f۱۱۳۵۷n = null;
            this.f۱۱۳۴۸e.m۱۱۷۸۲a(false);
            int horizontalOffset = this.f۱۱۳۵۴k.m۱۳۴۳۶g();
            int verticalOffset = this.f۱۱۳۵۴k.m۱۳۴۳۸h();
            int hgrav = Gravity.getAbsoluteGravity(this.f۱۱۳۶۵v, Cu.m۱۰۹۴۴k(this.f۱۱۳۵۸o)) & 7;
            if (hgrav == 5) {
                horizontalOffset += this.f۱۱۳۵۸o.getWidth();
            }
            if (subPopup.m۱۱۸۹۰a(horizontalOffset, verticalOffset)) {
                InterfaceCp.a aVar = this.f۱۱۳۶۰q;
                if (aVar != null) {
                    aVar.mo۱۲۹۷۷a(subMenu);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۹a(Ch menu, boolean allMenusAreClosing) {
        if (menu != this.f۱۱۳۴۸e) {
            return;
        }
        dismiss();
        InterfaceCp.a aVar = this.f۱۱۳۶۰q;
        if (aVar != null) {
            aVar.mo۱۲۹۷۶a(menu, allMenusAreClosing);
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
    public void mo۱۱۹۲۴a(View anchor) {
        this.f۱۱۳۵۸o = anchor;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() == 1 && keyCode == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۱۹۲۵a(PopupWindow.OnDismissListener listener) {
        this.f۱۱۳۵۷n = listener;
    }

    @Override // android.support.v7.view.menu.InterfaceCt
    /* renamed from: f, reason: contains not printable characters */
    public ListView mo۱۳۴۳۴f() {
        return this.f۱۱۳۵۴k.mo۱۳۴۳۴f();
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: b, reason: contains not printable characters */
    public void mo۱۱۹۲۸b(int x) {
        this.f۱۱۳۵۴k.m۱۳۴۳۱d(x);
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۱۹۳۲c(int y) {
        this.f۱۱۳۵۴k.m۱۳۴۳۹h(y);
    }

    @Override // android.support.v7.view.menu.AbstractCn
    /* renamed from: c, reason: contains not printable characters */
    public void mo۱۱۹۳۳c(boolean showTitle) {
        this.f۱۱۳۶۶w = showTitle;
    }
}
