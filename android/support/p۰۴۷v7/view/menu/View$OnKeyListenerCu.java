package android.support.p۰۴۷v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.Cu;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.widget.Cr0;
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
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cd;
import p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg;

/* renamed from: android.support.v7.view.menu.u  reason: invalid class name */
final class View$OnKeyListenerCu extends AbstractCn implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, AbstractCp, View.OnKeyListener {

    /* renamed from: x  reason: contains not printable characters */
    private static final int f۱۱۳۴۶x = Cg.abc_popup_menu_item_layout;

    /* renamed from: d  reason: contains not printable characters */
    private final Context f۱۱۳۴۷d;

    /* renamed from: e  reason: contains not printable characters */
    private final Ch f۱۱۳۴۸e;

    /* renamed from: f  reason: contains not printable characters */
    private final Cg f۱۱۳۴۹f;

    /* renamed from: g  reason: contains not printable characters */
    private final boolean f۱۱۳۵۰g;

    /* renamed from: h  reason: contains not printable characters */
    private final int f۱۱۳۵۱h;

    /* renamed from: i  reason: contains not printable characters */
    private final int f۱۱۳۵۲i;

    /* renamed from: j  reason: contains not printable characters */
    private final int f۱۱۳۵۳j;

    /* renamed from: k  reason: contains not printable characters */
    final Cr0 f۱۱۳۵۴k;

    /* renamed from: l  reason: contains not printable characters */
    final ViewTreeObserver.OnGlobalLayoutListener f۱۱۳۵۵l = new ViewTreeObserver$OnGlobalLayoutListenerCa();

    /* renamed from: m  reason: contains not printable characters */
    private final View.OnAttachStateChangeListener f۱۱۳۵۶m = new View$OnAttachStateChangeListenerCb();

    /* renamed from: n  reason: contains not printable characters */
    private PopupWindow.OnDismissListener f۱۱۳۵۷n;

    /* renamed from: o  reason: contains not printable characters */
    private View f۱۱۳۵۸o;

    /* renamed from: p  reason: contains not printable characters */
    View f۱۱۳۵۹p;

    /* renamed from: q  reason: contains not printable characters */
    private AbstractCp.AbstractCa f۱۱۳۶۰q;

    /* renamed from: r  reason: contains not printable characters */
    ViewTreeObserver f۱۱۳۶۱r;

    /* renamed from: s  reason: contains not printable characters */
    private boolean f۱۱۳۶۲s;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۱۳۶۳t;

    /* renamed from: u  reason: contains not printable characters */
    private int f۱۱۳۶۴u;

    /* renamed from: v  reason: contains not printable characters */
    private int f۱۱۳۶۵v = 0;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۱۳۶۶w;

    /* renamed from: android.support.v7.view.menu.u$a  reason: invalid class name */
    class ViewTreeObserver$OnGlobalLayoutListenerCa implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerCa() {
        }

