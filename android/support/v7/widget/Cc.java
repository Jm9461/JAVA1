package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.AbstractCc;
import android.support.v7.view.menu.AbstractCb;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.Ch;
import android.support.v7.view.menu.Ck;
import android.support.v7.view.menu.Co;
import android.support.v7.view.menu.InterfaceCp;
import android.support.v7.view.menu.InterfaceCq;
import android.support.v7.view.menu.InterfaceCt;
import android.support.v7.view.menu.SubMenuCv;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Cg;
import p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۹f.Ca;

/* renamed from: android.support.v7.widget.c, reason: invalid class name */
/* loaded from: C:\Users\Mehdi\Desktop\lawyer archives\zip\classes.dex */
class Cc extends AbstractCb implements AbstractCc.a {

    /* renamed from: A, reason: contains not printable characters */
    e f۱۱۹۳۳A;

    /* renamed from: B, reason: contains not printable characters */
    a f۱۱۹۳۴B;

    /* renamed from: C, reason: contains not printable characters */
    c f۱۱۹۳۵C;

    /* renamed from: D, reason: contains not printable characters */
    private b f۱۱۹۳۶D;

    /* renamed from: E, reason: contains not printable characters */
    final f f۱۱۹۳۷E;

    /* renamed from: F, reason: contains not printable characters */
    int f۱۱۹۳۸F;

    /* renamed from: l, reason: contains not printable characters */
    d f۱۱۹۳۹l;

    /* renamed from: m, reason: contains not printable characters */
    private Drawable f۱۱۹۴۰m;

    /* renamed from: n, reason: contains not printable characters */
    private boolean f۱۱۹۴۱n;

    /* renamed from: o, reason: contains not printable characters */
    private boolean f۱۱۹۴۲o;

    /* renamed from: p, reason: contains not printable characters */
    private boolean f۱۱۹۴۳p;

    /* renamed from: q, reason: contains not printable characters */
    private int f۱۱۹۴۴q;

    /* renamed from: r, reason: contains not printable characters */
    private int f۱۱۹۴۵r;

    /* renamed from: s, reason: contains not printable characters */
    private int f۱۱۹۴۶s;

    /* renamed from: t, reason: contains not printable characters */
    private boolean f۱۱۹۴۷t;

    /* renamed from: u, reason: contains not printable characters */
    private boolean f۱۱۹۴۸u;

    /* renamed from: v, reason: contains not printable characters */
    private boolean f۱۱۹۴۹v;

    /* renamed from: w, reason: contains not printable characters */
    private boolean f۱۱۹۵۰w;

    /* renamed from: x, reason: contains not printable characters */
    private int f۱۱۹۵۱x;

    /* renamed from: y, reason: contains not printable characters */
    private final SparseBooleanArray f۱۱۹۵۲y;

    /* renamed from: z, reason: contains not printable characters */
    private View f۱۱۹۵۳z;

    public Cc(Context context) {
        super(context, Cg.abc_action_menu_layout, Cg.abc_action_menu_item_layout);
        this.f۱۱۹۵۲y = new SparseBooleanArray();
        this.f۱۱۹۳۷E = new f();
    }

