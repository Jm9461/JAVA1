package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.c;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.k;
import android.support.v7.view.menu.o;
import android.support.v7.view.menu.p;
import android.support.v7.view.menu.q;
import android.support.v7.view.menu.t;
import android.support.v7.view.menu.v;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class c extends android.support.v7.view.menu.b implements c.a {
    e A;
    a B;
    RunnableC۰۰۳۹c C;
    private b D;
    final f E = new f();
    int F;
    d l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private final SparseBooleanArray y = new SparseBooleanArray();
    private View z;

    public c(Context context) {
        super(context, a.b.h.a.g.abc_action_menu_layout, a.b.h.a.g.abc_action_menu_item_layout);
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.p
    public void a(Context context, h menu) {
        super.a(context, menu);
        Resources res = context.getResources();
        a.b.h.f.a abp = a.b.h.f.a.a(context);
        if (!this.p) {
            this.o = abp.g();
        }
        if (!this.v) {
            this.q = abp.b();
        }
        if (!this.t) {
            this.s = abp.c();
        }
        int width = this.q;
        if (this.o) {
            if (this.l == null) {
                this.l = new d(this.f۱۶۶۱c);
                if (this.n) {
                    this.l.setImageDrawable(this.m);
                    this.m = null;
                    this.n = false;
                }
                int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.l.measure(spec, spec);
            }
            width -= this.l.getMeasuredWidth();
        } else {
            this.l = null;
        }
        this.r = width;
        this.x = (int) (res.getDisplayMetrics().density * 56.0f);
        this.z = null;
    }

    public void a(Configuration newConfig) {
        if (!this.t) {
            this.s = a.b.h.f.a.a(this.f۱۶۶۲d).c();
        }
        h hVar = this.f۱۶۶۳e;
        if (hVar != null) {
            hVar.b(true);
        }
    }

    public void c(boolean reserveOverflow) {
        this.o = reserveOverflow;
        this.p = true;
    }

    public void b(boolean isExclusive) {
        this.w = isExclusive;
    }

    public void a(Drawable icon) {
        d dVar = this.l;
        if (dVar != null) {
            dVar.setImageDrawable(icon);
            return;
        }
        this.n = true;
        this.m = icon;
    }

    public Drawable f() {
        d dVar = this.l;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.n) {
            return this.m;
        }
        return null;
    }

    @Override // android.support.v7.view.menu.b
    public q b(ViewGroup root) {
        q oldMenuView = this.j;
        q result = super.b(root);
        if (oldMenuView != result) {
            ((ActionMenuView) result).setPresenter(this);
        }
        return result;
    }

    @Override // android.support.v7.view.menu.b
    public View a(k item, View convertView, ViewGroup parent) {
        View actionView = item.getActionView();
        if (actionView == null || item.f()) {
            actionView = super.a(item, convertView, parent);
        }
        actionView.setVisibility(item.isActionViewExpanded() ? 8 : 0);
        ActionMenuView menuParent = (ActionMenuView) parent;
        ViewGroup.LayoutParams lp = actionView.getLayoutParams();
        if (!menuParent.checkLayoutParams(lp)) {
            actionView.setLayoutParams(menuParent.generateLayoutParams(lp));
        }
        return actionView;
    }

    @Override // android.support.v7.view.menu.b
    public void a(k item, q.a itemView) {
        itemView.a(item, 0);
        ActionMenuItemView actionItemView = (ActionMenuItemView) itemView;
        actionItemView.setItemInvoker((ActionMenuView) this.j);
        if (this.D == null) {
            this.D = new b();
        }
        actionItemView.setPopupCallback(this.D);
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(int childIndex, k item) {
        return item.h();
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.p
    public void a(boolean cleared) {
        q qVar;
        super.a(cleared);
        ((View) this.j).requestLayout();
        h hVar = this.f۱۶۶۳e;
        if (hVar != null) {
            ArrayList<MenuItemImpl> actionItems = hVar.c();
            int count = actionItems.size();
            for (int i = 0; i < count; i++) {
                android.support.v4.view.c provider = ((k) actionItems.get(i)).a();
                if (provider != null) {
                    provider.a(this);
                }
            }
        }
        h hVar2 = this.f۱۶۶۳e;
        ArrayList<MenuItemImpl> nonActionItems = hVar2 != null ? hVar2.j() : null;
        boolean hasOverflow = false;
        if (this.o && nonActionItems != null) {
            int count2 = nonActionItems.size();
            boolean z2 = false;
            if (count2 == 1) {
                hasOverflow = !((k) nonActionItems.get(0)).isActionViewExpanded();
            } else {
                if (count2 > 0) {
                    z2 = true;
                }
                hasOverflow = z2;
            }
        }
        if (hasOverflow) {
            if (this.l == null) {
                this.l = new d(this.f۱۶۶۱c);
            }
            ViewGroup parent = (ViewGroup) this.l.getParent();
            if (parent != this.j) {
                if (parent != null) {
                    parent.removeView(this.l);
                }
                ActionMenuView menuView = (ActionMenuView) this.j;
                menuView.addView(this.l, menuView.e());
            }
        } else {
            d dVar = this.l;
            if (dVar != null && dVar.getParent() == (qVar = this.j)) {
                ((ViewGroup) qVar).removeView(this.l);
            }
        }
        ((ActionMenuView) this.j).setOverflowReserved(this.o);
    }

    @Override // android.support.v7.view.menu.b
    public boolean a(ViewGroup parent, int childIndex) {
        if (parent.getChildAt(childIndex) == this.l) {
            return false;
        }
        return super.a(parent, childIndex);
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.p
    public boolean a(v subMenu) {
        if (!subMenu.hasVisibleItems()) {
            return false;
        }
        v topSubMenu = subMenu;
        while (topSubMenu.t() != this.f۱۶۶۳e) {
            topSubMenu = (v) topSubMenu.t();
        }
        View anchor = a(topSubMenu.getItem());
        if (anchor == null) {
            return false;
        }
        this.F = subMenu.getItem().getItemId();
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
        this.B = new a(this.f۱۶۶۲d, subMenu, anchor);
        this.B.a(preserveIconSpacing);
        this.B.e();
        super.a(subMenu);
        return true;
    }

    private View a(MenuItem item) {
        ViewGroup parent = (ViewGroup) this.j;
        if (parent == null) {
            return null;
        }
        int count = parent.getChildCount();
        for (int i = 0; i < count; i++) {
            View child = parent.getChildAt(i);
            if ((child instanceof q.a) && ((q.a) child).getItemData() == item) {
                return child;
            }
        }
        return null;
    }

    public boolean k() {
        h hVar;
        if (!this.o || j() || (hVar = this.f۱۶۶۳e) == null || this.j == null || this.C != null || hVar.j().isEmpty()) {
            return false;
        }
        this.C = new RunnableC۰۰۳۹c(new e(this.f۱۶۶۲d, this.f۱۶۶۳e, this.l, true));
        ((View) this.j).post(this.C);
        super.a((v) null);
        return true;
    }

    public boolean g() {
        q qVar;
        RunnableC۰۰۳۹c cVar = this.C;
        if (cVar == null || (qVar = this.j) == null) {
            o popup = this.A;
            if (popup == null) {
                return false;
            }
            popup.a();
            return true;
        }
        ((View) qVar).removeCallbacks(cVar);
        this.C = null;
        return true;
    }

    public boolean e() {
        return g() | h();
    }

    public boolean h() {
        a aVar = this.B;
        if (aVar == null) {
            return false;
        }
        aVar.a();
        return true;
    }

    public boolean j() {
        e eVar = this.A;
        return eVar != null && eVar.c();
    }

    public boolean i() {
        return this.C != null || j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0171  */
    @Override // android.support.v7.view.menu.p
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b() {
        /*
        // Method dump skipped, instructions count: 409
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.c.b():boolean");
    }

    @Override // android.support.v7.view.menu.b, android.support.v7.view.menu.p
    public void a(h menu, boolean allMenusAreClosing) {
        e();
        super.a(menu, allMenusAreClosing);
    }

    @Override // android.support.v7.view.menu.p
    public Parcelable c() {
        g state = new g();
        state.f۱۹۹۹c = this.F;
        return state;
    }

    @Override // android.support.v7.view.menu.p
    public void a(Parcelable state) {
        int i;
        MenuItem item;
        if ((state instanceof g) && (i = ((g) state).f۱۹۹۹c) > 0 && (item = this.f۱۶۶۳e.findItem(i)) != null) {
            a((v) item.getSubMenu());
        }
    }

    public void a(ActionMenuView menuView) {
        this.j = menuView;
        menuView.a(this.f۱۶۶۳e);
    }

    /* access modifiers changed from: private */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f۱۹۹۹c;

        g() {
        }

        g(Parcel in) {
            this.f۱۹۹۹c = in.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.f۱۹۹۹c);
        }

        static class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel in) {
                return new g(in);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int size) {
                return new g[size];
            }
        }
    }

    /* access modifiers changed from: private */
    public class d extends o implements ActionMenuView.a {
        public d(Context context) {
            super(context, null, a.b.h.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            l1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        class a extends l0 {
            a(View src, c cVar) {
                super(src);
            }

            @Override // android.support.v7.widget.l0
            public t a() {
                e eVar = c.this.A;
                if (eVar == null) {
                    return null;
                }
                return eVar.b();
            }

            @Override // android.support.v7.widget.l0
            public boolean b() {
                c.this.k();
                return true;
            }

            @Override // android.support.v7.widget.l0
            public boolean c() {
                c cVar = c.this;
                if (cVar.C != null) {
                    return false;
                }
                cVar.g();
                return true;
            }
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.k();
            return true;
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.support.v7.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int l, int t, int r, int b2) {
            boolean changed = super.setFrame(l, t, r, b2);
            Drawable d2 = getDrawable();
            Drawable bg = getBackground();
            if (!(d2 == null || bg == null)) {
                int width = getWidth();
                int height = getHeight();
                int halfEdge = Math.max(width, height) / 2;
                int offsetX = getPaddingLeft() - getPaddingRight();
                int centerX = (width + offsetX) / 2;
                int centerY = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                android.support.v4.graphics.drawable.a.a(bg, centerX - halfEdge, centerY - halfEdge, centerX + halfEdge, centerY + halfEdge);
            }
            return changed;
        }
    }

    /* access modifiers changed from: private */
    public class e extends o {
        public e(Context context, h menu, View anchorView, boolean overflowOnly) {
            super(context, menu, anchorView, overflowOnly, a.b.h.a.a.actionOverflowMenuStyle);
            a(8388613);
            a(c.this.E);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.v7.view.menu.o
        public void d() {
            if (((android.support.v7.view.menu.b) c.this).f۱۶۶۳e != null) {
                ((android.support.v7.view.menu.b) c.this).f۱۶۶۳e.close();
            }
            c.this.A = null;
            super.d();
        }
    }

    /* access modifiers changed from: private */
    public class a extends o {
        public a(Context context, v subMenu, View anchorView) {
            super(context, subMenu, anchorView, false, a.b.h.a.a.actionOverflowMenuStyle);
            if (!((k) subMenu.getItem()).h()) {
                View view = c.this.l;
                a(view == null ? (View) ((android.support.v7.view.menu.b) c.this).j : view);
            }
            a(c.this.E);
        }

        /* access modifiers changed from: protected */
        @Override // android.support.v7.view.menu.o
        public void d() {
            c cVar = c.this;
            cVar.B = null;
            cVar.F = 0;
            super.d();
        }
    }

    private class f implements p.a {
        f() {
        }

        @Override // android.support.v7.view.menu.p.a
        public boolean a(h subMenu) {
            if (subMenu == null) {
                return false;
            }
            c.this.F = ((v) subMenu).getItem().getItemId();
            p.a cb = c.this.d();
            if (cb != null) {
                return cb.a(subMenu);
            }
            return false;
        }

        @Override // android.support.v7.view.menu.p.a
        public void a(h menu, boolean allMenusAreClosing) {
            if (menu instanceof v) {
                menu.m().a(false);
            }
            p.a cb = c.this.d();
            if (cb != null) {
                cb.a(menu, allMenusAreClosing);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.c$c  reason: collision with other inner class name */
    public class RunnableC۰۰۳۹c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        private e f۱۹۹۵c;

        public RunnableC۰۰۳۹c(e popup) {
            this.f۱۹۹۵c = popup;
        }

        public void run() {
            if (((android.support.v7.view.menu.b) c.this).f۱۶۶۳e != null) {
                ((android.support.v7.view.menu.b) c.this).f۱۶۶۳e.a();
            }
            View menuView = (View) ((android.support.v7.view.menu.b) c.this).j;
            if (!(menuView == null || menuView.getWindowToken() == null || !this.f۱۹۹۵c.f())) {
                c.this.A = this.f۱۹۹۵c;
            }
            c.this.C = null;
        }
    }

    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // android.support.v7.view.menu.ActionMenuItemView.b
        public t a() {
            a aVar = c.this.B;
            if (aVar != null) {
                return aVar.b();
            }
            return null;
        }
    }
}
