package android.support.p۰۴۷v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p۰۴۳v4.view.AbstractCc;
import android.support.p۰۴۷v7.view.menu.AbstractCb;
import android.support.p۰۴۷v7.view.menu.AbstractCp;
import android.support.p۰۴۷v7.view.menu.AbstractCq;
import android.support.p۰۴۷v7.view.menu.AbstractCt;
import android.support.p۰۴۷v7.view.menu.ActionMenuItemView;
import android.support.p۰۴۷v7.view.menu.Ch;
import android.support.p۰۴۷v7.view.menu.Ck;
import android.support.p۰۴۷v7.view.menu.Co;
import android.support.p۰۴۷v7.view.menu.SubMenuCv;
import android.support.p۰۴۷v7.widget.ActionMenuView;
import android.support.v7.view.menu.MenuItemImpl;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v7.widget.c  reason: invalid class name */
public class Cc extends AbstractCb implements AbstractCc.AbstractCa {

    /* renamed from: A  reason: contains not printable characters */
    Ce f۱۱۹۳۳A;

    /* renamed from: B  reason: contains not printable characters */
    Ca f۱۱۹۳۴B;

    /* renamed from: C  reason: contains not printable characters */
    RunnableCc f۱۱۹۳۵C;

    /* renamed from: D  reason: contains not printable characters */
    private Cb f۱۱۹۳۶D;

    /* renamed from: E  reason: contains not printable characters */
    final Cf f۱۱۹۳۷E = new Cf();

    /* renamed from: F  reason: contains not printable characters */
    int f۱۱۹۳۸F;

    /* renamed from: l  reason: contains not printable characters */
    Cd f۱۱۹۳۹l;

    /* renamed from: m  reason: contains not printable characters */
    private Drawable f۱۱۹۴۰m;

    /* renamed from: n  reason: contains not printable characters */
    private boolean f۱۱۹۴۱n;

    /* renamed from: o  reason: contains not printable characters */
    private boolean f۱۱۹۴۲o;

    /* renamed from: p  reason: contains not printable characters */
    private boolean f۱۱۹۴۳p;

    /* renamed from: q  reason: contains not printable characters */
    private int f۱۱۹۴۴q;

    /* renamed from: r  reason: contains not printable characters */
    private int f۱۱۹۴۵r;

    /* renamed from: s  reason: contains not printable characters */
    private int f۱۱۹۴۶s;

    /* renamed from: t  reason: contains not printable characters */
    private boolean f۱۱۹۴۷t;

    /* renamed from: u  reason: contains not printable characters */
    private boolean f۱۱۹۴۸u;

    /* renamed from: v  reason: contains not printable characters */
    private boolean f۱۱۹۴۹v;

    /* renamed from: w  reason: contains not printable characters */
    private boolean f۱۱۹۵۰w;

    /* renamed from: x  reason: contains not printable characters */
    private int f۱۱۹۵۱x;

    /* renamed from: y  reason: contains not printable characters */
    private final SparseBooleanArray f۱۱۹۵۲y = new SparseBooleanArray();

    /* renamed from: z  reason: contains not printable characters */
    private View f۱۱۹۵۳z;