    @Override // android.support.v7.view.menu.AbstractCb, android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۵a(Context context, Ch menu) {
        super.mo۱۲۹۴۵a(context, menu);
        Resources res = context.getResources();
        Ca abp = Ca.m۸۶۹۵a(context);
        if (!this.f۱۱۹۴۳p) {
            this.f۱۱۹۴۲o = abp.m۸۷۰۲g();
        }
        if (!this.f۱۱۹۴۹v) {
            this.f۱۱۹۴۴q = abp.m۸۶۹۷b();
        }
        if (!this.f۱۱۹۴۷t) {
            this.f۱۱۹۴۶s = abp.m۸۶۹۸c();
        }
        int width = this.f۱۱۹۴۴q;
        if (this.f۱۱۹۴۲o) {
            if (this.f۱۱۹۳۹l == null) {
                this.f۱۱۹۳۹l = new d(this.f۱۱۱۹۴c);
                if (this.f۱۱۹۴۱n) {
                    this.f۱۱۹۳۹l.setImageDrawable(this.f۱۱۹۴۰m);
                    this.f۱۱۹۴۰m = null;
                    this.f۱۱۹۴۱n = false;
                }
                int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f۱۱۹۳۹l.measure(spec, spec);
            }
            width -= this.f۱۱۹۳۹l.getMeasuredWidth();
        } else {
            this.f۱۱۹۳۹l = null;
        }
        this.f۱۱۹۴۵r = width;
        this.f۱۱۹۵۱x = (int) (res.getDisplayMetrics().density * 56.0f);
        this.f۱۱۹۵۳z = null;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۲۹۴۶a(Configuration newConfig) {
        if (!this.f۱۱۹۴۷t) {
            this.f۱۱۹۴۶s = Ca.m۸۶۹۵a(this.f۱۱۱۹۵d).m۸۶۹۸c();
        }
        Ch ch = this.f۱۱۱۹۶e;
        if (ch != null) {
            ch.mo۱۱۷۹۱b(true);
        }
    }

    /* renamed from: c, reason: contains not printable characters */
    public void m۱۲۹۶۰c(boolean reserveOverflow) {
        this.f۱۱۹۴۲o = reserveOverflow;
        this.f۱۱۹۴۳p = true;
    }

    /* renamed from: b, reason: contains not printable characters */
    public void m۱۲۹۵۷b(boolean isExclusive) {
        this.f۱۱۹۵۰w = isExclusive;
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۲۹۴۷a(Drawable icon) {
        d dVar = this.f۱۱۹۳۹l;
        if (dVar != null) {
            dVar.setImageDrawable(icon);
        } else {
            this.f۱۱۹۴۱n = true;
            this.f۱۱۹۴۰m = icon;
        }
    }

    /* renamed from: f, reason: contains not printable characters */
    public Drawable m۱۲۹۶۲f() {
        d dVar = this.f۱۱۹۳۹l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f۱۱۹۴۱n) {
            return this.f۱۱۹۴۰m;
        }
        return null;
    }

    @Override // android.support.v7.view.menu.AbstractCb
    /* renamed from: b, reason: contains not printable characters */
    public InterfaceCq mo۱۲۹۵۶b(ViewGroup root) {
        InterfaceCq oldMenuView = this.f۱۱۲۰۱j;
        InterfaceCq result = super.mo۱۲۹۵۶b(root);
        if (oldMenuView != result) {
            ((ActionMenuView) result).setPresenter(this);
        }
        return result;
    }

    @Override // android.support.v7.view.menu.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public View mo۱۲۹۴۴a(Ck item, View convertView, ViewGroup parent) {
        View actionView = item.getActionView();
        if (actionView == null || item.m۱۱۸۴۱f()) {
            actionView = super.mo۱۲۹۴۴a(item, convertView, parent);
        }
        actionView.setVisibility(item.isActionViewExpanded() ? 8 : 0);
        ActionMenuView menuParent = (ActionMenuView) parent;
        ViewGroup.LayoutParams lp = actionView.getLayoutParams();
        if (!menuParent.checkLayoutParams(lp)) {
            actionView.setLayoutParams(menuParent.generateLayoutParams(lp));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۵۰a(Ck item, InterfaceCq.a itemView) {
        itemView.mo۱۱۹۱۰a(item, 0);
        ActionMenuView menuView = (ActionMenuView) this.f۱۱۲۰۱j;
        ActionMenuItemView actionItemView = (ActionMenuItemView) itemView;
        actionItemView.setItemInvoker(menuView);
        if (this.f۱۱۹۳۶D == null) {
            this.f۱۱۹۳۶D = new b();
        }
        actionItemView.setPopupCallback(this.f۱۱۹۳۶D);
    }

    @Override // android.support.v7.view.menu.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۵۳a(int childIndex, Ck item) {
        return item.m۱۱۸۴۳h();
    }