        public void onGlobalLayout() {
            if (View$OnKeyListenerCu.this.m۱۴۰۰۵e() && !View$OnKeyListenerCu.this.f۱۱۳۵۴k.m۱۵۵۱۳k()) {
                View anchor = View$OnKeyListenerCu.this.f۱۱۳۵۹p;
                if (anchor == null || !anchor.isShown()) {
                    View$OnKeyListenerCu.this.dismiss();
                } else {
                    View$OnKeyListenerCu.this.f۱۱۳۵۴k.m۱۵۵۰۰d();
                }
            }
        }
    }

    /* renamed from: android.support.v7.view.menu.u$b  reason: invalid class name */
    class View$OnAttachStateChangeListenerCb implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerCb() {
        }

        public void onViewAttachedToWindow(View v) {
        }

        public void onViewDetachedFromWindow(View v) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerCu.this.f۱۱۳۶۱r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerCu.this.f۱۱۳۶۱r = v.getViewTreeObserver();
                }
                View$OnKeyListenerCu uVar = View$OnKeyListenerCu.this;
                uVar.f۱۱۳۶۱r.removeGlobalOnLayoutListener(uVar.f۱۱۳۵۵l);
            }
            v.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerCu(Context context, Ch menu, View anchorView, int popupStyleAttr, int popupStyleRes, boolean overflowOnly) {
        this.f۱۱۳۴۷d = context;
        this.f۱۱۳۴۸e = menu;
        this.f۱۱۳۵۰g = overflowOnly;
        this.f۱۱۳۴۹f = new Cg(menu, LayoutInflater.from(context), this.f۱۱۳۵۰g, f۱۱۳۴۶x);
        this.f۱۱۳۵۲i = popupStyleAttr;
        this.f۱۱۳۵۳j = popupStyleRes;
        Resources res = context.getResources();
        this.f۱۱۳۵۱h = Math.max(res.getDisplayMetrics().widthPixels / 2, res.getDimensionPixelSize(Cd.abc_config_prefDialogWidth));
        this.f۱۱۳۵۸o = anchorView;
        this.f۱۱۳۵۴k = new Cr0(this.f۱۱۳۴۷d, null, this.f۱۱۳۵۲i, this.f۱۱۳۵۳j);
        menu.m۱۳۸۴۹a(this, context);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۹۹۹b(boolean forceShow) {
        this.f۱۱۳۴۹f.m۱۳۸۲۶a(forceShow);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۸۹a(int gravity) {
        this.f۱۱۳۶۵v = gravity;
    }

    /* renamed from: i  reason: contains not printable characters */
    private boolean m۱۳۹۸۸i() {
        View view;
        if (m۱۴۰۰۵e()) {
            return true;
        }
        if (this.f۱۱۳۶۲s || (view = this.f۱۱۳۵۸o) == null) {
            return false;
        }
        this.f۱۱۳۵۹p = view;
        this.f۱۱۳۵۴k.m۱۵۴۹۳a((PopupWindow.OnDismissListener) this);
        this.f۱۱۳۵۴k.m۱۵۴۹۱a((AdapterView.OnItemClickListener) this);
        this.f۱۱۳۵۴k.m۱۵۴۹۴a(true);
        View anchor = this.f۱۱۳۵۹p;
        boolean addGlobalListener = this.f۱۱۳۶۱r == null;
        this.f۱۱۳۶۱r = anchor.getViewTreeObserver();
        if (addGlobalListener) {
            this.f۱۱۳۶۱r.addOnGlobalLayoutListener(this.f۱۱۳۵۵l);
        }
        anchor.addOnAttachStateChangeListener(this.f۱۱۳۵۶m);
        this.f۱۱۳۵۴k.m۱۵۴۹۰a(anchor);
        this.f۱۱۳۵۴k.m۱۵۴۹۹c(this.f۱۱۳۶۵v);
        if (!this.f۱۱۳۶۳t) {
            this.f۱۱۳۶۴u = AbstractCn.m۱۳۹۳۴a(this.f۱۱۳۴۹f, null, this.f۱۱۳۴۷d, this.f۱۱۳۵۱h);
            this.f۱۱۳۶۳t = true;
        }
        this.f۱۱۳۵۴k.m۱۵۴۹۶b(this.f۱۱۳۶۴u);
        this.f۱۱۳۵۴k.m۱۵۵۰۲e(2);
        this.f۱۱۳۵۴k.m۱۵۴۸۸a(m۱۳۹۵۱h());
        this.f۱۱۳۵۴k.m۱۵۵۰۰d();
        ListView listView = this.f۱۱۳۵۴k.m۱۵۵۰۴f();
        listView.setOnKeyListener(this);
        if (this.f۱۱۳۶۶w && this.f۱۱۳۴۸e.m۱۳۸۷۶h() != null) {
            FrameLayout titleItemView = (FrameLayout) LayoutInflater.from(this.f۱۱۳۴۷d).inflate(Cg.abc_popup_menu_header_item_layout, (ViewGroup) listView, false);
            TextView titleView = (TextView) titleItemView.findViewById(16908310);
            if (titleView != null) {
                titleView.setText(this.f۱۱۳۴۸e.m۱۳۸۷۶h());
            }
            titleItemView.setEnabled(false);
            listView.addHeaderView(titleItemView, null, false);
        }
        this.f۱۱۳۵۴k.m۱۵۴۹۲a((ListAdapter) this.f۱۱۳۴۹f);
        this.f۱۱۳۵۴k.m۱۵۵۰۰d();
        return true;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCt
    /* renamed from: d  reason: contains not printable characters */
    public void m۱۴۰۰۴d() {
        if (!m۱۳۹۸۸i()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCt
    public void dismiss() {
        if (m۱۴۰۰۵e()) {
            this.f۱۱۳۵۴k.dismiss();
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۹۱a(Ch menu) {
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCt
    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۴۰۰۵e() {
        return !this.f۱۱۳۶۲s && this.f۱۱۳۵۴k.m۱۵۵۰۳e();
    }

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

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۹۶a(boolean cleared) {
        this.f۱۱۳۶۳t = false;
        Cg gVar = this.f۱۱۳۴۹f;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۹۳a(AbstractCp.AbstractCa cb) {
        this.f۱۱۳۶۰q = cb;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۳۹۹۷a(SubMenuCv subMenu) {
        if (subMenu.hasVisibleItems()) {
            Co subPopup = new Co(this.f۱۱۳۴۷d, subMenu, this.f۱۱۳۵۹p, this.f۱۱۳۵۰g, this.f۱۱۳۵۲i, this.f۱۱۳۵۳j);
            subPopup.m۱۳۹۵۶a(this.f۱۱۳۶۰q);
            subPopup.m۱۳۹۵۹a(AbstractCn.m۱۳۹۳۶b(subMenu));
            subPopup.m۱۳۹۵۸a(this.f۱۱۳۵۷n);
            this.f۱۱۳۵۷n = null;
            this.f۱۱۳۴۸e.m۱۳۸۵۲a(false);
            int horizontalOffset = this.f۱۱۳۵۴k.m۱۵۵۰۶g();
            int verticalOffset = this.f۱۱۳۵۴k.m۱۵۵۰۸h();
            if ((Gravity.getAbsoluteGravity(this.f۱۱۳۶۵v, Cu.m۱۳۰۱۴k(this.f۱۱۳۵۸o)) & 7) == 5) {
                horizontalOffset += this.f۱۱۳۵۸o.getWidth();
            }
            if (subPopup.m۱۳۹۶۰a(horizontalOffset, verticalOffset)) {
                AbstractCp.AbstractCa aVar = this.f۱۱۳۶۰q;
                if (aVar == null) {
                    return true;
                }
                aVar.m۱۳۹۷۸a(subMenu);
                return true;
            }
        }
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۹۲a(Ch menu, boolean allMenusAreClosing) {
        if (menu == this.f۱۱۳۴۸e) {
            dismiss();
            AbstractCp.AbstractCa aVar = this.f۱۱۳۶۰q;
            if (aVar != null) {
                aVar.m۱۳۹۷۷a(menu, allMenusAreClosing);
            }
        }
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: b  reason: contains not printable characters */
    public boolean m۱۴۰۰۰b() {
        return false;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public Parcelable m۱۴۰۰۱c() {
        return null;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۹۰a(Parcelable state) {
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۹۴a(View anchor) {
        this.f۱۱۳۵۸o = anchor;
    }

    public boolean onKey(View v, int keyCode, KeyEvent event) {
        if (event.getAction() != 1 || keyCode != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۳۹۹۵a(PopupWindow.OnDismissListener listener) {
        this.f۱۱۳۵۷n = listener;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCt
    /* renamed from: f  reason: contains not printable characters */
    public ListView m۱۴۰۰۶f() {
        return this.f۱۱۳۵۴k.m۱۵۵۰۴f();
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: b  reason: contains not printable characters */
    public void m۱۳۹۹۸b(int x) {
        this.f۱۱۳۵۴k.m۱۵۵۰۱d(x);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۰۰۲c(int y) {
        this.f۱۱۳۵۴k.m۱۵۵۰۹h(y);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCn
    /* renamed from: c  reason: contains not printable characters */
    public void m۱۴۰۰۳c(boolean showTitle) {
        this.f۱۱۳۶۶w = showTitle;
    }
}