    public Cc(Context context) {
        super(context, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg.abc_action_menu_layout, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Cg.abc_action_menu_item_layout);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCb, android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۱۵a(Context context, Ch menu) {
        super.m۱۳۷۶۲a(context, menu);
        Resources res = context.getResources();
        p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ca abp = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ca.m۱۰۷۶۴a(context);
        if (!this.f۱۱۹۴۳p) {
            this.f۱۱۹۴۲o = abp.m۱۰۷۷۱g();
        }
        if (!this.f۱۱۹۴۹v) {
            this.f۱۱۹۴۴q = abp.m۱۰۷۶۶b();
        }
        if (!this.f۱۱۹۴۷t) {
            this.f۱۱۹۴۶s = abp.m۱۰۷۶۷c();
        }
        int width = this.f۱۱۹۴۴q;
        if (this.f۱۱۹۴۲o) {
            if (this.f۱۱۹۳۹l == null) {
                this.f۱۱۹۳۹l = new Cd(this.f۱۱۱۹۴c);
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

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۱۶a(Configuration newConfig) {
        if (!this.f۱۱۹۴۷t) {
            this.f۱۱۹۴۶s = p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۴۰f.Ca.m۱۰۷۶۴a(this.f۱۱۱۹۵d).m۱۰۷۶۷c();
        }
        Ch hVar = this.f۱۱۱۹۶e;
        if (hVar != null) {
            hVar.m۱۳۸۶۱b(true);
        }
    }

    /* renamed from: c  reason: contains not printable characters */
    public void m۱۵۰۳۰c(boolean reserveOverflow) {
        this.f۱۱۹۴۲o = reserveOverflow;
        this.f۱۱۹۴۳p = true;
    }

    /* renamed from: b  reason: contains not printable characters */
    public void m۱۵۰۲۷b(boolean isExclusive) {
        this.f۱۱۹۵۰w = isExclusive;
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۱۷a(Drawable icon) {
        Cd dVar = this.f۱۱۹۳۹l;
        if (dVar != null) {
            dVar.setImageDrawable(icon);
            return;
        }
        this.f۱۱۹۴۱n = true;
        this.f۱۱۹۴۰m = icon;
    }

    /* renamed from: f  reason: contains not printable characters */
    public Drawable m۱۵۰۳۲f() {
        Cd dVar = this.f۱۱۹۳۹l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f۱۱۹۴۱n) {
            return this.f۱۱۹۴۰m;
        }
        return null;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCb
    /* renamed from: b  reason: contains not printable characters */
    public AbstractCq m۱۵۰۲۶b(ViewGroup root) {
        AbstractCq oldMenuView = this.f۱۱۲۰۱j;
        AbstractCq result = super.m۱۳۷۷۲b(root);
        if (oldMenuView != result) {
            ((ActionMenuView) result).setPresenter(this);
        }
        return result;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public View m۱۵۰۱۴a(Ck item, View convertView, ViewGroup parent) {
        View actionView = item.getActionView();
        if (actionView == null || item.m۱۳۹۱۱f()) {
            actionView = super.m۱۳۷۶۰a(item, convertView, parent);
        }
        actionView.setVisibility(item.isActionViewExpanded() ? 8 : 0);
        ActionMenuView menuParent = (ActionMenuView) parent;
        ViewGroup.LayoutParams lp = actionView.getLayoutParams();
        if (!menuParent.checkLayoutParams(lp)) {
            actionView.setLayoutParams(menuParent.generateLayoutParams(lp));
        }
        return actionView;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۲۰a(Ck item, AbstractCq.AbstractCa itemView) {
        itemView.m۱۳۹۸۰a(item, 0);
        ActionMenuItemView actionItemView = (ActionMenuItemView) itemView;
        actionItemView.setItemInvoker((ActionMenuView) this.f۱۱۲۰۱j);
        if (this.f۱۱۹۳۶D == null) {
            this.f۱۱۹۳۶D = new Cb();
        }
        actionItemView.setPopupCallback(this.f۱۱۹۳۶D);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۰۲۳a(int childIndex, Ck item) {
        return item.m۱۳۹۱۳h();
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCb, android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۲۲a(boolean cleared) {
        AbstractCq qVar;
        super.m۱۳۷۶۷a(cleared);
        ((View) this.f۱۱۲۰۱j).requestLayout();
        Ch hVar = this.f۱۱۱۹۶e;
        if (hVar != null) {
            ArrayList<MenuItemImpl> actionItems = hVar.m۱۳۸۶۴c();
            int count = actionItems.size();
            for (int i = 0; i < count; i++) {
                AbstractCc provider = ((Ck) actionItems.get(i)).m۱۳۸۹۸a();
                if (provider != null) {
                    provider.m۱۲۸۰۶a(this);
                }
            }
        }
        Ch hVar2 = this.f۱۱۱۹۶e;
        ArrayList<MenuItemImpl> nonActionItems = hVar2 != null ? hVar2.m۱۳۸۷۸j() : null;
        boolean hasOverflow = false;
        if (this.f۱۱۹۴۲o && nonActionItems != null) {
            int count2 = nonActionItems.size();
            boolean z = false;
            if (count2 == 1) {
                hasOverflow = !((Ck) nonActionItems.get(0)).isActionViewExpanded();
            } else {
                if (count2 > 0) {
                    z = true;
                }
                hasOverflow = z;
            }
        }
        if (hasOverflow) {
            if (this.f۱۱۹۳۹l == null) {
                this.f۱۱۹۳۹l = new Cd(this.f۱۱۱۹۴c);
            }
            ViewGroup parent = (ViewGroup) this.f۱۱۹۳۹l.getParent();
            if (parent != this.f۱۱۲۰۱j) {
                if (parent != null) {
                    parent.removeView(this.f۱۱۹۳۹l);
                }
                ActionMenuView menuView = (ActionMenuView) this.f۱۱۲۰۱j;
                menuView.addView(this.f۱۱۹۳۹l, menuView.m۱۴۰۵۹e());
            }
        } else {
            Cd dVar = this.f۱۱۹۳۹l;
            if (dVar != null && dVar.getParent() == (qVar = this.f۱۱۲۰۱j)) {
                ((ViewGroup) qVar).removeView(this.f۱۱۹۳۹l);
            }
        }
        ((ActionMenuView) this.f۱۱۲۰۱j).setOverflowReserved(this.f۱۱۹۴۲o);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCb
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۰۲۵a(ViewGroup parent, int childIndex) {
        if (parent.getChildAt(childIndex) == this.f۱۱۹۳۹l) {
            return false;
        }
        return super.m۱۳۷۷۱a(parent, childIndex);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCb, android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public boolean m۱۵۰۲۴a(SubMenuCv subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        SubMenuCv topSubMenu = subMenu;
        while (topSubMenu.m۱۴۰۱۶t() != this.f۱۱۱۹۶e) {
            topSubMenu = (SubMenuCv) topSubMenu.m۱۴۰۱۶t();
        }
        View anchor = m۱۵۰۰۸a(topSubMenu.getItem());
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
            if (childItem.isVisible() && childItem.getIcon() != null) {
                preserveIconSpacing = true;
                break;
            }
            i++;
        }
        this.f۱۱۹۳۴B = new Ca(this.f۱۱۱۹۵d, subMenu, anchor);
        this.f۱۱۹۳۴B.m۱۳۹۵۹a(preserveIconSpacing);
        this.f۱۱۹۳۴B.m۱۳۹۶۴e();
        super.m۱۳۷۷۰a(subMenu);
        return true;
    }

    /* renamed from: a  reason: contains not printable characters */
    private View m۱۵۰۰۸a(MenuItem item) {
        ViewGroup parent = (ViewGroup) this.f۱۱۲۰۱j;
        if (parent == null) {
            return null;
        }
        int count = parent.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = parent.getChildAt(i);
            if ((child instanceof AbstractCq.AbstractCa) && ((AbstractCq.AbstractCa) child).getItemData() == item) {
                return child;
            }
        }
        return null;
    }

    /* renamed from: k  reason: contains not printable characters */
    public boolean m۱۵۰۳۷k() {
        Ch hVar;
        if (!this.f۱۱۹۴۲o || m۱۵۰۳۶j() || (hVar = this.f۱۱۱۹۶e) == null || this.f۱۱۲۰۱j == null || this.f۱۱۹۳۵C != null || hVar.m۱۳۸۷۸j().isEmpty()) {
            return false;
        }
        this.f۱۱۹۳۵C = new RunnableCc(new Ce(this.f۱۱۱۹۵d, this.f۱۱۱۹۶e, this.f۱۱۹۳۹l, true));
        ((View) this.f۱۱۲۰۱j).post(this.f۱۱۹۳۵C);
        super.m۱۳۷۷۰a((SubMenuCv) null);
        return true;
    }

    /* renamed from: g  reason: contains not printable characters */
    public boolean m۱۵۰۳۳g() {
        AbstractCq qVar;
        RunnableCc cVar = this.f۱۱۹۳۵C;
        if (cVar == null || (qVar = this.f۱۱۲۰۱j) == null) {
            Co popup = this.f۱۱۹۳۳A;
            if (popup == null) {
                return false;
            }
            popup.m۱۳۹۵۴a();
            return true;
        }
        ((View) qVar).removeCallbacks(cVar);
        this.f۱۱۹۳۵C = null;
        return true;
    }

    /* renamed from: e  reason: contains not printable characters */
    public boolean m۱۵۰۳۱e() {
        return m۱۵۰۳۳g() | m۱۵۰۳۴h();
    }

    /* renamed from: h  reason: contains not printable characters */
    public boolean m۱۵۰۳۴h() {
        Ca aVar = this.f۱۱۹۳۴B;
        if (aVar == null) {
            return false;
        }
        aVar.m۱۳۹۵۴a();
        return true;
    }

    /* renamed from: j  reason: contains not printable characters */
    public boolean m۱۵۰۳۶j() {
        Ce eVar = this.f۱۱۹۳۳A;
        return eVar != null && eVar.m۱۳۹۶۲c();
    }

    /* renamed from: i  reason: contains not printable characters */
    public boolean m۱۵۰۳۵i() {
        return this.f۱۱۹۳۵C != null || m۱۵۰۳۶j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0171  */
    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: b  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m۱۵۰۲۸b() {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p۰۴۷v7.widget.Cc.m۱۵۰۲۸b():boolean");
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCb, android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۱۹a(Ch menu, boolean allMenusAreClosing) {
        m۱۵۰۳۱e();
        super.m۱۳۷۶۳a(menu, allMenusAreClosing);
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: c  reason: contains not printable characters */
    public Parcelable m۱۵۰۲۹c() {
        Cg state = new Cg();
        state.f۱۱۹۶۲c = this.f۱۱۹۳۸F;
        return state;
    }

    @Override // android.support.p۰۴۷v7.view.menu.AbstractCp
    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۱۸a(Parcelable state) {
        int i;
        MenuItem item;
        if ((state instanceof Cg) && (i = ((Cg) state).f۱۱۹۶۲c) > 0 && (item = this.f۱۱۱۹۶e.findItem(i)) != null) {
            m۱۵۰۲۴a((SubMenuCv) item.getSubMenu());
        }
    }

    /* renamed from: a  reason: contains not printable characters */
    public void m۱۵۰۲۱a(ActionMenuView menuView) {
        this.f۱۱۲۰۱j = menuView;
        menuView.m۱۴۰۵۴a(this.f۱۱۱۹۶e);
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.c$g  reason: invalid class name */
    public static class Cg implements Parcelable {
        public static final Parcelable.Creator<Cg> CREATOR = new Ca();

        /* renamed from: c  reason: contains not printable characters */
        public int f۱۱۹۶۲c;

        Cg() {
        }

        Cg(Parcel in) {
            this.f۱۱۹۶۲c = in.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f۱۱۹۶۲c);
        }

        /* renamed from: android.support.v7.widget.c$g$a  reason: invalid class name */
        static class Ca implements Parcelable.Creator<Cg> {
            Ca() {
            }

            @Override // android.os.Parcelable.Creator
            public Cg createFromParcel(Parcel in) {
                return new Cg(in);
            }

            @Override // android.os.Parcelable.Creator
            public Cg[] newArray(int size) {
                return new Cg[size];
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.c$d  reason: invalid class name */
    public class Cd extends Co implements ActionMenuView.AbstractCa {
        public Cd(Context context) {
            super(context, null, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            Cl1.m۱۵۴۱۷a(this, getContentDescription());
            setOnTouchListener(new Ca(this, Cc.this));
        }

        /* renamed from: android.support.v7.widget.c$d$a  reason: invalid class name */
        class Ca extends AbstractView$OnTouchListenerCl0 {
            Ca(View src, Cc cVar) {
                super(src);
            }

            @Override // android.support.p۰۴۷v7.widget.AbstractView$OnTouchListenerCl0
            /* renamed from: a  reason: contains not printable characters */
            public AbstractCt m۱۵۰۴۲a() {
                Ce eVar = Cc.this.f۱۱۹۳۳A;
                if (eVar == null) {
                    return null;
                }
                return eVar.m۱۳۹۶۱b();
            }

            @Override // android.support.p۰۴۷v7.widget.AbstractView$OnTouchListenerCl0
            /* renamed from: b  reason: contains not printable characters */
            public boolean m۱۵۰۴۳b() {
                Cc.this.m۱۵۰۳۷k();
                return true;
            }

            @Override // android.support.p۰۴۷v7.widget.AbstractView$OnTouchListenerCl0
            /* renamed from: c  reason: contains not printable characters */
            public boolean m۱۵۰۴۴c() {
                Cc cVar = Cc.this;
                if (cVar.f۱۱۹۳۵C != null) {
                    return false;
                }
                cVar.m۱۵۰۳۳g();
                return true;
            }
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            Cc.this.m۱۵۰۳۷k();
            return true;
        }

        @Override // android.support.p۰۴۷v7.widget.ActionMenuView.AbstractCa
        /* renamed from: c  reason: contains not printable characters */
        public boolean m۱۵۰۴۱c() {
            return false;
        }

        @Override // android.support.p۰۴۷v7.widget.ActionMenuView.AbstractCa
        /* renamed from: b  reason: contains not printable characters */
        public boolean m۱۵۰۴۰b() {
            return false;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int l, int t, int r, int b) {
            boolean changed = super.setFrame(l, t, r, b);
            Drawable d = getDrawable();
            Drawable bg = getBackground();
            if (!(d == null || bg == null)) {
                int width = getWidth();
                int height = getHeight();
                int halfEdge = Math.max(width, height) / 2;
                int offsetX = getPaddingLeft() - getPaddingRight();
                int centerX = (width + offsetX) / 2;
                int centerY = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                android.support.p۰۴۳v4.graphics.drawable.Ca.m۱۲۷۰۷a(bg, centerX - halfEdge, centerY - halfEdge, centerX + halfEdge, centerY + halfEdge);
            }
            return changed;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.c$e  reason: invalid class name */
    public class Ce extends Co {
        public Ce(Context context, Ch menu, View anchorView, boolean overflowOnly) {
            super(context, menu, anchorView, overflowOnly, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionOverflowMenuStyle);
            m۱۳۹۵۵a(8388613);
            m۱۳۹۵۶a(Cc.this.f۱۱۹۳۷E);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.p۰۴۷v7.view.menu.Co
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۵۰۴۵d() {
            if (((AbstractCb) Cc.this).f۱۱۱۹۶e != null) {
                ((AbstractCb) Cc.this).f۱۱۱۹۶e.close();
            }
            Cc.this.f۱۱۹۳۳A = null;
            super.m۱۳۹۶۳d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.c$a  reason: invalid class name */
    public class Ca extends Co {
        public Ca(Context context, SubMenuCv subMenu, View anchorView) {
            super(context, subMenu, anchorView, false, p۰۰۰a.p۰۰۵b.p۰۳۲h.p۰۳۳a.Ca.actionOverflowMenuStyle);
            if (!((Ck) subMenu.getItem()).m۱۳۹۱۳h()) {
                View view = Cc.this.f۱۱۹۳۹l;
                m۱۳۹۵۷a(view == null ? (View) ((AbstractCb) Cc.this).f۱۱۲۰۱j : view);
            }
            m۱۳۹۵۶a(Cc.this.f۱۱۹۳۷E);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.p۰۴۷v7.view.menu.Co
        /* renamed from: d  reason: contains not printable characters */
        public void m۱۵۰۳۸d() {
            Cc cVar = Cc.this;
            cVar.f۱۱۹۳۴B = null;
            cVar.f۱۱۹۳۸F = 0;
            super.m۱۳۹۶۳d();
        }
    }

    /* renamed from: android.support.v7.widget.c$f  reason: invalid class name */
    private class Cf implements AbstractCp.AbstractCa {
        Cf() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public boolean m۱۵۰۴۷a(Ch subMenu) {
            if (subMenu == null) {
                return false;
            }
            Cc.this.f۱۱۹۳۸F = ((SubMenuCv) subMenu).getItem().getItemId();
            AbstractCp.AbstractCa cb = Cc.this.m۱۳۷۷۴d();
            if (cb != null) {
                return cb.m۱۳۹۷۸a(subMenu);
            }
            return false;
        }

        @Override // android.support.p۰۴۷v7.view.menu.AbstractCp.AbstractCa
        /* renamed from: a  reason: contains not printable characters */
        public void m۱۵۰۴۶a(Ch menu, boolean allMenusAreClosing) {
            if (menu instanceof SubMenuCv) {
                menu.m۱۳۸۸۱m().m۱۳۸۵۲a(false);
            }
            AbstractCp.AbstractCa cb = Cc.this.m۱۳۷۷۴d();
            if (cb != null) {
                cb.m۱۳۹۷۷a(menu, allMenusAreClosing);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.c$c  reason: invalid class name */
    public class RunnableCc implements Runnable {

        /* renamed from: c  reason: contains not printable characters */
        private Ce f۱۱۹۵۶c;

        public RunnableCc(Ce popup) {
            this.f۱۱۹۵۶c = popup;
        }

        public void run() {
            if (((AbstractCb) Cc.this).f۱۱۱۹۶e != null) {
                ((AbstractCb) Cc.this).f۱۱۱۹۶e.m۱۳۸۴۵a();
            }
            View menuView = (View) ((AbstractCb) Cc.this).f۱۱۲۰۱j;
            if (!(menuView == null || menuView.getWindowToken() == null || !this.f۱۱۹۵۶c.m۱۳۹۶۵f())) {
                Cc.this.f۱۱۹۳۳A = this.f۱۱۹۵۶c;
            }
            Cc.this.f۱۱۹۳۵C = null;
        }
    }

    /* renamed from: android.support.v7.widget.c$b  reason: invalid class name */
    private class Cb extends ActionMenuItemView.AbstractCb {
        Cb() {
        }

        @Override // android.support.p۰۴۷v7.view.menu.ActionMenuItemView.AbstractCb
        /* renamed from: a  reason: contains not printable characters */
        public AbstractCt m۱۵۰۳۹a() {
            Ca aVar = Cc.this.f۱۱۹۳۴B;
            if (aVar != null) {
                return aVar.m۱۳۹۶۱b();
            }
            return null;
        }
    }
}