    @Override // android.support.v7.view.menu.AbstractCb, android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۵۲a(boolean cleared) {
        super.mo۱۲۹۵۲a(cleared);
        ((View) this.f۱۱۲۰۱j).requestLayout();
        Ch ch = this.f۱۱۱۹۶e;
        if (ch != null) {
            ArrayList<Ck> arrayList = ch.m۱۱۷۹۴c();
            int count = arrayList.size();
            for (int i = 0; i < count; i++) {
                AbstractCc provider = arrayList.get(i).mo۱۱۸۲۸a();
                if (provider != null) {
                    provider.m۱۰۷۳۶a(this);
                }
            }
        }
        Ch ch2 = this.f۱۱۱۹۶e;
        ArrayList<Ck> arrayList2 = ch2 != null ? ch2.m۱۱۸۰۸j() : null;
        boolean hasOverflow = false;
        if (this.f۱۱۹۴۲o && arrayList2 != null) {
            int count2 = arrayList2.size();
            if (count2 == 1) {
                hasOverflow = !arrayList2.get(0).isActionViewExpanded();
            } else {
                hasOverflow = count2 > 0;
            }
        }
        if (hasOverflow) {
            if (this.f۱۱۹۳۹l == null) {
                this.f۱۱۹۳۹l = new d(this.f۱۱۱۹۴c);
            }
            ViewGroup parent = (ViewGroup) this.f۱۱۹۳۹l.getParent();
            if (parent != this.f۱۱۲۰۱j) {
                if (parent != null) {
                    parent.removeView(this.f۱۱۹۳۹l);
                }
                ActionMenuView menuView = (ActionMenuView) this.f۱۱۲۰۱j;
                menuView.addView(this.f۱۱۹۳۹l, menuView.m۱۱۹۸۹e());
            }
        } else {
            d dVar = this.f۱۱۹۳۹l;
            if (dVar != null) {
                Object parent2 = dVar.getParent();
                Object obj = this.f۱۱۲۰۱j;
                if (parent2 == obj) {
                    ((ViewGroup) obj).removeView(this.f۱۱۹۳۹l);
                }
            }
        }
        ((ActionMenuView) this.f۱۱۲۰۱j).setOverflowReserved(this.f۱۱۹۴۲o);
    }

    @Override // android.support.v7.view.menu.AbstractCb
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۵۵a(ViewGroup parent, int childIndex) {
        if (parent.getChildAt(childIndex) == this.f۱۱۹۳۹l) {
            return false;
        }
        return super.mo۱۲۹۵۵a(parent, childIndex);
    }

    @Override // android.support.v7.view.menu.AbstractCb, android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public boolean mo۱۲۹۵۴a(SubMenuCv subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        SubMenuCv topSubMenu = subMenu;
        while (topSubMenu.m۱۱۹۴۶t() != this.f۱۱۱۹۶e) {
            topSubMenu = (SubMenuCv) topSubMenu.m۱۱۹۴۶t();
        }
        View anchor = m۱۲۹۳۸a(topSubMenu.getItem());
        if (anchor == null) {
            return false;
        }
        this.f۱۱۹۳۸F = subMenu.getItem().getItemId();
        boolean preserveIconSpacing = false;
        int count = subMenu.size();
        int i = 0;
        while (true) {
            if (i >= count) {
                break;
            }
            MenuItem childItem = subMenu.getItem(i);
            if (!childItem.isVisible() || childItem.getIcon() == null) {
                i++;
            } else {
                preserveIconSpacing = true;
                break;
            }
        }
        this.f۱۱۹۳۴B = new a(this.f۱۱۱۹۵d, subMenu, anchor);
        this.f۱۱۹۳۴B.m۱۱۸۸۹a(preserveIconSpacing);
        this.f۱۱۹۳۴B.m۱۱۸۹۴e();
        super.mo۱۲۹۵۴a(subMenu);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a, reason: contains not printable characters */
    private View m۱۲۹۳۸a(MenuItem item) {
        ViewGroup parent = (ViewGroup) this.f۱۱۲۰۱j;
        if (parent == null) {
            return null;
        }
        int count = parent.getChildCount();
        for (int i = 0; i < count; i++) {
            View childAt = parent.getChildAt(i);
            if ((childAt instanceof InterfaceCq.a) && ((InterfaceCq.a) childAt).getItemData() == item) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: k, reason: contains not printable characters */
    public boolean m۱۲۹۶۷k() {
        Ch ch;
        if (this.f۱۱۹۴۲o && !m۱۲۹۶۶j() && (ch = this.f۱۱۱۹۶e) != null && this.f۱۱۲۰۱j != null && this.f۱۱۹۳۵C == null && !ch.m۱۱۸۰۸j().isEmpty()) {
            e popup = new e(this.f۱۱۱۹۵d, this.f۱۱۱۹۶e, this.f۱۱۹۳۹l, true);
            this.f۱۱۹۳۵C = new c(popup);
            ((View) this.f۱۱۲۰۱j).post(this.f۱۱۹۳۵C);
            super.mo۱۲۹۵۴a((SubMenuCv) null);
            return true;
        }
        return false;
    }

    /* renamed from: g, reason: contains not printable characters */
    public boolean m۱۲۹۶۳g() {
        Object obj;
        c cVar = this.f۱۱۹۳۵C;
        if (cVar != null && (obj = this.f۱۱۲۰۱j) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f۱۱۹۳۵C = null;
            return true;
        }
        Co popup = this.f۱۱۹۳۳A;
        if (popup != null) {
            popup.m۱۱۸۸۴a();
            return true;
        }
        return false;
    }

    /* renamed from: e, reason: contains not printable characters */
    public boolean m۱۲۹۶۱e() {
        boolean result = m۱۲۹۶۳g();
        return result | m۱۲۹۶۴h();
    }

    /* renamed from: h, reason: contains not printable characters */
    public boolean m۱۲۹۶۴h() {
        a aVar = this.f۱۱۹۳۴B;
        if (aVar != null) {
            aVar.m۱۱۸۸۴a();
            return true;
        }
        return false;
    }

    /* renamed from: j, reason: contains not printable characters */
    public boolean m۱۲۹۶۶j() {
        e eVar = this.f۱۱۹۳۳A;
        return eVar != null && eVar.m۱۱۸۹۲c();
    }

    /* renamed from: i, reason: contains not printable characters */
    public boolean m۱۲۹۶۵i() {
        return this.f۱۱۹۳۵C != null || m۱۲۹۶۶j();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0171  */
    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: b, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo۱۲۹۵۸b() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Cc.mo۱۲۹۵۸b():boolean");
    }

    @Override // android.support.v7.view.menu.AbstractCb, android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۹a(Ch menu, boolean allMenusAreClosing) {
        m۱۲۹۶۱e();
        super.mo۱۲۹۴۹a(menu, allMenusAreClosing);
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: c, reason: contains not printable characters */
    public Parcelable mo۱۲۹۵۹c() {
        g state = new g();
        state.f۱۱۹۶۲c = this.f۱۱۹۳۸F;
        return state;
    }

    @Override // android.support.v7.view.menu.InterfaceCp
    /* renamed from: a, reason: contains not printable characters */
    public void mo۱۲۹۴۸a(Parcelable state) {
        MenuItem item;
        if (!(state instanceof g)) {
            return;
        }
        g saved = (g) state;
        int i = saved.f۱۱۹۶۲c;
        if (i > 0 && (item = this.f۱۱۱۹۶e.findItem(i)) != null) {
            SubMenuCv subMenu = (SubMenuCv) item.getSubMenu();
            mo۱۲۹۵۴a(subMenu);
        }
    }

    /* renamed from: a, reason: contains not printable characters */
    public void m۱۲۹۵۱a(ActionMenuView menuView) {
        this.f۱۱۲۰۱j = menuView;
        menuView.mo۱۱۹۸۴a(this.f۱۱۱۹۶e);
    }

    /* renamed from: android.support.v7.widget.c$g */
    private static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: contains not printable characters */
        public int f۱۱۹۶۲c;

        g() {
        }

        g(Parcel in) {
            this.f۱۱۹۶۲c = in.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f۱۱۹۶۲c);
        }

        /* renamed from: android.support.v7.widget.c$g$a */
        static class a implements Parcelable.Creator<g> {
            a() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel in) {
                return new g(in);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public g[] newArray(int size) {
                return new g[size];
            }
        }
    }

    /* renamed from: android.support.v7.widget.c$d */
    private class d extends Co implements ActionMenuView.InterfaceCa {
        public d(Context context) {
            super(context, null, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            Cl1.m۱۳۳۴۷a(this, getContentDescription());
            setOnTouchListener(new a(this, Cc.this));
        }

        /* renamed from: android.support.v7.widget.c$d$a */
        class a extends AbstractViewOnTouchListenerCl0 {
            a(View src, Cc cc) {
                super(src);
            }

            @Override // android.support.v7.widget.AbstractViewOnTouchListenerCl0
            /* renamed from: a, reason: contains not printable characters */
            public InterfaceCt mo۱۳۵۶۹a() {
                e eVar = Cc.this.f۱۱۹۳۳A;
                if (eVar == null) {
                    return null;
                }
                return eVar.m۱۱۸۹۱b();
            }

            @Override // android.support.v7.widget.AbstractViewOnTouchListenerCl0
            /* renamed from: b, reason: contains not printable characters */
            public boolean mo۱۳۵۷۰b() {
                Cc.this.m۱۲۹۶۷k();
                return true;
            }

            @Override // android.support.v7.widget.AbstractViewOnTouchListenerCl0
            /* renamed from: c, reason: contains not printable characters */
            public boolean mo۱۳۳۴۵c() {
                Cc cc = Cc.this;
                if (cc.f۱۱۹۳۵C != null) {
                    return false;
                }
                cc.m۱۲۹۶۳g();
                return true;
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            Cc.this.m۱۲۹۶۷k();
            return true;
        }

        @Override // android.support.v7.widget.ActionMenuView.InterfaceCa
        /* renamed from: c, reason: contains not printable characters */
        public boolean mo۱۲۹۷۱c() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.InterfaceCa
        /* renamed from: b, reason: contains not printable characters */
        public boolean mo۱۲۹۷۰b() {
            return false;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int l, int t, int r, int b2) {
            boolean changed = super.setFrame(l, t, r, b2);
            Drawable d2 = getDrawable();
            Drawable bg = getBackground();
            if (d2 != null && bg != null) {
                int width = getWidth();
                int height = getHeight();
                int halfEdge = Math.max(width, height) / 2;
                int offsetX = getPaddingLeft() - getPaddingRight();
                int offsetY = getPaddingTop() - getPaddingBottom();
                int centerX = (width + offsetX) / 2;
                int centerY = (height + offsetY) / 2;
                android.support.v4.graphics.drawable.Ca.m۱۰۶۳۷a(bg, centerX - halfEdge, centerY - halfEdge, centerX + halfEdge, centerY + halfEdge);
            }
            return changed;
        }
    }

    /* renamed from: android.support.v7.widget.c$e */
    private class e extends Co {
        public e(Context context, Ch menu, View anchorView, boolean overflowOnly) {
            super(context, menu, anchorView, overflowOnly, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.actionOverflowMenuStyle);
            m۱۱۸۸۵a(8388613);
            m۱۱۸۸۶a(Cc.this.f۱۱۹۳۷E);
        }

        @Override // android.support.v7.view.menu.Co
        /* renamed from: d, reason: contains not printable characters */
        protected void mo۱۲۹۷۵d() {
            if (((AbstractCb) Cc.this).f۱۱۱۹۶e != null) {
                ((AbstractCb) Cc.this).f۱۱۱۹۶e.close();
            }
            Cc.this.f۱۱۹۳۳A = null;
            super.mo۱۲۹۷۵d();
        }
    }

    /* renamed from: android.support.v7.widget.c$a */
    private class a extends Co {
        public a(Context context, SubMenuCv subMenu, View anchorView) {
            super(context, subMenu, anchorView, false, p۱۵۹a.p۱۶۴b.p۱۹۱h.p۱۹۲a.Ca.actionOverflowMenuStyle);
            Ck item = (Ck) subMenu.getItem();
            if (!item.m۱۱۸۴۳h()) {
                View view = Cc.this.f۱۱۹۳۹l;
                m۱۱۸۸۷a(view == null ? (View) ((AbstractCb) Cc.this).f۱۱۲۰۱j : view);
            }
            m۱۱۸۸۶a(Cc.this.f۱۱۹۳۷E);
        }

        @Override // android.support.v7.view.menu.Co
        /* renamed from: d, reason: contains not printable characters */
        protected void mo۱۲۹۷۵d() {
            Cc cc = Cc.this;
            cc.f۱۱۹۳۴B = null;
            cc.f۱۱۹۳۸F = 0;
            super.mo۱۲۹۷۵d();
        }
    }

    /* renamed from: android.support.v7.widget.c$f */
    private class f implements InterfaceCp.a {
        f() {
        }

        @Override // android.support.v7.view.menu.InterfaceCp.a
        /* renamed from: a, reason: contains not printable characters */
        public boolean mo۱۲۹۷۷a(Ch subMenu) {
            if (subMenu == null) {
                return false;
            }
            Cc.this.f۱۱۹۳۸F = ((SubMenuCv) subMenu).getItem().getItemId();
            InterfaceCp.a cb = Cc.this.m۱۱۷۰۴d();
            if (cb != null) {
                return cb.mo۱۲۹۷۷a(subMenu);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.InterfaceCp.a
        /* renamed from: a, reason: contains not printable characters */
        public void mo۱۲۹۷۶a(Ch menu, boolean allMenusAreClosing) {
            if (menu instanceof SubMenuCv) {
                menu.mo۱۱۹۴۲m().m۱۱۷۸۲a(false);
            }
            InterfaceCp.a cb = Cc.this.m۱۱۷۰۴d();
            if (cb != null) {
                cb.mo۱۲۹۷۶a(menu, allMenusAreClosing);
            }
        }
    }

    /* renamed from: android.support.v7.widget.c$c */
    private class c implements Runnable {

        /* renamed from: c, reason: contains not printable characters */
        private e f۱۱۹۵۶c;

        public c(e popup) {
            this.f۱۱۹۵۶c = popup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractCb) Cc.this).f۱۱۱۹۶e != null) {
                ((AbstractCb) Cc.this).f۱۱۱۹۶e.m۱۱۷۷۵a();
            }
            View menuView = (View) ((AbstractCb) Cc.this).f۱۱۲۰۱j;
            if (menuView != null && menuView.getWindowToken() != null && this.f۱۱۹۵۶c.m۱۱۸۹۵f()) {
                Cc.this.f۱۱۹۳۳A = this.f۱۱۹۵۶c;
            }
            Cc.this.f۱۱۹۳۵C = null;
        }
    }

    /* renamed from: android.support.v7.widget.c$b */
    private class b extends ActionMenuItemView.AbstractCb {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.AbstractCb
        /* renamed from: a, reason: contains not printable characters */
        public InterfaceCt mo۱۲۹۶۹a() {
            a aVar = Cc.this.f۱۱۹۳۴B;
            if (aVar != null) {
                return aVar.m۱۱۸۹۱b();
            }
            return null;
        }
    }
}
